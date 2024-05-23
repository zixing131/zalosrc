package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ze4 extends te4 {

    /* renamed from: f */
    public static final Object f31481f = new Object();

    /* renamed from: d */
    private final Object f31482d;

    /* renamed from: e */
    private final Object f31483e;

    private ze4(mr0 mr0Var, Object obj, Object obj2) {
        super(mr0Var);
        this.f31482d = obj;
        this.f31483e = obj2;
    }

    /* renamed from: q */
    public static ze4 m28493q(C4330au c4330au) {
        return new ze4(new af4(c4330au), jq0.f22926o, f31481f);
    }

    /* renamed from: r */
    public static ze4 m28494r(mr0 mr0Var, Object obj, Object obj2) {
        return new ze4(mr0Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.te4, com.google.android.gms.internal.ads.mr0
    /* renamed from: a */
    public final int mo20105a(Object obj) {
        Object obj2;
        mr0 mr0Var = this.f28301c;
        if (f31481f.equals(obj) && (obj2 = this.f31483e) != null) {
            obj = obj2;
        }
        return mr0Var.mo20105a(obj);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: d */
    public final ho0 mo20108d(int i11, ho0 ho0Var, boolean z11) {
        this.f28301c.mo20108d(i11, ho0Var, z11);
        if (g92.m22362t(ho0Var.f21854b, this.f31483e) && z11) {
            ho0Var.f21854b = f31481f;
        }
        return ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: e */
    public final jq0 mo20109e(int i11, jq0 jq0Var, long j11) {
        this.f28301c.mo20109e(i11, jq0Var, j11);
        if (g92.m22362t(jq0Var.f22930a, this.f31482d)) {
            jq0Var.f22930a = jq0.f22926o;
        }
        return jq0Var;
    }

    @Override // com.google.android.gms.internal.ads.te4, com.google.android.gms.internal.ads.mr0
    /* renamed from: f */
    public final Object mo20110f(int i11) {
        Object mo20110f = this.f28301c.mo20110f(i11);
        if (g92.m22362t(mo20110f, this.f31483e)) {
            return f31481f;
        }
        return mo20110f;
    }

    /* renamed from: p */
    public final ze4 m28496p(mr0 mr0Var) {
        return new ze4(mr0Var, this.f31482d, this.f31483e);
    }
}
