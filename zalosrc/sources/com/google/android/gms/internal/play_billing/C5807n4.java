package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.n4 */
/* loaded from: classes2.dex */
public final class C5807n4 extends AbstractC5774i1 implements InterfaceC5781j2 {
    private static final C5807n4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C5765g4 zzg;

    static {
        C5807n4 c5807n4 = new C5807n4();
        zzb = c5807n4;
        AbstractC5774i1.m30279m(C5807n4.class, c5807n4);
    }

    private C5807n4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static /* synthetic */ void m30414t(C5807n4 c5807n4, C5848u3 c5848u3) {
        c5807n4.zzf = c5848u3;
        c5807n4.zze = 3;
    }

    /* renamed from: u */
    public static C5801m4 m30415u() {
        return (C5801m4) zzb.m30285e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static /* synthetic */ void m30417w(C5807n4 c5807n4, C5831r4 c5831r4) {
        c5807n4.zzf = c5831r4;
        c5807n4.zze = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static /* synthetic */ void m30418x(C5807n4 c5807n4, C5765g4 c5765g4) {
        c5807n4.zzg = c5765g4;
        c5807n4.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ void m30419y(C5807n4 c5807n4, C5824q3 c5824q3) {
        c5807n4.zzf = c5824q3;
        c5807n4.zze = 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5774i1
    /* renamed from: q */
    public final Object mo30165q(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC5795l4 abstractC5795l4 = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C5801m4(abstractC5795l4);
                }
                return new C5807n4();
            }
            return AbstractC5774i1.m30278j(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C5824q3.class, C5848u3.class, C5831r4.class, C5747d4.class});
        }
        return (byte) 1;
    }
}
