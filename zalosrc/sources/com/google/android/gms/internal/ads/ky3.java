package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ky3 extends tu3 implements aw3 {
    private static final ky3 zzb;
    private int zze;
    private jy3 zzf;
    private mt3 zzh;
    private mt3 zzi;
    private int zzj;
    private byte zzk = 2;
    private cv3 zzg = tu3.m26767w();

    static {
        ky3 ky3Var = new ky3();
        zzb = ky3Var;
        tu3.m26755A(ky3.class, ky3Var);
    }

    private ky3() {
        mt3 mt3Var = mt3.f24751q;
        this.zzh = mt3Var;
        this.zzi = mt3Var;
    }

    /* renamed from: F */
    public static hy3 m24096F() {
        return (hy3) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m24098H(ky3 ky3Var, gy3 gy3Var) {
        gy3Var.getClass();
        cv3 cv3Var = ky3Var.zzg;
        if (!cv3Var.zzc()) {
            ky3Var.zzg = tu3.m26768x(cv3Var);
        }
        ky3Var.zzg.add(gy3Var);
    }

    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            byte b11 = 1;
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            if (obj == null) {
                                b11 = 0;
                            }
                            this.zzk = b11;
                            return null;
                        }
                        return zzb;
                    }
                    return new hy3(null);
                }
                return new ky3();
            }
            return tu3.m26770z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", gy3.class, "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
