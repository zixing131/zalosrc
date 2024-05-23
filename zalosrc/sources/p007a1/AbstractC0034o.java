package p007a1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* renamed from: a1.o */
/* loaded from: classes2.dex */
public abstract class AbstractC0034o {

    /* renamed from: k */
    protected static float f145k = 6.2831855f;

    /* renamed from: a */
    protected AbstractC0021b f146a;

    /* renamed from: e */
    protected int f150e;

    /* renamed from: f */
    protected String f151f;

    /* renamed from: i */
    protected long f154i;

    /* renamed from: b */
    protected int f147b = 0;

    /* renamed from: c */
    protected int[] f148c = new int[10];

    /* renamed from: d */
    protected float[][] f149d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g */
    protected float[] f152g = new float[3];

    /* renamed from: h */
    protected boolean f153h = false;

    /* renamed from: j */
    protected float f155j = Float.NaN;

    /* renamed from: a1.o$a */
    /* loaded from: classes2.dex */
    protected static class a {
        /* renamed from: a */
        static void m109a(int[] iArr, float[][] fArr, int i11, int i12) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = iArr2[i13 - 1];
                int i15 = i13 - 2;
                int i16 = iArr2[i15];
                if (i14 < i16) {
                    int m110b = m110b(iArr, fArr, i14, i16);
                    iArr2[i15] = m110b - 1;
                    iArr2[i13 - 1] = i14;
                    int i17 = i13 + 1;
                    iArr2[i13] = i16;
                    i13 += 2;
                    iArr2[i17] = m110b + 1;
                } else {
                    i13 = i15;
                }
            }
        }

        /* renamed from: b */
        private static int m110b(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    m111c(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            m111c(iArr, fArr, i14, i12);
            return i14;
        }

        /* renamed from: c */
        private static void m111c(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float[] fArr2 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = fArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public float m105a(float f11) {
        float abs;
        switch (this.f147b) {
            case 1:
                return Math.signum(f11 * f145k);
            case 2:
                abs = Math.abs(f11);
                break;
            case 3:
                return (((f11 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f11 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f11 * f145k);
            case 6:
                float abs2 = 1.0f - Math.abs(((f11 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f11 * f145k);
        }
        return 1.0f - abs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m106b(long j11) {
        this.f154i = j11;
    }

    /* renamed from: c */
    public void m107c(String str) {
        this.f151f = str;
    }

    /* renamed from: d */
    public void mo108d(int i11) {
        int i12 = this.f150e;
        if (i12 == 0) {
            System.err.println("Error no points added to " + this.f151f);
            return;
        }
        a.m109a(this.f148c, this.f149d, 0, i12 - 1);
        int i13 = 1;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f148c;
            if (i13 >= iArr.length) {
                break;
            }
            if (iArr[i13] != iArr[i13 - 1]) {
                i14++;
            }
            i13++;
        }
        if (i14 == 0) {
            i14 = 1;
        }
        double[] dArr = new double[i14];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i14, 3);
        int i15 = 0;
        for (int i16 = 0; i16 < this.f150e; i16++) {
            if (i16 > 0) {
                int[] iArr2 = this.f148c;
                if (iArr2[i16] == iArr2[i16 - 1]) {
                }
            }
            dArr[i15] = this.f148c[i16] * 0.01d;
            double[] dArr3 = dArr2[i15];
            float[] fArr = this.f149d[i16];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i15++;
        }
        this.f146a = AbstractC0021b.m57a(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.f151f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f150e; i11++) {
            str = str + "[" + this.f148c[i11] + " , " + decimalFormat.format(this.f149d[i11]) + "] ";
        }
        return str;
    }
}
