package p088d1;

import java.util.ArrayList;
import java.util.Iterator;
import p045c1.C3182a;
import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3189h;
import p088d1.C17693b;

/* renamed from: d1.h */
/* loaded from: classes2.dex */
public abstract class AbstractC17699h {

    /* renamed from: a */
    private static C17693b.a f89745a = new C17693b.a();

    /* renamed from: b */
    private static int f89746b = 0;

    /* renamed from: c */
    private static int f89747c = 0;

    /* renamed from: a */
    private static boolean m93739a(int i11, C3186e c3186e) {
        C3187f c3187f;
        boolean z11;
        boolean z12;
        C3186e.b bVar;
        C3186e.b bVar2;
        C3186e.b m16029C = c3186e.m16029C();
        C3186e.b m16064V = c3186e.m16064V();
        if (c3186e.m16048M() != null) {
            c3187f = (C3187f) c3186e.m16048M();
        } else {
            c3187f = null;
        }
        if (c3187f != null) {
            c3187f.m16029C();
            C3186e.b bVar3 = C3186e.b.FIXED;
        }
        if (c3187f != null) {
            c3187f.m16064V();
            C3186e.b bVar4 = C3186e.b.FIXED;
        }
        C3186e.b bVar5 = C3186e.b.FIXED;
        if (m16029C != bVar5 && !c3186e.mo15987p0() && m16029C != C3186e.b.WRAP_CONTENT && ((m16029C != (bVar2 = C3186e.b.MATCH_CONSTRAINT) || c3186e.f13565w != 0 || c3186e.f13532f0 != 0.0f || !c3186e.m16078c0(0)) && (m16029C != bVar2 || c3186e.f13565w != 1 || !c3186e.m16086f0(0, c3186e.m16070Y())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (m16064V != bVar5 && !c3186e.mo15988q0() && m16064V != C3186e.b.WRAP_CONTENT && ((m16064V != (bVar = C3186e.b.MATCH_CONSTRAINT) || c3186e.f13567x != 0 || c3186e.f13532f0 != 0.0f || !c3186e.m16078c0(1)) && (m16064V != bVar || c3186e.f13567x != 1 || !c3186e.m16086f0(1, c3186e.m16133z())))) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (c3186e.f13532f0 > 0.0f && (z11 || z12)) {
            return true;
        }
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m93740b(int i11, C3186e c3186e, C17693b.b bVar, boolean z11) {
        boolean z12;
        C3185d c3185d;
        C3185d c3185d2;
        boolean z13;
        C3185d c3185d3;
        C3185d c3185d4;
        if (c3186e.m16091i0()) {
            return;
        }
        f89746b++;
        if (!(c3186e instanceof C3187f) && c3186e.m16108o0()) {
            int i12 = i11 + 1;
            if (m93739a(i12, c3186e)) {
                C3187f.m16139V1(i12, c3186e, bVar, new C17693b.a(), C17693b.a.f89699k);
            }
        }
        C3185d mo16112q = c3186e.mo16112q(C3185d.b.LEFT);
        C3185d mo16112q2 = c3186e.mo16112q(C3185d.b.RIGHT);
        int m16002e = mo16112q.m16002e();
        int m16002e2 = mo16112q2.m16002e();
        if (mo16112q.m16001d() != null && mo16112q.m16011n()) {
            Iterator it = mo16112q.m16001d().iterator();
            while (it.hasNext()) {
                C3185d c3185d5 = (C3185d) it.next();
                C3186e c3186e2 = c3185d5.f13458d;
                int i13 = i11 + 1;
                boolean m93739a = m93739a(i13, c3186e2);
                if (c3186e2.m16108o0() && m93739a) {
                    C3187f.m16139V1(i13, c3186e2, bVar, new C17693b.a(), C17693b.a.f89699k);
                }
                if ((c3185d5 == c3186e2.f13508Q && (c3185d4 = c3186e2.f13512S.f13460f) != null && c3185d4.m16011n()) || (c3185d5 == c3186e2.f13512S && (c3185d3 = c3186e2.f13508Q.f13460f) != null && c3185d3.m16011n())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C3186e.b m16029C = c3186e2.m16029C();
                C3186e.b bVar2 = C3186e.b.MATCH_CONSTRAINT;
                if (m16029C == bVar2 && !m93739a) {
                    if (c3186e2.m16029C() == bVar2 && c3186e2.f13476A >= 0 && c3186e2.f13571z >= 0 && ((c3186e2.m16068X() == 8 || (c3186e2.f13565w == 0 && c3186e2.m16129x() == 0.0f)) && !c3186e2.m16097k0() && !c3186e2.m16105n0() && z13 && !c3186e2.m16097k0())) {
                        m93743e(i13, c3186e, bVar, c3186e2, z11);
                    }
                } else if (!c3186e2.m16108o0()) {
                    C3185d c3185d6 = c3186e2.f13508Q;
                    if (c3185d5 == c3185d6 && c3186e2.f13512S.f13460f == null) {
                        int m16003f = c3185d6.m16003f() + m16002e;
                        c3186e2.m16041I0(m16003f, c3186e2.m16070Y() + m16003f);
                        m93740b(i13, c3186e2, bVar, z11);
                    } else {
                        C3185d c3185d7 = c3186e2.f13512S;
                        if (c3185d5 == c3185d7 && c3185d6.f13460f == null) {
                            int m16003f2 = m16002e - c3185d7.m16003f();
                            c3186e2.m16041I0(m16003f2 - c3186e2.m16070Y(), m16003f2);
                            m93740b(i13, c3186e2, bVar, z11);
                        } else if (z13 && !c3186e2.m16097k0()) {
                            m93742d(i13, bVar, c3186e2, z11);
                        }
                    }
                }
            }
        }
        if (c3186e instanceof C3189h) {
            return;
        }
        if (mo16112q2.m16001d() != null && mo16112q2.m16011n()) {
            Iterator it2 = mo16112q2.m16001d().iterator();
            while (it2.hasNext()) {
                C3185d c3185d8 = (C3185d) it2.next();
                C3186e c3186e3 = c3185d8.f13458d;
                int i14 = i11 + 1;
                boolean m93739a2 = m93739a(i14, c3186e3);
                if (c3186e3.m16108o0() && m93739a2) {
                    C3187f.m16139V1(i14, c3186e3, bVar, new C17693b.a(), C17693b.a.f89699k);
                }
                if ((c3185d8 == c3186e3.f13508Q && (c3185d2 = c3186e3.f13512S.f13460f) != null && c3185d2.m16011n()) || (c3185d8 == c3186e3.f13512S && (c3185d = c3186e3.f13508Q.f13460f) != null && c3185d.m16011n())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C3186e.b m16029C2 = c3186e3.m16029C();
                C3186e.b bVar3 = C3186e.b.MATCH_CONSTRAINT;
                if (m16029C2 == bVar3 && !m93739a2) {
                    if (c3186e3.m16029C() == bVar3 && c3186e3.f13476A >= 0 && c3186e3.f13571z >= 0 && (c3186e3.m16068X() == 8 || (c3186e3.f13565w == 0 && c3186e3.m16129x() == 0.0f))) {
                        if (!c3186e3.m16097k0() && !c3186e3.m16105n0() && z12 && !c3186e3.m16097k0()) {
                            m93743e(i14, c3186e, bVar, c3186e3, z11);
                        }
                    }
                } else if (!c3186e3.m16108o0()) {
                    C3185d c3185d9 = c3186e3.f13508Q;
                    if (c3185d8 == c3185d9 && c3186e3.f13512S.f13460f == null) {
                        int m16003f3 = c3185d9.m16003f() + m16002e2;
                        c3186e3.m16041I0(m16003f3, c3186e3.m16070Y() + m16003f3);
                        m93740b(i14, c3186e3, bVar, z11);
                    } else {
                        C3185d c3185d10 = c3186e3.f13512S;
                        if (c3185d8 == c3185d10 && c3185d9.f13460f == null) {
                            int m16003f4 = m16002e2 - c3185d10.m16003f();
                            c3186e3.m16041I0(m16003f4 - c3186e3.m16070Y(), m16003f4);
                            m93740b(i14, c3186e3, bVar, z11);
                        } else if (z12 && !c3186e3.m16097k0()) {
                            m93742d(i14, bVar, c3186e3, z11);
                        }
                    }
                }
            }
        }
        c3186e.m16118s0();
    }

    /* renamed from: c */
    private static void m93741c(int i11, C3182a c3182a, C17693b.b bVar, int i12, boolean z11) {
        if (c3182a.m15989w1()) {
            if (i12 == 0) {
                m93740b(i11 + 1, c3182a, bVar, z11);
            } else {
                m93747i(i11 + 1, c3182a, bVar);
            }
        }
    }

    /* renamed from: d */
    private static void m93742d(int i11, C17693b.b bVar, C3186e c3186e, boolean z11) {
        float f11;
        float m16027A = c3186e.m16027A();
        int m16002e = c3186e.f13508Q.f13460f.m16002e();
        int m16002e2 = c3186e.f13512S.f13460f.m16002e();
        int m16003f = c3186e.f13508Q.m16003f() + m16002e;
        int m16003f2 = m16002e2 - c3186e.f13512S.m16003f();
        if (m16002e == m16002e2) {
            m16027A = 0.5f;
        } else {
            m16002e = m16003f;
            m16002e2 = m16003f2;
        }
        int m16070Y = c3186e.m16070Y();
        int i12 = (m16002e2 - m16002e) - m16070Y;
        if (m16002e > m16002e2) {
            i12 = (m16002e - m16002e2) - m16070Y;
        }
        if (i12 > 0) {
            f11 = (m16027A * i12) + 0.5f;
        } else {
            f11 = m16027A * i12;
        }
        int i13 = ((int) f11) + m16002e;
        int i14 = i13 + m16070Y;
        if (m16002e > m16002e2) {
            i14 = i13 - m16070Y;
        }
        c3186e.m16041I0(i13, i14);
        m93740b(i11 + 1, c3186e, bVar, z11);
    }

    /* renamed from: e */
    private static void m93743e(int i11, C3186e c3186e, C17693b.b bVar, C3186e c3186e2, boolean z11) {
        int m16070Y;
        float m16027A = c3186e2.m16027A();
        int m16002e = c3186e2.f13508Q.f13460f.m16002e() + c3186e2.f13508Q.m16003f();
        int m16002e2 = c3186e2.f13512S.f13460f.m16002e() - c3186e2.f13512S.m16003f();
        if (m16002e2 >= m16002e) {
            int m16070Y2 = c3186e2.m16070Y();
            if (c3186e2.m16068X() != 8) {
                int i12 = c3186e2.f13565w;
                if (i12 == 2) {
                    if (c3186e instanceof C3187f) {
                        m16070Y = c3186e.m16070Y();
                    } else {
                        m16070Y = c3186e.m16048M().m16070Y();
                    }
                    m16070Y2 = (int) (c3186e2.m16027A() * 0.5f * m16070Y);
                } else if (i12 == 0) {
                    m16070Y2 = m16002e2 - m16002e;
                }
                m16070Y2 = Math.max(c3186e2.f13571z, m16070Y2);
                int i13 = c3186e2.f13476A;
                if (i13 > 0) {
                    m16070Y2 = Math.min(i13, m16070Y2);
                }
            }
            int i14 = m16002e + ((int) ((m16027A * ((m16002e2 - m16002e) - m16070Y2)) + 0.5f));
            c3186e2.m16041I0(i14, m16070Y2 + i14);
            m93740b(i11 + 1, c3186e2, bVar, z11);
        }
    }

    /* renamed from: f */
    private static void m93744f(int i11, C17693b.b bVar, C3186e c3186e) {
        float f11;
        float m16060T = c3186e.m16060T();
        int m16002e = c3186e.f13510R.f13460f.m16002e();
        int m16002e2 = c3186e.f13514T.f13460f.m16002e();
        int m16003f = c3186e.f13510R.m16003f() + m16002e;
        int m16003f2 = m16002e2 - c3186e.f13514T.m16003f();
        if (m16002e == m16002e2) {
            m16060T = 0.5f;
        } else {
            m16002e = m16003f;
            m16002e2 = m16003f2;
        }
        int m16133z = c3186e.m16133z();
        int i12 = (m16002e2 - m16002e) - m16133z;
        if (m16002e > m16002e2) {
            i12 = (m16002e - m16002e2) - m16133z;
        }
        if (i12 > 0) {
            f11 = (m16060T * i12) + 0.5f;
        } else {
            f11 = m16060T * i12;
        }
        int i13 = (int) f11;
        int i14 = m16002e + i13;
        int i15 = i14 + m16133z;
        if (m16002e > m16002e2) {
            i14 = m16002e - i13;
            i15 = i14 - m16133z;
        }
        c3186e.m16047L0(i14, i15);
        m93747i(i11 + 1, c3186e, bVar);
    }

    /* renamed from: g */
    private static void m93745g(int i11, C3186e c3186e, C17693b.b bVar, C3186e c3186e2) {
        int m16133z;
        float m16060T = c3186e2.m16060T();
        int m16002e = c3186e2.f13510R.f13460f.m16002e() + c3186e2.f13510R.m16003f();
        int m16002e2 = c3186e2.f13514T.f13460f.m16002e() - c3186e2.f13514T.m16003f();
        if (m16002e2 >= m16002e) {
            int m16133z2 = c3186e2.m16133z();
            if (c3186e2.m16068X() != 8) {
                int i12 = c3186e2.f13567x;
                if (i12 == 2) {
                    if (c3186e instanceof C3187f) {
                        m16133z = c3186e.m16133z();
                    } else {
                        m16133z = c3186e.m16048M().m16133z();
                    }
                    m16133z2 = (int) (m16060T * 0.5f * m16133z);
                } else if (i12 == 0) {
                    m16133z2 = m16002e2 - m16002e;
                }
                m16133z2 = Math.max(c3186e2.f13480C, m16133z2);
                int i13 = c3186e2.f13482D;
                if (i13 > 0) {
                    m16133z2 = Math.min(i13, m16133z2);
                }
            }
            int i14 = m16002e + ((int) ((m16060T * ((m16002e2 - m16002e) - m16133z2)) + 0.5f));
            c3186e2.m16047L0(i14, m16133z2 + i14);
            m93747i(i11 + 1, c3186e2, bVar);
        }
    }

    /* renamed from: h */
    public static void m93746h(C3187f c3187f, C17693b.b bVar) {
        C3186e.b m16029C = c3187f.m16029C();
        C3186e.b m16064V = c3187f.m16064V();
        f89746b = 0;
        f89747c = 0;
        c3187f.m16132y0();
        ArrayList m16264u1 = c3187f.m16264u1();
        int size = m16264u1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C3186e) m16264u1.get(i11)).m16132y0();
        }
        boolean m16155S1 = c3187f.m16155S1();
        if (m16029C == C3186e.b.FIXED) {
            c3187f.m16041I0(0, c3187f.m16070Y());
        } else {
            c3187f.m16043J0(0);
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            C3186e c3186e = (C3186e) m16264u1.get(i12);
            if (c3186e instanceof C3189h) {
                C3189h c3189h = (C3189h) c3186e;
                if (c3189h.m16230v1() == 1) {
                    if (c3189h.m16231w1() != -1) {
                        c3189h.m16234z1(c3189h.m16231w1());
                    } else if (c3189h.m16232x1() != -1 && c3187f.mo15987p0()) {
                        c3189h.m16234z1(c3187f.m16070Y() - c3189h.m16232x1());
                    } else if (c3187f.mo15987p0()) {
                        c3189h.m16234z1((int) ((c3189h.m16233y1() * c3187f.m16070Y()) + 0.5f));
                    }
                    z11 = true;
                }
            } else if ((c3186e instanceof C3182a) && ((C3182a) c3186e).m15979A1() == 0) {
                z12 = true;
            }
        }
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C3186e c3186e2 = (C3186e) m16264u1.get(i13);
                if (c3186e2 instanceof C3189h) {
                    C3189h c3189h2 = (C3189h) c3186e2;
                    if (c3189h2.m16230v1() == 1) {
                        m93740b(0, c3189h2, bVar, m16155S1);
                    }
                }
            }
        }
        m93740b(0, c3187f, bVar, m16155S1);
        if (z12) {
            for (int i14 = 0; i14 < size; i14++) {
                C3186e c3186e3 = (C3186e) m16264u1.get(i14);
                if (c3186e3 instanceof C3182a) {
                    C3182a c3182a = (C3182a) c3186e3;
                    if (c3182a.m15979A1() == 0) {
                        m93741c(0, c3182a, bVar, 0, m16155S1);
                    }
                }
            }
        }
        if (m16064V == C3186e.b.FIXED) {
            c3187f.m16047L0(0, c3187f.m16133z());
        } else {
            c3187f.m16045K0(0);
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            C3186e c3186e4 = (C3186e) m16264u1.get(i15);
            if (c3186e4 instanceof C3189h) {
                C3189h c3189h3 = (C3189h) c3186e4;
                if (c3189h3.m16230v1() == 0) {
                    if (c3189h3.m16231w1() != -1) {
                        c3189h3.m16234z1(c3189h3.m16231w1());
                    } else if (c3189h3.m16232x1() != -1 && c3187f.mo15988q0()) {
                        c3189h3.m16234z1(c3187f.m16133z() - c3189h3.m16232x1());
                    } else if (c3187f.mo15988q0()) {
                        c3189h3.m16234z1((int) ((c3189h3.m16233y1() * c3187f.m16133z()) + 0.5f));
                    }
                    z13 = true;
                }
            } else if ((c3186e4 instanceof C3182a) && ((C3182a) c3186e4).m15979A1() == 1) {
                z14 = true;
            }
        }
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                C3186e c3186e5 = (C3186e) m16264u1.get(i16);
                if (c3186e5 instanceof C3189h) {
                    C3189h c3189h4 = (C3189h) c3186e5;
                    if (c3189h4.m16230v1() == 0) {
                        m93747i(1, c3189h4, bVar);
                    }
                }
            }
        }
        m93747i(0, c3187f, bVar);
        if (z14) {
            for (int i17 = 0; i17 < size; i17++) {
                C3186e c3186e6 = (C3186e) m16264u1.get(i17);
                if (c3186e6 instanceof C3182a) {
                    C3182a c3182a2 = (C3182a) c3186e6;
                    if (c3182a2.m15979A1() == 1) {
                        m93741c(0, c3182a2, bVar, 1, m16155S1);
                    }
                }
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            C3186e c3186e7 = (C3186e) m16264u1.get(i18);
            if (c3186e7.m16108o0() && m93739a(0, c3186e7)) {
                C3187f.m16139V1(0, c3186e7, bVar, f89745a, C17693b.a.f89699k);
                if (c3186e7 instanceof C3189h) {
                    if (((C3189h) c3186e7).m16230v1() == 0) {
                        m93747i(0, c3186e7, bVar);
                    } else {
                        m93740b(0, c3186e7, bVar, m16155S1);
                    }
                } else {
                    m93740b(0, c3186e7, bVar, m16155S1);
                    m93747i(0, c3186e7, bVar);
                }
            }
        }
    }

