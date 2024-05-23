package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import fn0.AbstractC19074t;

/* loaded from: classes2.dex */
public class LifecycleService extends Service implements InterfaceC1801w {

    /* renamed from: p */
    private final C1792r0 f7225p = new C1792r0(this);

    @Override // androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        return this.f7225p.m9358a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        this.f7225p.m9359b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f7225p.m9360c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f7225p.m9361d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i11) {
        this.f7225p.m9362e();
        super.onStart(intent, i11);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        return super.onStartCommand(intent, i11, i12);
    }
}
