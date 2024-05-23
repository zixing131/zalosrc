package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oy3 extends tu3 implements aw3 {
    private static final oy3 zzb;
    private int zze;
    private ny3 zzf;
    private mt3 zzh;
    private mt3 zzi;
    private int zzj;
    private mt3 zzk;
    private byte zzl = 2;
    private cv3 zzg = tu3.m26767w();

    static {
        oy3 oy3Var = new oy3();
        zzb = oy3Var;
        tu3.m26755A(oy3.class, oy3Var);
    }

    private oy3() {
        mt3 mt3Var = mt3.f24751q;
        this.zzh = mt3Var;
        this.zzi = mt3Var;
        this.zzk = mt3Var;
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
                            this.zzl = b11;
                            return null;
                        }
                        return zzb;
                    }
                    return new ly3(null);
                }
                return new oy3();
            }
            return tu3.m26770z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", gy3.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
