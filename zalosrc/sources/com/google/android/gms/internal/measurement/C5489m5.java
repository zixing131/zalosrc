package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* loaded from: classes.dex */
public final class C5489m5 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5489m5 zza;
    private int zzd;
    private InterfaceC5714z9 zze = AbstractC5612t9.m29640o();
    private C5421i5 zzf;

    static {
        C5489m5 c5489m5 = new C5489m5();
        zza = c5489m5;
        AbstractC5612t9.m29644v(C5489m5.class, c5489m5);
    }

    private C5489m5() {
    }

    /* renamed from: A */
    public final C5421i5 m29439A() {
        C5421i5 c5421i5 = this.zzf;
        if (c5421i5 == null) {
            return C5421i5.m29207C();
        }
        return c5421i5;
    }

    /* renamed from: C */
    public final List m29440C() {
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
                    return new C5472l5(null);
                }
                return new C5489m5();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C5574r5.class, "zzf"});
        }
        return (byte) 1;
    }
}
