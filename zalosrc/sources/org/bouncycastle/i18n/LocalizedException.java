package org.bouncycastle.i18n;

/* loaded from: classes7.dex */
public class LocalizedException extends Exception {

    /* renamed from: p */
    private Throwable f118021p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118021p;
    }
}
