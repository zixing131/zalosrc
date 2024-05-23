package p277ju;

import java.lang.reflect.Array;

/* renamed from: ju.a */
/* loaded from: classes4.dex */
class C21363a {

    /* renamed from: a */
    Object[] f104144a = new Object[2];

    /* renamed from: b */
    private final Object[] f104145b = new Object[2];

    /* renamed from: c */
    private final int[] f104146c = new int[64];

    /* renamed from: d */
    private final double[] f104147d = new double[64];

    /* renamed from: e */
    private final int[] f104148e = new int[64];

    /* renamed from: f */
    private final double[] f104149f = new double[64];

    public C21363a(double d11) {
        m110714b(d11);
    }

    /* renamed from: b */
    private void m110714b(double d11) {
        double d12;
        double d13;
        int i11;
        double[] dArr = {1.0d, 1.387039845d, 1.306562965d, 1.175875602d, 1.0d, 0.785694958d, 0.5411961d, 0.275899379d};
        if (d11 <= 0.0d) {
            d12 = 1.0d;
        } else {
            d12 = d11;
        }
        if (d12 > 100.0d) {
            d12 = 100.0d;
        }
        if (d12 < 50.0d) {
            d13 = 5000.0d / d12;
        } else {
            d13 = 200.0d - (d12 * 2.0d);
        }
        int i12 = (int) d13;
        m110716d();
        int i13 = 0;
        while (true) {
            int i14 = 255;
            if (i13 >= 64) {
                break;
            }
            int[] iArr = this.f104146c;
            int i15 = ((iArr[i13] * i12) + 50) / 100;
            if (i15 <= 0) {
                i11 = 1;
            } else {
                i11 = i15;
            }
            if (i11 <= 255) {
                i14 = i11;
            }
            iArr[i13] = i14;
            i13++;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < 8; i17++) {
            for (int i18 = 0; i18 < 8; i18++) {
                this.f104147d[i16] = 1.0d / (((this.f104146c[i16] * dArr[i17]) * dArr[i18]) * 8.0d);
                i16++;
            }
        }
        m110715c();
        for (int i19 = 0; i19 < 64; i19++) {
            int[] iArr2 = this.f104148e;
            int i21 = ((iArr2[i19] * i12) + 50) / 100;
            if (i21 <= 0) {
                i21 = 1;
            }
            if (i21 >= 255) {
                i21 = 255;
            }
            iArr2[i19] = i21;
        }
        int i22 = 0;
        for (int i23 = 0; i23 < 8; i23++) {
            for (int i24 = 0; i24 < 8; i24++) {
                this.f104149f[i22] = 1.0d / (((this.f104148e[i22] * dArr[i23]) * dArr[i24]) * 8.0d);
                i22++;
            }
        }
        Object[] objArr = this.f104144a;
        objArr[0] = this.f104146c;
        Object[] objArr2 = this.f104145b;
        objArr2[0] = this.f104147d;
        objArr[1] = this.f104148e;
        objArr2[1] = this.f104149f;
    }

    /* renamed from: c */
    private void m110715c() {
        int[] iArr = this.f104148e;
        iArr[0] = 17;
        iArr[1] = 18;
        iArr[2] = 24;
        iArr[3] = 47;
        iArr[4] = 99;
        iArr[5] = 99;
        iArr[6] = 99;
        iArr[7] = 99;
        iArr[8] = 18;
        iArr[9] = 21;
        iArr[10] = 26;
        iArr[11] = 66;
        iArr[12] = 99;
        iArr[13] = 99;
        iArr[14] = 99;
        iArr[15] = 99;
        iArr[16] = 24;
        iArr[17] = 26;
        iArr[18] = 56;
        iArr[19] = 99;
        iArr[20] = 99;
        iArr[21] = 99;
        iArr[22] = 99;
        iArr[23] = 99;
        iArr[24] = 47;
        iArr[25] = 66;
        iArr[26] = 99;
        iArr[27] = 99;
        iArr[28] = 99;
        iArr[29] = 99;
        iArr[30] = 99;
        iArr[31] = 99;
        iArr[32] = 99;
        iArr[33] = 99;
        iArr[34] = 99;
        iArr[35] = 99;
        iArr[36] = 99;
        iArr[37] = 99;
        iArr[38] = 99;
        iArr[39] = 99;
        iArr[40] = 99;
        iArr[41] = 99;
        iArr[42] = 99;
        iArr[43] = 99;
        iArr[44] = 99;
        iArr[45] = 99;
        iArr[46] = 99;
        iArr[47] = 99;
        iArr[48] = 99;
        iArr[49] = 99;
        iArr[50] = 99;
        iArr[51] = 99;
        iArr[52] = 99;
        iArr[53] = 99;
        iArr[54] = 99;
        iArr[55] = 99;
        iArr[56] = 99;
        iArr[57] = 99;
        iArr[58] = 99;
        iArr[59] = 99;
        iArr[60] = 99;
        iArr[61] = 99;
        iArr[62] = 99;
        iArr[63] = 99;
    }

