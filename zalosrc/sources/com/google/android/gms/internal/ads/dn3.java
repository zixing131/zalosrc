package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class dn3 extends tu3 implements aw3 {
    private static final dn3 zzb;
    private int zze;
    private int zzf;

    static {
        dn3 dn3Var = new dn3();
        zzb = dn3Var;
        tu3.m26755A(dn3.class, dn3Var);
    }

    private dn3() {
    }

    /* renamed from: G */
    public static cn3 m21507G() {
        return (cn3) zzb.m26772C();
    }

    /* renamed from: I */
    public static dn3 m21509I(mt3 mt3Var, gu3 gu3Var) {
        return (dn3) tu3.m26761q(zzb, mt3Var, gu3Var);
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
                    return new cn3(null);
                }
                return new dn3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m21511F() {
        return this.zze;
    }
}
