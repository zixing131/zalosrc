package p051c7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: c7.d0 */
/* loaded from: classes3.dex */
public final class ServiceConnectionC3307d0 implements ServiceConnection {

    /* renamed from: p */
    final /* synthetic */ C3309e0 f14111p;

    public /* synthetic */ ServiceConnectionC3307d0(C3309e0 c3309e0, AbstractC3305c0 abstractC3305c0) {
        this.f14111p = c3309e0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3325t c3325t;
        c3325t = this.f14111p.f14117b;
        c3325t.m16800d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f14111p.m16773c().post(new C3301a0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3325t c3325t;
        c3325t = this.f14111p.f14117b;
        c3325t.m16800d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f14111p.m16773c().post(new C3303b0(this));
    }
}
