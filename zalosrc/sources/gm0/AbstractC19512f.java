package gm0;

/* renamed from: gm0.f */
/* loaded from: classes.dex */
public abstract class AbstractC19512f {

    /* renamed from: a */
    public static final char[] f96866a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final byte[] f96867b = new byte[128];

    static {
        m101982a();
    }

    /* renamed from: a */
    public static void m101982a() {
        int i11 = 0;
        while (true) {
            char[] cArr = f96866a;
            if (i11 < cArr.length) {
                f96867b[cArr[i11]] = (byte) i11;
                i11++;
            } else {
                byte[] bArr = f96867b;
                bArr[97] = bArr[65];
                bArr[98] = bArr[66];
                bArr[99] = bArr[67];
                bArr[100] = bArr[68];
                bArr[101] = bArr[69];
                bArr[102] = bArr[70];
                return;
            }
        }
    }

    /* renamed from: b */
    public static boolean m101983b(char c11) {
        return c11 == '\n' || c11 == '\r' || c11 == '\t' || c11 == ' ';
    }

    /* renamed from: c */
    public static byte[] m101984c(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int i11 = 0;
        for (char c11 : str.toCharArray()) {
            if (!m101983b(c11)) {
                sb2.append(c11);
            }
        }
        if (sb2.length() % 2 != 0) {
            sb2.insert(0, '0');
        }
        byte[] bArr = new byte[sb2.length() / 2];
        char[] charArray = sb2.toString().toCharArray();
        int i12 = 0;
        while (i11 < charArray.length) {
            byte[] bArr2 = f96867b;
            int i13 = i11 + 1;
            byte b11 = (byte) (bArr2[charArray[i11] & 127] << 4);
            i11 += 2;
            bArr[i12] = (byte) (bArr2[(byte) charArray[i13]] | b11);
            i12++;
        }
        return bArr;
    }

    /* renamed from: d */
    public static String m101985d(byte[] bArr) {
        return m101986e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static String m101986e(byte[] bArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(i12 * 2);
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            byte b11 = bArr[i13];
            char[] cArr = f96866a;
            sb2.append(cArr[(b11 & 255) >>> 4]);
            sb2.append(cArr[b11 & 15]);
        }
        return sb2.toString();
    }
}
