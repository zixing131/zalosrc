package p007a1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: a1.j */
/* loaded from: classes2.dex */
public abstract class AbstractC0029j {

    /* renamed from: a */
    protected AbstractC0021b f113a;

    /* renamed from: b */
    protected int[] f114b = new int[10];

    /* renamed from: c */
    protected float[] f115c = new float[10];

    /* renamed from: d */
    private int f116d;

    /* renamed from: e */
    private String f117e;

    /* renamed from: a1.j$a */
    /* loaded from: classes2.dex */
    private static class a {
        /* renamed from: a */
        static void m93a(int[] iArr, float[] fArr, int i11, int i12) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = iArr2[i13 - 1];
                int i15 = i13 - 2;
                int i16 = iArr2[i15];
                if (i14 < i16) {
                    int m94b = m94b(iArr, fArr, i14, i16);
                    iArr2[i15] = m94b - 1;
                    iArr2[i13 - 1] = i14;
                    int i17 = i13 + 1;
                    iArr2[i13] = i16;
                    i13 += 2;
                    iArr2[i17] = m94b + 1;
                } else {
                    i13 = i15;
                }
            }
        }

        /* renamed from: b */
        private static int m94b(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    m95c(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            m95c(iArr, fArr, i14, i12);
            return i14;
        }

        /* renamed from: c */
        private static void m95c(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float f11 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = f11;
        }
    }

    /* renamed from: a */
    public float m88a(float f11) {
        return (float) this.f113a.mo40c(f11, 0);
    }

    /* renamed from: b */
    public float m89b(float f11) {
        return (float) this.f113a.mo43f(f11, 0);
    }

    /* renamed from: c */
    public void mo90c(int i11, float f11) {
        int[] iArr = this.f114b;
        if (iArr.length < this.f116d + 1) {
            this.f114b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f115c;
            this.f115c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f114b;
        int i12 = this.f116d;
        iArr2[i12] = i11;
        this.f115c[i12] = f11;
        this.f116d = i12 + 1;
    }

    /* renamed from: d */
    public void m91d(String str) {
        this.f117e = str;
    }

    /* renamed from: e */
    public void mo92e(int i11) {
        int i12 = this.f116d;
        if (i12 == 0) {
            return;
        }
        a.m93a(this.f114b, this.f115c, 0, i12 - 1);
        int i13 = 1;
        for (int i14 = 1; i14 < this.f116d; i14++) {
            int[] iArr = this.f114b;
            if (iArr[i14 - 1] != iArr[i14]) {
                i13++;
            }
        }
        double[] dArr = new double[i13];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i13, 1);
        int i15 = 0;
        for (int i16 = 0; i16 < this.f116d; i16++) {
            if (i16 > 0) {
                int[] iArr2 = this.f114b;
                if (iArr2[i16] == iArr2[i16 - 1]) {
                }
            }
            dArr[i15] = this.f114b[i16] * 0.01d;
            dArr2[i15][0] = this.f115c[i16];
            i15++;
        }
        this.f113a = AbstractC0021b.m57a(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.f117e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f116d; i11++) {
            str = str + "[" + this.f114b[i11] + " , " + decimalFormat.format(this.f115c[i11]) + "] ";
        }
        return str;
    }
}
