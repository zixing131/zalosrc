package co0;

/* renamed from: co0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC3635b {
    /* renamed from: a */
    public static char[] m18323a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return cArr;
    }

    /* renamed from: b */
    public static String m18324b(byte[] bArr) {
        return new String(m18323a(bArr));
    }

    /* renamed from: c */
    public static String m18325c(byte[] bArr) {
        char c11;
        int i11;
        byte b11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < bArr.length) {
            int i15 = i14 + 1;
            byte b12 = bArr[i13];
            if ((b12 & 240) == 240) {
                i14 += 2;
                i13 += 4;
            } else {
                i13 = (b12 & 224) == 224 ? i13 + 3 : (b12 & 192) == 192 ? i13 + 2 : i13 + 1;
                i14 = i15;
            }
        }
        char[] cArr = new char[i14];
        int i16 = 0;
        while (i12 < bArr.length) {
            byte b13 = bArr[i12];
            if ((b13 & 240) == 240) {
                int i17 = (((((b13 & 3) << 18) | ((bArr[i12 + 1] & 63) << 12)) | ((bArr[i12 + 2] & 63) << 6)) | (bArr[i12 + 3] & 63)) - 65536;
                char c12 = (char) ((i17 >> 10) | 55296);
                c11 = (char) ((i17 & 1023) | 56320);
                cArr[i16] = c12;
                i12 += 4;
                i16++;
            } else if ((b13 & 224) == 224) {
                c11 = (char) (((b13 & 15) << 12) | ((bArr[i12 + 1] & 63) << 6) | (bArr[i12 + 2] & 63));
                i12 += 3;
            } else {
                if ((b13 & 208) == 208) {
                    i11 = (b13 & 31) << 6;
                    b11 = bArr[i12 + 1];
                } else if ((b13 & 192) == 192) {
                    i11 = (b13 & 31) << 6;
                    b11 = bArr[i12 + 1];
                } else {
                    c11 = (char) (b13 & 255);
                    i12++;
                }
                c11 = (char) (i11 | (b11 & 63));
                i12 += 2;
            }
            cArr[i16] = c11;
            i16++;
        }
        return new String(cArr);
    }
}
