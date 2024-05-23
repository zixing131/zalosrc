package do0;

import java.io.OutputStream;

/* renamed from: do0.b */
/* loaded from: classes7.dex */
public class C18037b implements InterfaceC18036a {

    /* renamed from: a */
    protected final byte[] f91305a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    protected final byte[] f91306b = new byte[128];

    public C18037b() {
        m95894b();
    }

    @Override // do0.InterfaceC18036a
    /* renamed from: a */
    public int mo95893a(byte[] bArr, int i11, int i12, OutputStream outputStream) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            byte b11 = bArr[i13];
            outputStream.write(this.f91305a[(b11 & 255) >>> 4]);
            outputStream.write(this.f91305a[b11 & 15]);
        }
        return i12 * 2;
    }

    /* renamed from: b */
    protected void m95894b() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f91306b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = this.f91305a;
            if (i11 >= bArr2.length) {
                byte[] bArr3 = this.f91306b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f91306b[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }
}
