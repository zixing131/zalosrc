package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ml3 extends tu3 implements aw3 {
    private static final ml3 zzb;
    private int zze;

    static {
        ml3 ml3Var = new ml3();
        zzb = ml3Var;
        tu3.m26755A(ml3.class, ml3Var);
    }

    private ml3() {
    }

    /* renamed from: G */
    public static ll3 m24623G() {
        return (ll3) zzb.m26772C();
    }

    /* renamed from: I */
    public static ml3 m24625I() {
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
                    return new ll3(null);
                }
                return new ml3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m24627F() {
        return this.zze;
    }
}
