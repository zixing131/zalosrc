package p675ya;

import com.google.zxing.AbstractC6847b;
import java.util.Arrays;

/* renamed from: ya.j */
/* loaded from: classes3.dex */
public abstract class AbstractC30871j {
    /* renamed from: a */
    public static int m150055a(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        if (i11 < length) {
            char charAt = charSequence.charAt(i11);
            while (m150060f(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
        }
        return i12;
    }

    /* renamed from: b */
    public static String m150056b(String str, EnumC30873l enumC30873l, AbstractC6847b abstractC6847b, AbstractC6847b abstractC6847b2) {
        int i11 = 0;
        InterfaceC30868g[] interfaceC30868gArr = {new C30862a(), new C30864c(), new C30874m(), new C30875n(), new C30867f(), new C30863b()};
        C30869h c30869h = new C30869h(str);
        c30869h.m150046n(enumC30873l);
        c30869h.m150044l(abstractC6847b, abstractC6847b2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            c30869h.m150050r((char) 236);
            c30869h.m150045m(2);
            c30869h.f142429d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            c30869h.m150050r((char) 237);
            c30869h.m150045m(2);
            c30869h.f142429d += 7;
        }
        while (c30869h.m150041i()) {
            interfaceC30868gArr[i11].mo150007a(c30869h);
            if (c30869h.m150038e() >= 0) {
                i11 = c30869h.m150038e();
                c30869h.m150042j();
            }
        }
        int m150034a = c30869h.m150034a();
        c30869h.m150048p();
        int m150073a = c30869h.m150040g().m150073a();
        if (m150034a < m150073a && i11 != 0 && i11 != 5 && i11 != 4) {
            c30869h.m150050r((char) 254);
        }
        StringBuilder m150035b = c30869h.m150035b();
        if (m150035b.length() < m150073a) {
            m150035b.append((char) 129);
        }
        while (m150035b.length() < m150073a) {
            m150035b.append(m150069o((char) 129, m150035b.length() + 1));
        }
        return c30869h.m150035b().toString();
    }

    /* renamed from: c */
    private static int m150057c(float[] fArr, int[] iArr, int i11, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i12 = 0; i12 < 6; i12++) {
            int ceil = (int) Math.ceil(fArr[i12]);
            iArr[i12] = ceil;
            if (i11 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i11 = ceil;
            }
            if (i11 == ceil) {
                bArr[i12] = (byte) (bArr[i12] + 1);
            }
        }
        return i11;
    }

    /* renamed from: d */
    private static int m150058d(byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 += bArr[i12];
        }
        return i11;
    }

    /* renamed from: e */
    public static void m150059e(char c11) {
        String hexString = Integer.toHexString(c11);
        throw new IllegalArgumentException("Illegal character: " + c11 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: f */
    public static boolean m150060f(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    /* renamed from: g */
    public static boolean m150061g(char c11) {
        return c11 >= 128 && c11 <= 255;
    }

    /* renamed from: h */
    private static boolean m150062h(char c11) {
        return c11 == ' ' || (c11 >= '0' && c11 <= '9') || (c11 >= 'A' && c11 <= 'Z');
    }

    /* renamed from: i */
    private static boolean m150063i(char c11) {
        return c11 >= ' ' && c11 <= '^';
    }

    /* renamed from: j */
    private static boolean m150064j(char c11) {
        return c11 == ' ' || (c11 >= '0' && c11 <= '9') || (c11 >= 'a' && c11 <= 'z');
    }

    /* renamed from: k */
    private static boolean m150065k(char c11) {
        if (!m150067m(c11) && c11 != ' ' && ((c11 < '0' || c11 > '9') && (c11 < 'A' || c11 > 'Z'))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static boolean m150066l(char c11) {
        return false;
    }

    /* renamed from: m */
    private static boolean m150067m(char c11) {
        return c11 == '\r' || c11 == '*' || c11 == '>';
    }

    /* renamed from: n */
    public static int m150068n(CharSequence charSequence, int i11, int i12) {
        float[] fArr;
        char c11;
        if (i11 >= charSequence.length()) {
            return i12;
        }
        int i13 = 6;
        if (i12 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i12] = 0.0f;
        }
        int i14 = 0;
        while (true) {
            int i15 = i11 + i14;
            if (i15 == charSequence.length()) {
                byte[] bArr = new byte[i13];
                int[] iArr = new int[i13];
                int m150057c = m150057c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int m150058d = m150058d(bArr);
                if (iArr[0] == m150057c) {
                    return 0;
                }
                if (m150058d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (m150058d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (m150058d == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (m150058d == 1 && bArr[3] > 0) {
                    return 3;
                }
                return 1;
            }
            char charAt = charSequence.charAt(i15);
            i14++;
            if (m150060f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m150061g(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (m150062h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m150061g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m150064j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m150061g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m150065k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m150061g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m150063i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m150061g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m150066l(charAt)) {
                c11 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c11 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i14 >= 4) {
                int[] iArr2 = new int[i13];
                byte[] bArr2 = new byte[i13];
                m150057c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int m150058d2 = m150058d(bArr2);
                int i16 = iArr2[0];
                int i17 = iArr2[c11];
                if (i16 < i17 && i16 < iArr2[1] && i16 < iArr2[2] && i16 < iArr2[3] && i16 < iArr2[4]) {
                    return 0;
                }
                if (i17 >= i16) {
                    byte b11 = bArr2[1];
                    byte b12 = bArr2[2];
                    byte b13 = bArr2[3];
                    byte b14 = bArr2[4];
                    if (b11 + b12 + b13 + b14 == 0) {
                        return 5;
                    }
                    if (m150058d2 == 1 && b14 > 0) {
                        return 4;
                    }
                    if (m150058d2 == 1 && b12 > 0) {
                        return 2;
                    }
                    if (m150058d2 == 1 && b13 > 0) {
                        return 3;
                    }
                    int i18 = iArr2[1];
                    if (i18 + 1 < i16 && i18 + 1 < i17 && i18 + 1 < iArr2[4] && i18 + 1 < iArr2[2]) {
                        int i19 = iArr2[3];
                        if (i18 < i19) {
                            return 1;
                        }
                        if (i18 == i19) {
                            for (int i21 = i11 + i14 + 1; i21 < charSequence.length(); i21++) {
                                char charAt2 = charSequence.charAt(i21);
                                if (m150067m(charAt2)) {
                                    return 3;
                                }
                                if (!m150065k(charAt2)) {
                                    break;
                                }
                            }
                            return 1;
                        }
                    }
                } else {
                    return 5;
                }
            }
            i13 = 6;
        }
    }

    /* renamed from: o */
    private static char m150069o(char c11, int i11) {
        int i12 = c11 + ((i11 * 149) % 253) + 1;
        if (i12 > 254) {
            i12 -= 254;
        }
        return (char) i12;
    }
}
