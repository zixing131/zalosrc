package p088d1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3189h;
import p045c1.C3191j;
import p088d1.C17693b;

/* renamed from: d1.e */
/* loaded from: classes2.dex */
public class C17696e {

    /* renamed from: a */
    private C3187f f89714a;

    /* renamed from: d */
    private C3187f f89717d;

    /* renamed from: b */
    private boolean f89715b = true;

    /* renamed from: c */
    private boolean f89716c = true;

    /* renamed from: e */
    private ArrayList f89718e = new ArrayList();

    /* renamed from: f */
    private ArrayList f89719f = new ArrayList();

    /* renamed from: g */
    private C17693b.b f89720g = null;

    /* renamed from: h */
    private C17693b.a f89721h = new C17693b.a();

    /* renamed from: i */
    ArrayList f89722i = new ArrayList();

    public C17696e(C3187f c3187f) {
        this.f89714a = c3187f;
        this.f89717d = c3187f;
    }

    /* renamed from: a */
    private void m93722a(C17697f c17697f, int i11, int i12, C17697f c17697f2, ArrayList arrayList, C17704m c17704m) {
        AbstractC17707p abstractC17707p = c17697f.f89726d;
        if (abstractC17707p.f89778c == null) {
            C3187f c3187f = this.f89714a;
            if (abstractC17707p != c3187f.f13529e && abstractC17707p != c3187f.f13531f) {
                if (c17704m == null) {
                    c17704m = new C17704m(abstractC17707p, i12);
                    arrayList.add(c17704m);
                }
                abstractC17707p.f89778c = c17704m;
                c17704m.m93758a(abstractC17707p);
                for (InterfaceC17695d interfaceC17695d : abstractC17707p.f89783h.f89733k) {
                    if (interfaceC17695d instanceof C17697f) {
                        m93722a((C17697f) interfaceC17695d, i11, 0, c17697f2, arrayList, c17704m);
                    }
                }
                for (InterfaceC17695d interfaceC17695d2 : abstractC17707p.f89784i.f89733k) {
                    if (interfaceC17695d2 instanceof C17697f) {
                        m93722a((C17697f) interfaceC17695d2, i11, 1, c17697f2, arrayList, c17704m);
                    }
                }
                if (i11 == 1 && (abstractC17707p instanceof C17705n)) {
                    for (InterfaceC17695d interfaceC17695d3 : ((C17705n) abstractC17707p).f89758k.f89733k) {
                        if (interfaceC17695d3 instanceof C17697f) {
                            m93722a((C17697f) interfaceC17695d3, i11, 2, c17697f2, arrayList, c17704m);
                        }
                    }
                }
                for (C17697f c17697f3 : abstractC17707p.f89783h.f89734l) {
                    if (c17697f3 == c17697f2) {
                        c17704m.f89752b = true;
                    }
                    m93722a(c17697f3, i11, 0, c17697f2, arrayList, c17704m);
                }
                for (C17697f c17697f4 : abstractC17707p.f89784i.f89734l) {
                    if (c17697f4 == c17697f2) {
                        c17704m.f89752b = true;
                    }
                    m93722a(c17697f4, i11, 1, c17697f2, arrayList, c17704m);
                }
                if (i11 == 1 && (abstractC17707p instanceof C17705n)) {
                    Iterator it = ((C17705n) abstractC17707p).f89758k.f89734l.iterator();
                    while (it.hasNext()) {
                        m93722a((C17697f) it.next(), i11, 2, c17697f2, arrayList, c17704m);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m93723b(C3187f c3187f) {
        int i11;
        C3186e.b bVar;
        int i12;
        C3186e.b bVar2;
        C3186e.b bVar3;
        C3186e.b bVar4;
        Iterator it = c3187f.f13678U0.iterator();
        while (it.hasNext()) {
            C3186e c3186e = (C3186e) it.next();
            C3186e.b[] bVarArr = c3186e.f13524b0;
            C3186e.b bVar5 = bVarArr[0];
            C3186e.b bVar6 = bVarArr[1];
            if (c3186e.m16068X() == 8) {
                c3186e.f13521a = true;
            } else {
                if (c3186e.f13478B < 1.0f && bVar5 == C3186e.b.MATCH_CONSTRAINT) {
                    c3186e.f13565w = 2;
                }
                if (c3186e.f13484E < 1.0f && bVar6 == C3186e.b.MATCH_CONSTRAINT) {
                    c3186e.f13567x = 2;
                }
                if (c3186e.m16129x() > 0.0f) {
                    C3186e.b bVar7 = C3186e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == C3186e.b.WRAP_CONTENT || bVar6 == C3186e.b.FIXED)) {
                        c3186e.f13565w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == C3186e.b.WRAP_CONTENT || bVar5 == C3186e.b.FIXED)) {
                        c3186e.f13567x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (c3186e.f13565w == 0) {
                            c3186e.f13565w = 3;
                        }
                        if (c3186e.f13567x == 0) {
                            c3186e.f13567x = 3;
                        }
                    }
                }
                C3186e.b bVar8 = C3186e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && c3186e.f13565w == 1 && (c3186e.f13508Q.f13460f == null || c3186e.f13512S.f13460f == null)) {
                    bVar5 = C3186e.b.WRAP_CONTENT;
                }
                C3186e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && c3186e.f13567x == 1 && (c3186e.f13510R.f13460f == null || c3186e.f13514T.f13460f == null)) {
                    bVar6 = C3186e.b.WRAP_CONTENT;
                }
                C3186e.b bVar10 = bVar6;
                C17703l c17703l = c3186e.f13529e;
                c17703l.f89779d = bVar9;
                int i13 = c3186e.f13565w;
                c17703l.f89776a = i13;
                C17705n c17705n = c3186e.f13531f;
                c17705n.f89779d = bVar10;
                int i14 = c3186e.f13567x;
                c17705n.f89776a = i14;
                C3186e.b bVar11 = C3186e.b.MATCH_PARENT;
                if ((bVar9 != bVar11 && bVar9 != C3186e.b.FIXED && bVar9 != C3186e.b.WRAP_CONTENT) || (bVar10 != bVar11 && bVar10 != C3186e.b.FIXED && bVar10 != C3186e.b.WRAP_CONTENT)) {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = C3186e.b.WRAP_CONTENT) || bVar10 == C3186e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar10 == bVar4) {
                                m93726l(c3186e, bVar4, 0, bVar4, 0);
                            }
                            int m16133z = c3186e.m16133z();
                            int i15 = (int) ((m16133z * c3186e.f13532f0) + 0.5f);
                            C3186e.b bVar12 = C3186e.b.FIXED;
                            m93726l(c3186e, bVar12, i15, bVar12, m16133z);
                            c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                            c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                            c3186e.f13521a = true;
                        } else if (i13 == 1) {
                            m93726l(c3186e, bVar4, 0, bVar10, 0);
                            c3186e.f13529e.f89780e.f89744m = c3186e.m16070Y();
                        } else if (i13 == 2) {
                            C3186e.b bVar13 = c3187f.f13524b0[0];
                            C3186e.b bVar14 = C3186e.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                m93726l(c3186e, bVar14, (int) ((c3186e.f13478B * c3187f.m16070Y()) + 0.5f), bVar10, c3186e.m16133z());
                                c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                                c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                                c3186e.f13521a = true;
                            }
                        } else {
                            C3185d[] c3185dArr = c3186e.f13519Y;
                            if (c3185dArr[0].f13460f == null || c3185dArr[1].f13460f == null) {
                                m93726l(c3186e, bVar4, 0, bVar10, 0);
                                c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                                c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                                c3186e.f13521a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = C3186e.b.WRAP_CONTENT) || bVar9 == C3186e.b.FIXED)) {
                        if (i14 == 3) {
                            if (bVar9 == bVar3) {
                                m93726l(c3186e, bVar3, 0, bVar3, 0);
                            }
                            int m16070Y = c3186e.m16070Y();
                            float f11 = c3186e.f13532f0;
                            if (c3186e.m16131y() == -1) {
                                f11 = 1.0f / f11;
                            }
                            C3186e.b bVar15 = C3186e.b.FIXED;
                            m93726l(c3186e, bVar15, m16070Y, bVar15, (int) ((m16070Y * f11) + 0.5f));
                            c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                            c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                            c3186e.f13521a = true;
                        } else if (i14 == 1) {
                            m93726l(c3186e, bVar9, 0, bVar3, 0);
                            c3186e.f13531f.f89780e.f89744m = c3186e.m16133z();
                        } else if (i14 == 2) {
                            C3186e.b bVar16 = c3187f.f13524b0[1];
                            C3186e.b bVar17 = C3186e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                m93726l(c3186e, bVar9, c3186e.m16070Y(), bVar17, (int) ((c3186e.f13484E * c3187f.m16133z()) + 0.5f));
                                c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                                c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                                c3186e.f13521a = true;
                            }
                        } else {
                            C3185d[] c3185dArr2 = c3186e.f13519Y;
                            if (c3185dArr2[2].f13460f == null || c3185dArr2[3].f13460f == null) {
                                m93726l(c3186e, bVar3, 0, bVar10, 0);
                                c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                                c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                                c3186e.f13521a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i13 != 1 && i14 != 1) {
                            if (i14 == 2 && i13 == 2) {
                                C3186e.b[] bVarArr2 = c3187f.f13524b0;
                                C3186e.b bVar18 = bVarArr2[0];
                                C3186e.b bVar19 = C3186e.b.FIXED;
                                if (bVar18 == bVar19 && bVarArr2[1] == bVar19) {
                                    m93726l(c3186e, bVar19, (int) ((c3186e.f13478B * c3187f.m16070Y()) + 0.5f), bVar19, (int) ((c3186e.f13484E * c3187f.m16133z()) + 0.5f));
                                    c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                                    c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                                    c3186e.f13521a = true;
                                }
                            }
                        } else {
                            C3186e.b bVar20 = C3186e.b.WRAP_CONTENT;
                            m93726l(c3186e, bVar20, 0, bVar20, 0);
                            c3186e.f13529e.f89780e.f89744m = c3186e.m16070Y();
                            c3186e.f13531f.f89780e.f89744m = c3186e.m16133z();
                        }
                    }
                } else {
                    int m16070Y2 = c3186e.m16070Y();
                    if (bVar9 == bVar11) {
                        i11 = (c3187f.m16070Y() - c3186e.f13508Q.f13461g) - c3186e.f13512S.f13461g;
                        bVar = C3186e.b.FIXED;
                    } else {
                        i11 = m16070Y2;
                        bVar = bVar9;
                    }
                    int m16133z2 = c3186e.m16133z();
                    if (bVar10 == bVar11) {
                        i12 = (c3187f.m16133z() - c3186e.f13510R.f13461g) - c3186e.f13514T.f13461g;
                        bVar2 = C3186e.b.FIXED;
                    } else {
                        i12 = m16133z2;
                        bVar2 = bVar10;
                    }
                    m93726l(c3186e, bVar, i11, bVar2, i12);
                    c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                    c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                    c3186e.f13521a = true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m93724e(C3187f c3187f, int i11) {
        int size = this.f89722i.size();
        long j11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            j11 = Math.max(j11, ((C17704m) this.f89722i.get(i12)).m93759b(c3187f, i11));
        }
        return (int) j11;
    }

    /* renamed from: i */
    private void m93725i(AbstractC17707p abstractC17707p, int i11, ArrayList arrayList) {
        for (InterfaceC17695d interfaceC17695d : abstractC17707p.f89783h.f89733k) {
            if (interfaceC17695d instanceof C17697f) {
                m93722a((C17697f) interfaceC17695d, i11, 0, abstractC17707p.f89784i, arrayList, null);
            } else if (interfaceC17695d instanceof AbstractC17707p) {
                m93722a(((AbstractC17707p) interfaceC17695d).f89783h, i11, 0, abstractC17707p.f89784i, arrayList, null);
            }
        }
        for (InterfaceC17695d interfaceC17695d2 : abstractC17707p.f89784i.f89733k) {
            if (interfaceC17695d2 instanceof C17697f) {
                m93722a((C17697f) interfaceC17695d2, i11, 1, abstractC17707p.f89783h, arrayList, null);
            } else if (interfaceC17695d2 instanceof AbstractC17707p) {
                m93722a(((AbstractC17707p) interfaceC17695d2).f89784i, i11, 1, abstractC17707p.f89783h, arrayList, null);
            }
        }
        if (i11 == 1) {
            for (InterfaceC17695d interfaceC17695d3 : ((C17705n) abstractC17707p).f89758k.f89733k) {
                if (interfaceC17695d3 instanceof C17697f) {
                    m93722a((C17697f) interfaceC17695d3, i11, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m93726l(C3186e c3186e, C3186e.b bVar, int i11, C3186e.b bVar2, int i12) {
        C17693b.a aVar = this.f89721h;
        aVar.f89702a = bVar;
        aVar.f89703b = bVar2;
        aVar.f89704c = i11;
        aVar.f89705d = i12;
        this.f89720g.mo6393b(c3186e, aVar);
        c3186e.m16106n1(this.f89721h.f89706e);
        c3186e.m16053O0(this.f89721h.f89707f);
        c3186e.m16051N0(this.f89721h.f89709h);
        c3186e.m16031D0(this.f89721h.f89708g);
    }

    /* renamed from: c */
    public void m93727c() {
        m93728d(this.f89718e);
        this.f89722i.clear();
        C17704m.f89750h = 0;
        m93725i(this.f89714a.f13529e, 0, this.f89722i);
        m93725i(this.f89714a.f13531f, 1, this.f89722i);
        this.f89715b = false;
    }

    /* renamed from: d */
    public void m93728d(ArrayList arrayList) {
        arrayList.clear();
        this.f89717d.f13529e.mo93719f();
        this.f89717d.f13531f.mo93719f();
        arrayList.add(this.f89717d.f13529e);
        arrayList.add(this.f89717d.f13531f);
        Iterator it = this.f89717d.f13678U0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3186e c3186e = (C3186e) it.next();
            if (c3186e instanceof C3189h) {
                arrayList.add(new C17701j(c3186e));
            } else {
                if (c3186e.m16097k0()) {
                    if (c3186e.f13525c == null) {
                        c3186e.f13525c = new C17694c(c3186e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3186e.f13525c);
                } else {
                    arrayList.add(c3186e.f13529e);
                }
                if (c3186e.m16103m0()) {
                    if (c3186e.f13527d == null) {
                        c3186e.f13527d = new C17694c(c3186e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3186e.f13527d);
                } else {
                    arrayList.add(c3186e.f13531f);
                }
                if (c3186e instanceof C3191j) {
                    arrayList.add(new C17702k(c3186e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC17707p) it2.next()).mo93719f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC17707p abstractC17707p = (AbstractC17707p) it3.next();
            if (abstractC17707p.f89777b != this.f89717d) {
                abstractC17707p.mo93717d();
            }
        }
    }

    /* renamed from: f */
    public boolean m93729f(boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = z11 & true;
        if (this.f89715b || this.f89716c) {
            Iterator it = this.f89714a.f13678U0.iterator();
            while (it.hasNext()) {
                C3186e c3186e = (C3186e) it.next();
                c3186e.m16110p();
                c3186e.f13521a = false;
                c3186e.f13529e.m93755r();
                c3186e.f13531f.m93760q();
            }
            this.f89714a.m16110p();
            C3187f c3187f = this.f89714a;
            c3187f.f13521a = false;
            c3187f.f13529e.m93755r();
            this.f89714a.f13531f.m93760q();
            this.f89716c = false;
        }
        if (m93723b(this.f89717d)) {
            return false;
        }
        this.f89714a.m16111p1(0);
        this.f89714a.m16113q1(0);
        C3186e.b m16127w = this.f89714a.m16127w(0);
        C3186e.b m16127w2 = this.f89714a.m16127w(1);
        if (this.f89715b) {
            m93727c();
        }
        int m16072Z = this.f89714a.m16072Z();
        int m16074a0 = this.f89714a.m16074a0();
        this.f89714a.f13529e.f89783h.mo93738d(m16072Z);
        this.f89714a.f13531f.f89783h.mo93738d(m16074a0);
        m93734m();
        C3186e.b bVar = C3186e.b.WRAP_CONTENT;
        if (m16127w == bVar || m16127w2 == bVar) {
            if (z14) {
                Iterator it2 = this.f89718e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((AbstractC17707p) it2.next()).mo93721m()) {
                        z14 = false;
                        break;
                    }
                }
            }
            if (z14 && m16127w == C3186e.b.WRAP_CONTENT) {
                this.f89714a.m16059S0(C3186e.b.FIXED);
                C3187f c3187f2 = this.f89714a;
                c3187f2.m16106n1(m93724e(c3187f2, 0));
                C3187f c3187f3 = this.f89714a;
                c3187f3.f13529e.f89780e.mo93738d(c3187f3.m16070Y());
            }
            if (z14 && m16127w2 == C3186e.b.WRAP_CONTENT) {
                this.f89714a.m16095j1(C3186e.b.FIXED);
                C3187f c3187f4 = this.f89714a;
                c3187f4.m16053O0(m93724e(c3187f4, 1));
                C3187f c3187f5 = this.f89714a;
                c3187f5.f13531f.f89780e.mo93738d(c3187f5.m16133z());
            }
        }
        C3187f c3187f6 = this.f89714a;
        C3186e.b bVar2 = c3187f6.f13524b0[0];
        C3186e.b bVar3 = C3186e.b.FIXED;
        if (bVar2 != bVar3 && bVar2 != C3186e.b.MATCH_PARENT) {
            z12 = false;
        } else {
            int m16070Y = c3187f6.m16070Y() + m16072Z;
            this.f89714a.f13529e.f89784i.mo93738d(m16070Y);
            this.f89714a.f13529e.f89780e.mo93738d(m16070Y - m16072Z);
            m93734m();
            C3187f c3187f7 = this.f89714a;
            C3186e.b bVar4 = c3187f7.f13524b0[1];
            if (bVar4 == bVar3 || bVar4 == C3186e.b.MATCH_PARENT) {
                int m16133z = c3187f7.m16133z() + m16074a0;
                this.f89714a.f13531f.f89784i.mo93738d(m16133z);
                this.f89714a.f13531f.f89780e.mo93738d(m16133z - m16074a0);
            }
            m93734m();
            z12 = true;
        }
        Iterator it3 = this.f89718e.iterator();
        while (it3.hasNext()) {
            AbstractC17707p abstractC17707p = (AbstractC17707p) it3.next();
            if (abstractC17707p.f89777b != this.f89714a || abstractC17707p.f89782g) {
                abstractC17707p.mo93718e();
            }
        }
        Iterator it4 = this.f89718e.iterator();
        while (it4.hasNext()) {
            AbstractC17707p abstractC17707p2 = (AbstractC17707p) it4.next();
            if (z12 || abstractC17707p2.f89777b != this.f89714a) {
                if (!abstractC17707p2.f89783h.f89732j || ((!abstractC17707p2.f89784i.f89732j && !(abstractC17707p2 instanceof C17701j)) || (!abstractC17707p2.f89780e.f89732j && !(abstractC17707p2 instanceof C17694c) && !(abstractC17707p2 instanceof C17701j)))) {
                    z13 = false;
                    break;
                }
            }
        }
        this.f89714a.m16059S0(m16127w);
        this.f89714a.m16095j1(m16127w2);
        return z13;
    }

    /* renamed from: g */
    public boolean m93730g(boolean z11) {
        if (this.f89715b) {
            Iterator it = this.f89714a.f13678U0.iterator();
            while (it.hasNext()) {
                C3186e c3186e = (C3186e) it.next();
                c3186e.m16110p();
                c3186e.f13521a = false;
                C17703l c17703l = c3186e.f13529e;
                c17703l.f89780e.f89732j = false;
                c17703l.f89782g = false;
                c17703l.m93755r();
                C17705n c17705n = c3186e.f13531f;
                c17705n.f89780e.f89732j = false;
                c17705n.f89782g = false;
                c17705n.m93760q();
            }
            this.f89714a.m16110p();
            C3187f c3187f = this.f89714a;
            c3187f.f13521a = false;
            C17703l c17703l2 = c3187f.f13529e;
            c17703l2.f89780e.f89732j = false;
            c17703l2.f89782g = false;
            c17703l2.m93755r();
            C17705n c17705n2 = this.f89714a.f13531f;
            c17705n2.f89780e.f89732j = false;
            c17705n2.f89782g = false;
            c17705n2.m93760q();
            m93727c();
        }
        if (m93723b(this.f89717d)) {
            return false;
        }
        this.f89714a.m16111p1(0);
        this.f89714a.m16113q1(0);
        this.f89714a.f13529e.f89783h.mo93738d(0);
        this.f89714a.f13531f.f89783h.mo93738d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m93731h(boolean z11, int i11) {
        boolean z12;
        C3186e.b bVar;
        boolean z13 = true;
        boolean z14 = z11 & true;
        C3186e.b m16127w = this.f89714a.m16127w(0);
        C3186e.b m16127w2 = this.f89714a.m16127w(1);
        int m16072Z = this.f89714a.m16072Z();
        int m16074a0 = this.f89714a.m16074a0();
        if (z14 && (m16127w == (bVar = C3186e.b.WRAP_CONTENT) || m16127w2 == bVar)) {
            Iterator it = this.f89718e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC17707p abstractC17707p = (AbstractC17707p) it.next();
                if (abstractC17707p.f89781f == i11 && !abstractC17707p.mo93721m()) {
                    z14 = false;
                    break;
                }
            }
            if (i11 == 0) {
                if (z14 && m16127w == C3186e.b.WRAP_CONTENT) {
                    this.f89714a.m16059S0(C3186e.b.FIXED);
                    C3187f c3187f = this.f89714a;
                    c3187f.m16106n1(m93724e(c3187f, 0));
                    C3187f c3187f2 = this.f89714a;
                    c3187f2.f13529e.f89780e.mo93738d(c3187f2.m16070Y());
                }
            } else if (z14 && m16127w2 == C3186e.b.WRAP_CONTENT) {
                this.f89714a.m16095j1(C3186e.b.FIXED);
                C3187f c3187f3 = this.f89714a;
                c3187f3.m16053O0(m93724e(c3187f3, 1));
                C3187f c3187f4 = this.f89714a;
                c3187f4.f13531f.f89780e.mo93738d(c3187f4.m16133z());
            }
        }
        if (i11 == 0) {
            C3187f c3187f5 = this.f89714a;
            C3186e.b bVar2 = c3187f5.f13524b0[0];
            if (bVar2 == C3186e.b.FIXED || bVar2 == C3186e.b.MATCH_PARENT) {
                int m16070Y = c3187f5.m16070Y() + m16072Z;
                this.f89714a.f13529e.f89784i.mo93738d(m16070Y);
                this.f89714a.f13529e.f89780e.mo93738d(m16070Y - m16072Z);
                z12 = true;
            }
            z12 = false;
        } else {
            C3187f c3187f6 = this.f89714a;
            C3186e.b bVar3 = c3187f6.f13524b0[1];
            if (bVar3 == C3186e.b.FIXED || bVar3 == C3186e.b.MATCH_PARENT) {
                int m16133z = c3187f6.m16133z() + m16074a0;
                this.f89714a.f13531f.f89784i.mo93738d(m16133z);
                this.f89714a.f13531f.f89780e.mo93738d(m16133z - m16074a0);
                z12 = true;
            }
            z12 = false;
        }
        m93734m();
        Iterator it2 = this.f89718e.iterator();
        while (it2.hasNext()) {
            AbstractC17707p abstractC17707p2 = (AbstractC17707p) it2.next();
            if (abstractC17707p2.f89781f == i11 && (abstractC17707p2.f89777b != this.f89714a || abstractC17707p2.f89782g)) {
                abstractC17707p2.mo93718e();
            }
        }
        Iterator it3 = this.f89718e.iterator();
        while (it3.hasNext()) {
            AbstractC17707p abstractC17707p3 = (AbstractC17707p) it3.next();
            if (abstractC17707p3.f89781f == i11 && (z12 || abstractC17707p3.f89777b != this.f89714a)) {
                if (!abstractC17707p3.f89783h.f89732j || !abstractC17707p3.f89784i.f89732j || (!(abstractC17707p3 instanceof C17694c) && !abstractC17707p3.f89780e.f89732j)) {
                    z13 = false;
                    break;
                }
            }
        }
        this.f89714a.m16059S0(m16127w);
        this.f89714a.m16095j1(m16127w2);
        return z13;
    }

    /* renamed from: j */
    public void m93732j() {
        this.f89715b = true;
    }

    /* renamed from: k */
    public void m93733k() {
        this.f89716c = true;
    }

    /* renamed from: m */
    public void m93734m() {
        boolean z11;
        C17698g c17698g;
        Iterator it = this.f89714a.f13678U0.iterator();
        while (it.hasNext()) {
            C3186e c3186e = (C3186e) it.next();
            if (!c3186e.f13521a) {
                C3186e.b[] bVarArr = c3186e.f13524b0;
                boolean z12 = false;
                C3186e.b bVar = bVarArr[0];
                C3186e.b bVar2 = bVarArr[1];
                int i11 = c3186e.f13565w;
                int i12 = c3186e.f13567x;
                C3186e.b bVar3 = C3186e.b.WRAP_CONTENT;
                if (bVar != bVar3 && (bVar != C3186e.b.MATCH_CONSTRAINT || i11 != 1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (bVar2 == bVar3 || (bVar2 == C3186e.b.MATCH_CONSTRAINT && i12 == 1)) {
                    z12 = true;
                }
                C17698g c17698g2 = c3186e.f13529e.f89780e;
                boolean z13 = c17698g2.f89732j;
                C17698g c17698g3 = c3186e.f13531f.f89780e;
                boolean z14 = c17698g3.f89732j;
                if (z13 && z14) {
                    C3186e.b bVar4 = C3186e.b.FIXED;
                    m93726l(c3186e, bVar4, c17698g2.f89729g, bVar4, c17698g3.f89729g);
                    c3186e.f13521a = true;
                } else if (z13 && z12) {
                    m93726l(c3186e, C3186e.b.FIXED, c17698g2.f89729g, bVar3, c17698g3.f89729g);
                    if (bVar2 == C3186e.b.MATCH_CONSTRAINT) {
                        c3186e.f13531f.f89780e.f89744m = c3186e.m16133z();
                    } else {
                        c3186e.f13531f.f89780e.mo93738d(c3186e.m16133z());
                        c3186e.f13521a = true;
                    }
                } else if (z14 && z11) {
                    m93726l(c3186e, bVar3, c17698g2.f89729g, C3186e.b.FIXED, c17698g3.f89729g);
                    if (bVar == C3186e.b.MATCH_CONSTRAINT) {
                        c3186e.f13529e.f89780e.f89744m = c3186e.m16070Y();
                    } else {
                        c3186e.f13529e.f89780e.mo93738d(c3186e.m16070Y());
                        c3186e.f13521a = true;
                    }
                }
                if (c3186e.f13521a && (c17698g = c3186e.f13531f.f89759l) != null) {
                    c17698g.mo93738d(c3186e.m16114r());
                }
            }
        }
    }

    /* renamed from: n */
    public void m93735n(C17693b.b bVar) {
        this.f89720g = bVar;
    }
}
