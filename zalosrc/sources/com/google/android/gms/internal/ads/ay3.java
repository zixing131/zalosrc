package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ay3 extends tu3 implements aw3 {
    private static final ay3 zzb;
    private int zze;
    private String zzf = "";

    static {
        ay3 ay3Var = new ay3();
        zzb = ay3Var;
        tu3.m26755A(ay3.class, ay3Var);
    }

    private ay3() {
    }

    /* renamed from: F */
    public static zx3 m20348F() {
        return (zx3) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m20350H(ay3 ay3Var, String str) {
        ay3Var.zze |= 1;
        ay3Var.zzf = str;
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
                    return new zx3(null);
                }
                return new ay3();
            }
            return tu3.m26770z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
