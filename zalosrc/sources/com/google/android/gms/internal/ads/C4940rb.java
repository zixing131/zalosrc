package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rb */
/* loaded from: classes2.dex */
public final class C4940rb extends tu3 implements aw3 {
    private static final C4940rb zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private mt3 zzh = mt3.f24751q;

    static {
        C4940rb c4940rb = new C4940rb();
        zzb = c4940rb;
        tu3.m26755A(C4940rb.class, c4940rb);
    }

    private C4940rb() {
    }

    /* renamed from: H */
    public static C4940rb m26059H() {
        return zzb;
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
                    return new C4903qb(null);
                }
                return new C4940rb();
            }
            return tu3.m26770z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final long m26060F() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean m26061I() {
        return (this.zze & 1) != 0;
    }
}
