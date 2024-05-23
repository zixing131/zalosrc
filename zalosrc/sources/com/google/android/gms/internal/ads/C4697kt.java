package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kt */
/* loaded from: classes2.dex */
public final class C4697kt extends tu3 implements aw3 {
    private static final C4697kt zzb;
    private cv3 zze = tu3.m26767w();

    static {
        C4697kt c4697kt = new C4697kt();
        zzb = c4697kt;
        tu3.m26755A(C4697kt.class, c4697kt);
    }

    private C4697kt() {
    }

    /* renamed from: F */
    public static C4439dt m24028F() {
        return (C4439dt) zzb.m26772C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m24030H(C4697kt c4697kt, C4402ct c4402ct) {
        c4402ct.getClass();
        cv3 cv3Var = c4697kt.zze;
        if (!cv3Var.zzc()) {
            c4697kt.zze = tu3.m26768x(cv3Var);
        }
        c4697kt.zze.add(c4402ct);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC5068us abstractC5068us = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C4439dt(abstractC5068us);
                }
                return new C4697kt();
            }
            return tu3.m26770z(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C4402ct.class});
        }
        return (byte) 1;
    }
}
