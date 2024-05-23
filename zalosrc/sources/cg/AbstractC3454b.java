package cg;

import android.graphics.Point;
import android.graphics.PointF;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: cg.b */
/* loaded from: classes3.dex */
public abstract class AbstractC3454b {
    /* renamed from: b */
    private static ArrayList m17391b(Point[] pointArr) {
        int i11;
        int length = pointArr.length;
        char c11 = 1;
        if (length <= 1) {
            return null;
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 3);
        double[] dArr2 = new double[length];
        char c12 = 0;
        double[] dArr3 = dArr[0];
        dArr3[1] = 1.0d;
        double d11 = 0.0d;
        dArr3[0] = 0.0d;
        char c13 = 2;
        dArr3[2] = 0.0d;
        int i12 = 1;
        while (true) {
            i11 = length - 1;
            if (i12 >= i11) {
                break;
            }
            Point point = pointArr[i12 - 1];
            Point point2 = pointArr[i12];
            int i13 = i12 + 1;
            Point point3 = pointArr[i13];
            double[] dArr4 = dArr[i12];
            int i14 = point2.x;
            int i15 = point.x;
            dArr4[c12] = (i14 - i15) / 6.0d;
            int i16 = point3.x;
            int i17 = i12;
            dArr4[c11] = (i16 - i15) / 3.0d;
            dArr4[c13] = (i16 - i14) / 6.0d;
            int i18 = point3.y;
            int i19 = point2.y;
            dArr2[i17] = ((i18 - i19) / (i16 - i14)) - ((i19 - point.y) / (i14 - i15));
            dArr = dArr;
            i12 = i13;
            c11 = 1;
            c12 = 0;
            d11 = 0.0d;
            c13 = 2;
        }
        double[][] dArr5 = dArr;
        double d12 = d11;
        char c14 = 0;
        dArr2[0] = d12;
        dArr2[i11] = d12;
        double[] dArr6 = dArr5[i11];
        char c15 = 1;
        dArr6[1] = 1.0d;
        dArr6[0] = d12;
        char c16 = 2;
        dArr6[2] = d12;
        int i21 = 1;
        while (i21 < length) {
            double[] dArr7 = dArr5[i21];
            double d13 = dArr7[c14];
            int i22 = i21 - 1;
            double[] dArr8 = dArr5[i22];
            double d14 = d13 / dArr8[c15];
            dArr7[c15] = dArr7[c15] - (dArr8[c16] * d14);
            dArr7[c14] = 0.0d;
            dArr2[i21] = dArr2[i21] - (d14 * dArr2[i22]);
            i21++;
            c14 = 0;
            c16 = 2;
            c15 = 1;
        }
        for (int i23 = length - 2; i23 >= 0; i23--) {
            double[] dArr9 = dArr5[i23];
            double d15 = dArr9[2];
            int i24 = i23 + 1;
            double[] dArr10 = dArr5[i24];
            double d16 = d15 / dArr10[1];
            dArr9[1] = dArr9[1] - (dArr10[0] * d16);
            dArr9[2] = 0.0d;
            dArr2[i23] = dArr2[i23] - (d16 * dArr2[i24]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i25 = 0; i25 < length; i25++) {
            arrayList.add(Double.valueOf(dArr2[i25] / dArr5[i25][1]));
        }
        return arrayList;
    }

    /* renamed from: c */
    private static ArrayList m17392c(PointF[] pointFArr) {
        ArrayList arrayList = null;
        if (pointFArr != null && pointFArr.length != 0) {
            PointF[] pointFArr2 = (PointF[]) pointFArr.clone();
            Arrays.sort(pointFArr2, new Comparator() { // from class: cg.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m17394e;
                    m17394e = AbstractC3454b.m17394e((PointF) obj, (PointF) obj2);
                    return m17394e;
                }
            });
            Point[] pointArr = new Point[pointFArr2.length];
            for (int i11 = 0; i11 < pointFArr.length; i11++) {
                PointF pointF = pointFArr2[i11];
                pointArr[i11] = new Point((int) (pointF.x * 255.0f), (int) (pointF.y * 255.0f));
            }
            ArrayList m17393d = m17393d(pointArr);
            if (m17393d == null) {
                return null;
            }
            int i12 = ((Point) m17393d.get(0)).x;
            if (i12 > 0) {
                while (i12 >= 0) {
                    m17393d.add(0, new Point(i12, 0));
                    i12--;
                }
            }
            int i13 = ((Point) m17393d.get(m17393d.size() - 1)).x;
            if (i13 < 255) {
                while (true) {
                    i13++;
                    if (i13 > 255) {
                        break;
                    }
                    m17393d.add(new Point(i13, 255));
                }
            }
            arrayList = new ArrayList(m17393d.size());
            Iterator it = m17393d.iterator();
            while (it.hasNext()) {
                Point point = (Point) it.next();
                int i14 = point.x;
                Point point2 = new Point(i14, i14);
                float sqrt = (float) Math.sqrt(Math.pow(point2.x - point.x, 2.0d) + Math.pow(point2.y - point.y, 2.0d));
                if (point2.y > point.y) {
                    sqrt = -sqrt;
                }
                arrayList.add(Float.valueOf(sqrt));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private static ArrayList m17393d(Point[] pointArr) {
        int size;
        Point[] pointArr2 = pointArr;
        ArrayList m17391b = m17391b(pointArr);
        if (m17391b == null || (size = m17391b.size()) < 1) {
            return null;
        }
        double[] dArr = new double[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            dArr[i12] = ((Double) m17391b.get(i12)).doubleValue();
        }
        ArrayList arrayList = new ArrayList(size + 1);
        while (i11 < size - 1) {
            Point point = pointArr2[i11];
            int i13 = i11 + 1;
            Point point2 = pointArr2[i13];
            int i14 = point.x;
            while (true) {
                int i15 = point2.x;
                if (i14 < i15) {
                    double d11 = (i14 - r11) / (i15 - r11);
                    double d12 = 1.0d - d11;
                    double d13 = i15 - point.x;
                    int i16 = size;
                    Point point3 = point;
                    ArrayList arrayList2 = arrayList;
                    double d14 = (point.y * d12) + (point2.y * d11) + (((d13 * d13) / 6.0d) * (((((d12 * d12) * d12) - d12) * dArr[i11]) + ((((d11 * d11) * d11) - d11) * dArr[i13])));
                    double d15 = 255.0d;
                    if (d14 <= 255.0d) {
                        d15 = 0.0d;
                        if (d14 >= 0.0d) {
                            arrayList = arrayList2;
                            arrayList.add(new Point(i14, (int) Math.round(d14)));
                            i14++;
                            size = i16;
                            point = point3;
                        }
                    }
                    d14 = d15;
                    arrayList = arrayList2;
                    arrayList.add(new Point(i14, (int) Math.round(d14)));
                    i14++;
                    size = i16;
                    point = point3;
                }
            }
            pointArr2 = pointArr;
            i11 = i13;
        }
        if (arrayList.size() == 255) {
            arrayList.add(pointArr[pointArr.length - 1]);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ int m17394e(PointF pointF, PointF pointF2) {
        return Float.compare(pointF.x, pointF2.x);
    }

    /* renamed from: f */
    public static byte[] m17395f(InputStream inputStream) {
        try {
            m17396g(inputStream);
            short m17396g = m17396g(inputStream);
            ArrayList arrayList = new ArrayList(m17396g);
            for (int i11 = 0; i11 < m17396g; i11++) {
                int m17396g2 = m17396g(inputStream);
                PointF[] pointFArr = new PointF[m17396g2];
                for (int i12 = 0; i12 < m17396g2; i12++) {
                    pointFArr[i12] = new PointF(m17396g(inputStream) * 0.003921569f, m17396g(inputStream) * 0.003921569f);
                }
                arrayList.add(pointFArr);
            }
            inputStream.close();
            ArrayList m17392c = m17392c((PointF[]) arrayList.get(0));
            ArrayList m17392c2 = m17392c((PointF[]) arrayList.get(1));
            ArrayList m17392c3 = m17392c((PointF[]) arrayList.get(2));
            ArrayList m17392c4 = m17392c((PointF[]) arrayList.get(3));
            if (m17392c2 != null && m17392c2.size() >= 256 && m17392c3 != null && m17392c3.size() >= 256 && m17392c4 != null && m17392c4.size() >= 256 && m17392c != null && m17392c.size() >= 256) {
                byte[] bArr = new byte[1024];
                for (int i13 = 0; i13 < 256; i13++) {
                    int i14 = i13 * 4;
                    float f11 = i13;
                    bArr[i14] = (byte) (((int) Math.min(Math.max(((Float) m17392c4.get(i13)).floatValue() + f11 + ((Float) m17392c.get(i13)).floatValue(), 0.0f), 255.0f)) & 255);
                    bArr[i14 + 1] = (byte) (((int) Math.min(Math.max(((Float) m17392c3.get(i13)).floatValue() + f11 + ((Float) m17392c.get(i13)).floatValue(), 0.0f), 255.0f)) & 255);
                    bArr[i14 + 2] = (byte) (((int) Math.min(Math.max(f11 + ((Float) m17392c2.get(i13)).floatValue() + ((Float) m17392c.get(i13)).floatValue(), 0.0f), 255.0f)) & 255);
                    bArr[i14 + 3] = -1;
                }
                return bArr;
            }
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    private static short m17396g(InputStream inputStream) {
        return (short) (inputStream.read() | (inputStream.read() << 8));
    }
}
