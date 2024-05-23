package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.g4 */
/* loaded from: classes2.dex */
public final class C5765g4 extends AbstractC5774i1 implements InterfaceC5781j2 {
    private static final C5765g4 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C5765g4 c5765g4 = new C5765g4();
        zzb = c5765g4;
        AbstractC5774i1.m30279m(C5765g4.class, c5765g4);
    }

    private C5765g4() {
    }

    /* renamed from: t */
    public static C5759f4 m30231t() {
        return (C5759f4) zzb.m30285e();
    }

    /* renamed from: v */
    public static /* synthetic */ void m30233v(C5765g4 c5765g4, String str) {
        str.getClass();
        c5765g4.zzd |= 1;
        c5765g4.zze = str;
    }

    /* renamed from: w */
    public static /* synthetic */ void m30234w(C5765g4 c5765g4, String str) {
        str.getClass();
        c5765g4.zzd |= 2;
        c5765g4.zzf = str;
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
                    return new C5759f4(null);
                }
                return new C5765g4();
            }
            return AbstractC5774i1.m30278j(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
