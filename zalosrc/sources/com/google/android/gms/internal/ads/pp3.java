package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class pp3 extends tu3 implements aw3 {
    private static final pp3 zzb;
    private String zze = "";
    private mt3 zzf = mt3.f24751q;
    private int zzg;

    static {
        pp3 pp3Var = new pp3();
        zzb = pp3Var;
        tu3.m26755A(pp3.class, pp3Var);
    }

    private pp3() {
    }

    /* renamed from: F */
    public static op3 m25504F() {
        return (op3) zzb.m26772C();
    }

    /* renamed from: H */
    public static pp3 m25506H() {
        return zzb;
    }

    /* renamed from: K */
    public static /* synthetic */ void m25507K(pp3 pp3Var, String str) {
        str.getClass();
        pp3Var.zze = str;
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
                    return new op3(null);
                }
                return new pp3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final mt3 m25510I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String m25511J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int m25512M() {
        int m26154b = rq3.m26154b(this.zzg);
        if (m26154b == 0) {
            return 1;
        }
        return m26154b;
    }
}
