package p291k7;

import java.security.cert.X509Certificate;

/* renamed from: k7.c1 */
/* loaded from: classes3.dex */
final class C21494c1 extends AbstractC21497d1 {

    /* renamed from: q */
    private final byte[] f104525q;

    public C21494c1(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f104525q = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f104525q;
    }
}
