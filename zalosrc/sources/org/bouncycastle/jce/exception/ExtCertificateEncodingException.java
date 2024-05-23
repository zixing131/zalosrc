package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

/* loaded from: classes7.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException {

    /* renamed from: p */
    private Throwable f118025p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118025p;
    }
}
