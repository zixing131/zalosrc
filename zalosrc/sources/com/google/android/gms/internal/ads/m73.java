package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class m73 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m24484a(int i11) {
        return (i11 < 32 ? 4 : 2) * (i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m24485b(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i12;
        int i13;
        int m26864b = u73.m26864b(obj);
        int i14 = m26864b & i11;
        int m24486c = m24486c(obj3, i14);
        if (m24486c != 0) {
            int i15 = ~i11;
            int i16 = m26864b & i15;
            int i17 = -1;
            while (true) {
                i12 = m24486c - 1;
                i13 = iArr[i12];
                if ((i13 & i15) != i16 || !e53.m21617a(obj, objArr[i12]) || (objArr2 != null && !e53.m21617a(obj2, objArr2[i12]))) {
                    int i18 = i13 & i11;
                    if (i18 == 0) {
                        break;
                    }
                    i17 = i12;
                    m24486c = i18;
                }
            }
            int i19 = i13 & i11;
            if (i17 == -1) {
                m24488e(obj3, i14, i19);
            } else {
                iArr[i17] = (i19 & i11) | (iArr[i17] & i15);
            }
            return i12;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m24486c(Object obj, int i11) {
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
    public static Object m24487d(int i11) {
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
    public static void m24488e(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }
}
