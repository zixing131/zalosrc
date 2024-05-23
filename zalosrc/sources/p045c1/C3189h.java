package p045c1;

import java.util.HashMap;
import p045c1.C3185d;
import p045c1.C3186e;
import p700z0.C31133d;
import p700z0.C31138i;

/* renamed from: c1.h */
/* loaded from: classes2.dex */
public class C3189h extends C3186e {

    /* renamed from: U0 */
    protected float f13653U0 = -1.0f;

    /* renamed from: V0 */
    protected int f13654V0 = -1;

    /* renamed from: W0 */
    protected int f13655W0 = -1;

    /* renamed from: X0 */
    protected boolean f13656X0 = true;

    /* renamed from: Y0 */
    private C3185d f13657Y0 = this.f13510R;

    /* renamed from: Z0 */
    private int f13658Z0 = 0;

    /* renamed from: a1 */
    private int f13659a1 = 0;

    /* renamed from: b1 */
    private boolean f13660b1;

    /* renamed from: c1.h$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13661a;

        static {
            int[] iArr = new int[C3185d.b.values().length];
            f13661a = iArr;
            try {
                iArr[C3185d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13661a[C3185d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13661a[C3185d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13661a[C3185d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13661a[C3185d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13661a[C3185d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13661a[C3185d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13661a[C3185d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13661a[C3185d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C3189h() {
        this.f13520Z.clear();
        this.f13520Z.add(this.f13657Y0);
        int length = this.f13519Y.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f13519Y[i11] = this.f13657Y0;
        }
    }

    /* renamed from: A1 */
    public void m16225A1(int i11) {
        if (i11 > -1) {
            this.f13653U0 = -1.0f;
            this.f13654V0 = i11;
            this.f13655W0 = -1;
        }
    }

    /* renamed from: B1 */
    public void m16226B1(int i11) {
        if (i11 > -1) {
            this.f13653U0 = -1.0f;
            this.f13654V0 = -1;
            this.f13655W0 = i11;
        }
    }

    /* renamed from: C1 */
    public void m16227C1(float f11) {
        if (f11 > -1.0f) {
            this.f13653U0 = f11;
            this.f13654V0 = -1;
            this.f13655W0 = -1;
        }
    }

