package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes2.dex */
final class mi3 implements bi3 {

    /* renamed from: a */
    private final wh3 f24587a;

    /* renamed from: b */
    private final int f24588b;

    private mi3(wh3 wh3Var, int i11) {
        this.f24587a = wh3Var;
        this.f24588b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static mi3 m24606b(int i11) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 1) {
                return new mi3(new wh3("HmacSha512"), 3);
            }
            return new mi3(new wh3("HmacSha384"), 2);
        }
        return new mi3(new wh3("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.ads.bi3
    /* renamed from: a */
    public final ci3 mo20527a(byte[] bArr) {
        KeyPair m26719c = tr3.m26719c(tr3.m26727k(this.f24588b));
        byte[] m26723g = tr3.m26723g((ECPrivateKey) m26719c.getPrivate(), tr3.m26726j(tr3.m26727k(this.f24588b), 1, bArr));
        byte[] m26728l = tr3.m26728l(tr3.m26727k(this.f24588b).getCurve(), 1, ((ECPublicKey) m26719c.getPublic()).getW());
        byte[] m23728c = jr3.m23728c(m26728l, bArr);
        byte[] m24300d = li3.m24300d(zzb());
        wh3 wh3Var = this.f24587a;
        return new ci3(wh3Var.m27612b(null, m26723g, "eae_prk", m23728c, "shared_secret", m24300d, wh3Var.m27611a()), m26728l);
    }

    @Override // com.google.android.gms.internal.ads.bi3
    public final byte[] zzb() {
        int i11 = this.f24588b - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                return li3.f23936e;
            }
            return li3.f23935d;
        }
        return li3.f23934c;
    }
}
