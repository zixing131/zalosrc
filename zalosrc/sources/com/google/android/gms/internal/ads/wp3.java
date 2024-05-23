package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class wp3 extends tu3 implements aw3 {
    private static final wp3 zzb;
    private jp3 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        wp3 wp3Var = new wp3();
        zzb = wp3Var;
        tu3.m26755A(wp3.class, wp3Var);
    }

    private wp3() {
    }

    /* renamed from: H */
    public static vp3 m27677H() {
        return (vp3) zzb.m26772C();
    }

    /* renamed from: J */
    public static /* synthetic */ void m27679J(wp3 wp3Var, jp3 jp3Var) {
        jp3Var.getClass();
        wp3Var.zze = jp3Var;
    }

    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new vp3(null);
                }
                return new wp3();
            }
            return tu3.m26770z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m27683F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final jp3 m27684G() {
        jp3 jp3Var = this.zze;
        if (jp3Var == null) {
            return jp3.m23713H();
        }
        return jp3Var;
    }

    /* renamed from: L */
    public final boolean m27685L() {
        return this.zze != null;
    }

    /* renamed from: M */
    public final int m27686M() {
        int i11 = this.zzf;
        int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    /* renamed from: N */
    public final int m27687N() {
        int m26154b = rq3.m26154b(this.zzh);
        if (m26154b == 0) {
            return 1;
        }
        return m26154b;
    }
}
