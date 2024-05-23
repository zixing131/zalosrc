package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class xr2 implements pi2 {

    /* renamed from: b */
    private dc3 f30597b;

    /* renamed from: c */
    private String f30598c;

    /* renamed from: f */
    private boolean f30601f;

    /* renamed from: a */
    private final m53 f30596a = new m53();

    /* renamed from: d */
    private int f30599d = 8000;

    /* renamed from: e */
    private int f30600e = 8000;

    /* renamed from: a */
    public final xr2 m27997a(boolean z11) {
        this.f30601f = true;
        return this;
    }

    /* renamed from: b */
    public final xr2 m27998b(int i11) {
        this.f30599d = i11;
        return this;
    }

    /* renamed from: c */
    public final xr2 m27999c(int i11) {
        this.f30600e = i11;
        return this;
    }

    /* renamed from: d */
    public final xr2 m28000d(dc3 dc3Var) {
        this.f30597b = dc3Var;
        return this;
    }

    /* renamed from: e */
    public final xr2 m28001e(String str) {
        this.f30598c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.pi2
    /* renamed from: f */
    public final bx2 zza() {
        bx2 bx2Var = new bx2(this.f30598c, this.f30599d, this.f30600e, this.f30601f, this.f30596a);
        dc3 dc3Var = this.f30597b;
        if (dc3Var != null) {
            bx2Var.mo20854g(dc3Var);
        }
        return bx2Var;
    }
}
