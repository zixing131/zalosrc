package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p026b0.InterfaceC2475a;
import p468r0.AbstractC25591b;

/* renamed from: androidx.browser.customtabs.b */
/* loaded from: classes2.dex */
public class C1233b {

    /* renamed from: a */
    final InterfaceC2475a f4799a;

    /* renamed from: b */
    private final PendingIntent f4800b;

    /* renamed from: c */
    private final AbstractC25591b f4801c;

    /* renamed from: androidx.browser.customtabs.b$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC25591b {
        a() {
        }

        @Override // p468r0.AbstractC25591b
        /* renamed from: a */
        public void mo5826a(String str, Bundle bundle) {
            try {
                C1233b.this.f4799a.mo12491D1(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p468r0.AbstractC25591b
        /* renamed from: b */
        public Bundle mo5827b(String str, Bundle bundle) {
            try {
                return C1233b.this.f4799a.mo12495O0(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // p468r0.AbstractC25591b
        /* renamed from: c */
        public void mo5828c(Bundle bundle) {
            try {
                C1233b.this.f4799a.mo12493J4(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p468r0.AbstractC25591b
        /* renamed from: d */
        public void mo5829d(int i11, Bundle bundle) {
            try {
                C1233b.this.f4799a.mo12496r4(i11, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p468r0.AbstractC25591b
        /* renamed from: e */
        public void mo5830e(String str, Bundle bundle) {
            try {
                C1233b.this.f4799a.mo12492F4(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p468r0.AbstractC25591b
        /* renamed from: f */
        public void mo5831f(int i11, Uri uri, boolean z11, Bundle bundle) {
            try {
                C1233b.this.f4799a.mo12494L4(i11, uri, z11, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1233b(InterfaceC2475a interfaceC2475a, PendingIntent pendingIntent) {
        a aVar;
        if (interfaceC2475a == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f4799a = interfaceC2475a;
        this.f4800b = pendingIntent;
        if (interfaceC2475a == null) {
            aVar = null;
        } else {
            aVar = new a();
        }
        this.f4801c = aVar;
    }

    /* renamed from: b */
    private IBinder m5823b() {
        InterfaceC2475a interfaceC2475a = this.f4799a;
        if (interfaceC2475a != null) {
            return interfaceC2475a.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m5824a() {
        InterfaceC2475a interfaceC2475a = this.f4799a;
        if (interfaceC2475a == null) {
            return null;
        }
        return interfaceC2475a.asBinder();
    }

    /* renamed from: c */
    PendingIntent m5825c() {
        return this.f4800b;
    }

    public boolean equals(Object obj) {
        boolean z11;
        if (!(obj instanceof C1233b)) {
            return false;
        }
        C1233b c1233b = (C1233b) obj;
        PendingIntent m5825c = c1233b.m5825c();
        PendingIntent pendingIntent = this.f4800b;
        boolean z12 = true;
        if (pendingIntent == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m5825c != null) {
            z12 = false;
        }
        if (z11 != z12) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(m5825c);
        }
        return m5823b().equals(c1233b.m5823b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f4800b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return m5823b().hashCode();
    }
}
