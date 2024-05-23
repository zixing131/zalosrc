package on0;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import ln0.AbstractC22543l;
import ln0.C22537f;
import qm0.AbstractC25351j0;

/* renamed from: on0.v */
/* loaded from: classes.dex */
public abstract class AbstractC24341v extends AbstractC24340u {
    /* renamed from: A */
    public static final String m127111A(String str, char c11, char c12, boolean z11) {
        AbstractC19074t.m100208f(str, "<this>");
        if (!z11) {
            String replace = str.replace(c11, c12);
            AbstractC19074t.m100207e(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (AbstractC24319c.m126979d(charAt, c11, z11)) {
                charAt = c12;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: B */
    public static String m127112B(String str, String str2, String str3, boolean z11) {
        int m127167X;
        int m116580c;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "oldValue");
        AbstractC19074t.m100208f(str3, "newValue");
        int i11 = 0;
        m127167X = AbstractC24342w.m127167X(str, str2, 0, z11);
        if (m127167X < 0) {
            return str;
        }
        int length = str2.length();
        m116580c = AbstractC22543l.m116580c(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i11, m127167X);
                sb2.append(str3);
                i11 = m127167X + length;
                if (m127167X >= str.length()) {
                    break;
                }
                m127167X = AbstractC24342w.m127167X(str, str2, m127167X + m116580c, z11);
            } while (m127167X > 0);
            sb2.append((CharSequence) str, i11, str.length());
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: C */
    public static /* synthetic */ String m127113C(String str, char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return m127111A(str, c11, c12, z11);
    }

    /* renamed from: D */
    public static /* synthetic */ String m127114D(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        String m127112B;
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        m127112B = m127112B(str, str2, str3, z11);
        return m127112B;
    }

    /* renamed from: E */
    public static final String m127115E(String str, String str2, String str3, boolean z11) {
        int m127173b0;
        CharSequence m127193v0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "oldValue");
        AbstractC19074t.m100208f(str3, "newValue");
        m127173b0 = AbstractC24342w.m127173b0(str, str2, 0, z11, 2, null);
        if (m127173b0 >= 0) {
            m127193v0 = AbstractC24342w.m127193v0(str, m127173b0, str2.length() + m127173b0, str3);
            return m127193v0.toString();
        }
        return str;
    }

    /* renamed from: F */
    public static /* synthetic */ String m127116F(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return m127115E(str, str2, str3, z11);
    }

    /* renamed from: G */
    public static final boolean m127117G(String str, String str2, int i11, boolean z11) {
        boolean m127129y;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "prefix");
        if (z11) {
            m127129y = m127129y(str, i11, str2, 0, str2.length(), z11);
            return m127129y;
        }
        return str.startsWith(str2, i11);
    }

    /* renamed from: H */
    public static boolean m127118H(String str, String str2, boolean z11) {
        boolean m127129y;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "prefix");
        if (z11) {
            m127129y = m127129y(str, 0, str2, 0, str2.length(), z11);
            return m127129y;
        }
        return str.startsWith(str2);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m127119I(String str, String str2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return m127117G(str, str2, i11, z11);
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m127120J(String str, String str2, boolean z11, int i11, Object obj) {
        boolean m127118H;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        m127118H = m127118H(str, str2, z11);
        return m127118H;
    }

    /* renamed from: q */
    public static int m127121q(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "other");
        if (z11) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    /* renamed from: r */
    public static String m127122r(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "<this>");
        return new String(bArr, C24321d.f117408b);
    }

    /* renamed from: s */
    public static byte[] m127123s(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        return bytes;
    }

    /* renamed from: t */
    public static boolean m127124t(String str, String str2, boolean z11) {
        boolean m127129y;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "suffix");
        if (z11) {
            m127129y = m127129y(str, str.length() - str2.length(), str2, 0, str2.length(), true);
            return m127129y;
        }
        return str.endsWith(str2);
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m127125u(String str, String str2, boolean z11, int i11, Object obj) {
        boolean m127124t;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        m127124t = m127124t(str, str2, z11);
        return m127124t;
    }

    /* renamed from: v */
    public static boolean m127126v(String str, String str2, boolean z11) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z11) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m127127w(String str, String str2, boolean z11, int i11, Object obj) {
        boolean m127126v;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        m127126v = m127126v(str, str2, z11);
        return m127126v;
    }

    /* renamed from: x */
    public static boolean m127128x(CharSequence charSequence) {
        boolean m126977c;
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable m127161U = AbstractC24342w.m127161U(charSequence);
            if (!(m127161U instanceof Collection) || !((Collection) m127161U).isEmpty()) {
                Iterator it = m127161U.iterator();
                while (it.hasNext()) {
                    m126977c = AbstractC24317b.m126977c(charSequence.charAt(((AbstractC25351j0) it).mo116552a()));
                    if (!m126977c) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m127129y(String str, int i11, String str2, int i12, int i13, boolean z11) {
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "other");
        if (!z11) {
            return str.regionMatches(i11, str2, i12, i13);
        }
        return str.regionMatches(z11, i11, str2, i12, i13);
    }

    /* renamed from: z */
    public static String m127130z(CharSequence charSequence, int i11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (i11 >= 0) {
            if (i11 == 0) {
                return "";
            }
            if (i11 != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb2 = new StringBuilder(charSequence.length() * i11);
                    AbstractC25351j0 it = new C22537f(1, i11).iterator();
                    while (it.hasNext()) {
                        it.mo116552a();
                        sb2.append(charSequence);
                    }
                    String sb3 = sb2.toString();
                    AbstractC19074t.m100205c(sb3);
                    return sb3;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    cArr[i12] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i11 + '.').toString());
    }
}
