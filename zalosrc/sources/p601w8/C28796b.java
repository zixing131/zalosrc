package p601w8;

import java.io.OutputStream;

/* renamed from: w8.b */
/* loaded from: classes.dex */
final class C28796b extends OutputStream {

    /* renamed from: p */
    private long f133454p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m144040a() {
        return this.f133454p;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f133454p++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f133454p += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 < 0 || i11 > bArr.length || i12 < 0 || (i13 = i11 + i12) > bArr.length || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f133454p += i12;
    }
}
