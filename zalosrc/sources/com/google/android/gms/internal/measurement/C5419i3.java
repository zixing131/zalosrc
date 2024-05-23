package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i3 */
/* loaded from: classes2.dex */
public final class C5419i3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5419i3 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C5419i3 c5419i3 = new C5419i3();
        zza = c5419i3;
        AbstractC5612t9.m29644v(C5419i3.class, c5419i3);
    }

    private C5419i3() {
    }

    /* renamed from: B */
    public static C5419i3 m29193B() {
        return zza;
    }

    /* renamed from: C */
    public final String m29194C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String m29195D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final String m29196E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final boolean m29197F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean m29198G() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: H */
    public final boolean m29199H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean m29200I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean m29201J() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: L */
    public final boolean m29202L() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: M */
    public final int m29203M() {
        int m29167a = AbstractC5402h3.m29167a(this.zze);
        if (m29167a == 0) {
            return 1;
        }
        return m29167a;
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
                    return new C5351e3(null);
                }
                return new C5419i3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C5385g3.f32386a, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
