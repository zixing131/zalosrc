package bb;

import com.google.zxing.WriterException;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import va.EnumC27955c;

/* renamed from: bb.f */
/* loaded from: classes3.dex */
abstract class AbstractC2690f {

    /* renamed from: c */
    private static final byte[] f10739c;

    /* renamed from: a */
    private static final byte[] f10737a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f10738b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    private static final byte[] f10740d = new byte[128];

    /* renamed from: e */
    private static final Charset f10741e = StandardCharsets.ISO_8859_1;

    /* renamed from: bb.f$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10742a;

        static {
            int[] iArr = new int[EnumC2687c.values().length];
            f10742a = iArr;
            try {
                iArr[EnumC2687c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10742a[EnumC2687c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10742a[EnumC2687c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f10739c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = f10737a;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b11 = bArr2[i12];
            if (b11 > 0) {
                f10739c[b11] = (byte) i12;
            }
            i12++;
        }
        Arrays.fill(f10740d, (byte) -1);
        while (true) {
            byte[] bArr3 = f10738b;
            if (i11 < bArr3.length) {
                byte b12 = bArr3[i11];
                if (b12 > 0) {
                    f10740d[b12] = (byte) i11;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:            return r1 - r6;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m13143a(String str, int i11, Charset charset) {
        int i12;
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i13 = i11;
        while (i13 < length) {
            char charAt = str.charAt(i13);
            int i14 = 0;
            while (i14 < 13 && m13153k(charAt) && (i12 = i13 + (i14 = i14 + 1)) < length) {
                charAt = str.charAt(i12);
            }
            char charAt2 = str.charAt(i13);
            if (newEncoder.canEncode(charAt2)) {
                i13++;
            } else {
                throw new WriterException("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + ')');
            }
        }
        return i13 - i11;
    }

    /* renamed from: b */
    private static int m13144b(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        if (i11 < length) {
            char charAt = charSequence.charAt(i11);
            while (m13153k(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:            return (r1 - r7) - r3;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m13145c(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = i11;
        while (i12 < length) {
            char charAt = charSequence.charAt(i12);
            int i13 = 0;
            while (i13 < 13 && m13153k(charAt) && i12 < length) {
                i13++;
                i12++;
                if (i12 < length) {
                    charAt = charSequence.charAt(i12);
                }
            }
            if (i13 <= 0) {
                if (!m13156n(charSequence.charAt(i12))) {
                    break;
                }
                i12++;
            }
        }
        return i12 - i11;
    }

    /* renamed from: d */
    private static void m13146d(byte[] bArr, int i11, int i12, int i13, StringBuilder sb2) {
        int i14;
        if (i12 == 1 && i13 == 0) {
            sb2.append((char) 913);
        } else if (i12 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i12 >= 6) {
            char[] cArr = new char[5];
            i14 = i11;
            while ((i11 + i12) - i14 >= 6) {
                long j11 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    j11 = (j11 << 8) + (bArr[i14 + i15] & 255);
                }
                for (int i16 = 0; i16 < 5; i16++) {
                    cArr[i16] = (char) (j11 % 900);
                    j11 /= 900;
                }
                for (int i17 = 4; i17 >= 0; i17--) {
                    sb2.append(cArr[i17]);
                }
                i14 += 6;
            }
        } else {
            i14 = i11;
        }
        while (i14 < i11 + i12) {
            sb2.append((char) (bArr[i14] & 255));
            i14++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m13147e(String str, EnumC2687c enumC2687c, Charset charset) {
        EnumC27955c m140896b;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f10741e;
        } else if (!f10741e.equals(charset) && (m140896b = EnumC27955c.m140896b(charset.name())) != null) {
            m13150h(m140896b.m140897c(), sb2);
        }
        int length = str.length();
        int i11 = a.f10742a[enumC2687c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (i12 < length) {
                        int m13144b = m13144b(str, i12);
                        if (m13144b >= 13) {
                            sb2.append((char) 902);
                            m13148f(str, i12, m13144b, sb2);
                            i12 += m13144b;
                            i13 = 0;
                            i14 = 2;
                        } else {
                            int m13145c = m13145c(str, i12);
                            if (m13145c < 5 && m13144b != length) {
                                int m13143a = m13143a(str, i12, charset);
                                if (m13143a == 0) {
                                    m13143a = 1;
                                }
                                int i15 = m13143a + i12;
                                byte[] bytes = str.substring(i12, i15).getBytes(charset);
                                if (bytes.length == 1 && i14 == 0) {
                                    m13146d(bytes, 0, 1, 0, sb2);
                                } else {
                                    m13146d(bytes, 0, bytes.length, i14, sb2);
                                    i13 = 0;
                                    i14 = 1;
                                }
                                i12 = i15;
                            } else {
                                if (i14 != 0) {
                                    sb2.append((char) 900);
                                    i13 = 0;
                                    i14 = 0;
                                }
                                i13 = m13149g(str, i12, m13145c, sb2, i13);
                                i12 += m13145c;
                            }
                        }
                    }
                } else {
                    sb2.append((char) 902);
                    m13148f(str, 0, length, sb2);
                }
            } else {
                byte[] bytes2 = str.getBytes(charset);
                m13146d(bytes2, 0, bytes2.length, 1, sb2);
            }
        } else {
            m13149g(str, 0, length, sb2, 0);
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static void m13148f(String str, int i11, int i12, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i12 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i13 = 0;
        while (i13 < i12) {
            sb3.setLength(0);
            int min = Math.min(44, i12 - i13);
            StringBuilder sb4 = new StringBuilder();
            sb4.append('1');
            int i14 = i11 + i13;
            sb4.append(str.substring(i14, i14 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i13 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4 A[EDGE_INSN: B:21:0x00f4->B:22:0x00f4 BREAK  A[LOOP:0: B:2:0x000f->B:16:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x000f A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m13149g(CharSequence charSequence, int i11, int i12, StringBuilder sb2, int i13) {
        StringBuilder sb3 = new StringBuilder(i12);
        int i14 = i13;
        int i15 = 0;
        while (true) {
            int i16 = i11 + i15;
            char charAt = charSequence.charAt(i16);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (m13155m(charAt)) {
                            sb3.append((char) f10740d[charAt]);
                        } else {
                            sb3.append((char) 29);
                            i14 = 0;
                        }
                    } else if (m13154l(charAt)) {
                        sb3.append((char) f10739c[charAt]);
                    } else if (m13152j(charAt)) {
                        sb3.append((char) 28);
                        i14 = 0;
                    } else if (m13151i(charAt)) {
                        sb3.append((char) 27);
                        i14 = 1;
                    } else {
                        int i17 = i16 + 1;
                        if (i17 < i12 && m13155m(charSequence.charAt(i17))) {
                            sb3.append((char) 25);
                            i14 = 3;
                        } else {
                            sb3.append((char) 29);
                            sb3.append((char) f10740d[charAt]);
                        }
                    }
                } else if (m13151i(charAt)) {
                    if (charAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt - 'a'));
                    }
                } else if (m13152j(charAt)) {
                    sb3.append((char) 27);
                    sb3.append((char) (charAt - 'A'));
                } else if (m13154l(charAt)) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) f10740d[charAt]);
                }
                i15++;
                if (i15 < i12) {
                    break;
                }
            } else {
                if (m13152j(charAt)) {
                    if (charAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt - 'A'));
                    }
                } else if (m13151i(charAt)) {
                    sb3.append((char) 27);
                    i14 = 1;
                } else if (m13154l(charAt)) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) f10740d[charAt]);
                }
                i15++;
                if (i15 < i12) {
                }
            }
        }
        int length = sb3.length();
        char c11 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            if (i18 % 2 != 0) {
                c11 = (char) ((c11 * 30) + sb3.charAt(i18));
                sb2.append(c11);
            } else {
                c11 = sb3.charAt(i18);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((c11 * 30) + 29));
        }
        return i14;
    }

    /* renamed from: h */
    private static void m13150h(int i11, StringBuilder sb2) {
        if (i11 >= 0 && i11 < 900) {
            sb2.append((char) 927);
            sb2.append((char) i11);
            return;
        }
        if (i11 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i11 / IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR) - 1));
            sb2.append((char) (i11 % IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR));
        } else if (i11 < 811800) {
            sb2.append((char) 925);
            sb2.append((char) (810900 - i11));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was " + i11);
        }
    }

    /* renamed from: i */
    private static boolean m13151i(char c11) {
        return c11 == ' ' || (c11 >= 'a' && c11 <= 'z');
    }

    /* renamed from: j */
    private static boolean m13152j(char c11) {
        return c11 == ' ' || (c11 >= 'A' && c11 <= 'Z');
    }

    /* renamed from: k */
    private static boolean m13153k(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    /* renamed from: l */
    private static boolean m13154l(char c11) {
        if (f10739c[c11] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static boolean m13155m(char c11) {
        if (f10740d[c11] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static boolean m13156n(char c11) {
        return c11 == '\t' || c11 == '\n' || c11 == '\r' || (c11 >= ' ' && c11 <= '~');
    }
}
