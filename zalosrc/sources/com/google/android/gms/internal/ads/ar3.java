package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ar3 extends tu3 implements aw3 {
    private static final ar3 zzb;
    private int zze;

    static {
        ar3 ar3Var = new ar3();
        zzb = ar3Var;
        tu3.m26755A(ar3.class, ar3Var);
    }

    private ar3() {
    }

    /* renamed from: G */
    public static ar3 m20228G() {
        return zzb;
    }

    /* renamed from: H */
    public static ar3 m20229H(mt3 mt3Var, gu3 gu3Var) {
        return (ar3) tu3.m26761q(zzb, mt3Var, gu3Var);
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
                    return new zq3(null);
                }
                return new ar3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
