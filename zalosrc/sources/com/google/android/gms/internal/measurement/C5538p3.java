package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p3 */
/* loaded from: classes2.dex */
public final class C5538p3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5538p3 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC5714z9 zzh = AbstractC5612t9.m29640o();

    static {
        C5538p3 c5538p3 = new C5538p3();
        zza = c5538p3;
        AbstractC5612t9.m29644v(C5538p3.class, c5538p3);
    }

    private C5538p3() {
    }

    /* renamed from: C */
    public static C5538p3 m29492C() {
        return zza;
    }

    /* renamed from: A */
    public final int m29493A() {
        return this.zzh.size();
    }

    /* renamed from: D */
    public final String m29494D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final List m29495E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final boolean m29496F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m29497G() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: H */
    public final boolean m29498H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean m29499I() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: J */
    public final int m29500J() {
        int m29472a = AbstractC5521o3.m29472a(this.zze);
        if (m29472a == 0) {
            return 1;
        }
        return m29472a;
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
                    return new C5470l3(null);
                }
                return new C5538p3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C5504n3.f32627a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
