package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class dp3 extends tu3 implements aw3 {
    private static final dp3 zzb;
    private int zze;
    private gp3 zzf;
    private mt3 zzg = mt3.f24751q;

    static {
        dp3 dp3Var = new dp3();
        zzb = dp3Var;
        tu3.m26755A(dp3.class, dp3Var);
    }

    private dp3() {
    }

    /* renamed from: G */
    public static cp3 m21521G() {
        return (cp3) zzb.m26772C();
    }

    /* renamed from: I */
    public static dp3 m21523I(mt3 mt3Var, gu3 gu3Var) {
        return (dp3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* synthetic */ void m21525M(dp3 dp3Var, gp3 gp3Var) {
        gp3Var.getClass();
        dp3Var.zzf = gp3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    bp3 bp3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new cp3(bp3Var);
                }
                return new dp3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m21527F() {
        return this.zze;
    }

    /* renamed from: J */
    public final gp3 m21528J() {
        gp3 gp3Var = this.zzf;
        if (gp3Var == null) {
            return gp3.m22500J();
        }
        return gp3Var;
    }

    /* renamed from: K */
    public final mt3 m21529K() {
        return this.zzg;
    }

    /* renamed from: O */
    public final boolean m21530O() {
        return this.zzf != null;
    }
}
