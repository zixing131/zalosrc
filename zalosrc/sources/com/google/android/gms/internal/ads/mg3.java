package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes2.dex */
abstract class mg3 {

    /* renamed from: a */
    private static final int[] f24514a = m24566d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    static void m24563a(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = iArr[i11] + iArr[i12];
        iArr[i11] = i15;
        int i16 = i15 ^ iArr[i14];
        int i17 = (i16 >>> (-16)) | (i16 << 16);
        iArr[i14] = i17;
        int i18 = iArr[i13] + i17;
        iArr[i13] = i18;
        int i19 = iArr[i12] ^ i18;
        int i21 = (i19 >>> (-12)) | (i19 << 12);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i14] ^ i22;
        int i24 = (i23 >>> (-8)) | (i23 << 8);
        iArr[i14] = i24;
        int i25 = iArr[i13] + i24;
        iArr[i13] = i25;
        int i26 = iArr[i12] ^ i25;
        iArr[i12] = (i26 >>> (-7)) | (i26 << 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m24564b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f24514a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m24565c(int[] iArr) {
        for (int i11 = 0; i11 < 10; i11++) {
            m24563a(iArr, 0, 4, 8, 12);
            m24563a(iArr, 1, 5, 9, 13);
            m24563a(iArr, 2, 6, 10, 14);
            m24563a(iArr, 3, 7, 11, 15);
            m24563a(iArr, 0, 5, 10, 15);
            m24563a(iArr, 1, 6, 11, 12);
            m24563a(iArr, 2, 7, 8, 13);
            m24563a(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int[] m24566d(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
