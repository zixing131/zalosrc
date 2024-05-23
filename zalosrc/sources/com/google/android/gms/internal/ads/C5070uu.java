package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uu */
/* loaded from: classes2.dex */
public final class C5070uu extends tu3 implements aw3 {
    private static final C5070uu zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5070uu c5070uu = new C5070uu();
        zzb = c5070uu;
        tu3.m26755A(C5070uu.class, c5070uu);
    }

    private C5070uu() {
    }

    /* renamed from: F */
    public static C4810nu m27051F() {
        return (C4810nu) zzb.m26772C();
    }

    /* renamed from: H */
    public static C5070uu m27053H() {
        return zzb;
    }

    /* renamed from: M */
    public static /* synthetic */ void m27054M(C5070uu c5070uu, int i11) {
        c5070uu.zzf = i11 - 1;
        c5070uu.zze |= 1;
    }

    /* renamed from: N */
    public static /* synthetic */ void m27055N(C5070uu c5070uu, int i11) {
        c5070uu.zzg = i11 - 1;
        c5070uu.zze |= 2;
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
                    return new C4810nu(null);
                }
                return new C5070uu();
            }
            return tu3.m26770z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", C4996su.f27843a, "zzg", C4885pu.f26334a});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final boolean m27056I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean m27057J() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: K */
    public final int m27058K() {
        int m25884a = AbstractC4922qu.m25884a(this.zzg);
        if (m25884a == 0) {
            return 1;
        }
        return m25884a;
    }

    /* renamed from: L */
    public final int m27059L() {
        int m26754a = AbstractC5033tu.m26754a(this.zzf);
        if (m26754a == 0) {
            return 1;
        }
        return m26754a;
    }
}
