package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* loaded from: classes.dex */
public final class C5708z3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5708z3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C5708z3 c5708z3 = new C5708z3();
        zza = c5708z3;
        AbstractC5612t9.m29644v(C5708z3.class, c5708z3);
    }

    private C5708z3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC5612t9
    /* renamed from: z */
    public final Object mo28921z(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC5555q3 abstractC5555q3 = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C5691y3(abstractC5555q3);
                }
                return new C5708z3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
