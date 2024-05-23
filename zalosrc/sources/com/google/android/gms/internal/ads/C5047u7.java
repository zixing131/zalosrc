package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.internal.ads.u7 */
/* loaded from: classes2.dex */
final class C5047u7 extends AbstractC5084v7 {

    /* renamed from: q */
    private final byte[] f28779q;

    public C5047u7(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f28779q = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f28779q;
    }
}
