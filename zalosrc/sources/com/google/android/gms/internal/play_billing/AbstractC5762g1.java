package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.g1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5762g1 extends AbstractC5862x {

    /* renamed from: p */
    private final AbstractC5774i1 f33319p;

    /* renamed from: q */
    protected AbstractC5774i1 f33320q;

    public AbstractC5762g1(AbstractC5774i1 abstractC5774i1) {
        this.f33319p = abstractC5774i1;
        if (!abstractC5774i1.m30291p()) {
            this.f33320q = abstractC5774i1.m30286g();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: b */
    public final AbstractC5762g1 clone() {
        AbstractC5762g1 abstractC5762g1 = (AbstractC5762g1) this.f33319p.mo30165q(5, null, null);
        abstractC5762g1.f33320q = zze();
        return abstractC5762g1;
    }

    /* renamed from: c */
    public final AbstractC5774i1 m30227c() {
        AbstractC5774i1 zze = zze();
        if (zze.m30290o()) {
            return zze;
        }
        throw new zzhc(zze);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5769h2
    /* renamed from: e */
    public AbstractC5774i1 zze() {
        if (!this.f33320q.m30291p()) {
            return this.f33320q;
        }
        this.f33320q.m30287k();
        return this.f33320q;
    }

    /* renamed from: f */
    public final void m30229f() {
        if (!this.f33320q.m30291p()) {
            m30230g();
        }
    }

    /* renamed from: g */
    protected void m30230g() {
        AbstractC5774i1 m30286g = this.f33319p.m30286g();
        C5823q2.m30431a().m30432b(m30286g.getClass()).mo30353b(m30286g, this.f33320q);
        this.f33320q = m30286g;
    }
}
