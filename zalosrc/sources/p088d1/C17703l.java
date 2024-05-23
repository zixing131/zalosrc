package p088d1;

import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.InterfaceC3190i;
import p088d1.AbstractC17707p;
import p088d1.C17697f;

/* renamed from: d1.l */
/* loaded from: classes2.dex */
public class C17703l extends AbstractC17707p {

    /* renamed from: k */
    private static int[] f89748k = new int[2];

    /* renamed from: d1.l$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f89749a;

        static {
            int[] iArr = new int[AbstractC17707p.b.values().length];
            f89749a = iArr;
            try {
                iArr[AbstractC17707p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89749a[AbstractC17707p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89749a[AbstractC17707p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C17703l(C3186e c3186e) {
        super(c3186e);
        this.f89783h.f89727e = C17697f.a.LEFT;
        this.f89784i.f89727e = C17697f.a.RIGHT;
        this.f89781f = 0;
    }

    /* renamed from: q */
    private void m93754q(int[] iArr, int i11, int i12, int i13, int i14, float f11, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 != -1) {
            if (i15 != 0) {
                if (i15 == 1) {
                    iArr[0] = i16;
                    iArr[1] = (int) ((i16 * f11) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i17 * f11) + 0.5f);
            iArr[1] = i17;
            return;
        }
        int i18 = (int) ((i17 * f11) + 0.5f);
        int i19 = (int) ((i16 / f11) + 0.5f);
        if (i18 <= i16) {
            iArr[0] = i18;
            iArr[1] = i17;
        } else if (i19 <= i17) {
            iArr[0] = i16;
            iArr[1] = i19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02bd, code lost:            if (r14 != 1) goto L324;     */
    @Override // p088d1.AbstractC17707p, p088d1.InterfaceC17695d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo93716a(InterfaceC17695d interfaceC17695d) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f11;
        float m16129x;
        float f12;
        int i11;
        int i12 = a.f89749a[this.f89785j.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    C3186e c3186e = this.f89777b;
                    m93778n(interfaceC17695d, c3186e.f13508Q, c3186e.f13512S, 0);
                    return;
                }
            } else {
                m93779o(interfaceC17695d);
            }
        } else {
            m93780p(interfaceC17695d);
        }
        if (!this.f89780e.f89732j && this.f89779d == C3186e.b.MATCH_CONSTRAINT) {
            C3186e c3186e2 = this.f89777b;
            int i13 = c3186e2.f13565w;
            if (i13 != 2) {
                if (i13 == 3) {
                    int i14 = c3186e2.f13567x;
                    if (i14 != 0 && i14 != 3) {
                        int m16131y = c3186e2.m16131y();
                        if (m16131y != -1) {
                            if (m16131y != 0) {
                                if (m16131y != 1) {
                                    i11 = 0;
                                    this.f89780e.mo93738d(i11);
                                } else {
                                    C3186e c3186e3 = this.f89777b;
                                    f11 = c3186e3.f13531f.f89780e.f89729g;
                                    m16129x = c3186e3.m16129x();
                                }
                            } else {
                                f12 = r0.f13531f.f89780e.f89729g / this.f89777b.m16129x();
                                i11 = (int) (f12 + 0.5f);
                                this.f89780e.mo93738d(i11);
                            }
                        } else {
                            C3186e c3186e4 = this.f89777b;
                            f11 = c3186e4.f13531f.f89780e.f89729g;
                            m16129x = c3186e4.m16129x();
                        }
                        f12 = f11 * m16129x;
                        i11 = (int) (f12 + 0.5f);
                        this.f89780e.mo93738d(i11);
                    } else {
                        C17705n c17705n = c3186e2.f13531f;
                        C17697f c17697f = c17705n.f89783h;
                        C17697f c17697f2 = c17705n.f89784i;
                        if (c3186e2.f13508Q.f13460f != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c3186e2.f13510R.f13460f != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c3186e2.f13512S.f13460f != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c3186e2.f13514T.f13460f != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int m16131y2 = c3186e2.m16131y();
                        if (z11 && z12 && z13 && z14) {
                            float m16129x2 = this.f89777b.m16129x();
                            if (c17697f.f89732j && c17697f2.f89732j) {
                                C17697f c17697f3 = this.f89783h;
                                if (c17697f3.f89725c && this.f89784i.f89725c) {
                                    m93754q(f89748k, ((C17697f) c17697f3.f89734l.get(0)).f89729g + this.f89783h.f89728f, ((C17697f) this.f89784i.f89734l.get(0)).f89729g - this.f89784i.f89728f, c17697f.f89729g + c17697f.f89728f, c17697f2.f89729g - c17697f2.f89728f, m16129x2, m16131y2);
                                    this.f89780e.mo93738d(f89748k[0]);
                                    this.f89777b.f13531f.f89780e.mo93738d(f89748k[1]);
                                    return;
                                }
                                return;
                            }
                            C17697f c17697f4 = this.f89783h;
                            if (c17697f4.f89732j) {
                                C17697f c17697f5 = this.f89784i;
                                if (c17697f5.f89732j) {
                                    if (c17697f.f89725c && c17697f2.f89725c) {
                                        m93754q(f89748k, c17697f4.f89729g + c17697f4.f89728f, c17697f5.f89729g - c17697f5.f89728f, ((C17697f) c17697f.f89734l.get(0)).f89729g + c17697f.f89728f, ((C17697f) c17697f2.f89734l.get(0)).f89729g - c17697f2.f89728f, m16129x2, m16131y2);
                                        this.f89780e.mo93738d(f89748k[0]);
                                        this.f89777b.f13531f.f89780e.mo93738d(f89748k[1]);
                                    } else {
                                        return;
                                    }
                                }
                            }
                            C17697f c17697f6 = this.f89783h;
                            if (c17697f6.f89725c && this.f89784i.f89725c && c17697f.f89725c && c17697f2.f89725c) {
                                m93754q(f89748k, ((C17697f) c17697f6.f89734l.get(0)).f89729g + this.f89783h.f89728f, ((C17697f) this.f89784i.f89734l.get(0)).f89729g - this.f89784i.f89728f, ((C17697f) c17697f.f89734l.get(0)).f89729g + c17697f.f89728f, ((C17697f) c17697f2.f89734l.get(0)).f89729g - c17697f2.f89728f, m16129x2, m16131y2);
                                this.f89780e.mo93738d(f89748k[0]);
                                this.f89777b.f13531f.f89780e.mo93738d(f89748k[1]);
                            } else {
                                return;
                            }
                        } else if (z11 && z13) {
                            if (this.f89783h.f89725c && this.f89784i.f89725c) {
                                float m16129x3 = this.f89777b.m16129x();
                                int i15 = ((C17697f) this.f89783h.f89734l.get(0)).f89729g + this.f89783h.f89728f;
                                int i16 = ((C17697f) this.f89784i.f89734l.get(0)).f89729g - this.f89784i.f89728f;
                                if (m16131y2 != -1 && m16131y2 != 0) {
                                    if (m16131y2 == 1) {
                                        int m93774g = m93774g(i16 - i15, 0);
                                        int i17 = (int) ((m93774g / m16129x3) + 0.5f);
                                        int m93774g2 = m93774g(i17, 1);
                                        if (i17 != m93774g2) {
                                            m93774g = (int) ((m93774g2 * m16129x3) + 0.5f);
                                        }
                                        this.f89780e.mo93738d(m93774g);
                                        this.f89777b.f13531f.f89780e.mo93738d(m93774g2);
                                    }
                                } else {
                                    int m93774g3 = m93774g(i16 - i15, 0);
                                    int i18 = (int) ((m93774g3 * m16129x3) + 0.5f);
                                    int m93774g4 = m93774g(i18, 1);
                                    if (i18 != m93774g4) {
                                        m93774g3 = (int) ((m93774g4 / m16129x3) + 0.5f);
                                    }
                                    this.f89780e.mo93738d(m93774g3);
                                    this.f89777b.f13531f.f89780e.mo93738d(m93774g4);
                                }
                            } else {
                                return;
                            }
                        } else if (z12 && z14) {
                            if (c17697f.f89725c && c17697f2.f89725c) {
                                float m16129x4 = this.f89777b.m16129x();
                                int i19 = ((C17697f) c17697f.f89734l.get(0)).f89729g + c17697f.f89728f;
                                int i21 = ((C17697f) c17697f2.f89734l.get(0)).f89729g - c17697f2.f89728f;
                                if (m16131y2 != -1) {
                                    if (m16131y2 == 0) {
                                        int m93774g5 = m93774g(i21 - i19, 1);
                                        int i22 = (int) ((m93774g5 * m16129x4) + 0.5f);
                                        int m93774g6 = m93774g(i22, 0);
                                        if (i22 != m93774g6) {
                                            m93774g5 = (int) ((m93774g6 / m16129x4) + 0.5f);
                                        }
                                        this.f89780e.mo93738d(m93774g6);
                                        this.f89777b.f13531f.f89780e.mo93738d(m93774g5);
                                    }
                                }
                                int m93774g7 = m93774g(i21 - i19, 1);
                                int i23 = (int) ((m93774g7 / m16129x4) + 0.5f);
                                int m93774g8 = m93774g(i23, 0);
                                if (i23 != m93774g8) {
                                    m93774g7 = (int) ((m93774g8 * m16129x4) + 0.5f);
                                }
                                this.f89780e.mo93738d(m93774g8);
                                this.f89777b.f13531f.f89780e.mo93738d(m93774g7);
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else {
                C3186e m16048M = c3186e2.m16048M();
                if (m16048M != null) {
                    if (m16048M.f13529e.f89780e.f89732j) {
                        this.f89780e.mo93738d((int) ((r0.f89729g * this.f89777b.f13478B) + 0.5f));
                    }
                }
            }
        }
        C17697f c17697f7 = this.f89783h;
        if (c17697f7.f89725c) {
            C17697f c17697f8 = this.f89784i;
            if (c17697f8.f89725c) {
                if (c17697f7.f89732j && c17697f8.f89732j && this.f89780e.f89732j) {
                    return;
                }
                if (!this.f89780e.f89732j && this.f89779d == C3186e.b.MATCH_CONSTRAINT) {
                    C3186e c3186e5 = this.f89777b;
                    if (c3186e5.f13565w == 0 && !c3186e5.m16097k0()) {
                        C17697f c17697f9 = (C17697f) this.f89783h.f89734l.get(0);
                        C17697f c17697f10 = (C17697f) this.f89784i.f89734l.get(0);
                        int i24 = c17697f9.f89729g;
                        C17697f c17697f11 = this.f89783h;
                        int i25 = i24 + c17697f11.f89728f;
                        int i26 = c17697f10.f89729g + this.f89784i.f89728f;
                        c17697f11.mo93738d(i25);
                        this.f89784i.mo93738d(i26);
                        this.f89780e.mo93738d(i26 - i25);
                        return;
                    }
                }
                if (!this.f89780e.f89732j && this.f89779d == C3186e.b.MATCH_CONSTRAINT && this.f89776a == 1 && this.f89783h.f89734l.size() > 0 && this.f89784i.f89734l.size() > 0) {
                    C17697f c17697f12 = (C17697f) this.f89783h.f89734l.get(0);
                    int min = Math.min((((C17697f) this.f89784i.f89734l.get(0)).f89729g + this.f89784i.f89728f) - (c17697f12.f89729g + this.f89783h.f89728f), this.f89780e.f89744m);
                    C3186e c3186e6 = this.f89777b;
                    int i27 = c3186e6.f13476A;
                    int max = Math.max(c3186e6.f13571z, min);
                    if (i27 > 0) {
                        max = Math.min(i27, max);
                    }
                    this.f89780e.mo93738d(max);
                }
                if (!this.f89780e.f89732j) {
                    return;
                }
                C17697f c17697f13 = (C17697f) this.f89783h.f89734l.get(0);
                C17697f c17697f14 = (C17697f) this.f89784i.f89734l.get(0);
                int i28 = c17697f13.f89729g + this.f89783h.f89728f;
                int i29 = c17697f14.f89729g + this.f89784i.f89728f;
                float m16027A = this.f89777b.m16027A();
                if (c17697f13 == c17697f14) {
                    i28 = c17697f13.f89729g;
                    i29 = c17697f14.f89729g;
                    m16027A = 0.5f;
                }
                this.f89783h.mo93738d((int) (i28 + 0.5f + (((i29 - i28) - this.f89780e.f89729g) * m16027A)));
                this.f89784i.mo93738d(this.f89783h.f89729g + this.f89780e.f89729g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p088d1.AbstractC17707p
    /* renamed from: d */
    public void mo93717d() {
        C3186e m16048M;
        C3186e m16048M2;
        C3186e c3186e = this.f89777b;
        if (c3186e.f13521a) {
            this.f89780e.mo93738d(c3186e.m16070Y());
        }
        if (!this.f89780e.f89732j) {
            C3186e.b m16029C = this.f89777b.m16029C();
            this.f89779d = m16029C;
            if (m16029C != C3186e.b.MATCH_CONSTRAINT) {
                C3186e.b bVar = C3186e.b.MATCH_PARENT;
                if (m16029C == bVar && (m16048M2 = this.f89777b.m16048M()) != null && (m16048M2.m16029C() == C3186e.b.FIXED || m16048M2.m16029C() == bVar)) {
                    int m16070Y = (m16048M2.m16070Y() - this.f89777b.f13508Q.m16003f()) - this.f89777b.f13512S.m16003f();
                    m93772b(this.f89783h, m16048M2.f13529e.f89783h, this.f89777b.f13508Q.m16003f());
                    m93772b(this.f89784i, m16048M2.f13529e.f89784i, -this.f89777b.f13512S.m16003f());
                    this.f89780e.mo93738d(m16070Y);
                    return;
                }
                if (this.f89779d == C3186e.b.FIXED) {
                    this.f89780e.mo93738d(this.f89777b.m16070Y());
                }
            }
        } else {
            C3186e.b bVar2 = this.f89779d;
            C3186e.b bVar3 = C3186e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (m16048M = this.f89777b.m16048M()) != null && (m16048M.m16029C() == C3186e.b.FIXED || m16048M.m16029C() == bVar3)) {
                m93772b(this.f89783h, m16048M.f13529e.f89783h, this.f89777b.f13508Q.m16003f());
                m93772b(this.f89784i, m16048M.f13529e.f89784i, -this.f89777b.f13512S.m16003f());
                return;
            }
        }
        C17698g c17698g = this.f89780e;
        if (c17698g.f89732j) {
            C3186e c3186e2 = this.f89777b;
            if (c3186e2.f13521a) {
                C3185d[] c3185dArr = c3186e2.f13519Y;
                C3185d c3185d = c3185dArr[0];
                C3185d c3185d2 = c3185d.f13460f;
                if (c3185d2 != null && c3185dArr[1].f13460f != null) {
                    if (c3186e2.m16097k0()) {
                        this.f89783h.f89728f = this.f89777b.f13519Y[0].m16003f();
                        this.f89784i.f89728f = -this.f89777b.f13519Y[1].m16003f();
                        return;
                    }
                    C17697f m93775h = m93775h(this.f89777b.f13519Y[0]);
                    if (m93775h != null) {
                        m93772b(this.f89783h, m93775h, this.f89777b.f13519Y[0].m16003f());
                    }
                    C17697f m93775h2 = m93775h(this.f89777b.f13519Y[1]);
                    if (m93775h2 != null) {
                        m93772b(this.f89784i, m93775h2, -this.f89777b.f13519Y[1].m16003f());
                    }
                    this.f89783h.f89724b = true;
                    this.f89784i.f89724b = true;
                    return;
                }
                if (c3185d2 != null) {
                    C17697f m93775h3 = m93775h(c3185d);
                    if (m93775h3 != null) {
                        m93772b(this.f89783h, m93775h3, this.f89777b.f13519Y[0].m16003f());
                        m93772b(this.f89784i, this.f89783h, this.f89780e.f89729g);
                        return;
                    }
                    return;
                }
                C3185d c3185d3 = c3185dArr[1];
                if (c3185d3.f13460f != null) {
                    C17697f m93775h4 = m93775h(c3185d3);
                    if (m93775h4 != null) {
                        m93772b(this.f89784i, m93775h4, -this.f89777b.f13519Y[1].m16003f());
                        m93772b(this.f89783h, this.f89784i, -this.f89780e.f89729g);
                        return;
                    }
                    return;
                }
                if (!(c3186e2 instanceof InterfaceC3190i) && c3186e2.m16048M() != null && this.f89777b.mo16112q(C3185d.b.CENTER).f13460f == null) {
                    m93772b(this.f89783h, this.f89777b.m16048M().f13529e.f89783h, this.f89777b.m16072Z());
                    m93772b(this.f89784i, this.f89783h, this.f89780e.f89729g);
                    return;
                }
                return;
            }
        }
        if (this.f89779d == C3186e.b.MATCH_CONSTRAINT) {
            C3186e c3186e3 = this.f89777b;
            int i11 = c3186e3.f13565w;
            if (i11 != 2) {
                if (i11 == 3) {
                    if (c3186e3.f13567x == 3) {
                        this.f89783h.f89723a = this;
                        this.f89784i.f89723a = this;
                        C17705n c17705n = c3186e3.f13531f;
                        c17705n.f89783h.f89723a = this;
                        c17705n.f89784i.f89723a = this;
                        c17698g.f89723a = this;
                        if (c3186e3.m16103m0()) {
                            this.f89780e.f89734l.add(this.f89777b.f13531f.f89780e);
                            this.f89777b.f13531f.f89780e.f89733k.add(this.f89780e);
                            C17705n c17705n2 = this.f89777b.f13531f;
                            c17705n2.f89780e.f89723a = this;
                            this.f89780e.f89734l.add(c17705n2.f89783h);
                            this.f89780e.f89734l.add(this.f89777b.f13531f.f89784i);
                            this.f89777b.f13531f.f89783h.f89733k.add(this.f89780e);
                            this.f89777b.f13531f.f89784i.f89733k.add(this.f89780e);
                        } else if (this.f89777b.m16097k0()) {
                            this.f89777b.f13531f.f89780e.f89734l.add(this.f89780e);
                            this.f89780e.f89733k.add(this.f89777b.f13531f.f89780e);
                        } else {
                            this.f89777b.f13531f.f89780e.f89734l.add(this.f89780e);
                        }
                    } else {
                        C17698g c17698g2 = c3186e3.f13531f.f89780e;
                        c17698g.f89734l.add(c17698g2);
                        c17698g2.f89733k.add(this.f89780e);
                        this.f89777b.f13531f.f89783h.f89733k.add(this.f89780e);
                        this.f89777b.f13531f.f89784i.f89733k.add(this.f89780e);
                        C17698g c17698g3 = this.f89780e;
                        c17698g3.f89724b = true;
                        c17698g3.f89733k.add(this.f89783h);
                        this.f89780e.f89733k.add(this.f89784i);
                        this.f89783h.f89734l.add(this.f89780e);
                        this.f89784i.f89734l.add(this.f89780e);
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
        }
        C3186e c3186e4 = this.f89777b;
        C3185d[] c3185dArr2 = c3186e4.f13519Y;
        C3185d c3185d4 = c3185dArr2[0];
        C3185d c3185d5 = c3185d4.f13460f;
        if (c3185d5 != null && c3185dArr2[1].f13460f != null) {
            if (c3186e4.m16097k0()) {
                this.f89783h.f89728f = this.f89777b.f13519Y[0].m16003f();
                this.f89784i.f89728f = -this.f89777b.f13519Y[1].m16003f();
                return;
            }
            C17697f m93775h5 = m93775h(this.f89777b.f13519Y[0]);
            C17697f m93775h6 = m93775h(this.f89777b.f13519Y[1]);
            if (m93775h5 != null) {
                m93775h5.m93736b(this);
            }
            if (m93775h6 != null) {
                m93775h6.m93736b(this);
            }
            this.f89785j = AbstractC17707p.b.CENTER;
            return;
        }
        if (c3185d5 != null) {
            C17697f m93775h7 = m93775h(c3185d4);
            if (m93775h7 != null) {
                m93772b(this.f89783h, m93775h7, this.f89777b.f13519Y[0].m16003f());
                m93773c(this.f89784i, this.f89783h, 1, this.f89780e);
                return;
            }
            return;
        }
        C3185d c3185d6 = c3185dArr2[1];
        if (c3185d6.f13460f != null) {
            C17697f m93775h8 = m93775h(c3185d6);
            if (m93775h8 != null) {
                m93772b(this.f89784i, m93775h8, -this.f89777b.f13519Y[1].m16003f());
                m93773c(this.f89783h, this.f89784i, -1, this.f89780e);
                return;
            }
            return;
        }
        if (!(c3186e4 instanceof InterfaceC3190i) && c3186e4.m16048M() != null) {
            m93772b(this.f89783h, this.f89777b.m16048M().f13529e.f89783h, this.f89777b.m16072Z());
            m93773c(this.f89784i, this.f89783h, 1, this.f89780e);
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: e */
    public void mo93718e() {
        C17697f c17697f = this.f89783h;
        if (c17697f.f89732j) {
            this.f89777b.m16111p1(c17697f.f89729g);
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: f */
    public void mo93719f() {
        this.f89778c = null;
        this.f89783h.m93737c();
        this.f89784i.m93737c();
        this.f89780e.m93737c();
        this.f89782g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p088d1.AbstractC17707p
    /* renamed from: m */
    public boolean mo93721m() {
        if (this.f89779d != C3186e.b.MATCH_CONSTRAINT || this.f89777b.f13565w == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void m93755r() {
        this.f89782g = false;
        this.f89783h.m93737c();
        this.f89783h.f89732j = false;
        this.f89784i.m93737c();
        this.f89784i.f89732j = false;
        this.f89780e.f89732j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f89777b.m16125v();
    }
}
