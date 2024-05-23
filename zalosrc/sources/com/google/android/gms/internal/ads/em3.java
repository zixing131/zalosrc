package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class em3 extends tu3 implements aw3 {
    private static final em3 zzb;
    private int zze;
    private lm3 zzf;
    private mt3 zzg = mt3.f24751q;

    static {
        em3 em3Var = new em3();
        zzb = em3Var;
        tu3.m26755A(em3.class, em3Var);
    }

    private em3() {
    }

    /* renamed from: G */
    public static dm3 m21751G() {
        return (dm3) zzb.m26772C();
    }

    /* renamed from: I */
    public static em3 m21753I(mt3 mt3Var, gu3 gu3Var) {
        return (em3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* synthetic */ void m21755M(em3 em3Var, lm3 lm3Var) {
        lm3Var.getClass();
        em3Var.zzf = lm3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    cm3 cm3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new dm3(cm3Var);
                }
                return new em3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m21757F() {
        return this.zze;
    }

    /* renamed from: J */
    public final lm3 m21758J() {
        lm3 lm3Var = this.zzf;
        if (lm3Var == null) {
            return lm3.m24334I();
        }
        return lm3Var;
    }

    /* renamed from: K */
    public final mt3 m21759K() {
        return this.zzg;
    }
}
