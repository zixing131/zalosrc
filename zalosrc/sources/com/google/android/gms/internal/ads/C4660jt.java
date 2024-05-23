package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jt */
/* loaded from: classes2.dex */
public final class C4660jt extends tu3 implements aw3 {
    private static final C4660jt zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C4660jt c4660jt = new C4660jt();
        zzb = c4660jt;
        tu3.m26755A(C4660jt.class, c4660jt);
    }

    private C4660jt() {
    }

    /* renamed from: F */
    public static C4587ht m23740F() {
        return (C4587ht) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m23742H(C4660jt c4660jt, boolean z11) {
        c4660jt.zze |= 1;
        c4660jt.zzf = z11;
    }

    /* renamed from: I */
    public static /* synthetic */ void m23743I(C4660jt c4660jt, boolean z11) {
        c4660jt.zze |= 2;
        c4660jt.zzg = z11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m23744J(C4660jt c4660jt, int i11) {
        c4660jt.zze |= 4;
        c4660jt.zzh = i11;
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
                    return new C4587ht(null);
                }
                return new C4660jt();
            }
            return tu3.m26770z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
