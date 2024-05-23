package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class yl3 extends tu3 implements aw3 {
    private static final yl3 zzb;
    private bm3 zze;
    private int zzf;

    static {
        yl3 yl3Var = new yl3();
        zzb = yl3Var;
        tu3.m26755A(yl3.class, yl3Var);
    }

    private yl3() {
    }

    /* renamed from: G */
    public static xl3 m28233G() {
        return (xl3) zzb.m26772C();
    }

    /* renamed from: I */
    public static yl3 m28235I() {
        return zzb;
    }

    /* renamed from: J */
    public static yl3 m28236J(mt3 mt3Var, gu3 gu3Var) {
        return (yl3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m28237L(yl3 yl3Var, bm3 bm3Var) {
        bm3Var.getClass();
        yl3Var.zze = bm3Var;
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
                    return new xl3(null);
                }
                return new yl3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m28239F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final bm3 m28240K() {
        bm3 bm3Var = this.zze;
        if (bm3Var == null) {
            return bm3.m20602I();
        }
        return bm3Var;
    }
}
