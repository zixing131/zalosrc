package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class bo3 extends tu3 implements aw3 {
    private static final bo3 zzb;
    private int zze;
    private vn3 zzf;
    private mt3 zzg;
    private mt3 zzh;

    static {
        bo3 bo3Var = new bo3();
        zzb = bo3Var;
        tu3.m26755A(bo3.class, bo3Var);
    }

    private bo3() {
        mt3 mt3Var = mt3.f24751q;
        this.zzg = mt3Var;
        this.zzh = mt3Var;
    }

    /* renamed from: H */
    public static ao3 m20626H() {
        return (ao3) zzb.m26772C();
    }

    /* renamed from: J */
    public static bo3 m20628J() {
        return zzb;
    }

    /* renamed from: K */
    public static bo3 m20629K(mt3 mt3Var, gu3 gu3Var) {
        return (bo3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* renamed from: O */
    public static /* synthetic */ void m20631O(bo3 bo3Var, vn3 vn3Var) {
        vn3Var.getClass();
        bo3Var.zzf = vn3Var;
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
                    return new ao3(null);
                }
                return new bo3();
            }
            return tu3.m26770z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m20634F() {
        return this.zze;
    }

    /* renamed from: G */
    public final vn3 m20635G() {
        vn3 vn3Var = this.zzf;
        if (vn3Var == null) {
            return vn3.m27316I();
        }
        return vn3Var;
    }

    /* renamed from: L */
    public final mt3 m20636L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final mt3 m20637M() {
        return this.zzh;
    }
}
