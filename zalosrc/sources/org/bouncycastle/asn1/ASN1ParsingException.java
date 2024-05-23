package org.bouncycastle.asn1;

/* loaded from: classes7.dex */
public class ASN1ParsingException extends IllegalStateException {

    /* renamed from: p */
    private Throwable f117923p;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f117923p;
    }

    public ASN1ParsingException(String str, Throwable th2) {
        super(str);
        this.f117923p = th2;
    }
}
