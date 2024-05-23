package r20;

import r20.AbstractC25622b;

/* renamed from: r20.g */
/* loaded from: classes5.dex */
public final class C25627g extends AbstractC25622b {

    /* renamed from: A */
    private C25628h f122536A;

    /* renamed from: B */
    private float f122537B;

    /* renamed from: C */
    private boolean f122538C;

    public C25627g(C25626f c25626f) {
        super(c25626f);
        this.f122536A = null;
        this.f122537B = Float.MAX_VALUE;
        this.f122538C = false;
    }

    /* renamed from: s */
    private void m132379s() {
        C25628h c25628h = this.f122536A;
        if (c25628h != null) {
            double m132384a = c25628h.m132384a();
            if (m132384a <= this.f122520g) {
                if (m132384a >= this.f122521h) {
                    return;
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // r20.AbstractC25622b
    /* renamed from: n */
    public void mo132336n() {
        m132379s();
        this.f122536A.m132389g(m132330g());
        super.mo132336n();
    }

    @Override // r20.AbstractC25622b
    /* renamed from: p */
    boolean mo132337p(long j11) {
        if (this.f122538C) {
            float f11 = this.f122537B;
            if (f11 != Float.MAX_VALUE) {
                this.f122536A.m132387e(f11);
                this.f122537B = Float.MAX_VALUE;
            }
            this.f122515b = this.f122536A.m132384a();
            this.f122514a = 0.0f;
            this.f122538C = false;
            return true;
        }
        if (this.f122537B != Float.MAX_VALUE) {
            this.f122536A.m132384a();
            long j12 = j11 / 2;
            AbstractC25622b.p m132390h = this.f122536A.m132390h(this.f122515b, this.f122514a, j12);
            this.f122536A.m132387e(this.f122537B);
            this.f122537B = Float.MAX_VALUE;
            AbstractC25622b.p m132390h2 = this.f122536A.m132390h(m132390h.f122528a, m132390h.f122529b, j12);
            this.f122515b = m132390h2.f122528a;
            this.f122514a = m132390h2.f122529b;
        } else {
            AbstractC25622b.p m132390h3 = this.f122536A.m132390h(this.f122515b, this.f122514a, j11);
            this.f122515b = m132390h3.f122528a;
            this.f122514a = m132390h3.f122529b;
        }
        float max = Math.max(this.f122515b, this.f122521h);
        this.f122515b = max;
        float min = Math.min(max, this.f122520g);
        this.f122515b = min;
        if (!m132381r(min, this.f122514a)) {
            return false;
        }
        this.f122515b = this.f122536A.m132384a();
        this.f122514a = 0.0f;
        return true;
    }

    /* renamed from: q */
    public void m132380q(float f11) {
        if (m132331h()) {
            this.f122537B = f11;
            return;
        }
        if (this.f122536A == null) {
            this.f122536A = new C25628h(f11);
        }
        this.f122536A.m132387e(f11);
        mo132336n();
    }

    /* renamed from: r */
    boolean m132381r(float f11, float f12) {
        return this.f122536A.m132385c(f11, f12);
    }

    /* renamed from: t */
    public C25627g m132382t(C25628h c25628h) {
        this.f122536A = c25628h;
        return this;
    }
}
