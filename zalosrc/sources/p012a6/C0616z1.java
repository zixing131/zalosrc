package p012a6;

import java.io.OutputStream;

/* renamed from: a6.z1 */
/* loaded from: classes2.dex */
final class C0616z1 extends OutputStream {

    /* renamed from: p */
    private long f2122p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m904a() {
        return this.f2122p;
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.f2122p++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f2122p += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) {
        int length;
        int i13;
        if (i11 < 0 || i11 > (length = bArr.length) || i12 < 0 || (i13 = i11 + i12) > length || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f2122p += i12;
    }
}
