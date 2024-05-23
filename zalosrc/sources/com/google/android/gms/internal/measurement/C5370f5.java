package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
/* loaded from: classes.dex */
public final class C5370f5 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5370f5 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C5370f5 c5370f5 = new C5370f5();
        zza = c5370f5;
        AbstractC5612t9.m29644v(C5370f5.class, c5370f5);
    }

    private C5370f5() {
    }

    /* renamed from: D */
    public static C5353e5 m29116D() {
        return (C5353e5) zza.m29648h();
    }

    /* renamed from: H */
    public static /* synthetic */ void m29118H(C5370f5 c5370f5, long j11) {
        c5370f5.zzd |= 1;
        c5370f5.zze = j11;
    }

    /* renamed from: I */
    public static /* synthetic */ void m29119I(C5370f5 c5370f5, String str) {
        str.getClass();
        c5370f5.zzd |= 2;
        c5370f5.zzf = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m29120J(C5370f5 c5370f5, String str) {
        str.getClass();
        c5370f5.zzd |= 4;
        c5370f5.zzg = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m29121L(C5370f5 c5370f5) {
        c5370f5.zzd &= -5;
        c5370f5.zzg = zza.zzg;
    }

    /* renamed from: M */
    public static /* synthetic */ void m29122M(C5370f5 c5370f5, long j11) {
        c5370f5.zzd |= 8;
        c5370f5.zzh = j11;
    }

    /* renamed from: N */
    public static /* synthetic */ void m29123N(C5370f5 c5370f5) {
        c5370f5.zzd &= -9;
        c5370f5.zzh = 0L;
    }

    /* renamed from: O */
    public static /* synthetic */ void m29124O(C5370f5 c5370f5, double d11) {
        c5370f5.zzd |= 32;
        c5370f5.zzj = d11;
    }

    /* renamed from: P */
    public static /* synthetic */ void m29125P(C5370f5 c5370f5) {
        c5370f5.zzd &= -33;
        c5370f5.zzj = 0.0d;
    }

    /* renamed from: A */
    public final double m29126A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final long m29127B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final long m29128C() {
        return this.zze;
    }

    /* renamed from: F */
    public final String m29129F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final String m29130G() {
        return this.zzg;
    }

    /* renamed from: Q */
    public final boolean m29131Q() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: R */
    public final boolean m29132R() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: S */
    public final boolean m29133S() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: T */
    public final boolean m29134T() {
        return (this.zzd & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5612t9
    /* renamed from: z */
    public final Object mo28921z(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C5353e5(null);
                }
                return new C5370f5();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
