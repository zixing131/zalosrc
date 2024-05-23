package com.zing.zalo.uidrawing;

import hd0.C20003a;
import hd0.C20005c;
import java.util.List;

/* renamed from: com.zing.zalo.uidrawing.f */
/* loaded from: classes4.dex */
public class C16718f {

    /* renamed from: a */
    private C16719g f84705a;

    /* renamed from: b */
    public int f84706b;

    /* renamed from: c */
    public int f84707c;

    /* renamed from: f */
    private AbstractC16713a f84710f;

    /* renamed from: g */
    private AbstractC16713a f84711g;

    /* renamed from: h */
    private AbstractC16713a f84712h;

    /* renamed from: i */
    private AbstractC16713a f84713i;

    /* renamed from: j */
    private AbstractC16713a f84714j;

    /* renamed from: k */
    private AbstractC16713a f84715k;

    /* renamed from: l */
    public int f84716l;

    /* renamed from: m */
    public int f84717m;

    /* renamed from: n */
    public int f84718n;

    /* renamed from: o */
    public int f84719o;

    /* renamed from: p */
    public int f84720p;

    /* renamed from: q */
    public int f84721q;

    /* renamed from: r */
    public int f84722r;

    /* renamed from: s */
    public int f84723s;

    /* renamed from: t */
    public int f84724t;

    /* renamed from: u */
    public float f84725u;

    /* renamed from: v */
    public float f84726v;

    /* renamed from: w */
    public int f84727w = 0;

    /* renamed from: x */
    public int f84728x = 0;

    /* renamed from: y */
    public int f84729y = 100000;

    /* renamed from: z */
    public int f84730z = 100000;

    /* renamed from: d */
    public int f84708d = -2;

    /* renamed from: e */
    public int f84709e = -2;

    public C16718f(C16719g c16719g) {
        this.f84705a = c16719g;
    }

    /* renamed from: c */
    private int m89011c() {
        InterfaceC16721i m89116Q;
        AbstractC16713a abstractC16713a = this.f84713i;
        if (abstractC16713a != null) {
            int m88990a = abstractC16713a.m88990a();
            if (m88990a != Integer.MIN_VALUE && m88990a != -2147483647 && this.f84705a.m89136d0() != 8) {
                return m88990a - this.f84723s;
            }
            return m88990a;
        }
        if (this.f84709e != -1 || (m89116Q = this.f84705a.m89116Q()) == null) {
            return Integer.MIN_VALUE;
        }
        if (m89116Q.getHeightMeasureMode() == 0) {
            this.f84705a.f84755O = true;
            return Integer.MIN_VALUE;
        }
        int i11 = 0;
        int max = Math.max((m89116Q.getHeightMeasureSize() - this.f84705a.m89116Q().getPaddingTop()) - this.f84705a.m89116Q().getPaddingBottom(), 0);
        if (this.f84705a.m89136d0() != 8) {
            i11 = this.f84723s;
        }
        return max - i11;
    }

    /* renamed from: d */
    private int m89012d() {
        int i11;
        int i12;
        AbstractC16713a abstractC16713a = this.f84710f;
        if (abstractC16713a != null) {
            i11 = abstractC16713a.m88990a();
            if (i11 != Integer.MIN_VALUE && i11 != -2147483647 && this.f84705a.m89136d0() != 8) {
                i12 = this.f84720p;
            } else {
                return i11;
            }
        } else {
            if (this.f84708d != -1 && this.f84706b <= 0) {
                return Integer.MIN_VALUE;
            }
            i11 = this.f84706b;
            if (this.f84705a.m89136d0() != 8) {
                i12 = this.f84720p;
            } else {
                i12 = 0;
            }
        }
        return i11 + i12;
    }

