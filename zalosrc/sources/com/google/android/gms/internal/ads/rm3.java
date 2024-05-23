package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class rm3 extends tu3 implements aw3 {
    private static final rm3 zzb;
    private int zze;
    private int zzf;

    static {
        rm3 rm3Var = new rm3();
        zzb = rm3Var;
        tu3.m26755A(rm3.class, rm3Var);
    }

    private rm3() {
    }

    /* renamed from: G */
    public static qm3 m26130G() {
        return (qm3) zzb.m26772C();
    }

    /* renamed from: I */
    public static rm3 m26132I(mt3 mt3Var, gu3 gu3Var) {
        return (rm3) tu3.m26761q(zzb, mt3Var, gu3Var);
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
                    return new qm3(null);
                }
                return new rm3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m26134F() {
        return this.zze;
    }
}