    /* renamed from: i */
    private static void m93747i(int i11, C3186e c3186e, C17693b.b bVar) {
        boolean z11;
        C3185d c3185d;
        C3185d c3185d2;
        boolean z12;
        C3185d c3185d3;
        C3185d c3185d4;
        if (c3186e.m16115r0()) {
            return;
        }
        f89747c++;
        if (!(c3186e instanceof C3187f) && c3186e.m16108o0()) {
            int i12 = i11 + 1;
            if (m93739a(i12, c3186e)) {
                C3187f.m16139V1(i12, c3186e, bVar, new C17693b.a(), C17693b.a.f89699k);
            }
        }
        C3185d mo16112q = c3186e.mo16112q(C3185d.b.TOP);
        C3185d mo16112q2 = c3186e.mo16112q(C3185d.b.BOTTOM);
        int m16002e = mo16112q.m16002e();
        int m16002e2 = mo16112q2.m16002e();
        if (mo16112q.m16001d() != null && mo16112q.m16011n()) {
            Iterator it = mo16112q.m16001d().iterator();
            while (it.hasNext()) {
                C3185d c3185d5 = (C3185d) it.next();
                C3186e c3186e2 = c3185d5.f13458d;
                int i13 = i11 + 1;
                boolean m93739a = m93739a(i13, c3186e2);
                if (c3186e2.m16108o0() && m93739a) {
                    C3187f.m16139V1(i13, c3186e2, bVar, new C17693b.a(), C17693b.a.f89699k);
                }
                if ((c3185d5 == c3186e2.f13510R && (c3185d4 = c3186e2.f13514T.f13460f) != null && c3185d4.m16011n()) || (c3185d5 == c3186e2.f13514T && (c3185d3 = c3186e2.f13510R.f13460f) != null && c3185d3.m16011n())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C3186e.b m16064V = c3186e2.m16064V();
                C3186e.b bVar2 = C3186e.b.MATCH_CONSTRAINT;
                if (m16064V == bVar2 && !m93739a) {
                    if (c3186e2.m16064V() == bVar2 && c3186e2.f13482D >= 0 && c3186e2.f13480C >= 0 && (c3186e2.m16068X() == 8 || (c3186e2.f13567x == 0 && c3186e2.m16129x() == 0.0f))) {
                        if (!c3186e2.m16103m0() && !c3186e2.m16105n0() && z12 && !c3186e2.m16103m0()) {
                            m93745g(i13, c3186e, bVar, c3186e2);
                        }
                    }
                } else if (!c3186e2.m16108o0()) {
                    C3185d c3185d6 = c3186e2.f13510R;
                    if (c3185d5 == c3185d6 && c3186e2.f13514T.f13460f == null) {
                        int m16003f = c3185d6.m16003f() + m16002e;
                        c3186e2.m16047L0(m16003f, c3186e2.m16133z() + m16003f);
                        m93747i(i13, c3186e2, bVar);
                    } else {
                        C3185d c3185d7 = c3186e2.f13514T;
                        if (c3185d5 == c3185d7 && c3185d6.f13460f == null) {
                            int m16003f2 = m16002e - c3185d7.m16003f();
                            c3186e2.m16047L0(m16003f2 - c3186e2.m16133z(), m16003f2);
                            m93747i(i13, c3186e2, bVar);
                        } else if (z12 && !c3186e2.m16103m0()) {
                            m93744f(i13, bVar, c3186e2);
                        }
                    }
                }
            }
        }
        if (c3186e instanceof C3189h) {
            return;
        }
        if (mo16112q2.m16001d() != null && mo16112q2.m16011n()) {
            Iterator it2 = mo16112q2.m16001d().iterator();
            while (it2.hasNext()) {
                C3185d c3185d8 = (C3185d) it2.next();
                C3186e c3186e3 = c3185d8.f13458d;
                int i14 = i11 + 1;
                boolean m93739a2 = m93739a(i14, c3186e3);
                if (c3186e3.m16108o0() && m93739a2) {
                    C3187f.m16139V1(i14, c3186e3, bVar, new C17693b.a(), C17693b.a.f89699k);
                }
                if ((c3185d8 == c3186e3.f13510R && (c3185d2 = c3186e3.f13514T.f13460f) != null && c3185d2.m16011n()) || (c3185d8 == c3186e3.f13514T && (c3185d = c3186e3.f13510R.f13460f) != null && c3185d.m16011n())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3186e.b m16064V2 = c3186e3.m16064V();
                C3186e.b bVar3 = C3186e.b.MATCH_CONSTRAINT;
                if (m16064V2 == bVar3 && !m93739a2) {
                    if (c3186e3.m16064V() == bVar3 && c3186e3.f13482D >= 0 && c3186e3.f13480C >= 0 && (c3186e3.m16068X() == 8 || (c3186e3.f13567x == 0 && c3186e3.m16129x() == 0.0f))) {
                        if (!c3186e3.m16103m0() && !c3186e3.m16105n0() && z11 && !c3186e3.m16103m0()) {
                            m93745g(i14, c3186e, bVar, c3186e3);
                        }
                    }
                } else if (!c3186e3.m16108o0()) {
                    C3185d c3185d9 = c3186e3.f13510R;
                    if (c3185d8 == c3185d9 && c3186e3.f13514T.f13460f == null) {
                        int m16003f3 = c3185d9.m16003f() + m16002e2;
                        c3186e3.m16047L0(m16003f3, c3186e3.m16133z() + m16003f3);
                        m93747i(i14, c3186e3, bVar);
                    } else {
                        C3185d c3185d10 = c3186e3.f13514T;
                        if (c3185d8 == c3185d10 && c3185d9.f13460f == null) {
                            int m16003f4 = m16002e2 - c3185d10.m16003f();
                            c3186e3.m16047L0(m16003f4 - c3186e3.m16133z(), m16003f4);
                            m93747i(i14, c3186e3, bVar);
                        } else if (z11 && !c3186e3.m16103m0()) {
                            m93744f(i14, bVar, c3186e3);
                        }
                    }
                }
            }
        }
        C3185d mo16112q3 = c3186e.mo16112q(C3185d.b.BASELINE);
        if (mo16112q3.m16001d() != null && mo16112q3.m16011n()) {
            int m16002e3 = mo16112q3.m16002e();
            Iterator it3 = mo16112q3.m16001d().iterator();
            while (it3.hasNext()) {
                C3185d c3185d11 = (C3185d) it3.next();
                C3186e c3186e4 = c3185d11.f13458d;
                int i15 = i11 + 1;
                boolean m93739a3 = m93739a(i15, c3186e4);
                if (c3186e4.m16108o0() && m93739a3) {
                    C3187f.m16139V1(i15, c3186e4, bVar, new C17693b.a(), C17693b.a.f89699k);
                }
                if (c3186e4.m16064V() != C3186e.b.MATCH_CONSTRAINT || m93739a3) {
                    if (!c3186e4.m16108o0() && c3185d11 == c3186e4.f13515U) {
                        c3186e4.m16039H0(c3185d11.m16003f() + m16002e3);
                        m93747i(i15, c3186e4, bVar);
                    }
                }
            }
        }
        c3186e.m16121t0();
    }
}
