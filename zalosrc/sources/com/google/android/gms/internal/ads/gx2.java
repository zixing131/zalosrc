package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gx2 extends tu3 implements aw3 {
    private static final gx2 zzb;
    private cv3 zze = tu3.m26767w();

    static {
        gx2 gx2Var = new gx2();
        zzb = gx2Var;
        tu3.m26755A(gx2.class, gx2Var);
    }

    private gx2() {
    }

    /* renamed from: G */
    public static dx2 m22624G() {
        return (dx2) zzb.m26772C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m22627J(gx2 gx2Var, fx2 fx2Var) {
        fx2Var.getClass();
        cv3 cv3Var = gx2Var.zze;
        if (!cv3Var.zzc()) {
            gx2Var.zze = tu3.m26768x(cv3Var);
        }
        gx2Var.zze.add(fx2Var);
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
                    return new dx2(cx2Var);
                }
                return new gx2();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", fx2.class});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m22628F() {
        return this.zze.size();
    }
}
