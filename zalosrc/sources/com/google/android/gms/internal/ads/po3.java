package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class po3 extends tu3 implements aw3 {
    private static final po3 zzb;
    private so3 zze;
    private int zzf;
    private int zzg;

    static {
        po3 po3Var = new po3();
        zzb = po3Var;
        tu3.m26755A(po3.class, po3Var);
    }

    private po3() {
    }

    /* renamed from: G */
    public static oo3 m25494G() {
        return (oo3) zzb.m26772C();
    }

    /* renamed from: I */
    public static po3 m25496I() {
        return zzb;
    }

    /* renamed from: J */
    public static po3 m25497J(mt3 mt3Var, gu3 gu3Var) {
        return (po3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m25498L(po3 po3Var, so3 so3Var) {
        so3Var.getClass();
        po3Var.zze = so3Var;
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
                    return new oo3(null);
                }
                return new po3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m25500F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final so3 m25501K() {
        so3 so3Var = this.zze;
        if (so3Var == null) {
            return so3.m26379I();
        }
        return so3Var;
    }
}
