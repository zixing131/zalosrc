package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    /* loaded from: classes2.dex */
    private static class C1837a extends MediaBrowserCompat.C0964b {

        /* renamed from: c */
        private final Context f7557c;

        /* renamed from: d */
        private final Intent f7558d;

        /* renamed from: e */
        private final BroadcastReceiver.PendingResult f7559e;

        /* renamed from: f */
        private MediaBrowserCompat f7560f;

        C1837a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f7557c = context;
            this.f7558d = intent;
            this.f7559e = pendingResult;
        }

        /* renamed from: e */
        private void m9512e() {
            this.f7560f.m4513b();
            this.f7559e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0964b
        /* renamed from: a */
        public void mo4519a() {
            try {
                new MediaControllerCompat(this.f7557c, this.f7560f.m4514c()).m4582a((KeyEvent) this.f7558d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            m9512e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0964b
        /* renamed from: b */
        public void mo4520b() {
            m9512e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0964b
        /* renamed from: c */
        public void mo4521c() {
            m9512e();
        }

        /* renamed from: f */
        void m9513f(MediaBrowserCompat mediaBrowserCompat) {
            this.f7560f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    private static ComponentName m9510a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    /* renamed from: b */
    private static void m9511b(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName m9510a = m9510a(context, "android.intent.action.MEDIA_BUTTON");
            if (m9510a != null) {
                intent.setComponent(m9510a);
                m9511b(context, intent);
                return;
            }
            ComponentName m9510a2 = m9510a(context, "android.media.browse.MediaBrowserService");
            if (m9510a2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C1837a c1837a = new C1837a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, m9510a2, c1837a, null);
                c1837a.m9513f(mediaBrowserCompat);
                mediaBrowserCompat.m4512a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Ignore unsupported intent: ");
        sb2.append(intent);
    }
}
