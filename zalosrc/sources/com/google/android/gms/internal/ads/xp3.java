package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class xp3 extends tu3 implements aw3 {
    private static final xp3 zzb;
    private int zze;
    private cv3 zzf = tu3.m26767w();

    static {
        xp3 xp3Var = new xp3();
        zzb = xp3Var;
        tu3.m26755A(xp3.class, xp3Var);
    }

    private xp3() {
    }

    /* renamed from: H */
    public static up3 m27966H() {
        return (up3) zzb.m26772C();
    }

    /* renamed from: J */
    public static xp3 m27968J(InputStream inputStream, gu3 gu3Var) {
        return (xp3) tu3.m26762r(zzb, inputStream, gu3Var);
    }

    /* renamed from: K */
    public static xp3 m27969K(byte[] bArr, gu3 gu3Var) {
        return (xp3) tu3.m26763s(zzb, bArr, gu3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m27971N(xp3 xp3Var, wp3 wp3Var) {
        wp3Var.getClass();
        cv3 cv3Var = xp3Var.zzf;
        if (!cv3Var.zzc()) {
            xp3Var.zzf = tu3.m26768x(cv3Var);
        }
        xp3Var.zzf.add(wp3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    tp3 tp3Var = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new up3(tp3Var);
                }
                return new xp3();
            }
            return tu3.m26770z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", wp3.class});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final int m27972F() {
        return this.zzf.size();
    }

    /* renamed from: G */
    public final int m27973G() {
        return this.zze;
    }

    /* renamed from: L */
    public final List m27974L() {
        return this.zzf;
    }
}
