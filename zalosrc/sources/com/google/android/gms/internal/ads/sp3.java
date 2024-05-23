package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class sp3 extends tu3 implements aw3 {
    private static final sp3 zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        sp3 sp3Var = new sp3();
        zzb = sp3Var;
        tu3.m26755A(sp3.class, sp3Var);
    }

    private sp3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    qp3 qp3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new rp3(qp3Var);
                }
                return new sp3();
            }
            return tu3.m26770z(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: G */
    public final String m26386G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final String m26387H() {
        return this.zze;
    }

    /* renamed from: I */
    public final String m26388I() {
        return this.zzf;
    }
}
