package p565v2;

import androidx.work.WorkerParameters;
import androidx.work.impl.C2155a0;
import androidx.work.impl.C2226u;
import fn0.AbstractC19074t;

/* renamed from: v2.w */
/* loaded from: classes2.dex */
public final class RunnableC27469w implements Runnable {

    /* renamed from: p */
    private final C2226u f129207p;

    /* renamed from: q */
    private final C2155a0 f129208q;

    /* renamed from: r */
    private final WorkerParameters.C2133a f129209r;

    public RunnableC27469w(C2226u c2226u, C2155a0 c2155a0, WorkerParameters.C2133a c2133a) {
        AbstractC19074t.m100208f(c2226u, "processor");
        AbstractC19074t.m100208f(c2155a0, "startStopToken");
        this.f129207p = c2226u;
        this.f129208q = c2155a0;
        this.f129209r = c2133a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f129207p.m11770s(this.f129208q, this.f129209r);
    }
}
