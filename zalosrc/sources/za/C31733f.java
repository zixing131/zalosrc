package za;

import com.google.zxing.EnumC6846a;
import java.util.Map;
import va.C27954b;

/* renamed from: za.f */
/* loaded from: classes3.dex */
public final class C31733f extends AbstractC31741n {
    /* renamed from: g */
    private static void m152690g(int i11, int[] iArr) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) != 0) {
                i13 = 2;
            }
            iArr[i12] = i13;
        }
    }

    /* renamed from: h */
    private static String m152691h(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt != '@') {
                        if (charAt != '`') {
                            if (charAt != '-' && charAt != '.') {
                                if (charAt <= 26) {
                                    sb2.append('$');
                                    sb2.append((char) (charAt + '@'));
                                } else if (charAt < ' ') {
                                    sb2.append('%');
                                    sb2.append((char) (charAt + '&'));
                                } else if (charAt > ',' && charAt != '/' && charAt != ':') {
                                    if (charAt <= '9') {
                                        sb2.append(charAt);
                                    } else if (charAt <= '?') {
                                        sb2.append('%');
                                        sb2.append((char) (charAt + 11));
                                    } else if (charAt <= 'Z') {
                                        sb2.append(charAt);
                                    } else if (charAt <= '_') {
                                        sb2.append('%');
                                        sb2.append((char) (charAt - 16));
                                    } else if (charAt <= 'z') {
                                        sb2.append('+');
                                        sb2.append((char) (charAt - ' '));
                                    } else if (charAt <= 127) {
                                        sb2.append('%');
                                        sb2.append((char) (charAt - '+'));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i11) + "'");
                                    }
                                } else {
                                    sb2.append('/');
                                    sb2.append((char) (charAt + ' '));
                                }
                            }
                        } else {
                            sb2.append("%W");
                        }
                    } else {
                        sb2.append("%V");
                    }
                }
                sb2.append(charAt);
            } else {
                sb2.append("%U");
            }
        }
        return sb2.toString();
    }

    @Override // za.AbstractC31741n, com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.CODE_39) {
            return super.mo960a(str, enumC6846a, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got " + enumC6846a);
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        int length = str.length();
        if (length <= 80) {
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11)) < 0) {
                    str = m152691h(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i11++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(length * 13) + 25];
            m152690g(148, iArr);
            int m152695b = AbstractC31741n.m152695b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int m152695b2 = m152695b + AbstractC31741n.m152695b(zArr, m152695b, iArr2, false);
            for (int i12 = 0; i12 < length; i12++) {
                m152690g(AbstractC31732e.f145802a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i12))], iArr);
                int m152695b3 = m152695b2 + AbstractC31741n.m152695b(zArr, m152695b2, iArr, true);
                m152695b2 = m152695b3 + AbstractC31741n.m152695b(zArr, m152695b3, iArr2, false);
            }
            m152690g(148, iArr);
            AbstractC31741n.m152695b(zArr, m152695b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }
}
