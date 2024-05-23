package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.n9 */
/* loaded from: classes2.dex */
public final class C4789n9 extends ByteArrayOutputStream {

    /* renamed from: p */
    private final C5234z8 f25085p;

    public C4789n9(C5234z8 c5234z8, int i11) {
        this.f25085p = c5234z8;
        ((ByteArrayOutputStream) this).buf = c5234z8.m28458b(Math.max(i11, 256));
    }

    /* renamed from: a */
    private final void m24863a(int i11) {
        int i12 = ((ByteArrayOutputStream) this).count;
        if (i12 + i11 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i13 = i12 + i11;
        byte[] m28458b = this.f25085p.m28458b(i13 + i13);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m28458b, 0, ((ByteArrayOutputStream) this).count);
        this.f25085p.m28457a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m28458b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25085p.m28457a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f25085p.m28457a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i11) {
        m24863a(1);
        super.write(i11);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i11, int i12) {
        m24863a(i12);
        super.write(bArr, i11, i12);
    }
}
