package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* loaded from: classes2.dex */
public final class C5437j4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5437j4 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C5437j4 c5437j4 = new C5437j4();
        zza = c5437j4;
        AbstractC5612t9.m29644v(C5437j4.class, c5437j4);
    }

    private C5437j4() {
    }

    /* renamed from: C */
    public static C5420i4 m29272C() {
        return (C5420i4) zza.m29648h();
    }

    /* renamed from: E */
    public static /* synthetic */ void m29274E(C5437j4 c5437j4, int i11) {
        c5437j4.zzd |= 1;
        c5437j4.zze = i11;
    }

    /* renamed from: F */
    public static /* synthetic */ void m29275F(C5437j4 c5437j4, long j11) {
        c5437j4.zzd |= 2;
        c5437j4.zzf = j11;
    }

    /* renamed from: A */
    public final int m29276A() {
        return this.zze;
    }

    /* renamed from: B */
    public final long m29277B() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean m29278G() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: H */
    public final boolean m29279H() {
        return (this.zzd & 1) != 0;
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
                    return new C5420i4(null);
                }
                return new C5437j4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
