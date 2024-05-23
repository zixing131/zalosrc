package p229i5;

/* renamed from: i5.k */
/* loaded from: classes2.dex */
public abstract class AbstractC20290k {

    /* renamed from: a */
    private static final char[] f100244a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f100245b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m105936a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            char[] cArr2 = f100245b;
            cArr[i11] = cArr2[(b11 & 255) >>> 4];
            i11 += 2;
            cArr[i12] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m105937b(byte[] bArr, boolean z11) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i11 = 0; i11 < length && (!z11 || i11 != length - 1 || (bArr[i11] & 255) != 0); i11++) {
            char[] cArr = f100244a;
            sb2.append(cArr[(bArr[i11] & 240) >>> 4]);
            sb2.append(cArr[bArr[i11] & 15]);
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static byte[] m105938c(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 2;
                bArr[i11 / 2] = (byte) Integer.parseInt(str.substring(i11, i12), 16);
                i11 = i12;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
