package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class fx2 extends tu3 implements aw3 {
    private static final fx2 zzb;
    private ax2 zze;

    static {
        fx2 fx2Var = new fx2();
        zzb = fx2Var;
        tu3.m26755A(fx2.class, fx2Var);
    }

    private fx2() {
    }

    /* renamed from: F */
    public static ex2 m22198F() {
        return (ex2) zzb.m26772C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m22200H(fx2 fx2Var, ax2 ax2Var) {
        ax2Var.getClass();
        fx2Var.zze = ax2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    cx2 cx2Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ex2(cx2Var);
                }
                return new fx2();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
