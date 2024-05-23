package i00;

import java.io.Serializable;

/* renamed from: i00.d */
/* loaded from: classes4.dex */
public class C20181d implements Serializable {

    /* renamed from: p */
    private final double[][] f99710p;

    /* renamed from: q */
    private final int f99711q;

    /* renamed from: r */
    private final int f99712r;

    /* renamed from: s */
    private final double[] f99713s;

    public C20181d(C20180c c20180c) {
        this.f99710p = c20180c.m105270f();
        this.f99711q = c20180c.m105275k();
        int m105271g = c20180c.m105271g();
        this.f99712r = m105271g;
        this.f99713s = new double[m105271g];
        for (int i11 = 0; i11 < this.f99712r; i11++) {
            double d11 = 0.0d;
            for (int i12 = i11; i12 < this.f99711q; i12++) {
                d11 = AbstractC20179b.m105262a(d11, this.f99710p[i12][i11]);
            }
            if (d11 != 0.0d) {
                d11 = this.f99710p[i11][i11] < 0.0d ? -d11 : d11;
                for (int i13 = i11; i13 < this.f99711q; i13++) {
                    double[] dArr = this.f99710p[i13];
                    dArr[i11] = dArr[i11] / d11;
                }
                double[] dArr2 = this.f99710p[i11];
                dArr2[i11] = dArr2[i11] + 1.0d;
                for (int i14 = i11 + 1; i14 < this.f99712r; i14++) {
                    double d12 = 0.0d;
                    for (int i15 = i11; i15 < this.f99711q; i15++) {
                        double[] dArr3 = this.f99710p[i15];
                        d12 += dArr3[i11] * dArr3[i14];
                    }
                    double d13 = (-d12) / this.f99710p[i11][i11];
                    for (int i16 = i11; i16 < this.f99711q; i16++) {
                        double[] dArr4 = this.f99710p[i16];
                        dArr4[i14] = dArr4[i14] + (dArr4[i11] * d13);
                    }
                }
            }
            this.f99713s[i11] = -d11;
        }
    }

    /* renamed from: a */
    public boolean m105280a() {
        for (int i11 = 0; i11 < this.f99712r; i11++) {
            if (this.f99713s[i11] == 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public C20180c m105281b(C20180c c20180c) {
        int i11;
        if (c20180c.m105275k() == this.f99711q) {
            if (m105280a()) {
                int m105271g = c20180c.m105271g();
                double[][] m105270f = c20180c.m105270f();
                int i12 = 0;
                while (true) {
                    i11 = this.f99712r;
                    if (i12 >= i11) {
                        break;
                    }
                    for (int i13 = 0; i13 < m105271g; i13++) {
                        double d11 = 0.0d;
                        for (int i14 = i12; i14 < this.f99711q; i14++) {
                            d11 += this.f99710p[i14][i12] * m105270f[i14][i13];
                        }
                        double d12 = (-d11) / this.f99710p[i12][i12];
                        for (int i15 = i12; i15 < this.f99711q; i15++) {
                            double[] dArr = m105270f[i15];
                            dArr[i13] = dArr[i13] + (this.f99710p[i15][i12] * d12);
                        }
                    }
                    i12++;
                }
                for (int i16 = i11 - 1; i16 >= 0; i16--) {
                    for (int i17 = 0; i17 < m105271g; i17++) {
                        double[] dArr2 = m105270f[i16];
                        dArr2[i17] = dArr2[i17] / this.f99713s[i16];
                    }
                    for (int i18 = 0; i18 < i16; i18++) {
                        for (int i19 = 0; i19 < m105271g; i19++) {
                            double[] dArr3 = m105270f[i18];
                            dArr3[i19] = dArr3[i19] - (m105270f[i16][i19] * this.f99710p[i18][i16]);
                        }
                    }
                }
                return new C20180c(m105270f, this.f99712r, m105271g).m105273i(0, this.f99712r - 1, 0, m105271g - 1);
            }
            throw new RuntimeException("Matrix is rank deficient.");
        }
        throw new IllegalArgumentException("Matrix row dimensions must agree.");
    }
}
