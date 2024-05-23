package org.bouncycastle.asn1;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.bouncycastle.asn1.f1 */
/* loaded from: classes7.dex */
public abstract class AbstractC24436f1 extends InputStream {

    /* renamed from: p */
    protected final InputStream f117962p;

    /* renamed from: q */
    private int f117963q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC24436f1(InputStream inputStream, int i11) {
        this.f117962p = inputStream;
        this.f117963q = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo127719a() {
        return this.f117963q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m127751b(boolean z11) {
        InputStream inputStream = this.f117962p;
        if (inputStream instanceof C24427c1) {
            ((C24427c1) inputStream).m127726d(z11);
        }
    }
}
