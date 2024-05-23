package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* loaded from: classes.dex */
public final class C5606t3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5606t3 zza;
    private int zzd;
    private String zze = "";
    private InterfaceC5714z9 zzf = AbstractC5612t9.m29640o();
    private boolean zzg;

    static {
        C5606t3 c5606t3 = new C5606t3();
        zza = c5606t3;
        AbstractC5612t9.m29644v(C5606t3.class, c5606t3);
    }

    private C5606t3() {
    }

    /* renamed from: B */
    public final String m29607B() {
        return this.zze;
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
                    return new C5589s3(null);
                }
                return new C5606t3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C5708z3.class, "zzg"});
        }
        return (byte) 1;
    }
}
