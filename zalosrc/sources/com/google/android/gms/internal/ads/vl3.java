package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class vl3 extends tu3 implements aw3 {
    private static final vl3 zzb;
    private int zze;
    private bm3 zzf;
    private mt3 zzg = mt3.f24751q;

    static {
        vl3 vl3Var = new vl3();
        zzb = vl3Var;
        tu3.m26755A(vl3.class, vl3Var);
    }

    private vl3() {
    }

    /* renamed from: G */
    public static ul3 m27293G() {
        return (ul3) zzb.m26772C();
    }

    /* renamed from: I */
    public static vl3 m27295I() {
        return zzb;
    }

    /* renamed from: J */
    public static vl3 m27296J(mt3 mt3Var, gu3 gu3Var) {
        return (vl3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m27298N(vl3 vl3Var, bm3 bm3Var) {
        bm3Var.getClass();
        vl3Var.zzf = bm3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    tl3 tl3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ul3(tl3Var);
                }
                return new vl3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m27300F() {
        return this.zze;
    }

    /* renamed from: K */
    public final bm3 m27301K() {
        bm3 bm3Var = this.zzf;
        if (bm3Var == null) {
            return bm3.m20602I();
        }
        return bm3Var;
    }

    /* renamed from: L */
    public final mt3 m27302L() {
        return this.zzg;
    }
}
