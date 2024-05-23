package p434q1;

import p434q1.AbstractC24979b;

/* renamed from: q1.d */
/* loaded from: classes2.dex */
public final class C24981d extends AbstractC24979b {

    /* renamed from: A */
    private C24982e f119691A;

    /* renamed from: B */
    private float f119692B;

    /* renamed from: C */
    private boolean f119693C;

    public C24981d(Object obj, AbstractC24980c abstractC24980c) {
        super(obj, abstractC24980c);
        this.f119691A = null;
        this.f119692B = Float.MAX_VALUE;
        this.f119693C = false;
    }

    /* renamed from: o */
    private void m129735o() {
        C24982e c24982e = this.f119691A;
        if (c24982e != null) {
            double m129740a = c24982e.m129740a();
            if (m129740a <= this.f119682g) {
                if (m129740a >= this.f119683h) {
                    return;
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // p434q1.AbstractC24979b
    /* renamed from: j */
    public void mo129705j() {
        m129735o();
        this.f119691A.m129745g(m129701e());
        super.mo129705j();
    }

    @Override // p434q1.AbstractC24979b
    /* renamed from: l */
    boolean mo129706l(long j11) {
        if (this.f119693C) {
            float f11 = this.f119692B;
            if (f11 != Float.MAX_VALUE) {
                this.f119691A.m129743e(f11);
                this.f119692B = Float.MAX_VALUE;
            }
            this.f119677b = this.f119691A.m129740a();
            this.f119676a = 0.0f;
            this.f119693C = false;
            return true;
        }
        if (this.f119692B != Float.MAX_VALUE) {
            this.f119691A.m129740a();
            long j12 = j11 / 2;
            AbstractC24979b.o m129746h = this.f119691A.m129746h(this.f119677b, this.f119676a, j12);
            this.f119691A.m129743e(this.f119692B);
            this.f119692B = Float.MAX_VALUE;
            AbstractC24979b.o m129746h2 = this.f119691A.m129746h(m129746h.f119688a, m129746h.f119689b, j12);
            this.f119677b = m129746h2.f119688a;
            this.f119676a = m129746h2.f119689b;
        } else {
            AbstractC24979b.o m129746h3 = this.f119691A.m129746h(this.f119677b, this.f119676a, j11);
            this.f119677b = m129746h3.f119688a;
            this.f119676a = m129746h3.f119689b;
        }
        float max = Math.max(this.f119677b, this.f119683h);
        this.f119677b = max;
        float min = Math.min(max, this.f119682g);
        this.f119677b = min;
        if (!m129737n(min, this.f119676a)) {
            return false;
        }
        this.f119677b = this.f119691A.m129740a();
        this.f119676a = 0.0f;
        return true;
    }

    /* renamed from: m */
    public void m129736m(float f11) {
        if (m129702f()) {
            this.f119692B = f11;
            return;
        }
        if (this.f119691A == null) {
            this.f119691A = new C24982e(f11);
        }
        this.f119691A.m129743e(f11);
        mo129705j();
    }

    /* renamed from: n */
    boolean m129737n(float f11, float f12) {
        return this.f119691A.m129741c(f11, f12);
    }

    /* renamed from: p */
    public C24981d m129738p(C24982e c24982e) {
        this.f119691A = c24982e;
        return this;
    }
}
