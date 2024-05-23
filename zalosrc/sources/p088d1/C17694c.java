package p088d1;

import java.util.ArrayList;
import java.util.Iterator;
import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.C3187f;

/* renamed from: d1.c */
/* loaded from: classes2.dex */
public class C17694c extends AbstractC17707p {

    /* renamed from: k */
    ArrayList f89712k;

    /* renamed from: l */
    private int f89713l;

    public C17694c(C3186e c3186e, int i11) {
        super(c3186e);
        this.f89712k = new ArrayList();
        this.f89781f = i11;
        m93713q();
    }

    /* renamed from: q */
    private void m93713q() {
        C3186e c3186e;
        int m16062U;
        C3186e c3186e2 = this.f89777b;
        C3186e m16050N = c3186e2.m16050N(this.f89781f);
        while (true) {
            C3186e c3186e3 = m16050N;
            c3186e = c3186e2;
            c3186e2 = c3186e3;
            if (c3186e2 == null) {
                break;
            } else {
                m16050N = c3186e2.m16050N(this.f89781f);
            }
        }
        this.f89777b = c3186e;
        this.f89712k.add(c3186e.m16054P(this.f89781f));
        C3186e m16046L = c3186e.m16046L(this.f89781f);
        while (m16046L != null) {
            this.f89712k.add(m16046L.m16054P(this.f89781f));
            m16046L = m16046L.m16046L(this.f89781f);
        }
        Iterator it = this.f89712k.iterator();
        while (it.hasNext()) {
            AbstractC17707p abstractC17707p = (AbstractC17707p) it.next();
            int i11 = this.f89781f;
            if (i11 == 0) {
                abstractC17707p.f89777b.f13525c = this;
            } else if (i11 == 1) {
                abstractC17707p.f89777b.f13527d = this;
            }
        }
        if (this.f89781f == 0 && ((C3187f) this.f89777b.m16048M()).m16155S1() && this.f89712k.size() > 1) {
            ArrayList arrayList = this.f89712k;
            this.f89777b = ((AbstractC17707p) arrayList.get(arrayList.size() - 1)).f89777b;
        }
        if (this.f89781f == 0) {
            m16062U = this.f89777b.m16028B();
        } else {
            m16062U = this.f89777b.m16062U();
        }
        this.f89713l = m16062U;
    }

