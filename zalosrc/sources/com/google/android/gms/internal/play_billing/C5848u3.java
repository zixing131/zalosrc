package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.u3 */
/* loaded from: classes2.dex */
public final class C5848u3 extends AbstractC5774i1 implements InterfaceC5781j2 {
    private static final C5848u3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C5848u3 c5848u3 = new C5848u3();
        zzb = c5848u3;
        AbstractC5774i1.m30279m(C5848u3.class, c5848u3);
    }

    private C5848u3() {
    }

    /* renamed from: t */
    public static C5842t3 m30524t() {
        return (C5842t3) zzb.m30285e();
    }

    /* renamed from: v */
    public static /* synthetic */ void m30526v(C5848u3 c5848u3, C5789k4 c5789k4) {
        c5789k4.getClass();
        c5848u3.zzf = c5789k4;
        c5848u3.zze = 2;
    }

    /* renamed from: w */
    public static /* synthetic */ void m30527w(C5848u3 c5848u3, int i11) {
        c5848u3.zzg = i11 - 1;
        c5848u3.zzd |= 1;
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
                    return new C5842t3(null);
                }
                return new C5848u3();
            }
            return AbstractC5774i1.m30278j(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C5830r3.f33422a, C5789k4.class});
        }
        return (byte) 1;
    }
}
