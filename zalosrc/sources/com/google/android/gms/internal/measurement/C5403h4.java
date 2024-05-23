package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h4 */
/* loaded from: classes.dex */
public final class C5403h4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5403h4 zza;
    private int zzd;
    private int zze;
    private C5302b5 zzf;
    private C5302b5 zzg;
    private boolean zzh;

    static {
        C5403h4 c5403h4 = new C5403h4();
        zza = c5403h4;
        AbstractC5612t9.m29644v(C5403h4.class, c5403h4);
    }

    private C5403h4() {
    }

    /* renamed from: B */
    public static C5386g4 m29168B() {
        return (C5386g4) zza.m29648h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m29170F(C5403h4 c5403h4, int i11) {
        c5403h4.zzd |= 1;
        c5403h4.zze = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m29171G(C5403h4 c5403h4, C5302b5 c5302b5) {
        c5302b5.getClass();
        c5403h4.zzf = c5302b5;
        c5403h4.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m29172H(C5403h4 c5403h4, C5302b5 c5302b5) {
        c5403h4.zzg = c5302b5;
        c5403h4.zzd |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m29173I(C5403h4 c5403h4, boolean z11) {
        c5403h4.zzd |= 8;
        c5403h4.zzh = z11;
    }

    /* renamed from: A */
    public final int m29174A() {
        return this.zze;
    }

    /* renamed from: D */
    public final C5302b5 m29175D() {
        C5302b5 c5302b5 = this.zzf;
        if (c5302b5 == null) {
            return C5302b5.m28927G();
        }
        return c5302b5;
    }

    /* renamed from: E */
    public final C5302b5 m29176E() {
        C5302b5 c5302b5 = this.zzg;
        if (c5302b5 == null) {
            return C5302b5.m28927G();
        }
        return c5302b5;
    }

    /* renamed from: J */
    public final boolean m29177J() {
        return this.zzh;
    }

    /* renamed from: L */
    public final boolean m29178L() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final boolean m29179M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final boolean m29180N() {
        return (this.zzd & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC5612t9
    /* renamed from: z */
    public final Object mo28921z(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC5318c4 abstractC5318c4 = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C5386g4(abstractC5318c4);
                }
                return new C5403h4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
