package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class iq3 extends tu3 implements aw3 {
    private static final iq3 zzb;
    private String zze = "";

    static {
        iq3 iq3Var = new iq3();
        zzb = iq3Var;
        tu3.m26755A(iq3.class, iq3Var);
    }

    private iq3() {
    }

    /* renamed from: G */
    public static iq3 m23343G() {
        return zzb;
    }

    /* renamed from: H */
    public static iq3 m23344H(mt3 mt3Var, gu3 gu3Var) {
        return (iq3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    gq3 gq3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new hq3(gq3Var);
                }
                return new iq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final String m23345I() {
        return this.zze;
    }
}
