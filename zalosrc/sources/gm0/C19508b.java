package gm0;

/* renamed from: gm0.b */
/* loaded from: classes7.dex */
public class C19508b extends AbstractC19507a implements InterfaceC19511e, InterfaceC19510d {
    public C19508b(byte[] bArr, boolean z11) {
        super(bArr, z11);
    }

    /* renamed from: m */
    public static InterfaceC19510d m101976m(byte[] bArr) {
        return new C19508b(bArr, false);
    }

    /* renamed from: n */
    public static InterfaceC19511e m101977n(byte[] bArr) {
        return new C19508b(bArr, true);
    }

    @Override // gm0.AbstractC19507a
    /* renamed from: k */
    public void mo101974k(int[][] iArr) {
        int i11 = this.f96845c;
        int i12 = this.f96843a;
        int[] iArr2 = iArr[i12];
        this.f96845c = i11 ^ iArr2[0];
        this.f96846d ^= iArr2[1];
        this.f96847e ^= iArr2[2];
        this.f96848f ^= iArr2[3];
        int i13 = i12 - 1;
        while (i13 > 1) {
            byte[] bArr = this.f96853k;
            int m101970g = m101970g((bArr[(this.f96846d >> 24) & 255] << 24) ^ (((bArr[this.f96845c & 255] & 255) ^ ((bArr[(this.f96848f >> 8) & 255] & 255) << 8)) ^ ((bArr[(this.f96847e >> 16) & 255] & 255) << 16))) ^ iArr[i13][0];
            byte[] bArr2 = this.f96853k;
            int m101970g2 = m101970g((bArr2[(this.f96847e >> 24) & 255] << 24) ^ (((bArr2[this.f96846d & 255] & 255) ^ ((bArr2[(this.f96845c >> 8) & 255] & 255) << 8)) ^ ((bArr2[(this.f96848f >> 16) & 255] & 255) << 16))) ^ iArr[i13][1];
            byte[] bArr3 = this.f96853k;
            int m101970g3 = m101970g((bArr3[(this.f96848f >> 24) & 255] << 24) ^ (((bArr3[this.f96847e & 255] & 255) ^ ((bArr3[(this.f96846d >> 8) & 255] & 255) << 8)) ^ ((bArr3[(this.f96845c >> 16) & 255] & 255) << 16))) ^ iArr[i13][2];
            byte[] bArr4 = this.f96853k;
            int i14 = i13 - 1;
            int m101970g4 = m101970g((bArr4[(this.f96845c >> 24) & 255] << 24) ^ (((bArr4[this.f96848f & 255] & 255) ^ ((bArr4[(this.f96847e >> 8) & 255] & 255) << 8)) ^ ((bArr4[(this.f96846d >> 16) & 255] & 255) << 16))) ^ iArr[i13][3];
            byte[] bArr5 = this.f96853k;
            this.f96845c = m101970g((bArr5[(m101970g2 >> 24) & 255] << 24) ^ (((bArr5[m101970g & 255] & 255) ^ ((bArr5[(m101970g4 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(m101970g3 >> 16) & 255] & 255) << 16))) ^ iArr[i14][0];
            byte[] bArr6 = this.f96853k;
            this.f96846d = m101970g((bArr6[(m101970g3 >> 24) & 255] << 24) ^ (((bArr6[m101970g2 & 255] & 255) ^ ((bArr6[(m101970g >> 8) & 255] & 255) << 8)) ^ ((bArr6[(m101970g4 >> 16) & 255] & 255) << 16))) ^ iArr[i14][1];
            byte[] bArr7 = this.f96853k;
            this.f96847e = m101970g((bArr7[(m101970g4 >> 24) & 255] << 24) ^ (((bArr7[m101970g3 & 255] & 255) ^ ((bArr7[(m101970g2 >> 8) & 255] & 255) << 8)) ^ ((bArr7[(m101970g >> 16) & 255] & 255) << 16))) ^ iArr[i14][2];
            byte[] bArr8 = this.f96853k;
            i13 -= 2;
            this.f96848f = m101970g((bArr8[(m101970g >> 24) & 255] << 24) ^ (((bArr8[(m101970g2 >> 16) & 255] & 255) << 16) ^ (((bArr8[(m101970g3 >> 8) & 255] & 255) << 8) ^ (bArr8[m101970g4 & 255] & 255)))) ^ iArr[i14][3];
        }
        byte[] bArr9 = this.f96853k;
        int m101970g5 = m101970g((bArr9[(this.f96846d >> 24) & 255] << 24) ^ (((bArr9[this.f96845c & 255] & 255) ^ ((bArr9[(this.f96848f >> 8) & 255] & 255) << 8)) ^ ((bArr9[(this.f96847e >> 16) & 255] & 255) << 16))) ^ iArr[i13][0];
        byte[] bArr10 = this.f96853k;
        int m101970g6 = m101970g((bArr10[(this.f96847e >> 24) & 255] << 24) ^ (((bArr10[this.f96846d & 255] & 255) ^ ((bArr10[(this.f96845c >> 8) & 255] & 255) << 8)) ^ ((bArr10[(this.f96848f >> 16) & 255] & 255) << 16))) ^ iArr[i13][1];
        byte[] bArr11 = this.f96853k;
        int m101970g7 = m101970g((bArr11[(this.f96848f >> 24) & 255] << 24) ^ (((bArr11[this.f96847e & 255] & 255) ^ ((bArr11[(this.f96846d >> 8) & 255] & 255) << 8)) ^ ((bArr11[(this.f96845c >> 16) & 255] & 255) << 16))) ^ iArr[i13][2];
        byte[] bArr12 = this.f96853k;
        int m101970g8 = iArr[i13][3] ^ m101970g((bArr12[(this.f96845c >> 24) & 255] << 24) ^ (((bArr12[this.f96848f & 255] & 255) ^ ((bArr12[(this.f96847e >> 8) & 255] & 255) << 8)) ^ ((bArr12[(this.f96846d >> 16) & 255] & 255) << 16)));
        byte[] bArr13 = this.f96853k;
        int i15 = (((bArr13[m101970g5 & 255] & 255) ^ ((bArr13[(m101970g8 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101970g7 >> 16) & 255] & 255) << 16)) ^ (bArr13[(m101970g6 >> 24) & 255] << 24);
        int[] iArr3 = iArr[0];
        this.f96845c = iArr3[0] ^ i15;
        this.f96846d = ((((bArr13[m101970g6 & 255] & 255) ^ ((bArr13[(m101970g5 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101970g8 >> 16) & 255] & 255) << 16)) ^ (bArr13[(m101970g7 >> 24) & 255] << 24)) ^ iArr3[1];
        this.f96847e = ((((bArr13[m101970g7 & 255] & 255) ^ ((bArr13[(m101970g6 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101970g5 >> 16) & 255] & 255) << 16)) ^ (bArr13[(m101970g8 >> 24) & 255] << 24)) ^ iArr3[2];
        this.f96848f = iArr3[3] ^ ((bArr13[(m101970g5 >> 24) & 255] << 24) ^ (((bArr13[m101970g8 & 255] & 255) ^ ((bArr13[(m101970g7 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101970g6 >> 16) & 255] & 255) << 16)));
    }

    @Override // gm0.AbstractC19507a
    /* renamed from: l */
    public void mo101975l(int[][] iArr) {
        int i11 = this.f96845c;
        int[] iArr2 = iArr[0];
        this.f96845c = i11 ^ iArr2[0];
        this.f96846d ^= iArr2[1];
        this.f96847e ^= iArr2[2];
        this.f96848f ^= iArr2[3];
        int i12 = 1;
        while (i12 < this.f96843a - 1) {
            byte[] bArr = this.f96852j;
            int m101972i = m101972i((bArr[(this.f96848f >> 24) & 255] << 24) ^ (((bArr[this.f96845c & 255] & 255) ^ ((bArr[(this.f96846d >> 8) & 255] & 255) << 8)) ^ ((bArr[(this.f96847e >> 16) & 255] & 255) << 16))) ^ iArr[i12][0];
            byte[] bArr2 = this.f96852j;
            int m101972i2 = m101972i((bArr2[(this.f96845c >> 24) & 255] << 24) ^ (((bArr2[this.f96846d & 255] & 255) ^ ((bArr2[(this.f96847e >> 8) & 255] & 255) << 8)) ^ ((bArr2[(this.f96848f >> 16) & 255] & 255) << 16))) ^ iArr[i12][1];
            byte[] bArr3 = this.f96852j;
            int m101972i3 = m101972i((bArr3[(this.f96846d >> 24) & 255] << 24) ^ (((bArr3[this.f96847e & 255] & 255) ^ ((bArr3[(this.f96848f >> 8) & 255] & 255) << 8)) ^ ((bArr3[(this.f96845c >> 16) & 255] & 255) << 16))) ^ iArr[i12][2];
            byte[] bArr4 = this.f96852j;
            int i13 = i12 + 1;
            int m101972i4 = m101972i((bArr4[(this.f96847e >> 24) & 255] << 24) ^ (((bArr4[this.f96848f & 255] & 255) ^ ((bArr4[(this.f96845c >> 8) & 255] & 255) << 8)) ^ ((bArr4[(this.f96846d >> 16) & 255] & 255) << 16))) ^ iArr[i12][3];
            byte[] bArr5 = this.f96852j;
            this.f96845c = m101972i((bArr5[(m101972i4 >> 24) & 255] << 24) ^ (((bArr5[m101972i & 255] & 255) ^ ((bArr5[(m101972i2 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(m101972i3 >> 16) & 255] & 255) << 16))) ^ iArr[i13][0];
            byte[] bArr6 = this.f96852j;
            this.f96846d = m101972i((bArr6[(m101972i >> 24) & 255] << 24) ^ (((bArr6[m101972i2 & 255] & 255) ^ ((bArr6[(m101972i3 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(m101972i4 >> 16) & 255] & 255) << 16))) ^ iArr[i13][1];
            byte[] bArr7 = this.f96852j;
            this.f96847e = m101972i((bArr7[(m101972i2 >> 24) & 255] << 24) ^ (((bArr7[m101972i3 & 255] & 255) ^ ((bArr7[(m101972i4 >> 8) & 255] & 255) << 8)) ^ ((bArr7[(m101972i >> 16) & 255] & 255) << 16))) ^ iArr[i13][2];
            byte[] bArr8 = this.f96852j;
            i12 += 2;
            this.f96848f = m101972i(((((bArr8[(m101972i >> 8) & 255] & 255) << 8) ^ (bArr8[m101972i4 & 255] & 255)) ^ ((bArr8[(m101972i2 >> 16) & 255] & 255) << 16)) ^ (bArr8[(m101972i3 >> 24) & 255] << 24)) ^ iArr[i13][3];
        }
        byte[] bArr9 = this.f96852j;
        int m101972i5 = m101972i((bArr9[(this.f96848f >> 24) & 255] << 24) ^ (((bArr9[this.f96845c & 255] & 255) ^ ((bArr9[(this.f96846d >> 8) & 255] & 255) << 8)) ^ ((bArr9[(this.f96847e >> 16) & 255] & 255) << 16))) ^ iArr[i12][0];
        byte[] bArr10 = this.f96852j;
        int m101972i6 = m101972i((bArr10[(this.f96845c >> 24) & 255] << 24) ^ (((bArr10[this.f96846d & 255] & 255) ^ ((bArr10[(this.f96847e >> 8) & 255] & 255) << 8)) ^ ((bArr10[(this.f96848f >> 16) & 255] & 255) << 16))) ^ iArr[i12][1];
        byte[] bArr11 = this.f96852j;
        int m101972i7 = m101972i((bArr11[(this.f96846d >> 24) & 255] << 24) ^ (((bArr11[this.f96847e & 255] & 255) ^ ((bArr11[(this.f96848f >> 8) & 255] & 255) << 8)) ^ ((bArr11[(this.f96845c >> 16) & 255] & 255) << 16))) ^ iArr[i12][2];
        byte[] bArr12 = this.f96852j;
        int i14 = i12 + 1;
        int m101972i8 = iArr[i12][3] ^ m101972i((bArr12[(this.f96847e >> 24) & 255] << 24) ^ (((bArr12[this.f96848f & 255] & 255) ^ ((bArr12[(this.f96845c >> 8) & 255] & 255) << 8)) ^ ((bArr12[(this.f96846d >> 16) & 255] & 255) << 16)));
        byte[] bArr13 = this.f96852j;
        int i15 = (((bArr13[m101972i5 & 255] & 255) ^ ((bArr13[(m101972i6 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101972i7 >> 16) & 255] & 255) << 16)) ^ (bArr13[(m101972i8 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i14];
        this.f96845c = iArr3[0] ^ i15;
        this.f96846d = ((((bArr13[m101972i6 & 255] & 255) ^ ((bArr13[(m101972i7 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101972i8 >> 16) & 255] & 255) << 16)) ^ (bArr13[(m101972i5 >> 24) & 255] << 24)) ^ iArr3[1];
        this.f96847e = ((((bArr13[m101972i7 & 255] & 255) ^ ((bArr13[(m101972i8 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101972i5 >> 16) & 255] & 255) << 16)) ^ (bArr13[(m101972i6 >> 24) & 255] << 24)) ^ iArr3[2];
        this.f96848f = iArr3[3] ^ ((((bArr13[m101972i8 & 255] & 255) ^ ((bArr13[(m101972i5 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(m101972i6 >> 16) & 255] & 255) << 16)) ^ (bArr13[(m101972i7 >> 24) & 255] << 24));
    }
}
