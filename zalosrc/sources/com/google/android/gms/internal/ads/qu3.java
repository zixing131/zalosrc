package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class qu3 extends us3 {

    /* renamed from: p */
    private final tu3 f26969p;

    /* renamed from: q */
    protected tu3 f26970q;

    /* renamed from: r */
    protected boolean f26971r = false;

    public qu3(tu3 tu3Var) {
        this.f26969p = tu3Var;
        this.f26970q = (tu3) tu3Var.mo20044D(4, null, null);
    }

    /* renamed from: j */
    private static final void m25892j(tu3 tu3Var, tu3 tu3Var2) {
        hw3.m23056a().m23057b(tu3Var.getClass()).mo21227b(tu3Var, tu3Var2);
    }

    @Override // com.google.android.gms.internal.ads.aw3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20309b() {
        return this.f26969p;
    }

    @Override // com.google.android.gms.internal.ads.us3
    /* renamed from: i */
    protected final /* synthetic */ us3 mo25893i(vs3 vs3Var) {
        m25896l((tu3) vs3Var);
        return this;
    }

    /* renamed from: k */
    public final qu3 clone() {
        qu3 qu3Var = (qu3) this.f26969p.mo20044D(5, null, null);
        qu3Var.m25896l(mo25894i0());
        return qu3Var;
    }

    /* renamed from: l */
    public final qu3 m25896l(tu3 tu3Var) {
        if (this.f26971r) {
            m25900p();
            this.f26971r = false;
        }
        m25892j(this.f26970q, tu3Var);
        return this;
    }

    /* renamed from: m */
    public final qu3 m25897m(byte[] bArr, int i11, int i12, gu3 gu3Var) {
        if (this.f26971r) {
            m25900p();
            this.f26971r = false;
        }
        try {
            hw3.m23056a().m23057b(this.f26970q.getClass()).mo21232g(this.f26970q, bArr, 0, i12, new ys3(gu3Var));
            return this;
        } catch (zzgrq e11) {
            throw e11;
        } catch (IOException e12) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgrq.m28825j();
        }
    }

    /* renamed from: n */
    public final tu3 m25898n() {
        tu3 mo25894i0 = mo25894i0();
        if (mo25894i0.m26771B()) {
            return mo25894i0;
        }
        throw new zzgtx(mo25894i0);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: o */
    public tu3 mo25894i0() {
        if (this.f26971r) {
            return this.f26970q;
        }
        tu3 tu3Var = this.f26970q;
        hw3.m23056a().m23057b(tu3Var.getClass()).mo21226a(tu3Var);
        this.f26971r = true;
        return this.f26970q;
    }

    /* renamed from: p */
    public void m25900p() {
        tu3 tu3Var = (tu3) this.f26970q.mo20044D(4, null, null);
        m25892j(tu3Var, this.f26970q);
        this.f26970q = tu3Var;
    }
}
