package gm0;

/* renamed from: gm0.c */
/* loaded from: classes.dex */
public abstract class AbstractC19509c {

    /* renamed from: a */
    public static final char[] f96864a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* renamed from: b */
    public static final byte[] f96865b = new byte[128];

    static {
        int i11 = 0;
        while (true) {
            char[] cArr = f96864a;
            if (i11 < cArr.length) {
                f96865b[cArr[i11]] = (byte) i11;
                i11++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m101978a(String str) {
        int i11;
        if (str.endsWith("==")) {
            i11 = 2;
        } else if (str.endsWith("=")) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int length = ((str.length() * 3) / 4) - i11;
        byte[] bArr = new byte[length];
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13 += 4) {
            byte[] bArr2 = f96865b;
            byte b11 = bArr2[str.charAt(i13) & 127];
            byte b12 = bArr2[str.charAt(i13 + 1)];
            int i14 = i12 + 1;
            bArr[i12] = (byte) (((b11 << 2) | (b12 >> 4)) & 255);
            if (i14 >= length) {
                return bArr;
            }
            byte b13 = bArr2[str.charAt(i13 + 2) & 127];
            int i15 = i12 + 2;
            bArr[i14] = (byte) (((b12 << 4) | (b13 >> 2)) & 255);
            if (i15 >= length) {
                return bArr;
            }
            i12 += 3;
            bArr[i15] = (byte) ((bArr2[str.charAt(i13 + 3) & 127] | (b13 << 6)) & 255);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:            if (r0 != 2) goto L19;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m101979b(byte[] bArr) {
        byte b11;
        byte b12;
        int length = bArr.length;
        char[] cArr = new char[((length + 2) / 3) * 4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i11 + 1;
            byte b13 = bArr[i11];
            if (i13 < length) {
                byte b14 = bArr[i13];
                i13 = i11 + 2;
                b11 = b14;
            } else {
                b11 = 0;
            }
            if (i13 < length) {
                b12 = bArr[i13];
                i13++;
            } else {
                b12 = 0;
            }
            char[] cArr2 = f96864a;
            cArr[i12] = cArr2[(b13 >> 2) & 63];
            cArr[i12 + 1] = cArr2[((b13 << 4) | ((b11 & 255) >> 4)) & 63];
            int i14 = i12 + 3;
            cArr[i12 + 2] = cArr2[((b11 << 2) | ((b12 & 255) >> 6)) & 63];
            i12 += 4;
            cArr[i14] = cArr2[b12 & 63];
            i11 = i13;
        }
        int i15 = length % 3;
        if (i15 == 1) {
            i12--;
            cArr[i12] = '=';
        }
        cArr[i12 - 1] = '=';
        return new String(cArr);
    }
}
