package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class yn3 extends tu3 implements aw3 {
    private static final yn3 zzb;
    private int zze;
    private bo3 zzf;
    private mt3 zzg = mt3.f24751q;

    static {
        yn3 yn3Var = new yn3();
        zzb = yn3Var;
        tu3.m26755A(yn3.class, yn3Var);
    }

    private yn3() {
    }

    /* renamed from: G */
    public static xn3 m28274G() {
        return (xn3) zzb.m26772C();
    }

    /* renamed from: I */
    public static yn3 m28276I(mt3 mt3Var, gu3 gu3Var) {
        return (yn3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m28278M(yn3 yn3Var, bo3 bo3Var) {
        bo3Var.getClass();
        yn3Var.zzf = bo3Var;
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
                    return new xn3(null);
                }
                return new yn3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m28280F() {
        return this.zze;
    }

    /* renamed from: J */
    public final bo3 m28281J() {
        bo3 bo3Var = this.zzf;
        if (bo3Var == null) {
            return bo3.m20628J();
        }
        return bo3Var;
    }

    /* renamed from: K */
    public final mt3 m28282K() {
        return this.zzg;
    }
}
