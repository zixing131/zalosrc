package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ap3 extends tu3 implements aw3 {
    private static final ap3 zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ap3 ap3Var = new ap3();
        zzb = ap3Var;
        tu3.m26755A(ap3.class, ap3Var);
    }

    private ap3() {
    }

    /* renamed from: F */
    public static zo3 m20211F() {
        return (zo3) zzb.m26772C();
    }

    /* renamed from: H */
    public static ap3 m20213H() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    yo3 yo3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zo3(yo3Var);
                }
                return new ap3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final int m20217I() {
        int i11 = this.zzg;
        int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    /* renamed from: J */
    public final int m20218J() {
        int i11 = this.zzf;
        int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    /* renamed from: K */
    public final int m20219K() {
        int i11 = this.zze;
        int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }
}
