package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mb */
/* loaded from: classes2.dex */
public final class C4754mb extends tu3 implements aw3 {
    private static final C4754mb zzb;
    private int zze;
    private mt3 zzf;
    private mt3 zzg;
    private mt3 zzh;
    private mt3 zzi;

    static {
        C4754mb c4754mb = new C4754mb();
        zzb = c4754mb;
        tu3.m26755A(C4754mb.class, c4754mb);
    }

    private C4754mb() {
        mt3 mt3Var = mt3.f24751q;
        this.zzf = mt3Var;
        this.zzg = mt3Var;
        this.zzh = mt3Var;
        this.zzi = mt3Var;
    }

    /* renamed from: F */
    public static C4716lb m24530F() {
        return (C4716lb) zzb.m26772C();
    }

    /* renamed from: H */
    public static C4754mb m24532H(byte[] bArr, gu3 gu3Var) {
        return (C4754mb) tu3.m26763s(zzb, bArr, gu3Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m24533M(C4754mb c4754mb, mt3 mt3Var) {
        c4754mb.zze |= 1;
        c4754mb.zzf = mt3Var;
    }

    /* renamed from: N */
    public static /* synthetic */ void m24534N(C4754mb c4754mb, mt3 mt3Var) {
        c4754mb.zze |= 2;
        c4754mb.zzg = mt3Var;
    }

    /* renamed from: O */
    public static /* synthetic */ void m24535O(C4754mb c4754mb, mt3 mt3Var) {
        c4754mb.zze |= 4;
        c4754mb.zzh = mt3Var;
    }

    /* renamed from: P */
    public static /* synthetic */ void m24536P(C4754mb c4754mb, mt3 mt3Var) {
        c4754mb.zze |= 8;
        c4754mb.zzi = mt3Var;
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
                    return new C4716lb(null);
                }
                return new C4754mb();
            }
            return tu3.m26770z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final mt3 m24537I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final mt3 m24538J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final mt3 m24539K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final mt3 m24540L() {
        return this.zzh;
    }
}
