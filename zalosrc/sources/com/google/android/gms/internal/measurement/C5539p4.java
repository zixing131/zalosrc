package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* loaded from: classes.dex */
public final class C5539p4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5539p4 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC5714z9 zzj = AbstractC5612t9.m29640o();

    static {
        C5539p4 c5539p4 = new C5539p4();
        zza = c5539p4;
        AbstractC5612t9.m29644v(C5539p4.class, c5539p4);
    }

    private C5539p4() {
    }

    /* renamed from: E */
    public static C5522o4 m29501E() {
        return (C5522o4) zza.m29648h();
    }

    /* renamed from: J */
    public static /* synthetic */ void m29503J(C5539p4 c5539p4, String str) {
        str.getClass();
        c5539p4.zzd |= 1;
        c5539p4.zze = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m29504L(C5539p4 c5539p4, String str) {
        str.getClass();
        c5539p4.zzd |= 2;
        c5539p4.zzf = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m29505M(C5539p4 c5539p4) {
        c5539p4.zzd &= -3;
        c5539p4.zzf = zza.zzf;
    }

    /* renamed from: N */
    public static /* synthetic */ void m29506N(C5539p4 c5539p4, long j11) {
        c5539p4.zzd |= 4;
        c5539p4.zzg = j11;
    }

    /* renamed from: O */
    public static /* synthetic */ void m29507O(C5539p4 c5539p4) {
        c5539p4.zzd &= -5;
        c5539p4.zzg = 0L;
    }

    /* renamed from: P */
    public static /* synthetic */ void m29508P(C5539p4 c5539p4, double d11) {
        c5539p4.zzd |= 16;
        c5539p4.zzi = d11;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m29509Q(C5539p4 c5539p4) {
        c5539p4.zzd &= -17;
        c5539p4.zzi = 0.0d;
    }

    /* renamed from: R */
    public static /* synthetic */ void m29510R(C5539p4 c5539p4, C5539p4 c5539p42) {
        c5539p42.getClass();
        c5539p4.m29513Z();
        c5539p4.zzj.add(c5539p42);
    }

    /* renamed from: S */
    public static /* synthetic */ void m29511S(C5539p4 c5539p4, Iterable iterable) {
        c5539p4.m29513Z();
        AbstractC5407h8.m29186e(iterable, c5539p4.zzj);
    }

    /* renamed from: Z */
    private final void m29513Z() {
        InterfaceC5714z9 interfaceC5714z9 = this.zzj;
        if (!interfaceC5714z9.zzc()) {
            this.zzj = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
    }

    /* renamed from: A */
    public final double m29514A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final float m29515B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final int m29516C() {
        return this.zzj.size();
    }

    /* renamed from: D */
    public final long m29517D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String m29518G() {
        return this.zze;
    }

    /* renamed from: H */
    public final String m29519H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List m29520I() {
        return this.zzj;
    }

    /* renamed from: U */
    public final boolean m29521U() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: V */
    public final boolean m29522V() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: W */
    public final boolean m29523W() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: X */
    public final boolean m29524X() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Y */
    public final boolean m29525Y() {
        return (this.zzd & 2) != 0;
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
                    return new C5522o4(null);
                }
                return new C5539p4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C5539p4.class});
        }
        return (byte) 1;
    }
}
