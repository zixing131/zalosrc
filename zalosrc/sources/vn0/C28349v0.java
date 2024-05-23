package vn0;

import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import on0.AbstractC24342w;

/* renamed from: vn0.v0 */
/* loaded from: classes7.dex */
public final class C28349v0 extends AbstractC28305a {

    /* renamed from: e */
    private final String f132112e;

    public C28349v0(String str) {
        AbstractC19074t.m100208f(str, "source");
        this.f132112e = str;
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: G */
    public int mo142601G(int i11) {
        if (i11 >= mo142597C().length()) {
            return -1;
        }
        return i11;
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: I */
    public int mo142603I() {
        char charAt;
        int i11 = this.f132016a;
        if (i11 == -1) {
            return i11;
        }
        while (i11 < mo142597C().length() && ((charAt = mo142597C().charAt(i11)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i11++;
        }
        this.f132016a = i11;
        return i11;
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: L */
    public boolean mo142605L() {
        int mo142603I = mo142603I();
        if (mo142603I == mo142597C().length() || mo142603I == -1 || mo142597C().charAt(mo142603I) != ',') {
            return false;
        }
        this.f132016a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vn0.AbstractC28305a
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public String mo142597C() {
        return this.f132112e;
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: f */
    public boolean mo142609f() {
        int i11 = this.f132016a;
        if (i11 == -1) {
            return false;
        }
        while (i11 < mo142597C().length()) {
            char charAt = mo142597C().charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f132016a = i11;
                return m142598D(charAt);
            }
            i11++;
        }
        this.f132016a = i11;
        return false;
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: k */
    public String mo142612k() {
        int m127172a0;
        mo142616o('\"');
        int i11 = this.f132016a;
        m127172a0 = AbstractC24342w.m127172a0(mo142597C(), '\"', i11, false, 4, null);
        if (m127172a0 != -1) {
            for (int i12 = i11; i12 < m127172a0; i12++) {
                if (mo142597C().charAt(i12) == '\\') {
                    return m142619r(mo142597C(), this.f132016a, i12);
                }
            }
            this.f132016a = m127172a0 + 1;
            String substring = mo142597C().substring(i11, m127172a0);
            AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        m142625z((byte) 1);
        throw new KotlinNothingValueException();
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: l */
    public String mo142613l(String str, boolean z11) {
        String m142621t;
        String m142621t2;
        AbstractC19074t.m100208f(str, "keyToMatch");
        int i11 = this.f132016a;
        try {
            if (mo142614m() != 6) {
                this.f132016a = i11;
                return null;
            }
            if (z11) {
                m142621t = mo142612k();
            } else {
                m142621t = m142621t();
            }
            if (AbstractC19074t.m100204b(m142621t, str)) {
                if (mo142614m() != 5) {
                    this.f132016a = i11;
                    return null;
                }
                if (z11) {
                    m142621t2 = m142618q();
                } else {
                    m142621t2 = m142621t();
                }
                this.f132016a = i11;
                return m142621t2;
            }
            this.f132016a = i11;
            return null;
        } catch (Throwable th2) {
            this.f132016a = i11;
            throw th2;
        }
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: m */
    public byte mo142614m() {
        byte m142634a;
        String mo142597C = mo142597C();
        do {
            int i11 = this.f132016a;
            if (i11 != -1 && i11 < mo142597C.length()) {
                int i12 = this.f132016a;
                this.f132016a = i12 + 1;
                m142634a = AbstractC28308b.m142634a(mo142597C.charAt(i12));
            } else {
                return (byte) 10;
            }
        } while (m142634a == 3);
        return m142634a;
    }

    @Override // vn0.AbstractC28305a
    /* renamed from: o */
    public void mo142616o(char c11) {
        if (this.f132016a == -1) {
            m142607O(c11);
        }
        String mo142597C = mo142597C();
        while (this.f132016a < mo142597C.length()) {
            int i11 = this.f132016a;
            this.f132016a = i11 + 1;
            char charAt = mo142597C.charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c11) {
                    return;
                } else {
                    m142607O(c11);
                }
            }
        }
        m142607O(c11);
    }
}
