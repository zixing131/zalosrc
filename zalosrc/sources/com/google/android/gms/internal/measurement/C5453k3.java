package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k3 */
/* loaded from: classes.dex */
public final class C5453k3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5453k3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C5334d3 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C5453k3 c5453k3 = new C5453k3();
        zza = c5453k3;
        AbstractC5612t9.m29644v(C5453k3.class, c5453k3);
    }

    private C5453k3() {
    }

    /* renamed from: C */
    public static C5436j3 m29331C() {
        return (C5436j3) zza.m29648h();
    }

    /* renamed from: F */
    public static /* synthetic */ void m29333F(C5453k3 c5453k3, String str) {
        c5453k3.zzd |= 2;
        c5453k3.zzf = str;
    }

    /* renamed from: A */
    public final int m29334A() {
        return this.zze;
    }

    /* renamed from: B */
    public final C5334d3 m29335B() {
        C5334d3 c5334d3 = this.zzg;
        if (c5334d3 == null) {
            return C5334d3.m29044B();
        }
        return c5334d3;
    }

    /* renamed from: E */
    public final String m29336E() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean m29337G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean m29338H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final boolean m29339I() {
        return this.zzj;
    }

    /* renamed from: J */
    public final boolean m29340J() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: L */
    public final boolean m29341L() {
        return (this.zzd & 32) != 0;
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
                    return new C5436j3(null);
                }
                return new C5453k3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
