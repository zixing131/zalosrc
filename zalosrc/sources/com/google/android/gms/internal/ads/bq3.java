package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class bq3 extends tu3 implements aw3 {
    private static final bq3 zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        bq3 bq3Var = new bq3();
        zzb = bq3Var;
        tu3.m26755A(bq3.class, bq3Var);
    }

    private bq3() {
    }

    /* renamed from: F */
    public static aq3 m20645F() {
        return (aq3) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m20647H(bq3 bq3Var, String str) {
        str.getClass();
        bq3Var.zze = str;
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
                    return new aq3(null);
                }
                return new bq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
