package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class z04 implements j34 {

    /* renamed from: a */
    private final i44 f31314a;

    /* renamed from: b */
    private final a04 f31315b;

    /* renamed from: c */
    private c44 f31316c;

    /* renamed from: d */
    private j34 f31317d;

    /* renamed from: e */
    private boolean f31318e = true;

    /* renamed from: f */
    private boolean f31319f;

    public z04(a04 a04Var, w81 w81Var) {
        this.f31315b = a04Var;
        this.f31314a = new i44(w81Var);
    }

    /* renamed from: a */
    public final long m28415a(boolean z11) {
        c44 c44Var = this.f31316c;
        if (c44Var != null && !c44Var.zzM() && (this.f31316c.zzN() || (!z11 && !this.f31316c.mo20801e()))) {
            j34 j34Var = this.f31317d;
            j34Var.getClass();
            long zza = j34Var.zza();
            if (this.f31318e) {
                if (zza < this.f31314a.zza()) {
                    this.f31314a.m23126c();
                } else {
                    this.f31318e = false;
                    if (this.f31319f) {
                        this.f31314a.m23125b();
                    }
                }
            }
            this.f31314a.m23124a(zza);
            kc0 zzc = j34Var.zzc();
            if (!zzc.equals(this.f31314a.zzc())) {
                this.f31314a.mo23127j(zzc);
                this.f31315b.mo19944a(zzc);
            }
        } else {
            this.f31318e = true;
            if (this.f31319f) {
                this.f31314a.m23125b();
            }
        }
        if (this.f31318e) {
            return this.f31314a.zza();
        }
        j34 j34Var2 = this.f31317d;
        j34Var2.getClass();
        return j34Var2.zza();
    }

    /* renamed from: b */
    public final void m28416b(c44 c44Var) {
        if (c44Var == this.f31316c) {
            this.f31317d = null;
            this.f31316c = null;
            this.f31318e = true;
        }
    }

    /* renamed from: c */
    public final void m28417c(c44 c44Var) {
        j34 j34Var;
        j34 zzi = c44Var.zzi();
        if (zzi != null && zzi != (j34Var = this.f31317d)) {
            if (j34Var == null) {
                this.f31317d = zzi;
                this.f31316c = c44Var;
                zzi.mo23127j(this.f31314a.zzc());
                return;
            }
            throw zzha.m28832d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    /* renamed from: d */
    public final void m28418d(long j11) {
        this.f31314a.m23124a(j11);
    }

    /* renamed from: e */
    public final void m28419e() {
        this.f31319f = true;
        this.f31314a.m23125b();
    }

    /* renamed from: f */
    public final void m28420f() {
        this.f31319f = false;
        this.f31314a.m23126c();
    }

    @Override // com.google.android.gms.internal.ads.j34
    /* renamed from: j */
    public final void mo23127j(kc0 kc0Var) {
        j34 j34Var = this.f31317d;
        if (j34Var != null) {
            j34Var.mo23127j(kc0Var);
            kc0Var = this.f31317d.zzc();
        }
        this.f31314a.mo23127j(kc0Var);
    }

    @Override // com.google.android.gms.internal.ads.j34
    public final long zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.j34
    public final kc0 zzc() {
        j34 j34Var = this.f31317d;
        if (j34Var != null) {
            return j34Var.zzc();
        }
        return this.f31314a.zzc();
    }
}
