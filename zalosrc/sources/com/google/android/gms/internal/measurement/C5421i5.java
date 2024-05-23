package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i5 */
/* loaded from: classes.dex */
public final class C5421i5 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5421i5 zza;
    private InterfaceC5714z9 zzd = AbstractC5612t9.m29640o();

    static {
        C5421i5 c5421i5 = new C5421i5();
        zza = c5421i5;
        AbstractC5612t9.m29644v(C5421i5.class, c5421i5);
    }

    private C5421i5() {
    }

    /* renamed from: C */
    public static C5421i5 m29207C() {
        return zza;
    }

    /* renamed from: A */
    public final int m29208A() {
        return this.zzd.size();
    }

    /* renamed from: D */
    public final List m29209D() {
        return this.zzd;
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
                    return new C5404h5(null);
                }
                return new C5421i5();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C5455k5.class});
        }
        return (byte) 1;
    }
}