    /* renamed from: e */
    private int m89013e() {
        InterfaceC16721i m89116Q;
        AbstractC16713a abstractC16713a = this.f84712h;
        if (abstractC16713a != null) {
            int m88990a = abstractC16713a.m88990a();
            if (m88990a != Integer.MIN_VALUE && m88990a != -2147483647 && this.f84705a.m89136d0() != 8) {
                return m88990a - this.f84722r;
            }
            return m88990a;
        }
        if (this.f84708d != -1 || (m89116Q = this.f84705a.m89116Q()) == null) {
            return Integer.MIN_VALUE;
        }
        if (m89116Q.getWidthMeasureMode() == 0) {
            this.f84705a.f84755O = true;
            return Integer.MIN_VALUE;
        }
        int i11 = 0;
        int max = Math.max((m89116Q.getWidthMeasureSize() - this.f84705a.m89116Q().getPaddingLeft()) - this.f84705a.m89116Q().getPaddingRight(), 0);
        if (this.f84705a.m89136d0() != 8) {
            i11 = this.f84722r;
        }
        return max - i11;
    }

    /* renamed from: f */
    private int m89014f() {
        int i11;
        int i12;
        AbstractC16713a abstractC16713a = this.f84711g;
        if (abstractC16713a != null) {
            i11 = abstractC16713a.m88990a();
            if (i11 != Integer.MIN_VALUE && i11 != -2147483647 && this.f84705a.m89136d0() != 8) {
                i12 = this.f84721q;
            } else {
                return i11;
            }
        } else {
            if (this.f84709e != -1 && this.f84707c <= 0) {
                return Integer.MIN_VALUE;
            }
            i11 = this.f84707c;
            if (this.f84705a.m89136d0() != 8) {
                i12 = this.f84721q;
            } else {
                i12 = 0;
            }
        }
        return i11 + i12;
    }

