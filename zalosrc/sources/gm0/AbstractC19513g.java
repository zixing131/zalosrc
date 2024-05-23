package gm0;

/* renamed from: gm0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC19513g {
    /* renamed from: a */
    public static String m101987a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        int i11 = 0;
        while (i11 < bArr.length) {
            byte b11 = bArr[i11];
            int i12 = b11 & 255;
            if ((b11 & 128) == 0) {
                if (i12 == 0) {
                    break;
                }
                sb2.append((char) i12);
            } else if ((b11 & 224) == 192) {
                i11++;
                if (i11 < bArr.length) {
                    byte b12 = bArr[i11];
                    if ((b12 & 192) == 128) {
                        sb2.append(((char) ((b11 & 31) << 6)) | (b12 & 63));
                    } else {
                        throw new IllegalArgumentException("invalid UTF-8");
                    }
                } else {
                    throw new IllegalArgumentException("invalid UTF-8");
                }
            } else if ((b11 & 240) == 224) {
                if (i11 + 2 < bArr.length) {
                    byte b13 = bArr[i11 + 1];
                    if ((b13 & 192) == 128) {
                        i11 += 2;
                        byte b14 = bArr[i11];
                        if ((b14 & 192) == 128) {
                            sb2.append((char) (((b11 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63)));
                        } else {
                            throw new IllegalArgumentException("invalid UTF-8");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid UTF-8");
                    }
                } else {
                    throw new IllegalArgumentException("invalid UTF-8");
                }
            } else {
                throw new IllegalArgumentException("invalid UTF-8");
            }
            i11++;
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static byte[] m101988b(String str) {
        char[] charArray = str.toCharArray();
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char c11 = charArray[i12];
            if (c11 >= 1 && c11 <= 127) {
                i11++;
            } else if (c11 != 0 && (c11 < 128 || c11 > 2047)) {
                i11 += 3;
            } else {
                i11 += 2;
            }
        }
        byte[] bArr = new byte[i11];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char c12 = charArray[i14];
            if (c12 >= 1 && c12 <= 127) {
                bArr[i13] = (byte) c12;
                i13++;
            } else if (c12 != 0 && (c12 < 128 || c12 > 2047)) {
                bArr[i13] = (byte) (((c12 >> '\f') & 15) | 224);
                int i15 = i13 + 2;
                bArr[i13 + 1] = (byte) (((c12 >> 6) & 63) | 128);
                i13 += 3;
                bArr[i15] = (byte) ((c12 & '?') | 128);
            } else {
                int i16 = i13 + 1;
                bArr[i13] = (byte) (((c12 >> 6) & 31) | 192);
                i13 += 2;
                bArr[i16] = (byte) ((c12 & '?') | 128);
            }
        }
        return bArr;
    }
}
