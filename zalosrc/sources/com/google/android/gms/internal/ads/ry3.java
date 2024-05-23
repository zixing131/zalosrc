package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ry3 extends tu3 implements aw3 {
    private static final ry3 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private mt3 zzh;
    private mt3 zzi;

    static {
        ry3 ry3Var = new ry3();
        zzb = ry3Var;
        tu3.m26755A(ry3.class, ry3Var);
    }

    private ry3() {
        mt3 mt3Var = mt3.f24751q;
        this.zzh = mt3Var;
        this.zzi = mt3Var;
    }

    /* renamed from: F */
    public static py3 m26206F() {
        return (py3) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m26208H(ry3 ry3Var, String str) {
        ry3Var.zze |= 2;
        ry3Var.zzg = "image/png";
    }

    /* renamed from: I */
    public static /* synthetic */ void m26209I(ry3 ry3Var, mt3 mt3Var) {
        mt3Var.getClass();
        ry3Var.zze |= 4;
        ry3Var.zzh = mt3Var;
    }

    /* renamed from: J */
    public static /* synthetic */ void m26210J(ry3 ry3Var, int i11) {
        ry3Var.zzf = 1;
        ry3Var.zze = 1 | ry3Var.zze;
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
                    return new py3(null);
                }
                return new ry3();
            }
            return tu3.m26770z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", qy3.f27001a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
