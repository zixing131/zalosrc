package p229i5;

import com.google.android.gms.common.internal.AbstractC4199m;

/* renamed from: i5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC20281b {
    /* renamed from: a */
    public static boolean m105899a(int[] iArr, int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m105900b(Object[] objArr, Object obj) {
        int i11;
        if (objArr != null) {
            i11 = objArr.length;
        } else {
            i11 = 0;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            if (AbstractC4199m.m19701a(objArr[i12], obj)) {
                if (i12 >= 0) {
                    return true;
                }
            } else {
                i12++;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m105901c(StringBuilder sb2, double[] dArr) {
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Double.toString(dArr[i11]));
        }
    }

    /* renamed from: d */
    public static void m105902d(StringBuilder sb2, float[] fArr) {
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Float.toString(fArr[i11]));
        }
    }

    /* renamed from: e */
    public static void m105903e(StringBuilder sb2, int[] iArr) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Integer.toString(iArr[i11]));
        }
    }

    /* renamed from: f */
    public static void m105904f(StringBuilder sb2, long[] jArr) {
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Long.toString(jArr[i11]));
        }
    }

    /* renamed from: g */
    public static void m105905g(StringBuilder sb2, Object[] objArr) {
        int length = objArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(objArr[i11]);
        }
    }

    /* renamed from: h */
    public static void m105906h(StringBuilder sb2, boolean[] zArr) {
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Boolean.toString(zArr[i11]));
        }
    }

    /* renamed from: i */
    public static void m105907i(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i11]);
            sb2.append("\"");
        }
    }
}
