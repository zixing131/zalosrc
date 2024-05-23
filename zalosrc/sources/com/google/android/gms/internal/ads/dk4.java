package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class dk4 {

    /* renamed from: c */
    private boolean f19287c;

    /* renamed from: e */
    private int f19289e;

    /* renamed from: a */
    private ck4 f19285a = new ck4();

    /* renamed from: b */
    private ck4 f19286b = new ck4();

    /* renamed from: d */
    private long f19288d = -9223372036854775807L;

    /* renamed from: a */
    public final float m21450a() {
        if (this.f19285a.m20923f()) {
            return (float) (1.0E9d / this.f19285a.m20918a());
        }
        return -1.0f;
    }

    /* renamed from: b */
    public final int m21451b() {
        return this.f19289e;
    }

    /* renamed from: c */
    public final long m21452c() {
        if (this.f19285a.m20923f()) {
            return this.f19285a.m20918a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final long m21453d() {
        if (this.f19285a.m20923f()) {
            return this.f19285a.m20919b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final void m21454e(long j11) {
        this.f19285a.m20920c(j11);
        int i11 = 0;
        if (this.f19285a.m20923f()) {
            this.f19287c = false;
        } else if (this.f19288d != -9223372036854775807L) {
            if (!this.f19287c || this.f19286b.m20922e()) {
                this.f19286b.m20921d();
                this.f19286b.m20920c(this.f19288d);
            }
            this.f19287c = true;
            this.f19286b.m20920c(j11);
        }
        if (this.f19287c && this.f19286b.m20923f()) {
            ck4 ck4Var = this.f19285a;
            this.f19285a = this.f19286b;
            this.f19286b = ck4Var;
            this.f19287c = false;
        }
        this.f19288d = j11;
        if (!this.f19285a.m20923f()) {
            i11 = this.f19289e + 1;
        }
        this.f19289e = i11;
    }

    /* renamed from: f */
    public final void m21455f() {
        this.f19285a.m20921d();
        this.f19286b.m20921d();
        this.f19287c = false;
        this.f19288d = -9223372036854775807L;
        this.f19289e = 0;
    }

    /* renamed from: g */
    public final boolean m21456g() {
        return this.f19285a.m20923f();
    }
}