    /* renamed from: D1 */
    public void m16228D1(int i11) {
        if (this.f13658Z0 == i11) {
            return;
        }
        this.f13658Z0 = i11;
        this.f13520Z.clear();
        if (this.f13658Z0 == 1) {
            this.f13657Y0 = this.f13508Q;
        } else {
            this.f13657Y0 = this.f13510R;
        }
        this.f13520Z.add(this.f13657Y0);
        int length = this.f13519Y.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f13519Y[i12] = this.f13657Y0;
        }
    }

    @Override // p045c1.C3186e
    /* renamed from: g */
    public void mo15984g(C31133d c31133d, boolean z11) {
        boolean z12;
        C3187f c3187f = (C3187f) m16048M();
        if (c3187f == null) {
            return;
        }
        C3185d mo16112q = c3187f.mo16112q(C3185d.b.LEFT);
        C3185d mo16112q2 = c3187f.mo16112q(C3185d.b.RIGHT);
        C3186e c3186e = this.f13526c0;
        boolean z13 = true;
        if (c3186e != null && c3186e.f13524b0[0] == C3186e.b.WRAP_CONTENT) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f13658Z0 == 0) {
            mo16112q = c3187f.mo16112q(C3185d.b.TOP);
            mo16112q2 = c3187f.mo16112q(C3185d.b.BOTTOM);
            C3186e c3186e2 = this.f13526c0;
            if (c3186e2 == null || c3186e2.f13524b0[1] != C3186e.b.WRAP_CONTENT) {
                z13 = false;
            }
            z12 = z13;
        }
        if (this.f13660b1 && this.f13657Y0.m16011n()) {
            C31138i m151277q = c31133d.m151277q(this.f13657Y0);
            c31133d.m151268f(m151277q, this.f13657Y0.m16002e());
            if (this.f13654V0 != -1) {
                if (z12) {
                    c31133d.m151270h(c31133d.m151277q(mo16112q2), m151277q, 0, 5);
                }
            } else if (this.f13655W0 != -1 && z12) {
                C31138i m151277q2 = c31133d.m151277q(mo16112q2);
                c31133d.m151270h(m151277q, c31133d.m151277q(mo16112q), 0, 5);
                c31133d.m151270h(m151277q2, m151277q, 0, 5);
            }
            this.f13660b1 = false;
            return;
        }
        if (this.f13654V0 != -1) {
            C31138i m151277q3 = c31133d.m151277q(this.f13657Y0);
            c31133d.m151267e(m151277q3, c31133d.m151277q(mo16112q), this.f13654V0, 8);
            if (z12) {
                c31133d.m151270h(c31133d.m151277q(mo16112q2), m151277q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f13655W0 != -1) {
            C31138i m151277q4 = c31133d.m151277q(this.f13657Y0);
            C31138i m151277q5 = c31133d.m151277q(mo16112q2);
            c31133d.m151267e(m151277q4, m151277q5, -this.f13655W0, 8);
            if (z12) {
                c31133d.m151270h(m151277q4, c31133d.m151277q(mo16112q), 0, 5);
                c31133d.m151270h(m151277q5, m151277q4, 0, 5);
                return;
            }
            return;
        }
        if (this.f13653U0 != -1.0f) {
            c31133d.m151266d(C31133d.m151258s(c31133d, c31133d.m151277q(this.f13657Y0), c31133d.m151277q(mo16112q2), this.f13653U0));
        }
    }

    @Override // p045c1.C3186e
    /* renamed from: h */
    public boolean mo15985h() {
        return true;
    }

    @Override // p045c1.C3186e
    /* renamed from: n */
    public void mo15986n(C3186e c3186e, HashMap hashMap) {
        super.mo15986n(c3186e, hashMap);
        C3189h c3189h = (C3189h) c3186e;
        this.f13653U0 = c3189h.f13653U0;
        this.f13654V0 = c3189h.f13654V0;
        this.f13655W0 = c3189h.f13655W0;
        this.f13656X0 = c3189h.f13656X0;
        m16228D1(c3189h.f13658Z0);
    }

    @Override // p045c1.C3186e
    /* renamed from: p0 */
    public boolean mo15987p0() {
        return this.f13660b1;
    }

    @Override // p045c1.C3186e
    /* renamed from: q */
    public C3185d mo16112q(C3185d.b bVar) {
        int i11 = a.f13661a[bVar.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if ((i11 == 3 || i11 == 4) && this.f13658Z0 == 0) {
                return this.f13657Y0;
            }
            return null;
        }
        if (this.f13658Z0 == 1) {
            return this.f13657Y0;
        }
        return null;
    }

    @Override // p045c1.C3186e
    /* renamed from: q0 */
    public boolean mo15988q0() {
        return this.f13660b1;
    }

    @Override // p045c1.C3186e
    /* renamed from: t1 */
    public void mo16122t1(C31133d c31133d, boolean z11) {
        if (m16048M() == null) {
            return;
        }
        int m151281x = c31133d.m151281x(this.f13657Y0);
        if (this.f13658Z0 == 1) {
            m16111p1(m151281x);
            m16113q1(0);
            m16053O0(m16048M().m16133z());
            m16106n1(0);
            return;
        }
        m16111p1(0);
        m16113q1(m151281x);
        m16106n1(m16048M().m16070Y());
        m16053O0(0);
    }

    /* renamed from: u1 */
    public C3185d m16229u1() {
        return this.f13657Y0;
    }

    /* renamed from: v1 */
    public int m16230v1() {
        return this.f13658Z0;
    }

    /* renamed from: w1 */
    public int m16231w1() {
        return this.f13654V0;
    }

    /* renamed from: x1 */
    public int m16232x1() {
        return this.f13655W0;
    }

    /* renamed from: y1 */
    public float m16233y1() {
        return this.f13653U0;
    }

    /* renamed from: z1 */
    public void m16234z1(int i11) {
        this.f13657Y0.m16017t(i11);
        this.f13660b1 = true;
    }
}
