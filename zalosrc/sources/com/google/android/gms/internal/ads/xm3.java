package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class xm3 extends tu3 implements aw3 {
    private static final xm3 zzb;
    private int zze;
    private int zzf;

    static {
        xm3 xm3Var = new xm3();
        zzb = xm3Var;
        tu3.m26755A(xm3.class, xm3Var);
    }

    private xm3() {
    }

    /* renamed from: G */
    public static wm3 m27937G() {
        return (wm3) zzb.m26772C();
    }

    /* renamed from: I */
    public static xm3 m27939I(mt3 mt3Var, gu3 gu3Var) {
        return (xm3) tu3.m26761q(zzb, mt3Var, gu3Var);
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
                    return new wm3(null);
                }
                return new xm3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m27941F() {
        return this.zze;
    }
}
