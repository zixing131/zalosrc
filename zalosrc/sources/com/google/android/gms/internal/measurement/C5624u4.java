package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.u4 */
/* loaded from: classes.dex */
public final class C5624u4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5624u4 zza;
    private InterfaceC5714z9 zzd = AbstractC5612t9.m29640o();

    static {
        C5624u4 c5624u4 = new C5624u4();
        zza = c5624u4;
        AbstractC5612t9.m29644v(C5624u4.class, c5624u4);
    }

    private C5624u4() {
    }

    /* renamed from: A */
    public static C5607t4 m29671A() {
        return (C5607t4) zza.m29648h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m29673E(C5624u4 c5624u4, C5658w4 c5658w4) {
        c5658w4.getClass();
        InterfaceC5714z9 interfaceC5714z9 = c5624u4.zzd;
        if (!interfaceC5714z9.zzc()) {
            c5624u4.zzd = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        c5624u4.zzd.add(c5658w4);
    }

    /* renamed from: C */
    public final C5658w4 m29674C(int i11) {
        return (C5658w4) this.zzd.get(0);
    }

    /* renamed from: D */
    public final List m29675D() {
        return this.zzd;
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
                    return new C5607t4(abstractC5318c4);
                }
                return new C5624u4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C5658w4.class});
        }
        return (byte) 1;
    }
}
