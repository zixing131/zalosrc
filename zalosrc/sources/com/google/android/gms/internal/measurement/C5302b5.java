package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b5 */
/* loaded from: classes.dex */
public final class C5302b5 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5302b5 zza;
    private InterfaceC5697y9 zzd = AbstractC5612t9.m29638m();
    private InterfaceC5697y9 zze = AbstractC5612t9.m29638m();
    private InterfaceC5714z9 zzf = AbstractC5612t9.m29640o();
    private InterfaceC5714z9 zzg = AbstractC5612t9.m29640o();

    static {
        C5302b5 c5302b5 = new C5302b5();
        zza = c5302b5;
        AbstractC5612t9.m29644v(C5302b5.class, c5302b5);
    }

    private C5302b5() {
    }

    /* renamed from: E */
    public static C5285a5 m28925E() {
        return (C5285a5) zza.m29648h();
    }

    /* renamed from: G */
    public static C5302b5 m28927G() {
        return zza;
    }

    /* renamed from: M */
    public static /* synthetic */ void m28928M(C5302b5 c5302b5, Iterable iterable) {
        InterfaceC5697y9 interfaceC5697y9 = c5302b5.zzd;
        if (!interfaceC5697y9.zzc()) {
            c5302b5.zzd = AbstractC5612t9.m29639n(interfaceC5697y9);
        }
        AbstractC5407h8.m29186e(iterable, c5302b5.zzd);
    }

    /* renamed from: O */
    public static /* synthetic */ void m28930O(C5302b5 c5302b5, Iterable iterable) {
        InterfaceC5697y9 interfaceC5697y9 = c5302b5.zze;
        if (!interfaceC5697y9.zzc()) {
            c5302b5.zze = AbstractC5612t9.m29639n(interfaceC5697y9);
        }
        AbstractC5407h8.m29186e(iterable, c5302b5.zze);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m28932Q(C5302b5 c5302b5, Iterable iterable) {
        InterfaceC5714z9 interfaceC5714z9 = c5302b5.zzf;
        if (!interfaceC5714z9.zzc()) {
            c5302b5.zzf = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        AbstractC5407h8.m29186e(iterable, c5302b5.zzf);
    }

    /* renamed from: S */
    public static /* synthetic */ void m28934S(C5302b5 c5302b5, Iterable iterable) {
        InterfaceC5714z9 interfaceC5714z9 = c5302b5.zzg;
        if (!interfaceC5714z9.zzc()) {
            c5302b5.zzg = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        AbstractC5407h8.m29186e(iterable, c5302b5.zzg);
    }

    /* renamed from: A */
    public final int m28936A() {
        return this.zzf.size();
    }

    /* renamed from: B */
    public final int m28937B() {
        return this.zze.size();
    }

    /* renamed from: C */
    public final int m28938C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final int m28939D() {
        return this.zzd.size();
    }

    /* renamed from: H */
    public final List m28940H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List m28941I() {
        return this.zze;
    }

    /* renamed from: J */
    public final List m28942J() {
        return this.zzg;
    }

    /* renamed from: L */
    public final List m28943L() {
        return this.zzd;
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
                    return new C5285a5(null);
                }
                return new C5302b5();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C5437j4.class, "zzg", C5336d5.class});
        }
        return (byte) 1;
    }
}
