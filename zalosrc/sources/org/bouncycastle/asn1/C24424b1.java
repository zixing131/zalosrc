package org.bouncycastle.asn1;

import eo0.AbstractC18530a;
import java.io.EOFException;
import java.io.InputStream;

/* renamed from: org.bouncycastle.asn1.b1 */
/* loaded from: classes7.dex */
class C24424b1 extends AbstractC24436f1 {

    /* renamed from: t */
    private static final byte[] f117936t = new byte[0];

    /* renamed from: r */
    private final int f117937r;

    /* renamed from: s */
    private int f117938s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24424b1(InputStream inputStream, int i11) {
        super(inputStream, i11);
        if (i11 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f117937r = i11;
        this.f117938s = i11;
        if (i11 == 0) {
            m127751b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24436f1
    /* renamed from: a */
    public int mo127719a() {
        return this.f117938s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m127720c() {
        int i11 = this.f117938s;
        if (i11 == 0) {
            return f117936t;
        }
        byte[] bArr = new byte[i11];
        int m97920c = i11 - AbstractC18530a.m97920c(this.f117962p, bArr);
        this.f117938s = m97920c;
        if (m97920c == 0) {
            m127751b(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f117937r + " object truncated by " + this.f117938s);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f117938s == 0) {
            return -1;
        }
        int read = this.f117962p.read();
        if (read >= 0) {
            int i11 = this.f117938s - 1;
            this.f117938s = i11;
            if (i11 == 0) {
                m127751b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f117937r + " object truncated by " + this.f117938s);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f117938s;
        if (i13 == 0) {
            return -1;
        }
        int read = this.f117962p.read(bArr, i11, Math.min(i12, i13));
        if (read >= 0) {
            int i14 = this.f117938s - read;
            this.f117938s = i14;
            if (i14 == 0) {
                m127751b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f117937r + " object truncated by " + this.f117938s);
    }
}
