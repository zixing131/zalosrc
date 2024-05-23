package p088d1;

import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.InterfaceC3190i;
import p088d1.AbstractC17707p;
import p088d1.C17697f;

/* renamed from: d1.n */
/* loaded from: classes2.dex */
public class C17705n extends AbstractC17707p {

    /* renamed from: k */
    public C17697f f89758k;

    /* renamed from: l */
    C17698g f89759l;

    /* renamed from: d1.n$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f89760a;

        static {
            int[] iArr = new int[AbstractC17707p.b.values().length];
            f89760a = iArr;
            try {
                iArr[AbstractC17707p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89760a[AbstractC17707p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89760a[AbstractC17707p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C17705n(C3186e c3186e) {
        super(c3186e);
        C17697f c17697f = new C17697f(this);
        this.f89758k = c17697f;
        this.f89759l = null;
        this.f89783h.f89727e = C17697f.a.TOP;
        this.f89784i.f89727e = C17697f.a.BOTTOM;
        c17697f.f89727e = C17697f.a.BASELINE;
        this.f89781f = 1;
    }

    @Override // p088d1.AbstractC17707p, p088d1.InterfaceC17695d
    /* renamed from: a */
    public void mo93716a(InterfaceC17695d interfaceC17695d) {
        float f11;
        float m16129x;
        float f12;
        int i11;
        int i12 = a.f89760a[this.f89785j.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    C3186e c3186e = this.f89777b;
                    m93778n(interfaceC17695d, c3186e.f13510R, c3186e.f13514T, 1);
                    return;
                }
            } else {
                m93779o(interfaceC17695d);
            }
        } else {
            m93780p(interfaceC17695d);
        }
        C17698g c17698g = this.f89780e;
        if (c17698g.f89725c && !c17698g.f89732j && this.f89779d == C3186e.b.MATCH_CONSTRAINT) {
            C3186e c3186e2 = this.f89777b;
            int i13 = c3186e2.f13567x;
            if (i13 != 2) {
                if (i13 == 3 && c3186e2.f13529e.f89780e.f89732j) {
                    int m16131y = c3186e2.m16131y();
                    if (m16131y != -1) {
                        if (m16131y != 0) {
                            if (m16131y != 1) {
                                i11 = 0;
                                this.f89780e.mo93738d(i11);
                            } else {
                                C3186e c3186e3 = this.f89777b;
                                f11 = c3186e3.f13529e.f89780e.f89729g;
                                m16129x = c3186e3.m16129x();
                            }
                        } else {
                            f12 = r7.f13529e.f89780e.f89729g * this.f89777b.m16129x();
                            i11 = (int) (f12 + 0.5f);
                            this.f89780e.mo93738d(i11);
                        }
                    } else {
                        C3186e c3186e4 = this.f89777b;
                        f11 = c3186e4.f13529e.f89780e.f89729g;
                        m16129x = c3186e4.m16129x();
                    }
                    f12 = f11 / m16129x;
                    i11 = (int) (f12 + 0.5f);
                    this.f89780e.mo93738d(i11);
                }
            } else {
                C3186e m16048M = c3186e2.m16048M();
                if (m16048M != null) {
                    if (m16048M.f13531f.f89780e.f89732j) {
                        this.f89780e.mo93738d((int) ((r7.f89729g * this.f89777b.f13484E) + 0.5f));
                    }
                }
            }
        }
        C17697f c17697f = this.f89783h;
        if (c17697f.f89725c) {
            C17697f c17697f2 = this.f89784i;
            if (c17697f2.f89725c) {
                if (c17697f.f89732j && c17697f2.f89732j && this.f89780e.f89732j) {
                    return;
                }
                if (!this.f89780e.f89732j && this.f89779d == C3186e.b.MATCH_CONSTRAINT) {
                    C3186e c3186e5 = this.f89777b;
                    if (c3186e5.f13565w == 0 && !c3186e5.m16103m0()) {
                        C17697f c17697f3 = (C17697f) this.f89783h.f89734l.get(0);
                        C17697f c17697f4 = (C17697f) this.f89784i.f89734l.get(0);
                        int i14 = c17697f3.f89729g;
                        C17697f c17697f5 = this.f89783h;
                        int i15 = i14 + c17697f5.f89728f;
                        int i16 = c17697f4.f89729g + this.f89784i.f89728f;
                        c17697f5.mo93738d(i15);
                        this.f89784i.mo93738d(i16);
                        this.f89780e.mo93738d(i16 - i15);
                        return;
                    }
                }
                if (!this.f89780e.f89732j && this.f89779d == C3186e.b.MATCH_CONSTRAINT && this.f89776a == 1 && this.f89783h.f89734l.size() > 0 && this.f89784i.f89734l.size() > 0) {
                    C17697f c17697f6 = (C17697f) this.f89783h.f89734l.get(0);
                    int i17 = (((C17697f) this.f89784i.f89734l.get(0)).f89729g + this.f89784i.f89728f) - (c17697f6.f89729g + this.f89783h.f89728f);
                    C17698g c17698g2 = this.f89780e;
                    int i18 = c17698g2.f89744m;
                    if (i17 < i18) {
                        c17698g2.mo93738d(i17);
                    } else {
                        c17698g2.mo93738d(i18);
                    }
                }
                if (this.f89780e.f89732j && this.f89783h.f89734l.size() > 0 && this.f89784i.f89734l.size() > 0) {
                    C17697f c17697f7 = (C17697f) this.f89783h.f89734l.get(0);
                    C17697f c17697f8 = (C17697f) this.f89784i.f89734l.get(0);
                    int i19 = c17697f7.f89729g + this.f89783h.f89728f;
                    int i21 = c17697f8.f89729g + this.f89784i.f89728f;
                    float m16060T = this.f89777b.m16060T();
                    if (c17697f7 == c17697f8) {
                        i19 = c17697f7.f89729g;
                        i21 = c17697f8.f89729g;
                        m16060T = 0.5f;
                    }
                    this.f89783h.mo93738d((int) (i19 + 0.5f + (((i21 - i19) - this.f89780e.f89729g) * m16060T)));
                    this.f89784i.mo93738d(this.f89783h.f89729g + this.f89780e.f89729g);
                }
            }
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: d */
    public void mo93717d() {
        C3186e m16048M;
        C3186e m16048M2;
        C3186e c3186e = this.f89777b;
        if (c3186e.f13521a) {
            this.f89780e.mo93738d(c3186e.m16133z());
        }
        if (!this.f89780e.f89732j) {
            this.f89779d = this.f89777b.m16064V();
            if (this.f89777b.m16076b0()) {
                this.f89759l = new C17692a(this);
            }
            C3186e.b bVar = this.f89779d;
            if (bVar != C3186e.b.MATCH_CONSTRAINT) {
                if (bVar == C3186e.b.MATCH_PARENT && (m16048M2 = this.f89777b.m16048M()) != null && m16048M2.m16064V() == C3186e.b.FIXED) {
                    int m16133z = (m16048M2.m16133z() - this.f89777b.f13510R.m16003f()) - this.f89777b.f13514T.m16003f();
                    m93772b(this.f89783h, m16048M2.f13531f.f89783h, this.f89777b.f13510R.m16003f());
                    m93772b(this.f89784i, m16048M2.f13531f.f89784i, -this.f89777b.f13514T.m16003f());
                    this.f89780e.mo93738d(m16133z);
                    return;
                }
                if (this.f89779d == C3186e.b.FIXED) {
                    this.f89780e.mo93738d(this.f89777b.m16133z());
                }
            }
        } else if (this.f89779d == C3186e.b.MATCH_PARENT && (m16048M = this.f89777b.m16048M()) != null && m16048M.m16064V() == C3186e.b.FIXED) {
            m93772b(this.f89783h, m16048M.f13531f.f89783h, this.f89777b.f13510R.m16003f());
            m93772b(this.f89784i, m16048M.f13531f.f89784i, -this.f89777b.f13514T.m16003f());
            return;
        }
        C17698g c17698g = this.f89780e;
        boolean z11 = c17698g.f89732j;
        if (z11) {
            C3186e c3186e2 = this.f89777b;
            if (c3186e2.f13521a) {
                C3185d[] c3185dArr = c3186e2.f13519Y;
                C3185d c3185d = c3185dArr[2];
                C3185d c3185d2 = c3185d.f13460f;
                if (c3185d2 != null && c3185dArr[3].f13460f != null) {
                    if (c3186e2.m16103m0()) {
                        this.f89783h.f89728f = this.f89777b.f13519Y[2].m16003f();
                        this.f89784i.f89728f = -this.f89777b.f13519Y[3].m16003f();
                    } else {
                        C17697f m93775h = m93775h(this.f89777b.f13519Y[2]);
                        if (m93775h != null) {
                            m93772b(this.f89783h, m93775h, this.f89777b.f13519Y[2].m16003f());
                        }
                        C17697f m93775h2 = m93775h(this.f89777b.f13519Y[3]);
                        if (m93775h2 != null) {
                            m93772b(this.f89784i, m93775h2, -this.f89777b.f13519Y[3].m16003f());
                        }
                        this.f89783h.f89724b = true;
                        this.f89784i.f89724b = true;
                    }
                    if (this.f89777b.m16076b0()) {
                        m93772b(this.f89758k, this.f89783h, this.f89777b.m16114r());
                        return;
                    }
                    return;
                }
                if (c3185d2 != null) {
                    C17697f m93775h3 = m93775h(c3185d);
                    if (m93775h3 != null) {
                        m93772b(this.f89783h, m93775h3, this.f89777b.f13519Y[2].m16003f());
                        m93772b(this.f89784i, this.f89783h, this.f89780e.f89729g);
                        if (this.f89777b.m16076b0()) {
                            m93772b(this.f89758k, this.f89783h, this.f89777b.m16114r());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C3185d c3185d3 = c3185dArr[3];
                if (c3185d3.f13460f != null) {
                    C17697f m93775h4 = m93775h(c3185d3);
                    if (m93775h4 != null) {
                        m93772b(this.f89784i, m93775h4, -this.f89777b.f13519Y[3].m16003f());
                        m93772b(this.f89783h, this.f89784i, -this.f89780e.f89729g);
                    }
                    if (this.f89777b.m16076b0()) {
                        m93772b(this.f89758k, this.f89783h, this.f89777b.m16114r());
                        return;
                    }
                    return;
                }
                C3185d c3185d4 = c3185dArr[4];
                if (c3185d4.f13460f != null) {
                    C17697f m93775h5 = m93775h(c3185d4);
                    if (m93775h5 != null) {
                        m93772b(this.f89758k, m93775h5, 0);
                        m93772b(this.f89783h, this.f89758k, -this.f89777b.m16114r());
                        m93772b(this.f89784i, this.f89783h, this.f89780e.f89729g);
                        return;
                    }
                    return;
                }
                if (!(c3186e2 instanceof InterfaceC3190i) && c3186e2.m16048M() != null && this.f89777b.mo16112q(C3185d.b.CENTER).f13460f == null) {
                    m93772b(this.f89783h, this.f89777b.m16048M().f13531f.f89783h, this.f89777b.m16074a0());
                    m93772b(this.f89784i, this.f89783h, this.f89780e.f89729g);
                    if (this.f89777b.m16076b0()) {
                        m93772b(this.f89758k, this.f89783h, this.f89777b.m16114r());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z11 && this.f89779d == C3186e.b.MATCH_CONSTRAINT) {
            C3186e c3186e3 = this.f89777b;
            int i11 = c3186e3.f13567x;
            if (i11 != 2) {
                if (i11 == 3 && !c3186e3.m16103m0()) {
                    C3186e c3186e4 = this.f89777b;
                    if (c3186e4.f13565w != 3) {
                        C17698g c17698g2 = c3186e4.f13529e.f89780e;
                        this.f89780e.f89734l.add(c17698g2);
                        c17698g2.f89733k.add(this.f89780e);
                        C17698g c17698g3 = this.f89780e;
                        c17698g3.f89724b = true;
                        c17698g3.f89733k.add(this.f89783h);
                        this.f89780e.f89733k.add(this.f89784i);
                    }
                }
            } else {
                C3186e m16048M3 = c3186e3.m16048M();
                if (m16048M3 != null) {
                    C17698g c17698g4 = m16048M3.f13531f.f89780e;
                    this.f89780e.f89734l.add(c17698g4);
                    c17698g4.f89733k.add(this.f89780e);
                    C17698g c17698g5 = this.f89780e;
                    c17698g5.f89724b = true;
                    c17698g5.f89733k.add(this.f89783h);
                    this.f89780e.f89733k.add(this.f89784i);
                }
            }
        } else {
            c17698g.m93736b(this);
        }
        C3186e c3186e5 = this.f89777b;
        C3185d[] c3185dArr2 = c3186e5.f13519Y;
        C3185d c3185d5 = c3185dArr2[2];
        C3185d c3185d6 = c3185d5.f13460f;
        if (c3185d6 != null && c3185dArr2[3].f13460f != null) {
            if (c3186e5.m16103m0()) {
                this.f89783h.f89728f = this.f89777b.f13519Y[2].m16003f();
                this.f89784i.f89728f = -this.f89777b.f13519Y[3].m16003f();
            } else {
                C17697f m93775h6 = m93775h(this.f89777b.f13519Y[2]);
                C17697f m93775h7 = m93775h(this.f89777b.f13519Y[3]);
                if (m93775h6 != null) {
                    m93775h6.m93736b(this);
                }
                if (m93775h7 != null) {
                    m93775h7.m93736b(this);
                }
                this.f89785j = AbstractC17707p.b.CENTER;
            }
            if (this.f89777b.m16076b0()) {
                m93773c(this.f89758k, this.f89783h, 1, this.f89759l);
            }
        } else if (c3185d6 != null) {
            C17697f m93775h8 = m93775h(c3185d5);
            if (m93775h8 != null) {
                m93772b(this.f89783h, m93775h8, this.f89777b.f13519Y[2].m16003f());
                m93773c(this.f89784i, this.f89783h, 1, this.f89780e);
                if (this.f89777b.m16076b0()) {
                    m93773c(this.f89758k, this.f89783h, 1, this.f89759l);
                }
                C3186e.b bVar2 = this.f89779d;
                C3186e.b bVar3 = C3186e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f89777b.m16129x() > 0.0f) {
                    C17703l c17703l = this.f89777b.f13529e;
                    if (c17703l.f89779d == bVar3) {
                        c17703l.f89780e.f89733k.add(this.f89780e);
                        this.f89780e.f89734l.add(this.f89777b.f13529e.f89780e);
                        this.f89780e.f89723a = this;
                    }
                }
            }
        } else {
            C3185d c3185d7 = c3185dArr2[3];
            if (c3185d7.f13460f != null) {
                C17697f m93775h9 = m93775h(c3185d7);
                if (m93775h9 != null) {
                    m93772b(this.f89784i, m93775h9, -this.f89777b.f13519Y[3].m16003f());
                    m93773c(this.f89783h, this.f89784i, -1, this.f89780e);
                    if (this.f89777b.m16076b0()) {
                        m93773c(this.f89758k, this.f89783h, 1, this.f89759l);
                    }
                }
            } else {
                C3185d c3185d8 = c3185dArr2[4];
                if (c3185d8.f13460f != null) {
                    C17697f m93775h10 = m93775h(c3185d8);
                    if (m93775h10 != null) {
                        m93772b(this.f89758k, m93775h10, 0);
                        m93773c(this.f89783h, this.f89758k, -1, this.f89759l);
                        m93773c(this.f89784i, this.f89783h, 1, this.f89780e);
                    }
                } else if (!(c3186e5 instanceof InterfaceC3190i) && c3186e5.m16048M() != null) {
                    m93772b(this.f89783h, this.f89777b.m16048M().f13531f.f89783h, this.f89777b.m16074a0());
                    m93773c(this.f89784i, this.f89783h, 1, this.f89780e);
                    if (this.f89777b.m16076b0()) {
                        m93773c(this.f89758k, this.f89783h, 1, this.f89759l);
                    }
                    C3186e.b bVar4 = this.f89779d;
                    C3186e.b bVar5 = C3186e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f89777b.m16129x() > 0.0f) {
                        C17703l c17703l2 = this.f89777b.f13529e;
                        if (c17703l2.f89779d == bVar5) {
                            c17703l2.f89780e.f89733k.add(this.f89780e);
                            this.f89780e.f89734l.add(this.f89777b.f13529e.f89780e);
                            this.f89780e.f89723a = this;
                        }
                    }
                }
            }
        }
        if (this.f89780e.f89734l.size() == 0) {
            this.f89780e.f89725c = true;
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: e */
    public void mo93718e() {
        C17697f c17697f = this.f89783h;
        if (c17697f.f89732j) {
            this.f89777b.m16113q1(c17697f.f89729g);
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: f */
    public void mo93719f() {
        this.f89778c = null;
        this.f89783h.m93737c();
        this.f89784i.m93737c();
        this.f89758k.m93737c();
        this.f89780e.m93737c();
        this.f89782g = false;
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: m */
    public boolean mo93721m() {
        if (this.f89779d != C3186e.b.MATCH_CONSTRAINT || this.f89777b.f13567x == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void m93760q() {
        this.f89782g = false;
        this.f89783h.m93737c();
        this.f89783h.f89732j = false;
        this.f89784i.m93737c();
        this.f89784i.f89732j = false;
        this.f89758k.m93737c();
        this.f89758k.f89732j = false;
        this.f89780e.f89732j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f89777b.m16125v();
    }
}
