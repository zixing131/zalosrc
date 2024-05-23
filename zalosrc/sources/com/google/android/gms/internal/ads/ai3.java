package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ai3 implements xd3 {

    /* renamed from: e */
    private static final byte[] f17062e = new byte[0];

    /* renamed from: a */
    private final gp3 f17063a;

    /* renamed from: b */
    private final bi3 f17064b;

    /* renamed from: c */
    private final xh3 f17065c;

    /* renamed from: d */
    private final wh3 f17066d;

    private ai3(gp3 gp3Var, bi3 bi3Var, wh3 wh3Var, xh3 xh3Var, byte[] bArr) {
        this.f17063a = gp3Var;
        this.f17064b = bi3Var;
        this.f17066d = wh3Var;
        this.f17065c = xh3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ai3 m20125b(gp3 gp3Var) {
        if (!gp3Var.m22507L().m24737j()) {
            ap3 m22506G = gp3Var.m22506G();
            return new ai3(gp3Var, ei3.m21724b(m22506G), ei3.m21725c(m22506G), ei3.m21723a(m22506G), null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    @Override // com.google.android.gms.internal.ads.xd3
    /* renamed from: a */
    public final byte[] mo20126a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        gp3 gp3Var = this.f17063a;
        bi3 bi3Var = this.f17064b;
        wh3 wh3Var = this.f17066d;
        xh3 xh3Var = this.f17065c;
        ci3 mo20527a = bi3Var.mo20527a(gp3Var.m22507L().m24738k());
        yh3 m28204c = yh3.m28204c(mo20527a.m20903a(), mo20527a.m20904b(), bi3Var, wh3Var, xh3Var, bArr3);
        return jr3.m23728c(m28204c.m28206a(), m28204c.m28207b(bArr, f17062e));
    }
}
