package p675ya;

import com.google.zxing.AbstractC6847b;
import java.nio.charset.StandardCharsets;

/* renamed from: ya.h */
/* loaded from: classes3.dex */
final class C30869h {

    /* renamed from: a */
    private final String f142426a;

    /* renamed from: b */
    private EnumC30873l f142427b;

    /* renamed from: c */
    private final StringBuilder f142428c;

    /* renamed from: d */
    int f142429d;

    /* renamed from: e */
    private int f142430e;

    /* renamed from: f */
    private C30872k f142431f;

    /* renamed from: g */
    private int f142432g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30869h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = (char) (bytes[i11] & 255);
            if (c11 == '?' && str.charAt(i11) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c11);
        }
        this.f142426a = sb2.toString();
        this.f142427b = EnumC30873l.FORCE_NONE;
        this.f142428c = new StringBuilder(str.length());
        this.f142430e = -1;
    }

    /* renamed from: h */
    private int m150033h() {
        return this.f142426a.length() - this.f142432g;
    }

    /* renamed from: a */
    public int m150034a() {
        return this.f142428c.length();
    }

    /* renamed from: b */
    public StringBuilder m150035b() {
        return this.f142428c;
    }

    /* renamed from: c */
    public char m150036c() {
        return this.f142426a.charAt(this.f142429d);
    }

    /* renamed from: d */
    public String m150037d() {
        return this.f142426a;
    }

    /* renamed from: e */
    public int m150038e() {
        return this.f142430e;
    }

    /* renamed from: f */
    public int m150039f() {
        return m150033h() - this.f142429d;
    }

    /* renamed from: g */
    public C30872k m150040g() {
        return this.f142431f;
    }

    /* renamed from: i */
    public boolean m150041i() {
        if (this.f142429d < m150033h()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m150042j() {
        this.f142430e = -1;
    }

    /* renamed from: k */
    public void m150043k() {
        this.f142431f = null;
    }

    /* renamed from: l */
    public void m150044l(AbstractC6847b abstractC6847b, AbstractC6847b abstractC6847b2) {
    }

    /* renamed from: m */
    public void m150045m(int i11) {
        this.f142432g = i11;
    }

    /* renamed from: n */
    public void m150046n(EnumC30873l enumC30873l) {
        this.f142427b = enumC30873l;
    }

    /* renamed from: o */
    public void m150047o(int i11) {
        this.f142430e = i11;
    }

    /* renamed from: p */
    public void m150048p() {
        m150049q(m150034a());
    }

    /* renamed from: q */
    public void m150049q(int i11) {
        C30872k c30872k = this.f142431f;
        if (c30872k == null || i11 > c30872k.m150073a()) {
            this.f142431f = C30872k.m150072l(i11, this.f142427b, null, null, true);
        }
    }

    /* renamed from: r */
    public void m150050r(char c11) {
        this.f142428c.append(c11);
    }

    /* renamed from: s */
    public void m150051s(String str) {
        this.f142428c.append(str);
    }
}
