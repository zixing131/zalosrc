package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* loaded from: classes.dex */
public final class C5300b3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5300b3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC5714z9 zzg = AbstractC5612t9.m29640o();
    private boolean zzh;
    private C5419i3 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C5300b3 c5300b3 = new C5300b3();
        zza = c5300b3;
        AbstractC5612t9.m29644v(C5300b3.class, c5300b3);
    }

    private C5300b3() {
    }

    /* renamed from: C */
    public static C5283a3 m28905C() {
        return (C5283a3) zza.m29648h();
    }

    /* renamed from: I */
    public static /* synthetic */ void m28907I(C5300b3 c5300b3, String str) {
        c5300b3.zzd |= 2;
        c5300b3.zzf = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m28908J(C5300b3 c5300b3, int i11, C5334d3 c5334d3) {
        c5334d3.getClass();
        InterfaceC5714z9 interfaceC5714z9 = c5300b3.zzg;
        if (!interfaceC5714z9.zzc()) {
            c5300b3.zzg = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        c5300b3.zzg.set(i11, c5334d3);
    }

    /* renamed from: A */
    public final int m28909A() {
        return this.zzg.size();
    }

    /* renamed from: B */
    public final int m28910B() {
        return this.zze;
    }

    /* renamed from: E */
    public final C5334d3 m28911E(int i11) {
        return (C5334d3) this.zzg.get(i11);
    }

    /* renamed from: F */
    public final C5419i3 m28912F() {
        C5419i3 c5419i3 = this.zzi;
        if (c5419i3 == null) {
            return C5419i3.m29193B();
        }
        return c5419i3;
    }

    /* renamed from: G */
    public final String m28913G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final List m28914H() {
        return this.zzg;
    }

    /* renamed from: L */
    public final boolean m28915L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final boolean m28916M() {
        return this.zzk;
    }

    /* renamed from: N */
    public final boolean m28917N() {
        return this.zzl;
    }

    /* renamed from: O */
    public final boolean m28918O() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: P */
    public final boolean m28919P() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Q */
    public final boolean m28920Q() {
        return (this.zzd & 64) != 0;
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
                    return new C5283a3(null);
                }
                return new C5300b3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C5334d3.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
