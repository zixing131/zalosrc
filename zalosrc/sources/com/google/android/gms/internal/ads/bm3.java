package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class bm3 extends tu3 implements aw3 {
    private static final bm3 zzb;
    private int zze;

    static {
        bm3 bm3Var = new bm3();
        zzb = bm3Var;
        tu3.m26755A(bm3.class, bm3Var);
    }

    private bm3() {
    }

    /* renamed from: G */
    public static am3 m20600G() {
        return (am3) zzb.m26772C();
    }

    /* renamed from: I */
    public static bm3 m20602I() {
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
                    return new am3(null);
                }
                return new bm3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m20604F() {
        return this.zze;
    }
}
