package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class oi3 implements bi3 {

    /* renamed from: a */
    private final wh3 f25652a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public oi3(wh3 wh3Var) {
        this.f25652a = wh3Var;
    }

    @Override // com.google.android.gms.internal.ads.bi3
    /* renamed from: a */
    public final ci3 mo20527a(byte[] bArr) {
        byte[] m25871b = qs3.m25871b();
        byte[] m25870a = qs3.m25870a(m25871b, bArr);
        byte[] m25872c = qs3.m25872c(m25871b);
        byte[] m23728c = jr3.m23728c(m25872c, bArr);
        byte[] m24300d = li3.m24300d(li3.f23933b);
        wh3 wh3Var = this.f25652a;
        return new ci3(wh3Var.m27612b(null, m25870a, "eae_prk", m23728c, "shared_secret", m24300d, wh3Var.m27611a()), m25872c);
    }

    @Override // com.google.android.gms.internal.ads.bi3
    public final byte[] zzb() {
        if (Arrays.equals(this.f25652a.m27613c(), li3.f23937f)) {
            return li3.f23933b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
