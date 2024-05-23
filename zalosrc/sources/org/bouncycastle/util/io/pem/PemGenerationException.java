package org.bouncycastle.util.io.pem;

import java.io.IOException;

/* loaded from: classes7.dex */
public class PemGenerationException extends IOException {

    /* renamed from: p */
    private Throwable f118033p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118033p;
    }
}
