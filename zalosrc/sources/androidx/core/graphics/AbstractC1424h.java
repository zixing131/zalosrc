package androidx.core.graphics;

import android.graphics.Path;
import com.adtima.Adtima;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;

/* renamed from: androidx.core.graphics.h */
/* loaded from: classes2.dex */
public abstract class AbstractC1424h {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.h$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        int f6235a;

        /* renamed from: b */
        boolean f6236b;

        a() {
        }
    }

    /* renamed from: androidx.core.graphics.h$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public char f6237a;

        /* renamed from: b */
        public float[] f6238b;

        b(char c11, float[] fArr) {
            this.f6237a = c11;
            this.f6238b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private static void m7250a(Path path, float[] fArr, char c11, char c12, float[] fArr2) {
            int i11;
            int i12;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            char c13 = c12;
            float f19 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i11 = 7;
                    break;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                case 'c':
                    i11 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'L':
                case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i11 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422 /* 122 */:
                    path.close();
                    path.moveTo(f24, f25);
                    f19 = f24;
                    f22 = f19;
                    f21 = f25;
                    f23 = f21;
                    i11 = 2;
                    break;
            }
            float f26 = f19;
            float f27 = f21;
            float f28 = f24;
            float f29 = f25;
            int i13 = 0;
            char c14 = c11;
            while (i13 < fArr2.length) {
                if (c13 != 'A') {
                    if (c13 == 'C') {
                        i12 = i13;
                        int i14 = i12 + 2;
                        int i15 = i12 + 3;
                        int i16 = i12 + 4;
                        int i17 = i12 + 5;
                        path.cubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                        f26 = fArr2[i16];
                        float f31 = fArr2[i17];
                        float f32 = fArr2[i14];
                        float f33 = fArr2[i15];
                        f27 = f31;
                        f23 = f33;
                        f22 = f32;
                    } else if (c13 == 'H') {
                        i12 = i13;
                        path.lineTo(fArr2[i12], f27);
                        f26 = fArr2[i12];
                    } else if (c13 == 'Q') {
                        i12 = i13;
                        int i18 = i12 + 1;
                        int i19 = i12 + 2;
                        int i21 = i12 + 3;
                        path.quadTo(fArr2[i12], fArr2[i18], fArr2[i19], fArr2[i21]);
                        float f34 = fArr2[i12];
                        float f35 = fArr2[i18];
                        f26 = fArr2[i19];
                        f27 = fArr2[i21];
                        f22 = f34;
                        f23 = f35;
                    } else if (c13 == 'V') {
                        i12 = i13;
                        path.lineTo(f26, fArr2[i12]);
                        f27 = fArr2[i12];
                    } else if (c13 != 'a') {
                        if (c13 != 'c') {
                            if (c13 == 'h') {
                                path.rLineTo(fArr2[i13], 0.0f);
                                f26 += fArr2[i13];
                            } else if (c13 != 'q') {
                                if (c13 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i13]);
                                    f14 = fArr2[i13];
                                } else if (c13 == 'L') {
                                    int i22 = i13 + 1;
                                    path.lineTo(fArr2[i13], fArr2[i22]);
                                    f26 = fArr2[i13];
                                    f27 = fArr2[i22];
                                } else if (c13 == 'M') {
                                    f26 = fArr2[i13];
                                    f27 = fArr2[i13 + 1];
                                    if (i13 > 0) {
                                        path.lineTo(f26, f27);
                                    } else {
                                        path.moveTo(f26, f27);
                                        i12 = i13;
                                        f29 = f27;
                                        f28 = f26;
                                    }
                                } else if (c13 == 'S') {
                                    if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                        f26 = (f26 * 2.0f) - f22;
                                        f27 = (f27 * 2.0f) - f23;
                                    }
                                    float f36 = f27;
                                    float f37 = f26;
                                    int i23 = i13 + 1;
                                    int i24 = i13 + 2;
                                    int i25 = i13 + 3;
                                    path.cubicTo(f37, f36, fArr2[i13], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f11 = fArr2[i13];
                                    f12 = fArr2[i23];
                                    f26 = fArr2[i24];
                                    f27 = fArr2[i25];
                                    f22 = f11;
                                    f23 = f12;
                                } else if (c13 == 'T') {
                                    if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                        f26 = (f26 * 2.0f) - f22;
                                        f27 = (f27 * 2.0f) - f23;
                                    }
                                    int i26 = i13 + 1;
                                    path.quadTo(f26, f27, fArr2[i13], fArr2[i26]);
                                    i12 = i13;
                                    f23 = f27;
                                    f22 = f26;
                                    f26 = fArr2[i13];
                                    f27 = fArr2[i26];
                                } else if (c13 == 'l') {
                                    int i27 = i13 + 1;
                                    path.rLineTo(fArr2[i13], fArr2[i27]);
                                    f26 += fArr2[i13];
                                    f14 = fArr2[i27];
                                } else if (c13 == 'm') {
                                    float f38 = fArr2[i13];
                                    f26 += f38;
                                    float f39 = fArr2[i13 + 1];
                                    f27 += f39;
                                    if (i13 > 0) {
                                        path.rLineTo(f38, f39);
                                    } else {
                                        path.rMoveTo(f38, f39);
                                        i12 = i13;
                                        f29 = f27;
                                        f28 = f26;
                                    }
                                } else if (c13 == 's') {
                                    if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                        float f41 = f26 - f22;
                                        f15 = f27 - f23;
                                        f16 = f41;
                                    } else {
                                        f16 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    int i28 = i13 + 1;
                                    int i29 = i13 + 2;
                                    int i31 = i13 + 3;
                                    path.rCubicTo(f16, f15, fArr2[i13], fArr2[i28], fArr2[i29], fArr2[i31]);
                                    f11 = fArr2[i13] + f26;
                                    f12 = fArr2[i28] + f27;
                                    f26 += fArr2[i29];
                                    f13 = fArr2[i31];
                                } else if (c13 == 't') {
                                    if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                        f17 = f26 - f22;
                                        f18 = f27 - f23;
                                    } else {
                                        f18 = 0.0f;
                                        f17 = 0.0f;
                                    }
                                    int i32 = i13 + 1;
                                    path.rQuadTo(f17, f18, fArr2[i13], fArr2[i32]);
                                    float f42 = f17 + f26;
                                    float f43 = f18 + f27;
                                    f26 += fArr2[i13];
                                    f27 += fArr2[i32];
                                    f23 = f43;
                                    f22 = f42;
                                }
                                f27 += f14;
                            } else {
                                int i33 = i13 + 1;
                                int i34 = i13 + 2;
                                int i35 = i13 + 3;
                                path.rQuadTo(fArr2[i13], fArr2[i33], fArr2[i34], fArr2[i35]);
                                f11 = fArr2[i13] + f26;
                                f12 = fArr2[i33] + f27;
                                f26 += fArr2[i34];
                                f13 = fArr2[i35];
                            }
                            i12 = i13;
                        } else {
                            int i36 = i13 + 2;
                            int i37 = i13 + 3;
                            int i38 = i13 + 4;
                            int i39 = i13 + 5;
                            path.rCubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                            f11 = fArr2[i36] + f26;
                            f12 = fArr2[i37] + f27;
                            f26 += fArr2[i38];
                            f13 = fArr2[i39];
                        }
                        f27 += f13;
                        f22 = f11;
                        f23 = f12;
                        i12 = i13;
                    } else {
                        int i41 = i13 + 5;
                        int i42 = i13 + 6;
                        i12 = i13;
                        m7252c(path, f26, f27, fArr2[i41] + f26, fArr2[i42] + f27, fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                        f26 += fArr2[i41];
                        f27 += fArr2[i42];
                    }
                    i13 = i12 + i11;
                    c14 = c12;
                    c13 = c14;
                } else {
                    i12 = i13;
                    int i43 = i12 + 5;
                    int i44 = i12 + 6;
                    m7252c(path, f26, f27, fArr2[i43], fArr2[i44], fArr2[i12], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                    f26 = fArr2[i43];
                    f27 = fArr2[i44];
                }
                f23 = f27;
                f22 = f26;
                i13 = i12 + i11;
                c14 = c12;
                c13 = c14;
            }
            fArr[0] = f26;
            fArr[1] = f27;
            fArr[2] = f22;
            fArr[3] = f23;
            fArr[4] = f28;
            fArr[5] = f29;
        }

        /* renamed from: b */
        private static void m7251b(Path path, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
            double d21 = d13;
            int ceil = (int) Math.ceil(Math.abs((d19 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d17);
            double sin = Math.sin(d17);
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double d22 = -d21;
            double d23 = d22 * cos;
            double d24 = d14 * sin;
            double d25 = (d23 * sin2) - (d24 * cos2);
            double d26 = d22 * sin;
            double d27 = d14 * cos;
            double d28 = (sin2 * d26) + (cos2 * d27);
            double d29 = d19 / ceil;
            double d31 = d18;
            double d32 = d28;
            double d33 = d25;
            int i11 = 0;
            double d34 = d15;
            double d35 = d16;
            while (i11 < ceil) {
                double d36 = d31 + d29;
                double sin3 = Math.sin(d36);
                double cos3 = Math.cos(d36);
                double d37 = (d11 + ((d21 * cos) * cos3)) - (d24 * sin3);
                double d38 = d12 + (d21 * sin * cos3) + (d27 * sin3);
                double d39 = (d23 * sin3) - (d24 * cos3);
                double d41 = (sin3 * d26) + (cos3 * d27);
                double d42 = d36 - d31;
                double tan = Math.tan(d42 / 2.0d);
                double sin4 = (Math.sin(d42) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d43 = d34 + (d33 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d43, (float) (d35 + (d32 * sin4)), (float) (d37 - (sin4 * d39)), (float) (d38 - (sin4 * d41)), (float) d37, (float) d38);
                i11++;
                d29 = d29;
                sin = sin;
                d34 = d37;
                d26 = d26;
                cos = cos;
                d31 = d36;
                d32 = d41;
                d33 = d39;
                ceil = ceil;
                d35 = d38;
                d21 = d13;
            }
        }

        /* renamed from: c */
        private static void m7252c(Path path, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z11, boolean z12) {
            double d11;
            double d12;
            boolean z13;
            double radians = Math.toRadians(f17);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d13 = f11;
            double d14 = d13 * cos;
            double d15 = f12;
            double d16 = f15;
            double d17 = (d14 + (d15 * sin)) / d16;
            double d18 = ((-f11) * sin) + (d15 * cos);
            double d19 = f16;
            double d21 = d18 / d19;
            double d22 = f14;
            double d23 = ((f13 * cos) + (d22 * sin)) / d16;
            double d24 = (((-f13) * sin) + (d22 * cos)) / d19;
            double d25 = d17 - d23;
            double d26 = d21 - d24;
            double d27 = (d17 + d23) / 2.0d;
            double d28 = (d21 + d24) / 2.0d;
            double d29 = (d25 * d25) + (d26 * d26);
            if (d29 == 0.0d) {
                return;
            }
            double d31 = (1.0d / d29) - 0.25d;
            if (d31 < 0.0d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Points are too far apart ");
                sb2.append(d29);
                float sqrt = (float) (Math.sqrt(d29) / 1.99999d);
                m7252c(path, f11, f12, f13, f14, f15 * sqrt, f16 * sqrt, f17, z11, z12);
                return;
            }
            double sqrt2 = Math.sqrt(d31);
            double d32 = d25 * sqrt2;
            double d33 = sqrt2 * d26;
            if (z11 == z12) {
                d11 = d27 - d33;
                d12 = d28 + d32;
            } else {
                d11 = d27 + d33;
                d12 = d28 - d32;
            }
            double atan2 = Math.atan2(d21 - d12, d17 - d11);
            double atan22 = Math.atan2(d24 - d12, d23 - d11) - atan2;
            if (atan22 >= 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d34 = d11 * d16;
            double d35 = d12 * d19;
            m7251b(path, (d34 * cos) - (d35 * sin), (d34 * sin) + (d35 * cos), d16, d19, d13, d15, radians, atan2, atan22);
        }

        /* renamed from: e */
        public static void m7253e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c11 = 'm';
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                b bVar = bVarArr[i11];
                m7250a(path, fArr, c11, bVar.f6237a, bVar.f6238b);
                c11 = bVarArr[i11].f6237a;
            }
        }

        /* renamed from: d */
        public void m7254d(b bVar, b bVar2, float f11) {
            this.f6237a = bVar.f6237a;
            int i11 = 0;
            while (true) {
                float[] fArr = bVar.f6238b;
                if (i11 < fArr.length) {
                    this.f6238b[i11] = (fArr[i11] * (1.0f - f11)) + (bVar2.f6238b[i11] * f11);
                    i11++;
                } else {
                    return;
                }
            }
        }

        b(b bVar) {
            this.f6237a = bVar.f6237a;
            float[] fArr = bVar.f6238b;
            this.f6238b = AbstractC1424h.m7242c(fArr, 0, fArr.length);
        }
    }

    /* renamed from: a */
    private static void m7240a(ArrayList arrayList, char c11, float[] fArr) {
        arrayList.add(new b(c11, fArr));
    }

    /* renamed from: b */
    public static boolean m7241b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            char c11 = bVar.f6237a;
            b bVar2 = bVarArr2[i11];
            if (c11 != bVar2.f6237a || bVar.f6238b.length != bVar2.f6238b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    static float[] m7242c(float[] fArr, int i11, int i12) {
        if (i11 <= i12) {
            int length = fArr.length;
            if (i11 >= 0 && i11 <= length) {
                int i13 = i12 - i11;
                int min = Math.min(i13, length - i11);
                float[] fArr2 = new float[i13];
                System.arraycopy(fArr, i11, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static b[] m7243d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            int m7248i = m7248i(str, i11);
            String trim = str.substring(i12, m7248i).trim();
            if (trim.length() > 0) {
                m7240a(arrayList, trim.charAt(0), m7247h(trim));
            }
            i12 = m7248i;
            i11 = m7248i + 1;
        }
        if (i11 - i12 == 1 && i12 < str.length()) {
            m7240a(arrayList, str.charAt(i12), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m7244e(String str) {
        Path path = new Path();
        b[] m7243d = m7243d(str);
        if (m7243d != null) {
            try {
                b.m7253e(m7243d, path);
                return path;
            } catch (RuntimeException e11) {
                throw new RuntimeException("Error in parsing " + str, e11);
            }
        }
        return null;
    }

    /* renamed from: f */
    public static b[] m7245f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            bVarArr2[i11] = new b(bVarArr[i11]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m7246g(String str, int i11, a aVar) {
        aVar.f6236b = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 = i11; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (charAt != ' ') {
                if (charAt != 'E' && charAt != 'e') {
                    switch (charAt) {
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            break;
                        case '-':
                            if (i12 != i11 && !z11) {
                                aVar.f6236b = true;
                                break;
                            }
                            z11 = false;
                            break;
                        case '.':
                            if (!z12) {
                                z11 = false;
                                z12 = true;
                                break;
                            } else {
                                aVar.f6236b = true;
                                break;
                            }
                        default:
                            z11 = false;
                            break;
                    }
                } else {
                    z11 = true;
                }
                if (!z13) {
                    aVar.f6235a = i12;
                }
            }
            z11 = false;
            z13 = true;
            if (!z13) {
            }
        }
        aVar.f6235a = i12;
    }

    /* renamed from: h */
    private static float[] m7247h(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                a aVar = new a();
                int length = str.length();
                int i11 = 1;
                int i12 = 0;
                while (i11 < length) {
                    m7246g(str, i11, aVar);
                    int i13 = aVar.f6235a;
                    if (i11 < i13) {
                        fArr[i12] = Float.parseFloat(str.substring(i11, i13));
                        i12++;
                    }
                    if (aVar.f6236b) {
                        i11 = i13;
                    } else {
                        i11 = i13 + 1;
                    }
                }
                return m7242c(fArr, 0, i12);
            } catch (NumberFormatException e11) {
                throw new RuntimeException("error in parsing \"" + str + "\"", e11);
            }
        }
        return new float[0];
    }

    /* renamed from: i */
    private static int m7248i(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i11;
            }
            i11++;
        }
        return i11;
    }

    /* renamed from: j */
    public static void m7249j(b[] bVarArr, b[] bVarArr2) {
        for (int i11 = 0; i11 < bVarArr2.length; i11++) {
            bVarArr[i11].f6237a = bVarArr2[i11].f6237a;
            int i12 = 0;
            while (true) {
                float[] fArr = bVarArr2[i11].f6238b;
                if (i12 < fArr.length) {
                    bVarArr[i11].f6238b[i12] = fArr[i12];
                    i12++;
                }
            }
        }
    }
}
