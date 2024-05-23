package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class fl3 extends tu3 implements aw3 {
    private static final fl3 zzb;
    private int zze;
    private mt3 zzf = mt3.f24751q;
    private ml3 zzg;

    static {
        fl3 fl3Var = new fl3();
        zzb = fl3Var;
        tu3.m26755A(fl3.class, fl3Var);
    }

    private fl3() {
    }

    /* renamed from: G */
    public static el3 m22075G() {
        return (el3) zzb.m26772C();
    }

    /* renamed from: I */
    public static fl3 m22077I(mt3 mt3Var, gu3 gu3Var) {
        return (fl3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m22080N(fl3 fl3Var, ml3 ml3Var) {
        ml3Var.getClass();
        fl3Var.zzg = ml3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    dl3 dl3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new el3(dl3Var);
                }
                return new fl3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m22081F() {
        return this.zze;
    }

    /* renamed from: J */
    public final ml3 m22082J() {
        ml3 ml3Var = this.zzg;
        if (ml3Var == null) {
            return ml3.m24625I();
        }
        return ml3Var;
    }

    /* renamed from: K */
    public final mt3 m22083K() {
        return this.zzf;
    }
}
