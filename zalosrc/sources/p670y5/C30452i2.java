package p670y5;

import java.io.OutputStream;

/* renamed from: y5.i2 */
/* loaded from: classes2.dex */
final class C30452i2 extends OutputStream {

    /* renamed from: p */
    private long f141240p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m149531a() {
        return this.f141240p;
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.f141240p++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f141240p += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) {
        int length;
        int i13;
        if (i11 < 0 || i11 > (length = bArr.length) || i12 < 0 || (i13 = i11 + i12) > length || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f141240p += i12;
    }
}
