package p088d1;

import p045c1.C3185d;
import p045c1.C3186e;

/* renamed from: d1.p */
/* loaded from: classes2.dex */
public abstract class AbstractC17707p implements InterfaceC17695d {

    /* renamed from: a */
    public int f89776a;

    /* renamed from: b */
    C3186e f89777b;

    /* renamed from: c */
    C17704m f89778c;

    /* renamed from: d */
    protected C3186e.b f89779d;

    /* renamed from: e */
    C17698g f89780e = new C17698g(this);

    /* renamed from: f */
    public int f89781f = 0;

    /* renamed from: g */
    boolean f89782g = false;

    /* renamed from: h */
    public C17697f f89783h = new C17697f(this);

    /* renamed from: i */
    public C17697f f89784i = new C17697f(this);

    /* renamed from: j */
    protected b f89785j = b.NONE;

    /* renamed from: d1.p$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f89786a;

        static {
            int[] iArr = new int[C3185d.b.values().length];
            f89786a = iArr;
            try {
                iArr[C3185d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89786a[C3185d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89786a[C3185d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89786a[C3185d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89786a[C3185d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d1.p$b */
    /* loaded from: classes2.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC17707p(C3186e c3186e) {
        this.f89777b = c3186e;
    }

    /* renamed from: l */
    private void m93771l(int i11, int i12) {
        AbstractC17707p abstractC17707p;
        float f11;
        int i13;
        int i14 = this.f89776a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        C3186e c3186e = this.f89777b;
                        AbstractC17707p abstractC17707p2 = c3186e.f13529e;
                        C3186e.b bVar = abstractC17707p2.f89779d;
                        C3186e.b bVar2 = C3186e.b.MATCH_CONSTRAINT;
                        if (bVar == bVar2 && abstractC17707p2.f89776a == 3) {
                            C17705n c17705n = c3186e.f13531f;
                            if (c17705n.f89779d == bVar2 && c17705n.f89776a == 3) {
                                return;
                            }
                        }
                        if (i11 == 0) {
                            abstractC17707p2 = c3186e.f13531f;
                        }
                        if (abstractC17707p2.f89780e.f89732j) {
                            float m16129x = c3186e.m16129x();
                            if (i11 == 1) {
                                i13 = (int) ((abstractC17707p2.f89780e.f89729g / m16129x) + 0.5f);
                            } else {
                                i13 = (int) ((m16129x * abstractC17707p2.f89780e.f89729g) + 0.5f);
                            }
                            this.f89780e.mo93738d(i13);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C3186e m16048M = this.f89777b.m16048M();
                if (m16048M != null) {
                    if (i11 == 0) {
                        abstractC17707p = m16048M.f13529e;
                    } else {
                        abstractC17707p = m16048M.f13531f;
                    }
                    if (abstractC17707p.f89780e.f89732j) {
                        C3186e c3186e2 = this.f89777b;
                        if (i11 == 0) {
                            f11 = c3186e2.f13478B;
                        } else {
                            f11 = c3186e2.f13484E;
                        }
                        this.f89780e.mo93738d(m93774g((int) ((r9.f89729g * f11) + 0.5f), i11));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f89780e.mo93738d(Math.min(m93774g(this.f89780e.f89744m, i11), i12));
            return;
        }
        this.f89780e.mo93738d(m93774g(i12, i11));
    }

    @Override // p088d1.InterfaceC17695d
    /* renamed from: a */
    public abstract void mo93716a(InterfaceC17695d interfaceC17695d);

    /* renamed from: b */
    public final void m93772b(C17697f c17697f, C17697f c17697f2, int i11) {
        c17697f.f89734l.add(c17697f2);
        c17697f.f89728f = i11;
        c17697f2.f89733k.add(c17697f);
    }

    /* renamed from: c */
    public final void m93773c(C17697f c17697f, C17697f c17697f2, int i11, C17698g c17698g) {
        c17697f.f89734l.add(c17697f2);
        c17697f.f89734l.add(this.f89780e);
        c17697f.f89730h = i11;
        c17697f.f89731i = c17698g;
        c17697f2.f89733k.add(c17697f);
        c17698g.f89733k.add(c17697f);
    }

    /* renamed from: d */
    public abstract void mo93717d();

    /* renamed from: e */
    public abstract void mo93718e();

    /* renamed from: f */
    public abstract void mo93719f();

    /* renamed from: g */
    public final int m93774g(int i11, int i12) {
        int max;
        if (i12 == 0) {
            C3186e c3186e = this.f89777b;
            int i13 = c3186e.f13476A;
            max = Math.max(c3186e.f13571z, i11);
            if (i13 > 0) {
                max = Math.min(i13, i11);
            }
            if (max == i11) {
                return i11;
            }
        } else {
            C3186e c3186e2 = this.f89777b;
            int i14 = c3186e2.f13482D;
            max = Math.max(c3186e2.f13480C, i11);
            if (i14 > 0) {
                max = Math.min(i14, i11);
            }
            if (max == i11) {
                return i11;
            }
        }
        return max;
    }

    /* renamed from: h */
    public final C17697f m93775h(C3185d c3185d) {
        C3185d c3185d2 = c3185d.f13460f;
        if (c3185d2 == null) {
            return null;
        }
        C3186e c3186e = c3185d2.f13458d;
        int i11 = a.f89786a[c3185d2.f13459e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return c3186e.f13531f.f89784i;
                    }
                    return c3186e.f13531f.f89758k;
                }
                return c3186e.f13531f.f89783h;
            }
            return c3186e.f13529e.f89784i;
        }
        return c3186e.f13529e.f89783h;
    }

    /* renamed from: i */
    public final C17697f m93776i(C3185d c3185d, int i11) {
        AbstractC17707p abstractC17707p;
        C3185d c3185d2 = c3185d.f13460f;
        if (c3185d2 == null) {
            return null;
        }
        C3186e c3186e = c3185d2.f13458d;
        if (i11 == 0) {
            abstractC17707p = c3186e.f13529e;
        } else {
            abstractC17707p = c3186e.f13531f;
        }
        int i12 = a.f89786a[c3185d2.f13459e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return abstractC17707p.f89784i;
        }
        return abstractC17707p.f89783h;
    }

    /* renamed from: j */
    public long mo93720j() {
        if (this.f89780e.f89732j) {
            return r0.f89729g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m93777k() {
        return this.f89782g;
    }

    /* renamed from: m */
    public abstract boolean mo93721m();

    /* renamed from: n */
    public void m93778n(InterfaceC17695d interfaceC17695d, C3185d c3185d, C3185d c3185d2, int i11) {
        float m16060T;
        C17697f m93775h = m93775h(c3185d);
        C17697f m93775h2 = m93775h(c3185d2);
        if (m93775h.f89732j && m93775h2.f89732j) {
            int m16003f = m93775h.f89729g + c3185d.m16003f();
            int m16003f2 = m93775h2.f89729g - c3185d2.m16003f();
            int i12 = m16003f2 - m16003f;
            if (!this.f89780e.f89732j && this.f89779d == C3186e.b.MATCH_CONSTRAINT) {
                m93771l(i11, i12);
            }
            C17698g c17698g = this.f89780e;
            if (!c17698g.f89732j) {
                return;
            }
            if (c17698g.f89729g == i12) {
                this.f89783h.mo93738d(m16003f);
                this.f89784i.mo93738d(m16003f2);
                return;
            }
            C3186e c3186e = this.f89777b;
            if (i11 == 0) {
                m16060T = c3186e.m16027A();
            } else {
                m16060T = c3186e.m16060T();
            }
            if (m93775h == m93775h2) {
                m16003f = m93775h.f89729g;
                m16003f2 = m93775h2.f89729g;
                m16060T = 0.5f;
            }
            this.f89783h.mo93738d((int) (m16003f + 0.5f + (((m16003f2 - m16003f) - this.f89780e.f89729g) * m16060T)));
            this.f89784i.mo93738d(this.f89783h.f89729g + this.f89780e.f89729g);
        }
    }

    /* renamed from: o */
    public void m93779o(InterfaceC17695d interfaceC17695d) {
    }

    /* renamed from: p */
    public void m93780p(InterfaceC17695d interfaceC17695d) {
    }
}
