package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
/* loaded from: classes.dex */
public final class C5674x3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5674x3 zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private InterfaceC5714z9 zzh = AbstractC5612t9.m29640o();
    private InterfaceC5714z9 zzi = AbstractC5612t9.m29640o();
    private InterfaceC5714z9 zzj = AbstractC5612t9.m29640o();
    private String zzk = "";
    private InterfaceC5714z9 zzm = AbstractC5612t9.m29640o();
    private InterfaceC5714z9 zzn = AbstractC5612t9.m29640o();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    static {
        C5674x3 c5674x3 = new C5674x3();
        zza = c5674x3;
        AbstractC5612t9.m29644v(C5674x3.class, c5674x3);
    }

    private C5674x3() {
    }

    /* renamed from: E */
    public static C5657w3 m29991E() {
        return (C5657w3) zza.m29648h();
    }

    /* renamed from: G */
    public static C5674x3 m29993G() {
        return zza;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m29994Q(C5674x3 c5674x3, int i11, C5640v3 c5640v3) {
        c5640v3.getClass();
        InterfaceC5714z9 interfaceC5714z9 = c5674x3.zzi;
        if (!interfaceC5714z9.zzc()) {
            c5674x3.zzi = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        c5674x3.zzi.set(i11, c5640v3);
    }

    /* renamed from: A */
    public final int m29996A() {
        return this.zzm.size();
    }

    /* renamed from: B */
    public final int m29997B() {
        return this.zzi.size();
    }

    /* renamed from: C */
    public final long m29998C() {
        return this.zze;
    }

    /* renamed from: D */
    public final C5640v3 m29999D(int i11) {
        return (C5640v3) this.zzi.get(i11);
    }

    /* renamed from: H */
    public final String m30000H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final String m30001I() {
        return this.zzq;
    }

    /* renamed from: J */
    public final String m30002J() {
        return this.zzp;
    }

    /* renamed from: L */
    public final String m30003L() {
        return this.zzo;
    }

    /* renamed from: M */
    public final List m30004M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final List m30005N() {
        return this.zzn;
    }

    /* renamed from: O */
    public final List m30006O() {
        return this.zzm;
    }

    /* renamed from: P */
    public final List m30007P() {
        return this.zzh;
    }

    /* renamed from: S */
    public final boolean m30008S() {
        return this.zzl;
    }

    /* renamed from: T */
    public final boolean m30009T() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: U */
    public final boolean m30010U() {
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
                    return new C5657w3(null);
                }
                return new C5674x3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C5301b4.class, "zzi", C5640v3.class, "zzj", C5707z2.class, "zzk", "zzl", "zzm", C5489m5.class, "zzn", C5606t3.class, "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }
}
