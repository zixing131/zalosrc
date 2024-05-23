package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k5 */
/* loaded from: classes2.dex */
public final class C5455k5 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5455k5 zza;
    private int zzd;
    private String zze = "";
    private InterfaceC5714z9 zzf = AbstractC5612t9.m29640o();

    static {
        C5455k5 c5455k5 = new C5455k5();
        zza = c5455k5;
        AbstractC5612t9.m29644v(C5455k5.class, c5455k5);
    }

    private C5455k5() {
    }

    /* renamed from: B */
    public final String m29360B() {
        return this.zze;
    }

    /* renamed from: C */
    public final List m29361C() {
        return this.zzf;
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
                    return new C5438j5(null);
                }
                return new C5455k5();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C5574r5.class});
        }
        return (byte) 1;
    }
}
