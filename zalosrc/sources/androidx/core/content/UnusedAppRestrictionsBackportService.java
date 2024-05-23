package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p194h1.InterfaceC19698a;
import p194h1.InterfaceC19699b;

/* loaded from: classes2.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: p */
    private InterfaceC19699b.a f6106p = new BinderC1387a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    /* loaded from: classes2.dex */
    class BinderC1387a extends InterfaceC19699b.a {
        BinderC1387a() {
        }

        @Override // p194h1.InterfaceC19699b
        /* renamed from: P1 */
        public void mo6958P1(InterfaceC19698a interfaceC19698a) {
            if (interfaceC19698a == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.m6957a(new C1392e(interfaceC19698a));
        }
    }

    /* renamed from: a */
    protected abstract void m6957a(C1392e c1392e);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6106p;
    }
}
