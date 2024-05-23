package p007a1;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: a1.g */
/* loaded from: classes2.dex */
public class C0026g extends AbstractC0021b {

    /* renamed from: a */
    private double[] f98a;

    /* renamed from: b */
    private double[][] f99b;

    /* renamed from: c */
    private double[][] f100c;

    /* renamed from: d */
    private boolean f101d = true;

    /* renamed from: e */
    double[] f102e;

    public C0026g(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f102e = new double[length2];
        int i11 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i11, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i13 + 1;
                double d11 = dArr[i14] - dArr[i13];
                double[] dArr5 = dArr3[i13];
                double d12 = (dArr2[i14][i12] - dArr2[i13][i12]) / d11;
                dArr5[i12] = d12;
                if (i13 == 0) {
                    dArr4[i13][i12] = d12;
                } else {
                    dArr4[i13][i12] = (dArr3[i13 - 1][i12] + d12) * 0.5d;
                }
                i13 = i14;
            }
            dArr4[i11][i12] = dArr3[length - 2][i12];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < length2; i16++) {
                double d13 = dArr3[i15][i16];
                if (d13 == 0.0d) {
                    dArr4[i15][i16] = 0.0d;
                    dArr4[i15 + 1][i16] = 0.0d;
                } else {
                    double d14 = dArr4[i15][i16] / d13;
                    int i17 = i15 + 1;
                    double d15 = dArr4[i17][i16] / d13;
                    double hypot = Math.hypot(d14, d15);
                    if (hypot > 9.0d) {
                        double d16 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i15];
                        double[] dArr7 = dArr3[i15];
                        dArr6[i16] = d14 * d16 * dArr7[i16];
                        dArr4[i17][i16] = d16 * d15 * dArr7[i16];
                    }
                }
            }
        }
        this.f98a = dArr;
        this.f99b = dArr2;
        this.f100c = dArr4;
    }

    /* renamed from: i */
    public static C0026g m75i(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i11 = 0;
        while (indexOf2 != -1) {
            dArr[i11] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i11++;
        }
        dArr[i11] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return m76j(Arrays.copyOf(dArr, i11 + 1));
    }

    /* renamed from: j */
    private static C0026g m76j(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d11 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < dArr.length; i11++) {
            double d12 = dArr[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d12;
            double d13 = i11 * d11;
            dArr3[i12] = d13;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d12 + 1.0d;
                dArr3[i13] = d13 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d12 - 1.0d) - d11;
                dArr3[i14] = (d13 - 1.0d) - d11;
            }
        }
        return new C0026g(dArr3, dArr2);
    }

    /* renamed from: k */
    private static double m77k(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d12 * d12;
        double d18 = d12 * 6.0d;
        double d19 = 3.0d * d11;
        return ((((((((((-6.0d) * d17) * d14) + (d18 * d14)) + ((6.0d * d17) * d13)) - (d18 * d13)) + ((d19 * d16) * d17)) + ((d19 * d15) * d17)) - (((2.0d * d11) * d16) * d12)) - (((4.0d * d11) * d15) * d12)) + (d11 * d15);
    }

    /* renamed from: l */
    private static double m78l(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d12 * d12;
        double d18 = d17 * d12;
        double d19 = 3.0d * d17;
        double d21 = ((((((-2.0d) * d18) * d14) + (d19 * d14)) + ((d18 * 2.0d) * d13)) - (d19 * d13)) + d13;
        double d22 = d11 * d16;
        double d23 = d11 * d15;
        return ((((d21 + (d22 * d18)) + (d18 * d23)) - (d22 * d17)) - (((d11 * 2.0d) * d15) * d17)) + (d23 * d12);
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: c */
    public double mo40c(double d11, int i11) {
        double d12;
        double d13;
        double mo43f;
        double[] dArr = this.f98a;
        int length = dArr.length;
        int i12 = 0;
        if (this.f101d) {
            double d14 = dArr[0];
            if (d11 <= d14) {
                d12 = this.f99b[0][i11];
                d13 = d11 - d14;
                mo43f = mo43f(d14, i11);
            } else {
                int i13 = length - 1;
                double d15 = dArr[i13];
                if (d11 >= d15) {
                    d12 = this.f99b[i13][i11];
                    d13 = d11 - d15;
                    mo43f = mo43f(d15, i11);
                }
            }
            return d12 + (d13 * mo43f);
        }
        if (d11 <= dArr[0]) {
            return this.f99b[0][i11];
        }
        int i14 = length - 1;
        if (d11 >= dArr[i14]) {
            return this.f99b[i14][i11];
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f98a;
            double d16 = dArr2[i12];
            if (d11 == d16) {
                return this.f99b[i12][i11];
            }
            int i15 = i12 + 1;
            double d17 = dArr2[i15];
            if (d11 < d17) {
                double d18 = d17 - d16;
                double d19 = (d11 - d16) / d18;
                double[][] dArr3 = this.f99b;
                double d21 = dArr3[i12][i11];
                double d22 = dArr3[i15][i11];
                double[][] dArr4 = this.f100c;
                return m78l(d18, d19, d21, d22, dArr4[i12][i11], dArr4[i15][i11]);
            }
            i12 = i15;
        }
        return 0.0d;
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: d */
    public void mo41d(double d11, double[] dArr) {
        double[] dArr2 = this.f98a;
        int length = dArr2.length;
        int i11 = 0;
        int length2 = this.f99b[0].length;
        if (this.f101d) {
            double d12 = dArr2[0];
            if (d11 <= d12) {
                mo44g(d12, this.f102e);
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f99b[0][i12] + ((d11 - this.f98a[0]) * this.f102e[i12]);
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr2[i13];
            if (d11 >= d13) {
                mo44g(d13, this.f102e);
                while (i11 < length2) {
                    dArr[i11] = this.f99b[i13][i11] + ((d11 - this.f98a[i13]) * this.f102e[i11]);
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr2[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f99b[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr2[i15]) {
                while (i11 < length2) {
                    dArr[i11] = this.f99b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f98a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = this.f99b[i16][i17];
                }
            }
            double[] dArr3 = this.f98a;
            int i18 = i16 + 1;
            double d14 = dArr3[i18];
            if (d11 < d14) {
                double d15 = dArr3[i16];
                double d16 = d14 - d15;
                double d17 = (d11 - d15) / d16;
                while (i11 < length2) {
                    double[][] dArr4 = this.f99b;
                    double d18 = dArr4[i16][i11];
                    double d19 = dArr4[i18][i11];
                    double[][] dArr5 = this.f100c;
                    dArr[i11] = m78l(d16, d17, d18, d19, dArr5[i16][i11], dArr5[i18][i11]);
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: e */
    public void mo42e(double d11, float[] fArr) {
        double[] dArr = this.f98a;
        int length = dArr.length;
        int i11 = 0;
        int length2 = this.f99b[0].length;
        if (this.f101d) {
            double d12 = dArr[0];
            if (d11 <= d12) {
                mo44g(d12, this.f102e);
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) (this.f99b[0][i12] + ((d11 - this.f98a[0]) * this.f102e[i12]));
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr[i13];
            if (d11 >= d13) {
                mo44g(d13, this.f102e);
                while (i11 < length2) {
                    fArr[i11] = (float) (this.f99b[i13][i11] + ((d11 - this.f98a[i13]) * this.f102e[i11]));
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f99b[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr[i15]) {
                while (i11 < length2) {
                    fArr[i11] = (float) this.f99b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f98a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) this.f99b[i16][i17];
                }
            }
            double[] dArr2 = this.f98a;
            int i18 = i16 + 1;
            double d14 = dArr2[i18];
            if (d11 < d14) {
                double d15 = dArr2[i16];
                double d16 = d14 - d15;
                double d17 = (d11 - d15) / d16;
                while (i11 < length2) {
                    double[][] dArr3 = this.f99b;
                    double d18 = dArr3[i16][i11];
                    double d19 = dArr3[i18][i11];
                    double[][] dArr4 = this.f100c;
                    fArr[i11] = (float) m78l(d16, d17, d18, d19, dArr4[i16][i11], dArr4[i18][i11]);
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: f */
    public double mo43f(double d11, int i11) {
        double[] dArr = this.f98a;
        int length = dArr.length;
        int i12 = 0;
        double d12 = dArr[0];
        if (d11 >= d12) {
            d12 = dArr[length - 1];
            if (d11 < d12) {
                d12 = d11;
            }
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f98a;
            int i13 = i12 + 1;
            double d13 = dArr2[i13];
            if (d12 <= d13) {
                double d14 = dArr2[i12];
                double d15 = d13 - d14;
                double[][] dArr3 = this.f99b;
                double d16 = dArr3[i12][i11];
                double d17 = dArr3[i13][i11];
                double[][] dArr4 = this.f100c;
                return m77k(d15, (d12 - d14) / d15, d16, d17, dArr4[i12][i11], dArr4[i13][i11]) / d15;
            }
            i12 = i13;
        }
        return 0.0d;
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: g */
    public void mo44g(double d11, double[] dArr) {
        double[] dArr2 = this.f98a;
        int length = dArr2.length;
        int length2 = this.f99b[0].length;
        double d12 = dArr2[0];
        if (d11 > d12) {
            d12 = dArr2[length - 1];
            if (d11 < d12) {
                d12 = d11;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            double[] dArr3 = this.f98a;
            int i12 = i11 + 1;
            double d13 = dArr3[i12];
            if (d12 <= d13) {
                double d14 = dArr3[i11];
                double d15 = d13 - d14;
                double d16 = (d12 - d14) / d15;
                for (int i13 = 0; i13 < length2; i13++) {
                    double[][] dArr4 = this.f99b;
                    double d17 = dArr4[i11][i13];
                    double d18 = dArr4[i12][i13];
                    double[][] dArr5 = this.f100c;
                    dArr[i13] = m77k(d15, d16, d17, d18, dArr5[i11][i13], dArr5[i12][i13]) / d15;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: h */
    public double[] mo45h() {
        return this.f98a;
    }
}
