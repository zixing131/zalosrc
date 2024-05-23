package org.bouncycastle.util;

/* loaded from: classes7.dex */
public class StoreException extends RuntimeException {

    /* renamed from: p */
    private Throwable f118028p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118028p;
    }
}
