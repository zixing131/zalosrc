package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* loaded from: classes.dex */
public final class C5640v3 extends AbstractC5612t9 implements InterfaceC5664wa {
    private static final C5640v3 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C5640v3 c5640v3 = new C5640v3();
        zza = c5640v3;
        AbstractC5612t9.m29644v(C5640v3.class, c5640v3);
    }

    private C5640v3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m29691D(C5640v3 c5640v3, String str) {
        str.getClass();
        c5640v3.zzd |= 1;
        c5640v3.zze = str;
    }

    /* renamed from: A */
    public final int m29692A() {
        return this.zzh;
    }

    /* renamed from: C */
    public final String m29693C() {
        return this.zze;
    }

    /* renamed from: E */
    public final boolean m29694E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final boolean m29695F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m29696G() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: H */
    public final boolean m29697H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean m29698I() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC5612t9
    /* renamed from: z */
    public final Object mo28921z(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC5555q3 abstractC5555q3 = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C5623u3(abstractC5555q3);
                }
                return new C5640v3();
            }
            return AbstractC5612t9.m29643r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
