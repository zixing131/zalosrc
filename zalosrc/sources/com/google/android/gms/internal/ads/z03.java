package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class z03 extends tu3 implements aw3 {
    private static final z03 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private v03 zzi;

    static {
        z03 z03Var = new z03();
        zzb = z03Var;
        tu3.m26755A(z03.class, z03Var);
    }

    private z03() {
    }

    /* renamed from: F */
    public static x03 m28410F() {
        return (x03) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m28412H(z03 z03Var, String str) {
        str.getClass();
        z03Var.zze |= 2;
        z03Var.zzg = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m28413I(z03 z03Var, v03 v03Var) {
        v03Var.getClass();
        z03Var.zzi = v03Var;
        z03Var.zze |= 8;
    }

    /* renamed from: J */
    public static /* synthetic */ void m28414J(z03 z03Var, int i11) {
        z03Var.zzf = 1;
        z03Var.zze = 1 | z03Var.zze;
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
                    return new x03(null);
                }
                return new z03();
            }
            return tu3.m26770z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", y03.f30721a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
