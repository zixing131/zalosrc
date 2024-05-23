package p182g7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: g7.s */
/* loaded from: classes3.dex */
public final class ServiceConnectionC19277s implements ServiceConnection {

    /* renamed from: p */
    final /* synthetic */ C19278t f95772p;

    public /* synthetic */ ServiceConnectionC19277s(C19278t c19278t, AbstractC19276r abstractC19276r) {
        this.f95772p = c19278t;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C19267i c19267i;
        c19267i = this.f95772p.f95775b;
        c19267i.m100981d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f95772p.m101000c().post(new C19274p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C19267i c19267i;
        c19267i = this.f95772p.f95775b;
        c19267i.m100981d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f95772p.m101000c().post(new C19275q(this));
    }
}
