package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gt */
/* loaded from: classes2.dex */
public final class C4550gt extends tu3 implements aw3 {
    private static final C4550gt zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C4550gt c4550gt = new C4550gt();
        zzb = c4550gt;
        tu3.m26755A(C4550gt.class, c4550gt);
    }

    private C4550gt() {
    }

    /* renamed from: F */
    public static C4513ft m22518F() {
        return (C4513ft) zzb.m26772C();
    }

    /* renamed from: H */
    public static C4550gt m22520H() {
        return zzb;
    }

    /* renamed from: I */
    public static /* synthetic */ void m22521I(C4550gt c4550gt, boolean z11) {
        c4550gt.zze |= 1;
        c4550gt.zzf = z11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m22522J(C4550gt c4550gt, int i11) {
        c4550gt.zze |= 2;
        c4550gt.zzg = i11;
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
                    return new C4513ft(null);
                }
                return new C4550gt();
            }
            return tu3.m26770z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
