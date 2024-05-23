package org.bouncycastle.jce.provider;

/* loaded from: classes7.dex */
public class AnnotatedException extends Exception {

    /* renamed from: p */
    private Throwable f118027p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118027p;
    }
}
