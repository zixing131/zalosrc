package au;

/* renamed from: au.s */
/* loaded from: classes4.dex */
public abstract class AbstractC2371s {

    /* renamed from: a */
    private static final char[] f9916a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m12396a(byte[] bArr) {
        return m12397b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static String m12397b(byte[] bArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr2 = new byte[16];
        sb2.append("\n0x");
        sb2.append(m12399d(i11));
        int i13 = i11;
        int i14 = 0;
        while (i13 < i11 + i12) {
            if (i14 == 16) {
                sb2.append(" ");
                for (int i15 = 0; i15 < 16; i15++) {
                    byte b11 = bArr2[i15];
                    if (b11 > 32 && b11 < 126) {
                        sb2.append(new String(bArr2, i15, 1));
                    } else {
                        sb2.append(".");
                    }
                }
                sb2.append("\n0x");
                sb2.append(m12399d(i13));
                i14 = 0;
            }
            byte b12 = bArr[i13];
            sb2.append(" ");
            char[] cArr = f9916a;
            sb2.append(cArr[(b12 >>> 4) & 15]);
            sb2.append(cArr[b12 & 15]);
            bArr2[i14] = b12;
            i13++;
            i14++;
        }
        if (i14 != 16) {
            int i16 = ((16 - i14) * 3) + 1;
            for (int i17 = 0; i17 < i16; i17++) {
                sb2.append(" ");
            }
            for (int i18 = 0; i18 < i14; i18++) {
                byte b13 = bArr2[i18];
                if (b13 > 32 && b13 < 126) {
                    sb2.append(new String(bArr2, i18, 1));
                } else {
                    sb2.append(".");
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static byte[] m12398c(int i11) {
        return new byte[]{(byte) ((i11 >> 24) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 8) & 255), (byte) (i11 & 255)};
    }

    /* renamed from: d */
    public static String m12399d(int i11) {
        return m12400e(m12398c(i11));
    }

    /* renamed from: e */
    public static String m12400e(byte[] bArr) {
        return m12401f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static String m12401f(byte[] bArr, int i11, int i12) {
        char[] cArr = new char[i12 * 2];
        int i13 = 0;
        for (int i14 = i11; i14 < i11 + i12; i14++) {
            byte b11 = bArr[i14];
            int i15 = i13 + 1;
            char[] cArr2 = f9916a;
            cArr[i13] = cArr2[(b11 >>> 4) & 15];
            i13 += 2;
            cArr[i15] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }
}
