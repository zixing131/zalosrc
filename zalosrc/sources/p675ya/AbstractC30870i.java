package p675ya;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: ya.i */
/* loaded from: classes3.dex */
public abstract class AbstractC30870i {

    /* renamed from: a */
    private static final int[] f142433a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b */
    private static final int[][] f142434b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10, 213, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};

    /* renamed from: c */
    private static final int[] f142435c = new int[256];

    /* renamed from: d */
    private static final int[] f142436d = new int[255];

    static {
        int i11 = 1;
        for (int i12 = 0; i12 < 255; i12++) {
            f142436d[i12] = i11;
            f142435c[i11] = i12;
            i11 *= 2;
            if (i11 >= 256) {
                i11 ^= 301;
            }
        }
    }

    /* renamed from: a */
    private static String m150052a(CharSequence charSequence, int i11) {
        return m150053b(charSequence, 0, charSequence.length(), i11);
    }

    /* renamed from: b */
    private static String m150053b(CharSequence charSequence, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = 0;
        while (true) {
            int[] iArr = f142433a;
            if (i16 < iArr.length) {
                if (iArr[i16] == i13) {
                    break;
                }
                i16++;
            } else {
                i16 = -1;
                break;
            }
        }
        if (i16 >= 0) {
            int[] iArr2 = f142434b[i16];
            char[] cArr = new char[i13];
            for (int i17 = 0; i17 < i13; i17++) {
                cArr[i17] = 0;
            }
            for (int i18 = i11; i18 < i11 + i12; i18++) {
                int i19 = i13 - 1;
                int charAt = cArr[i19] ^ charSequence.charAt(i18);
                while (i19 > 0) {
                    if (charAt != 0 && (i15 = iArr2[i19]) != 0) {
                        char c11 = cArr[i19 - 1];
                        int[] iArr3 = f142436d;
                        int[] iArr4 = f142435c;
                        cArr[i19] = (char) (iArr3[(iArr4[charAt] + iArr4[i15]) % 255] ^ c11);
                    } else {
                        cArr[i19] = cArr[i19 - 1];
                    }
                    i19--;
                }
                if (charAt != 0 && (i14 = iArr2[0]) != 0) {
                    int[] iArr5 = f142436d;
                    int[] iArr6 = f142435c;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i14]) % 255];
                } else {
                    cArr[0] = 0;
                }
            }
            char[] cArr2 = new char[i13];
            for (int i21 = 0; i21 < i13; i21++) {
                cArr2[i21] = cArr[(i13 - i21) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: " + i13);
    }

    /* renamed from: c */
    public static String m150054c(String str, C30872k c30872k) {
        if (str.length() == c30872k.m150073a()) {
            StringBuilder sb2 = new StringBuilder(c30872k.m150073a() + c30872k.m150074c());
            sb2.append(str);
            int mo150018f = c30872k.mo150018f();
            if (mo150018f == 1) {
                sb2.append(m150052a(str, c30872k.m150074c()));
            } else {
                sb2.setLength(sb2.capacity());
                int[] iArr = new int[mo150018f];
                int[] iArr2 = new int[mo150018f];
                int i11 = 0;
                while (i11 < mo150018f) {
                    int i12 = i11 + 1;
                    iArr[i11] = c30872k.mo150017b(i12);
                    iArr2[i11] = c30872k.m150075d(i12);
                    i11 = i12;
                }
                for (int i13 = 0; i13 < mo150018f; i13++) {
                    StringBuilder sb3 = new StringBuilder(iArr[i13]);
                    for (int i14 = i13; i14 < c30872k.m150073a(); i14 += mo150018f) {
                        sb3.append(str.charAt(i14));
                    }
                    String m150052a = m150052a(sb3.toString(), iArr2[i13]);
                    int i15 = i13;
                    int i16 = 0;
                    while (i15 < iArr2[i13] * mo150018f) {
                        sb2.setCharAt(c30872k.m150073a() + i15, m150052a.charAt(i16));
                        i15 += mo150018f;
                        i16++;
                    }
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}
