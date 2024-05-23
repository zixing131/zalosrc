package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
/* loaded from: classes2.dex */
public final class C5336d5 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5336d5 zza;
    private int zzd;
    private int zze;
    private InterfaceC5697y9 zzf = AbstractC5612t9.m29638m();

    static {
        C5336d5 c5336d5 = new C5336d5();
        zza = c5336d5;
        AbstractC5612t9.m29644v(C5336d5.class, c5336d5);
    }

    private C5336d5() {
    }

    /* renamed from: D */
    public static C5319c5 m29055D() {
        return (C5319c5) zza.m29648h();
    }

    /* renamed from: G */
    public static /* synthetic */ void m29057G(C5336d5 c5336d5, int i11) {
        c5336d5.zzd |= 1;
        c5336d5.zze = i11;
    }

    /* renamed from: H */
    public static /* synthetic */ void m29058H(C5336d5 c5336d5, Iterable iterable) {
        InterfaceC5697y9 interfaceC5697y9 = c5336d5.zzf;
        if (!interfaceC5697y9.zzc()) {
            c5336d5.zzf = AbstractC5612t9.m29639n(interfaceC5697y9);
        }
        AbstractC5407h8.m29186e(iterable, c5336d5.zzf);
    }

    /* renamed from: A */
    public final int m29059A() {
        return this.zzf.size();
    }

    /* renamed from: B */
    public final int m29060B() {
        return this.zze;
    }

    /* renamed from: C */
    public final long m29061C(int i11) {
        return this.zzf.mo29366a(i11);
    }

    /* renamed from: F */
    public final List m29062F() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean m29063I() {
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
                    return new C5319c5(null);
                }
                return new C5336d5();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
