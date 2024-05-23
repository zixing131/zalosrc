package org.bouncycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

/* loaded from: classes7.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException {

    /* renamed from: p */
    private Throwable f118023p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118023p;
    }
}
