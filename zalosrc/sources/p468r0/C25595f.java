package p468r0;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p026b0.InterfaceC2475a;
import p026b0.InterfaceC2476b;

/* renamed from: r0.f */
/* loaded from: classes2.dex */
public final class C25595f {

    /* renamed from: a */
    private final Object f122372a = new Object();

    /* renamed from: b */
    private final InterfaceC2476b f122373b;

    /* renamed from: c */
    private final InterfaceC2475a f122374c;

    /* renamed from: d */
    private final ComponentName f122375d;

    /* renamed from: e */
    private final PendingIntent f122376e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C25595f(InterfaceC2476b interfaceC2476b, InterfaceC2475a interfaceC2475a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f122373b = interfaceC2476b;
        this.f122374c = interfaceC2475a;
        this.f122375d = componentName;
        this.f122376e = pendingIntent;
    }

    /* renamed from: a */
    private void m132196a(Bundle bundle) {
        PendingIntent pendingIntent = this.f122376e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    private Bundle m132197b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m132196a(bundle2);
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public IBinder m132198c() {
        return this.f122374c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ComponentName m132199d() {
        return this.f122375d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public PendingIntent m132200e() {
        return this.f122376e;
    }

    /* renamed from: f */
    public boolean m132201f(Uri uri, Bundle bundle, List list) {
        try {
            return this.f122373b.mo5817a4(this.f122374c, uri, m132197b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
