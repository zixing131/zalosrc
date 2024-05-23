package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class cq3 extends tu3 implements aw3 {
    private static final cq3 zzb;
    private int zze;
    private cv3 zzf = tu3.m26767w();

    static {
        cq3 cq3Var = new cq3();
        zzb = cq3Var;
        tu3.m26755A(cq3.class, cq3Var);
    }

    private cq3() {
    }

    /* renamed from: F */
    public static zp3 m20986F() {
        return (zp3) zzb.m26772C();
    }

    /* renamed from: I */
    public static /* synthetic */ void m20989I(cq3 cq3Var, bq3 bq3Var) {
        bq3Var.getClass();
        cv3 cv3Var = cq3Var.zzf;
        if (!cv3Var.zzc()) {
            cq3Var.zzf = tu3.m26768x(cv3Var);
        }
        cq3Var.zzf.add(bq3Var);
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
                    return new zp3(null);
                }
                return new cq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", bq3.class});
        }
        return (byte) 1;
    }
}
