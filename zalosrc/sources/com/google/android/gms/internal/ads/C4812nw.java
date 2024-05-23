package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nw */
/* loaded from: classes2.dex */
public final class C4812nw extends tu3 implements aw3 {
    private static final C4812nw zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C4812nw c4812nw = new C4812nw();
        zzb = c4812nw;
        tu3.m26755A(C4812nw.class, c4812nw);
    }

    private C4812nw() {
    }

    /* renamed from: F */
    public static C4775mw m25022F() {
        return (C4775mw) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m25024H(C4812nw c4812nw, boolean z11) {
        c4812nw.zze |= 1;
        c4812nw.zzf = z11;
    }

    /* renamed from: I */
    public static /* synthetic */ void m25025I(C4812nw c4812nw, int i11) {
        c4812nw.zze |= 2;
        c4812nw.zzg = i11;
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
                    return new C4775mw(null);
                }
                return new C4812nw();
            }
            return tu3.m26770z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: J */
    public final boolean m25026J() {
        return this.zzf;
    }
}
