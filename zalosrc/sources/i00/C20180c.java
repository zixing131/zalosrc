package i00;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Locale;

/* renamed from: i00.c */
/* loaded from: classes4.dex */
public class C20180c implements Cloneable, Serializable {

    /* renamed from: p */
    private final double[][] f99707p;

    /* renamed from: q */
    private final int f99708q;

    /* renamed from: r */
    private final int f99709r;

    public C20180c(int i11, int i12) {
        this.f99708q = i11;
        this.f99709r = i12;
        this.f99707p = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i11, i12);
    }

    /* renamed from: a */
    public static C20180c m105263a(double[][] dArr) {
        int length = dArr.length;
        int length2 = dArr[0].length;
        C20180c c20180c = new C20180c(length, length2);
        double[][] m105269e = c20180c.m105269e();
        for (int i11 = 0; i11 < length; i11++) {
            double[] dArr2 = dArr[i11];
            if (dArr2.length == length2) {
                System.arraycopy(dArr2, 0, m105269e[i11], 0, length2);
            } else {
                throw new IllegalArgumentException("All rows must have the same length.");
            }
        }
        return c20180c;
    }

    /* renamed from: l */
    public static C20180c m105264l(int i11, int i12) {
        double d11;
        C20180c c20180c = new C20180c(i11, i12);
        double[][] m105269e = c20180c.m105269e();
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                double[] dArr = m105269e[i13];
                if (i13 == i14) {
                    d11 = 1.0d;
                } else {
                    d11 = 0.0d;
                }
                dArr[i14] = d11;
            }
        }
        return c20180c;
    }

    /* renamed from: n */
    private String m105265n() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f99708q; i11++) {
            sb2.append("[");
            for (int i12 = 0; i12 < this.f99709r; i12++) {
                sb2.append(String.format(Locale.getDefault(), "%.5f", Double.valueOf(this.f99707p[i11][i12])));
                sb2.append(',');
            }
            sb2.append("], ");
        }
        return sb2.toString();
    }

    /* renamed from: o */
    public static C20180c m105266o(double d11) {
        return m105263a(new double[][]{new double[]{Math.cos(d11), -Math.sin(d11), 0.0d}, new double[]{Math.sin(d11), Math.cos(d11), 0.0d}, new double[]{0.0d, 0.0d, 1.0d}});
    }

    /* renamed from: b */
    public C20180c m105267b() {
        C20180c c20180c = new C20180c(this.f99708q, this.f99709r);
        double[][] m105269e = c20180c.m105269e();
        for (int i11 = 0; i11 < this.f99708q; i11++) {
            int i12 = this.f99709r;
            if (i12 >= 0) {
                System.arraycopy(this.f99707p[i11], 0, m105269e[i11], 0, i12);
            }
        }
        return c20180c;
    }

    /* renamed from: c */
    public double m105268c(int i11, int i12) {
        return this.f99707p[i11][i12];
    }

    public Object clone() {
        return m105267b();
    }

    /* renamed from: e */
    public double[][] m105269e() {
        return this.f99707p;
    }

    /* renamed from: f */
    public double[][] m105270f() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f99708q, this.f99709r);
        for (int i11 = 0; i11 < this.f99708q; i11++) {
            int i12 = this.f99709r;
            if (i12 >= 0) {
                System.arraycopy(this.f99707p[i11], 0, dArr[i11], 0, i12);
            }
        }
        return dArr;
    }

    /* renamed from: g */
    public int m105271g() {
        return this.f99709r;
    }

    /* renamed from: h */
    public double[] m105272h() {
        double[] dArr = new double[this.f99708q * this.f99709r];
        for (int i11 = 0; i11 < this.f99708q; i11++) {
            for (int i12 = 0; i12 < this.f99709r; i12++) {
                dArr[(this.f99708q * i12) + i11] = this.f99707p[i11][i12];
            }
        }
        return dArr;
    }

    /* renamed from: i */
    public C20180c m105273i(int i11, int i12, int i13, int i14) {
        C20180c c20180c = new C20180c((i12 - i11) + 1, (i14 - i13) + 1);
        double[][] m105269e = c20180c.m105269e();
        for (int i15 = i11; i15 <= i12; i15++) {
            for (int i16 = i13; i16 <= i14; i16++) {
                try {
                    m105269e[i15 - i11][i16 - i13] = this.f99707p[i15][i16];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Submatrix indices");
                }
            }
        }
        return c20180c;
    }

    /* renamed from: j */
    public C20180c m105274j(int[] iArr, int i11, int i12) {
        C20180c c20180c = new C20180c(iArr.length, (i12 - i11) + 1);
        double[][] m105269e = c20180c.m105269e();
        for (int i13 = 0; i13 < iArr.length; i13++) {
            try {
                for (int i14 = i11; i14 <= i12; i14++) {
                    m105269e[i13][i14 - i11] = this.f99707p[iArr[i13]][i14];
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Submatrix indices");
            }
        }
        return c20180c;
    }

    /* renamed from: k */
    public int m105275k() {
        return this.f99708q;
    }

    /* renamed from: m */
    public C20180c m105276m() {
        int i11 = this.f99708q;
        return m105278q(m105264l(i11, i11));
    }

    /* renamed from: p */
    public void m105277p(int i11, int i12, double d11) {
        this.f99707p[i11][i12] = d11;
    }

    /* renamed from: q */
    public C20180c m105278q(C20180c c20180c) {
        if (this.f99708q == this.f99709r) {
            return new C20178a(this).m105261b(c20180c);
        }
        return new C20181d(this).m105281b(c20180c);
    }

    /* renamed from: r */
    public C20180c m105279r(C20180c c20180c) {
        if (c20180c.f99708q == this.f99709r) {
            C20180c c20180c2 = new C20180c(this.f99708q, c20180c.f99709r);
            double[][] m105269e = c20180c2.m105269e();
            double[] dArr = new double[this.f99709r];
            for (int i11 = 0; i11 < c20180c.f99709r; i11++) {
                for (int i12 = 0; i12 < this.f99709r; i12++) {
                    dArr[i12] = c20180c.f99707p[i12][i11];
                }
                for (int i13 = 0; i13 < this.f99708q; i13++) {
                    double[] dArr2 = this.f99707p[i13];
                    double d11 = 0.0d;
                    for (int i14 = 0; i14 < this.f99709r; i14++) {
                        d11 += dArr2[i14] * dArr[i14];
                    }
                    m105269e[i13][i11] = d11;
                }
            }
            return c20180c2;
        }
        throw new IllegalArgumentException("Matrix inner dimensions must agree.");
    }

    public String toString() {
        return "Matrix{m=" + this.f99708q + ", n=" + this.f99709r + ", A=" + m105265n() + '}';
    }

    public C20180c(double[][] dArr) {
        this.f99708q = dArr.length;
        this.f99709r = dArr[0].length;
        for (int i11 = 0; i11 < this.f99708q; i11++) {
            if (dArr[i11].length != this.f99709r) {
                throw new IllegalArgumentException("All rows must have the same length.");
            }
        }
        this.f99707p = dArr;
    }

    public C20180c(double[][] dArr, int i11, int i12) {
        this.f99707p = dArr;
        this.f99708q = i11;
        this.f99709r = i12;
    }

    public C20180c(double[] dArr, int i11) {
        this.f99708q = i11;
        int length = i11 != 0 ? dArr.length / i11 : 0;
        this.f99709r = length;
        if (i11 * length == dArr.length) {
            this.f99707p = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i11, length);
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < this.f99709r; i13++) {
                    this.f99707p[i12][i13] = dArr[(i13 * i11) + i12];
                }
            }
            return;
        }
        throw new IllegalArgumentException("Array length must be a multiple of m.");
    }
}
