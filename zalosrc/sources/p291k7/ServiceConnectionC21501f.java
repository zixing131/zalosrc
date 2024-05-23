package p291k7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: k7.f */
/* loaded from: classes3.dex */
public final class ServiceConnectionC21501f implements ServiceConnection {

    /* renamed from: p */
    final /* synthetic */ C21504g f104528p;

    public /* synthetic */ ServiceConnectionC21501f(C21504g c21504g, AbstractC21498e abstractC21498e) {
        this.f104528p = c21504g;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C21536q1 c21536q1;
        c21536q1 = this.f104528p.f104531b;
        c21536q1.m111197d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f104528p.m111148c().post(new C21492c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C21536q1 c21536q1;
        c21536q1 = this.f104528p.f104531b;
        c21536q1.m111197d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f104528p.m111148c().post(new C21495d(this));
    }
}
