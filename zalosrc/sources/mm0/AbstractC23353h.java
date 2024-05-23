package mm0;

/* renamed from: mm0.h */
/* loaded from: classes7.dex */
public abstract class AbstractC23353h {
    /* renamed from: a */
    public static String m122789a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if ((bArr[i11] & 255) < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Long.toString(bArr[i11] & 255, 16));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m122790b(String str, String str2) {
        String substring = str.substring(5, 21);
        C23346a c23346a = new C23346a();
        c23346a.m122757f(substring.getBytes());
        byte[] bArr = new byte[16];
        int length = str2.getBytes().length / 16;
        int i11 = length + 1;
        String str3 = "";
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = new byte[16];
            if (i12 == length) {
                int i13 = i12 * 16;
                System.arraycopy(str2.getBytes(), i13, bArr2, 0, str2.getBytes().length - i13);
            } else {
                System.arraycopy(str2.getBytes(), i12 * 16, bArr2, 0, 16);
            }
            if (c23346a.m122758g(bArr2, 0, bArr, 0) == 16) {
                str3 = str3 + m122789a(bArr);
            }
        }
        return str3;
    }
}
