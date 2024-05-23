package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes7.dex */
public class ASN1Exception extends IOException {

    /* renamed from: p */
    private Throwable f117922p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Exception(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f117922p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Exception(String str, Throwable th2) {
        super(str);
        this.f117922p = th2;
    }
}
