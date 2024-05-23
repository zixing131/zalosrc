package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.List;
import java.util.NoSuchElementException;
import p026b0.InterfaceC2475a;
import p026b0.InterfaceC2476b;
import p665y0.C30245g;

/* loaded from: classes2.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: p */
    final C30245g f4792p = new C30245g();

    /* renamed from: q */
    private InterfaceC2476b.a f4793q = new BinderC1230a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    /* loaded from: classes2.dex */
    public class BinderC1230a extends InterfaceC2476b.a {
        BinderC1230a() {
        }

        /* renamed from: I3 */
        private PendingIntent m5806I3(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W4 */
        public /* synthetic */ void m5808W4(C1233b c1233b) {
            CustomTabsService.this.m5796a(c1233b);
        }

        /* renamed from: X4 */
        private boolean m5809X4(InterfaceC2475a interfaceC2475a, PendingIntent pendingIntent) {
            final C1233b c1233b = new C1233b(interfaceC2475a, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.BinderC1230a.this.m5808W4(c1233b);
                    }
                };
                synchronized (CustomTabsService.this.f4792p) {
                    interfaceC2475a.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f4792p.put(interfaceC2475a.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.m5799d(c1233b);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: C3 */
        public boolean mo5810C3(long j11) {
            return CustomTabsService.this.m5805j(j11);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: G1 */
        public boolean mo5811G1(InterfaceC2475a interfaceC2475a, Uri uri, Bundle bundle) {
            return CustomTabsService.this.m5802g(new C1233b(interfaceC2475a, m5806I3(bundle)), uri);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: G4 */
        public int mo5812G4(InterfaceC2475a interfaceC2475a, String str, Bundle bundle) {
            return CustomTabsService.this.m5800e(new C1233b(interfaceC2475a, m5806I3(bundle)), str, bundle);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: Q0 */
        public Bundle mo5813Q0(String str, Bundle bundle) {
            return CustomTabsService.this.m5797b(str, bundle);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: R0 */
        public boolean mo5814R0(InterfaceC2475a interfaceC2475a, int i11, Uri uri, Bundle bundle) {
            return CustomTabsService.this.m5804i(new C1233b(interfaceC2475a, m5806I3(bundle)), i11, uri, bundle);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: W3 */
        public boolean mo5815W3(InterfaceC2475a interfaceC2475a, Uri uri, int i11, Bundle bundle) {
            return CustomTabsService.this.m5801f(new C1233b(interfaceC2475a, m5806I3(bundle)), uri, i11, bundle);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: Z0 */
        public boolean mo5816Z0(InterfaceC2475a interfaceC2475a, Uri uri) {
            return CustomTabsService.this.m5802g(new C1233b(interfaceC2475a, null), uri);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: a4 */
        public boolean mo5817a4(InterfaceC2475a interfaceC2475a, Uri uri, Bundle bundle, List list) {
            return CustomTabsService.this.m5798c(new C1233b(interfaceC2475a, m5806I3(bundle)), uri, bundle, list);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: c1 */
        public boolean mo5818c1(InterfaceC2475a interfaceC2475a) {
            return m5809X4(interfaceC2475a, null);
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: m2 */
        public boolean mo5819m2(InterfaceC2475a interfaceC2475a, Bundle bundle) {
            return m5809X4(interfaceC2475a, m5806I3(bundle));
        }

        @Override // p026b0.InterfaceC2476b
        /* renamed from: r3 */
        public boolean mo5820r3(InterfaceC2475a interfaceC2475a, Bundle bundle) {
            return CustomTabsService.this.m5803h(new C1233b(interfaceC2475a, m5806I3(bundle)), bundle);
        }
    }

    /* renamed from: a */
    protected boolean m5796a(C1233b c1233b) {
        try {
            synchronized (this.f4792p) {
                try {
                    IBinder m5824a = c1233b.m5824a();
                    if (m5824a == null) {
                        return false;
                    }
                    m5824a.unlinkToDeath((IBinder.DeathRecipient) this.f4792p.get(m5824a), 0);
                    this.f4792p.remove(m5824a);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* renamed from: b */
    protected abstract Bundle m5797b(String str, Bundle bundle);

    /* renamed from: c */
    protected abstract boolean m5798c(C1233b c1233b, Uri uri, Bundle bundle, List list);

    /* renamed from: d */
    protected abstract boolean m5799d(C1233b c1233b);

    /* renamed from: e */
    protected abstract int m5800e(C1233b c1233b, String str, Bundle bundle);

    /* renamed from: f */
    protected abstract boolean m5801f(C1233b c1233b, Uri uri, int i11, Bundle bundle);

    /* renamed from: g */
    protected abstract boolean m5802g(C1233b c1233b, Uri uri);

    /* renamed from: h */
    protected abstract boolean m5803h(C1233b c1233b, Bundle bundle);

    /* renamed from: i */
    protected abstract boolean m5804i(C1233b c1233b, int i11, Uri uri, Bundle bundle);

    /* renamed from: j */
    protected abstract boolean m5805j(long j11);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4793q;
    }
}
