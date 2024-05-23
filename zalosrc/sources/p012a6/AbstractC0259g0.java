package p012a6;

/* renamed from: a6.g0 */
/* loaded from: classes2.dex */
abstract class AbstractC0259g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m718a(int i11) {
        return (i11 < 32 ? 4 : 2) * (i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m719b(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i12;
        int i13;
        int m742a = AbstractC0278h0.m742a(obj);
        int i14 = m742a & i11;
        int m720c = m720c(obj3, i14);
        if (m720c != 0) {
            int i15 = ~i11;
            int i16 = m742a & i15;
            int i17 = -1;
            while (true) {
                i12 = m720c - 1;
                i13 = iArr[i12];
                if ((i13 & i15) != i16 || !AbstractC0466qh.m859a(obj, objArr[i12]) || (objArr2 != null && !AbstractC0466qh.m859a(obj2, objArr2[i12]))) {
                    int i18 = i13 & i11;
                    if (i18 == 0) {
                        break;
                    }
                    i17 = i12;
                    m720c = i18;
                }
            }
            int i19 = i13 & i11;
            if (i17 == -1) {
                m722e(obj3, i14, i19);
            } else {
                iArr[i17] = (i19 & i11) | (iArr[i17] & i15);
            }
            return i12;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m720c(Object obj, int i11) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i11] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i11];
        }
        return ((int[]) obj)[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Object m721d(int i11) {
        if (i11 >= 2 && i11 <= 1073741824 && Integer.highestOneBit(i11) == i11) {
            if (i11 <= 256) {
                return new byte[i11];
            }
            if (i11 <= 65536) {
                return new short[i11];
            }
            return new int[i11];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m722e(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }
}
