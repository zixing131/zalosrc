package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class sn3 extends tu3 implements aw3 {
    private static final sn3 zzb;
    private vn3 zze;

    static {
        sn3 sn3Var = new sn3();
        zzb = sn3Var;
        tu3.m26755A(sn3.class, sn3Var);
    }

    private sn3() {
    }

    /* renamed from: F */
    public static rn3 m26370F() {
        return (rn3) zzb.m26772C();
    }

    /* renamed from: H */
    public static sn3 m26372H(mt3 mt3Var, gu3 gu3Var) {
        return (sn3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: J */
    public static /* synthetic */ void m26373J(sn3 sn3Var, vn3 vn3Var) {
        vn3Var.getClass();
        sn3Var.zze = vn3Var;
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
                    return new rn3(null);
                }
                return new sn3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final vn3 m26374I() {
        vn3 vn3Var = this.zze;
        if (vn3Var == null) {
            return vn3.m27316I();
        }
        return vn3Var;
    }
}
