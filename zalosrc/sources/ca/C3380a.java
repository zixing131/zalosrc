package ca;

import com.google.gson.stream.MalformedJsonException;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p674y9.AbstractC30849f;

/* renamed from: ca.a */
/* loaded from: classes3.dex */
public class C3380a implements Closeable {

    /* renamed from: E */
    private static final char[] f14275E = ")]}'\n".toCharArray();

    /* renamed from: A */
    private int[] f14276A;

    /* renamed from: C */
    private String[] f14278C;

    /* renamed from: D */
    private int[] f14279D;

    /* renamed from: p */
    private final Reader f14280p;

    /* renamed from: x */
    private long f14288x;

    /* renamed from: y */
    private int f14289y;

    /* renamed from: z */
    private String f14290z;

    /* renamed from: q */
    private boolean f14281q = false;

    /* renamed from: r */
    private final char[] f14282r = new char[1024];

    /* renamed from: s */
    private int f14283s = 0;

    /* renamed from: t */
    private int f14284t = 0;

    /* renamed from: u */
    private int f14285u = 0;

    /* renamed from: v */
    private int f14286v = 0;

    /* renamed from: w */
    int f14287w = 0;

    /* renamed from: B */
    private int f14277B = 1;

    /* renamed from: ca.a$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC30849f {
        a() {
        }

        @Override // p674y9.AbstractC30849f
        /* renamed from: a */
        public void mo17015a(C3380a c3380a) {
            int i11 = c3380a.f14287w;
            if (i11 == 0) {
                i11 = c3380a.m17005f();
            }
            if (i11 == 13) {
                c3380a.f14287w = 9;
                return;
            }
            if (i11 == 12) {
                c3380a.f14287w = 8;
                return;
            }
            if (i11 == 14) {
                c3380a.f14287w = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + c3380a.m17001N() + c3380a.m17012t());
        }
    }

    static {
        AbstractC30849f.f142352a = new a();
    }

    public C3380a(Reader reader) {
        int[] iArr = new int[32];
        this.f14276A = iArr;
        iArr[0] = 6;
        this.f14278C = new String[32];
        this.f14279D = new int[32];
        if (reader != null) {
            this.f14280p = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: G */
    private int m16980G(boolean z11) {
        char[] cArr = this.f14282r;
        int i11 = this.f14283s;
        int i12 = this.f14284t;
        while (true) {
            if (i11 == i12) {
                this.f14283s = i11;
                if (!m16994o(1)) {
                    if (!z11) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m17012t());
                }
                i11 = this.f14283s;
                i12 = this.f14284t;
            }
            int i13 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 == '\n') {
                this.f14285u++;
                this.f14286v = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f14283s = i13;
                    if (i13 == i12) {
                        this.f14283s = i11;
                        boolean m16994o = m16994o(2);
                        this.f14283s++;
                        if (!m16994o) {
                            return c11;
                        }
                    }
                    m16988c();
                    int i14 = this.f14283s;
                    char c12 = cArr[i14];
                    if (c12 != '*') {
                        if (c12 != '/') {
                            return c11;
                        }
                        this.f14283s = i14 + 1;
                        m16991d0();
                        i11 = this.f14283s;
                        i12 = this.f14284t;
                    } else {
                        this.f14283s = i14 + 1;
                        if (m16989c0("*/")) {
                            i11 = this.f14283s + 2;
                            i12 = this.f14284t;
                        } else {
                            throw m16993i0("Unterminated comment");
                        }
                    }
                } else if (c11 == '#') {
                    this.f14283s = i13;
                    m16988c();
                    m16991d0();
                    i11 = this.f14283s;
                    i12 = this.f14284t;
                } else {
                    this.f14283s = i13;
                    return c11;
                }
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:            if (r1 != null) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:            r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:            r1.append(r0, r3, r2 - r3);        r9.f14283s = r2;     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m16981K(char c11) {
        char[] cArr = this.f14282r;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f14283s;
            int i12 = this.f14284t;
            while (true) {
                int i13 = i12;
                int i14 = i11;
                while (i11 < i13) {
                    int i15 = i11 + 1;
                    char c12 = cArr[i11];
                    if (c12 == c11) {
                        this.f14283s = i15;
                        int i16 = (i15 - i14) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i14, i16);
                        }
                        sb2.append(cArr, i14, i16);
                        return sb2.toString();
                    }
                    if (c12 == '\\') {
                        this.f14283s = i15;
                        int i17 = i15 - i14;
                        int i18 = i17 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i17 * 2, 16));
                        }
                        sb2.append(cArr, i14, i18);
                        sb2.append(m16986R());
                        i11 = this.f14283s;
                        i12 = this.f14284t;
                    } else {
                        if (c12 == '\n') {
                            this.f14285u++;
                            this.f14286v = i15;
                        }
                        i11 = i15;
                    }
                }
                break;
            }
        } while (m16994o(1));
        throw m16993i0("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:            m16988c();     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m16982M() {
        String sb2;
        StringBuilder sb3 = null;
        int i11 = 0;
        do {
            int i12 = 0;
            while (true) {
                int i13 = this.f14283s;
                if (i13 + i12 < this.f14284t) {
                    char c11 = this.f14282r[i13 + i12];
                    if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                        if (c11 != '#') {
                            if (c11 != ',') {
                                if (c11 != '/' && c11 != '=') {
                                    if (c11 != '{' && c11 != '}' && c11 != ':') {
                                        if (c11 != ';') {
                                            switch (c11) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i12++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i12 < this.f14282r.length) {
                    if (m16994o(i12 + 1)) {
                    }
                } else {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i12, 16));
                    }
                    sb3.append(this.f14282r, this.f14283s, i12);
                    this.f14283s += i12;
                }
            }
            i11 = i12;
            if (sb3 != null) {
                sb2 = new String(this.f14282r, this.f14283s, i11);
            } else {
                sb3.append(this.f14282r, this.f14283s, i11);
                sb2 = sb3.toString();
            }
            this.f14283s += i11;
            return sb2;
        } while (m16994o(1));
        if (sb3 != null) {
        }
        this.f14283s += i11;
        return sb2;
    }

    /* renamed from: O */
    private int m16983O() {
        String str;
        String str2;
        int i11;
        char c11 = this.f14282r[this.f14283s];
        if (c11 != 't' && c11 != 'T') {
            if (c11 != 'f' && c11 != 'F') {
                if (c11 != 'n' && c11 != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i11 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i11 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i11 = 5;
        }
        int length = str.length();
        for (int i12 = 1; i12 < length; i12++) {
            if (this.f14283s + i12 >= this.f14284t && !m16994o(i12 + 1)) {
                return 0;
            }
            char c12 = this.f14282r[this.f14283s + i12];
            if (c12 != str.charAt(i12) && c12 != str2.charAt(i12)) {
                return 0;
            }
        }
        if ((this.f14283s + length < this.f14284t || m16994o(length + 1)) && m16995s(this.f14282r[this.f14283s + length])) {
            return 0;
        }
        this.f14283s += length;
        this.f14287w = i11;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0095, code lost:            if (r9 != 2) goto L184;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:            if (r10 == false) goto L184;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:            if (r11 != Long.MIN_VALUE) goto L176;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:            if (r13 == false) goto L184;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:            if (r11 != 0) goto L179;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:            if (r13 != false) goto L184;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:            if (r13 == false) goto L181;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:            r11 = -r11;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:            r18.f14288x = r11;        r18.f14283s += r8;        r18.f14287w = 15;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:            return 15;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:            if (r9 == 2) goto L192;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:            if (r9 == 4) goto L192;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:            if (r9 != 7) goto L190;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:            r18.f14289y = r8;        r18.f14287w = 16;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:            return 16;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0093, code lost:            if (m16995s(r14) != false) goto L194;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:            return 0;     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m16984P() {
        boolean z11;
        char[] cArr = this.f14282r;
        int i11 = this.f14283s;
        int i12 = this.f14284t;
        int i13 = 0;
        int i14 = 0;
        char c11 = 0;
        boolean z12 = true;
        long j11 = 0;
        boolean z13 = false;
        while (true) {
            if (i11 + i14 == i12) {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!m16994o(i14 + 1)) {
                    break;
                }
                i11 = this.f14283s;
                i12 = this.f14284t;
            }
            char c12 = cArr[i11 + i14];
            if (c12 != '+') {
                if (c12 != 'E' && c12 != 'e') {
                    if (c12 != '-') {
                        if (c12 != '.') {
                            if (c12 < '0' || c12 > '9') {
                                break;
                            }
                            if (c11 != 1 && c11 != 0) {
                                if (c11 == 2) {
                                    if (j11 == 0) {
                                        return 0;
                                    }
                                    long j12 = (10 * j11) - (c12 - '0');
                                    if (j11 <= -922337203685477580L && (j11 != -922337203685477580L || j12 >= j11)) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    z12 &= z11;
                                    j11 = j12;
                                } else if (c11 == 3) {
                                    i13 = 0;
                                    c11 = 4;
                                } else if (c11 == 5 || c11 == 6) {
                                    i13 = 0;
                                    c11 = 7;
                                }
                                i13 = 0;
                            } else {
                                j11 = -(c12 - '0');
                                i13 = 0;
                                c11 = 2;
                            }
                        } else {
                            i13 = 0;
                            if (c11 != 2) {
                                return 0;
                            }
                            c11 = 3;
                        }
                    } else {
                        i13 = 0;
                        if (c11 == 0) {
                            c11 = 1;
                            z13 = true;
                        } else if (c11 != 5) {
                            return 0;
                        }
                    }
                } else {
                    i13 = 0;
                    if (c11 != 2 && c11 != 4) {
                        return 0;
                    }
                    c11 = 5;
                }
                i14++;
            } else {
                i13 = 0;
                if (c11 != 5) {
                    return 0;
                }
            }
            c11 = 6;
            i14++;
        }
    }

    /* renamed from: Q */
    private void m16985Q(int i11) {
        int i12 = this.f14277B;
        int[] iArr = this.f14276A;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f14276A = Arrays.copyOf(iArr, i13);
            this.f14279D = Arrays.copyOf(this.f14279D, i13);
            this.f14278C = (String[]) Arrays.copyOf(this.f14278C, i13);
        }
        int[] iArr2 = this.f14276A;
        int i14 = this.f14277B;
        this.f14277B = i14 + 1;
        iArr2[i14] = i11;
    }

    /* renamed from: R */
    private char m16986R() {
        int i11;
        if (this.f14283s == this.f14284t && !m16994o(1)) {
            throw m16993i0("Unterminated escape sequence");
        }
        char[] cArr = this.f14282r;
        int i12 = this.f14283s;
        int i13 = i12 + 1;
        this.f14283s = i13;
        char c11 = cArr[i12];
        if (c11 != '\n') {
            if (c11 != '\"' && c11 != '\'' && c11 != '/' && c11 != '\\') {
                if (c11 != 'b') {
                    if (c11 != 'f') {
                        if (c11 == 'n') {
                            return '\n';
                        }
                        if (c11 != 'r') {
                            if (c11 != 't') {
                                if (c11 == 'u') {
                                    if (i12 + 5 > this.f14284t && !m16994o(4)) {
                                        throw m16993i0("Unterminated escape sequence");
                                    }
                                    int i14 = this.f14283s;
                                    int i15 = i14 + 4;
                                    char c12 = 0;
                                    while (i14 < i15) {
                                        char c13 = this.f14282r[i14];
                                        char c14 = (char) (c12 << 4);
                                        if (c13 >= '0' && c13 <= '9') {
                                            i11 = c13 - '0';
                                        } else if (c13 >= 'a' && c13 <= 'f') {
                                            i11 = c13 - 'W';
                                        } else if (c13 >= 'A' && c13 <= 'F') {
                                            i11 = c13 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u" + new String(this.f14282r, this.f14283s, 4));
                                        }
                                        c12 = (char) (c14 + i11);
                                        i14++;
                                    }
                                    this.f14283s += 4;
                                    return c12;
                                }
                                throw m16993i0("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f14285u++;
            this.f14286v = i13;
        }
        return c11;
    }

    /* renamed from: Z */
    private void m16987Z(char c11) {
        char[] cArr = this.f14282r;
        do {
            int i11 = this.f14283s;
            int i12 = this.f14284t;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.f14283s = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.f14283s = i13;
                    m16986R();
                    i11 = this.f14283s;
                    i12 = this.f14284t;
                } else {
                    if (c12 == '\n') {
                        this.f14285u++;
                        this.f14286v = i13;
                    }
                    i11 = i13;
                }
            }
            this.f14283s = i11;
        } while (m16994o(1));
        throw m16993i0("Unterminated string");
    }

    /* renamed from: c */
    private void m16988c() {
        if (this.f14281q) {
        } else {
            throw m16993i0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: c0 */
    private boolean m16989c0(String str) {
        int length = str.length();
        while (true) {
            if (this.f14283s + length > this.f14284t && !m16994o(length)) {
                return false;
            }
            char[] cArr = this.f14282r;
            int i11 = this.f14283s;
            if (cArr[i11] == '\n') {
                this.f14285u++;
                this.f14286v = i11 + 1;
            } else {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.f14282r[this.f14283s + i12] != str.charAt(i12)) {
                        break;
                    }
                }
                return true;
            }
            this.f14283s++;
        }
    }

    /* renamed from: d */
    private void m16990d() {
        m16980G(true);
        int i11 = this.f14283s - 1;
        this.f14283s = i11;
        char[] cArr = f14275E;
        if (i11 + cArr.length > this.f14284t && !m16994o(cArr.length)) {
            return;
        }
        int i12 = 0;
        while (true) {
            char[] cArr2 = f14275E;
            if (i12 < cArr2.length) {
                if (this.f14282r[this.f14283s + i12] != cArr2[i12]) {
                    return;
                } else {
                    i12++;
                }
            } else {
                this.f14283s += cArr2.length;
                return;
            }
        }
    }

    /* renamed from: d0 */
    private void m16991d0() {
        char c11;
        do {
            if (this.f14283s < this.f14284t || m16994o(1)) {
                char[] cArr = this.f14282r;
                int i11 = this.f14283s;
                int i12 = i11 + 1;
                this.f14283s = i12;
                c11 = cArr[i11];
                if (c11 == '\n') {
                    this.f14285u++;
                    this.f14286v = i12;
                    return;
                }
            } else {
                return;
            }
        } while (c11 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: f0 */
    private void m16992f0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f14283s
            int r2 = r1 + r0
            int r3 = r4.f14284t
            if (r2 >= r3) goto L51
            char[] r2 = r4.f14282r
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m16988c()
        L4b:
            int r1 = r4.f14283s
            int r1 = r1 + r0
            r4.f14283s = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f14283s = r1
            r0 = 1
            boolean r0 = r4.m16994o(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.C3380a.m16992f0():void");
    }

    /* renamed from: i0 */
    private IOException m16993i0(String str) {
        throw new MalformedJsonException(str + m17012t());
    }

    /* renamed from: o */
    private boolean m16994o(int i11) {
        int i12;
        int i13;
        char[] cArr = this.f14282r;
        int i14 = this.f14286v;
        int i15 = this.f14283s;
        this.f14286v = i14 - i15;
        int i16 = this.f14284t;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f14284t = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f14284t = 0;
        }
        this.f14283s = 0;
        do {
            Reader reader = this.f14280p;
            int i18 = this.f14284t;
            int read = reader.read(cArr, i18, cArr.length - i18);
            if (read == -1) {
                return false;
            }
            i12 = this.f14284t + read;
            this.f14284t = i12;
            if (this.f14285u == 0 && (i13 = this.f14286v) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f14283s++;
                this.f14286v = i13 + 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    /* renamed from: s */
    private boolean m16995s(char c11) {
        if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
            if (c11 != '#') {
                if (c11 != ',') {
                    if (c11 != '/' && c11 != '=') {
                        if (c11 != '{' && c11 != '}' && c11 != ':') {
                            if (c11 != ';') {
                                switch (c11) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            m16988c();
            return false;
        }
        return false;
    }

    /* renamed from: A */
    public int m16996A() {
        char c11;
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 15) {
            long j11 = this.f14288x;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f14287w = 0;
                int[] iArr = this.f14279D;
                int i13 = this.f14277B - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new NumberFormatException("Expected an int but was " + this.f14288x + m17012t());
        }
        if (i11 == 16) {
            this.f14290z = new String(this.f14282r, this.f14283s, this.f14289y);
            this.f14283s += this.f14289y;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected an int but was " + m17001N() + m17012t());
            }
            if (i11 == 10) {
                this.f14290z = m16982M();
            } else {
                if (i11 == 8) {
                    c11 = '\'';
                } else {
                    c11 = '\"';
                }
                this.f14290z = m16981K(c11);
            }
            try {
                int parseInt = Integer.parseInt(this.f14290z);
                this.f14287w = 0;
                int[] iArr2 = this.f14279D;
                int i14 = this.f14277B - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f14287w = 11;
        double parseDouble = Double.parseDouble(this.f14290z);
        int i15 = (int) parseDouble;
        if (i15 == parseDouble) {
            this.f14290z = null;
            this.f14287w = 0;
            int[] iArr3 = this.f14279D;
            int i16 = this.f14277B - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        }
        throw new NumberFormatException("Expected an int but was " + this.f14290z + m17012t());
    }

    /* renamed from: E */
    public long m16997E() {
        char c11;
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 15) {
            this.f14287w = 0;
            int[] iArr = this.f14279D;
            int i12 = this.f14277B - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f14288x;
        }
        if (i11 == 16) {
            this.f14290z = new String(this.f14282r, this.f14283s, this.f14289y);
            this.f14283s += this.f14289y;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected a long but was " + m17001N() + m17012t());
            }
            if (i11 == 10) {
                this.f14290z = m16982M();
            } else {
                if (i11 == 8) {
                    c11 = '\'';
                } else {
                    c11 = '\"';
                }
                this.f14290z = m16981K(c11);
            }
            try {
                long parseLong = Long.parseLong(this.f14290z);
                this.f14287w = 0;
                int[] iArr2 = this.f14279D;
                int i13 = this.f14277B - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f14287w = 11;
        double parseDouble = Double.parseDouble(this.f14290z);
        long j11 = (long) parseDouble;
        if (j11 == parseDouble) {
            this.f14290z = null;
            this.f14287w = 0;
            int[] iArr3 = this.f14279D;
            int i14 = this.f14277B - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return j11;
        }
        throw new NumberFormatException("Expected a long but was " + this.f14290z + m17012t());
    }

    /* renamed from: F */
    public String m16998F() {
        String m16981K;
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 14) {
            m16981K = m16982M();
        } else if (i11 == 12) {
            m16981K = m16981K('\'');
        } else if (i11 == 13) {
            m16981K = m16981K('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + m17001N() + m17012t());
        }
        this.f14287w = 0;
        this.f14278C[this.f14277B - 1] = m16981K;
        return m16981K;
    }

    /* renamed from: J */
    public void m16999J() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 7) {
            this.f14287w = 0;
            int[] iArr = this.f14279D;
            int i12 = this.f14277B - 1;
            iArr[i12] = iArr[i12] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + m17001N() + m17012t());
    }

    /* renamed from: L */
    public String m17000L() {
        String str;
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 10) {
            str = m16982M();
        } else if (i11 == 8) {
            str = m16981K('\'');
        } else if (i11 == 9) {
            str = m16981K('\"');
        } else if (i11 == 11) {
            str = this.f14290z;
            this.f14290z = null;
        } else if (i11 == 15) {
            str = Long.toString(this.f14288x);
        } else if (i11 == 16) {
            str = new String(this.f14282r, this.f14283s, this.f14289y);
            this.f14283s += this.f14289y;
        } else {
            throw new IllegalStateException("Expected a string but was " + m17001N() + m17012t());
        }
        this.f14287w = 0;
        int[] iArr = this.f14279D;
        int i12 = this.f14277B - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    /* renamed from: N */
    public EnumC3381b m17001N() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        switch (i11) {
            case 1:
                return EnumC3381b.BEGIN_OBJECT;
            case 2:
                return EnumC3381b.END_OBJECT;
            case 3:
                return EnumC3381b.BEGIN_ARRAY;
            case 4:
                return EnumC3381b.END_ARRAY;
            case 5:
            case 6:
                return EnumC3381b.BOOLEAN;
            case 7:
                return EnumC3381b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC3381b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC3381b.NAME;
            case 15:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return EnumC3381b.NUMBER;
            case 17:
                return EnumC3381b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: T */
    public final void m17002T(boolean z11) {
        this.f14281q = z11;
    }

    /* renamed from: a */
    public void m17003a() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 3) {
            m16985Q(1);
            this.f14279D[this.f14277B - 1] = 0;
            this.f14287w = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m17001N() + m17012t());
        }
    }

    /* renamed from: b */
    public void m17004b() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 1) {
            m16985Q(3);
            this.f14287w = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m17001N() + m17012t());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14287w = 0;
        this.f14276A[0] = 8;
        this.f14277B = 1;
        this.f14280p.close();
    }

    /* renamed from: f */
    int m17005f() {
        int m16980G;
        int[] iArr = this.f14276A;
        int i11 = this.f14277B;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int m16980G2 = m16980G(true);
            if (m16980G2 != 44) {
                if (m16980G2 != 59) {
                    if (m16980G2 == 93) {
                        this.f14287w = 4;
                        return 4;
                    }
                    throw m16993i0("Unterminated array");
                }
                m16988c();
            }
        } else if (i12 != 3 && i12 != 5) {
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int m16980G3 = m16980G(true);
                if (m16980G3 != 58) {
                    if (m16980G3 == 61) {
                        m16988c();
                        if (this.f14283s < this.f14284t || m16994o(1)) {
                            char[] cArr = this.f14282r;
                            int i13 = this.f14283s;
                            if (cArr[i13] == '>') {
                                this.f14283s = i13 + 1;
                            }
                        }
                    } else {
                        throw m16993i0("Expected ':'");
                    }
                }
            } else if (i12 == 6) {
                if (this.f14281q) {
                    m16990d();
                }
                this.f14276A[this.f14277B - 1] = 7;
            } else if (i12 == 7) {
                if (m16980G(false) == -1) {
                    this.f14287w = 17;
                    return 17;
                }
                m16988c();
                this.f14283s--;
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i11 - 1] = 4;
            if (i12 == 5 && (m16980G = m16980G(true)) != 44) {
                if (m16980G != 59) {
                    if (m16980G == 125) {
                        this.f14287w = 2;
                        return 2;
                    }
                    throw m16993i0("Unterminated object");
                }
                m16988c();
            }
            int m16980G4 = m16980G(true);
            if (m16980G4 != 34) {
                if (m16980G4 != 39) {
                    if (m16980G4 != 125) {
                        m16988c();
                        this.f14283s--;
                        if (m16995s((char) m16980G4)) {
                            this.f14287w = 14;
                            return 14;
                        }
                        throw m16993i0("Expected name");
                    }
                    if (i12 != 5) {
                        this.f14287w = 2;
                        return 2;
                    }
                    throw m16993i0("Expected name");
                }
                m16988c();
                this.f14287w = 12;
                return 12;
            }
            this.f14287w = 13;
            return 13;
        }
        int m16980G5 = m16980G(true);
        if (m16980G5 != 34) {
            if (m16980G5 != 39) {
                if (m16980G5 != 44 && m16980G5 != 59) {
                    if (m16980G5 != 91) {
                        if (m16980G5 != 93) {
                            if (m16980G5 != 123) {
                                this.f14283s--;
                                int m16983O = m16983O();
                                if (m16983O != 0) {
                                    return m16983O;
                                }
                                int m16984P = m16984P();
                                if (m16984P != 0) {
                                    return m16984P;
                                }
                                if (m16995s(this.f14282r[this.f14283s])) {
                                    m16988c();
                                    this.f14287w = 10;
                                    return 10;
                                }
                                throw m16993i0("Expected value");
                            }
                            this.f14287w = 1;
                            return 1;
                        }
                        if (i12 == 1) {
                            this.f14287w = 4;
                            return 4;
                        }
                    } else {
                        this.f14287w = 3;
                        return 3;
                    }
                }
                if (i12 != 1 && i12 != 2) {
                    throw m16993i0("Unexpected value");
                }
                m16988c();
                this.f14283s--;
                this.f14287w = 7;
                return 7;
            }
            m16988c();
            this.f14287w = 8;
            return 8;
        }
        this.f14287w = 9;
        return 9;
    }

    /* renamed from: g0 */
    public void m17006g0() {
        int i11 = 0;
        do {
            int i12 = this.f14287w;
            if (i12 == 0) {
                i12 = m17005f();
            }
            if (i12 == 3) {
                m16985Q(1);
            } else if (i12 == 1) {
                m16985Q(3);
            } else {
                if (i12 == 4) {
                    this.f14277B--;
                } else if (i12 == 2) {
                    this.f14277B--;
                } else {
                    if (i12 != 14 && i12 != 10) {
                        if (i12 != 8 && i12 != 12) {
                            if (i12 != 9 && i12 != 13) {
                                if (i12 == 16) {
                                    this.f14283s += this.f14289y;
                                }
                            } else {
                                m16987Z('\"');
                            }
                        } else {
                            m16987Z('\'');
                        }
                    } else {
                        m16992f0();
                    }
                    this.f14287w = 0;
                }
                i11--;
                this.f14287w = 0;
            }
            i11++;
            this.f14287w = 0;
        } while (i11 != 0);
        int[] iArr = this.f14279D;
        int i13 = this.f14277B;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f14278C[i13 - 1] = "null";
    }

    /* renamed from: h */
    public void m17007h() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 4) {
            int i12 = this.f14277B;
            this.f14277B = i12 - 1;
            int[] iArr = this.f14279D;
            int i13 = i12 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f14287w = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + m17001N() + m17012t());
    }

    /* renamed from: i */
    public void m17008i() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 2) {
            int i12 = this.f14277B;
            int i13 = i12 - 1;
            this.f14277B = i13;
            this.f14278C[i13] = null;
            int[] iArr = this.f14279D;
            int i14 = i12 - 2;
            iArr[i14] = iArr[i14] + 1;
            this.f14287w = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + m17001N() + m17012t());
    }

    /* renamed from: m */
    public String m17009m() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i11 = this.f14277B;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f14276A[i12];
            if (i13 != 1 && i13 != 2) {
                if (i13 == 3 || i13 == 4 || i13 == 5) {
                    sb2.append('.');
                    String str = this.f14278C[i12];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(this.f14279D[i12]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    /* renamed from: q */
    public boolean m17010q() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 != 2 && i11 != 4) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m17011r() {
        return this.f14281q;
    }

    /* renamed from: t */
    String m17012t() {
        return " at line " + (this.f14285u + 1) + " column " + ((this.f14283s - this.f14286v) + 1) + " path " + m17009m();
    }

    public String toString() {
        return getClass().getSimpleName() + m17012t();
    }

    /* renamed from: v */
    public boolean m17013v() {
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 5) {
            this.f14287w = 0;
            int[] iArr = this.f14279D;
            int i12 = this.f14277B - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 == 6) {
            this.f14287w = 0;
            int[] iArr2 = this.f14279D;
            int i13 = this.f14277B - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + m17001N() + m17012t());
    }

    /* renamed from: y */
    public double m17014y() {
        char c11;
        int i11 = this.f14287w;
        if (i11 == 0) {
            i11 = m17005f();
        }
        if (i11 == 15) {
            this.f14287w = 0;
            int[] iArr = this.f14279D;
            int i12 = this.f14277B - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f14288x;
        }
        if (i11 == 16) {
            this.f14290z = new String(this.f14282r, this.f14283s, this.f14289y);
            this.f14283s += this.f14289y;
        } else if (i11 != 8 && i11 != 9) {
            if (i11 == 10) {
                this.f14290z = m16982M();
            } else if (i11 != 11) {
                throw new IllegalStateException("Expected a double but was " + m17001N() + m17012t());
            }
        } else {
            if (i11 == 8) {
                c11 = '\'';
            } else {
                c11 = '\"';
            }
            this.f14290z = m16981K(c11);
        }
        this.f14287w = 11;
        double parseDouble = Double.parseDouble(this.f14290z);
        if (!this.f14281q && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + m17012t());
        }
        this.f14290z = null;
        this.f14287w = 0;
        int[] iArr2 = this.f14279D;
        int i13 = this.f14277B - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }
}
