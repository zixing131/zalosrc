package p705z5;

import java.io.OutputStream;

/* renamed from: z5.g */
/* loaded from: classes2.dex */
final class C31379g extends OutputStream {

    /* renamed from: p */
    private long f144715p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m152237a() {
        return this.f144715p;
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.f144715p++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f144715p += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) {
        int length;
        int i13;
        if (i11 < 0 || i11 > (length = bArr.length) || i12 < 0 || (i13 = i11 + i12) > length || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f144715p += i12;
    }
}
