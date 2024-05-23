package vn0;

import on0.AbstractC24318b0;

/* renamed from: vn0.g */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC28318g {
    /* renamed from: a */
    public static /* synthetic */ String m142705a(long j11, int i11) {
        if (j11 == 0) {
            return "0";
        }
        if (j11 > 0) {
            return Long.toString(j11, i11);
        }
        if (i11 < 2 || i11 > 36) {
            i11 = 10;
        }
        int i12 = 64;
        char[] cArr = new char[64];
        int i13 = i11 - 1;
        if ((i11 & i13) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i11);
            do {
                i12--;
                cArr[i12] = Character.forDigit(((int) j11) & i13, i11);
                j11 >>>= numberOfTrailingZeros;
            } while (j11 != 0);
        } else {
            long m126978a = (i11 & 1) == 0 ? (j11 >>> 1) / (i11 >>> 1) : AbstractC24318b0.m126978a(j11, i11);
            long j12 = i11;
            cArr[63] = Character.forDigit((int) (j11 - (m126978a * j12)), i11);
            i12 = 63;
            while (m126978a > 0) {
                i12--;
                cArr[i12] = Character.forDigit((int) (m126978a % j12), i11);
                m126978a /= j12;
            }
        }
        return new String(cArr, i12, 64 - i12);
    }
}
