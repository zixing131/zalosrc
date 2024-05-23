package p406ow;

import java.io.FileInputStream;

/* renamed from: ow.i */
/* loaded from: classes4.dex */
class C24573i {

    /* renamed from: a */
    private byte[] f118289a = new byte[512];

    /* renamed from: b */
    private FileInputStream f118290b;

    /* renamed from: c */
    private int f118291c;

    /* renamed from: d */
    private int f118292d;

    /* renamed from: a */
    public int m127989a(byte[] bArr) {
        int i11;
        byte[] bArr2;
        int i12;
        byte b11;
        if (this.f118291c >= this.f118292d) {
            this.f118292d = this.f118290b.read(this.f118289a);
            this.f118291c = 0;
        }
        int i13 = 0;
        while (true) {
            i11 = this.f118292d;
            if (i11 == -1 || i13 >= bArr.length || (b11 = (bArr2 = this.f118289a)[(i12 = this.f118291c)]) == 10) {
                break;
            }
            bArr[i13] = b11;
            int i14 = i12 + 1;
            this.f118291c = i14;
            if (i14 >= i11) {
                this.f118292d = this.f118290b.read(bArr2);
                this.f118291c = 0;
            }
            i13++;
        }
        this.f118291c++;
        if (i11 == -1) {
            return -1;
        }
        return i13;
    }

    /* renamed from: b */
    public void m127990b(FileInputStream fileInputStream) {
        this.f118290b = fileInputStream;
        this.f118292d = 0;
        this.f118291c = 0;
    }

    /* renamed from: c */
    public void m127991c() {
        if (this.f118291c >= this.f118292d) {
            this.f118292d = this.f118290b.read(this.f118289a);
            this.f118291c = 0;
        }
        while (true) {
            int i11 = this.f118292d;
            if (i11 == -1) {
                break;
            }
            byte[] bArr = this.f118289a;
            int i12 = this.f118291c;
            if (bArr[i12] == 10) {
                break;
            }
            int i13 = i12 + 1;
            this.f118291c = i13;
            if (i13 >= i11) {
                this.f118292d = this.f118290b.read(bArr);
                this.f118291c = 0;
            }
        }
        this.f118291c++;
    }
}
