package p277ju;

import android.graphics.Bitmap;
import java.io.BufferedOutputStream;
import java.lang.reflect.Array;
import p244iu.AbstractC20835a;
import p244iu.InterfaceC20836b;

/* renamed from: ju.c */
/* loaded from: classes4.dex */
public class C21365c extends AbstractC20835a implements InterfaceC20836b {

    /* renamed from: g */
    static final int[] f104170g = {0, 1, 8, 16, 9, 2, 3, 10, 17, 24, 32, 25, 18, 11, 4, 5, 12, 19, 26, 33, 40, 48, 41, 34, 27, 20, 13, 6, 7, 14, 21, 28, 35, 42, 49, 56, 57, 50, 43, 36, 29, 22, 15, 23, 30, 37, 44, 51, 58, 59, 52, 45, 38, 31, 39, 46, 53, 60, 61, 54, 47, 55, 62, 63};

    /* renamed from: d */
    private C21366d f104171d;

    /* renamed from: e */
    private final C21364b f104172e = new C21364b();

    /* renamed from: f */
    private final C21363a f104173f;

    public C21365c(double d11) {
        this.f104173f = new C21363a(d11);
    }

    /* renamed from: f */
    private void m110723f() {
        m108931d(new byte[]{-1, -32, 0, 16, 74, 70, 73, 70, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0});
    }

