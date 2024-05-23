package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lg */
/* loaded from: classes2.dex */
public final class C4721lg extends tu3 implements aw3 {
    private static final C4721lg zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        C4721lg c4721lg = new C4721lg();
        zzb = c4721lg;
        tu3.m26755A(C4721lg.class, c4721lg);
    }

    private C4721lg() {
    }

    /* renamed from: I */
    public static C4684kg m24270I() {
        return (C4684kg) zzb.m26772C();
    }

    /* renamed from: K */
    public static C4721lg m24272K() {
        return zzb;
    }

    /* renamed from: L */
    public static C4721lg m24273L(mt3 mt3Var) {
        return (C4721lg) tu3.m26759o(zzb, mt3Var);
    }

    /* renamed from: M */
    public static C4721lg m24274M(mt3 mt3Var, gu3 gu3Var) {
        return (C4721lg) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static /* synthetic */ void m24275P(C4721lg c4721lg, String str) {
        str.getClass();
        c4721lg.zze |= 1;
        c4721lg.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static /* synthetic */ void m24276R(C4721lg c4721lg, long j11) {
        c4721lg.zze |= 16;
        c4721lg.zzj = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static /* synthetic */ void m24277S(C4721lg c4721lg, String str) {
        str.getClass();
        c4721lg.zze |= 2;
        c4721lg.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static /* synthetic */ void m24278T(C4721lg c4721lg, long j11) {
        c4721lg.zze |= 4;
        c4721lg.zzh = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static /* synthetic */ void m24279U(C4721lg c4721lg, long j11) {
        c4721lg.zze |= 8;
        c4721lg.zzi = j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC4647jg abstractC4647jg = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C4684kg(abstractC4647jg);
                }
                return new C4721lg();
            }
            return tu3.m26770z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final long m24280F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final long m24281G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final long m24282H() {
        return this.zzj;
    }

    /* renamed from: N */
    public final String m24283N() {
        return this.zzg;
    }

    /* renamed from: O */
    public final String m24284O() {
        return this.zzf;
    }
}
