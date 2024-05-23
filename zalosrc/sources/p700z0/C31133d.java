package p700z0;

import java.util.Arrays;
import java.util.HashMap;
import p045c1.C3185d;
import p045c1.C3186e;
import p700z0.C31138i;

/* renamed from: z0.d */
/* loaded from: classes2.dex */
public class C31133d {

    /* renamed from: r */
    public static boolean f143428r = false;

    /* renamed from: s */
    public static boolean f143429s = true;

    /* renamed from: t */
    public static boolean f143430t = true;

    /* renamed from: u */
    public static boolean f143431u = true;

    /* renamed from: v */
    public static boolean f143432v = false;

    /* renamed from: w */
    private static int f143433w = 1000;

    /* renamed from: x */
    public static long f143434x;

    /* renamed from: y */
    public static long f143435y;

    /* renamed from: d */
    private a f143439d;

    /* renamed from: g */
    C31131b[] f143442g;

    /* renamed from: n */
    final C31132c f143449n;

    /* renamed from: q */
    private a f143452q;

    /* renamed from: a */
    public boolean f143436a = false;

    /* renamed from: b */
    int f143437b = 0;

    /* renamed from: c */
    private HashMap f143438c = null;

    /* renamed from: e */
    private int f143440e = 32;

    /* renamed from: f */
    private int f143441f = 32;

    /* renamed from: h */
    public boolean f143443h = false;

    /* renamed from: i */
    public boolean f143444i = false;

    /* renamed from: j */
    private boolean[] f143445j = new boolean[32];

    /* renamed from: k */
    int f143446k = 1;

    /* renamed from: l */
    int f143447l = 0;

    /* renamed from: m */
    private int f143448m = 32;

    /* renamed from: o */
    private C31138i[] f143450o = new C31138i[f143433w];

    /* renamed from: p */
    private int f143451p = 0;

    /* renamed from: z0.d$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo151229a(a aVar);

        /* renamed from: b */
        C31138i mo151230b(C31133d c31133d, boolean[] zArr);

        /* renamed from: c */
        void mo151231c(C31138i c31138i);

        void clear();

        C31138i getKey();

