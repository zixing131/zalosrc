package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: org.bouncycastle.asn1.d1 */
/* loaded from: classes7.dex */
class C24430d1 implements Enumeration {

    /* renamed from: a */
    private C24428d f117955a;

    /* renamed from: b */
    private Object f117956b = m127740a();

    public C24430d1(byte[] bArr) {
        this.f117955a = new C24428d(bArr, true);
    }

    /* renamed from: a */
    private Object m127740a() {
        try {
            return this.f117955a.m127737r();
        } catch (IOException e11) {
            throw new ASN1ParsingException("malformed DER construction: " + e11, e11);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f117956b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f117956b;
        this.f117956b = m127740a();
        return obj;
    }
}
