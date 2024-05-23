package p088d1;

import java.util.ArrayList;
import p045c1.AbstractC3192k;
import p045c1.AbstractC3194m;
import p045c1.C3182a;
import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3189h;
import p045c1.InterfaceC3190i;
import p700z0.C31133d;

/* renamed from: d1.b */
/* loaded from: classes2.dex */
public class C17693b {

    /* renamed from: a */
    private final ArrayList f89696a = new ArrayList();

    /* renamed from: b */
    private a f89697b = new a();

    /* renamed from: c */
    private C3187f f89698c;

    /* renamed from: d1.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: k */
        public static int f89699k = 0;

        /* renamed from: l */
        public static int f89700l = 1;

        /* renamed from: m */
        public static int f89701m = 2;

        /* renamed from: a */
        public C3186e.b f89702a;

        /* renamed from: b */
        public C3186e.b f89703b;

        /* renamed from: c */
        public int f89704c;

        /* renamed from: d */
        public int f89705d;

        /* renamed from: e */
        public int f89706e;

        /* renamed from: f */
        public int f89707f;

        /* renamed from: g */
        public int f89708g;

        /* renamed from: h */
        public boolean f89709h;

        /* renamed from: i */
        public boolean f89710i;

        /* renamed from: j */
        public int f89711j;
    }

    /* renamed from: d1.b$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo6392a();

        /* renamed from: b */
        void mo6393b(C3186e c3186e, a aVar);
    }

    public C17693b(C3187f c3187f) {
        this.f89698c = c3187f;
    }

    /* renamed from: a */
    private boolean m93708a(b bVar, C3186e c3186e, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.f89697b.f89702a = c3186e.m16029C();
        this.f89697b.f89703b = c3186e.m16064V();
        this.f89697b.f89704c = c3186e.m16070Y();
        this.f89697b.f89705d = c3186e.m16133z();
        a aVar = this.f89697b;
        aVar.f89710i = false;
        aVar.f89711j = i11;
        C3186e.b bVar2 = aVar.f89702a;
        C3186e.b bVar3 = C3186e.b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (aVar.f89703b == bVar3) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && c3186e.f13532f0 > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && c3186e.f13532f0 > 0.0f) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && c3186e.f13569y[0] == 4) {
            aVar.f89702a = C3186e.b.FIXED;
        }
        if (z14 && c3186e.f13569y[1] == 4) {
            aVar.f89703b = C3186e.b.FIXED;
        }
        bVar.mo6393b(c3186e, aVar);
        c3186e.m16106n1(this.f89697b.f89706e);
        c3186e.m16053O0(this.f89697b.f89707f);
        c3186e.m16051N0(this.f89697b.f89709h);
        c3186e.m16031D0(this.f89697b.f89708g);
        a aVar2 = this.f89697b;
        aVar2.f89711j = a.f89699k;
        return aVar2.f89710i;
    }

    /* renamed from: b */
    private void m93709b(C3187f c3187f) {
        boolean z11;
        C17703l c17703l;
        C17705n c17705n;
        int size = c3187f.f13678U0.size();
        boolean m16158W1 = c3187f.m16158W1(64);
        b m16148L1 = c3187f.m16148L1();
        for (int i11 = 0; i11 < size; i11++) {
            C3186e c3186e = (C3186e) c3187f.f13678U0.get(i11);
            if (!(c3186e instanceof C3189h) && !(c3186e instanceof C3182a) && !c3186e.m16105n0() && (!m16158W1 || (c17703l = c3186e.f13529e) == null || (c17705n = c3186e.f13531f) == null || !c17703l.f89780e.f89732j || !c17705n.f89780e.f89732j)) {
                C3186e.b m16127w = c3186e.m16127w(0);
                boolean z12 = true;
                C3186e.b m16127w2 = c3186e.m16127w(1);
                C3186e.b bVar = C3186e.b.MATCH_CONSTRAINT;
                if (m16127w == bVar && c3186e.f13565w != 1 && m16127w2 == bVar && c3186e.f13567x != 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && c3187f.m16158W1(1) && !(c3186e instanceof AbstractC3194m)) {
                    if (m16127w == bVar && c3186e.f13565w == 0 && m16127w2 != bVar && !c3186e.m16097k0()) {
                        z11 = true;
                    }
                    if (m16127w2 != bVar || c3186e.f13567x != 0 || m16127w == bVar || c3186e.m16097k0()) {
                        z12 = z11;
                    }
                    if ((m16127w != bVar && m16127w2 != bVar) || c3186e.f13532f0 <= 0.0f) {
                        z11 = z12;
                    }
                }
                if (!z11) {
                    m93708a(m16148L1, c3186e, a.f89699k);
                }
            }
        }
        m16148L1.mo6392a();
    }

    /* renamed from: c */
    private void m93710c(C3187f c3187f, String str, int i11, int i12, int i13) {
        int m16044K = c3187f.m16044K();
        int m16042J = c3187f.m16042J();
        c3187f.m16081d1(0);
        c3187f.m16079c1(0);
        c3187f.m16106n1(i12);
        c3187f.m16053O0(i13);
        c3187f.m16081d1(m16044K);
        c3187f.m16079c1(m16042J);
        this.f89698c.m16161a2(i11);
        this.f89698c.mo16165v1();
    }

    /* renamed from: d */
    public long m93711d(C3187f c3187f, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        boolean z11;
        int i21;
        C3187f c3187f2;
        int i22;
        boolean z12;
        int i23;
        int i24;
        boolean z13;
        C17693b c17693b = this;
        b m16148L1 = c3187f.m16148L1();
        int size = c3187f.f13678U0.size();
        int m16070Y = c3187f.m16070Y();
        int m16133z = c3187f.m16133z();
        boolean m16241b = AbstractC3192k.m16241b(i11, 128);
        boolean z14 = m16241b || AbstractC3192k.m16241b(i11, 64);
        if (z14) {
            for (int i25 = 0; i25 < size; i25++) {
                C3186e c3186e = (C3186e) c3187f.f13678U0.get(i25);
                C3186e.b m16029C = c3186e.m16029C();
                C3186e.b bVar = C3186e.b.MATCH_CONSTRAINT;
                boolean z15 = (m16029C == bVar) && (c3186e.m16064V() == bVar) && c3186e.m16129x() > 0.0f;
                if ((c3186e.m16097k0() && z15) || ((c3186e.m16103m0() && z15) || (c3186e instanceof AbstractC3194m) || c3186e.m16097k0() || c3186e.m16103m0())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            boolean z16 = C31133d.f143428r;
        }
        boolean z17 = z14 & ((i14 == 1073741824 && i16 == 1073741824) || m16241b);
        if (z17) {
            int min = Math.min(c3187f.m16040I(), i15);
            int min2 = Math.min(c3187f.m16038H(), i17);
            if (i14 == 1073741824 && c3187f.m16070Y() != min) {
                c3187f.m16106n1(min);
                c3187f.m16152P1();
            }
            if (i16 == 1073741824 && c3187f.m16133z() != min2) {
                c3187f.m16053O0(min2);
                c3187f.m16152P1();
            }
            if (i14 == 1073741824 && i16 == 1073741824) {
                z11 = c3187f.m16145I1(m16241b);
                i21 = 2;
            } else {
                boolean m16146J1 = c3187f.m16146J1(m16241b);
                if (i14 == 1073741824) {
                    m16146J1 &= c3187f.m16147K1(m16241b, 0);
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                if (i16 == 1073741824) {
                    z11 = c3187f.m16147K1(m16241b, 1) & m16146J1;
                    i21++;
                } else {
                    z11 = m16146J1;
                }
            }
            if (z11) {
                c3187f.mo16119s1(i14 == 1073741824, i16 == 1073741824);
            }
        } else {
            z11 = false;
            i21 = 0;
        }
        if (z11 && i21 == 2) {
            return 0L;
        }
        int m16149M1 = c3187f.m16149M1();
        if (size > 0) {
            m93709b(c3187f);
        }
        m93712e(c3187f);
        int size2 = c17693b.f89696a.size();
        if (size > 0) {
            m93710c(c3187f, "First pass", 0, m16070Y, m16133z);
        }
        if (size2 > 0) {
            C3186e.b m16029C2 = c3187f.m16029C();
            C3186e.b bVar2 = C3186e.b.WRAP_CONTENT;
            boolean z18 = m16029C2 == bVar2;
            boolean z19 = c3187f.m16064V() == bVar2;
            int max = Math.max(c3187f.m16070Y(), c17693b.f89698c.m16044K());
            int max2 = Math.max(c3187f.m16133z(), c17693b.f89698c.m16042J());
            int i26 = 0;
            boolean z21 = false;
            while (i26 < size2) {
                C3186e c3186e2 = (C3186e) c17693b.f89696a.get(i26);
                if (c3186e2 instanceof AbstractC3194m) {
                    int m16070Y2 = c3186e2.m16070Y();
                    int m16133z2 = c3186e2.m16133z();
                    i24 = m16149M1;
                    boolean m93708a = c17693b.m93708a(m16148L1, c3186e2, a.f89700l) | z21;
                    int m16070Y3 = c3186e2.m16070Y();
                    int m16133z3 = c3186e2.m16133z();
                    if (m16070Y3 != m16070Y2) {
                        c3186e2.m16106n1(m16070Y3);
                        if (z18 && c3186e2.m16052O() > max) {
                            max = Math.max(max, c3186e2.m16052O() + c3186e2.mo16112q(C3185d.b.RIGHT).m16003f());
                        }
                        z13 = true;
                    } else {
                        z13 = m93708a;
                    }
                    if (m16133z3 != m16133z2) {
                        c3186e2.m16053O0(m16133z3);
                        if (z19 && c3186e2.m16120t() > max2) {
                            max2 = Math.max(max2, c3186e2.m16120t() + c3186e2.mo16112q(C3185d.b.BOTTOM).m16003f());
                        }
                        z13 = true;
                    }
                    z21 = z13 | ((AbstractC3194m) c3186e2).m16249I1();
                } else {
                    i24 = m16149M1;
                }
                i26++;
                m16149M1 = i24;
            }
            int i27 = m16149M1;
            int i28 = 2;
            int i29 = 0;
            while (i29 < i28) {
                int i31 = 0;
                while (i31 < size2) {
                    C3186e c3186e3 = (C3186e) c17693b.f89696a.get(i31);
                    if (((c3186e3 instanceof InterfaceC3190i) && !(c3186e3 instanceof AbstractC3194m)) || (c3186e3 instanceof C3189h) || c3186e3.m16068X() == 8 || ((z17 && c3186e3.f13529e.f89780e.f89732j && c3186e3.f13531f.f89780e.f89732j) || (c3186e3 instanceof AbstractC3194m))) {
                        z12 = z17;
                        i23 = size2;
                    } else {
                        int m16070Y4 = c3186e3.m16070Y();
                        int m16133z4 = c3186e3.m16133z();
                        z12 = z17;
                        int m16114r = c3186e3.m16114r();
                        int i32 = a.f89700l;
                        i23 = size2;
                        if (i29 == 1) {
                            i32 = a.f89701m;
                        }
                        boolean m93708a2 = c17693b.m93708a(m16148L1, c3186e3, i32) | z21;
                        int m16070Y5 = c3186e3.m16070Y();
                        int m16133z5 = c3186e3.m16133z();
                        if (m16070Y5 != m16070Y4) {
                            c3186e3.m16106n1(m16070Y5);
                            if (z18 && c3186e3.m16052O() > max) {
                                max = Math.max(max, c3186e3.m16052O() + c3186e3.mo16112q(C3185d.b.RIGHT).m16003f());
                            }
                            m93708a2 = true;
                        }
                        if (m16133z5 != m16133z4) {
                            c3186e3.m16053O0(m16133z5);
                            if (z19 && c3186e3.m16120t() > max2) {
                                max2 = Math.max(max2, c3186e3.m16120t() + c3186e3.mo16112q(C3185d.b.BOTTOM).m16003f());
                            }
                            m93708a2 = true;
                        }
                        z21 = (!c3186e3.m16076b0() || m16114r == c3186e3.m16114r()) ? m93708a2 : true;
                    }
                    i31++;
                    c17693b = this;
                    z17 = z12;
                    size2 = i23;
                }
                boolean z22 = z17;
                int i33 = size2;
                if (!z21) {
                    break;
                }
                i29++;
                m93710c(c3187f, "intermediate pass", i29, m16070Y, m16133z);
                c17693b = this;
                z17 = z22;
                size2 = i33;
                i28 = 2;
                z21 = false;
            }
            c3187f2 = c3187f;
            i22 = i27;
        } else {
            c3187f2 = c3187f;
            i22 = m16149M1;
        }
        c3187f2.m16160Z1(i22);
        return 0L;
    }

    /* renamed from: e */
    public void m93712e(C3187f c3187f) {
        this.f89696a.clear();
        int size = c3187f.f13678U0.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3186e c3186e = (C3186e) c3187f.f13678U0.get(i11);
            C3186e.b m16029C = c3186e.m16029C();
            C3186e.b bVar = C3186e.b.MATCH_CONSTRAINT;
            if (m16029C == bVar || c3186e.m16064V() == bVar) {
                this.f89696a.add(c3186e);
            }
        }
        c3187f.m16152P1();
    }
}
