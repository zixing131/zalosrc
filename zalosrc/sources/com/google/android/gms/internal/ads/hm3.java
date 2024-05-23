package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class hm3 extends tu3 implements aw3 {
    private static final hm3 zzb;
    private lm3 zze;
    private int zzf;

    static {
        hm3 hm3Var = new hm3();
        zzb = hm3Var;
        tu3.m26755A(hm3.class, hm3Var);
    }

    private hm3() {
    }

    /* renamed from: G */
    public static gm3 m22970G() {
        return (gm3) zzb.m26772C();
    }

    /* renamed from: I */
    public static hm3 m22972I(mt3 mt3Var, gu3 gu3Var) {
        return (hm3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: K */
    public static /* synthetic */ void m22973K(hm3 hm3Var, lm3 lm3Var) {
        lm3Var.getClass();
        hm3Var.zze = lm3Var;
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
                    return new gm3(null);
                }
                return new hm3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m22975F() {
        return this.zzf;
    }

    /* renamed from: J */
    public final lm3 m22976J() {
        lm3 lm3Var = this.zze;
        if (lm3Var == null) {
            return lm3.m24334I();
        }
        return lm3Var;
    }
}