    /* renamed from: g */
    private void m110724g() {
        int i11 = 8;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 8, 8);
        int[] iArr = new int[this.f104171d.f104181h];
        int i12 = this.f102419c;
        if (i12 % 8 != 0) {
            i12 = ((int) (Math.floor(i12 / 8.0d) + 1.0d)) * 8;
        }
        int i13 = this.f102418b;
        if (i13 % 8 != 0) {
            i13 = ((int) (Math.floor(i13 / 8.0d) + 1.0d)) * 8;
        }
        int i14 = 0;
        while (true) {
            C21366d c21366d = this.f104171d;
            if (i14 >= c21366d.f104181h) {
                break;
            }
            i12 = Math.min(i12, c21366d.f104179f[i14]);
            i13 = Math.min(i13, this.f104171d.f104180g[i14]);
            i14++;
        }
        int i15 = 0;
        while (i15 < i13) {
            int i16 = 0;
            while (i16 < i12) {
                int i17 = i16 * 8;
                int i18 = i15 * 8;
                int i19 = 0;
                while (true) {
                    C21366d c21366d2 = this.f104171d;
                    if (i19 < c21366d2.f104181h) {
                        float[][] fArr2 = (float[][]) c21366d2.f104175b[i19];
                        int i21 = 0;
                        while (i21 < this.f104171d.f104184k[i19]) {
                            int i22 = 0;
                            while (i22 < this.f104171d.f104183j[i19]) {
                                int i23 = i22 * 8;
                                int i24 = i21 * 8;
                                int i25 = 0;
                                while (i25 < i11) {
                                    int i26 = i12;
                                    for (int i27 = 0; i27 < i11; i27++) {
                                        fArr[i25][i27] = fArr2[i18 + i24 + i25][i17 + i23 + i27];
                                    }
                                    i25++;
                                    i12 = i26;
                                }
                                int i28 = i12;
                                int[] m110718e = this.f104173f.m110718e(this.f104173f.m110717a(fArr), this.f104171d.f104185l[i19]);
                                C21364b c21364b = this.f104172e;
                                BufferedOutputStream bufferedOutputStream = this.f102417a;
                                int i29 = iArr[i19];
                                C21366d c21366d3 = this.f104171d;
                                c21364b.m110721b(bufferedOutputStream, m110718e, i29, c21366d3.f104186m[i19], c21366d3.f104187n[i19]);
                                iArr[i19] = m110718e[0];
                                i22++;
                                i12 = i28;
                                fArr = fArr;
                                i11 = 8;
                            }
                            i21++;
                            i11 = 8;
                        }
                        i19++;
                        i11 = 8;
                    }
                }
                i16++;
                i11 = 8;
            }
            i15++;
            i11 = 8;
        }
        this.f104172e.m110722c(this.f102417a);
    }

    /* renamed from: h */
    private void m110725h() {
        byte[] bArr = new byte[17];
        byte[] bArr2 = {-1, -60};
        int i11 = 0;
        int i12 = 4;
        int i13 = 4;
        while (i11 < 4) {
            int i14 = i12 + 1;
            bArr[i12 - i13] = (byte) ((int[]) this.f104172e.f104150a.elementAt(i11))[0];
            int i15 = 1;
            int i16 = 0;
            while (i15 < 17) {
                int i17 = ((int[]) this.f104172e.f104150a.elementAt(i11))[i15];
                bArr[i14 - i13] = (byte) i17;
                i16 += i17;
                i15++;
                i14++;
            }
            byte[] bArr3 = new byte[i16];
            int i18 = i14;
            int i19 = 0;
            while (i19 < i16) {
                bArr3[i18 - i14] = (byte) ((int[]) this.f104172e.f104151b.elementAt(i11))[i19];
                i19++;
                i18++;
            }
            byte[] bArr4 = new byte[i18];
            System.arraycopy(bArr2, 0, bArr4, 0, i13);
            System.arraycopy(bArr, 0, bArr4, i13, 17);
            System.arraycopy(bArr3, 0, bArr4, i13 + 17, i16);
            i11++;
            bArr2 = bArr4;
            i12 = i18;
            i13 = i12;
        }
        int i21 = i12 - 2;
        bArr2[2] = (byte) ((i21 >> 8) & 255);
        bArr2[3] = (byte) (i21 & 255);
        m108931d(bArr2);
    }

    /* renamed from: i */
    private void m110726i() {
        byte[] bArr = new byte[134];
        bArr[0] = -1;
        bArr[1] = -37;
        bArr[2] = 0;
        bArr[3] = -124;
        int i11 = 4;
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i11 + 1;
            bArr[i11] = (byte) i12;
            int[] iArr = (int[]) this.f104173f.f104144a[i12];
            int i14 = 0;
            while (i14 < 64) {
                bArr[i13] = (byte) iArr[f104170g[i14]];
                i14++;
                i13++;
            }
            i12++;
            i11 = i13;
        }
        m108931d(bArr);
    }

    /* renamed from: j */
    private void m110727j() {
        m108932e(new byte[]{-1, -39});
    }

    /* renamed from: k */
    private void m110728k() {
        m110730m();
        m110723f();
        m110726i();
        m110729l(this.f104171d);
        m110725h();
        m110731n();
    }

    /* renamed from: l */
    private void m110729l(C21366d c21366d) {
        byte[] bArr = new byte[19];
        bArr[0] = -1;
        bArr[1] = -64;
        bArr[2] = 0;
        bArr[3] = 17;
        bArr[4] = (byte) c21366d.f104174a;
        int i11 = c21366d.f104177d;
        bArr[5] = (byte) ((i11 >> 8) & 255);
        bArr[6] = (byte) (i11 & 255);
        int i12 = c21366d.f104178e;
        bArr[7] = (byte) ((i12 >> 8) & 255);
        bArr[8] = (byte) (i12 & 255);
        bArr[9] = (byte) c21366d.f104181h;
        int i13 = 10;
        for (int i14 = 0; i14 < bArr[9]; i14++) {
            bArr[i13] = (byte) c21366d.f104182i[i14];
            int i15 = i13 + 2;
            bArr[i13 + 1] = (byte) ((c21366d.f104183j[i14] << 4) + c21366d.f104184k[i14]);
            i13 += 3;
            bArr[i15] = (byte) c21366d.f104185l[i14];
        }
        m108931d(bArr);
    }

    /* renamed from: m */
    private void m110730m() {
        m108932e(new byte[]{-1, -40});
    }

    /* renamed from: n */
    private void m110731n() {
        byte[] bArr = new byte[14];
        bArr[0] = -1;
        bArr[1] = -38;
        bArr[2] = 0;
        bArr[3] = 12;
        bArr[4] = (byte) this.f104171d.f104181h;
        int i11 = 5;
        for (int i12 = 0; i12 < bArr[4]; i12++) {
            int i13 = i11 + 1;
            C21366d c21366d = this.f104171d;
            bArr[i11] = (byte) c21366d.f104182i[i12];
            i11 += 2;
            bArr[i13] = (byte) ((c21366d.f104186m[i12] << 4) + c21366d.f104187n[i12]);
        }
        C21366d c21366d2 = this.f104171d;
        bArr[i11] = (byte) c21366d2.f104176c;
        bArr[i11 + 1] = (byte) c21366d2.f104188o;
        bArr[i11 + 2] = (byte) ((c21366d2.f104189p << 4) + c21366d2.f104190q);
        m108931d(bArr);
    }

    @Override // p244iu.InterfaceC20836b
    /* renamed from: a */
    public void mo108933a(Bitmap bitmap) {
        C21366d c21366d = new C21366d(bitmap);
        this.f104171d = c21366d;
        this.f102418b = c21366d.f104177d;
        this.f102419c = c21366d.f104178e;
        m110728k();
        m110724g();
        m110727j();
        m108930c();
    }
}
