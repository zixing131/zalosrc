package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class ih3 extends yi3 {

    /* renamed from: b */
    final /* synthetic */ jh3 f22179b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih3(jh3 jh3Var, Class cls) {
        super(cls);
        this.f22179b = jh3Var;
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zv3 mo20114a(zv3 zv3Var) {
        sn3 sn3Var = (sn3) zv3Var;
        KeyPair m26719c = tr3.m26719c(tr3.m26727k(sh3.m26309c(sn3Var.m26374I().m27321J().m21775K())));
        ECPublicKey eCPublicKey = (ECPublicKey) m26719c.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) m26719c.getPrivate();
        ECPoint w11 = eCPublicKey.getW();
        ao3 m20626H = bo3.m20626H();
        m20626H.m20201r(0);
        m20626H.m20200q(sn3Var.m26374I());
        m20626H.m20202s(mt3.m24726I(w11.getAffineX().toByteArray()));
        m20626H.m20203u(mt3.m24726I(w11.getAffineY().toByteArray()));
        bo3 bo3Var = (bo3) m20626H.m25898n();
        xn3 m28274G = yn3.m28274G();
        m28274G.m27947s(0);
        m28274G.m27946r(bo3Var);
        m28274G.m27945q(mt3.m24726I(eCPrivateKey.getS().toByteArray()));
        return (yn3) m28274G.m25898n();
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20115b(mt3 mt3Var) {
        return sn3.m26372H(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: c */
    public final Map mo20116c() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        ie3 m23608a = je3.m23608a("AES128_GCM");
        bArr = jh3.f22823e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", jh3.m23615l(4, 5, 3, m23608a, bArr, 1));
        ie3 m23608a2 = je3.m23608a("AES128_GCM");
        bArr2 = jh3.f22823e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", jh3.m23615l(4, 5, 3, m23608a2, bArr2, 3));
        ie3 m23608a3 = je3.m23608a("AES128_GCM");
        bArr3 = jh3.f22823e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", jh3.m23615l(4, 5, 4, m23608a3, bArr3, 1));
        ie3 m23608a4 = je3.m23608a("AES128_GCM");
        bArr4 = jh3.f22823e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", jh3.m23615l(4, 5, 4, m23608a4, bArr4, 3));
        ie3 m23608a5 = je3.m23608a("AES128_GCM");
        bArr5 = jh3.f22823e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", jh3.m23615l(4, 5, 4, m23608a5, bArr5, 3));
        ie3 m23608a6 = je3.m23608a("AES128_CTR_HMAC_SHA256");
        bArr6 = jh3.f22823e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", jh3.m23615l(4, 5, 3, m23608a6, bArr6, 1));
        ie3 m23608a7 = je3.m23608a("AES128_CTR_HMAC_SHA256");
        bArr7 = jh3.f22823e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", jh3.m23615l(4, 5, 3, m23608a7, bArr7, 3));
        ie3 m23608a8 = je3.m23608a("AES128_CTR_HMAC_SHA256");
        bArr8 = jh3.f22823e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", jh3.m23615l(4, 5, 4, m23608a8, bArr8, 1));
        ie3 m23608a9 = je3.m23608a("AES128_CTR_HMAC_SHA256");
        bArr9 = jh3.f22823e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", jh3.m23615l(4, 5, 4, m23608a9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.yi3
    /* renamed from: d */
    public final /* synthetic */ void mo20117d(zv3 zv3Var) {
        sh3.m26307a(((sn3) zv3Var).m26374I());
    }
}
