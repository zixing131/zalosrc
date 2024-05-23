package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rv */
/* loaded from: classes2.dex */
public final class C4960rv extends tu3 implements aw3 {
    private static final C4960rv zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C4960rv c4960rv = new C4960rv();
        zzb = c4960rv;
        tu3.m26755A(C4960rv.class, c4960rv);
    }

    private C4960rv() {
    }

    /* renamed from: F */
    public static C4923qv m26191F() {
        return (C4923qv) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m26193H(C4960rv c4960rv, int i11) {
        c4960rv.zze |= 1;
        c4960rv.zzf = i11;
    }

    /* renamed from: I */
    public static /* synthetic */ void m26194I(C4960rv c4960rv, int i11) {
        c4960rv.zze |= 2;
        c4960rv.zzg = i11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m26195J(C4960rv c4960rv, int i11) {
        c4960rv.zze |= 4;
        c4960rv.zzh = i11;
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
                    return new C4923qv(null);
                }
                return new C4960rv();
            }
            return tu3.m26770z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
