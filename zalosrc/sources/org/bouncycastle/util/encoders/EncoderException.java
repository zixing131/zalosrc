package org.bouncycastle.util.encoders;

/* loaded from: classes7.dex */
public class EncoderException extends IllegalStateException {

    /* renamed from: p */
    private Throwable f118031p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EncoderException(String str, Throwable th2) {
        super(str);
        this.f118031p = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118031p;
    }
}