    /* renamed from: d */
    private void m110716d() {
        int[] iArr = this.f104146c;
        iArr[0] = 16;
        iArr[1] = 11;
        iArr[2] = 10;
        iArr[3] = 16;
        iArr[4] = 24;
        iArr[5] = 40;
        iArr[6] = 51;
        iArr[7] = 61;
        iArr[8] = 12;
        iArr[9] = 12;
        iArr[10] = 14;
        iArr[11] = 19;
        iArr[12] = 26;
        iArr[13] = 58;
        iArr[14] = 60;
        iArr[15] = 55;
        iArr[16] = 14;
        iArr[17] = 13;
        iArr[18] = 16;
        iArr[19] = 24;
        iArr[20] = 40;
        iArr[21] = 57;
        iArr[22] = 69;
        iArr[23] = 56;
        iArr[24] = 14;
        iArr[25] = 17;
        iArr[26] = 22;
        iArr[27] = 29;
        iArr[28] = 51;
        iArr[29] = 87;
        iArr[30] = 80;
        iArr[31] = 62;
        iArr[32] = 18;
        iArr[33] = 22;
        iArr[34] = 37;
        iArr[35] = 56;
        iArr[36] = 68;
        iArr[37] = 109;
        iArr[38] = 103;
        iArr[39] = 77;
        iArr[40] = 24;
        iArr[41] = 35;
        iArr[42] = 55;
        iArr[43] = 64;
        iArr[44] = 81;
        iArr[45] = 104;
        iArr[46] = 113;
        iArr[47] = 92;
        iArr[48] = 49;
        iArr[49] = 64;
        iArr[50] = 78;
        iArr[51] = 87;
        iArr[52] = 103;
        iArr[53] = 121;
        iArr[54] = 120;
        iArr[55] = 101;
        iArr[56] = 72;
        iArr[57] = 92;
        iArr[58] = 95;
        iArr[59] = 98;
        iArr[60] = 112;
        iArr[61] = 100;
        iArr[62] = 103;
        iArr[63] = 99;
    }

    /* renamed from: a */
    public double[][] m110717a(float[][] fArr) {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 8, 8);
        for (int i11 = 0; i11 < 8; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                dArr[i11][i12] = fArr[i11][i12] - 128.0d;
            }
        }
        for (int i13 = 0; i13 < 8; i13++) {
            double[] dArr2 = dArr[i13];
            double d11 = dArr2[0];
            double d12 = dArr2[7];
            double d13 = d11 + d12;
            double d14 = d11 - d12;
            double d15 = dArr2[1];
            double d16 = dArr2[6];
            double d17 = d15 + d16;
            double d18 = d15 - d16;
            double d19 = dArr2[2];
            double d21 = dArr2[5];
            double d22 = d19 + d21;
            double d23 = d19 - d21;
            double d24 = dArr2[3];
            double d25 = dArr2[4];
            double d26 = d24 + d25;
            double d27 = d24 - d25;
            double d28 = d13 + d26;
            double d29 = d13 - d26;
            double d31 = d17 + d22;
            dArr2[0] = d28 + d31;
            dArr2[4] = d28 - d31;
            double d32 = ((d17 - d22) + d29) * 0.707106781d;
            dArr2[2] = d29 + d32;
            dArr2[6] = d29 - d32;
            double d33 = d27 + d23;
            double d34 = d23 + d18;
            double d35 = d18 + d14;
            double d36 = (d33 - d35) * 0.382683433d;
            double d37 = (d33 * 0.5411961d) + d36;
            double d38 = (d35 * 1.306562965d) + d36;
            double d39 = d34 * 0.707106781d;
            double d41 = d14 + d39;
            double d42 = d14 - d39;
            dArr2[5] = d42 + d37;
            dArr2[3] = d42 - d37;
            dArr2[1] = d41 + d38;
            dArr2[7] = d41 - d38;
        }
        for (int i14 = 0; i14 < 8; i14++) {
            double[] dArr3 = dArr[0];
            double d43 = dArr3[i14];
            double[] dArr4 = dArr[7];
            double d44 = dArr4[i14];
            double d45 = d43 + d44;
            double d46 = d43 - d44;
            double[] dArr5 = dArr[1];
            double d47 = dArr5[i14];
            double[] dArr6 = dArr[6];
            double d48 = dArr6[i14];
            double d49 = d47 + d48;
            double d51 = d47 - d48;
            double[] dArr7 = dArr[2];
            double d52 = dArr7[i14];
            double[] dArr8 = dArr[5];
            double d53 = dArr8[i14];
            double d54 = d52 + d53;
            double d55 = d52 - d53;
            double[] dArr9 = dArr[3];
            double d56 = dArr9[i14];
            double[] dArr10 = dArr[4];
            double d57 = dArr10[i14];
            double d58 = d56 + d57;
            double d59 = d56 - d57;
            double d61 = d45 + d58;
            double d62 = d45 - d58;
            double d63 = d49 + d54;
            dArr3[i14] = d61 + d63;
            dArr10[i14] = d61 - d63;
            double d64 = ((d49 - d54) + d62) * 0.707106781d;
            dArr7[i14] = d62 + d64;
            dArr6[i14] = d62 - d64;
            double d65 = d59 + d55;
            double d66 = d55 + d51;
            double d67 = d51 + d46;
            double d68 = (d65 - d67) * 0.382683433d;
            double d69 = (d65 * 0.5411961d) + d68;
            double d71 = (d67 * 1.306562965d) + d68;
            double d72 = d66 * 0.707106781d;
            double d73 = d46 + d72;
            double d74 = d46 - d72;
            dArr8[i14] = d74 + d69;
            dArr9[i14] = d74 - d69;
            dArr5[i14] = d73 + d71;
            dArr4[i14] = d73 - d71;
        }
        return dArr;
    }

    /* renamed from: e */
    public int[] m110718e(double[][] dArr, int i11) {
        int[] iArr = new int[64];
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            for (int i14 = 0; i14 < 8; i14++) {
                iArr[i12] = (int) Math.round(dArr[i13][i14] * ((double[]) this.f104145b[i11])[i12]);
                i12++;
            }
        }
        return iArr;
    }
}
