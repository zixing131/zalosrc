package xn0;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.C24291a;
import yn0.AbstractC31034a;

/* renamed from: xn0.c */
/* loaded from: classes7.dex */
public final class C30173c {

    /* renamed from: j */
    private static final char[] f140189j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f140190a;

    /* renamed from: b */
    private final String f140191b;

    /* renamed from: c */
    private final String f140192c;

    /* renamed from: d */
    final String f140193d;

    /* renamed from: e */
    final int f140194e;

    /* renamed from: f */
    private final List f140195f;

    /* renamed from: g */
    private final List f140196g;

    /* renamed from: h */
    private final String f140197h;

    /* renamed from: i */
    private final String f140198i;

    /* renamed from: xn0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        String f140199a;

        /* renamed from: d */
        String f140202d;

        /* renamed from: f */
        final List f140204f;

        /* renamed from: g */
        List f140205g;

        /* renamed from: h */
        String f140206h;

        /* renamed from: b */
        String f140200b = "";

        /* renamed from: c */
        String f140201c = "";

        /* renamed from: e */
        int f140203e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f140204f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        private static String m148833b(String str, int i11, int i12) {
            return AbstractC31034a.m150850a(C30173c.m148820p(str, i11, i12, false));
        }

        /* renamed from: f */
        private boolean m148834f(String str) {
            if (!str.equals(".") && !str.equalsIgnoreCase("%2e")) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        private boolean m148835g(String str) {
            if (!str.equals("..") && !str.equalsIgnoreCase("%2e.") && !str.equalsIgnoreCase(".%2e") && !str.equalsIgnoreCase("%2e%2e")) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        private static int m148836i(String str, int i11, int i12) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(C30173c.m148812a(str, i11, i12, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        /* renamed from: k */
        private void m148837k() {
            if (((String) this.f140204f.remove(r0.size() - 1)).isEmpty() && !this.f140204f.isEmpty()) {
                this.f140204f.set(r0.size() - 1, "");
            } else {
                this.f140204f.add("");
            }
        }

        /* renamed from: l */
        private static int m148838l(String str, int i11, int i12) {
            while (i11 < i12) {
                char charAt = str.charAt(i11);
                if (charAt != ':') {
                    if (charAt != '[') {
                        i11++;
                    }
                    do {
                        i11++;
                        if (i11 < i12) {
                        }
                        i11++;
                    } while (str.charAt(i11) != ']');
                    i11++;
                } else {
                    return i11;
                }
            }
            return i12;
        }

        /* renamed from: m */
        private void m148839m(String str, int i11, int i12, boolean z11, boolean z12) {
            String m148812a = C30173c.m148812a(str, i11, i12, " \"<>^`{}|/\\?#", z12, false, false, true, null);
            if (m148834f(m148812a)) {
                return;
            }
            if (m148835g(m148812a)) {
                m148837k();
                return;
            }
            if (((String) this.f140204f.get(r11.size() - 1)).isEmpty()) {
                this.f140204f.set(r11.size() - 1, m148812a);
            } else {
                this.f140204f.add(m148812a);
            }
            if (z11) {
                this.f140204f.add("");
            }
        }

        /* renamed from: o */
        private void m148840o(String str, int i11, int i12) {
            boolean z11;
            if (i11 == i12) {
                return;
            }
            char charAt = str.charAt(i11);
            if (charAt != '/' && charAt != '\\') {
                List list = this.f140204f;
                list.set(list.size() - 1, "");
            } else {
                this.f140204f.clear();
                this.f140204f.add("");
                i11++;
            }
            while (true) {
                int i13 = i11;
                if (i13 < i12) {
                    i11 = AbstractC31034a.m150858i(str, i13, i12, "/\\");
                    if (i11 < i12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m148839m(str, i13, i11, z11, true);
                    if (z11) {
                        i11++;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: p */
        private static int m148841p(String str, int i11, int i12) {
            if (i12 - i11 < 2) {
                return -1;
            }
            char charAt = str.charAt(i11);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i11++;
                    if (i11 >= i12) {
                        break;
                    }
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i11;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: q */
        private static int m148842q(String str, int i11, int i12) {
            int i13 = 0;
            while (i11 < i12) {
                char charAt = str.charAt(i11);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i13++;
                i11++;
            }
            return i13;
        }

        /* renamed from: a */
        public C30173c m148843a() {
            if (this.f140199a != null) {
                if (this.f140202d != null) {
                    return new C30173c(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: c */
        int m148844c() {
            int i11 = this.f140203e;
            if (i11 == -1) {
                return C30173c.m148815d(this.f140199a);
            }
            return i11;
        }

        /* renamed from: d */
        public a m148845d(String str) {
            List list;
            if (str != null) {
                list = C30173c.m148825u(C30173c.m148813b(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f140205g = list;
            return this;
        }

        /* renamed from: e */
        public a m148846e(String str) {
            String str2;
            if (str != null) {
                str2 = C30173c.m148813b(str, "", false, false, false, false);
            } else {
                str2 = null;
            }
            this.f140206h = str2;
            return this;
        }

        /* renamed from: h */
        a m148847h(C30173c c30173c, String str) {
            int m150858i;
            char c11;
            int i11;
            int m150860k = AbstractC31034a.m150860k(str, 0, str.length());
            int m150861l = AbstractC31034a.m150861l(str, m150860k, str.length());
            int m148841p = m148841p(str, m150860k, m150861l);
            if (m148841p != -1) {
                if (str.regionMatches(true, m150860k, "https:", 0, 6)) {
                    this.f140199a = "https";
                    m150860k += 6;
                } else if (str.regionMatches(true, m150860k, "http:", 0, 5)) {
                    this.f140199a = "http";
                    m150860k += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, m148841p) + "'");
                }
            } else if (c30173c != null) {
                this.f140199a = c30173c.f140190a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int m148842q = m148842q(str, m150860k, m150861l);
            char c12 = '?';
            char c13 = '#';
            if (m148842q < 2 && c30173c != null && c30173c.f140190a.equals(this.f140199a)) {
                this.f140200b = c30173c.m148831j();
                this.f140201c = c30173c.m148827f();
                this.f140202d = c30173c.f140193d;
                this.f140203e = c30173c.f140194e;
                this.f140204f.clear();
                this.f140204f.addAll(c30173c.m148829h());
                if (m150860k == m150861l || str.charAt(m150860k) == '#') {
                    m148845d(c30173c.m148830i());
                }
            } else {
                int i12 = m150860k + m148842q;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    m150858i = AbstractC31034a.m150858i(str, i12, m150861l, "@/\\?#");
                    if (m150858i != m150861l) {
                        c11 = str.charAt(m150858i);
                    } else {
                        c11 = 65535;
                    }
                    if (c11 == 65535 || c11 == c13 || c11 == '/' || c11 == '\\' || c11 == c12) {
                        break;
                    }
                    if (c11 == '@') {
                        if (!z11) {
                            int m150857h = AbstractC31034a.m150857h(str, i12, m150858i, ':');
                            i11 = m150858i;
                            String m148812a = C30173c.m148812a(str, i12, m150857h, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z12) {
                                m148812a = this.f140200b + "%40" + m148812a;
                            }
                            this.f140200b = m148812a;
                            if (m150857h != i11) {
                                this.f140201c = C30173c.m148812a(str, m150857h + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z11 = true;
                            }
                            z12 = true;
                        } else {
                            i11 = m150858i;
                            this.f140201c += "%40" + C30173c.m148812a(str, i12, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i12 = i11 + 1;
                    }
                    c12 = '?';
                    c13 = '#';
                }
                int m148838l = m148838l(str, i12, m150858i);
                int i13 = m148838l + 1;
                if (i13 < m150858i) {
                    this.f140202d = m148833b(str, i12, m148838l);
                    int m148836i = m148836i(str, i13, m150858i);
                    this.f140203e = m148836i;
                    if (m148836i == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i13, m150858i) + '\"');
                    }
                } else {
                    this.f140202d = m148833b(str, i12, m148838l);
                    this.f140203e = C30173c.m148815d(this.f140199a);
                }
                if (this.f140202d != null) {
                    m150860k = m150858i;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i12, m148838l) + '\"');
                }
            }
            int m150858i2 = AbstractC31034a.m150858i(str, m150860k, m150861l, "?#");
            m148840o(str, m150860k, m150858i2);
            if (m150858i2 < m150861l && str.charAt(m150858i2) == '?') {
                int m150857h2 = AbstractC31034a.m150857h(str, m150858i2, m150861l, '#');
                this.f140205g = C30173c.m148825u(C30173c.m148812a(str, m150858i2 + 1, m150857h2, " \"'<>#", true, false, true, true, null));
                m150858i2 = m150857h2;
            }
            if (m150858i2 < m150861l && str.charAt(m150858i2) == '#') {
                this.f140206h = C30173c.m148812a(str, 1 + m150858i2, m150861l, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: j */
        public a m148848j(String str) {
            if (str != null) {
                this.f140201c = C30173c.m148813b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: n */
        public a m148849n(String str) {
            List list;
            if (str != null) {
                list = C30173c.m148825u(C30173c.m148813b(str, " \"'<>#", false, false, true, true));
            } else {
                list = null;
            }
            this.f140205g = list;
            return this;
        }

        /* renamed from: r */
        public a m148850r(String str) {
            if (str != null) {
                this.f140200b = C30173c.m148813b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f140199a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f140200b.isEmpty() || !this.f140201c.isEmpty()) {
                sb2.append(this.f140200b);
                if (!this.f140201c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f140201c);
                }
                sb2.append('@');
            }
            String str2 = this.f140202d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f140202d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f140202d);
                }
            }
            if (this.f140203e != -1 || this.f140199a != null) {
                int m148844c = m148844c();
                String str3 = this.f140199a;
                if (str3 == null || m148844c != C30173c.m148815d(str3)) {
                    sb2.append(':');
                    sb2.append(m148844c);
                }
            }
            C30173c.m148819o(sb2, this.f140204f);
            if (this.f140205g != null) {
                sb2.append('?');
                C30173c.m148817l(sb2, this.f140205g);
            }
            if (this.f140206h != null) {
                sb2.append('#');
                sb2.append(this.f140206h);
            }
            return sb2.toString();
        }
    }

    C30173c(a aVar) {
        List list;
        this.f140190a = aVar.f140199a;
        this.f140191b = m148821q(aVar.f140200b, false);
        this.f140192c = m148821q(aVar.f140201c, false);
        this.f140193d = aVar.f140202d;
        this.f140194e = aVar.m148844c();
        this.f140195f = m148822r(aVar.f140204f, false);
        List list2 = aVar.f140205g;
        if (list2 != null) {
            list = m148822r(list2, true);
        } else {
            list = null;
        }
        this.f140196g = list;
        String str = aVar.f140206h;
        this.f140197h = str != null ? m148821q(str, false) : null;
        this.f140198i = aVar.toString();
    }

    /* renamed from: a */
    static String m148812a(String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14, Charset charset) {
        int i13 = i11;
        while (i13 < i12) {
            int codePointAt = str.codePointAt(i13);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z14)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z11 && (!z12 || m148824t(str, i13, i12)))) && (codePointAt != 43 || !z13))) {
                    i13 += Character.charCount(codePointAt);
                }
            }
            C24291a c24291a = new C24291a();
            c24291a.m126803O(str, i11, i13);
            m148814c(c24291a, str, i13, i12, str2, z11, z12, z13, z14, charset);
            return c24291a.m126812q();
        }
        return str.substring(i11, i12);
    }

    /* renamed from: b */
    static String m148813b(String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m148812a(str, 0, str.length(), str2, z11, z12, z13, z14, null);
    }

    /* renamed from: c */
    static void m148814c(C24291a c24291a, String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14, Charset charset) {
        String str3;
        C24291a c24291a2 = null;
        while (i11 < i12) {
            int codePointAt = str.codePointAt(i11);
            if (!z11 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z13) {
                    if (z11) {
                        str3 = "+";
                    } else {
                        str3 = "%2B";
                    }
                    c24291a.m126802N(str3);
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z14) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z11 && (!z12 || m148824t(str, i11, i12)))))) {
                    c24291a.m126804P(codePointAt);
                } else {
                    if (c24291a2 == null) {
                        c24291a2 = new C24291a();
                    }
                    if (charset != null && !charset.equals(AbstractC31034a.f143126j)) {
                        c24291a2.m126801L(str, i11, Character.charCount(codePointAt) + i11, charset);
                    } else {
                        c24291a2.m126804P(codePointAt);
                    }
                    while (!c24291a2.m126806b()) {
                        byte m126808f = c24291a2.m126808f();
                        c24291a.m126799E(37);
                        char[] cArr = f140189j;
                        c24291a.m126799E(cArr[((m126808f & 255) >> 4) & 15]);
                        c24291a.m126799E(cArr[m126808f & 15]);
                    }
                }
            }
            i11 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: d */
    public static int m148815d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* renamed from: k */
    public static C30173c m148816k(String str) {
        return new a().m148847h(null, str).m148843a();
    }

    /* renamed from: l */
    static void m148817l(StringBuilder sb2, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11 += 2) {
            String str = (String) list.get(i11);
            String str2 = (String) list.get(i11 + 1);
            if (i11 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    /* renamed from: n */
    public static C30173c m148818n(String str) {
        try {
            return m148816k(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: o */
    static void m148819o(StringBuilder sb2, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append('/');
            sb2.append((String) list.get(i11));
        }
    }

    /* renamed from: p */
    static String m148820p(String str, int i11, int i12, boolean z11) {
        for (int i13 = i11; i13 < i12; i13++) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z11)) {
                C24291a c24291a = new C24291a();
                c24291a.m126803O(str, i11, i13);
                m148823s(c24291a, str, i13, i12, z11);
                return c24291a.m126812q();
            }
        }
        return str.substring(i11, i12);
    }

    /* renamed from: q */
    static String m148821q(String str, boolean z11) {
        return m148820p(str, 0, str.length(), z11);
    }

    /* renamed from: r */
    private List m148822r(List list, boolean z11) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) list.get(i11);
            if (str2 != null) {
                str = m148821q(str2, z11);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: s */
    static void m148823s(C24291a c24291a, String str, int i11, int i12, boolean z11) {
        int i13;
        while (i11 < i12) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt == 37 && (i13 = i11 + 2) < i12) {
                int m150854e = AbstractC31034a.m150854e(str.charAt(i11 + 1));
                int m150854e2 = AbstractC31034a.m150854e(str.charAt(i13));
                if (m150854e != -1 && m150854e2 != -1) {
                    c24291a.m126799E((m150854e << 4) + m150854e2);
                    i11 = i13;
                }
                c24291a.m126804P(codePointAt);
            } else {
                if (codePointAt == 43 && z11) {
                    c24291a.m126799E(32);
                }
                c24291a.m126804P(codePointAt);
            }
            i11 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: t */
    static boolean m148824t(String str, int i11, int i12) {
        int i13 = i11 + 2;
        if (i13 < i12 && str.charAt(i11) == '%' && AbstractC31034a.m150854e(str.charAt(i11 + 1)) != -1 && AbstractC31034a.m150854e(str.charAt(i13)) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    static List m148825u(String str) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 <= str.length()) {
            int indexOf = str.indexOf(38, i11);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i11);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i11, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i11, indexOf));
                arrayList.add(null);
            }
            i11 = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: e */
    public String m148826e() {
        if (this.f140197h == null) {
            return null;
        }
        return this.f140198i.substring(this.f140198i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C30173c) && ((C30173c) obj).f140198i.equals(this.f140198i)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m148827f() {
        if (this.f140192c.isEmpty()) {
            return "";
        }
        return this.f140198i.substring(this.f140198i.indexOf(58, this.f140190a.length() + 3) + 1, this.f140198i.indexOf(64));
    }

    /* renamed from: g */
    public String m148828g() {
        int indexOf = this.f140198i.indexOf(47, this.f140190a.length() + 3);
        String str = this.f140198i;
        return this.f140198i.substring(indexOf, AbstractC31034a.m150858i(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: h */
    public List m148829h() {
        int indexOf = this.f140198i.indexOf(47, this.f140190a.length() + 3);
        String str = this.f140198i;
        int m150858i = AbstractC31034a.m150858i(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m150858i) {
            int i11 = indexOf + 1;
            int m150857h = AbstractC31034a.m150857h(this.f140198i, i11, m150858i, '/');
            arrayList.add(this.f140198i.substring(i11, m150857h));
            indexOf = m150857h;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f140198i.hashCode();
    }

    /* renamed from: i */
    public String m148830i() {
        if (this.f140196g == null) {
            return null;
        }
        int indexOf = this.f140198i.indexOf(63) + 1;
        String str = this.f140198i;
        return this.f140198i.substring(indexOf, AbstractC31034a.m150857h(str, indexOf, str.length(), '#'));
    }

    /* renamed from: j */
    public String m148831j() {
        if (this.f140191b.isEmpty()) {
            return "";
        }
        int length = this.f140190a.length() + 3;
        String str = this.f140198i;
        return this.f140198i.substring(length, AbstractC31034a.m150858i(str, length, str.length(), ":@"));
    }

    /* renamed from: m */
    public a m148832m() {
        int i11;
        a aVar = new a();
        aVar.f140199a = this.f140190a;
        aVar.f140200b = m148831j();
        aVar.f140201c = m148827f();
        aVar.f140202d = this.f140193d;
        if (this.f140194e != m148815d(this.f140190a)) {
            i11 = this.f140194e;
        } else {
            i11 = -1;
        }
        aVar.f140203e = i11;
        aVar.f140204f.clear();
        aVar.f140204f.addAll(m148829h());
        aVar.m148845d(m148830i());
        aVar.f140206h = m148826e();
        return aVar;
    }

    public String toString() {
        return this.f140198i;
    }
}
