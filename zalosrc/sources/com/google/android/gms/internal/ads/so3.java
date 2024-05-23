package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class so3 extends tu3 implements aw3 {
    private static final so3 zzb;
    private int zze;
    private int zzf;

    static {
        so3 so3Var = new so3();
        zzb = so3Var;
        tu3.m26755A(so3.class, so3Var);
    }

    private so3() {
    }

    /* renamed from: G */
    public static ro3 m26377G() {
        return (ro3) zzb.m26772C();
    }

    /* renamed from: I */
    public static so3 m26379I() {
        return zzb;
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
                    return new ro3(null);
                }
                return new so3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m26382F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final int m26383K() {
        int m23312b = io3.m23312b(this.zze);
        if (m23312b == 0) {
            return 1;
        }
        return m23312b;
    }
}
