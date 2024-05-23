package org.bouncycastle.crypto.io;

import java.io.IOException;

/* loaded from: classes7.dex */
public class CipherIOException extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    private final Throwable f118019p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118019p;
    }
}
