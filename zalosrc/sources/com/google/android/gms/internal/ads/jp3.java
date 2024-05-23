package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class jp3 extends tu3 implements aw3 {
    private static final jp3 zzb;
    private String zze = "";
    private mt3 zzf = mt3.f24751q;
    private int zzg;

    static {
        jp3 jp3Var = new jp3();
        zzb = jp3Var;
        tu3.m26755A(jp3.class, jp3Var);
    }

    private jp3() {
    }

    /* renamed from: F */
    public static ip3 m23711F() {
        return (ip3) zzb.m26772C();
    }

    /* renamed from: H */
    public static jp3 m23713H() {
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
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ip3(null);
                }
                return new jp3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final mt3 m23717I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String m23718J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int m23719M() {
        int i11 = this.zzg;
        int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }
}
