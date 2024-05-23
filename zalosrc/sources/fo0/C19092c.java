package fo0;

/* renamed from: fo0.c */
/* loaded from: classes7.dex */
public class C19092c {

    /* renamed from: b */
    private static C19092c f95031b;

    /* renamed from: c */
    private static C19094e f95032c;

    /* renamed from: a */
    private byte f95033a;

    public C19092c(byte b11, boolean z11) {
        this.f95033a = b11;
        if (f95032c == null) {
            f95032c = AbstractC19093d.m100294a(z11);
        }
    }

    /* renamed from: a */
    public static String m100289a(String str, boolean z11) {
        C19092c c19092c = f95031b;
        byte b11 = 2;
        if (c19092c == null) {
            if (z11) {
                b11 = 3;
            }
            f95031b = new C19092c(b11, false);
        } else {
            if (z11) {
                b11 = 3;
            }
            c19092c.f95033a = b11;
        }
        return f95031b.m100292d(str);
    }

    /* renamed from: b */
    private void m100290b(StringBuffer stringBuffer) {
        int i11 = 0;
        char charAt = stringBuffer.charAt(0);
        int m100296a = f95032c.m100296a(charAt);
        if (m100296a != 0) {
            m100296a = 256;
        }
        int i12 = 1;
        for (int i13 = 1; i13 < stringBuffer.length(); i13++) {
            char charAt2 = stringBuffer.charAt(i13);
            int m100296a2 = f95032c.m100296a(charAt2);
            char m100297b = f95032c.m100297b(charAt, charAt2);
            if (m100297b != 65535 && (m100296a < m100296a2 || m100296a == 0)) {
                stringBuffer.setCharAt(i11, m100297b);
                charAt = m100297b;
            } else {
                if (m100296a2 == 0) {
                    i11 = i12;
                    charAt = charAt2;
                }
                stringBuffer.setCharAt(i12, charAt2);
                i12++;
                m100296a = m100296a2;
            }
        }
        stringBuffer.setLength(i12);
    }

    /* renamed from: c */
    private void m100291c(String str, StringBuffer stringBuffer) {
        StringBuffer stringBuffer2 = new StringBuffer();
        boolean z11 = true;
        if ((this.f95033a & 1) != 0) {
            z11 = false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            stringBuffer2.setLength(0);
            f95032c.m100298c(z11, str.charAt(i11), stringBuffer2);
            for (int i12 = 0; i12 < stringBuffer2.length(); i12++) {
                char charAt = stringBuffer2.charAt(i12);
                int m100296a = f95032c.m100296a(charAt);
                int length = stringBuffer.length();
                if (m100296a != 0) {
                    while (length > 0 && f95032c.m100296a(stringBuffer.charAt(length - 1)) > m100296a) {
                        length--;
                    }
                }
                stringBuffer.insert(length, charAt);
            }
        }
    }

    /* renamed from: d */
    public String m100292d(String str) {
        return m100293e(str, new StringBuffer()).toString();
    }

    /* renamed from: e */
    public StringBuffer m100293e(String str, StringBuffer stringBuffer) {
        if (str.length() != 0) {
            m100291c(str, stringBuffer);
            if ((this.f95033a & 2) != 0) {
                m100290b(stringBuffer);
            }
        }
        return stringBuffer;
    }
}
