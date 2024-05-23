package p700z0;

import java.util.ArrayList;
import p700z0.C31133d;
import p700z0.C31138i;

/* renamed from: z0.b */
/* loaded from: classes2.dex */
public class C31131b implements C31133d.a {

    /* renamed from: e */
    public a f143422e;

    /* renamed from: a */
    C31138i f143418a = null;

    /* renamed from: b */
    float f143419b = 0.0f;

    /* renamed from: c */
    boolean f143420c = false;

    /* renamed from: d */
    ArrayList f143421d = new ArrayList();

    /* renamed from: f */
    boolean f143423f = false;

    /* renamed from: z0.b$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        boolean mo151212a(C31138i c31138i);

        /* renamed from: b */
        C31138i mo151213b(int i11);

        /* renamed from: c */
        void mo151214c();

        void clear();

        /* renamed from: d */
        float mo151215d(C31138i c31138i, boolean z11);

        /* renamed from: e */
        float mo151216e(C31131b c31131b, boolean z11);

        /* renamed from: f */
        int mo151217f();

        /* renamed from: g */
        float mo151218g(int i11);

        /* renamed from: h */
        float mo151219h(C31138i c31138i);

        /* renamed from: i */
        void mo151220i(C31138i c31138i, float f11, boolean z11);

        /* renamed from: j */
        void mo151221j(C31138i c31138i, float f11);

