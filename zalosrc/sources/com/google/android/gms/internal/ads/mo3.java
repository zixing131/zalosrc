package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class mo3 extends tu3 implements aw3 {
    private static final mo3 zzb;
    private int zze;
    private so3 zzf;
    private mt3 zzg = mt3.f24751q;

    static {
        mo3 mo3Var = new mo3();
        zzb = mo3Var;
        tu3.m26755A(mo3.class, mo3Var);
    }

    private mo3() {
    }

    /* renamed from: G */
    public static ko3 m24654G() {
        return (ko3) zzb.m26772C();
    }

    /* renamed from: I */
    public static mo3 m24656I() {
        return zzb;
    }

    /* renamed from: J */
    public static mo3 m24657J(mt3 mt3Var, gu3 gu3Var) {
        return (mo3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m24659N(mo3 mo3Var, so3 so3Var) {
        so3Var.getClass();
        mo3Var.zzf = so3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    jo3 jo3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ko3(jo3Var);
                }
                return new mo3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m24661F() {
        return this.zze;
    }

    /* renamed from: K */
    public final so3 m24662K() {
        so3 so3Var = this.zzf;
        if (so3Var == null) {
            return so3.m26379I();
        }
        return so3Var;
    }

    /* renamed from: L */
    public final mt3 m24663L() {
        return this.zzg;
    }
}
