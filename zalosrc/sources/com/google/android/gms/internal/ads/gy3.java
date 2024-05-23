package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gy3 extends tu3 implements aw3 {
    private static final gy3 zzb;
    private int zze;
    private mt3 zzf;
    private mt3 zzg;
    private byte zzh = 2;

    static {
        gy3 gy3Var = new gy3();
        zzb = gy3Var;
        tu3.m26755A(gy3.class, gy3Var);
    }

    private gy3() {
        mt3 mt3Var = mt3.f24751q;
        this.zzf = mt3Var;
        this.zzg = mt3Var;
    }

    /* renamed from: F */
    public static fy3 m22644F() {
        return (fy3) zzb.m26772C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m22646H(gy3 gy3Var, mt3 mt3Var) {
        gy3Var.zze |= 1;
        gy3Var.zzf = mt3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m22647I(gy3 gy3Var, mt3 mt3Var) {
        gy3Var.zze |= 2;
        gy3Var.zzg = mt3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            byte b11 = 1;
            if (i12 != 2) {
                if (i12 != 3) {
                    ox3 ox3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            if (obj == null) {
                                b11 = 0;
                            }
                            this.zzh = b11;
                            return null;
                        }
                        return zzb;
                    }
                    return new fy3(ox3Var);
                }
                return new gy3();
            }
            return tu3.m26770z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
