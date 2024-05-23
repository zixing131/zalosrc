package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.at */
/* loaded from: classes2.dex */
public final class C4329at extends tu3 implements aw3 {
    private static final C4329at zzb;
    private int zze;
    private int zzf;
    private C4958rt zzh;
    private C5032tt zzi;
    private C5106vt zzk;
    private C4589hv zzl;
    private C5145wu zzm;
    private C4698ku zzn;
    private C4773mu zzo;
    private int zzg = 1000;
    private cv3 zzj = tu3.m26767w();
    private cv3 zzp = tu3.m26767w();

    static {
        C4329at c4329at = new C4329at();
        zzb = c4329at;
        tu3.m26755A(C4329at.class, c4329at);
    }

    private C4329at() {
    }

    /* renamed from: G */
    public static C4329at m20234G() {
        return zzb;
    }

    /* renamed from: I */
    public static /* synthetic */ void m20235I(C4329at c4329at, EnumC5180xs enumC5180xs) {
        c4329at.zzf = enumC5180xs.m28005b();
        c4329at.zze |= 1;
    }

    /* renamed from: J */
    public static /* synthetic */ void m20236J(C4329at c4329at, C5032tt c5032tt) {
        c5032tt.getClass();
        c4329at.zzi = c5032tt;
        c4329at.zze |= 8;
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
                    return new C5254zs(null);
                }
                return new C4329at();
            }
            return tu3.m26770z(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", EnumC5180xs.m28004d(), "zzg", C4440du.f19419a, "zzh", "zzi", "zzj", C4884pt.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C5034tv.class});
        }
        return (byte) 1;
    }

    /* renamed from: H */
    public final C5032tt m20237H() {
        C5032tt c5032tt = this.zzi;
        if (c5032tt == null) {
            return C5032tt.m26737G();
        }
        return c5032tt;
    }
}
