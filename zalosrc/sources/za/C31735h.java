package za;

import com.google.zxing.EnumC6846a;
import java.util.Map;
import va.C27954b;

/* renamed from: za.h */
/* loaded from: classes3.dex */
public class C31735h extends AbstractC31741n {
    /* renamed from: g */
    private static int m152692g(boolean[] zArr, int i11, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            boolean z11 = true;
            int i14 = i11 + i13;
            if (((1 << (8 - i13)) & i12) == 0) {
                z11 = false;
            }
            zArr[i14] = z11;
        }
        return 9;
    }

    /* renamed from: h */
    private static int m152693h(String str, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        return i12 % 47;
    }

    /* renamed from: i */
    static String m152694i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == 0) {
                sb2.append("bU");
            } else if (charAt <= 26) {
                sb2.append('a');
                sb2.append((char) (charAt + '@'));
            } else if (charAt <= 31) {
                sb2.append('b');
                sb2.append((char) (charAt + '&'));
            } else if (charAt != ' ' && charAt != '$' && charAt != '%' && charAt != '+') {
                if (charAt <= ',') {
                    sb2.append('c');
                    sb2.append((char) (charAt + ' '));
                } else if (charAt <= '9') {
                    sb2.append(charAt);
                } else if (charAt == ':') {
                    sb2.append("cZ");
                } else if (charAt <= '?') {
                    sb2.append('b');
                    sb2.append((char) (charAt + 11));
                } else if (charAt == '@') {
                    sb2.append("bV");
                } else if (charAt <= 'Z') {
                    sb2.append(charAt);
                } else if (charAt <= '_') {
                    sb2.append('b');
                    sb2.append((char) (charAt - 16));
                } else if (charAt == '`') {
                    sb2.append("bW");
                } else if (charAt <= 'z') {
                    sb2.append('d');
                    sb2.append((char) (charAt - ' '));
                } else if (charAt <= 127) {
                    sb2.append('b');
                    sb2.append((char) (charAt - '+'));
                } else {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                }
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    @Override // za.AbstractC31741n, com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.CODE_93) {
            return super.mo960a(str, enumC6846a, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got " + enumC6846a);
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        String m152694i = m152694i(str);
        int length = m152694i.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[((m152694i.length() + 4) * 9) + 1];
            int m152692g = m152692g(zArr, 0, AbstractC31734g.f145805c);
            for (int i11 = 0; i11 < length; i11++) {
                m152692g += m152692g(zArr, m152692g, AbstractC31734g.f145804b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(m152694i.charAt(i11))]);
            }
            int m152693h = m152693h(m152694i, 20);
            int[] iArr = AbstractC31734g.f145804b;
            int m152692g2 = m152692g + m152692g(zArr, m152692g, iArr[m152693h]);
            int m152692g3 = m152692g2 + m152692g(zArr, m152692g2, iArr[m152693h(m152694i + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(m152693h), 15)]);
            zArr[m152692g3 + m152692g(zArr, m152692g3, AbstractC31734g.f145805c)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got " + length);
    }
}
