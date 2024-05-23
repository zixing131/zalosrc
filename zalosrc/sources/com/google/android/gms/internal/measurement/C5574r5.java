package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r5 */
/* loaded from: classes.dex */
public final class C5574r5 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5574r5 zza;
    private int zzd;
    private int zze;
    private InterfaceC5714z9 zzf = AbstractC5612t9.m29640o();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C5574r5 c5574r5 = new C5574r5();
        zza = c5574r5;
        AbstractC5612t9.m29644v(C5574r5.class, c5574r5);
    }

    private C5574r5() {
    }

    /* renamed from: A */
    public final double m29574A() {
        return this.zzj;
    }

    /* renamed from: C */
    public final String m29575C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String m29576D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final List m29577E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final boolean m29578F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final boolean m29579G() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: H */
    public final boolean m29580H() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: I */
    public final boolean m29581I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final int m29582J() {
        int m29548a = AbstractC5557q5.m29548a(this.zze);
        if (m29548a == 0) {
            return 1;
        }
        return m29548a;
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
                    return new C5506n5(null);
                }
                return new C5574r5();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C5540p5.f32719a, "zzf", C5574r5.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
