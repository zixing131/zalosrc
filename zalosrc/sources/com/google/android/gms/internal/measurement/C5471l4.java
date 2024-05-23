package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* loaded from: classes.dex */
public final class C5471l4 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5471l4 zza;
    private int zzd;
    private InterfaceC5714z9 zze = AbstractC5612t9.m29640o();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C5471l4 c5471l4 = new C5471l4();
        zza = c5471l4;
        AbstractC5612t9.m29644v(C5471l4.class, c5471l4);
    }

    private C5471l4() {
    }

    /* renamed from: E */
    public static C5454k4 m29382E() {
        return (C5454k4) zza.m29648h();
    }

    /* renamed from: J */
    public static /* synthetic */ void m29384J(C5471l4 c5471l4, int i11, C5539p4 c5539p4) {
        c5539p4.getClass();
        c5471l4.m29392V();
        c5471l4.zze.set(i11, c5539p4);
    }

    /* renamed from: L */
    public static /* synthetic */ void m29385L(C5471l4 c5471l4, C5539p4 c5539p4) {
        c5539p4.getClass();
        c5471l4.m29392V();
        c5471l4.zze.add(c5539p4);
    }

    /* renamed from: M */
    public static /* synthetic */ void m29386M(C5471l4 c5471l4, Iterable iterable) {
        c5471l4.m29392V();
        AbstractC5407h8.m29186e(iterable, c5471l4.zze);
    }

    /* renamed from: O */
    public static /* synthetic */ void m29388O(C5471l4 c5471l4, int i11) {
        c5471l4.m29392V();
        c5471l4.zze.remove(i11);
    }

    /* renamed from: P */
    public static /* synthetic */ void m29389P(C5471l4 c5471l4, String str) {
        str.getClass();
        c5471l4.zzd |= 1;
        c5471l4.zzf = str;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m29390Q(C5471l4 c5471l4, long j11) {
        c5471l4.zzd |= 2;
        c5471l4.zzg = j11;
    }

    /* renamed from: R */
    public static /* synthetic */ void m29391R(C5471l4 c5471l4, long j11) {
        c5471l4.zzd |= 4;
        c5471l4.zzh = j11;
    }

    /* renamed from: V */
    private final void m29392V() {
        InterfaceC5714z9 interfaceC5714z9 = this.zze;
        if (!interfaceC5714z9.zzc()) {
            this.zze = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
    }

    /* renamed from: A */
    public final int m29393A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final int m29394B() {
        return this.zze.size();
    }

    /* renamed from: C */
    public final long m29395C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final long m29396D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final C5539p4 m29397G(int i11) {
        return (C5539p4) this.zze.get(i11);
    }

    /* renamed from: H */
    public final String m29398H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List m29399I() {
        return this.zze;
    }

    /* renamed from: S */
    public final boolean m29400S() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: T */
    public final boolean m29401T() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: U */
    public final boolean m29402U() {
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
                    return new C5454k4(null);
                }
                return new C5471l4();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C5539p4.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
