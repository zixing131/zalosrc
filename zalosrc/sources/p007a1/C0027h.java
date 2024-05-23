package p007a1;

import java.util.Arrays;

/* renamed from: a1.h */
/* loaded from: classes2.dex */
public class C0027h {

    /* renamed from: c */
    double[] f105c;

    /* renamed from: d */
    String f106d;

    /* renamed from: e */
    C0026g f107e;

    /* renamed from: f */
    int f108f;

    /* renamed from: a */
    float[] f103a = new float[0];

    /* renamed from: b */
    double[] f104b = new double[0];

    /* renamed from: g */
    double f109g = 6.283185307179586d;

    /* renamed from: h */
    private boolean f110h = false;

    /* renamed from: a */
    public void m79a(double d11, float f11) {
        int length = this.f103a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f104b, d11);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f104b = Arrays.copyOf(this.f104b, length);
        this.f103a = Arrays.copyOf(this.f103a, length);
        this.f105c = new double[length];
        double[] dArr = this.f104b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f104b[binarySearch] = d11;
        this.f103a[binarySearch] = f11;
        this.f110h = false;
    }

    /* renamed from: b */
    double m80b(double d11) {
        if (d11 <= 0.0d) {
            d11 = 1.0E-5d;
        } else if (d11 >= 1.0d) {
            d11 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f104b, d11);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i11 = -binarySearch;
        int i12 = i11 - 1;
        float[] fArr = this.f103a;
        float f11 = fArr[i12];
        int i13 = i11 - 2;
        float f12 = fArr[i13];
        double[] dArr = this.f104b;
        double d12 = dArr[i12];
        double d13 = dArr[i13];
        double d14 = (f11 - f12) / (d12 - d13);
        return (d11 * d14) + (f12 - (d14 * d13));
    }

    /* renamed from: c */
    double m81c(double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        } else if (d11 > 1.0d) {
            d11 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f104b, d11);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i11 = -binarySearch;
        int i12 = i11 - 1;
        float[] fArr = this.f103a;
        float f11 = fArr[i12];
        int i13 = i11 - 2;
        float f12 = fArr[i13];
        double[] dArr = this.f104b;
        double d12 = dArr[i12];
        double d13 = dArr[i13];
        double d14 = (f11 - f12) / (d12 - d13);
        return this.f105c[i13] + ((f12 - (d14 * d13)) * (d11 - d13)) + ((d14 * ((d11 * d11) - (d13 * d13))) / 2.0d);
    }

    /* renamed from: d */
    public double m82d(double d11, double d12, double d13) {
        double m81c = d12 + m81c(d11);
        double m80b = m80b(d11) + d13;
        switch (this.f108f) {
            case 1:
                return 0.0d;
            case 2:
                return m80b * 4.0d * Math.signum((((m81c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return m80b * 2.0d;
            case 4:
                return (-m80b) * 2.0d;
            case 5:
                double d14 = this.f109g;
                return (-d14) * m80b * Math.sin(d14 * m81c);
            case 6:
                return m80b * 4.0d * ((((m81c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f107e.mo43f(m81c % 1.0d, 0);
            default:
                double d15 = this.f109g;
                return m80b * d15 * Math.cos(d15 * m81c);
        }
    }

    /* renamed from: e */
    public double m83e(double d11, double d12) {
        double abs;
        double m81c = m81c(d11) + d12;
        switch (this.f108f) {
            case 1:
                return Math.signum(0.5d - (m81c % 1.0d));
            case 2:
                abs = Math.abs((((m81c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m81c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((m81c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f109g * (d12 + m81c));
            case 6:
                double abs2 = 1.0d - Math.abs(((m81c * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f107e.mo40c(m81c % 1.0d, 0);
            default:
                return Math.sin(this.f109g * m81c);
        }
        return 1.0d - abs;
    }

    /* renamed from: f */
    public void m84f() {
        double d11 = 0.0d;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f103a.length) {
                break;
            }
            d11 += r7[i11];
            i11++;
        }
        double d12 = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr = this.f103a;
            if (i12 >= fArr.length) {
                break;
            }
            int i13 = i12 - 1;
            float f11 = (fArr[i13] + fArr[i12]) / 2.0f;
            double[] dArr = this.f104b;
            d12 += (dArr[i12] - dArr[i13]) * f11;
            i12++;
        }
        int i14 = 0;
        while (true) {
            float[] fArr2 = this.f103a;
            if (i14 >= fArr2.length) {
                break;
            }
            fArr2[i14] = (float) (fArr2[i14] * (d11 / d12));
            i14++;
        }
        this.f105c[0] = 0.0d;
        int i15 = 1;
        while (true) {
            float[] fArr3 = this.f103a;
            if (i15 < fArr3.length) {
                int i16 = i15 - 1;
                float f12 = (fArr3[i16] + fArr3[i15]) / 2.0f;
                double[] dArr2 = this.f104b;
                double d13 = dArr2[i15] - dArr2[i16];
                double[] dArr3 = this.f105c;
                dArr3[i15] = dArr3[i16] + (d13 * f12);
                i15++;
            } else {
                this.f110h = true;
                return;
            }
        }
    }

    /* renamed from: g */
    public void m85g(int i11, String str) {
        this.f108f = i11;
        this.f106d = str;
        if (str != null) {
            this.f107e = C0026g.m75i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f104b) + " period=" + Arrays.toString(this.f103a);
    }
}
