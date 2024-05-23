package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class xq3 extends tu3 implements aw3 {
    private static final xq3 zzb;
    private int zze;
    private mt3 zzf = mt3.f24751q;

    static {
        xq3 xq3Var = new xq3();
        zzb = xq3Var;
        tu3.m26755A(xq3.class, xq3Var);
    }

    private xq3() {
    }

    /* renamed from: G */
    public static wq3 m27978G() {
        return (wq3) zzb.m26772C();
    }

    /* renamed from: I */
    public static xq3 m27980I(mt3 mt3Var, gu3 gu3Var) {
        return (xq3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    vq3 vq3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new wq3(vq3Var);
                }
                return new xq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m27983F() {
        return this.zze;
    }

    /* renamed from: J */
    public final mt3 m27984J() {
        return this.zzf;
    }
}
