package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class fq3 extends tu3 implements aw3 {
    private static final fq3 zzb;
    private int zze;
    private iq3 zzf;

    static {
        fq3 fq3Var = new fq3();
        zzb = fq3Var;
        tu3.m26755A(fq3.class, fq3Var);
    }

    private fq3() {
    }

    /* renamed from: G */
    public static eq3 m22142G() {
        return (eq3) zzb.m26772C();
    }

    /* renamed from: I */
    public static fq3 m22144I(mt3 mt3Var, gu3 gu3Var) {
        return (fq3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static /* synthetic */ void m22146L(fq3 fq3Var, iq3 iq3Var) {
        iq3Var.getClass();
        fq3Var.zzf = iq3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    dq3 dq3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new eq3(dq3Var);
                }
                return new fq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m22147F() {
        return this.zze;
    }

    /* renamed from: J */
    public final iq3 m22148J() {
        iq3 iq3Var = this.zzf;
        if (iq3Var == null) {
            return iq3.m23343G();
        }
        return iq3Var;
    }
}
