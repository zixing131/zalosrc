package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ig */
/* loaded from: classes2.dex */
public final class C4611ig extends tu3 implements aw3 {
    private static final C4611ig zzb;
    private int zze;
    private C4721lg zzf;
    private mt3 zzg;
    private mt3 zzh;

    static {
        C4611ig c4611ig = new C4611ig();
        zzb = c4611ig;
        tu3.m26755A(C4611ig.class, c4611ig);
    }

    private C4611ig() {
        mt3 mt3Var = mt3.f24751q;
        this.zzg = mt3Var;
        this.zzh = mt3Var;
    }

    /* renamed from: G */
    public static C4611ig m23243G(mt3 mt3Var, gu3 gu3Var) {
        return (C4611ig) tu3.m26761q(zzb, mt3Var, gu3Var);
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
                    return new C4574hg(null);
                }
                return new C4611ig();
            }
            return tu3.m26770z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: H */
    public final C4721lg m23244H() {
        C4721lg c4721lg = this.zzf;
        if (c4721lg == null) {
            return C4721lg.m24272K();
        }
        return c4721lg;
    }

    /* renamed from: I */
    public final mt3 m23245I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final mt3 m23246J() {
        return this.zzg;
    }
}
