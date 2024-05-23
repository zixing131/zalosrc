package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.browser.trusted.AbstractC1238d;
import androidx.core.app.C1335e1;
import java.util.Locale;
import p044c0.InterfaceC3180b;
import p499s0.InterfaceC26065h;

/* loaded from: classes2.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: p */
    private NotificationManager f4803p;

    /* renamed from: q */
    int f4804q = -1;

    /* renamed from: r */
    private final InterfaceC3180b.a f4805r = new BinderC1234a();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    /* loaded from: classes2.dex */
    class BinderC1234a extends InterfaceC3180b.a {
        BinderC1234a() {
        }

        /* renamed from: E */
        private void m5842E() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i11 = trustedWebActivityService.f4804q;
            if (i11 != -1) {
                if (i11 == Binder.getCallingUid()) {
                } else {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.m5834c();
                throw null;
            }
        }

        @Override // p044c0.InterfaceC3180b
        /* renamed from: M1 */
        public Bundle mo5843M1(Bundle bundle) {
            m5842E();
            AbstractC1238d.d m5858a = AbstractC1238d.d.m5858a(bundle);
            return new AbstractC1238d.e(TrustedWebActivityService.this.m5841j(m5858a.f4812a, m5858a.f4813b, m5858a.f4814c, m5858a.f4815d)).m5859a();
        }

        @Override // p044c0.InterfaceC3180b
        /* renamed from: T0 */
        public Bundle mo5844T0(String str, Bundle bundle, IBinder iBinder) {
            m5842E();
            return TrustedWebActivityService.this.m5837f(str, bundle, C1237c.m5853a(iBinder));
        }

        @Override // p044c0.InterfaceC3180b
        /* renamed from: T2 */
        public Bundle mo5845T2() {
            m5842E();
            return new AbstractC1238d.a(TrustedWebActivityService.this.m5838g()).m5855a();
        }

        @Override // p044c0.InterfaceC3180b
        /* renamed from: V3 */
        public int mo5846V3() {
            m5842E();
            return TrustedWebActivityService.this.m5840i();
        }

        @Override // p044c0.InterfaceC3180b
        /* renamed from: b4 */
        public Bundle mo5847b4(Bundle bundle) {
            m5842E();
            return new AbstractC1238d.e(TrustedWebActivityService.this.m5835d(AbstractC1238d.c.m5857a(bundle).f4811a)).m5859a();
        }

        @Override // p044c0.InterfaceC3180b
        /* renamed from: k4 */
        public void mo5848k4(Bundle bundle) {
            m5842E();
            AbstractC1238d.b m5856a = AbstractC1238d.b.m5856a(bundle);
            TrustedWebActivityService.this.m5836e(m5856a.f4809a, m5856a.f4810b);
        }

        @Override // p044c0.InterfaceC3180b
        /* renamed from: o1 */
        public Bundle mo5849o1() {
            m5842E();
            return TrustedWebActivityService.this.m5839h();
        }
    }

    /* renamed from: a */
    private static String m5832a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    /* renamed from: b */
    private void m5833b() {
        if (this.f4803p != null) {
        } else {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    /* renamed from: c */
    public abstract InterfaceC26065h m5834c();

    /* renamed from: d */
    public boolean m5835d(String str) {
        m5833b();
        if (!C1335e1.m6691e(this).m6695a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return AbstractC1236b.m5852b(this.f4803p, m5832a(str));
    }

    /* renamed from: e */
    public void m5836e(String str, int i11) {
        m5833b();
        this.f4803p.cancel(str, i11);
    }

    /* renamed from: f */
    public Bundle m5837f(String str, Bundle bundle, C1237c c1237c) {
        return null;
    }

    /* renamed from: g */
    public Parcelable[] m5838g() {
        m5833b();
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC1235a.m5850a(this.f4803p);
        }
        throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
    }

    /* renamed from: h */
    public Bundle m5839h() {
        int m5840i = m5840i();
        Bundle bundle = new Bundle();
        if (m5840i == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), m5840i));
        return bundle;
    }

    /* renamed from: i */
    public int m5840i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public boolean m5841j(String str, int i11, Notification notification, String str2) {
        m5833b();
        if (!C1335e1.m6691e(this).m6695a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String m5832a = m5832a(str2);
            notification = AbstractC1236b.m5851a(this, this.f4803p, notification, m5832a, str2);
            if (!AbstractC1236b.m5852b(this.f4803p, m5832a)) {
                return false;
            }
        }
        this.f4803p.notify(str, i11, notification);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f4805r;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4803p = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f4804q = -1;
        return super.onUnbind(intent);
    }
}
