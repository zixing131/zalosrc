package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gp3 extends tu3 implements aw3 {
    private static final gp3 zzb;
    private int zze;
    private ap3 zzf;
    private mt3 zzg = mt3.f24751q;

    static {
        gp3 gp3Var = new gp3();
        zzb = gp3Var;
        tu3.m26755A(gp3.class, gp3Var);
    }

    private gp3() {
    }

    /* renamed from: H */
    public static fp3 m22498H() {
        return (fp3) zzb.m26772C();
    }

    /* renamed from: J */
    public static gp3 m22500J() {
        return zzb;
    }

    /* renamed from: K */
    public static gp3 m22501K(mt3 mt3Var, gu3 gu3Var) {
        return (gp3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m22503N(gp3 gp3Var, ap3 ap3Var) {
        ap3Var.getClass();
        gp3Var.zzf = ap3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    ep3 ep3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new fp3(ep3Var);
                }
                return new gp3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m22505F() {
        return this.zze;
    }

    /* renamed from: G */
    public final ap3 m22506G() {
        ap3 ap3Var = this.zzf;
        if (ap3Var == null) {
            return ap3.m20213H();
        }
        return ap3Var;
    }

    /* renamed from: L */
    public final mt3 m22507L() {
        return this.zzg;
    }

    /* renamed from: P */
    public final boolean m22508P() {
        return this.zzf != null;
    }
}
