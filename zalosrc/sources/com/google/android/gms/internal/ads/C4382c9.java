package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.c9 */
/* loaded from: classes2.dex */
final class C4382c9 extends FilterInputStream {

    /* renamed from: p */
    private final long f18159p;

    /* renamed from: q */
    private long f18160q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4382c9(InputStream inputStream, long j11) {
        super(inputStream);
        this.f18159p = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m20840a() {
        return this.f18159p - this.f18160q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f18160q++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        int read = super.read(bArr, i11, i12);
        if (read != -1) {
            this.f18160q += read;
        }
        return read;
    }
}