        /* renamed from: k */
        void mo151222k(float f11);
    }

    public C31131b() {
    }

    /* renamed from: u */
    private boolean m151223u(C31138i c31138i, C31133d c31133d) {
        if (c31138i.f143468B <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private C31138i m151224w(boolean[] zArr, C31138i c31138i) {
        C31138i.a aVar;
        int mo151217f = this.f143422e.mo151217f();
        C31138i c31138i2 = null;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < mo151217f; i11++) {
            float mo151218g = this.f143422e.mo151218g(i11);
            if (mo151218g < 0.0f) {
                C31138i mo151213b = this.f143422e.mo151213b(i11);
                if ((zArr == null || !zArr[mo151213b.f143475r]) && mo151213b != c31138i && (((aVar = mo151213b.f143482y) == C31138i.a.SLACK || aVar == C31138i.a.ERROR) && mo151218g < f11)) {
                    f11 = mo151218g;
                    c31138i2 = mo151213b;
                }
            }
        }
        return c31138i2;
    }

    /* renamed from: A */
    public void m151225A(C31133d c31133d, C31138i c31138i, boolean z11) {
        if (c31138i != null && c31138i.f143479v) {
            this.f143419b += c31138i.f143478u * this.f143422e.mo151219h(c31138i);
            this.f143422e.mo151215d(c31138i, z11);
            if (z11) {
                c31138i.m151298e(this);
            }
            if (C31133d.f143430t && this.f143422e.mo151217f() == 0) {
                this.f143423f = true;
                c31133d.f143436a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo151226B(C31133d c31133d, C31131b c31131b, boolean z11) {
        this.f143419b += c31131b.f143419b * this.f143422e.mo151216e(c31131b, z11);
        if (z11) {
            c31131b.f143418a.m151298e(this);
        }
        if (C31133d.f143430t && this.f143418a != null && this.f143422e.mo151217f() == 0) {
            this.f143423f = true;
            c31133d.f143436a = true;
        }
    }

    /* renamed from: C */
    public void m151227C(C31133d c31133d, C31138i c31138i, boolean z11) {
        if (c31138i != null && c31138i.f143469C) {
            float mo151219h = this.f143422e.mo151219h(c31138i);
            this.f143419b += c31138i.f143471E * mo151219h;
            this.f143422e.mo151215d(c31138i, z11);
            if (z11) {
                c31138i.m151298e(this);
            }
            this.f143422e.mo151220i(c31133d.f143449n.f143427d[c31138i.f143470D], mo151219h, z11);
            if (C31133d.f143430t && this.f143422e.mo151217f() == 0) {
                this.f143423f = true;
                c31133d.f143436a = true;
            }
        }
    }

    /* renamed from: D */
    public void m151228D(C31133d c31133d) {
        if (c31133d.f143442g.length == 0) {
            return;
        }
        boolean z11 = false;
        while (!z11) {
            int mo151217f = this.f143422e.mo151217f();
            for (int i11 = 0; i11 < mo151217f; i11++) {
                C31138i mo151213b = this.f143422e.mo151213b(i11);
                if (mo151213b.f143476s != -1 || mo151213b.f143479v || mo151213b.f143469C) {
                    this.f143421d.add(mo151213b);
                }
            }
            int size = this.f143421d.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    C31138i c31138i = (C31138i) this.f143421d.get(i12);
                    if (c31138i.f143479v) {
                        m151225A(c31133d, c31138i, true);
                    } else if (c31138i.f143469C) {
                        m151227C(c31133d, c31138i, true);
                    } else {
                        mo151226B(c31133d, c31133d.f143442g[c31138i.f143476s], true);
                    }
                }
                this.f143421d.clear();
            } else {
                z11 = true;
            }
        }
        if (C31133d.f143430t && this.f143418a != null && this.f143422e.mo151217f() == 0) {
            this.f143423f = true;
            c31133d.f143436a = true;
        }
    }

    @Override // p700z0.C31133d.a
    /* renamed from: a */
    public void mo151229a(C31133d.a aVar) {
        if (aVar instanceof C31131b) {
            C31131b c31131b = (C31131b) aVar;
            this.f143418a = null;
            this.f143422e.clear();
            for (int i11 = 0; i11 < c31131b.f143422e.mo151217f(); i11++) {
                this.f143422e.mo151220i(c31131b.f143422e.mo151213b(i11), c31131b.f143422e.mo151218g(i11), true);
            }
        }
    }

    @Override // p700z0.C31133d.a
    /* renamed from: b */
    public C31138i mo151230b(C31133d c31133d, boolean[] zArr) {
        return m151224w(zArr, null);
    }

    @Override // p700z0.C31133d.a
    /* renamed from: c */
    public void mo151231c(C31138i c31138i) {
        int i11 = c31138i.f143477t;
        float f11 = 1.0f;
        if (i11 != 1) {
            if (i11 == 2) {
                f11 = 1000.0f;
            } else if (i11 == 3) {
                f11 = 1000000.0f;
            } else if (i11 == 4) {
                f11 = 1.0E9f;
            } else if (i11 == 5) {
                f11 = 1.0E12f;
            }
        }
        this.f143422e.mo151221j(c31138i, f11);
    }

    @Override // p700z0.C31133d.a
    public void clear() {
        this.f143422e.clear();
        this.f143418a = null;
        this.f143419b = 0.0f;
    }

    /* renamed from: d */
    public C31131b m151232d(C31133d c31133d, int i11) {
        this.f143422e.mo151221j(c31133d.m151275o(i11, "ep"), 1.0f);
        this.f143422e.mo151221j(c31133d.m151275o(i11, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public C31131b m151233e(C31138i c31138i, int i11) {
        this.f143422e.mo151221j(c31138i, i11);
        return this;
    }

    /* renamed from: f */
    public boolean m151234f(C31133d c31133d) {
        boolean z11;
        C31138i m151235g = m151235g(c31133d);
        if (m151235g == null) {
            z11 = true;
        } else {
            m151250x(m151235g);
            z11 = false;
        }
        if (this.f143422e.mo151217f() == 0) {
            this.f143423f = true;
        }
        return z11;
    }

    /* renamed from: g */
    C31138i m151235g(C31133d c31133d) {
        boolean m151223u;
        boolean m151223u2;
        int mo151217f = this.f143422e.mo151217f();
        C31138i c31138i = null;
        C31138i c31138i2 = null;
        boolean z11 = false;
        boolean z12 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i11 = 0; i11 < mo151217f; i11++) {
            float mo151218g = this.f143422e.mo151218g(i11);
            C31138i mo151213b = this.f143422e.mo151213b(i11);
            if (mo151213b.f143482y == C31138i.a.UNRESTRICTED) {
                if (c31138i == null) {
                    m151223u2 = m151223u(mo151213b, c31133d);
                } else if (f11 > mo151218g) {
                    m151223u2 = m151223u(mo151213b, c31133d);
                } else if (!z11 && m151223u(mo151213b, c31133d)) {
                    f11 = mo151218g;
                    c31138i = mo151213b;
                    z11 = true;
                }
                z11 = m151223u2;
                f11 = mo151218g;
                c31138i = mo151213b;
            } else if (c31138i == null && mo151218g < 0.0f) {
                if (c31138i2 == null) {
                    m151223u = m151223u(mo151213b, c31133d);
                } else if (f12 > mo151218g) {
                    m151223u = m151223u(mo151213b, c31133d);
                } else if (!z12 && m151223u(mo151213b, c31133d)) {
                    f12 = mo151218g;
                    c31138i2 = mo151213b;
                    z12 = true;
                }
                z12 = m151223u;
                f12 = mo151218g;
                c31138i2 = mo151213b;
            }
        }
        if (c31138i != null) {
            return c31138i;
        }
        return c31138i2;
    }

    @Override // p700z0.C31133d.a
    public C31138i getKey() {
        return this.f143418a;
    }

    /* renamed from: h */
    public C31131b m151236h(C31138i c31138i, C31138i c31138i2, int i11, float f11, C31138i c31138i3, C31138i c31138i4, int i12) {
        if (c31138i2 == c31138i3) {
            this.f143422e.mo151221j(c31138i, 1.0f);
            this.f143422e.mo151221j(c31138i4, 1.0f);
            this.f143422e.mo151221j(c31138i2, -2.0f);
            return this;
        }
        if (f11 == 0.5f) {
            this.f143422e.mo151221j(c31138i, 1.0f);
            this.f143422e.mo151221j(c31138i2, -1.0f);
            this.f143422e.mo151221j(c31138i3, -1.0f);
            this.f143422e.mo151221j(c31138i4, 1.0f);
            if (i11 > 0 || i12 > 0) {
                this.f143419b = (-i11) + i12;
            }
        } else if (f11 <= 0.0f) {
            this.f143422e.mo151221j(c31138i, -1.0f);
            this.f143422e.mo151221j(c31138i2, 1.0f);
            this.f143419b = i11;
        } else if (f11 >= 1.0f) {
            this.f143422e.mo151221j(c31138i4, -1.0f);
            this.f143422e.mo151221j(c31138i3, 1.0f);
            this.f143419b = -i12;
        } else {
            float f12 = 1.0f - f11;
            this.f143422e.mo151221j(c31138i, f12 * 1.0f);
            this.f143422e.mo151221j(c31138i2, f12 * (-1.0f));
            this.f143422e.mo151221j(c31138i3, (-1.0f) * f11);
            this.f143422e.mo151221j(c31138i4, 1.0f * f11);
            if (i11 > 0 || i12 > 0) {
                this.f143419b = ((-i11) * f12) + (i12 * f11);
            }
        }
        return this;
    }

    /* renamed from: i */
    public C31131b m151237i(C31138i c31138i, int i11) {
        this.f143418a = c31138i;
        float f11 = i11;
        c31138i.f143478u = f11;
        this.f143419b = f11;
        this.f143423f = true;
        return this;
    }

    @Override // p700z0.C31133d.a
    public boolean isEmpty() {
        if (this.f143418a == null && this.f143419b == 0.0f && this.f143422e.mo151217f() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public C31131b m151238j(C31138i c31138i, C31138i c31138i2, float f11) {
        this.f143422e.mo151221j(c31138i, -1.0f);
        this.f143422e.mo151221j(c31138i2, f11);
        return this;
    }

    /* renamed from: k */
    public C31131b m151239k(C31138i c31138i, C31138i c31138i2, C31138i c31138i3, C31138i c31138i4, float f11) {
        this.f143422e.mo151221j(c31138i, -1.0f);
        this.f143422e.mo151221j(c31138i2, 1.0f);
        this.f143422e.mo151221j(c31138i3, f11);
        this.f143422e.mo151221j(c31138i4, -f11);
        return this;
    }

    /* renamed from: l */
    public C31131b m151240l(float f11, float f12, float f13, C31138i c31138i, C31138i c31138i2, C31138i c31138i3, C31138i c31138i4) {
        this.f143419b = 0.0f;
        if (f12 != 0.0f && f11 != f13) {
            if (f11 == 0.0f) {
                this.f143422e.mo151221j(c31138i, 1.0f);
                this.f143422e.mo151221j(c31138i2, -1.0f);
            } else if (f13 == 0.0f) {
                this.f143422e.mo151221j(c31138i3, 1.0f);
                this.f143422e.mo151221j(c31138i4, -1.0f);
            } else {
                float f14 = (f11 / f12) / (f13 / f12);
                this.f143422e.mo151221j(c31138i, 1.0f);
                this.f143422e.mo151221j(c31138i2, -1.0f);
                this.f143422e.mo151221j(c31138i4, f14);
                this.f143422e.mo151221j(c31138i3, -f14);
            }
        } else {
            this.f143422e.mo151221j(c31138i, 1.0f);
            this.f143422e.mo151221j(c31138i2, -1.0f);
            this.f143422e.mo151221j(c31138i4, 1.0f);
            this.f143422e.mo151221j(c31138i3, -1.0f);
        }
        return this;
    }

    /* renamed from: m */
    public C31131b m151241m(C31138i c31138i, int i11) {
        if (i11 < 0) {
            this.f143419b = i11 * (-1);
            this.f143422e.mo151221j(c31138i, 1.0f);
        } else {
            this.f143419b = i11;
            this.f143422e.mo151221j(c31138i, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C31131b m151242n(C31138i c31138i, C31138i c31138i2, int i11) {
        boolean z11;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            } else {
                z11 = false;
            }
            this.f143419b = i11;
            if (z11) {
                this.f143422e.mo151221j(c31138i, 1.0f);
                this.f143422e.mo151221j(c31138i2, -1.0f);
                return this;
            }
        }
        this.f143422e.mo151221j(c31138i, -1.0f);
        this.f143422e.mo151221j(c31138i2, 1.0f);
        return this;
    }

    /* renamed from: o */
    public C31131b m151243o(C31138i c31138i, C31138i c31138i2, C31138i c31138i3, int i11) {
        boolean z11;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            } else {
                z11 = false;
            }
            this.f143419b = i11;
            if (z11) {
                this.f143422e.mo151221j(c31138i, 1.0f);
                this.f143422e.mo151221j(c31138i2, -1.0f);
                this.f143422e.mo151221j(c31138i3, -1.0f);
                return this;
            }
        }
        this.f143422e.mo151221j(c31138i, -1.0f);
        this.f143422e.mo151221j(c31138i2, 1.0f);
        this.f143422e.mo151221j(c31138i3, 1.0f);
        return this;
    }

    /* renamed from: p */
    public C31131b m151244p(C31138i c31138i, C31138i c31138i2, C31138i c31138i3, int i11) {
        boolean z11;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            } else {
                z11 = false;
            }
            this.f143419b = i11;
            if (z11) {
                this.f143422e.mo151221j(c31138i, 1.0f);
                this.f143422e.mo151221j(c31138i2, -1.0f);
                this.f143422e.mo151221j(c31138i3, 1.0f);
                return this;
            }
        }
        this.f143422e.mo151221j(c31138i, -1.0f);
        this.f143422e.mo151221j(c31138i2, 1.0f);
        this.f143422e.mo151221j(c31138i3, -1.0f);
        return this;
    }

    /* renamed from: q */
    public C31131b m151245q(C31138i c31138i, C31138i c31138i2, C31138i c31138i3, C31138i c31138i4, float f11) {
        this.f143422e.mo151221j(c31138i3, 0.5f);
        this.f143422e.mo151221j(c31138i4, 0.5f);
        this.f143422e.mo151221j(c31138i, -0.5f);
        this.f143422e.mo151221j(c31138i2, -0.5f);
        this.f143419b = -f11;
        return this;
    }

    /* renamed from: r */
    public void m151246r() {
        float f11 = this.f143419b;
        if (f11 < 0.0f) {
            this.f143419b = f11 * (-1.0f);
            this.f143422e.mo151214c();
        }
    }

    /* renamed from: s */
    public boolean m151247s() {
        C31138i c31138i = this.f143418a;
        if (c31138i != null && (c31138i.f143482y == C31138i.a.UNRESTRICTED || this.f143419b >= 0.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m151248t(C31138i c31138i) {
        return this.f143422e.mo151212a(c31138i);
    }

    public String toString() {
        return m151252z();
    }

    /* renamed from: v */
    public C31138i m151249v(C31138i c31138i) {
        return m151224w(null, c31138i);
    }

    /* renamed from: x */
    public void m151250x(C31138i c31138i) {
        C31138i c31138i2 = this.f143418a;
        if (c31138i2 != null) {
            this.f143422e.mo151221j(c31138i2, -1.0f);
            this.f143418a.f143476s = -1;
            this.f143418a = null;
        }
        float mo151215d = this.f143422e.mo151215d(c31138i, true) * (-1.0f);
        this.f143418a = c31138i;
        if (mo151215d == 1.0f) {
            return;
        }
        this.f143419b /= mo151215d;
        this.f143422e.mo151222k(mo151215d);
    }

    /* renamed from: y */
    public void m151251y() {
        this.f143418a = null;
        this.f143422e.clear();
        this.f143419b = 0.0f;
        this.f143423f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String m151252z() {
        String str;
        boolean z11;
        if (this.f143418a == null) {
            str = "0";
        } else {
            str = "" + this.f143418a;
        }
        String str2 = str + " = ";
        if (this.f143419b != 0.0f) {
            str2 = str2 + this.f143419b;
            z11 = true;
        } else {
            z11 = false;
        }
        int mo151217f = this.f143422e.mo151217f();
        for (int i11 = 0; i11 < mo151217f; i11++) {
            C31138i mo151213b = this.f143422e.mo151213b(i11);
            if (mo151213b != null) {
                float mo151218g = this.f143422e.mo151218g(i11);
                if (mo151218g != 0.0f) {
                    String c31138i = mo151213b.toString();
                    if (!z11) {
                        if (mo151218g < 0.0f) {
                            str2 = str2 + "- ";
                            mo151218g *= -1.0f;
                        }
                        if (mo151218g == 1.0f) {
                            str2 = str2 + c31138i;
                        } else {
                            str2 = str2 + mo151218g + " " + c31138i;
                        }
                        z11 = true;
                    } else if (mo151218g > 0.0f) {
                        str2 = str2 + " + ";
                        if (mo151218g == 1.0f) {
                        }
                        z11 = true;
                    } else {
                        str2 = str2 + " - ";
                        mo151218g *= -1.0f;
                        if (mo151218g == 1.0f) {
                        }
                        z11 = true;
                    }
                }
            }
        }
        if (!z11) {
            return str2 + "0.0";
        }
        return str2;
    }

    public C31131b(C31132c c31132c) {
        this.f143422e = new C31130a(this, c31132c);
    }
}
