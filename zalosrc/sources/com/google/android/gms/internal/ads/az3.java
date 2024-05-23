package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class az3 extends tu3 implements aw3 {
    private static final az3 zzb;
    private int zze;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        az3 az3Var = new az3();
        zzb = az3Var;
        tu3.m26755A(az3.class, az3Var);
    }

    private az3() {
    }

    /* renamed from: F */
    public static yy3 m20354F() {
        return (yy3) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m20356H(az3 az3Var, String str) {
        az3Var.zze |= 1;
        az3Var.zzf = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m20357I(az3 az3Var, long j11) {
        az3Var.zze |= 2;
        az3Var.zzg = j11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m20358J(az3 az3Var, boolean z11) {
        az3Var.zze |= 4;
        az3Var.zzh = z11;
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
                    return new yy3(null);
                }
                return new az3();
            }
            return tu3.m26770z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", bz3.f18058a, "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
