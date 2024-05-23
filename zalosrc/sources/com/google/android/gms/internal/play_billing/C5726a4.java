package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.a4 */
/* loaded from: classes2.dex */
public final class C5726a4 extends AbstractC5774i1 implements InterfaceC5781j2 {
    private static final C5726a4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C5726a4 c5726a4 = new C5726a4();
        zzb = c5726a4;
        AbstractC5774i1.m30279m(C5726a4.class, c5726a4);
    }

    private C5726a4() {
    }

    /* renamed from: t */
    public static /* synthetic */ void m30159t(C5726a4 c5726a4, int i11) {
        c5726a4.zzg = i11 - 1;
        c5726a4.zzd |= 4;
    }

    /* renamed from: u */
    public static C5860w3 m30160u() {
        return (C5860w3) zzb.m30285e();
    }

    /* renamed from: w */
    public static /* synthetic */ void m30162w(C5726a4 c5726a4, int i11) {
        c5726a4.zzd |= 1;
        c5726a4.zze = i11;
    }

    /* renamed from: x */
    public static /* synthetic */ void m30163x(C5726a4 c5726a4, String str) {
        str.getClass();
        c5726a4.zzd |= 2;
        c5726a4.zzf = str;
    }

    /* renamed from: y */
    public static /* synthetic */ void m30164y(C5726a4 c5726a4, String str) {
        c5726a4.zzd |= 8;
        c5726a4.zzh = str;
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
                    return new C5860w3(null);
                }
                return new C5726a4();
            }
            return AbstractC5774i1.m30278j(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C5872y3.f33457a, "zzh"});
        }
        return (byte) 1;
    }
}
