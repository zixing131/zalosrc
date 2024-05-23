package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class vn3 extends tu3 implements aw3 {
    private static final vn3 zzb;
    private eo3 zze;
    private pn3 zzf;
    private int zzg;

    static {
        vn3 vn3Var = new vn3();
        zzb = vn3Var;
        tu3.m26755A(vn3.class, vn3Var);
    }

    private vn3() {
    }

    /* renamed from: G */
    public static un3 m27314G() {
        return (un3) zzb.m26772C();
    }

    /* renamed from: I */
    public static vn3 m27316I() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ void m27317K(vn3 vn3Var, eo3 eo3Var) {
        eo3Var.getClass();
        vn3Var.zze = eo3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static /* synthetic */ void m27318L(vn3 vn3Var, pn3 pn3Var) {
        pn3Var.getClass();
        vn3Var.zzf = pn3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    tn3 tn3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new un3(tn3Var);
                }
                return new vn3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final pn3 m27320F() {
        pn3 pn3Var = this.zzf;
        if (pn3Var == null) {
            return pn3.m25491H();
        }
        return pn3Var;
    }

    /* renamed from: J */
    public final eo3 m27321J() {
        eo3 eo3Var = this.zze;
        if (eo3Var == null) {
            return eo3.m21770H();
        }
        return eo3Var;
    }

    /* renamed from: M */
    public final int m27322M() {
        int i11 = this.zzg;
        int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }
}
