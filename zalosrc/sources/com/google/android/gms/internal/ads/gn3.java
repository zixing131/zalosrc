package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gn3 extends tu3 implements aw3 {
    private static final gn3 zzb;
    private int zze;
    private mt3 zzf = mt3.f24751q;

    static {
        gn3 gn3Var = new gn3();
        zzb = gn3Var;
        tu3.m26755A(gn3.class, gn3Var);
    }

    private gn3() {
    }

    /* renamed from: G */
    public static fn3 m22486G() {
        return (fn3) zzb.m26772C();
    }

    /* renamed from: I */
    public static gn3 m22488I(mt3 mt3Var, gu3 gu3Var) {
        return (gn3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    en3 en3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new fn3(en3Var);
                }
                return new gn3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m22491F() {
        return this.zze;
    }

    /* renamed from: J */
    public final mt3 m22492J() {
        return this.zzf;
    }
}
