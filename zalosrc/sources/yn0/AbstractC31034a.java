package yn0;

import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import okio.C24291a;
import okio.C24293c;
import xn0.AbstractC30176f;
import xn0.AbstractC30178h;

/* renamed from: yn0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC31034a {

    /* renamed from: a */
    public static final byte[] f143117a;

    /* renamed from: c */
    public static final AbstractC30178h f143119c;

    /* renamed from: d */
    public static final AbstractC30176f f143120d;

    /* renamed from: r */
    private static final Method f143134r;

    /* renamed from: s */
    private static final Pattern f143135s;

    /* renamed from: b */
    public static final String[] f143118b = new String[0];

    /* renamed from: e */
    private static final C24293c f143121e = C24293c.m126818d("efbbbf");

    /* renamed from: f */
    private static final C24293c f143122f = C24293c.m126818d("feff");

    /* renamed from: g */
    private static final C24293c f143123g = C24293c.m126818d("fffe");

    /* renamed from: h */
    private static final C24293c f143124h = C24293c.m126818d("0000ffff");

    /* renamed from: i */
    private static final C24293c f143125i = C24293c.m126818d("ffff0000");

    /* renamed from: j */
    public static final Charset f143126j = Charset.forName("UTF-8");

    /* renamed from: k */
    public static final Charset f143127k = Charset.forName("ISO-8859-1");

    /* renamed from: l */
    private static final Charset f143128l = Charset.forName("UTF-16BE");

    /* renamed from: m */
    private static final Charset f143129m = Charset.forName("UTF-16LE");

    /* renamed from: n */
    private static final Charset f143130n = Charset.forName("UTF-32BE");

    /* renamed from: o */
    private static final Charset f143131o = Charset.forName("UTF-32LE");

    /* renamed from: p */
    public static final TimeZone f143132p = TimeZone.getTimeZone("GMT");

    /* renamed from: q */
    public static final Comparator f143133q = new a();

    /* renamed from: yn0.a$a */
    /* loaded from: classes7.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        f143117a = bArr;
        Method method = null;
        f143119c = AbstractC30178h.m148854b(null, bArr);
        f143120d = AbstractC30176f.m148851a(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f143134r = method;
        f143135s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: a */
    public static String m150850a(String str) {
        InetAddress m150856g;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                m150856g = m150856g(str, 1, str.length() - 1);
            } else {
                m150856g = m150856g(str, 0, str.length());
            }
            if (m150856g == null) {
                return null;
            }
            byte[] address = m150856g.getAddress();
            if (address.length == 16) {
                return m150859j(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (m150853d(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m150851b(long j11, long j12, long j13) {
        if ((j12 | j13) >= 0 && j12 <= j11 && j11 - j12 >= j13) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: c */
    public static void m150852c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private static boolean m150853d(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static int m150854e(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'a' && c11 <= 'f') {
            return c11 - 'W';
        }
        if (c11 < 'A' || c11 > 'F') {
            return -1;
        }
        return c11 - '7';
    }

    /* renamed from: f */
    private static boolean m150855f(String str, int i11, int i12, byte[] bArr, int i13) {
        int i14 = i13;
        while (i11 < i12) {
            if (i14 == bArr.length) {
                return false;
            }
            if (i14 != i13) {
                if (str.charAt(i11) != '.') {
                    return false;
                }
                i11++;
            }
            int i15 = i11;
            int i16 = 0;
            while (i15 < i12) {
                char charAt = str.charAt(i15);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i16 == 0 && i11 != i15) || (i16 = ((i16 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i15++;
            }
            if (i15 - i11 == 0) {
                return false;
            }
            bArr[i14] = (byte) i16;
            i14++;
            i11 = i15;
        }
        if (i14 != i13 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:            return null;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InetAddress m150856g(String str, int i11, int i12) {
        int i13;
        byte[] bArr = new byte[16];
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (true) {
            if (i11 < i12) {
                if (i14 == 16) {
                    return null;
                }
                int i17 = i11 + 2;
                if (i17 <= i12 && str.regionMatches(i11, "::", 0, 2)) {
                    if (i15 != -1) {
                        return null;
                    }
                    i14 += 2;
                    i15 = i14;
                    if (i17 != i12) {
                        i16 = i17;
                        i11 = i16;
                        int i18 = 0;
                        while (i11 < i12) {
                        }
                        i13 = i11 - i16;
                        if (i13 == 0) {
                            break;
                        }
                        break;
                    }
                    break;
                }
                if (i14 != 0) {
                    if (str.regionMatches(i11, ":", 0, 1)) {
                        i11++;
                    } else {
                        if (!str.regionMatches(i11, ".", 0, 1) || !m150855f(str, i16, i12, bArr, i14 - 2)) {
                            return null;
                        }
                        i14 += 2;
                    }
                }
                i16 = i11;
                i11 = i16;
                int i182 = 0;
                while (i11 < i12) {
                    int m150854e = m150854e(str.charAt(i11));
                    if (m150854e == -1) {
                        break;
                    }
                    i182 = (i182 << 4) + m150854e;
                    i11++;
                }
                i13 = i11 - i16;
                if (i13 == 0 || i13 > 4) {
                    break;
                }
                int i19 = i14 + 1;
                bArr[i14] = (byte) ((i182 >>> 8) & 255);
                i14 += 2;
                bArr[i19] = (byte) (i182 & 255);
            } else {
                break;
            }
        }
        if (i14 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i21 = i14 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i21, i21);
            Arrays.fill(bArr, i15, (16 - i14) + i15, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: h */
    public static int m150857h(String str, int i11, int i12, char c11) {
        while (i11 < i12) {
            if (str.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    /* renamed from: i */
    public static int m150858i(String str, int i11, int i12, String str2) {
        while (i11 < i12) {
            if (str2.indexOf(str.charAt(i11)) != -1) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    /* renamed from: j */
    private static String m150859j(byte[] bArr) {
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < bArr.length) {
            int i15 = i13;
            while (i15 < 16 && bArr[i15] == 0 && bArr[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        C24291a c24291a = new C24291a();
        while (i12 < bArr.length) {
            if (i12 == i11) {
                c24291a.m126799E(58);
                i12 += i14;
                if (i12 == 16) {
                    c24291a.m126799E(58);
                }
            } else {
                if (i12 > 0) {
                    c24291a.m126799E(58);
                }
                c24291a.m126800G(((bArr[i12] & 255) << 8) | (bArr[i12 + 1] & 255));
                i12 += 2;
            }
        }
        return c24291a.m126812q();
    }

    /* renamed from: k */
    public static int m150860k(String str, int i11, int i12) {
        while (i11 < i12) {
            char charAt = str.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    /* renamed from: l */
    public static int m150861l(String str, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            char charAt = str.charAt(i13);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i13 + 1;
            }
        }
        return i11;
    }
}
