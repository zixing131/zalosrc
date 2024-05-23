package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class sl3 extends tu3 implements aw3 {
    private static final sl3 zzb;
    private yl3 zze;
    private po3 zzf;

    static {
        sl3 sl3Var = new sl3();
        zzb = sl3Var;
        tu3.m26755A(sl3.class, sl3Var);
    }

    private sl3() {
    }

    /* renamed from: F */
    public static rl3 m26351F() {
        return (rl3) zzb.m26772C();
    }

    /* renamed from: H */
    public static sl3 m26353H(mt3 mt3Var, gu3 gu3Var) {
        return (sl3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: K */
    public static /* synthetic */ void m26354K(sl3 sl3Var, yl3 yl3Var) {
        yl3Var.getClass();
        sl3Var.zze = yl3Var;
    }

    /* renamed from: L */
    public static /* synthetic */ void m26355L(sl3 sl3Var, po3 po3Var) {
        po3Var.getClass();
        sl3Var.zzf = po3Var;
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
                    return new rl3(null);
                }
                return new sl3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final yl3 m26356I() {
        yl3 yl3Var = this.zze;
        if (yl3Var == null) {
            return yl3.m28235I();
        }
        return yl3Var;
    }

    /* renamed from: J */
    public final po3 m26357J() {
        po3 po3Var = this.zzf;
        if (po3Var == null) {
            return po3.m25496I();
        }
        return po3Var;
    }
}
