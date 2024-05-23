package ko0;

import com.zing.zalo.AbstractC8020f0;
import me0.AbstractC23136l9;
import mo0.EnumC23412c;
import ro0.C25942f;

/* renamed from: ko0.f */
/* loaded from: classes7.dex */
public class C21791f {

    /* renamed from: a */
    private int f105771a;

    /* renamed from: b */
    private String f105772b;

    /* renamed from: c */
    private String f105773c;

    /* renamed from: d */
    private int f105774d;

    /* renamed from: e */
    private int f105775e;

    /* renamed from: f */
    private long f105776f;

    /* renamed from: g */
    private long f105777g;

    /* renamed from: h */
    private int f105778h;

    /* renamed from: i */
    private boolean f105779i;

    /* renamed from: j */
    private long f105780j;

    /* renamed from: k */
    private int f105781k;

    /* renamed from: l */
    private boolean f105782l;

    /* renamed from: m */
    private int f105783m;

    /* renamed from: n */
    private boolean f105784n;

    /* renamed from: o */
    private boolean f105785o;

    public C21791f(C25942f c25942f) {
        this(2);
        m112489x(c25942f.m133655e());
        m112484s(c25942f.m133652a());
        m112485t(c25942f.m133653b());
        m112487v(c25942f.m133664n());
        m112488w(c25942f.m133654c());
        m112458A(c25942f.m133656f());
        m112461D(c25942f.m133659i());
        m112462E(c25942f.m133660j());
        m112463F(c25942f.m133661k());
        m112464G(c25942f.m133662l());
        m112460C(c25942f.m133665o());
    }

    /* renamed from: A */
    public void m112458A(String str) {
        this.f105773c = str;
    }

    /* renamed from: B */
    public void m112459B(int i11) {
        this.f105783m = i11;
    }

    /* renamed from: C */
    public void m112460C(boolean z11) {
        this.f105785o = z11;
    }

    /* renamed from: D */
    public void m112461D(int i11) {
        this.f105778h = i11;
    }

    /* renamed from: E */
    public void m112462E(long j11) {
        this.f105777g = j11;
    }

    /* renamed from: F */
    public void m112463F(int i11) {
        this.f105771a = i11;
    }

    /* renamed from: G */
    public void m112464G(int i11) {
        this.f105774d = i11;
    }

    /* renamed from: H */
    public void m112465H(boolean z11) {
        this.f105782l = z11;
    }

    /* renamed from: a */
    public int m112466a() {
        return this.f105775e;
    }

    /* renamed from: b */
    public String m112467b() {
        return this.f105772b;
    }

    /* renamed from: c */
    public long m112468c() {
        return this.f105776f;
    }

    /* renamed from: d */
    public long m112469d() {
        return this.f105780j;
    }

    /* renamed from: e */
    public boolean m112470e() {
        return this.f105784n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C21791f) || this.f105771a != ((C21791f) obj).f105771a) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String m112471f() {
        return this.f105773c;
    }

    /* renamed from: g */
    public int m112472g() {
        return this.f105783m;
    }

    /* renamed from: h */
    public int m112473h() {
        return this.f105778h;
    }

    public int hashCode() {
        return this.f105771a;
    }

    /* renamed from: i */
    public String m112474i() {
        int i11 = this.f105778h;
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 || i11 != 4) {
                return "";
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.call_state_disconnected);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_calling_view_status);
    }

    /* renamed from: j */
    public long m112475j() {
        return this.f105777g;
    }

    /* renamed from: k */
    public int m112476k() {
        return this.f105781k;
    }

    /* renamed from: l */
    public int m112477l() {
        return this.f105771a;
    }

    /* renamed from: m */
    public int m112478m() {
        return this.f105774d;
    }

    /* renamed from: n */
    public boolean m112479n() {
        return this.f105774d != 0;
    }

    /* renamed from: o */
    public boolean m112480o() {
        return this.f105779i;
    }

    /* renamed from: p */
    public boolean m112481p() {
        return this.f105775e != 0;
    }

    /* renamed from: q */
    public boolean m112482q() {
        return this.f105785o;
    }

    /* renamed from: r */
    public boolean m112483r() {
        return this.f105782l;
    }

    /* renamed from: s */
    public void m112484s(int i11) {
        this.f105775e = i11;
    }

    /* renamed from: t */
    public void m112485t(String str) {
        this.f105772b = str;
    }

    /* renamed from: u */
    public void m112486u(boolean z11) {
        this.f105774d = z11 ? 1 : 0;
    }

    /* renamed from: v */
    public void m112487v(boolean z11) {
        this.f105779i = z11;
    }

    /* renamed from: w */
    public void m112488w(long j11) {
        this.f105776f = j11;
    }

    /* renamed from: x */
    public void m112489x(long j11) {
        this.f105780j = j11;
    }

    /* renamed from: y */
    public void m112490y(boolean z11) {
        this.f105775e = z11 ? 1 : 0;
    }

    /* renamed from: z */
    public void m112491z(boolean z11) {
        this.f105784n = z11;
    }

    public C21791f(C21791f c21791f) {
        this(2);
        m112489x(c21791f.m112469d());
        m112484s(c21791f.m112466a());
        m112485t(c21791f.m112467b());
        m112487v(c21791f.m112480o());
        m112488w(c21791f.m112468c());
        m112458A(c21791f.m112471f());
        m112461D(c21791f.m112473h());
        m112462E(c21791f.m112475j());
        m112463F(c21791f.m112477l());
        m112464G(c21791f.m112478m());
        m112465H(c21791f.m112483r());
        m112459B(c21791f.m112472g());
        m112491z(c21791f.f105784n);
        m112460C(c21791f.m112482q());
    }

    public C21791f(int i11) {
        this.f105783m = EnumC23412c.f113762r.ordinal();
        this.f105784n = true;
        this.f105785o = false;
        this.f105781k = i11;
        this.f105771a = -1;
    }
}
