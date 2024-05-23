package p623ww;

import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import p454qn.AbstractC25384a;

/* renamed from: ww.a */
/* loaded from: classes4.dex */
public final class C29251a {

    /* renamed from: a */
    public static final C29251a f135466a = new C29251a();

    private C29251a() {
    }

    /* renamed from: a */
    private final void m146041a(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(str2.length())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        sb2.append(format);
        sb2.append(str2);
    }

    /* renamed from: b */
    private final String m146042b(byte[] bArr) {
        boolean z11;
        int i11 = 65535;
        for (byte b11 : bArr) {
            for (int i12 = 0; i12 < 8; i12++) {
                boolean z12 = true;
                if (((b11 >> (7 - i12)) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (((i11 >> 15) & 1) != 1) {
                    z12 = false;
                }
                i11 <<= 1;
                if (z11 ^ z12) {
                    i11 ^= 4129;
                }
            }
        }
        String hexString = Integer.toHexString(i11 & 65535);
        AbstractC19074t.m100207e(hexString, "toHexString(...)");
        return hexString;
    }

    /* renamed from: c */
    private final String m146043c(String str, String str2) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(str2.length())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return str + format + str2;
    }

    /* renamed from: e */
    private final String m146044e(String str) {
        int length = 4 - str.length();
        if (length <= 0) {
            return str;
        }
        char[] cArr = new char[length];
        Arrays.fill(cArr, '0');
        return new String(cArr) + str;
    }

    /* renamed from: d */
    public final String m146045d(String str, String str2) {
        AbstractC19074t.m100208f(str, "bin");
        AbstractC19074t.m100208f(str2, "bankAccountNumber");
        StringBuilder sb2 = new StringBuilder();
        m146041a(sb2, "00", "01");
        m146041a(sb2, "01", "11");
        m146041a(sb2, "38", m146043c("00", "A000000727") + m146043c("01", m146043c("00", str) + m146043c("01", AbstractC25384a.m131570a(str2))) + m146043c("02", "QRIBFTTA"));
        m146041a(sb2, "53", "704");
        m146041a(sb2, "58", "VN");
        m146041a(sb2, "80", m146043c("00", "com.vng.zalo") + m146043c("01", "ZABANKCARD"));
        sb2.append("6304");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        Charset charset = StandardCharsets.UTF_8;
        AbstractC19074t.m100207e(charset, "UTF_8");
        byte[] bytes = sb3.getBytes(charset);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        String m146042b = m146042b(bytes);
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String upperCase = m146042b.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        sb2.append(m146044e(upperCase));
        String sb4 = sb2.toString();
        AbstractC19074t.m100207e(sb4, "toString(...)");
        return sb4;
    }
}
