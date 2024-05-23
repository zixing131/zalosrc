package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vb */
/* loaded from: classes2.dex */
public final class C5088vb extends tu3 implements aw3 {
    private static final C5088vb zzb;
    private int zze;
    private cv3 zzf = tu3.m26767w();
    private mt3 zzg = mt3.f24751q;
    private int zzh = 1;
    private int zzi = 1;

    static {
        C5088vb c5088vb = new C5088vb();
        zzb = c5088vb;
        tu3.m26755A(C5088vb.class, c5088vb);
    }

    private C5088vb() {
    }

    /* renamed from: F */
    public static C5051ub m27195F() {
        return (C5051ub) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m27197H(C5088vb c5088vb, mt3 mt3Var) {
        cv3 cv3Var = c5088vb.zzf;
        if (!cv3Var.zzc()) {
            c5088vb.zzf = tu3.m26768x(cv3Var);
        }
        c5088vb.zzf.add(mt3Var);
    }

    /* renamed from: I */
    public static /* synthetic */ void m27198I(C5088vb c5088vb, mt3 mt3Var) {
        c5088vb.zze |= 1;
        c5088vb.zzg = mt3Var;
    }

    /* renamed from: J */
    public static /* synthetic */ void m27199J(C5088vb c5088vb, int i11) {
        c5088vb.zzi = i11 - 1;
        c5088vb.zze |= 4;
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
                    return new C5051ub(null);
                }
                return new C5088vb();
            }
            return tu3.m26770z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C4866pb.f26149a, "zzi", C4791nb.f25122a});
        }
        return (byte) 1;
    }
}
