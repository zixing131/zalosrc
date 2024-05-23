package p229i5;

/* renamed from: i5.o */
/* loaded from: classes2.dex */
public abstract class AbstractC20294o {
    /* renamed from: a */
    public static int m105946a(byte[] bArr, int i11, int i12, int i13) {
        int i14 = (i12 & (-4)) + i11;
        while (i11 < i14) {
            int i15 = ((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | (bArr[i11 + 3] << 24)) * (-862048943);
            int i16 = i13 ^ (((i15 << 15) | (i15 >>> 17)) * 461845907);
            i13 = (((i16 >>> 19) | (i16 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i17 = i12 & 3;
        int i18 = 0;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3) {
                    i18 = (bArr[i14 + 2] & 255) << 16;
                }
                int i19 = i13 ^ i12;
                int i21 = (i19 ^ (i19 >>> 16)) * (-2048144789);
                int i22 = (i21 ^ (i21 >>> 13)) * (-1028477387);
                return i22 ^ (i22 >>> 16);
            }
            i18 |= (bArr[i14 + 1] & 255) << 8;
        }
        int i23 = ((bArr[i14] & 255) | i18) * (-862048943);
        i13 ^= ((i23 >>> 17) | (i23 << 15)) * 461845907;
        int i192 = i13 ^ i12;
        int i212 = (i192 ^ (i192 >>> 16)) * (-2048144789);
        int i222 = (i212 ^ (i212 >>> 13)) * (-1028477387);
        return i222 ^ (i222 >>> 16);
    }
}
