package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fv */
/* loaded from: classes2.dex */
public final class C4515fv extends tu3 implements aw3 {
    private static final C4515fv zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private int zzm;
    private cv3 zzf = tu3.m26767w();
    private String zzj = "";
    private String zzk = "";

    static {
        C4515fv c4515fv = new C4515fv();
        zzb = c4515fv;
        tu3.m26755A(C4515fv.class, c4515fv);
    }

    private C4515fv() {
    }

    /* renamed from: F */
    public static C4331av m22182F() {
        return (C4331av) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m22184H(C4515fv c4515fv, Iterable iterable) {
        cv3 cv3Var = c4515fv.zzf;
        if (!cv3Var.zzc()) {
            c4515fv.zzf = tu3.m26768x(cv3Var);
        }
        vs3.m27345i(iterable, c4515fv.zzf);
    }

    /* renamed from: I */
    public static /* synthetic */ void m22185I(C4515fv c4515fv, int i11) {
        c4515fv.zze |= 1;
        c4515fv.zzg = i11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m22186J(C4515fv c4515fv, int i11) {
        c4515fv.zze |= 2;
        c4515fv.zzh = i11;
    }

    /* renamed from: K */
    public static /* synthetic */ void m22187K(C4515fv c4515fv, long j11) {
        c4515fv.zze |= 4;
        c4515fv.zzi = j11;
    }

    /* renamed from: L */
    public static /* synthetic */ void m22188L(C4515fv c4515fv, String str) {
        str.getClass();
        c4515fv.zze |= 8;
        c4515fv.zzj = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m22189M(C4515fv c4515fv, String str) {
        str.getClass();
        c4515fv.zze |= 16;
        c4515fv.zzk = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m22190N(C4515fv c4515fv, long j11) {
        c4515fv.zze |= 32;
        c4515fv.zzl = j11;
    }

    /* renamed from: O */
    public static /* synthetic */ void m22191O(C4515fv c4515fv, int i11) {
        c4515fv.zze |= 64;
        c4515fv.zzm = i11;
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
                    return new C4331av(null);
                }
                return new C4515fv();
            }
            return tu3.m26770z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", C5256zu.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
