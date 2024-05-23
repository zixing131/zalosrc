package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tt */
/* loaded from: classes2.dex */
public final class C5032tt extends tu3 implements aw3 {
    private static final C5032tt zzb;
    private int zze;
    private String zzf = "";
    private cv3 zzg = tu3.m26767w();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        C5032tt c5032tt = new C5032tt();
        zzb = c5032tt;
        tu3.m26755A(C5032tt.class, c5032tt);
    }

    private C5032tt() {
    }

    /* renamed from: G */
    public static C5032tt m26737G() {
        return zzb;
    }

    /* renamed from: H */
    public static /* synthetic */ void m26738H(C5032tt c5032tt, String str) {
        str.getClass();
        c5032tt.zze |= 1;
        c5032tt.zzf = str;
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
                    return new C4995st(null);
                }
                return new C5032tt();
            }
            xu3 xu3Var = C4440du.f19419a;
            return tu3.m26770z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", C4884pt.class, "zzh", xu3Var, "zzi", xu3Var, "zzj", xu3Var});
        }
        return (byte) 1;
    }
}
