package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class v03 extends tu3 implements aw3 {
    private static final zu3 zzb = new s03();
    private static final v03 zze;
    private int zzf;
    private yu3 zzg = tu3.m26764t();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        v03 v03Var = new v03();
        zze = v03Var;
        tu3.m26755A(v03.class, v03Var);
    }

    private v03() {
    }

    /* renamed from: F */
    public static u03 m27112F() {
        return (u03) zze.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m27114H(v03 v03Var, String str) {
        str.getClass();
        v03Var.zzf |= 1;
        v03Var.zzh = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m27115I(v03 v03Var, int i11) {
        yu3 yu3Var = v03Var.zzg;
        if (!yu3Var.zzc()) {
            v03Var.zzg = tu3.m26765u(yu3Var);
        }
        v03Var.zzg.mo27068f(2);
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
                        return zze;
                    }
                    return new u03(null);
                }
                return new v03();
            }
            return tu3.m26770z(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", t03.f28079a, "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
