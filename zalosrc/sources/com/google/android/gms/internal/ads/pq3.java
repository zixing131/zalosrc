package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class pq3 extends tu3 implements aw3 {
    private static final pq3 zzb;
    private String zze = "";
    private pp3 zzf;

    static {
        pq3 pq3Var = new pq3();
        zzb = pq3Var;
        tu3.m26755A(pq3.class, pq3Var);
    }

    private pq3() {
    }

    /* renamed from: G */
    public static pq3 m25525G() {
        return zzb;
    }

    /* renamed from: H */
    public static pq3 m25526H(mt3 mt3Var, gu3 gu3Var) {
        return (pq3) tu3.m26761q(zzb, mt3Var, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    mq3 mq3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new oq3(mq3Var);
                }
                return new pq3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final String m25527I() {
        return this.zze;
    }

    /* renamed from: J */
    public final boolean m25528J() {
        return this.zzf != null;
    }
}
