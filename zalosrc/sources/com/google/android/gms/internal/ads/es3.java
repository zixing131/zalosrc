package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class es3 {

    /* renamed from: a */
    private static final int[] f19772a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b */
    private static final int[] f19773b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c */
    private static final int[] f19774c = {67108863, 33554431};

    /* renamed from: d */
    private static final int[] f19775d = {26, 25};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21792a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        m21793b(jArr4, jArr2, jArr3);
        m21794c(jArr4, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m21793b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j11 = jArr2[0];
        long j12 = jArr3[1] * j11;
        long j13 = jArr2[1];
        long j14 = jArr3[0];
        jArr[1] = j12 + (j13 * j14);
        long j15 = jArr2[1];
        long j16 = jArr3[1];
        jArr[2] = ((j15 + j15) * j16) + (jArr3[2] * j11) + (jArr2[2] * j14);
        long j17 = jArr3[2];
        long j18 = jArr2[2];
        jArr[3] = (j15 * j17) + (j18 * j16) + (jArr3[3] * j11) + (jArr2[3] * j14);
        long j19 = jArr3[3];
        long j21 = jArr2[3];
        long j22 = (j15 * j19) + (j21 * j16);
        jArr[4] = (j18 * j17) + j22 + j22 + (jArr3[4] * j11) + (jArr2[4] * j14);
        long j23 = jArr3[4];
        long j24 = jArr2[4];
        jArr[5] = (j18 * j19) + (j21 * j17) + (j15 * j23) + (j24 * j16) + (jArr3[5] * j11) + (jArr2[5] * j14);
        long j25 = jArr3[5];
        long j26 = jArr2[5];
        long j27 = (j21 * j19) + (j15 * j25) + (j26 * j16);
        jArr[6] = j27 + j27 + (j18 * j23) + (j24 * j17) + (jArr3[6] * j11) + (jArr2[6] * j14);
        long j28 = jArr3[6];
        long j29 = jArr2[6];
        jArr[7] = (j21 * j23) + (j24 * j19) + (j18 * j25) + (j26 * j17) + (j15 * j28) + (j29 * j16) + (jArr3[7] * j11) + (jArr2[7] * j14);
        long j31 = jArr3[7];
        long j32 = jArr2[7];
        long j33 = (j21 * j25) + (j26 * j19) + (j15 * j31) + (j32 * j16);
        jArr[8] = (j24 * j23) + j33 + j33 + (j18 * j28) + (j29 * j17) + (jArr3[8] * j11) + (jArr2[8] * j14);
        long j34 = jArr3[8];
        long j35 = jArr2[8];
        jArr[9] = (j24 * j25) + (j26 * j23) + (j21 * j28) + (j29 * j19) + (j18 * j31) + (j32 * j17) + (j15 * j34) + (j35 * j16) + (j11 * jArr3[9]) + (jArr2[9] * j14);
        long j36 = jArr3[9];
        long j37 = jArr2[9];
        long j38 = (j26 * j25) + (j21 * j31) + (j32 * j19) + (j15 * j36) + (j16 * j37);
        jArr[10] = j38 + j38 + (j24 * j28) + (j29 * j23) + (j18 * j34) + (j35 * j17);
        jArr[11] = (j26 * j28) + (j29 * j25) + (j24 * j31) + (j32 * j23) + (j21 * j34) + (j35 * j19) + (j18 * j36) + (j17 * j37);
        long j39 = (j26 * j31) + (j32 * j25) + (j21 * j36) + (j19 * j37);
        jArr[12] = (j29 * j28) + j39 + j39 + (j24 * j34) + (j35 * j23);
        jArr[13] = (j29 * j31) + (j32 * j28) + (j26 * j34) + (j35 * j25) + (j24 * j36) + (j23 * j37);
        long j41 = (j32 * j31) + (j26 * j36) + (j25 * j37);
        jArr[14] = j41 + j41 + (j29 * j34) + (j35 * j28);
        jArr[15] = (j32 * j34) + (j35 * j31) + (j29 * j36) + (j28 * j37);
        long j42 = (j32 * j36) + (j31 * j37);
        jArr[16] = (j35 * j34) + j42 + j42;
        jArr[17] = (j35 * j36) + (j34 * j37);
        jArr[18] = (j37 + j37) * j36;
    }

    /* renamed from: c */
    static void m21794c(long[] jArr, long[] jArr2) {
        m21796e(jArr);
        m21795d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m21795d(long[] jArr) {
        jArr[10] = 0;
        int i11 = 0;
        while (i11 < 10) {
            long j11 = jArr[i11];
            long j12 = j11 / 67108864;
            jArr[i11] = j11 - (j12 << 26);
            int i12 = i11 + 1;
            long j13 = jArr[i12] + j12;
            jArr[i12] = j13;
            long j14 = j13 / 33554432;
            jArr[i12] = j13 - (j14 << 25);
            i11 += 2;
            jArr[i11] = jArr[i11] + j14;
        }
        long j15 = jArr[0];
        long j16 = jArr[10];
        long j17 = j15 + (j16 << 4);
        jArr[0] = j17;
        long j18 = j17 + j16 + j16;
        jArr[0] = j18;
        long j19 = j18 + j16;
        jArr[0] = j19;
        jArr[10] = 0;
        long j21 = j19 / 67108864;
        jArr[0] = j19 - (j21 << 26);
        jArr[1] = jArr[1] + j21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m21796e(long[] jArr) {
        long j11 = jArr[8];
        long j12 = jArr[18];
        long j13 = j11 + (j12 << 4);
        jArr[8] = j13;
        long j14 = j13 + j12 + j12;
        jArr[8] = j14;
        jArr[8] = j14 + j12;
        long j15 = jArr[7];
        long j16 = jArr[17];
        long j17 = j15 + (j16 << 4);
        jArr[7] = j17;
        long j18 = j17 + j16 + j16;
        jArr[7] = j18;
        jArr[7] = j18 + j16;
        long j19 = jArr[6];
        long j21 = jArr[16];
        long j22 = j19 + (j21 << 4);
        jArr[6] = j22;
        long j23 = j22 + j21 + j21;
        jArr[6] = j23;
        jArr[6] = j23 + j21;
        long j24 = jArr[5];
        long j25 = jArr[15];
        long j26 = j24 + (j25 << 4);
        jArr[5] = j26;
        long j27 = j26 + j25 + j25;
        jArr[5] = j27;
        jArr[5] = j27 + j25;
        long j28 = jArr[4];
        long j29 = jArr[14];
        long j31 = j28 + (j29 << 4);
        jArr[4] = j31;
        long j32 = j31 + j29 + j29;
        jArr[4] = j32;
        jArr[4] = j32 + j29;
        long j33 = jArr[3];
        long j34 = jArr[13];
        long j35 = j33 + (j34 << 4);
        jArr[3] = j35;
        long j36 = j35 + j34 + j34;
        jArr[3] = j36;
        jArr[3] = j36 + j34;
        long j37 = jArr[2];
        long j38 = jArr[12];
        long j39 = j37 + (j38 << 4);
        jArr[2] = j39;
        long j41 = j39 + j38 + j38;
        jArr[2] = j41;
        jArr[2] = j41 + j38;
        long j42 = jArr[1];
        long j43 = jArr[11];
        long j44 = j42 + (j43 << 4);
        jArr[1] = j44;
        long j45 = j44 + j43 + j43;
        jArr[1] = j45;
        jArr[1] = j45 + j43;
        long j46 = jArr[0];
        long j47 = jArr[10];
        long j48 = j46 + (j47 << 4);
        jArr[0] = j48;
        long j49 = j48 + j47 + j47;
        jArr[0] = j49;
        jArr[0] = j49 + j47;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m21797f(long[] jArr, long[] jArr2, long j11) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] * j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m21798g(long[] jArr, long[] jArr2) {
        long j11 = jArr2[0];
        long j12 = jArr2[0];
        long j13 = jArr2[1];
        long j14 = (j13 * j13) + (jArr2[2] * j12);
        long j15 = jArr2[2];
        long j16 = (j13 * j15) + (jArr2[3] * j12);
        long j17 = jArr2[3];
        long j18 = jArr2[4];
        long j19 = (j15 * j17) + (j13 * j18) + (jArr2[5] * j12);
        long j21 = (j17 * j17) + (j15 * j18) + (jArr2[6] * j12);
        long j22 = jArr2[5];
        long j23 = j21 + ((j13 + j13) * j22);
        long j24 = jArr2[6];
        long j25 = (j17 * j18) + (j15 * j22) + (j13 * j24) + (jArr2[7] * j12);
        long j26 = jArr2[8];
        long j27 = jArr2[7];
        long j28 = (j13 * j27) + (j17 * j22);
        long j29 = (j15 * j24) + (j26 * j12) + j28 + j28;
        long j31 = jArr2[8];
        long j32 = (j18 * j22) + (j17 * j24) + (j15 * j27) + (j13 * j31) + (j12 * jArr2[9]);
        long j33 = jArr2[9];
        long j34 = (j17 * j27) + (j13 * j33);
        long j35 = (j22 * j22) + (j18 * j24) + (j15 * j31) + j34 + j34;
        long j36 = (j22 * j24) + (j18 * j27) + (j17 * j31) + (j15 * j33);
        long j37 = (j22 * j27) + (j17 * j33);
        long j38 = (j18 * j31) + j37 + j37;
        long j39 = (j24 * j27) + (j22 * j31) + (j18 * j33);
        long j41 = (j27 * j27) + (j24 * j31) + ((j22 + j22) * j33);
        long j42 = (j27 * j31) + (j24 * j33);
        m21794c(new long[]{j11 * j11, (j12 + j12) * jArr2[1], j14 + j14, j16 + j16, (j15 * j15) + (j13 * 4 * j17) + ((j12 + j12) * jArr2[4]), j19 + j19, j23 + j23, j25 + j25, (j18 * j18) + j29 + j29, j32 + j32, j35 + j35, j36 + j36, (j24 * j24) + j38 + j38, j39 + j39, j41 + j41, j42 + j42, (j31 * j31) + (j27 * 4 * j33), (j31 + j31) * j33, (j33 + j33) * j33}, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m21799h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] - jArr3[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m21800i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] + jArr3[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static byte[] m21801j(long[] jArr) {
        int i11;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j11 = copyOf[i13];
                int i14 = -((int) (((j11 >> 31) & j11) >> f19775d[i13 & 1]));
                copyOf[i13] = j11 + (i14 << r9);
                i13++;
                copyOf[i13] = copyOf[i13] - i14;
            }
            long j12 = copyOf[9];
            int i15 = -((int) (((j12 >> 31) & j12) >> 25));
            copyOf[9] = j12 + (i15 << 25);
            copyOf[0] = copyOf[0] - (i15 * 19);
            i12++;
        }
        long j13 = copyOf[0];
        copyOf[0] = j13 + (r2 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j13 >> 31) & j13) >> 26)));
        for (int i16 = 0; i16 < 2; i16++) {
            int i17 = 0;
            while (i17 < 9) {
                long j14 = copyOf[i17];
                int i18 = f19775d[i17 & 1];
                copyOf[i17] = f19774c[r11] & j14;
                i17++;
                copyOf[i17] = copyOf[i17] + ((int) (j14 >> i18));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (r8 >> 25)) * 19);
        int i19 = ~((((int) r10) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) copyOf[i21]) ^ f19774c[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i19 &= (i26 & (i26 + i26)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i19);
        long j15 = 33554431 & i19;
        copyOf[1] = copyOf[1] - j15;
        for (i11 = 2; i11 < 10; i11 += 2) {
            copyOf[i11] = copyOf[i11] - (67108863 & i19);
            int i27 = i11 + 1;
            copyOf[i27] = copyOf[i27] - j15;
        }
        for (int i28 = 0; i28 < 10; i28++) {
            copyOf[i28] = copyOf[i28] << f19773b[i28];
        }
        byte[] bArr = new byte[32];
        for (int i29 = 0; i29 < 10; i29++) {
            int i31 = f19772a[i29];
            byte b11 = bArr[i31];
            long j16 = copyOf[i29];
            bArr[i31] = (byte) (b11 | (j16 & 255));
            bArr[i31 + 1] = (byte) (bArr[r4] | ((j16 >> 8) & 255));
            bArr[i31 + 2] = (byte) (bArr[r4] | ((j16 >> 16) & 255));
            bArr[i31 + 3] = (byte) (((j16 >> 24) & 255) | bArr[r3]);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static long[] m21802k(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = f19772a[i11];
            jArr[i11] = (((((bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8)) | ((bArr[i12 + 2] & 255) << 16)) | ((bArr[i12 + 3] & 255) << 24)) >> f19773b[i11]) & f19774c[i11 & 1];
        }
        return jArr;
    }
}
