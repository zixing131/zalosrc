package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class pl3 extends tu3 implements aw3 {
    private static final pl3 zzb;
    private int zze;
    private vl3 zzf;
    private mo3 zzg;

    static {
        pl3 pl3Var = new pl3();
        zzb = pl3Var;
        tu3.m26755A(pl3.class, pl3Var);
    }

    private pl3() {
    }

    /* renamed from: G */
    public static ol3 m25479G() {
        return (ol3) zzb.m26772C();
    }

    /* renamed from: I */
    public static pl3 m25481I(mt3 mt3Var, gu3 gu3Var) {
        return (pl3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m25483M(pl3 pl3Var, vl3 vl3Var) {
        vl3Var.getClass();
        pl3Var.zzf = vl3Var;
    }

    /* renamed from: N */
    public static /* synthetic */ void m25484N(pl3 pl3Var, mo3 mo3Var) {
        mo3Var.getClass();
        pl3Var.zzg = mo3Var;
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
                    return new ol3(null);
                }
                return new pl3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m25485F() {
        return this.zze;
    }

    /* renamed from: J */
    public final vl3 m25486J() {
        vl3 vl3Var = this.zzf;
        if (vl3Var == null) {
            return vl3.m27295I();
        }
        return vl3Var;
    }

    /* renamed from: K */
    public final mo3 m25487K() {
        mo3 mo3Var = this.zzg;
        if (mo3Var == null) {
            return mo3.m24656I();
        }
        return mo3Var;
    }
}
