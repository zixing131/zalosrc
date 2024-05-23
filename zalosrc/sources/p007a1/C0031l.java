package p007a1;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: a1.l */
/* loaded from: classes2.dex */
public class C0031l extends C0022c {

    /* renamed from: d */
    C0026g f129d;

    public C0031l(String str) {
        this.f61a = str;
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
        this.f129d = m100d(Arrays.copyOf(dArr, i11 + 1));
    }

    /* renamed from: d */
    private static C0026g m100d(double[] dArr) {
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
        C0026g c0026g = new C0026g(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + c0026g.mo40c(0.0d, 0));
        printStream.println(" 1 " + c0026g.mo40c(1.0d, 0));
        return c0026g;
    }

    @Override // p007a1.C0022c
    /* renamed from: a */
    public double mo60a(double d11) {
        return this.f129d.mo40c(d11, 0);
    }

    @Override // p007a1.C0022c
    /* renamed from: b */
    public double mo61b(double d11) {
        return this.f129d.mo43f(d11, 0);
    }
}
