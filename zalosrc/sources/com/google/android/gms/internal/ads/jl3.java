package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class jl3 extends tu3 implements aw3 {
    private static final jl3 zzb;
    private int zze;
    private ml3 zzf;

    static {
        jl3 jl3Var = new jl3();
        zzb = jl3Var;
        tu3.m26755A(jl3.class, jl3Var);
    }

    private jl3() {
    }

    /* renamed from: G */
    public static hl3 m23631G() {
        return (hl3) zzb.m26772C();
    }

    /* renamed from: I */
    public static jl3 m23633I(mt3 mt3Var, gu3 gu3Var) {
        return (jl3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m23635L(jl3 jl3Var, ml3 ml3Var) {
        ml3Var.getClass();
        jl3Var.zzf = ml3Var;
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
                    return new hl3(null);
                }
                return new jl3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m23636F() {
        return this.zze;
    }

    /* renamed from: J */
    public final ml3 m23637J() {
        ml3 ml3Var = this.zzf;
        if (ml3Var == null) {
            return ml3.m24625I();
        }
        return ml3Var;
    }
}
