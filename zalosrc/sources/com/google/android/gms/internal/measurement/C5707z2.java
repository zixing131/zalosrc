package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* loaded from: classes.dex */
public final class C5707z2 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5707z2 zza;
    private int zzd;
    private int zze;
    private InterfaceC5714z9 zzf = AbstractC5612t9.m29640o();
    private InterfaceC5714z9 zzg = AbstractC5612t9.m29640o();
    private boolean zzh;
    private boolean zzi;

    static {
        C5707z2 c5707z2 = new C5707z2();
        zza = c5707z2;
        AbstractC5612t9.m29644v(C5707z2.class, c5707z2);
    }

    private C5707z2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m30094I(C5707z2 c5707z2, int i11, C5453k3 c5453k3) {
        c5453k3.getClass();
        InterfaceC5714z9 interfaceC5714z9 = c5707z2.zzf;
        if (!interfaceC5714z9.zzc()) {
            c5707z2.zzf = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        c5707z2.zzf.set(i11, c5453k3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m30095J(C5707z2 c5707z2, int i11, C5300b3 c5300b3) {
        c5300b3.getClass();
        InterfaceC5714z9 interfaceC5714z9 = c5707z2.zzg;
        if (!interfaceC5714z9.zzc()) {
            c5707z2.zzg = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        c5707z2.zzg.set(i11, c5300b3);
    }

    /* renamed from: A */
    public final int m30096A() {
        return this.zze;
    }

    /* renamed from: B */
    public final int m30097B() {
        return this.zzg.size();
    }

    /* renamed from: C */
    public final int m30098C() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final C5300b3 m30099E(int i11) {
        return (C5300b3) this.zzg.get(i11);
    }

    /* renamed from: F */
    public final C5453k3 m30100F(int i11) {
        return (C5453k3) this.zzf.get(i11);
    }

    /* renamed from: G */
    public final List m30101G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List m30102H() {
        return this.zzf;
    }

    /* renamed from: L */
    public final boolean m30103L() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC5612t9
    /* renamed from: z */
    public final Object mo28921z(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC5673x2 abstractC5673x2 = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C5690y2(abstractC5673x2);
                }
                return new C5707z2();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C5453k3.class, "zzg", C5300b3.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
