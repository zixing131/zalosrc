package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

/* loaded from: classes7.dex */
public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {

    /* renamed from: p */
    private Throwable f118022p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118022p;
    }
}
