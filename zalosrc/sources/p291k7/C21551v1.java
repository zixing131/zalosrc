package p291k7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k7.v1 */
/* loaded from: classes3.dex */
public final class C21551v1 extends AbstractRunnableC21539r1 {

    /* renamed from: q */
    final /* synthetic */ C21504g f104583q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21551v1(C21504g c21504g) {
        this.f104583q = c21504g;
    }

    @Override // p291k7.AbstractRunnableC21539r1
    /* renamed from: c */
    public final void mo109504c() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        C21536q1 c21536q1;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        C21536q1 c21536q12;
        obj = this.f104583q.f104535f;
        synchronized (obj) {
            try {
                atomicInteger = this.f104583q.f104540k;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.f104583q.f104540k;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        c21536q12 = this.f104583q.f104531b;
                        c21536q12.m111197d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                C21504g c21504g = this.f104583q;
                iInterface = c21504g.f104542m;
                if (iInterface != null) {
                    c21536q1 = c21504g.f104531b;
                    c21536q1.m111197d("Unbind from service.", new Object[0]);
                    C21504g c21504g2 = this.f104583q;
                    context = c21504g2.f104530a;
                    serviceConnection = c21504g2.f104541l;
                    context.unbindService(serviceConnection);
                    this.f104583q.f104536g = false;
                    this.f104583q.f104542m = null;
                    this.f104583q.f104541l = null;
                }
                this.f104583q.m111147w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
