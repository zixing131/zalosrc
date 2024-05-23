package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: org.bouncycastle.asn1.c1 */
/* loaded from: classes7.dex */
public class C24427c1 extends AbstractC24436f1 {

    /* renamed from: r */
    private int f117943r;

    /* renamed from: s */
    private int f117944s;

    /* renamed from: t */
    private boolean f117945t;

    /* renamed from: u */
    private boolean f117946u;

    public C24427c1(InputStream inputStream, int i11) {
        super(inputStream, i11);
        this.f117945t = false;
        this.f117946u = true;
        this.f117943r = inputStream.read();
        int read = inputStream.read();
        this.f117944s = read;
        if (read < 0) {
            throw new EOFException();
        }
        m127725c();
    }

    /* renamed from: c */
    private boolean m127725c() {
        if (!this.f117945t && this.f117946u && this.f117943r == 0 && this.f117944s == 0) {
            this.f117945t = true;
            m127751b(true);
        }
        return this.f117945t;
    }

    /* renamed from: d */
    public void m127726d(boolean z11) {
        this.f117946u = z11;
        m127725c();
    }

    @Override // java.io.InputStream
    public int read() {
        if (m127725c()) {
            return -1;
        }
        int read = this.f117962p.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i11 = this.f117943r;
        this.f117943r = this.f117944s;
        this.f117944s = read;
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (this.f117946u || i12 < 3) {
            return super.read(bArr, i11, i12);
        }
        if (this.f117945t) {
            return -1;
        }
        int read = this.f117962p.read(bArr, i11 + 2, i12 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i11] = (byte) this.f117943r;
        bArr[i11 + 1] = (byte) this.f117944s;
        this.f117943r = this.f117962p.read();
        int read2 = this.f117962p.read();
        this.f117944s = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
