package p051c7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c7.y */
/* loaded from: classes3.dex */
public final class C3330y extends AbstractRunnableC3326u {

    /* renamed from: q */
    final /* synthetic */ C3309e0 f14150q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3330y(C3309e0 c3309e0) {
        this.f14150q = c3309e0;
    }

    @Override // p051c7.AbstractRunnableC3326u
    /* renamed from: a */
    public final void mo16750a() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        C3325t c3325t;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        C3325t c3325t2;
        obj = this.f14150q.f14121f;
        synchronized (obj) {
            try {
                atomicInteger = this.f14150q.f14126k;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.f14150q.f14126k;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        c3325t2 = this.f14150q.f14117b;
                        c3325t2.m16800d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                C3309e0 c3309e0 = this.f14150q;
                iInterface = c3309e0.f14128m;
                if (iInterface != null) {
                    c3325t = c3309e0.f14117b;
                    c3325t.m16800d("Unbind from service.", new Object[0]);
                    C3309e0 c3309e02 = this.f14150q;
                    context = c3309e02.f14116a;
                    serviceConnection = c3309e02.f14127l;
                    context.unbindService(serviceConnection);
                    this.f14150q.f14122g = false;
                    this.f14150q.f14128m = null;
                    this.f14150q.f14127l = null;
                }
                this.f14150q.m16772w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
