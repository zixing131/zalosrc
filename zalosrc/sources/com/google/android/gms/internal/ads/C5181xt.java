package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xt */
/* loaded from: classes2.dex */
public final class C5181xt extends tu3 implements aw3 {
    private static final C5181xt zzb;
    private int zze;
    private C4886pv zzg;
    private int zzh;
    private C4960rv zzi;
    private int zzj;
    private String zzf = "";
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C5181xt c5181xt = new C5181xt();
        zzb = c5181xt;
        tu3.m26755A(C5181xt.class, c5181xt);
    }

    private C5181xt() {
    }

    /* renamed from: G */
    public static C5181xt m28009G() {
        return zzb;
    }

    /* renamed from: H */
    public static /* synthetic */ void m28010H(C5181xt c5181xt, String str) {
        c5181xt.zze |= 1;
        c5181xt.zzf = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m28011I(C5181xt c5181xt, C4960rv c4960rv) {
        c4960rv.getClass();
        c5181xt.zzi = c4960rv;
        c5181xt.zze |= 8;
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
                    return new C5144wt(null);
                }
                return new C5181xt();
            }
            xu3 xu3Var = C4440du.f19419a;
            return tu3.m26770z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", xu3Var, "zzl", xu3Var, "zzm", xu3Var});
        }
        return (byte) 1;
    }
}
