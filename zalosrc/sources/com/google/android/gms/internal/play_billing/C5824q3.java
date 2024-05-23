package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.q3 */
/* loaded from: classes2.dex */
public final class C5824q3 extends AbstractC5774i1 implements InterfaceC5781j2 {
    private static final C5824q3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C5726a4 zzh;

    static {
        C5824q3 c5824q3 = new C5824q3();
        zzb = c5824q3;
        AbstractC5774i1.m30279m(C5824q3.class, c5824q3);
    }

    private C5824q3() {
    }

    /* renamed from: t */
    public static /* synthetic */ void m30433t(C5824q3 c5824q3, int i11) {
        c5824q3.zzg = i11 - 1;
        c5824q3.zzd |= 1;
    }

    /* renamed from: u */
    public static C5818p3 m30434u() {
        return (C5818p3) zzb.m30285e();
    }

    /* renamed from: w */
    public static C5824q3 m30436w(byte[] bArr, C5869y0 c5869y0) {
        return (C5824q3) AbstractC5774i1.m30276h(zzb, bArr, c5869y0);
    }

    /* renamed from: x */
    public static /* synthetic */ void m30437x(C5824q3 c5824q3, C5726a4 c5726a4) {
        c5726a4.getClass();
        c5824q3.zzh = c5726a4;
        c5824q3.zzd |= 2;
    }

    /* renamed from: y */
    public static /* synthetic */ void m30438y(C5824q3 c5824q3, C5789k4 c5789k4) {
        c5789k4.getClass();
        c5824q3.zzf = c5789k4;
        c5824q3.zze = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new C5818p3(null);
                }
                return new C5824q3();
            }
            return AbstractC5774i1.m30278j(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C5830r3.f33422a, "zzh", C5789k4.class});
        }
        return (byte) 1;
    }
}
