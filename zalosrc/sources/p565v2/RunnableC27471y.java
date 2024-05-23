package p565v2;

import androidx.work.AbstractC2253u;
import androidx.work.impl.C2155a0;
import androidx.work.impl.C2226u;
import fn0.AbstractC19074t;

/* renamed from: v2.y */
/* loaded from: classes2.dex */
public final class RunnableC27471y implements Runnable {

    /* renamed from: p */
    private final C2226u f129213p;

    /* renamed from: q */
    private final C2155a0 f129214q;

    /* renamed from: r */
    private final boolean f129215r;

    /* renamed from: s */
    private final int f129216s;

    public RunnableC27471y(C2226u c2226u, C2155a0 c2155a0, boolean z11, int i11) {
        AbstractC19074t.m100208f(c2226u, "processor");
        AbstractC19074t.m100208f(c2155a0, "token");
        this.f129213p = c2226u;
        this.f129214q = c2155a0;
        this.f129215r = z11;
        this.f129216s = i11;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m11773w;
        if (this.f129215r) {
            m11773w = this.f129213p.m11772v(this.f129214q, this.f129216s);
        } else {
            m11773w = this.f129213p.m11773w(this.f129214q, this.f129216s);
        }
        AbstractC2253u.m11895e().mo11898a(AbstractC2253u.m11897i("StopWorkRunnable"), "StopWorkRunnable for " + this.f129214q.m11582a().m138955b() + "; Processor.stopWork = " + m11773w);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunnableC27471y(C2226u c2226u, C2155a0 c2155a0, boolean z11) {
        this(c2226u, c2155a0, z11, -512);
        AbstractC19074t.m100208f(c2226u, "processor");
        AbstractC19074t.m100208f(c2155a0, "token");
    }
}
