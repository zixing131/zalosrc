package p468r0;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p026b0.InterfaceC2475a;
import p026b0.InterfaceC2476b;

/* renamed from: r0.c */
/* loaded from: classes2.dex */
public abstract class AbstractC25592c {

    /* renamed from: a */
    private final InterfaceC2476b f122337a;

    /* renamed from: b */
    private final ComponentName f122338b;

    /* renamed from: c */
    private final Context f122339c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0.c$a */
    /* loaded from: classes2.dex */
    public class a extends InterfaceC2475a.a {

        /* renamed from: p */
        private Handler f122340p = new Handler(Looper.getMainLooper());

        /* renamed from: q */
        final /* synthetic */ AbstractC25591b f122341q;

        /* renamed from: r0.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC32962a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ int f122343p;

            /* renamed from: q */
            final /* synthetic */ Bundle f122344q;

            RunnableC32962a(int i11, Bundle bundle) {
                this.f122343p = i11;
                this.f122344q = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f122341q.mo5829d(this.f122343p, this.f122344q);
            }
        }

        /* renamed from: r0.c$a$b */
        /* loaded from: classes2.dex */
        class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f122346p;

            /* renamed from: q */
            final /* synthetic */ Bundle f122347q;

            b(String str, Bundle bundle) {
                this.f122346p = str;
                this.f122347q = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f122341q.mo5826a(this.f122346p, this.f122347q);
            }
        }

        /* renamed from: r0.c$a$c */
        /* loaded from: classes2.dex */
        class c implements Runnable {

            /* renamed from: p */
            final /* synthetic */ Bundle f122349p;

            c(Bundle bundle) {
                this.f122349p = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f122341q.mo5828c(this.f122349p);
            }
        }

        /* renamed from: r0.c$a$d */
        /* loaded from: classes2.dex */
        class d implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f122351p;

            /* renamed from: q */
            final /* synthetic */ Bundle f122352q;

            d(String str, Bundle bundle) {
                this.f122351p = str;
                this.f122352q = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f122341q.mo5830e(this.f122351p, this.f122352q);
            }
        }

        /* renamed from: r0.c$a$e */
        /* loaded from: classes2.dex */
        class e implements Runnable {

            /* renamed from: p */
            final /* synthetic */ int f122354p;

            /* renamed from: q */
            final /* synthetic */ Uri f122355q;

            /* renamed from: r */
            final /* synthetic */ boolean f122356r;

            /* renamed from: s */
            final /* synthetic */ Bundle f122357s;

            e(int i11, Uri uri, boolean z11, Bundle bundle) {
                this.f122354p = i11;
                this.f122355q = uri;
                this.f122356r = z11;
                this.f122357s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f122341q.mo5831f(this.f122354p, this.f122355q, this.f122356r, this.f122357s);
            }
        }

        a(AbstractC25591b abstractC25591b) {
            this.f122341q = abstractC25591b;
        }

        @Override // p026b0.InterfaceC2475a
        /* renamed from: D1 */
        public void mo12491D1(String str, Bundle bundle) {
            if (this.f122341q == null) {
                return;
            }
            this.f122340p.post(new b(str, bundle));
        }

        @Override // p026b0.InterfaceC2475a
        /* renamed from: F4 */
        public void mo12492F4(String str, Bundle bundle) {
            if (this.f122341q == null) {
                return;
            }
            this.f122340p.post(new d(str, bundle));
        }

        @Override // p026b0.InterfaceC2475a
        /* renamed from: J4 */
        public void mo12493J4(Bundle bundle) {
            if (this.f122341q == null) {
                return;
            }
            this.f122340p.post(new c(bundle));
        }

        @Override // p026b0.InterfaceC2475a
        /* renamed from: L4 */
        public void mo12494L4(int i11, Uri uri, boolean z11, Bundle bundle) {
            if (this.f122341q == null) {
                return;
            }
            this.f122340p.post(new e(i11, uri, z11, bundle));
        }

        @Override // p026b0.InterfaceC2475a
        /* renamed from: O0 */
        public Bundle mo12495O0(String str, Bundle bundle) {
            AbstractC25591b abstractC25591b = this.f122341q;
            if (abstractC25591b == null) {
                return null;
            }
            return abstractC25591b.mo5827b(str, bundle);
        }

        @Override // p026b0.InterfaceC2475a
        /* renamed from: r4 */
        public void mo12496r4(int i11, Bundle bundle) {
            if (this.f122341q == null) {
                return;
            }
            this.f122340p.post(new RunnableC32962a(i11, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC25592c(InterfaceC2476b interfaceC2476b, ComponentName componentName, Context context) {
        this.f122337a = interfaceC2476b;
        this.f122338b = componentName;
        this.f122339c = context;
    }

    /* renamed from: a */
    public static boolean m132182a(Context context, String str, AbstractServiceConnectionC25594e abstractServiceConnectionC25594e) {
        abstractServiceConnectionC25594e.m132195b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC25594e, 33);
    }

    /* renamed from: b */
    private InterfaceC2475a.a m132183b(AbstractC25591b abstractC25591b) {
        return new a(abstractC25591b);
    }

    /* renamed from: d */
    private C25595f m132184d(AbstractC25591b abstractC25591b, PendingIntent pendingIntent) {
        boolean mo5818c1;
        InterfaceC2475a.a m132183b = m132183b(abstractC25591b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                mo5818c1 = this.f122337a.mo5819m2(m132183b, bundle);
            } else {
                mo5818c1 = this.f122337a.mo5818c1(m132183b);
            }
            if (!mo5818c1) {
                return null;
            }
            return new C25595f(this.f122337a, m132183b, this.f122338b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public C25595f m132185c(AbstractC25591b abstractC25591b) {
        return m132184d(abstractC25591b, null);
    }

    /* renamed from: e */
    public boolean m132186e(long j11) {
        try {
            return this.f122337a.mo5810C3(j11);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
