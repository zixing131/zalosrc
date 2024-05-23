package i00;

import java.io.Serializable;

/* renamed from: i00.a */
/* loaded from: classes4.dex */
public class C20178a implements Serializable {

    /* renamed from: p */
    private final double[][] f99702p;

    /* renamed from: q */
    private final int f99703q;

    /* renamed from: r */
    private final int f99704r;

    /* renamed from: s */
    private int f99705s;

    /* renamed from: t */
    private final int[] f99706t;

    public C20178a(C20180c c20180c) {
        int i11;
        boolean z11;
        boolean z12;
        this.f99702p = c20180c.m105270f();
        int m105275k = c20180c.m105275k();
        this.f99703q = m105275k;
        this.f99704r = c20180c.m105271g();
        this.f99706t = new int[m105275k];
        int i12 = 0;
        while (true) {
            i11 = this.f99703q;
            if (i12 >= i11) {
                break;
            }
            this.f99706t[i12] = i12;
            i12++;
        }
        this.f99705s = 1;
        double[] dArr = new double[i11];
        int i13 = 0;
        while (i13 < this.f99704r) {
            for (int i14 = 0; i14 < this.f99703q; i14++) {
                dArr[i14] = this.f99702p[i14][i13];
            }
            int i15 = 0;
            while (true) {
                double d11 = 0.0d;
                if (i15 >= this.f99703q) {
                    break;
                }
                double[] dArr2 = this.f99702p[i15];
                int min = Math.min(i15, i13);
                for (int i16 = 0; i16 < min; i16++) {
                    d11 += dArr2[i16] * dArr[i16];
                }
                double d12 = dArr[i15] - d11;
                dArr[i15] = d12;
                dArr2[i13] = d12;
                i15++;
            }
            int i17 = i13 + 1;
            int i18 = i13;
            for (int i19 = i17; i19 < this.f99703q; i19++) {
                if (Math.abs(dArr[i19]) > Math.abs(dArr[i18])) {
                    i18 = i19;
                }
            }
            if (i18 != i13) {
                for (int i21 = 0; i21 < this.f99704r; i21++) {
                    double[][] dArr3 = this.f99702p;
                    double[] dArr4 = dArr3[i18];
                    double d13 = dArr4[i21];
                    double[] dArr5 = dArr3[i13];
                    dArr4[i21] = dArr5[i21];
                    dArr5[i21] = d13;
                }
                int[] iArr = this.f99706t;
                int i22 = iArr[i18];
                iArr[i18] = iArr[i13];
                iArr[i13] = i22;
                this.f99705s = -this.f99705s;
            }
            if (i13 < this.f99703q) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f99702p[i13][i13] != 0.0d) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 & z12) {
                for (int i23 = i17; i23 < this.f99703q; i23++) {
                    double[][] dArr6 = this.f99702p;
                    double[] dArr7 = dArr6[i23];
                    dArr7[i13] = dArr7[i13] / dArr6[i13][i13];
                }
            }
            i13 = i17;
        }
    }

    /* renamed from: a */
    public boolean m105260a() {
        for (int i11 = 0; i11 < this.f99704r; i11++) {
            if (this.f99702p[i11][i11] == 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public C20180c m105261b(C20180c c20180c) {
        int i11;
        if (c20180c.m105275k() == this.f99703q) {
            if (m105260a()) {
                int m105271g = c20180c.m105271g();
                C20180c m105274j = c20180c.m105274j(this.f99706t, 0, m105271g - 1);
                double[][] m105269e = m105274j.m105269e();
                int i12 = 0;
                while (true) {
                    i11 = this.f99704r;
                    if (i12 >= i11) {
                        break;
                    }
                    int i13 = i12 + 1;
                    for (int i14 = i13; i14 < this.f99704r; i14++) {
                        for (int i15 = 0; i15 < m105271g; i15++) {
                            double[] dArr = m105269e[i14];
                            dArr[i15] = dArr[i15] - (m105269e[i12][i15] * this.f99702p[i14][i12]);
                        }
                    }
                    i12 = i13;
                }
                for (int i16 = i11 - 1; i16 >= 0; i16--) {
                    for (int i17 = 0; i17 < m105271g; i17++) {
                        double[] dArr2 = m105269e[i16];
                        dArr2[i17] = dArr2[i17] / this.f99702p[i16][i16];
                    }
                    for (int i18 = 0; i18 < i16; i18++) {
                        for (int i19 = 0; i19 < m105271g; i19++) {
                            double[] dArr3 = m105269e[i18];
                            dArr3[i19] = dArr3[i19] - (m105269e[i16][i19] * this.f99702p[i18][i16]);
                        }
                    }
                }
                return m105274j;
            }
            throw new RuntimeException("Matrix is singular.");
        }
        throw new IllegalArgumentException("Matrix row dimensions must agree.");
    }
}
