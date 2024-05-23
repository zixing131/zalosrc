package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class eo3 extends tu3 implements aw3 {
    private static final eo3 zzb;
    private int zze;
    private int zzf;
    private mt3 zzg = mt3.f24751q;

    static {
        eo3 eo3Var = new eo3();
        zzb = eo3Var;
        tu3.m26755A(eo3.class, eo3Var);
    }

    private eo3() {
    }

    /* renamed from: F */
    public static do3 m21768F() {
        return (do3) zzb.m26772C();
    }

    /* renamed from: H */
    public static eo3 m21770H() {
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
                    return new do3(null);
                }
                return new eo3();
            }
            return tu3.m26770z(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final mt3 m21774I() {
        return this.zzg;
    }

    /* renamed from: K */
    public final int m21775K() {
        int i11 = this.zze;
        int i12 = i11 != 0 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    /* renamed from: L */
    public final int m21776L() {
        int m23312b = io3.m23312b(this.zzf);
        if (m23312b == 0) {
            return 1;
        }
        return m23312b;
    }
}
