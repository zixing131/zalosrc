package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d3 */
/* loaded from: classes2.dex */
public final class C5334d3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5334d3 zza;
    private int zzd;
    private C5538p3 zze;
    private C5419i3 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C5334d3 c5334d3 = new C5334d3();
        zza = c5334d3;
        AbstractC5612t9.m29644v(C5334d3.class, c5334d3);
    }

    private C5334d3() {
    }

    /* renamed from: B */
    public static C5334d3 m29044B() {
        return zza;
    }

    /* renamed from: F */
    public static /* synthetic */ void m29045F(C5334d3 c5334d3, String str) {
        c5334d3.zzd |= 8;
        c5334d3.zzh = str;
    }

    /* renamed from: C */
    public final C5419i3 m29046C() {
        C5419i3 c5419i3 = this.zzf;
        if (c5419i3 == null) {
            return C5419i3.m29193B();
        }
        return c5419i3;
    }

    /* renamed from: D */
    public final C5538p3 m29047D() {
        C5538p3 c5538p3 = this.zze;
        if (c5538p3 == null) {
            return C5538p3.m29492C();
        }
        return c5538p3;
    }

    /* renamed from: E */
    public final String m29048E() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean m29049G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean m29050H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean m29051I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean m29052J() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: L */
    public final boolean m29053L() {
        return (this.zzd & 1) != 0;
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
                    return new C5317c3(null);
                }
                return new C5334d3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
