package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ct */
/* loaded from: classes2.dex */
public final class C4402ct extends tu3 implements aw3 {
    private static final C4402ct zzb;
    private int zze;
    private int zzf;
    private C4550gt zzg;
    private C4660jt zzh;

    static {
        C4402ct c4402ct = new C4402ct();
        zzb = c4402ct;
        tu3.m26755A(C4402ct.class, c4402ct);
    }

    private C4402ct() {
    }

    /* renamed from: F */
    public static C4366bt m21000F() {
        return (C4366bt) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m21002H(C4402ct c4402ct, C4550gt c4550gt) {
        c4550gt.getClass();
        c4402ct.zzg = c4550gt;
        c4402ct.zze |= 2;
    }

    /* renamed from: I */
    public static /* synthetic */ void m21003I(C4402ct c4402ct, C4660jt c4660jt) {
        c4660jt.getClass();
        c4402ct.zzh = c4660jt;
        c4402ct.zze |= 4;
    }

    /* renamed from: J */
    public static /* synthetic */ void m21004J(C4402ct c4402ct, int i11) {
        c4402ct.zzf = 1;
        c4402ct.zze = 1 | c4402ct.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new C4366bt(null);
                }
                return new C4402ct();
            }
            return tu3.m26770z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C4476et.f19776a, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
