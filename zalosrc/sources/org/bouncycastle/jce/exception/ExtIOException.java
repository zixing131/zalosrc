package org.bouncycastle.jce.exception;

import java.io.IOException;

/* loaded from: classes7.dex */
public class ExtIOException extends IOException {

    /* renamed from: p */
    private Throwable f118026p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118026p;
    }
}
