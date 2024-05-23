package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class xo3 extends tu3 implements aw3 {
    private static final xo3 zzb;
    private ap3 zze;

    static {
        xo3 xo3Var = new xo3();
        zzb = xo3Var;
        tu3.m26755A(xo3.class, xo3Var);
    }

    private xo3() {
    }

    /* renamed from: F */
    public static wo3 m27961F() {
        return (wo3) zzb.m26772C();
    }

    /* renamed from: H */
    public static xo3 m27963H(mt3 mt3Var, gu3 gu3Var) {
        return (xo3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: J */
    public static /* synthetic */ void m27964J(xo3 xo3Var, ap3 ap3Var) {
        ap3Var.getClass();
        xo3Var.zze = ap3Var;
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
                    return new wo3(null);
                }
                return new xo3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final ap3 m27965I() {
        ap3 ap3Var = this.zze;
        if (ap3Var == null) {
            return ap3.m20213H();
        }
        return ap3Var;
    }
}
