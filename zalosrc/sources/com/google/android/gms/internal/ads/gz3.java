package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gz3 extends tu3 implements aw3 {
    private static final gz3 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        gz3 gz3Var = new gz3();
        zzb = gz3Var;
        tu3.m26755A(gz3.class, gz3Var);
    }

    private gz3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    ox3 ox3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new fz3(ox3Var);
                }
                return new gz3();
            }
            return tu3.m26770z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
