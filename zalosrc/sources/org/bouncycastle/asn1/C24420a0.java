package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import zn0.AbstractC32516c;
import zn0.C32515b;

/* renamed from: org.bouncycastle.asn1.a0 */
/* loaded from: classes7.dex */
public class C24420a0 extends AbstractC24444j {

    /* renamed from: a */
    private final boolean f117929a;

    /* renamed from: b */
    private final int f117930b;

    /* renamed from: c */
    private final byte[] f117931c;

    public C24420a0(int i11, C32515b c32515b) {
        this.f117930b = i11;
        this.f117929a = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i12 = 0; i12 != c32515b.m157480c(); i12++) {
            try {
                byteArrayOutputStream.write(((AbstractC32516c) c32515b.m157479b(i12)).m157482e("DER"));
            } catch (IOException e11) {
                throw new ASN1ParsingException("malformed object: " + e11, e11);
            }
        }
        this.f117931c = byteArrayOutputStream.toByteArray();
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (!(abstractC24444j instanceof C24420a0)) {
            return false;
        }
        C24420a0 c24420a0 = (C24420a0) abstractC24444j;
        return this.f117929a == c24420a0.f117929a && this.f117930b == c24420a0.f117930b && AbstractC3634a.m18318a(this.f117931c, c24420a0.f117931c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127775f(this.f117929a ? 96 : 64, this.f117930b, this.f117931c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127764b(this.f117930b) + AbstractC24439g1.m127763a(this.f117931c.length) + this.f117931c.length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        boolean z11 = this.f117929a;
        return ((z11 ? 1 : 0) ^ this.f117930b) ^ AbstractC3634a.m18321d(this.f117931c);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return this.f117929a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24420a0(boolean z11, int i11, byte[] bArr) {
        this.f117929a = z11;
        this.f117930b = i11;
        this.f117931c = bArr;
    }
}
