package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class vg3 {
    /* renamed from: a */
    public static byte[] m27220a(byte[] bArr, byte[] bArr2) {
        long m27221b = m27221b(bArr, 0, 0);
        long m27221b2 = m27221b(bArr, 3, 2) & 67108611;
        long m27221b3 = m27221b(bArr, 6, 4) & 67092735;
        long m27221b4 = m27221b(bArr, 9, 6) & 66076671;
        long m27221b5 = m27221b(bArr, 12, 8) & 1048575;
        long j11 = m27221b2 * 5;
        long j12 = m27221b3 * 5;
        long j13 = m27221b4 * 5;
        long j14 = m27221b5 * 5;
        int i11 = 17;
        byte[] bArr3 = new byte[17];
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        int i12 = 0;
        while (true) {
            int length = bArr2.length;
            if (i12 < length) {
                int min = Math.min(16, length - i12);
                System.arraycopy(bArr2, i12, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i11, (byte) 0);
                }
                long m27221b6 = j19 + m27221b(bArr3, 0, 0);
                long m27221b7 = j16 + m27221b(bArr3, 3, 2);
                long m27221b8 = j15 + m27221b(bArr3, 6, 4);
                long m27221b9 = j17 + m27221b(bArr3, 9, 6);
                long m27221b10 = j18 + (m27221b(bArr3, 12, 8) | (bArr3[16] << 24));
                long j21 = (m27221b6 * m27221b) + (m27221b7 * j14) + (m27221b8 * j13) + (m27221b9 * j12) + (m27221b10 * j11);
                long j22 = (m27221b6 * m27221b2) + (m27221b7 * m27221b) + (m27221b8 * j14) + (m27221b9 * j13) + (m27221b10 * j12) + (j21 >> 26);
                long j23 = (m27221b6 * m27221b3) + (m27221b7 * m27221b2) + (m27221b8 * m27221b) + (m27221b9 * j14) + (m27221b10 * j13) + (j22 >> 26);
                long j24 = (m27221b6 * m27221b4) + (m27221b7 * m27221b3) + (m27221b8 * m27221b2) + (m27221b9 * m27221b) + (m27221b10 * j14) + (j23 >> 26);
                long j25 = (m27221b6 * m27221b5) + (m27221b7 * m27221b4) + (m27221b8 * m27221b3) + (m27221b9 * m27221b2) + (m27221b10 * m27221b) + (j24 >> 26);
                j18 = j25 & 67108863;
                long j26 = (j21 & 67108863) + ((j25 >> 26) * 5);
                j19 = j26 & 67108863;
                j16 = (j22 & 67108863) + (j26 >> 26);
                i12 += 16;
                j17 = j24 & 67108863;
                j15 = j23 & 67108863;
                i11 = 17;
            } else {
                long j27 = j15 + (j16 >> 26);
                long j28 = j27 & 67108863;
                long j29 = j17 + (j27 >> 26);
                long j31 = j29 & 67108863;
                long j32 = j18 + (j29 >> 26);
                long j33 = j32 & 67108863;
                long j34 = j19 + ((j32 >> 26) * 5);
                long j35 = j34 & 67108863;
                long j36 = (j16 & 67108863) + (j34 >> 26);
                long j37 = j35 + 5;
                long j38 = (j37 >> 26) + j36;
                long j39 = j28 + (j38 >> 26);
                long j41 = j31 + (j39 >> 26);
                long j42 = (j33 + (j41 >> 26)) - 67108864;
                long j43 = j42 >> 63;
                long j44 = ~j43;
                long j45 = (j36 & j43) | (j38 & 67108863 & j44);
                long j46 = (j28 & j43) | (j39 & 67108863 & j44);
                long j47 = (j31 & j43) | (j41 & 67108863 & j44);
                long m27222c = (((j35 & j43) | (j37 & 67108863 & j44) | (j45 << 26)) & 4294967295L) + m27222c(bArr, 16);
                long m27222c2 = (((j45 >> 6) | (j46 << 20)) & 4294967295L) + m27222c(bArr, 20) + (m27222c >> 32);
                long m27222c3 = (((j46 >> 12) | (j47 << 14)) & 4294967295L) + m27222c(bArr, 24) + (m27222c2 >> 32);
                long m27222c4 = m27222c(bArr, 28);
                byte[] bArr4 = new byte[16];
                m27223d(bArr4, m27222c & 4294967295L, 0);
                m27223d(bArr4, m27222c2 & 4294967295L, 4);
                m27223d(bArr4, m27222c3 & 4294967295L, 8);
                m27223d(bArr4, ((((((j42 & j44) | (j33 & j43)) << 8) | (j47 >> 18)) & 4294967295L) + m27222c4 + (m27222c3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    /* renamed from: b */
    private static long m27221b(byte[] bArr, int i11, int i12) {
        return (m27222c(bArr, i11) >> i12) & 67108863;
    }

    /* renamed from: c */
    private static long m27222c(byte[] bArr, int i11) {
        return (((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16)) & 4294967295L;
    }

    /* renamed from: d */
    private static void m27223d(byte[] bArr, long j11, int i11) {
        int i12 = 0;
        while (i12 < 4) {
            bArr[i11 + i12] = (byte) (255 & j11);
            i12++;
            j11 >>= 8;
        }
    }
}
