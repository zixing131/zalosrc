package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class uq3 extends tu3 implements aw3 {
    private static final uq3 zzb;
    private String zze = "";
    private cv3 zzf = tu3.m26767w();

    static {
        uq3 uq3Var = new uq3();
        zzb = uq3Var;
        tu3.m26755A(uq3.class, uq3Var);
    }

    private uq3() {
    }

    /* renamed from: G */
    public static uq3 m27044G() {
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
                    return new tq3(null);
                }
                return new uq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", sp3.class});
        }
        return (byte) 1;
    }

    /* renamed from: H */
    public final List m27045H() {
        return this.zzf;
    }
}
