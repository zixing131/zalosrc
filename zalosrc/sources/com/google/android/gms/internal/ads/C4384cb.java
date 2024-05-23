package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cb */
/* loaded from: classes2.dex */
public final class C4384cb extends tu3 implements aw3 {
    private static final C4384cb zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        C4384cb c4384cb = new C4384cb();
        zzb = c4384cb;
        tu3.m26755A(C4384cb.class, c4384cb);
    }

    private C4384cb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC4902qa abstractC4902qa = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C4348bb(abstractC4902qa);
                }
                return new C4384cb();
            }
            return tu3.m26770z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C4828ob.f25528a});
        }
        return (byte) 1;
    }
}
