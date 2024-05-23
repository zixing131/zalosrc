package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.k4 */
/* loaded from: classes2.dex */
public final class C5789k4 extends AbstractC5774i1 implements InterfaceC5781j2 {
    private static final C5789k4 zzb;
    private int zzd;
    private int zze;

    static {
        C5789k4 c5789k4 = new C5789k4();
        zzb = c5789k4;
        AbstractC5774i1.m30279m(C5789k4.class, c5789k4);
    }

    private C5789k4() {
    }

    /* renamed from: t */
    public static C5777i4 m30317t() {
        return (C5777i4) zzb.m30285e();
    }

    /* renamed from: v */
    public static /* synthetic */ void m30319v(C5789k4 c5789k4, int i11) {
        c5789k4.zze = i11 - 1;
        c5789k4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5774i1
    /* renamed from: q */
    public final Object mo30165q(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C5777i4(null);
                }
                return new C5789k4();
            }
            return AbstractC5774i1.m30278j(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C5783j4.f33339a});
        }
        return (byte) 1;
    }
}
