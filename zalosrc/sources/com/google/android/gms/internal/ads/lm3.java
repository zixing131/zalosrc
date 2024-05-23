package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class lm3 extends tu3 implements aw3 {
    private static final lm3 zzb;
    private int zze;

    static {
        lm3 lm3Var = new lm3();
        zzb = lm3Var;
        tu3.m26755A(lm3.class, lm3Var);
    }

    private lm3() {
    }

    /* renamed from: G */
    public static km3 m24332G() {
        return (km3) zzb.m26772C();
    }

    /* renamed from: I */
    public static lm3 m24334I() {
        return zzb;
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
                    return new km3(null);
                }
                return new lm3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m24336F() {
        return this.zze;
    }
}