    /* renamed from: m */
    private boolean m89015m(int i11) {
        return (i11 == -2147483647 || i11 == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: r */
    public static int m89016r(int i11, int i12, int i13) {
        return i11 < 0 ? i11 : i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    /* renamed from: A */
    public C16718f m89017A(Boolean bool) {
        if (bool.booleanValue()) {
            C16719g c16719g = this.f84705a;
            if (c16719g == null) {
                this.f84712h = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84712h;
            if (abstractC16713a instanceof C16722j) {
                ((C16722j) abstractC16713a).f84686a = c16719g;
                abstractC16713a.m88995f(3);
            } else {
                this.f84712h = new C16722j(c16719g, 3);
            }
        } else if (this.f84712h instanceof C16722j) {
            this.f84712h = null;
        }
        return this;
    }

    /* renamed from: B */
    public C16718f m89018B(Boolean bool) {
        if (bool.booleanValue()) {
            C16719g c16719g = this.f84705a;
            if (c16719g == null) {
                this.f84711g = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84711g;
            if (abstractC16713a instanceof C16722j) {
                ((C16722j) abstractC16713a).f84686a = c16719g;
                abstractC16713a.m88995f(2);
            } else {
                this.f84711g = new C16722j(c16719g, 2);
            }
        } else if (this.f84711g instanceof C16722j) {
            this.f84711g = null;
        }
        return this;
    }

    /* renamed from: C */
    public C16718f m89019C(C16719g c16719g) {
        if (c16719g == null) {
            this.f84712h = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84712h;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = true;
            abstractC16713a.m88995f(3);
        } else {
            this.f84712h = new C16720h(this.f84705a, 3, c16719g, true);
        }
        return this;
    }

    /* renamed from: D */
    public C16718f m89020D(C16719g c16719g) {
        if (c16719g == null) {
            this.f84711g = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84711g;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = true;
            abstractC16713a.m88995f(2);
        } else {
            this.f84711g = new C16720h(this.f84705a, 2, c16719g, true);
        }
        return this;
    }

    /* renamed from: E */
    public C16718f m89021E(C20003a c20003a) {
        if (c20003a == null) {
            this.f84711g = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84711g;
        if (abstractC16713a instanceof C16714b) {
            ((C16714b) abstractC16713a).m88996g(c20003a);
            this.f84711g.m88995f(2);
        } else {
            this.f84711g = new C16714b(this.f84705a, 2, c20003a);
        }
        return this;
    }

    /* renamed from: F */
    public C16718f m89022F(float f11) {
        this.f84726v = f11;
        this.f84725u = 0.0f;
        return this;
    }

    /* renamed from: G */
    public C16718f m89023G(C16719g c16719g) {
        if (c16719g == null) {
            this.f84711g = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84711g;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = false;
            abstractC16713a.m88995f(4);
        } else {
            this.f84711g = new C16720h(this.f84705a, 4, c16719g, false);
        }
        return this;
    }

    /* renamed from: H */
    public C16718f m89024H(C20003a c20003a) {
        if (c20003a == null) {
            this.f84711g = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84711g;
        if (abstractC16713a instanceof C16714b) {
            ((C16714b) abstractC16713a).m88996g(c20003a);
            this.f84711g.m88995f(4);
        } else {
            this.f84711g = new C16714b(this.f84705a, 4, c20003a);
        }
        return this;
    }

    /* renamed from: I */
    public C16718f m89025I(boolean z11) {
        m89026J(z11);
        m89027K(z11);
        return this;
    }

    /* renamed from: J */
    public C16718f m89026J(boolean z11) {
        if (z11) {
            C16719g c16719g = this.f84705a;
            if (c16719g == null) {
                this.f84714j = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84714j;
            if (abstractC16713a instanceof C16722j) {
                ((C16722j) abstractC16713a).f84686a = c16719g;
                abstractC16713a.m88995f(0);
            } else {
                this.f84714j = new C16722j(c16719g, 0);
            }
        } else if (this.f84714j instanceof C16722j) {
            this.f84714j = null;
        }
        return this;
    }

    /* renamed from: K */
    public C16718f m89027K(boolean z11) {
        if (z11) {
            C16719g c16719g = this.f84705a;
            if (c16719g == null) {
                this.f84715k = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84715k;
            if (abstractC16713a instanceof C16722j) {
                ((C16722j) abstractC16713a).f84686a = c16719g;
                abstractC16713a.m88995f(0);
            } else {
                this.f84715k = new C16722j(c16719g, 0);
            }
        } else if (this.f84715k instanceof C16722j) {
            this.f84715k = null;
        }
        return this;
    }

    /* renamed from: L */
    public C16718f m89028L(int i11, int i12) {
        this.f84708d = i11;
        this.f84709e = i12;
        return this;
    }

    /* renamed from: M */
    public C16718f m89029M(int i11) {
        this.f84724t = i11;
        return this;
    }

    /* renamed from: N */
    public C16718f m89030N(int i11) {
        this.f84709e = i11;
        return this;
    }

    /* renamed from: O */
    public C16718f m89031O(int i11) {
        this.f84723s = i11;
        this.f84722r = i11;
        this.f84721q = i11;
        this.f84720p = i11;
        return this;
    }

    /* renamed from: P */
    public C16718f m89032P(int i11, int i12, int i13, int i14) {
        this.f84720p = i11;
        this.f84722r = i13;
        this.f84721q = i12;
        this.f84723s = i14;
        return this;
    }

    /* renamed from: Q */
    public C16718f m89033Q(int i11) {
        this.f84723s = i11;
        return this;
    }

    /* renamed from: R */
    public C16718f m89034R(int i11) {
        this.f84720p = i11;
        return this;
    }

    /* renamed from: S */
    public C16718f m89035S(int i11) {
        this.f84722r = i11;
        return this;
    }

    /* renamed from: T */
    public C16718f m89036T(int i11) {
        this.f84721q = i11;
        return this;
    }

    /* renamed from: U */
    public C16718f m89037U(int i11) {
        this.f84730z = i11;
        return this;
    }

    /* renamed from: V */
    public C16718f m89038V(int i11) {
        this.f84729y = i11;
        return this;
    }

    /* renamed from: W */
    public C16718f m89039W(int i11) {
        this.f84728x = i11;
        return this;
    }

    /* renamed from: X */
    public C16718f m89040X(int i11) {
        this.f84727w = i11;
        return this;
    }

    /* renamed from: Y */
    public C16718f m89041Y(int i11) {
        this.f84719o = i11;
        this.f84718n = i11;
        this.f84717m = i11;
        this.f84716l = i11;
        return this;
    }

    /* renamed from: Z */
    public C16718f m89042Z(int i11, int i12, int i13, int i14) {
        this.f84716l = i11;
        this.f84717m = i12;
        this.f84718n = i13;
        this.f84719o = i14;
        return this;
    }

    /* renamed from: a */
    public boolean m89043a() {
        C16719g c16719g = this.f84705a;
        if (c16719g != null && c16719g.m89114P() >= 0 && m89059k()) {
            AbstractC16713a abstractC16713a = this.f84714j;
            if ((abstractC16713a instanceof C16722j) && ((C16722j) abstractC16713a).f84686a != null && ((C16722j) abstractC16713a).f84686a.m89116Q() != null) {
                if (((C16722j) this.f84714j).f84686a.m89116Q().getWidthMeasureMode() == 1073741824) {
                    return true;
                }
            } else {
                AbstractC16713a abstractC16713a2 = this.f84714j;
                if ((abstractC16713a2 instanceof C16720h) && ((C16720h) abstractC16713a2).f84798c != null) {
                    C16719g c16719g2 = ((C16720h) abstractC16713a2).f84798c;
                    if (!c16719g2.f84755O && !c16719g2.f84756P && this.f84705a.m89116Q() == c16719g2.m89116Q() && this.f84705a.m89116Q().getModules() != null) {
                        List modules = c16719g2.m89116Q().getModules();
                        if (modules.indexOf(this.f84705a) > modules.indexOf(c16719g2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a0 */
    public C16718f m89044a0(int i11) {
        this.f84719o = i11;
        return this;
    }

    /* renamed from: b */
    public boolean m89045b() {
        C16719g c16719g = this.f84705a;
        if (c16719g != null && c16719g.m89114P() >= 0 && m89061l()) {
            AbstractC16713a abstractC16713a = this.f84715k;
            if ((abstractC16713a instanceof C16722j) && ((C16722j) abstractC16713a).f84686a != null && ((C16722j) abstractC16713a).f84686a.m89116Q() != null) {
                if (((C16722j) this.f84715k).f84686a.m89116Q().getHeightMeasureMode() == 1073741824) {
                    return true;
                }
            } else {
                AbstractC16713a abstractC16713a2 = this.f84715k;
                if ((abstractC16713a2 instanceof C16720h) && ((C16720h) abstractC16713a2).f84798c != null) {
                    C16719g c16719g2 = ((C16720h) abstractC16713a2).f84798c;
                    if (!c16719g2.f84755O && !c16719g2.f84757Q && this.f84705a.m89116Q() == c16719g2.m89116Q() && this.f84705a.m89116Q().getModules() != null) {
                        List modules = c16719g2.m89116Q().getModules();
                        if (modules.indexOf(this.f84705a) > modules.indexOf(c16719g2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public C16718f m89046b0(int i11) {
        this.f84716l = i11;
        return this;
    }

    /* renamed from: c0 */
    public C16718f m89047c0(int i11) {
        this.f84718n = i11;
        return this;
    }

    /* renamed from: d0 */
    public C16718f m89048d0(int i11) {
        if (this.f84717m != i11) {
            this.f84717m = i11;
        }
        return this;
    }

    /* renamed from: e0 */
    public C16718f m89049e0(C16719g c16719g) {
        if (c16719g == null) {
            this.f84712h = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84712h;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = false;
            abstractC16713a.m88995f(1);
        } else {
            this.f84712h = new C16720h(this.f84705a, 1, c16719g, false);
        }
        return this;
    }

    /* renamed from: f0 */
    public C16718f m89050f0(C20003a c20003a) {
        if (c20003a == null) {
            this.f84712h = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84712h;
        if (abstractC16713a instanceof C16714b) {
            ((C16714b) abstractC16713a).m88996g(c20003a);
            this.f84712h.m88995f(1);
        } else {
            this.f84712h = new C16714b(this.f84705a, 1, c20003a);
        }
        return this;
    }

    /* renamed from: g */
    public int m89051g() {
        return (this.f84730z - this.f84717m) - this.f84719o;
    }

    /* renamed from: g0 */
    public C16718f m89052g0(C20005c c20005c) {
        if (c20005c == null) {
            this.f84712h = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84712h;
        if (abstractC16713a instanceof C16717e) {
            ((C16717e) abstractC16713a).f84704c = c20005c;
            abstractC16713a.m88995f(3);
        } else {
            this.f84712h = new C16717e(this.f84705a, 3, c20005c);
        }
        return this;
    }

    /* renamed from: h */
    public int m89053h() {
        return (this.f84729y - this.f84716l) - this.f84718n;
    }

    /* renamed from: h0 */
    public C16718f m89054h0(C16719g c16719g) {
        if (c16719g == null) {
            this.f84710f = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84710f;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = false;
            abstractC16713a.m88995f(3);
        } else {
            this.f84710f = new C16720h(this.f84705a, 3, c16719g, false);
        }
        return this;
    }

    /* renamed from: i */
    public int m89055i() {
        return (this.f84728x - this.f84717m) - this.f84719o;
    }

    /* renamed from: i0 */
    public C16718f m89056i0(C20003a c20003a) {
        if (c20003a == null) {
            this.f84710f = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84710f;
        if (abstractC16713a instanceof C16714b) {
            ((C16714b) abstractC16713a).m88996g(c20003a);
            this.f84710f.m88995f(3);
        } else {
            this.f84710f = new C16714b(this.f84705a, 3, c20003a);
        }
        return this;
    }

    /* renamed from: j */
    public int m89057j() {
        return (this.f84727w - this.f84716l) - this.f84718n;
    }

    /* renamed from: j0 */
    public C16718f m89058j0(C20005c c20005c) {
        if (c20005c == null) {
            this.f84710f = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84710f;
        if (abstractC16713a instanceof C16717e) {
            ((C16717e) abstractC16713a).f84704c = c20005c;
            abstractC16713a.m88995f(1);
        } else {
            this.f84710f = new C16717e(this.f84705a, 1, c20005c);
        }
        return this;
    }

    /* renamed from: k */
    public boolean m89059k() {
        return this.f84714j != null && this.f84710f == null && this.f84712h == null;
    }

    /* renamed from: k0 */
    public C16718f m89060k0(int i11) {
        this.f84708d = i11;
        return this;
    }

    /* renamed from: l */
    public boolean m89061l() {
        return this.f84715k != null && this.f84711g == null && this.f84713i == null;
    }

    /* renamed from: n */
    public void m89062n() {
        int m89016r;
        int m89016r2;
        int i11;
        this.f84705a.f84755O = false;
        int m89012d = m89012d();
        int m89013e = m89013e();
        int m89014f = m89014f();
        int m89011c = m89011c();
        if (this.f84725u <= 0.0f && this.f84726v <= 0.0f) {
            m89016r = m89016r(this.f84708d, this.f84727w, this.f84729y);
            i11 = m89016r(this.f84709e, this.f84728x, this.f84730z);
        } else {
            if (m89015m(m89012d) && m89015m(m89013e)) {
                m89016r = m89013e - m89012d;
            } else {
                m89016r = m89016r(this.f84708d, this.f84727w, this.f84729y);
            }
            if (m89015m(m89014f) && m89015m(m89011c)) {
                m89016r2 = m89011c - m89014f;
            } else {
                m89016r2 = m89016r(this.f84709e, this.f84728x, this.f84730z);
            }
            if (this.f84726v > 0.0f && m89016r >= 0 && (!m89015m(m89014f) || !m89015m(m89011c))) {
                i11 = m89016r((int) (m89016r * this.f84726v), this.f84728x, this.f84730z);
            } else {
                if (this.f84725u > 0.0f && m89016r2 >= 0 && (!m89015m(m89014f) || !m89015m(m89011c))) {
                    m89016r = m89016r((int) (this.f84725u * m89016r2), this.f84727w, this.f84729y);
                }
                i11 = m89016r2;
            }
        }
        if ((m89012d == Integer.MIN_VALUE || m89013e == Integer.MIN_VALUE) && m89016r >= 0 && this.f84705a.m89136d0() != 8) {
            if (m89012d == Integer.MIN_VALUE && m89013e != Integer.MIN_VALUE) {
                m89012d = m89013e - m89016r;
            } else {
                if (m89012d == Integer.MIN_VALUE || m89013e != Integer.MIN_VALUE) {
                    m89012d = this.f84720p;
                }
                m89013e = m89012d + m89016r;
            }
        }
        if ((m89014f == Integer.MIN_VALUE || m89011c == Integer.MIN_VALUE) && i11 >= 0 && this.f84705a.m89136d0() != 8) {
            if (m89014f == Integer.MIN_VALUE && m89011c != Integer.MIN_VALUE) {
                m89014f = m89011c - i11;
            } else {
                if (m89014f == Integer.MIN_VALUE || m89011c != Integer.MIN_VALUE) {
                    m89014f = this.f84721q;
                }
                m89011c = m89014f + i11;
            }
        }
        this.f84705a.m89089C0(m89012d, m89014f, m89013e, m89011c);
    }

    /* renamed from: o */
    public void m89063o() {
        this.f84707c = 0;
        this.f84706b = 0;
        this.f84708d = -2;
        this.f84709e = -2;
        this.f84713i = null;
        this.f84712h = null;
        this.f84711g = null;
        this.f84710f = null;
        this.f84715k = null;
        this.f84714j = null;
        this.f84719o = 0;
        this.f84718n = 0;
        this.f84717m = 0;
        this.f84716l = 0;
        this.f84723s = 0;
        this.f84722r = 0;
        this.f84721q = 0;
        this.f84720p = 0;
        this.f84724t = 0;
        this.f84705a.f84782p = 0;
        this.f84726v = 0.0f;
        this.f84725u = 0.0f;
        this.f84727w = 0;
        this.f84728x = 0;
        this.f84729y = Integer.MAX_VALUE;
        this.f84730z = Integer.MAX_VALUE;
    }

    /* renamed from: p */
    public void m89064p() {
        int m89114P = this.f84705a.m89114P();
        if (m89059k()) {
            int mo88992c = this.f84714j.mo88992c();
            int mo88993d = this.f84714j.mo88993d();
            if (m89114P != Integer.MIN_VALUE && mo88992c != -2147483647 && mo88992c != Integer.MIN_VALUE && mo88993d != -2147483647 && mo88993d != Integer.MIN_VALUE) {
                int i11 = this.f84720p;
                int i12 = ((((mo88993d - mo88992c) - i11) - this.f84722r) - m89114P) / 2;
                C16719g c16719g = this.f84705a;
                int i13 = mo88992c + i11 + i12;
                c16719g.f84743C = i13;
                c16719g.f84745E = i13 + m89114P;
            }
        }
    }

    /* renamed from: q */
    public void m89065q() {
        int m89112O = this.f84705a.m89112O();
        if (m89061l()) {
            int mo88994e = this.f84715k.mo88994e();
            int mo88991b = this.f84715k.mo88991b();
            if (m89112O != Integer.MIN_VALUE && mo88994e != -2147483647 && mo88994e != Integer.MIN_VALUE && mo88991b != -2147483647 && mo88991b != Integer.MIN_VALUE) {
                int i11 = this.f84721q;
                int i12 = ((((mo88991b - mo88994e) - i11) - this.f84723s) - m89112O) / 2;
                C16719g c16719g = this.f84705a;
                int i13 = mo88994e + i11 + i12;
                c16719g.f84744D = i13;
                c16719g.f84746F = i13 + m89112O;
            }
        }
    }

    /* renamed from: s */
    public C16718f m89066s(C16719g c16719g) {
        if (c16719g == null) {
            this.f84713i = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84713i;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = false;
            abstractC16713a.m88995f(2);
        } else {
            this.f84713i = new C16720h(this.f84705a, 2, c16719g, false);
        }
        return this;
    }

    /* renamed from: t */
    public C16718f m89067t(C16719g c16719g) {
        if (c16719g == null) {
            this.f84713i = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84713i;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = true;
            abstractC16713a.m88995f(4);
        } else {
            this.f84713i = new C16720h(this.f84705a, 4, c16719g, true);
        }
        return this;
    }

    /* renamed from: u */
    public C16718f m89068u(C20003a c20003a) {
        if (c20003a == null) {
            this.f84713i = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84713i;
        if (abstractC16713a instanceof C16714b) {
            ((C16714b) abstractC16713a).m88996g(c20003a);
            this.f84713i.m88995f(4);
        } else {
            this.f84713i = new C16714b(this.f84705a, 4, c20003a);
        }
        return this;
    }

    /* renamed from: v */
    public C16718f m89069v(C16719g c16719g) {
        if (c16719g != null) {
            C16719g c16719g2 = this.f84705a;
            if (c16719g2 == null) {
                this.f84714j = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84714j;
            if (abstractC16713a instanceof C16720h) {
                ((C16720h) abstractC16713a).f84798c = c16719g;
                ((C16720h) abstractC16713a).f84799d = true;
                abstractC16713a.m88995f(0);
            } else {
                this.f84714j = new C16720h(c16719g2, 0, c16719g, true);
            }
        } else if (this.f84714j instanceof C16720h) {
            this.f84714j = null;
        }
        return this;
    }

    /* renamed from: w */
    public C16718f m89070w(C16719g c16719g) {
        if (c16719g != null) {
            C16719g c16719g2 = this.f84705a;
            if (c16719g2 == null) {
                this.f84715k = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84715k;
            if (abstractC16713a instanceof C16720h) {
                ((C16720h) abstractC16713a).f84798c = c16719g;
                ((C16720h) abstractC16713a).f84799d = true;
                abstractC16713a.m88995f(0);
            } else {
                this.f84715k = new C16720h(c16719g2, 0, c16719g, true);
            }
        } else if (this.f84715k instanceof C16720h) {
            this.f84715k = null;
        }
        return this;
    }

    /* renamed from: x */
    public C16718f m89071x(C16719g c16719g) {
        if (c16719g == null) {
            this.f84710f = null;
            return this;
        }
        AbstractC16713a abstractC16713a = this.f84710f;
        if (abstractC16713a instanceof C16720h) {
            ((C16720h) abstractC16713a).f84798c = c16719g;
            ((C16720h) abstractC16713a).f84799d = true;
            abstractC16713a.m88995f(1);
        } else {
            this.f84710f = new C16720h(this.f84705a, 1, c16719g, true);
        }
        return this;
    }

    /* renamed from: y */
    public C16718f m89072y(Boolean bool) {
        if (bool.booleanValue()) {
            C16719g c16719g = this.f84705a;
            if (c16719g == null) {
                this.f84713i = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84713i;
            if (abstractC16713a instanceof C16722j) {
                ((C16722j) abstractC16713a).f84686a = c16719g;
                abstractC16713a.m88995f(4);
            } else {
                this.f84713i = new C16722j(c16719g, 4);
            }
        } else if (this.f84713i instanceof C16722j) {
            this.f84713i = null;
        }
        return this;
    }

    /* renamed from: z */
    public C16718f m89073z(Boolean bool) {
        if (bool.booleanValue()) {
            C16719g c16719g = this.f84705a;
            if (c16719g == null) {
                this.f84710f = null;
                return this;
            }
            AbstractC16713a abstractC16713a = this.f84710f;
            if (abstractC16713a instanceof C16722j) {
                ((C16722j) abstractC16713a).f84686a = c16719g;
                abstractC16713a.m88995f(1);
            } else {
                this.f84710f = new C16722j(c16719g, 1);
            }
        } else if (this.f84710f instanceof C16722j) {
            this.f84710f = null;
        }
        return this;
    }
}
