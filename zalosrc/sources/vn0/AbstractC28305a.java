package vn0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import on0.AbstractC24342w;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;

/* renamed from: vn0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC28305a {

    /* renamed from: a */
    protected int f132016a;

    /* renamed from: c */
    private String f132018c;

    /* renamed from: b */
    public final C28313d0 f132017b = new C28313d0();

    /* renamed from: d */
    private StringBuilder f132019d = new StringBuilder();

    /* renamed from: B */
    private final int m142584B(CharSequence charSequence, int i11) {
        char charAt = charSequence.charAt(i11);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m142595y(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: K */
    private final String m142585K() {
        String str = this.f132018c;
        AbstractC19074t.m100205c(str);
        this.f132018c = null;
        return str;
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m142586N(AbstractC28305a abstractC28305a, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            return abstractC28305a.m142606M(z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    /* renamed from: P */
    private final boolean m142587P() {
        if (mo142597C().charAt(this.f132016a - 1) != '\"') {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final int m142589b(int i11) {
        int mo142601G = mo142601G(i11);
        if (mo142601G != -1) {
            int i12 = mo142601G + 1;
            char charAt = mo142597C().charAt(mo142601G);
            if (charAt == 'u') {
                return m142591d(mo142597C(), i12);
            }
            char m142635b = AbstractC28308b.m142635b(charAt);
            if (m142635b != 0) {
                this.f132019d.append(m142635b);
                return i12;
            }
            m142595y(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        m142595y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: c */
    private final int m142590c(int i11, int i12) {
        m142608e(i11, i12);
        return m142589b(i12 + 1);
    }

    /* renamed from: d */
    private final int m142591d(CharSequence charSequence, int i11) {
        int i12 = i11 + 4;
        if (i12 >= charSequence.length()) {
            this.f132016a = i11;
            m142622v();
            if (this.f132016a + 4 < charSequence.length()) {
                return m142591d(charSequence, this.f132016a);
            }
            m142595y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.f132019d.append((char) ((m142584B(charSequence, i11) << 12) + (m142584B(charSequence, i11 + 1) << 8) + (m142584B(charSequence, i11 + 2) << 4) + m142584B(charSequence, i11 + 3)));
        return i12;
    }

    /* renamed from: h */
    private final boolean m142592h(int i11) {
        int mo142601G = mo142601G(i11);
        if (mo142601G < mo142597C().length() && mo142601G != -1) {
            int i12 = mo142601G + 1;
            int charAt = mo142597C().charAt(mo142601G) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    m142593j("rue", i12);
                    return true;
                }
                m142595y(this, "Expected valid boolean literal prefix, but had '" + m142620s() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            m142593j("alse", i12);
            return false;
        }
        m142595y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: j */
    private final void m142593j(String str, int i11) {
        if (mo142597C().length() - i11 >= str.length()) {
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                if (str.charAt(i12) != (mo142597C().charAt(i11 + i12) | ' ')) {
                    m142595y(this, "Expected valid boolean literal prefix, but had '" + m142620s() + '\'', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f132016a = i11 + str.length();
            return;
        }
        m142595y(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: u */
    private final String m142594u(int i11, int i12) {
        m142608e(i11, i12);
        String sb2 = this.f132019d.toString();
        AbstractC19074t.m100207e(sb2, "escapedString.toString()");
        this.f132019d.setLength(0);
        return sb2;
    }

    /* renamed from: y */
    public static /* synthetic */ Void m142595y(AbstractC28305a abstractC28305a, String str, int i11, String str2, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i11 = abstractC28305a.f132016a;
            }
            if ((i12 & 4) != 0) {
                str2 = "";
            }
            return abstractC28305a.m142624x(str, i11, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    /* renamed from: A */
    public final void m142596A(String str) {
        int m127178g0;
        AbstractC19074t.m100208f(str, "key");
        m127178g0 = AbstractC24342w.m127178g0(m142604J(0, this.f132016a), str, 0, false, 6, null);
        m142624x("Encountered an unknown key '" + str + '\'', m127178g0, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: C */
    protected abstract CharSequence mo142597C();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean m142598D(char c11) {
        return !(c11 == '}' || c11 == ']' || c11 == ':' || c11 == ',');
    }

    /* renamed from: E */
    public final byte m142599E() {
        CharSequence mo142597C = mo142597C();
        int i11 = this.f132016a;
        while (true) {
            int mo142601G = mo142601G(i11);
            if (mo142601G != -1) {
                char charAt = mo142597C.charAt(mo142601G);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f132016a = mo142601G;
                    return AbstractC28308b.m142634a(charAt);
                }
                i11 = mo142601G + 1;
            } else {
                this.f132016a = mo142601G;
                return (byte) 10;
            }
        }
    }

    /* renamed from: F */
    public final String m142600F(boolean z11) {
        String m142618q;
        byte m142599E = m142599E();
        if (z11) {
            if (m142599E != 1 && m142599E != 0) {
                return null;
            }
            m142618q = m142620s();
        } else {
            if (m142599E != 1) {
                return null;
            }
            m142618q = m142618q();
        }
        this.f132018c = m142618q;
        return m142618q;
    }

    /* renamed from: G */
    public abstract int mo142601G(int i11);

    /* renamed from: H */
    public final void m142602H(boolean z11) {
        Object m131216p0;
        Object m131216p02;
        ArrayList arrayList = new ArrayList();
        byte m142599E = m142599E();
        if (m142599E != 8 && m142599E != 6) {
            m142620s();
            return;
        }
        while (true) {
            byte m142599E2 = m142599E();
            if (m142599E2 == 1) {
                if (z11) {
                    m142620s();
                } else {
                    mo142612k();
                }
            } else {
                if (m142599E2 == 8 || m142599E2 == 6) {
                    arrayList.add(Byte.valueOf(m142599E2));
                } else if (m142599E2 == 9) {
                    m131216p02 = AbstractC25332a0.m131216p0(arrayList);
                    if (((Number) m131216p02).byteValue() == 8) {
                        AbstractC25378x.m131545G(arrayList);
                    } else {
                        throw AbstractC28309b0.m142641f(this.f132016a, "found ] instead of } at path: " + this.f132017b, mo142597C());
                    }
                } else if (m142599E2 == 7) {
                    m131216p0 = AbstractC25332a0.m131216p0(arrayList);
                    if (((Number) m131216p0).byteValue() == 6) {
                        AbstractC25378x.m131545G(arrayList);
                    } else {
                        throw AbstractC28309b0.m142641f(this.f132016a, "found } instead of ] at path: " + this.f132017b, mo142597C());
                    }
                } else if (m142599E2 == 10) {
                    m142595y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                mo142614m();
                if (arrayList.size() == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    public abstract int mo142603I();

    /* renamed from: J */
    public String m142604J(int i11, int i12) {
        return mo142597C().subSequence(i11, i12).toString();
    }

    /* renamed from: L */
    public abstract boolean mo142605L();

    /* renamed from: M */
    public final boolean m142606M(boolean z11) {
        int mo142601G = mo142601G(mo142603I());
        int length = mo142597C().length() - mo142601G;
        if (length < 4 || mo142601G == -1) {
            return false;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            if ("null".charAt(i11) != mo142597C().charAt(mo142601G + i11)) {
                return false;
            }
        }
        if (length > 4 && AbstractC28308b.m142634a(mo142597C().charAt(mo142601G + 4)) == 0) {
            return false;
        }
        if (z11) {
            this.f132016a = mo142601G + 4;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m142607O(char c11) {
        int i11 = this.f132016a - 1;
        this.f132016a = i11;
        if (i11 >= 0 && c11 == '\"' && AbstractC19074t.m100204b(m142620s(), "null")) {
            m142624x("Expected string literal but 'null' literal was found", this.f132016a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new KotlinNothingValueException();
        }
        m142625z(AbstractC28308b.m142634a(c11));
        throw new KotlinNothingValueException();
    }

    /* renamed from: e */
    protected void m142608e(int i11, int i12) {
        this.f132019d.append(mo142597C(), i11, i12);
    }

    /* renamed from: f */
    public abstract boolean mo142609f();

    /* renamed from: g */
    public final boolean m142610g() {
        return m142592h(mo142603I());
    }

    /* renamed from: i */
    public final boolean m142611i() {
        boolean z11;
        int mo142603I = mo142603I();
        if (mo142603I != mo142597C().length()) {
            if (mo142597C().charAt(mo142603I) == '\"') {
                mo142603I++;
                z11 = true;
            } else {
                z11 = false;
            }
            boolean m142592h = m142592h(mo142603I);
            if (z11) {
                if (this.f132016a != mo142597C().length()) {
                    if (mo142597C().charAt(this.f132016a) == '\"') {
                        this.f132016a++;
                    } else {
                        m142595y(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    m142595y(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return m142592h;
        }
        m142595y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public abstract String mo142612k();

    /* renamed from: l */
    public abstract String mo142613l(String str, boolean z11);

    /* renamed from: m */
    public abstract byte mo142614m();

    /* renamed from: n */
    public final byte m142615n(byte b11) {
        byte mo142614m = mo142614m();
        if (mo142614m == b11) {
            return mo142614m;
        }
        m142625z(b11);
        throw new KotlinNothingValueException();
    }

    /* renamed from: o */
    public abstract void mo142616o(char c11);

    /* renamed from: p */
    public final long m142617p() {
        boolean z11;
        int mo142601G = mo142601G(mo142603I());
        if (mo142601G < mo142597C().length() && mo142601G != -1) {
            if (mo142597C().charAt(mo142601G) == '\"') {
                mo142601G++;
                if (mo142601G != mo142597C().length()) {
                    z11 = true;
                } else {
                    m142595y(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                z11 = false;
            }
            int i11 = mo142601G;
            long j11 = 0;
            boolean z12 = true;
            boolean z13 = false;
            while (z12) {
                char charAt = mo142597C().charAt(i11);
                if (charAt == '-') {
                    if (i11 == mo142601G) {
                        i11++;
                        z13 = true;
                    } else {
                        m142595y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    if (AbstractC28308b.m142634a(charAt) != 0) {
                        break;
                    }
                    i11++;
                    if (i11 != mo142597C().length()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i12 = charAt - '0';
                    if (i12 >= 0 && i12 < 10) {
                        j11 = (j11 * 10) - i12;
                        if (j11 > 0) {
                            m142595y(this, "Numeric value overflow", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        m142595y(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (mo142601G != i11 && (!z13 || mo142601G != i11 - 1)) {
                if (z11) {
                    if (z12) {
                        if (mo142597C().charAt(i11) == '\"') {
                            i11++;
                        } else {
                            m142595y(this, "Expected closing quotation mark", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        m142595y(this, "EOF", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
                this.f132016a = i11;
                if (!z13) {
                    if (j11 != Long.MIN_VALUE) {
                        return -j11;
                    }
                    m142595y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                return j11;
            }
            m142595y(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        m142595y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: q */
    public final String m142618q() {
        if (this.f132018c != null) {
            return m142585K();
        }
        return mo142612k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final String m142619r(CharSequence charSequence, int i11, int i12) {
        String m142594u;
        int mo142601G;
        AbstractC19074t.m100208f(charSequence, "source");
        char charAt = charSequence.charAt(i12);
        boolean z11 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                mo142601G = mo142601G(m142590c(i11, i12));
                if (mo142601G == -1) {
                    m142595y(this, "EOF", mo142601G, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i12++;
                if (i12 >= charSequence.length()) {
                    m142608e(i11, i12);
                    mo142601G = mo142601G(i12);
                    if (mo142601G == -1) {
                        m142595y(this, "EOF", mo142601G, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i12);
                }
            }
            i11 = mo142601G;
            i12 = i11;
            z11 = true;
            charAt = charSequence.charAt(i12);
        }
        if (!z11) {
            m142594u = m142604J(i11, i12);
        } else {
            m142594u = m142594u(i11, i12);
        }
        this.f132016a = i12 + 1;
        return m142594u;
    }

    /* renamed from: s */
    public final String m142620s() {
        String m142594u;
        if (this.f132018c != null) {
            return m142585K();
        }
        int mo142603I = mo142603I();
        if (mo142603I < mo142597C().length() && mo142603I != -1) {
            byte m142634a = AbstractC28308b.m142634a(mo142597C().charAt(mo142603I));
            if (m142634a == 1) {
                return m142618q();
            }
            if (m142634a == 0) {
                boolean z11 = false;
                while (AbstractC28308b.m142634a(mo142597C().charAt(mo142603I)) == 0) {
                    mo142603I++;
                    if (mo142603I >= mo142597C().length()) {
                        m142608e(this.f132016a, mo142603I);
                        int mo142601G = mo142601G(mo142603I);
                        if (mo142601G == -1) {
                            this.f132016a = mo142603I;
                            return m142594u(0, 0);
                        }
                        mo142603I = mo142601G;
                        z11 = true;
                    }
                }
                if (!z11) {
                    m142594u = m142604J(this.f132016a, mo142603I);
                } else {
                    m142594u = m142594u(this.f132016a, mo142603I);
                }
                this.f132016a = mo142603I;
                return m142594u;
            }
            m142595y(this, "Expected beginning of the string, but got " + mo142597C().charAt(mo142603I), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        m142595y(this, "EOF", mo142603I, null, 4, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: t */
    public final String m142621t() {
        String m142620s = m142620s();
        if (AbstractC19074t.m100204b(m142620s, "null") && m142587P()) {
            m142595y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return m142620s;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) mo142597C()) + "', currentPosition=" + this.f132016a + ')';
    }

    /* renamed from: v */
    public void m142622v() {
    }

    /* renamed from: w */
    public final void m142623w() {
        if (mo142614m() == 10) {
            return;
        }
        m142595y(this, "Expected EOF after parsing, but had " + mo142597C().charAt(this.f132016a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: x */
    public final Void m142624x(String str, int i11, String str2) {
        String str3;
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw AbstractC28309b0.m142641f(i11, str + " at path: " + this.f132017b.m142697a() + str3, mo142597C());
    }

    /* renamed from: z */
    public final Void m142625z(byte b11) {
        String str;
        String str2;
        if (b11 == 1) {
            str = "quotation mark '\"'";
        } else if (b11 == 4) {
            str = "comma ','";
        } else if (b11 == 5) {
            str = "colon ':'";
        } else if (b11 == 6) {
            str = "start of the object '{'";
        } else if (b11 == 7) {
            str = "end of the object '}'";
        } else if (b11 == 8) {
            str = "start of the array '['";
        } else if (b11 == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        if (this.f132016a != mo142597C().length() && this.f132016a > 0) {
            str2 = String.valueOf(mo142597C().charAt(this.f132016a - 1));
        } else {
            str2 = "EOF";
        }
        m142595y(this, "Expected " + str + ", but had '" + str2 + "' instead", this.f132016a - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }
}
