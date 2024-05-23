package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* loaded from: classes2.dex */
public final class C5505n4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5505n4 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C5505n4 c5505n4 = new C5505n4();
        zza = c5505n4;
        AbstractC5612t9.m29644v(C5505n4.class, c5505n4);
    }

    private C5505n4() {
    }

    /* renamed from: A */
    public static C5488m4 m29460A() {
        return (C5488m4) zza.m29648h();
    }

    /* renamed from: C */
    public static /* synthetic */ void m29462C(C5505n4 c5505n4, String str) {
        str.getClass();
        c5505n4.zzd |= 1;
        c5505n4.zze = str;
    }

    /* renamed from: D */
    public static /* synthetic */ void m29463D(C5505n4 c5505n4, long j11) {
        c5505n4.zzd |= 2;
        c5505n4.zzf = j11;
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
                    return new C5488m4(null);
                }
                return new C5505n4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
