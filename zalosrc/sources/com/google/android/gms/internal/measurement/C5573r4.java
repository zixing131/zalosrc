package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* loaded from: classes.dex */
public final class C5573r4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5573r4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C5369f4 zzg;

    static {
        C5573r4 c5573r4 = new C5573r4();
        zza = c5573r4;
        AbstractC5612t9.m29644v(C5573r4.class, c5573r4);
    }

    private C5573r4() {
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
                    return new C5556q4(null);
                }
                return new C5573r4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
