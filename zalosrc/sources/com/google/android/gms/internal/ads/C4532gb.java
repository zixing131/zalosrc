package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gb */
/* loaded from: classes2.dex */
public final class C4532gb extends tu3 implements aw3 {
    private static final C4532gb zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        C4532gb c4532gb = new C4532gb();
        zzb = c4532gb;
        tu3.m26755A(C4532gb.class, c4532gb);
    }

    private C4532gb() {
    }

    /* renamed from: F */
    public static C4495fb m22396F() {
        return (C4495fb) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m22398H(C4532gb c4532gb, long j11) {
        c4532gb.zze |= 1;
        c4532gb.zzf = j11;
    }

    /* renamed from: I */
    public static /* synthetic */ void m22399I(C4532gb c4532gb, long j11) {
        c4532gb.zze |= 4;
        c4532gb.zzh = j11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m22400J(C4532gb c4532gb, long j11) {
        c4532gb.zze |= 8;
        c4532gb.zzi = j11;
    }

    /* renamed from: K */
    public static /* synthetic */ void m22401K(C4532gb c4532gb, long j11) {
        c4532gb.zze |= 16;
        c4532gb.zzj = j11;
    }

    /* renamed from: L */
    public static /* synthetic */ void m22402L(C4532gb c4532gb, long j11) {
        c4532gb.zze |= 32;
        c4532gb.zzk = j11;
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
                    return new C4495fb(null);
                }
                return new C4532gb();
            }
            return tu3.m26770z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