    /* renamed from: r */
    private C3186e m93714r() {
        for (int i11 = 0; i11 < this.f89712k.size(); i11++) {
            AbstractC17707p abstractC17707p = (AbstractC17707p) this.f89712k.get(i11);
            if (abstractC17707p.f89777b.m16068X() != 8) {
                return abstractC17707p.f89777b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C3186e m93715s() {
        for (int size = this.f89712k.size() - 1; size >= 0; size--) {
            AbstractC17707p abstractC17707p = (AbstractC17707p) this.f89712k.get(size);
            if (abstractC17707p.f89777b.m16068X() != 8) {
                return abstractC17707p.f89777b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0400, code lost:            r7 = r7 - r10;     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // p088d1.AbstractC17707p, p088d1.InterfaceC17695d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo93716a(InterfaceC17695d interfaceC17695d) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        boolean z12;
        int i16;
        int i17;
        int i18;
        float m16060T;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f12;
        boolean z13;
        int i28;
        int i29;
        int i31;
        int i32;
        boolean z14;
        int i33;
        int i34;
        if (this.f89783h.f89732j && this.f89784i.f89732j) {
            C3186e m16048M = this.f89777b.m16048M();
            if (m16048M instanceof C3187f) {
                z11 = ((C3187f) m16048M).m16155S1();
            } else {
                z11 = false;
            }
            int i35 = this.f89784i.f89729g - this.f89783h.f89729g;
            int size = this.f89712k.size();
            int i36 = 0;
            while (true) {
                i11 = -1;
                i12 = 8;
                if (i36 < size) {
                    if (((AbstractC17707p) this.f89712k.get(i36)).f89777b.m16068X() != 8) {
                        break;
                    } else {
                        i36++;
                    }
                } else {
                    i36 = -1;
                    break;
                }
            }
            int i37 = size - 1;
            int i38 = i37;
            while (true) {
                if (i38 < 0) {
                    break;
                }
                if (((AbstractC17707p) this.f89712k.get(i38)).f89777b.m16068X() != 8) {
                    i11 = i38;
                    break;
                }
                i38--;
            }
            int i39 = 0;
            while (i39 < 2) {
                int i41 = 0;
                i14 = 0;
                i15 = 0;
                int i42 = 0;
                f11 = 0.0f;
                while (i41 < size) {
                    AbstractC17707p abstractC17707p = (AbstractC17707p) this.f89712k.get(i41);
                    if (abstractC17707p.f89777b.m16068X() != i12) {
                        i42++;
                        if (i41 > 0 && i41 >= i36) {
                            i14 += abstractC17707p.f89783h.f89728f;
                        }
                        C17698g c17698g = abstractC17707p.f89780e;
                        int i43 = c17698g.f89729g;
                        if (abstractC17707p.f89779d != C3186e.b.MATCH_CONSTRAINT) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            int i44 = this.f89781f;
                            if (i44 == 0 && !abstractC17707p.f89777b.f13529e.f89780e.f89732j) {
                                return;
                            }
                            if (i44 == 1 && !abstractC17707p.f89777b.f13531f.f89780e.f89732j) {
                                return;
                            } else {
                                i33 = i43;
                            }
                        } else {
                            i33 = i43;
                            if (abstractC17707p.f89776a == 1 && i39 == 0) {
                                i34 = c17698g.f89744m;
                                i15++;
                            } else if (c17698g.f89732j) {
                                i34 = i33;
                            }
                            z14 = true;
                            if (z14) {
                                i15++;
                                float f13 = abstractC17707p.f89777b.f13501M0[this.f89781f];
                                if (f13 >= 0.0f) {
                                    f11 += f13;
                                }
                            } else {
                                i14 += i34;
                            }
                            if (i41 < i37 && i41 < i11) {
                                i14 += -abstractC17707p.f89784i.f89728f;
                            }
                        }
                        i34 = i33;
                        if (z14) {
                        }
                        if (i41 < i37) {
                            i14 += -abstractC17707p.f89784i.f89728f;
                        }
                    }
                    i41++;
                    i12 = 8;
                }
                if (i14 >= i35 && i15 != 0) {
                    i39++;
                    i12 = 8;
                } else {
                    i13 = i42;
                    break;
                }
            }
            i13 = 0;
            i14 = 0;
            i15 = 0;
            f11 = 0.0f;
            int i45 = this.f89783h.f89729g;
            if (z11) {
                i45 = this.f89784i.f89729g;
            }
            if (i14 > i35) {
                if (z11) {
                    i45 += (int) (((i14 - i35) / 2.0f) + 0.5f);
                } else {
                    i45 -= (int) (((i14 - i35) / 2.0f) + 0.5f);
                }
            }
            if (i15 > 0) {
                float f14 = i35 - i14;
                int i46 = (int) ((f14 / i15) + 0.5f);
                int i47 = 0;
                int i48 = 0;
                while (i47 < size) {
                    AbstractC17707p abstractC17707p2 = (AbstractC17707p) this.f89712k.get(i47);
                    int i49 = i46;
                    int i51 = i14;
                    if (abstractC17707p2.f89777b.m16068X() != 8 && abstractC17707p2.f89779d == C3186e.b.MATCH_CONSTRAINT) {
                        C17698g c17698g2 = abstractC17707p2.f89780e;
                        if (!c17698g2.f89732j) {
                            if (f11 > 0.0f) {
                                i26 = i45;
                                i27 = (int) (((abstractC17707p2.f89777b.f13501M0[this.f89781f] * f14) / f11) + 0.5f);
                            } else {
                                i26 = i45;
                                i27 = i49;
                            }
                            if (this.f89781f == 0) {
                                C3186e c3186e = abstractC17707p2.f89777b;
                                f12 = f14;
                                i29 = c3186e.f13476A;
                                i28 = c3186e.f13571z;
                                z13 = z11;
                            } else {
                                f12 = f14;
                                C3186e c3186e2 = abstractC17707p2.f89777b;
                                int i52 = c3186e2.f13482D;
                                z13 = z11;
                                i28 = c3186e2.f13480C;
                                i29 = i52;
                            }
                            i31 = i13;
                            if (abstractC17707p2.f89776a == 1) {
                                i32 = Math.min(i27, c17698g2.f89744m);
                            } else {
                                i32 = i27;
                            }
                            int max = Math.max(i28, i32);
                            if (i29 > 0) {
                                max = Math.min(i29, max);
                            }
                            if (max != i27) {
                                i48++;
                                i27 = max;
                            }
                            abstractC17707p2.f89780e.mo93738d(i27);
                            i47++;
                            i46 = i49;
                            i14 = i51;
                            i45 = i26;
                            f14 = f12;
                            z11 = z13;
                            i13 = i31;
                        }
                    }
                    z13 = z11;
                    i31 = i13;
                    i26 = i45;
                    f12 = f14;
                    i47++;
                    i46 = i49;
                    i14 = i51;
                    i45 = i26;
                    f14 = f12;
                    z11 = z13;
                    i13 = i31;
                }
                z12 = z11;
                i16 = i13;
                i17 = i45;
                int i53 = i14;
                if (i48 > 0) {
                    i15 -= i48;
                    i14 = 0;
                    for (int i54 = 0; i54 < size; i54++) {
                        AbstractC17707p abstractC17707p3 = (AbstractC17707p) this.f89712k.get(i54);
                        if (abstractC17707p3.f89777b.m16068X() != 8) {
                            if (i54 > 0 && i54 >= i36) {
                                i14 += abstractC17707p3.f89783h.f89728f;
                            }
                            i14 += abstractC17707p3.f89780e.f89729g;
                            if (i54 < i37 && i54 < i11) {
                                i14 += -abstractC17707p3.f89784i.f89728f;
                            }
                        }
                    }
                } else {
                    i14 = i53;
                }
                i18 = 2;
                if (this.f89713l == 2 && i48 == 0) {
                    this.f89713l = 0;
                }
            } else {
                z12 = z11;
                i16 = i13;
                i17 = i45;
                i18 = 2;
            }
            if (i14 > i35) {
                this.f89713l = i18;
            }
            if (i16 > 0 && i15 == 0 && i36 == i11) {
                this.f89713l = i18;
            }
            int i55 = this.f89713l;
            if (i55 == 1) {
                int i56 = i16;
                if (i56 > 1) {
                    i24 = (i35 - i14) / (i56 - 1);
                } else if (i56 == 1) {
                    i24 = (i35 - i14) / 2;
                } else {
                    i24 = 0;
                }
                if (i15 > 0) {
                    i24 = 0;
                }
                int i57 = i17;
                for (int i58 = 0; i58 < size; i58++) {
                    if (z12) {
                        i25 = size - (i58 + 1);
                    } else {
                        i25 = i58;
                    }
                    AbstractC17707p abstractC17707p4 = (AbstractC17707p) this.f89712k.get(i25);
                    if (abstractC17707p4.f89777b.m16068X() == 8) {
                        abstractC17707p4.f89783h.mo93738d(i57);
                        abstractC17707p4.f89784i.mo93738d(i57);
                    } else {
                        if (i58 > 0) {
                            if (z12) {
                                i57 -= i24;
                            } else {
                                i57 += i24;
                            }
                        }
                        if (i58 > 0 && i58 >= i36) {
                            if (z12) {
                                i57 -= abstractC17707p4.f89783h.f89728f;
                            } else {
                                i57 += abstractC17707p4.f89783h.f89728f;
                            }
                        }
                        if (z12) {
                            abstractC17707p4.f89784i.mo93738d(i57);
                        } else {
                            abstractC17707p4.f89783h.mo93738d(i57);
                        }
                        C17698g c17698g3 = abstractC17707p4.f89780e;
                        int i59 = c17698g3.f89729g;
                        if (abstractC17707p4.f89779d == C3186e.b.MATCH_CONSTRAINT && abstractC17707p4.f89776a == 1) {
                            i59 = c17698g3.f89744m;
                        }
                        if (z12) {
                            i57 -= i59;
                        } else {
                            i57 += i59;
                        }
                        if (z12) {
                            abstractC17707p4.f89783h.mo93738d(i57);
                        } else {
                            abstractC17707p4.f89784i.mo93738d(i57);
                        }
                        abstractC17707p4.f89782g = true;
                        if (i58 < i37 && i58 < i11) {
                            if (z12) {
                                i57 -= -abstractC17707p4.f89784i.f89728f;
                            } else {
                                i57 += -abstractC17707p4.f89784i.f89728f;
                            }
                        }
                    }
                }
                return;
            }
            int i61 = i16;
            if (i55 == 0) {
                int i62 = (i35 - i14) / (i61 + 1);
                if (i15 > 0) {
                    i62 = 0;
                }
                int i63 = i17;
                for (int i64 = 0; i64 < size; i64++) {
                    if (z12) {
                        i22 = size - (i64 + 1);
                    } else {
                        i22 = i64;
                    }
                    AbstractC17707p abstractC17707p5 = (AbstractC17707p) this.f89712k.get(i22);
                    if (abstractC17707p5.f89777b.m16068X() == 8) {
                        abstractC17707p5.f89783h.mo93738d(i63);
                        abstractC17707p5.f89784i.mo93738d(i63);
                    } else {
                        if (z12) {
                            i23 = i63 - i62;
                        } else {
                            i23 = i63 + i62;
                        }
                        if (i64 > 0 && i64 >= i36) {
                            if (z12) {
                                i23 -= abstractC17707p5.f89783h.f89728f;
                            } else {
                                i23 += abstractC17707p5.f89783h.f89728f;
                            }
                        }
                        if (z12) {
                            abstractC17707p5.f89784i.mo93738d(i23);
                        } else {
                            abstractC17707p5.f89783h.mo93738d(i23);
                        }
                        C17698g c17698g4 = abstractC17707p5.f89780e;
                        int i65 = c17698g4.f89729g;
                        if (abstractC17707p5.f89779d == C3186e.b.MATCH_CONSTRAINT && abstractC17707p5.f89776a == 1) {
                            i65 = Math.min(i65, c17698g4.f89744m);
                        }
                        if (z12) {
                            i63 = i23 - i65;
                        } else {
                            i63 = i23 + i65;
                        }
                        if (z12) {
                            abstractC17707p5.f89783h.mo93738d(i63);
                        } else {
                            abstractC17707p5.f89784i.mo93738d(i63);
                        }
                        if (i64 < i37 && i64 < i11) {
                            if (z12) {
                                i63 -= -abstractC17707p5.f89784i.f89728f;
                            } else {
                                i63 += -abstractC17707p5.f89784i.f89728f;
                            }
                        }
                    }
                }
                return;
            }
            if (i55 == 2) {
                if (this.f89781f == 0) {
                    m16060T = this.f89777b.m16027A();
                } else {
                    m16060T = this.f89777b.m16060T();
                }
                if (z12) {
                    m16060T = 1.0f - m16060T;
                }
                int i66 = (int) (((i35 - i14) * m16060T) + 0.5f);
                if (i66 < 0 || i15 > 0) {
                    i66 = 0;
                }
                if (z12) {
                    i19 = i17 - i66;
                } else {
                    i19 = i17 + i66;
                }
                for (int i67 = 0; i67 < size; i67++) {
                    if (z12) {
                        i21 = size - (i67 + 1);
                    } else {
                        i21 = i67;
                    }
                    AbstractC17707p abstractC17707p6 = (AbstractC17707p) this.f89712k.get(i21);
                    if (abstractC17707p6.f89777b.m16068X() == 8) {
                        abstractC17707p6.f89783h.mo93738d(i19);
                        abstractC17707p6.f89784i.mo93738d(i19);
                    } else {
                        if (i67 > 0 && i67 >= i36) {
                            if (z12) {
                                i19 -= abstractC17707p6.f89783h.f89728f;
                            } else {
                                i19 += abstractC17707p6.f89783h.f89728f;
                            }
                        }
                        if (z12) {
                            abstractC17707p6.f89784i.mo93738d(i19);
                        } else {
                            abstractC17707p6.f89783h.mo93738d(i19);
                        }
                        C17698g c17698g5 = abstractC17707p6.f89780e;
                        int i68 = c17698g5.f89729g;
                        if (abstractC17707p6.f89779d == C3186e.b.MATCH_CONSTRAINT && abstractC17707p6.f89776a == 1) {
                            i68 = c17698g5.f89744m;
                        }
                        i19 += i68;
                        if (z12) {
                            abstractC17707p6.f89783h.mo93738d(i19);
                        } else {
                            abstractC17707p6.f89784i.mo93738d(i19);
                        }
                        if (i67 < i37 && i67 < i11) {
                            if (z12) {
                                i19 -= -abstractC17707p6.f89784i.f89728f;
                            } else {
                                i19 += -abstractC17707p6.f89784i.f89728f;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: d */
    public void mo93717d() {
        Iterator it = this.f89712k.iterator();
        while (it.hasNext()) {
            ((AbstractC17707p) it.next()).mo93717d();
        }
        int size = this.f89712k.size();
        if (size < 1) {
            return;
        }
        C3186e c3186e = ((AbstractC17707p) this.f89712k.get(0)).f89777b;
        C3186e c3186e2 = ((AbstractC17707p) this.f89712k.get(size - 1)).f89777b;
        if (this.f89781f == 0) {
            C3185d c3185d = c3186e.f13508Q;
            C3185d c3185d2 = c3186e2.f13512S;
            C17697f m93776i = m93776i(c3185d, 0);
            int m16003f = c3185d.m16003f();
            C3186e m93714r = m93714r();
            if (m93714r != null) {
                m16003f = m93714r.f13508Q.m16003f();
            }
            if (m93776i != null) {
                m93772b(this.f89783h, m93776i, m16003f);
            }
            C17697f m93776i2 = m93776i(c3185d2, 0);
            int m16003f2 = c3185d2.m16003f();
            C3186e m93715s = m93715s();
            if (m93715s != null) {
                m16003f2 = m93715s.f13512S.m16003f();
            }
            if (m93776i2 != null) {
                m93772b(this.f89784i, m93776i2, -m16003f2);
            }
        } else {
            C3185d c3185d3 = c3186e.f13510R;
            C3185d c3185d4 = c3186e2.f13514T;
            C17697f m93776i3 = m93776i(c3185d3, 1);
            int m16003f3 = c3185d3.m16003f();
            C3186e m93714r2 = m93714r();
            if (m93714r2 != null) {
                m16003f3 = m93714r2.f13510R.m16003f();
            }
            if (m93776i3 != null) {
                m93772b(this.f89783h, m93776i3, m16003f3);
            }
            C17697f m93776i4 = m93776i(c3185d4, 1);
            int m16003f4 = c3185d4.m16003f();
            C3186e m93715s2 = m93715s();
            if (m93715s2 != null) {
                m16003f4 = m93715s2.f13514T.m16003f();
            }
            if (m93776i4 != null) {
                m93772b(this.f89784i, m93776i4, -m16003f4);
            }
        }
        this.f89783h.f89723a = this;
        this.f89784i.f89723a = this;
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: e */
    public void mo93718e() {
        for (int i11 = 0; i11 < this.f89712k.size(); i11++) {
            ((AbstractC17707p) this.f89712k.get(i11)).mo93718e();
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: f */
    public void mo93719f() {
        this.f89778c = null;
        Iterator it = this.f89712k.iterator();
        while (it.hasNext()) {
            ((AbstractC17707p) it.next()).mo93719f();
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: j */
    public long mo93720j() {
        int size = this.f89712k.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j11 = j11 + r4.f89783h.f89728f + ((AbstractC17707p) this.f89712k.get(i11)).mo93720j() + r4.f89784i.f89728f;
        }
        return j11;
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: m */
    public boolean mo93721m() {
        int size = this.f89712k.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!((AbstractC17707p) this.f89712k.get(i11)).mo93721m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f89781f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator it = this.f89712k.iterator();
        while (it.hasNext()) {
            AbstractC17707p abstractC17707p = (AbstractC17707p) it.next();
            sb2.append("<");
            sb2.append(abstractC17707p);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
