package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class lq3 extends tu3 implements aw3 {
    private static final lq3 zzb;
    private int zze;
    private pq3 zzf;

    static {
        lq3 lq3Var = new lq3();
        zzb = lq3Var;
        tu3.m26755A(lq3.class, lq3Var);
    }

    private lq3() {
    }

    /* renamed from: G */
    public static kq3 m24344G() {
        return (kq3) zzb.m26772C();
    }

    /* renamed from: I */
    public static lq3 m24346I(mt3 mt3Var, gu3 gu3Var) {
        return (lq3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static /* synthetic */ void m24348L(lq3 lq3Var, pq3 pq3Var) {
        pq3Var.getClass();
        lq3Var.zzf = pq3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    jq3 jq3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new kq3(jq3Var);
                }
                return new lq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m24349F() {
        return this.zze;
    }

    /* renamed from: J */
    public final pq3 m24350J() {
        pq3 pq3Var = this.zzf;
        if (pq3Var == null) {
            return pq3.m25525G();
        }
        return pq3Var;
    }
}
