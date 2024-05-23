package vn0;

import fn0.AbstractC19074t;
import on0.AbstractC24341v;

/* renamed from: vn0.w0 */
/* loaded from: classes7.dex */
public abstract class AbstractC28351w0 {

    /* renamed from: a */
    private static final String[] f132113a;

    /* renamed from: b */
    private static final byte[] f132114b;

    static {
        String[] strArr = new String[93];
        for (int i11 = 0; i11 < 32; i11++) {
            strArr[i11] = "\\u" + m142794e(i11 >> 12) + m142794e(i11 >> 8) + m142794e(i11 >> 4) + m142794e(i11);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f132113a = strArr;
        byte[] bArr = new byte[93];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i12] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f132114b = bArr;
    }

    /* renamed from: a */
    public static final byte[] m142790a() {
        return f132114b;
    }

    /* renamed from: b */
    public static final String[] m142791b() {
        return f132113a;
    }

    /* renamed from: c */
    public static final void m142792c(StringBuilder sb2, String str) {
        AbstractC19074t.m100208f(sb2, "<this>");
        AbstractC19074t.m100208f(str, "value");
        sb2.append('\"');
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            String[] strArr = f132113a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) str, i11, i12);
                sb2.append(strArr[charAt]);
                i11 = i12 + 1;
            }
        }
        if (i11 != 0) {
            sb2.append((CharSequence) str, i11, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    /* renamed from: d */
    public static final Boolean m142793d(String str) {
        boolean m127126v;
        boolean m127126v2;
        AbstractC19074t.m100208f(str, "<this>");
        m127126v = AbstractC24341v.m127126v(str, "true", true);
        if (!m127126v) {
            m127126v2 = AbstractC24341v.m127126v(str, "false", true);
            if (m127126v2) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: e */
    private static final char m142794e(int i11) {
        int i12 = i11 & 15;
        return (char) (i12 < 10 ? i12 + 48 : i12 + 87);
    }
}
