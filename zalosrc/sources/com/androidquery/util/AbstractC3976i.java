package com.androidquery.util;

/* renamed from: com.androidquery.util.i */
/* loaded from: classes2.dex */
public abstract class AbstractC3976i {
    /* renamed from: a */
    public static void m18833a(int i11, int i12, int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        if (length == 1) {
            iArr[0] = i11;
            return;
        }
        int i13 = i11 >>> 24;
        int i14 = (i11 >>> 16) & 255;
        int i15 = (i11 >>> 8) & 255;
        int i16 = i11 & 255;
        int i17 = length - 1;
        int i18 = (((i12 >>> 24) - i13) << 8) / i17;
        int i19 = ((((i12 >>> 16) & 255) - i14) << 8) / i17;
        int i21 = ((((i12 >>> 8) & 255) - i15) << 8) / i17;
        int i22 = (((i12 & 255) - i16) << 8) / i17;
        int i23 = i13 << 8;
        int i24 = i14 << 8;
        int i25 = i15 << 8;
        int i26 = i16 << 8;
        iArr[0] = i11;
        for (int i27 = 1; i27 < length; i27++) {
            i23 += i18;
            i24 += i19;
            i25 += i21;
            i26 += i22;
            iArr[i27] = ((i23 << 16) & (-16777216)) | ((i24 << 8) & 16711680) | (65280 & i25) | (i26 >>> 8);
        }
    }

    /* renamed from: b */
    public static int[] m18834b(int i11, int i12, int i13) {
        int[] iArr = new int[i13];
        m18833a(i11, i12, iArr);
        return iArr;
    }
}
