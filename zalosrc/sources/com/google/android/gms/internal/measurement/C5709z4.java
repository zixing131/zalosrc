package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z4 */
/* loaded from: classes.dex */
public final class C5709z4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5709z4 zza;
    private int zzd;
    private int zze = 1;
    private InterfaceC5714z9 zzf = AbstractC5612t9.m29640o();

    static {
        C5709z4 c5709z4 = new C5709z4();
        zza = c5709z4;
        AbstractC5612t9.m29644v(C5709z4.class, c5709z4);
    }

    private C5709z4() {
    }

    /* renamed from: A */
    public static C5675x4 m30105A() {
        return (C5675x4) zza.m29648h();
    }

    /* renamed from: C */
    public static /* synthetic */ void m30107C(C5709z4 c5709z4, C5505n4 c5505n4) {
        c5505n4.getClass();
        InterfaceC5714z9 interfaceC5714z9 = c5709z4.zzf;
        if (!interfaceC5714z9.zzc()) {
            c5709z4.zzf = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        c5709z4.zzf.add(c5505n4);
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
                    return new C5675x4(null);
                }
                return new C5709z4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", C5692y4.f32926a, "zzf", C5505n4.class});
        }
        return (byte) 1;
    }
}
