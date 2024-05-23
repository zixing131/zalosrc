package org.bouncycastle.jce.exception;

import java.security.cert.CertPathValidatorException;

/* loaded from: classes7.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException {

    /* renamed from: p */
    private Throwable f118024p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118024p;
    }
}
