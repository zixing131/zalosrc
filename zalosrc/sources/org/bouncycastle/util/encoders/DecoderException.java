package org.bouncycastle.util.encoders;

/* loaded from: classes7.dex */
public class DecoderException extends IllegalStateException {

    /* renamed from: p */
    private Throwable f118030p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118030p;
    }
}
