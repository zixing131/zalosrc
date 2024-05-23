package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class an3 extends tu3 implements aw3 {
    private static final an3 zzb;
    private int zze;
    private mt3 zzf = mt3.f24751q;

    static {
        an3 an3Var = new an3();
        zzb = an3Var;
        tu3.m26755A(an3.class, an3Var);
    }

    private an3() {
    }

    /* renamed from: G */
    public static zm3 m20187G() {
        return (zm3) zzb.m26772C();
    }

    /* renamed from: I */
    public static an3 m20189I(mt3 mt3Var, gu3 gu3Var) {
        return (an3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    ym3 ym3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zm3(ym3Var);
                }
                return new an3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m20192F() {
        return this.zze;
    }

    /* renamed from: J */
    public final mt3 m20193J() {
        return this.zzf;
    }
}
