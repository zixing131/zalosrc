package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes7.dex */
public class TlsFatalAlert extends IOException {
    private static final long serialVersionUID = 3584313123679111168L;

    /* renamed from: p */
    protected Throwable f118020p;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f118020p;
    }
}
