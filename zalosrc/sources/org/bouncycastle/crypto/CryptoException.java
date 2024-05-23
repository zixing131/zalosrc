package org.bouncycastle.crypto;

/* loaded from: classes7.dex */
public class CryptoException extends Exception {

    /* renamed from: p */
    private Throwable f118018p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118018p;
    }
}
