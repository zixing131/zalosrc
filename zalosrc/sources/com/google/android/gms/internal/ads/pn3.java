package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class pn3 extends tu3 implements aw3 {
    private static final pn3 zzb;
    private pp3 zze;

    static {
        pn3 pn3Var = new pn3();
        zzb = pn3Var;
        tu3.m26755A(pn3.class, pn3Var);
    }

    private pn3() {
    }

    /* renamed from: F */
    public static on3 m25489F() {
        return (on3) zzb.m26772C();
    }

    /* renamed from: H */
    public static pn3 m25491H() {
        return zzb;
    }

    /* renamed from: J */
    public static /* synthetic */ void m25492J(pn3 pn3Var, pp3 pp3Var) {
        pp3Var.getClass();
        pn3Var.zze = pp3Var;
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
                    return new on3(null);
                }
                return new pn3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final pp3 m25493I() {
        pp3 pp3Var = this.zze;
        if (pp3Var == null) {
            return pp3.m25506H();
        }
        return pp3Var;
    }
}
