package r20;

import r20.AbstractC25622b;

/* renamed from: r20.d */
/* loaded from: classes5.dex */
public final class C25624d extends AbstractC25622b {

    /* renamed from: A */
    private final a f122530A;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r20.d$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: b */
        private float f122532b;

        /* renamed from: a */
        private float f122531a = -4.2f;

        /* renamed from: c */
        private final AbstractC25622b.p f122533c = new AbstractC25622b.p();

        a() {
        }

        /* renamed from: a */
        public boolean m132373a(float f11, float f12) {
            if (Math.abs(f12) < this.f122532b) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        void m132374b(float f11) {
            this.f122531a = f11 * (-4.2f);
        }

        /* renamed from: c */
        void m132375c(float f11) {
            this.f122532b = f11 * 62.5f;
        }

        /* renamed from: d */
        AbstractC25622b.p m132376d(float f11, float f12, long j11) {
            float f13 = (float) j11;
            this.f122533c.f122529b = (float) (f12 * Math.exp((f13 / 1000.0f) * this.f122531a));
            AbstractC25622b.p pVar = this.f122533c;
            float f14 = this.f122531a;
            pVar.f122528a = (float) ((f11 - (f12 / f14)) + ((f12 / f14) * Math.exp((f14 * f13) / 1000.0f)));
            AbstractC25622b.p pVar2 = this.f122533c;
            if (m132373a(pVar2.f122528a, pVar2.f122529b)) {
                this.f122533c.f122529b = 0.0f;
            }
            return this.f122533c;
        }
    }

    public C25624d(C25626f c25626f) {
        super(c25626f);
        a aVar = new a();
        this.f122530A = aVar;
        aVar.m132375c(m132330g());
    }

    @Override // r20.AbstractC25622b
    /* renamed from: p */
    boolean mo132337p(long j11) {
        AbstractC25622b.p m132376d = this.f122530A.m132376d(this.f122515b, this.f122514a, j11);
        float f11 = m132376d.f122528a;
        this.f122515b = f11;
        float f12 = m132376d.f122529b;
        this.f122514a = f12;
        float f13 = this.f122521h;
        if (f11 < f13) {
            this.f122515b = f13;
            return true;
        }
        float f14 = this.f122520g;
        if (f11 > f14) {
            this.f122515b = f14;
            return true;
        }
        if (m132368q(f11, f12)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    boolean m132368q(float f11, float f12) {
        if (f11 < this.f122520g && f11 > this.f122521h && !this.f122530A.m132373a(f11, f12)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public C25624d m132369r(float f11) {
        if (f11 > 0.0f) {
            this.f122530A.m132374b(f11);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    /* renamed from: s */
    public C25624d m132370s(float f11) {
        super.m132332j(f11);
        return this;
    }

    /* renamed from: t */
    public C25624d m132371t(float f11) {
        super.m132333k(f11);
        return this;
    }

    /* renamed from: u */
    public C25624d m132372u(float f11) {
        super.m132335m(f11);
        return this;
    }
}