        boolean isEmpty();
    }

    /* renamed from: z0.d$b */
    /* loaded from: classes2.dex */
    public class b extends C31131b {
        public b(C31132c c31132c) {
            this.f143422e = new C31139j(this, c31132c);
        }
    }

    public C31133d() {
        this.f143442g = null;
        this.f143442g = new C31131b[32];
        m151254C();
        C31132c c31132c = new C31132c();
        this.f143449n = c31132c;
        this.f143439d = new C31137h(c31132c);
        if (f143432v) {
            this.f143452q = new b(c31132c);
        } else {
            this.f143452q = new C31131b(c31132c);
        }
    }

    /* renamed from: B */
    private final int m151253B(a aVar, boolean z11) {
        for (int i11 = 0; i11 < this.f143446k; i11++) {
            this.f143445j[i11] = false;
        }
        boolean z12 = false;
        int i12 = 0;
        while (!z12) {
            i12++;
            if (i12 >= this.f143446k * 2) {
                return i12;
            }
            if (aVar.getKey() != null) {
                this.f143445j[aVar.getKey().f143475r] = true;
            }
            C31138i mo151230b = aVar.mo151230b(this, this.f143445j);
            if (mo151230b != null) {
                boolean[] zArr = this.f143445j;
                int i13 = mo151230b.f143475r;
                if (zArr[i13]) {
                    return i12;
                }
                zArr[i13] = true;
            }
            if (mo151230b != null) {
                float f11 = Float.MAX_VALUE;
                int i14 = -1;
                for (int i15 = 0; i15 < this.f143447l; i15++) {
                    C31131b c31131b = this.f143442g[i15];
                    if (c31131b.f143418a.f143482y != C31138i.a.UNRESTRICTED && !c31131b.f143423f && c31131b.m151248t(mo151230b)) {
                        float mo151219h = c31131b.f143422e.mo151219h(mo151230b);
                        if (mo151219h < 0.0f) {
                            float f12 = (-c31131b.f143419b) / mo151219h;
                            if (f12 < f11) {
                                i14 = i15;
                                f11 = f12;
                            }
                        }
                    }
                }
                if (i14 > -1) {
                    C31131b c31131b2 = this.f143442g[i14];
                    c31131b2.f143418a.f143476s = -1;
                    c31131b2.m151250x(mo151230b);
                    C31138i c31138i = c31131b2.f143418a;
                    c31138i.f143476s = i14;
                    c31138i.m151302j(this, c31131b2);
                }
            } else {
                z12 = true;
            }
        }
        return i12;
    }

    /* renamed from: C */
    private void m151254C() {
        int i11 = 0;
        if (f143432v) {
            while (i11 < this.f143447l) {
                C31131b c31131b = this.f143442g[i11];
                if (c31131b != null) {
                    this.f143449n.f143424a.mo151283a(c31131b);
                }
                this.f143442g[i11] = null;
                i11++;
            }
            return;
        }
        while (i11 < this.f143447l) {
            C31131b c31131b2 = this.f143442g[i11];
            if (c31131b2 != null) {
                this.f143449n.f143425b.mo151283a(c31131b2);
            }
            this.f143442g[i11] = null;
            i11++;
        }
    }

    /* renamed from: a */
    private C31138i m151255a(C31138i.a aVar, String str) {
        C31138i c31138i = (C31138i) this.f143449n.f143426c.mo151284b();
        if (c31138i == null) {
            c31138i = new C31138i(aVar, str);
            c31138i.m151301i(aVar, str);
        } else {
            c31138i.m151299g();
            c31138i.m151301i(aVar, str);
        }
        int i11 = this.f143451p;
        int i12 = f143433w;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f143433w = i13;
            this.f143450o = (C31138i[]) Arrays.copyOf(this.f143450o, i13);
        }
        C31138i[] c31138iArr = this.f143450o;
        int i14 = this.f143451p;
        this.f143451p = i14 + 1;
        c31138iArr[i14] = c31138i;
        return c31138i;
    }

    /* renamed from: l */
    private final void m151256l(C31131b c31131b) {
        int i11;
        if (f143430t && c31131b.f143423f) {
            c31131b.f143418a.m151300h(this, c31131b.f143419b);
        } else {
            C31131b[] c31131bArr = this.f143442g;
            int i12 = this.f143447l;
            c31131bArr[i12] = c31131b;
            C31138i c31138i = c31131b.f143418a;
            c31138i.f143476s = i12;
            this.f143447l = i12 + 1;
            c31138i.m151302j(this, c31131b);
        }
        if (f143430t && this.f143436a) {
            int i13 = 0;
            while (i13 < this.f143447l) {
                if (this.f143442g[i13] == null) {
                    System.out.println("WTF");
                }
                C31131b c31131b2 = this.f143442g[i13];
                if (c31131b2 != null && c31131b2.f143423f) {
                    c31131b2.f143418a.m151300h(this, c31131b2.f143419b);
                    if (f143432v) {
                        this.f143449n.f143424a.mo151283a(c31131b2);
                    } else {
                        this.f143449n.f143425b.mo151283a(c31131b2);
                    }
                    this.f143442g[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.f143447l;
                        if (i14 >= i11) {
                            break;
                        }
                        C31131b[] c31131bArr2 = this.f143442g;
                        int i16 = i14 - 1;
                        C31131b c31131b3 = c31131bArr2[i14];
                        c31131bArr2[i16] = c31131b3;
                        C31138i c31138i2 = c31131b3.f143418a;
                        if (c31138i2.f143476s == i14) {
                            c31138i2.f143476s = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.f143442g[i15] = null;
                    }
                    this.f143447l = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.f143436a = false;
        }
    }

    /* renamed from: n */
    private void m151257n() {
        for (int i11 = 0; i11 < this.f143447l; i11++) {
            C31131b c31131b = this.f143442g[i11];
            c31131b.f143418a.f143478u = c31131b.f143419b;
        }
    }

    /* renamed from: s */
    public static C31131b m151258s(C31133d c31133d, C31138i c31138i, C31138i c31138i2, float f11) {
        return c31133d.m151278r().m151238j(c31138i, c31138i2, f11);
    }

    /* renamed from: u */
    private int m151259u(a aVar) {
        for (int i11 = 0; i11 < this.f143447l; i11++) {
            C31131b c31131b = this.f143442g[i11];
            if (c31131b.f143418a.f143482y != C31138i.a.UNRESTRICTED && c31131b.f143419b < 0.0f) {
                boolean z11 = false;
                int i12 = 0;
                while (!z11) {
                    i12++;
                    float f11 = Float.MAX_VALUE;
                    int i13 = 0;
                    int i14 = -1;
                    int i15 = -1;
                    int i16 = 0;
                    while (true) {
                        if (i13 >= this.f143447l) {
                            break;
                        }
                        C31131b c31131b2 = this.f143442g[i13];
                        if (c31131b2.f143418a.f143482y != C31138i.a.UNRESTRICTED && !c31131b2.f143423f && c31131b2.f143419b < 0.0f) {
                            int i17 = 9;
                            if (f143431u) {
                                int mo151217f = c31131b2.f143422e.mo151217f();
                                int i18 = 0;
                                while (i18 < mo151217f) {
                                    C31138i mo151213b = c31131b2.f143422e.mo151213b(i18);
                                    float mo151219h = c31131b2.f143422e.mo151219h(mo151213b);
                                    if (mo151219h > 0.0f) {
                                        int i19 = 0;
                                        while (i19 < i17) {
                                            float f12 = mo151213b.f143480w[i19] / mo151219h;
                                            if ((f12 < f11 && i19 == i16) || i19 > i16) {
                                                i16 = i19;
                                                i15 = mo151213b.f143475r;
                                                i14 = i13;
                                                f11 = f12;
                                            }
                                            i19++;
                                            i17 = 9;
                                        }
                                    }
                                    i18++;
                                    i17 = 9;
                                }
                            } else {
                                for (int i21 = 1; i21 < this.f143446k; i21++) {
                                    C31138i c31138i = this.f143449n.f143427d[i21];
                                    float mo151219h2 = c31131b2.f143422e.mo151219h(c31138i);
                                    if (mo151219h2 > 0.0f) {
                                        for (int i22 = 0; i22 < 9; i22++) {
                                            float f13 = c31138i.f143480w[i22] / mo151219h2;
                                            if ((f13 < f11 && i22 == i16) || i22 > i16) {
                                                i14 = i13;
                                                i15 = i21;
                                                i16 = i22;
                                                f11 = f13;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i13++;
                    }
                    if (i14 != -1) {
                        C31131b c31131b3 = this.f143442g[i14];
                        c31131b3.f143418a.f143476s = -1;
                        c31131b3.m151250x(this.f143449n.f143427d[i15]);
                        C31138i c31138i2 = c31131b3.f143418a;
                        c31138i2.f143476s = i14;
                        c31138i2.m151302j(this, c31131b3);
                    } else {
                        z11 = true;
                    }
                    if (i12 > this.f143446k / 2) {
                        z11 = true;
                    }
                }
                return i12;
            }
        }
        return 0;
    }

    /* renamed from: w */
    public static AbstractC31134e m151260w() {
        return null;
    }

    /* renamed from: y */
    private void m151261y() {
        int i11 = this.f143440e * 2;
        this.f143440e = i11;
        this.f143442g = (C31131b[]) Arrays.copyOf(this.f143442g, i11);
        C31132c c31132c = this.f143449n;
        c31132c.f143427d = (C31138i[]) Arrays.copyOf(c31132c.f143427d, this.f143440e);
        int i12 = this.f143440e;
        this.f143445j = new boolean[i12];
        this.f143441f = i12;
        this.f143448m = i12;
    }

    /* renamed from: A */
    void m151262A(a aVar) {
        m151259u(aVar);
        m151253B(aVar, false);
        m151257n();
    }

    /* renamed from: D */
    public void m151263D() {
        C31132c c31132c;
        int i11 = 0;
        while (true) {
            c31132c = this.f143449n;
            C31138i[] c31138iArr = c31132c.f143427d;
            if (i11 >= c31138iArr.length) {
                break;
            }
            C31138i c31138i = c31138iArr[i11];
            if (c31138i != null) {
                c31138i.m151299g();
            }
            i11++;
        }
        c31132c.f143426c.mo151285c(this.f143450o, this.f143451p);
        this.f143451p = 0;
        Arrays.fill(this.f143449n.f143427d, (Object) null);
        HashMap hashMap = this.f143438c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f143437b = 0;
        this.f143439d.clear();
        this.f143446k = 1;
        for (int i12 = 0; i12 < this.f143447l; i12++) {
            C31131b c31131b = this.f143442g[i12];
            if (c31131b != null) {
                c31131b.f143420c = false;
            }
        }
        m151254C();
        this.f143447l = 0;
        if (f143432v) {
            this.f143452q = new b(this.f143449n);
        } else {
            this.f143452q = new C31131b(this.f143449n);
        }
    }

    /* renamed from: b */
    public void m151264b(C3186e c3186e, C3186e c3186e2, float f11, int i11) {
        C3185d.b bVar = C3185d.b.LEFT;
        C31138i m151277q = m151277q(c3186e.mo16112q(bVar));
        C3185d.b bVar2 = C3185d.b.TOP;
        C31138i m151277q2 = m151277q(c3186e.mo16112q(bVar2));
        C3185d.b bVar3 = C3185d.b.RIGHT;
        C31138i m151277q3 = m151277q(c3186e.mo16112q(bVar3));
        C3185d.b bVar4 = C3185d.b.BOTTOM;
        C31138i m151277q4 = m151277q(c3186e.mo16112q(bVar4));
        C31138i m151277q5 = m151277q(c3186e2.mo16112q(bVar));
        C31138i m151277q6 = m151277q(c3186e2.mo16112q(bVar2));
        C31138i m151277q7 = m151277q(c3186e2.mo16112q(bVar3));
        C31138i m151277q8 = m151277q(c3186e2.mo16112q(bVar4));
        C31131b m151278r = m151278r();
        double d11 = f11;
        double d12 = i11;
        m151278r.m151245q(m151277q2, m151277q4, m151277q6, m151277q8, (float) (Math.sin(d11) * d12));
        m151266d(m151278r);
        C31131b m151278r2 = m151278r();
        m151278r2.m151245q(m151277q, m151277q3, m151277q5, m151277q7, (float) (Math.cos(d11) * d12));
        m151266d(m151278r2);
    }

    /* renamed from: c */
    public void m151265c(C31138i c31138i, C31138i c31138i2, int i11, float f11, C31138i c31138i3, C31138i c31138i4, int i12, int i13) {
        C31131b m151278r = m151278r();
        m151278r.m151236h(c31138i, c31138i2, i11, f11, c31138i3, c31138i4, i12);
        if (i13 != 8) {
            m151278r.m151232d(this, i13);
        }
        m151266d(m151278r);
    }

    /* renamed from: d */
    public void m151266d(C31131b c31131b) {
        C31138i m151249v;
        if (c31131b == null) {
            return;
        }
        boolean z11 = true;
        if (this.f143447l + 1 >= this.f143448m || this.f143446k + 1 >= this.f143441f) {
            m151261y();
        }
        if (!c31131b.f143423f) {
            c31131b.m151228D(this);
            if (c31131b.isEmpty()) {
                return;
            }
            c31131b.m151246r();
            if (c31131b.m151234f(this)) {
                C31138i m151276p = m151276p();
                c31131b.f143418a = m151276p;
                int i11 = this.f143447l;
                m151256l(c31131b);
                if (this.f143447l == i11 + 1) {
                    this.f143452q.mo151229a(c31131b);
                    m151253B(this.f143452q, true);
                    if (m151276p.f143476s == -1) {
                        if (c31131b.f143418a == m151276p && (m151249v = c31131b.m151249v(m151276p)) != null) {
                            c31131b.m151250x(m151249v);
                        }
                        if (!c31131b.f143423f) {
                            c31131b.f143418a.m151302j(this, c31131b);
                        }
                        if (f143432v) {
                            this.f143449n.f143424a.mo151283a(c31131b);
                        } else {
                            this.f143449n.f143425b.mo151283a(c31131b);
                        }
                        this.f143447l--;
                    }
                    if (!c31131b.m151247s() || z11) {
                        return;
                    }
                }
            }
            z11 = false;
            if (!c31131b.m151247s()) {
                return;
            } else {
                return;
            }
        }
        m151256l(c31131b);
    }

    /* renamed from: e */
    public C31131b m151267e(C31138i c31138i, C31138i c31138i2, int i11, int i12) {
        if (f143429s && i12 == 8 && c31138i2.f143479v && c31138i.f143476s == -1) {
            c31138i.m151300h(this, c31138i2.f143478u + i11);
            return null;
        }
        C31131b m151278r = m151278r();
        m151278r.m151242n(c31138i, c31138i2, i11);
        if (i12 != 8) {
            m151278r.m151232d(this, i12);
        }
        m151266d(m151278r);
        return m151278r;
    }

    /* renamed from: f */
    public void m151268f(C31138i c31138i, int i11) {
        if (f143429s && c31138i.f143476s == -1) {
            float f11 = i11;
            c31138i.m151300h(this, f11);
            for (int i12 = 0; i12 < this.f143437b + 1; i12++) {
                C31138i c31138i2 = this.f143449n.f143427d[i12];
                if (c31138i2 != null && c31138i2.f143469C && c31138i2.f143470D == c31138i.f143475r) {
                    c31138i2.m151300h(this, c31138i2.f143471E + f11);
                }
            }
            return;
        }
        int i13 = c31138i.f143476s;
        if (i13 != -1) {
            C31131b c31131b = this.f143442g[i13];
            if (c31131b.f143423f) {
                c31131b.f143419b = i11;
                return;
            }
            if (c31131b.f143422e.mo151217f() == 0) {
                c31131b.f143423f = true;
                c31131b.f143419b = i11;
                return;
            } else {
                C31131b m151278r = m151278r();
                m151278r.m151241m(c31138i, i11);
                m151266d(m151278r);
                return;
            }
        }
        C31131b m151278r2 = m151278r();
        m151278r2.m151237i(c31138i, i11);
        m151266d(m151278r2);
    }

    /* renamed from: g */
    public void m151269g(C31138i c31138i, C31138i c31138i2, int i11, boolean z11) {
        C31131b m151278r = m151278r();
        C31138i m151279t = m151279t();
        m151279t.f143477t = 0;
        m151278r.m151243o(c31138i, c31138i2, m151279t, i11);
        m151266d(m151278r);
    }

    /* renamed from: h */
    public void m151270h(C31138i c31138i, C31138i c31138i2, int i11, int i12) {
        C31131b m151278r = m151278r();
        C31138i m151279t = m151279t();
        m151279t.f143477t = 0;
        m151278r.m151243o(c31138i, c31138i2, m151279t, i11);
        if (i12 != 8) {
            m151274m(m151278r, (int) (m151278r.f143422e.mo151219h(m151279t) * (-1.0f)), i12);
        }
        m151266d(m151278r);
    }

    /* renamed from: i */
    public void m151271i(C31138i c31138i, C31138i c31138i2, int i11, boolean z11) {
        C31131b m151278r = m151278r();
        C31138i m151279t = m151279t();
        m151279t.f143477t = 0;
        m151278r.m151244p(c31138i, c31138i2, m151279t, i11);
        m151266d(m151278r);
    }

    /* renamed from: j */
    public void m151272j(C31138i c31138i, C31138i c31138i2, int i11, int i12) {
        C31131b m151278r = m151278r();
        C31138i m151279t = m151279t();
        m151279t.f143477t = 0;
        m151278r.m151244p(c31138i, c31138i2, m151279t, i11);
        if (i12 != 8) {
            m151274m(m151278r, (int) (m151278r.f143422e.mo151219h(m151279t) * (-1.0f)), i12);
        }
        m151266d(m151278r);
    }

    /* renamed from: k */
    public void m151273k(C31138i c31138i, C31138i c31138i2, C31138i c31138i3, C31138i c31138i4, float f11, int i11) {
        C31131b m151278r = m151278r();
        m151278r.m151239k(c31138i, c31138i2, c31138i3, c31138i4, f11);
        if (i11 != 8) {
            m151278r.m151232d(this, i11);
        }
        m151266d(m151278r);
    }

    /* renamed from: m */
    void m151274m(C31131b c31131b, int i11, int i12) {
        c31131b.m151233e(m151275o(i12, null), i11);
    }

    /* renamed from: o */
    public C31138i m151275o(int i11, String str) {
        if (this.f143446k + 1 >= this.f143441f) {
            m151261y();
        }
        C31138i m151255a = m151255a(C31138i.a.ERROR, str);
        int i12 = this.f143437b + 1;
        this.f143437b = i12;
        this.f143446k++;
        m151255a.f143475r = i12;
        m151255a.f143477t = i11;
        this.f143449n.f143427d[i12] = m151255a;
        this.f143439d.mo151231c(m151255a);
        return m151255a;
    }

    /* renamed from: p */
    public C31138i m151276p() {
        if (this.f143446k + 1 >= this.f143441f) {
            m151261y();
        }
        C31138i m151255a = m151255a(C31138i.a.SLACK, null);
        int i11 = this.f143437b + 1;
        this.f143437b = i11;
        this.f143446k++;
        m151255a.f143475r = i11;
        this.f143449n.f143427d[i11] = m151255a;
        return m151255a;
    }

    /* renamed from: q */
    public C31138i m151277q(Object obj) {
        C31138i c31138i = null;
        if (obj == null) {
            return null;
        }
        if (this.f143446k + 1 >= this.f143441f) {
            m151261y();
        }
        if (obj instanceof C3185d) {
            C3185d c3185d = (C3185d) obj;
            c31138i = c3185d.m16006i();
            if (c31138i == null) {
                c3185d.m16016s(this.f143449n);
                c31138i = c3185d.m16006i();
            }
            int i11 = c31138i.f143475r;
            if (i11 == -1 || i11 > this.f143437b || this.f143449n.f143427d[i11] == null) {
                if (i11 != -1) {
                    c31138i.m151299g();
                }
                int i12 = this.f143437b + 1;
                this.f143437b = i12;
                this.f143446k++;
                c31138i.f143475r = i12;
                c31138i.f143482y = C31138i.a.UNRESTRICTED;
                this.f143449n.f143427d[i12] = c31138i;
            }
        }
        return c31138i;
    }

    /* renamed from: r */
    public C31131b m151278r() {
        C31131b c31131b;
        if (f143432v) {
            c31131b = (C31131b) this.f143449n.f143424a.mo151284b();
            if (c31131b == null) {
                c31131b = new b(this.f143449n);
                f143435y++;
            } else {
                c31131b.m151251y();
            }
        } else {
            c31131b = (C31131b) this.f143449n.f143425b.mo151284b();
            if (c31131b == null) {
                c31131b = new C31131b(this.f143449n);
                f143434x++;
            } else {
                c31131b.m151251y();
            }
        }
        C31138i.m151295d();
        return c31131b;
    }

    /* renamed from: t */
    public C31138i m151279t() {
        if (this.f143446k + 1 >= this.f143441f) {
            m151261y();
        }
        C31138i m151255a = m151255a(C31138i.a.SLACK, null);
        int i11 = this.f143437b + 1;
        this.f143437b = i11;
        this.f143446k++;
        m151255a.f143475r = i11;
        this.f143449n.f143427d[i11] = m151255a;
        return m151255a;
    }

    /* renamed from: v */
    public C31132c m151280v() {
        return this.f143449n;
    }

    /* renamed from: x */
    public int m151281x(Object obj) {
        C31138i m16006i = ((C3185d) obj).m16006i();
        if (m16006i != null) {
            return (int) (m16006i.f143478u + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void m151282z() {
        if (this.f143439d.isEmpty()) {
            m151257n();
            return;
        }
        if (!this.f143443h && !this.f143444i) {
            m151262A(this.f143439d);
            return;
        }
        for (int i11 = 0; i11 < this.f143447l; i11++) {
            if (!this.f143442g[i11].f143423f) {
                m151262A(this.f143439d);
                return;
            }
        }
        m151257n();
    }
}
