package p045c1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p045c1.C3186e;
import p700z0.C31133d;

/* renamed from: c1.g */
/* loaded from: classes2.dex */
public class C3188g extends AbstractC3194m {

    /* renamed from: G1 */
    private C3186e[] f13616G1;

    /* renamed from: j1 */
    private int f13618j1 = -1;

    /* renamed from: k1 */
    private int f13619k1 = -1;

    /* renamed from: l1 */
    private int f13620l1 = -1;

    /* renamed from: m1 */
    private int f13621m1 = -1;

    /* renamed from: n1 */
    private int f13622n1 = -1;

    /* renamed from: o1 */
    private int f13623o1 = -1;

    /* renamed from: p1 */
    private float f13624p1 = 0.5f;

    /* renamed from: q1 */
    private float f13625q1 = 0.5f;

    /* renamed from: r1 */
    private float f13626r1 = 0.5f;

    /* renamed from: s1 */
    private float f13627s1 = 0.5f;

    /* renamed from: t1 */
    private float f13628t1 = 0.5f;

    /* renamed from: u1 */
    private float f13629u1 = 0.5f;

    /* renamed from: v1 */
    private int f13630v1 = 0;

    /* renamed from: w1 */
    private int f13631w1 = 0;

    /* renamed from: x1 */
    private int f13632x1 = 2;

    /* renamed from: y1 */
    private int f13633y1 = 2;

    /* renamed from: z1 */
    private int f13634z1 = 0;

    /* renamed from: A1 */
    private int f13610A1 = -1;

    /* renamed from: B1 */
    private int f13611B1 = 0;

    /* renamed from: C1 */
    private ArrayList f13612C1 = new ArrayList();

    /* renamed from: D1 */
    private C3186e[] f13613D1 = null;

    /* renamed from: E1 */
    private C3186e[] f13614E1 = null;

    /* renamed from: F1 */
    private int[] f13615F1 = null;

    /* renamed from: H1 */
    private int f13617H1 = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1.g$a */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a */
        private int f13635a;

        /* renamed from: d */
        private C3185d f13638d;

        /* renamed from: e */
        private C3185d f13639e;

        /* renamed from: f */
        private C3185d f13640f;

        /* renamed from: g */
        private C3185d f13641g;

        /* renamed from: h */
        private int f13642h;

        /* renamed from: i */
        private int f13643i;

        /* renamed from: j */
        private int f13644j;

        /* renamed from: k */
        private int f13645k;

        /* renamed from: q */
        private int f13651q;

        /* renamed from: b */
        private C3186e f13636b = null;

        /* renamed from: c */
        int f13637c = 0;

        /* renamed from: l */
        private int f13646l = 0;

        /* renamed from: m */
        private int f13647m = 0;

        /* renamed from: n */
        private int f13648n = 0;

        /* renamed from: o */
        private int f13649o = 0;

        /* renamed from: p */
        private int f13650p = 0;

        public a(int i11, C3185d c3185d, C3185d c3185d2, C3185d c3185d3, C3185d c3185d4, int i12) {
            this.f13642h = 0;
            this.f13643i = 0;
            this.f13644j = 0;
            this.f13645k = 0;
            this.f13651q = 0;
            this.f13635a = i11;
            this.f13638d = c3185d;
            this.f13639e = c3185d2;
            this.f13640f = c3185d3;
            this.f13641g = c3185d4;
            this.f13642h = C3188g.this.m16244C1();
            this.f13643i = C3188g.this.m16246E1();
            this.f13644j = C3188g.this.m16245D1();
            this.f13645k = C3188g.this.m16243B1();
            this.f13651q = i12;
        }

        /* renamed from: h */
        private void m16216h() {
            this.f13646l = 0;
            this.f13647m = 0;
            this.f13636b = null;
            this.f13637c = 0;
            int i11 = this.f13649o;
            for (int i12 = 0; i12 < i11 && this.f13648n + i12 < C3188g.this.f13617H1; i12++) {
                C3186e c3186e = C3188g.this.f13616G1[this.f13648n + i12];
                if (this.f13635a != 0) {
                    int m16190o2 = C3188g.this.m16190o2(c3186e, this.f13651q);
                    int m16189n2 = C3188g.this.m16189n2(c3186e, this.f13651q);
                    int i13 = C3188g.this.f13631w1;
                    if (c3186e.m16068X() == 8) {
                        i13 = 0;
                    }
                    this.f13647m += m16189n2 + i13;
                    if (this.f13636b == null || this.f13637c < m16190o2) {
                        this.f13636b = c3186e;
                        this.f13637c = m16190o2;
                        this.f13646l = m16190o2;
                    }
                } else {
                    int m16070Y = c3186e.m16070Y();
                    int i14 = C3188g.this.f13630v1;
                    if (c3186e.m16068X() == 8) {
                        i14 = 0;
                    }
                    this.f13646l += m16070Y + i14;
                    int m16189n22 = C3188g.this.m16189n2(c3186e, this.f13651q);
                    if (this.f13636b == null || this.f13637c < m16189n22) {
                        this.f13636b = c3186e;
                        this.f13637c = m16189n22;
                        this.f13647m = m16189n22;
                    }
                }
            }
        }

        /* renamed from: b */
        public void m16217b(C3186e c3186e) {
            int i11 = 0;
            if (this.f13635a == 0) {
                int m16190o2 = C3188g.this.m16190o2(c3186e, this.f13651q);
                if (c3186e.m16029C() == C3186e.b.MATCH_CONSTRAINT) {
                    this.f13650p++;
                    m16190o2 = 0;
                }
                int i12 = C3188g.this.f13630v1;
                if (c3186e.m16068X() != 8) {
                    i11 = i12;
                }
                this.f13646l += m16190o2 + i11;
                int m16189n2 = C3188g.this.m16189n2(c3186e, this.f13651q);
                if (this.f13636b == null || this.f13637c < m16189n2) {
                    this.f13636b = c3186e;
                    this.f13637c = m16189n2;
                    this.f13647m = m16189n2;
                }
            } else {
                int m16190o22 = C3188g.this.m16190o2(c3186e, this.f13651q);
                int m16189n22 = C3188g.this.m16189n2(c3186e, this.f13651q);
                if (c3186e.m16064V() == C3186e.b.MATCH_CONSTRAINT) {
                    this.f13650p++;
                    m16189n22 = 0;
                }
                int i13 = C3188g.this.f13631w1;
                if (c3186e.m16068X() != 8) {
                    i11 = i13;
                }
                this.f13647m += m16189n22 + i11;
                if (this.f13636b == null || this.f13637c < m16190o22) {
                    this.f13636b = c3186e;
                    this.f13637c = m16190o22;
                    this.f13646l = m16190o22;
                }
            }
            this.f13649o++;
        }

        /* renamed from: c */
        public void m16218c() {
            this.f13637c = 0;
            this.f13636b = null;
            this.f13646l = 0;
            this.f13647m = 0;
            this.f13648n = 0;
            this.f13649o = 0;
            this.f13650p = 0;
        }

        /* renamed from: d */
        public void m16219d(boolean z11, int i11, boolean z12) {
            boolean z13;
            C3186e c3186e;
            int i12;
            float f11;
            float f12;
            int i13;
            int i14;
            int i15 = this.f13649o;
            for (int i16 = 0; i16 < i15 && this.f13648n + i16 < C3188g.this.f13617H1; i16++) {
                C3186e c3186e2 = C3188g.this.f13616G1[this.f13648n + i16];
                if (c3186e2 != null) {
                    c3186e2.m16130x0();
                }
            }
            if (i15 != 0 && this.f13636b != null) {
                if (z12 && i11 == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i17 = -1;
                int i18 = -1;
                for (int i19 = 0; i19 < i15; i19++) {
                    if (z11) {
                        i14 = (i15 - 1) - i19;
                    } else {
                        i14 = i19;
                    }
                    if (this.f13648n + i14 >= C3188g.this.f13617H1) {
                        break;
                    }
                    C3186e c3186e3 = C3188g.this.f13616G1[this.f13648n + i14];
                    if (c3186e3 != null && c3186e3.m16068X() == 0) {
                        if (i17 == -1) {
                            i17 = i19;
                        }
                        i18 = i19;
                    }
                }
                C3186e c3186e4 = null;
                if (this.f13635a == 0) {
                    C3186e c3186e5 = this.f13636b;
                    c3186e5.m16090h1(C3188g.this.f13619k1);
                    int i21 = this.f13643i;
                    if (i11 > 0) {
                        i21 += C3188g.this.f13631w1;
                    }
                    c3186e5.f13510R.m15998a(this.f13639e, i21);
                    if (z12) {
                        c3186e5.f13514T.m15998a(this.f13641g, this.f13645k);
                    }
                    if (i11 > 0) {
                        this.f13639e.f13458d.f13514T.m15998a(c3186e5.f13510R, 0);
                    }
                    if (C3188g.this.f13633y1 == 3 && !c3186e5.m16076b0()) {
                        for (int i22 = 0; i22 < i15; i22++) {
                            if (z11) {
                                i13 = (i15 - 1) - i22;
                            } else {
                                i13 = i22;
                            }
                            if (this.f13648n + i13 >= C3188g.this.f13617H1) {
                                break;
                            }
                            c3186e = C3188g.this.f13616G1[this.f13648n + i13];
                            if (c3186e.m16076b0()) {
                                break;
                            }
                        }
                    }
                    c3186e = c3186e5;
                    int i23 = 0;
                    while (i23 < i15) {
                        if (z11) {
                            i12 = (i15 - 1) - i23;
                        } else {
                            i12 = i23;
                        }
                        if (this.f13648n + i12 < C3188g.this.f13617H1) {
                            C3186e c3186e6 = C3188g.this.f13616G1[this.f13648n + i12];
                            if (c3186e6 == null) {
                                c3186e6 = c3186e4;
                            } else {
                                if (i23 == 0) {
                                    c3186e6.m16099l(c3186e6.f13508Q, this.f13638d, this.f13642h);
                                }
                                if (i12 == 0) {
                                    int i24 = C3188g.this.f13618j1;
                                    float f13 = C3188g.this.f13624p1;
                                    if (z11) {
                                        f13 = 1.0f - f13;
                                    }
                                    if (this.f13648n == 0 && C3188g.this.f13620l1 != -1) {
                                        i24 = C3188g.this.f13620l1;
                                        if (z11) {
                                            f12 = C3188g.this.f13626r1;
                                            f11 = 1.0f - f12;
                                            f13 = f11;
                                        } else {
                                            f11 = C3188g.this.f13626r1;
                                            f13 = f11;
                                        }
                                    } else if (z12 && C3188g.this.f13622n1 != -1) {
                                        i24 = C3188g.this.f13622n1;
                                        if (z11) {
                                            f12 = C3188g.this.f13628t1;
                                            f11 = 1.0f - f12;
                                            f13 = f11;
                                        } else {
                                            f11 = C3188g.this.f13628t1;
                                            f13 = f11;
                                        }
                                    }
                                    c3186e6.m16057Q0(i24);
                                    c3186e6.m16055P0(f13);
                                }
                                if (i23 == i15 - 1) {
                                    c3186e6.m16099l(c3186e6.f13512S, this.f13640f, this.f13644j);
                                }
                                if (c3186e4 != null) {
                                    c3186e6.f13508Q.m15998a(c3186e4.f13512S, C3188g.this.f13630v1);
                                    if (i23 == i17) {
                                        c3186e6.f13508Q.m16018u(this.f13642h);
                                    }
                                    c3186e4.f13512S.m15998a(c3186e6.f13508Q, 0);
                                    if (i23 == i18 + 1) {
                                        c3186e4.f13512S.m16018u(this.f13644j);
                                    }
                                }
                                if (c3186e6 != c3186e5) {
                                    if (C3188g.this.f13633y1 != 3 || !c3186e.m16076b0() || c3186e6 == c3186e || !c3186e6.m16076b0()) {
                                        int i25 = C3188g.this.f13633y1;
                                        if (i25 != 0) {
                                            if (i25 != 1) {
                                                if (z13) {
                                                    c3186e6.f13510R.m15998a(this.f13639e, this.f13643i);
                                                    c3186e6.f13514T.m15998a(this.f13641g, this.f13645k);
                                                } else {
                                                    c3186e6.f13510R.m15998a(c3186e5.f13510R, 0);
                                                    c3186e6.f13514T.m15998a(c3186e5.f13514T, 0);
                                                }
                                            } else {
                                                c3186e6.f13514T.m15998a(c3186e5.f13514T, 0);
                                            }
                                        } else {
                                            c3186e6.f13510R.m15998a(c3186e5.f13510R, 0);
                                        }
                                    } else {
                                        c3186e6.f13515U.m15998a(c3186e.f13515U, 0);
                                    }
                                    i23++;
                                    c3186e4 = c3186e6;
                                }
                            }
                            i23++;
                            c3186e4 = c3186e6;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                C3186e c3186e7 = this.f13636b;
                c3186e7.m16057Q0(C3188g.this.f13618j1);
                int i26 = this.f13642h;
                if (i11 > 0) {
                    i26 += C3188g.this.f13630v1;
                }
                if (z11) {
                    c3186e7.f13512S.m15998a(this.f13640f, i26);
                    if (z12) {
                        c3186e7.f13508Q.m15998a(this.f13638d, this.f13644j);
                    }
                    if (i11 > 0) {
                        this.f13640f.f13458d.f13508Q.m15998a(c3186e7.f13512S, 0);
                    }
                } else {
                    c3186e7.f13508Q.m15998a(this.f13638d, i26);
                    if (z12) {
                        c3186e7.f13512S.m15998a(this.f13640f, this.f13644j);
                    }
                    if (i11 > 0) {
                        this.f13638d.f13458d.f13512S.m15998a(c3186e7.f13508Q, 0);
                    }
                }
                for (int i27 = 0; i27 < i15 && this.f13648n + i27 < C3188g.this.f13617H1; i27++) {
                    C3186e c3186e8 = C3188g.this.f13616G1[this.f13648n + i27];
                    if (c3186e8 != null) {
                        if (i27 == 0) {
                            c3186e8.m16099l(c3186e8.f13510R, this.f13639e, this.f13643i);
                            int i28 = C3188g.this.f13619k1;
                            float f14 = C3188g.this.f13625q1;
                            if (this.f13648n == 0 && C3188g.this.f13621m1 != -1) {
                                i28 = C3188g.this.f13621m1;
                                f14 = C3188g.this.f13627s1;
                            } else if (z12 && C3188g.this.f13623o1 != -1) {
                                i28 = C3188g.this.f13623o1;
                                f14 = C3188g.this.f13629u1;
                            }
                            c3186e8.m16090h1(i28);
                            c3186e8.m16089g1(f14);
                        }
                        if (i27 == i15 - 1) {
                            c3186e8.m16099l(c3186e8.f13514T, this.f13641g, this.f13645k);
                        }
                        if (c3186e4 != null) {
                            c3186e8.f13510R.m15998a(c3186e4.f13514T, C3188g.this.f13631w1);
                            if (i27 == i17) {
                                c3186e8.f13510R.m16018u(this.f13643i);
                            }
                            c3186e4.f13514T.m15998a(c3186e8.f13510R, 0);
                            if (i27 == i18 + 1) {
                                c3186e4.f13514T.m16018u(this.f13645k);
                            }
                        }
                        if (c3186e8 != c3186e7) {
                            if (z11) {
                                int i29 = C3188g.this.f13632x1;
                                if (i29 != 0) {
                                    if (i29 != 1) {
                                        if (i29 == 2) {
                                            c3186e8.f13508Q.m15998a(c3186e7.f13508Q, 0);
                                            c3186e8.f13512S.m15998a(c3186e7.f13512S, 0);
                                        }
                                    } else {
                                        c3186e8.f13508Q.m15998a(c3186e7.f13508Q, 0);
                                    }
                                } else {
                                    c3186e8.f13512S.m15998a(c3186e7.f13512S, 0);
                                }
                            } else {
                                int i31 = C3188g.this.f13632x1;
                                if (i31 != 0) {
                                    if (i31 != 1) {
                                        if (i31 == 2) {
                                            if (z13) {
                                                c3186e8.f13508Q.m15998a(this.f13638d, this.f13642h);
                                                c3186e8.f13512S.m15998a(this.f13640f, this.f13644j);
                                            } else {
                                                c3186e8.f13508Q.m15998a(c3186e7.f13508Q, 0);
                                                c3186e8.f13512S.m15998a(c3186e7.f13512S, 0);
                                            }
                                        }
                                    } else {
                                        c3186e8.f13512S.m15998a(c3186e7.f13512S, 0);
                                    }
                                } else {
                                    c3186e8.f13508Q.m15998a(c3186e7.f13508Q, 0);
                                }
                                c3186e4 = c3186e8;
                            }
                        }
                        c3186e4 = c3186e8;
                    }
                }
            }
        }

        /* renamed from: e */
        public int m16220e() {
            if (this.f13635a == 1) {
                return this.f13647m - C3188g.this.f13631w1;
            }
            return this.f13647m;
        }

        /* renamed from: f */
        public int m16221f() {
            if (this.f13635a == 0) {
                return this.f13646l - C3188g.this.f13630v1;
            }
            return this.f13646l;
        }

        /* renamed from: g */
        public void m16222g(int i11) {
            int i12 = this.f13650p;
            if (i12 == 0) {
                return;
            }
            int i13 = this.f13649o;
            int i14 = i11 / i12;
            for (int i15 = 0; i15 < i13 && this.f13648n + i15 < C3188g.this.f13617H1; i15++) {
                C3186e c3186e = C3188g.this.f13616G1[this.f13648n + i15];
                if (this.f13635a == 0) {
                    if (c3186e != null && c3186e.m16029C() == C3186e.b.MATCH_CONSTRAINT && c3186e.f13565w == 0) {
                        C3188g.this.m16247G1(c3186e, C3186e.b.FIXED, i14, c3186e.m16064V(), c3186e.m16133z());
                    }
                } else if (c3186e != null && c3186e.m16064V() == C3186e.b.MATCH_CONSTRAINT && c3186e.f13567x == 0) {
                    C3188g.this.m16247G1(c3186e, c3186e.m16029C(), c3186e.m16070Y(), C3186e.b.FIXED, i14);
                }
            }
            m16216h();
        }

        /* renamed from: i */
        public void m16223i(int i11) {
            this.f13648n = i11;
        }

        /* renamed from: j */
        public void m16224j(int i11, C3185d c3185d, C3185d c3185d2, C3185d c3185d3, C3185d c3185d4, int i12, int i13, int i14, int i15, int i16) {
            this.f13635a = i11;
            this.f13638d = c3185d;
            this.f13639e = c3185d2;
            this.f13640f = c3185d3;
            this.f13641g = c3185d4;
            this.f13642h = i12;
            this.f13643i = i13;
            this.f13644j = i14;
            this.f13645k = i15;
            this.f13651q = i16;
        }
    }

    /* renamed from: m2 */
    private void m16188m2(boolean z11) {
        C3186e c3186e;
        float f11;
        int i11;
        if (this.f13615F1 != null && this.f13614E1 != null && this.f13613D1 != null) {
            for (int i12 = 0; i12 < this.f13617H1; i12++) {
                this.f13616G1[i12].m16130x0();
            }
            int[] iArr = this.f13615F1;
            int i13 = iArr[0];
            int i14 = iArr[1];
            float f12 = this.f13624p1;
            C3186e c3186e2 = null;
            int i15 = 0;
            while (i15 < i13) {
                if (z11) {
                    i11 = (i13 - i15) - 1;
                    f11 = 1.0f - this.f13624p1;
                } else {
                    f11 = f12;
                    i11 = i15;
                }
                C3186e c3186e3 = this.f13614E1[i11];
                if (c3186e3 != null && c3186e3.m16068X() != 8) {
                    if (i15 == 0) {
                        c3186e3.m16099l(c3186e3.f13508Q, this.f13508Q, m16244C1());
                        c3186e3.m16057Q0(this.f13618j1);
                        c3186e3.m16055P0(f11);
                    }
                    if (i15 == i13 - 1) {
                        c3186e3.m16099l(c3186e3.f13512S, this.f13512S, m16245D1());
                    }
                    if (i15 > 0 && c3186e2 != null) {
                        c3186e3.m16099l(c3186e3.f13508Q, c3186e2.f13512S, this.f13630v1);
                        c3186e2.m16099l(c3186e2.f13512S, c3186e3.f13508Q, 0);
                    }
                    c3186e2 = c3186e3;
                }
                i15++;
                f12 = f11;
            }
            for (int i16 = 0; i16 < i14; i16++) {
                C3186e c3186e4 = this.f13613D1[i16];
                if (c3186e4 != null && c3186e4.m16068X() != 8) {
                    if (i16 == 0) {
                        c3186e4.m16099l(c3186e4.f13510R, this.f13510R, m16246E1());
                        c3186e4.m16090h1(this.f13619k1);
                        c3186e4.m16089g1(this.f13625q1);
                    }
                    if (i16 == i14 - 1) {
                        c3186e4.m16099l(c3186e4.f13514T, this.f13514T, m16243B1());
                    }
                    if (i16 > 0 && c3186e2 != null) {
                        c3186e4.m16099l(c3186e4.f13510R, c3186e2.f13514T, this.f13631w1);
                        c3186e2.m16099l(c3186e2.f13514T, c3186e4.f13510R, 0);
                    }
                    c3186e2 = c3186e4;
                }
            }
            for (int i17 = 0; i17 < i13; i17++) {
                for (int i18 = 0; i18 < i14; i18++) {
                    int i19 = (i18 * i13) + i17;
                    if (this.f13611B1 == 1) {
                        i19 = (i17 * i14) + i18;
                    }
                    C3186e[] c3186eArr = this.f13616G1;
                    if (i19 < c3186eArr.length && (c3186e = c3186eArr[i19]) != null && c3186e.m16068X() != 8) {
                        C3186e c3186e5 = this.f13614E1[i17];
                        C3186e c3186e6 = this.f13613D1[i18];
                        if (c3186e != c3186e5) {
                            c3186e.m16099l(c3186e.f13508Q, c3186e5.f13508Q, 0);
                            c3186e.m16099l(c3186e.f13512S, c3186e5.f13512S, 0);
                        }
                        if (c3186e != c3186e6) {
                            c3186e.m16099l(c3186e.f13510R, c3186e6.f13510R, 0);
                            c3186e.m16099l(c3186e.f13514T, c3186e6.f13514T, 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n2 */
    public final int m16189n2(C3186e c3186e, int i11) {
        if (c3186e == null) {
            return 0;
        }
        if (c3186e.m16064V() == C3186e.b.MATCH_CONSTRAINT) {
            int i12 = c3186e.f13567x;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (c3186e.f13484E * i11);
                if (i13 != c3186e.m16133z()) {
                    c3186e.m16077b1(true);
                    m16247G1(c3186e, c3186e.m16029C(), c3186e.m16070Y(), C3186e.b.FIXED, i13);
                }
                return i13;
            }
            if (i12 == 1) {
                return c3186e.m16133z();
            }
            if (i12 == 3) {
                return (int) ((c3186e.m16070Y() * c3186e.f13532f0) + 0.5f);
            }
        }
        return c3186e.m16133z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o2 */
    public final int m16190o2(C3186e c3186e, int i11) {
        if (c3186e == null) {
            return 0;
        }
        if (c3186e.m16029C() == C3186e.b.MATCH_CONSTRAINT) {
            int i12 = c3186e.f13565w;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (c3186e.f13478B * i11);
                if (i13 != c3186e.m16070Y()) {
                    c3186e.m16077b1(true);
                    m16247G1(c3186e, C3186e.b.FIXED, i13, c3186e.m16064V(), c3186e.m16133z());
                }
                return i13;
            }
            if (i12 == 1) {
                return c3186e.m16070Y();
            }
            if (i12 == 3) {
                return (int) ((c3186e.m16133z() * c3186e.f13532f0) + 0.5f);
            }
        }
        return c3186e.m16070Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* renamed from: p2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m16191p2(C3186e[] c3186eArr, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15;
        boolean z11;
        C3186e c3186e;
        if (i12 == 0) {
            int i16 = this.f13610A1;
            if (i16 <= 0) {
                i16 = 0;
                int i17 = 0;
                for (int i18 = 0; i18 < i11; i18++) {
                    if (i18 > 0) {
                        i17 += this.f13630v1;
                    }
                    C3186e c3186e2 = c3186eArr[i18];
                    if (c3186e2 != null) {
                        i17 += m16190o2(c3186e2, i13);
                        if (i17 > i13) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
            }
            i15 = i16;
            i14 = 0;
        } else {
            i14 = this.f13610A1;
            if (i14 <= 0) {
                i14 = 0;
                int i19 = 0;
                for (int i21 = 0; i21 < i11; i21++) {
                    if (i21 > 0) {
                        i19 += this.f13631w1;
                    }
                    C3186e c3186e3 = c3186eArr[i21];
                    if (c3186e3 != null) {
                        i19 += m16189n2(c3186e3, i13);
                        if (i19 > i13) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
            i15 = 0;
        }
        if (this.f13615F1 == null) {
            this.f13615F1 = new int[2];
        }
        if ((i14 != 0 || i12 != 1) && (i15 != 0 || i12 != 0)) {
            z11 = false;
            while (!z11) {
                if (i12 == 0) {
                    i14 = (int) Math.ceil(i11 / i15);
                } else {
                    i15 = (int) Math.ceil(i11 / i14);
                }
                C3186e[] c3186eArr2 = this.f13614E1;
                if (c3186eArr2 != null && c3186eArr2.length >= i15) {
                    Arrays.fill(c3186eArr2, (Object) null);
                } else {
                    this.f13614E1 = new C3186e[i15];
                }
                C3186e[] c3186eArr3 = this.f13613D1;
                if (c3186eArr3 != null && c3186eArr3.length >= i14) {
                    Arrays.fill(c3186eArr3, (Object) null);
                } else {
                    this.f13613D1 = new C3186e[i14];
                }
                for (int i22 = 0; i22 < i15; i22++) {
                    for (int i23 = 0; i23 < i14; i23++) {
                        int i24 = (i23 * i15) + i22;
                        if (i12 == 1) {
                            i24 = (i22 * i14) + i23;
                        }
                        if (i24 < c3186eArr.length && (c3186e = c3186eArr[i24]) != null) {
                            int m16190o2 = m16190o2(c3186e, i13);
                            C3186e c3186e4 = this.f13614E1[i22];
                            if (c3186e4 == null || c3186e4.m16070Y() < m16190o2) {
                                this.f13614E1[i22] = c3186e;
                            }
                            int m16189n2 = m16189n2(c3186e, i13);
                            C3186e c3186e5 = this.f13613D1[i23];
                            if (c3186e5 == null || c3186e5.m16133z() < m16189n2) {
                                this.f13613D1[i23] = c3186e;
                            }
                        }
                    }
                }
                int i25 = 0;
                for (int i26 = 0; i26 < i15; i26++) {
                    C3186e c3186e6 = this.f13614E1[i26];
                    if (c3186e6 != null) {
                        if (i26 > 0) {
                            i25 += this.f13630v1;
                        }
                        i25 += m16190o2(c3186e6, i13);
                    }
                }
                int i27 = 0;
                for (int i28 = 0; i28 < i14; i28++) {
                    C3186e c3186e7 = this.f13613D1[i28];
                    if (c3186e7 != null) {
                        if (i28 > 0) {
                            i27 += this.f13631w1;
                        }
                        i27 += m16189n2(c3186e7, i13);
                    }
                }
                iArr[0] = i25;
                iArr[1] = i27;
                if (i12 == 0) {
                    if (i25 > i13 && i15 > 1) {
                        i15--;
                    }
                } else if (i27 > i13 && i14 > 1) {
                    i14--;
                }
                while (!z11) {
                }
            }
            int[] iArr2 = this.f13615F1;
            iArr2[0] = i15;
            iArr2[1] = i14;
        }
        z11 = true;
        while (!z11) {
        }
        int[] iArr22 = this.f13615F1;
        iArr22[0] = i15;
        iArr22[1] = i14;
    }

    /* renamed from: q2 */
    private void m16192q2(C3186e[] c3186eArr, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15;
        int i16;
        C3185d c3185d;
        int m16245D1;
        C3185d c3185d2;
        int m16243B1;
        int i17;
        if (i11 == 0) {
            return;
        }
        this.f13612C1.clear();
        a aVar = new a(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, i13);
        this.f13612C1.add(aVar);
        if (i12 == 0) {
            i14 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i11) {
                C3186e c3186e = c3186eArr[i19];
                int m16190o2 = m16190o2(c3186e, i13);
                if (c3186e.m16029C() == C3186e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i21 = i14;
                boolean z11 = (i18 == i13 || (this.f13630v1 + i18) + m16190o2 > i13) && aVar.f13636b != null;
                if ((!z11 && i19 > 0 && (i17 = this.f13610A1) > 0 && i19 % i17 == 0) || z11) {
                    aVar = new a(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, i13);
                    aVar.m16223i(i19);
                    this.f13612C1.add(aVar);
                } else if (i19 > 0) {
                    i18 += this.f13630v1 + m16190o2;
                    aVar.m16217b(c3186e);
                    i19++;
                    i14 = i21;
                }
                i18 = m16190o2;
                aVar.m16217b(c3186e);
                i19++;
                i14 = i21;
            }
        } else {
            i14 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i11) {
                C3186e c3186e2 = c3186eArr[i23];
                int m16189n2 = m16189n2(c3186e2, i13);
                if (c3186e2.m16064V() == C3186e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i24 = i14;
                boolean z12 = (i22 == i13 || (this.f13631w1 + i22) + m16189n2 > i13) && aVar.f13636b != null;
                if ((!z12 && i23 > 0 && (i15 = this.f13610A1) > 0 && i23 % i15 == 0) || z12) {
                    aVar = new a(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, i13);
                    aVar.m16223i(i23);
                    this.f13612C1.add(aVar);
                } else if (i23 > 0) {
                    i22 += this.f13631w1 + m16189n2;
                    aVar.m16217b(c3186e2);
                    i23++;
                    i14 = i24;
                }
                i22 = m16189n2;
                aVar.m16217b(c3186e2);
                i23++;
                i14 = i24;
            }
        }
        int size = this.f13612C1.size();
        C3185d c3185d3 = this.f13508Q;
        C3185d c3185d4 = this.f13510R;
        C3185d c3185d5 = this.f13512S;
        C3185d c3185d6 = this.f13514T;
        int m16244C1 = m16244C1();
        int m16246E1 = m16246E1();
        int m16245D12 = m16245D1();
        int m16243B12 = m16243B1();
        C3186e.b m16029C = m16029C();
        C3186e.b bVar = C3186e.b.WRAP_CONTENT;
        boolean z13 = m16029C == bVar || m16064V() == bVar;
        if (i14 > 0 && z13) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = (a) this.f13612C1.get(i25);
                if (i12 == 0) {
                    aVar2.m16222g(i13 - aVar2.m16221f());
                } else {
                    aVar2.m16222g(i13 - aVar2.m16220e());
                }
            }
        }
        int i26 = m16246E1;
        int i27 = m16245D12;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = m16244C1;
        C3185d c3185d7 = c3185d4;
        C3185d c3185d8 = c3185d3;
        int i33 = m16243B12;
        while (i31 < size) {
            a aVar3 = (a) this.f13612C1.get(i31);
            if (i12 == 0) {
                if (i31 < size - 1) {
                    c3185d2 = ((a) this.f13612C1.get(i31 + 1)).f13636b.f13510R;
                    m16243B1 = 0;
                } else {
                    c3185d2 = this.f13514T;
                    m16243B1 = m16243B1();
                }
                C3185d c3185d9 = aVar3.f13636b.f13514T;
                C3185d c3185d10 = c3185d8;
                C3185d c3185d11 = c3185d8;
                int i34 = i28;
                C3185d c3185d12 = c3185d7;
                int i35 = i29;
                C3185d c3185d13 = c3185d5;
                C3185d c3185d14 = c3185d5;
                i16 = i31;
                aVar3.m16224j(i12, c3185d10, c3185d12, c3185d13, c3185d2, i32, i26, i27, m16243B1, i13);
                int max = Math.max(i35, aVar3.m16221f());
                i28 = i34 + aVar3.m16220e();
                if (i16 > 0) {
                    i28 += this.f13631w1;
                }
                c3185d8 = c3185d11;
                i29 = max;
                c3185d7 = c3185d9;
                i26 = 0;
                c3185d = c3185d14;
                int i36 = m16243B1;
                c3185d6 = c3185d2;
                i33 = i36;
            } else {
                C3185d c3185d15 = c3185d8;
                int i37 = i28;
                int i38 = i29;
                i16 = i31;
                if (i16 < size - 1) {
                    c3185d = ((a) this.f13612C1.get(i16 + 1)).f13636b.f13508Q;
                    m16245D1 = 0;
                } else {
                    c3185d = this.f13512S;
                    m16245D1 = m16245D1();
                }
                C3185d c3185d16 = aVar3.f13636b.f13512S;
                aVar3.m16224j(i12, c3185d15, c3185d7, c3185d, c3185d6, i32, i26, m16245D1, i33, i13);
                i29 = i38 + aVar3.m16221f();
                int max2 = Math.max(i37, aVar3.m16220e());
                if (i16 > 0) {
                    i29 += this.f13630v1;
                }
                i28 = max2;
                i27 = m16245D1;
                c3185d8 = c3185d16;
                i32 = 0;
            }
            i31 = i16 + 1;
            c3185d5 = c3185d;
        }
        iArr[0] = i29;
        iArr[1] = i28;
    }

    /* renamed from: r2 */
    private void m16193r2(C3186e[] c3186eArr, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15;
        int i16;
        C3185d c3185d;
        int m16245D1;
        C3185d c3185d2;
        int m16243B1;
        int i17;
        if (i11 == 0) {
            return;
        }
        this.f13612C1.clear();
        a aVar = new a(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, i13);
        this.f13612C1.add(aVar);
        if (i12 == 0) {
            int i18 = 0;
            i14 = 0;
            int i19 = 0;
            int i21 = 0;
            while (i21 < i11) {
                int i22 = i18 + 1;
                C3186e c3186e = c3186eArr[i21];
                int m16190o2 = m16190o2(c3186e, i13);
                if (c3186e.m16029C() == C3186e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i23 = i14;
                boolean z11 = (i19 == i13 || (this.f13630v1 + i19) + m16190o2 > i13) && aVar.f13636b != null;
                if ((z11 || i21 <= 0 || (i17 = this.f13610A1) <= 0 || i22 <= i17) && !z11) {
                    i19 = i21 > 0 ? i19 + this.f13630v1 + m16190o2 : m16190o2;
                    i18 = 0;
                } else {
                    aVar = new a(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, i13);
                    aVar.m16223i(i21);
                    this.f13612C1.add(aVar);
                    i18 = i22;
                    i19 = m16190o2;
                }
                aVar.m16217b(c3186e);
                i21++;
                i14 = i23;
            }
        } else {
            int i24 = 0;
            i14 = 0;
            int i25 = 0;
            while (i25 < i11) {
                C3186e c3186e2 = c3186eArr[i25];
                int m16189n2 = m16189n2(c3186e2, i13);
                if (c3186e2.m16064V() == C3186e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i26 = i14;
                boolean z12 = (i24 == i13 || (this.f13631w1 + i24) + m16189n2 > i13) && aVar.f13636b != null;
                if ((!z12 && i25 > 0 && (i15 = this.f13610A1) > 0 && i15 < 0) || z12) {
                    aVar = new a(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, i13);
                    aVar.m16223i(i25);
                    this.f13612C1.add(aVar);
                } else if (i25 > 0) {
                    i24 += this.f13631w1 + m16189n2;
                    aVar.m16217b(c3186e2);
                    i25++;
                    i14 = i26;
                }
                i24 = m16189n2;
                aVar.m16217b(c3186e2);
                i25++;
                i14 = i26;
            }
        }
        int size = this.f13612C1.size();
        C3185d c3185d3 = this.f13508Q;
        C3185d c3185d4 = this.f13510R;
        C3185d c3185d5 = this.f13512S;
        C3185d c3185d6 = this.f13514T;
        int m16244C1 = m16244C1();
        int m16246E1 = m16246E1();
        int m16245D12 = m16245D1();
        int m16243B12 = m16243B1();
        C3186e.b m16029C = m16029C();
        C3186e.b bVar = C3186e.b.WRAP_CONTENT;
        boolean z13 = m16029C == bVar || m16064V() == bVar;
        if (i14 > 0 && z13) {
            for (int i27 = 0; i27 < size; i27++) {
                a aVar2 = (a) this.f13612C1.get(i27);
                if (i12 == 0) {
                    aVar2.m16222g(i13 - aVar2.m16221f());
                } else {
                    aVar2.m16222g(i13 - aVar2.m16220e());
                }
            }
        }
        int i28 = m16246E1;
        int i29 = m16245D12;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = m16244C1;
        C3185d c3185d7 = c3185d4;
        C3185d c3185d8 = c3185d3;
        int i35 = m16243B12;
        while (i33 < size) {
            a aVar3 = (a) this.f13612C1.get(i33);
            if (i12 == 0) {
                if (i33 < size - 1) {
                    c3185d2 = ((a) this.f13612C1.get(i33 + 1)).f13636b.f13510R;
                    m16243B1 = 0;
                } else {
                    c3185d2 = this.f13514T;
                    m16243B1 = m16243B1();
                }
                C3185d c3185d9 = aVar3.f13636b.f13514T;
                C3185d c3185d10 = c3185d8;
                C3185d c3185d11 = c3185d8;
                int i36 = i31;
                C3185d c3185d12 = c3185d7;
                int i37 = i32;
                C3185d c3185d13 = c3185d5;
                C3185d c3185d14 = c3185d5;
                i16 = i33;
                aVar3.m16224j(i12, c3185d10, c3185d12, c3185d13, c3185d2, i34, i28, i29, m16243B1, i13);
                int max = Math.max(i37, aVar3.m16221f());
                i31 = i36 + aVar3.m16220e();
                if (i16 > 0) {
                    i31 += this.f13631w1;
                }
                c3185d8 = c3185d11;
                i32 = max;
                c3185d7 = c3185d9;
                i28 = 0;
                c3185d = c3185d14;
                int i38 = m16243B1;
                c3185d6 = c3185d2;
                i35 = i38;
            } else {
                C3185d c3185d15 = c3185d8;
                int i39 = i31;
                int i41 = i32;
                i16 = i33;
                if (i16 < size - 1) {
                    c3185d = ((a) this.f13612C1.get(i16 + 1)).f13636b.f13508Q;
                    m16245D1 = 0;
                } else {
                    c3185d = this.f13512S;
                    m16245D1 = m16245D1();
                }
                C3185d c3185d16 = aVar3.f13636b.f13512S;
                aVar3.m16224j(i12, c3185d15, c3185d7, c3185d, c3185d6, i34, i28, m16245D1, i35, i13);
                i32 = i41 + aVar3.m16221f();
                int max2 = Math.max(i39, aVar3.m16220e());
                if (i16 > 0) {
                    i32 += this.f13630v1;
                }
                i31 = max2;
                i29 = m16245D1;
                c3185d8 = c3185d16;
                i34 = 0;
            }
            i33 = i16 + 1;
            c3185d5 = c3185d;
        }
        iArr[0] = i32;
        iArr[1] = i31;
    }

    /* renamed from: s2 */
    private void m16194s2(C3186e[] c3186eArr, int i11, int i12, int i13, int[] iArr) {
        a aVar;
        if (i11 == 0) {
            return;
        }
        if (this.f13612C1.size() == 0) {
            aVar = new a(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, i13);
            this.f13612C1.add(aVar);
        } else {
            a aVar2 = (a) this.f13612C1.get(0);
            aVar2.m16218c();
            aVar = aVar2;
            aVar.m16224j(i12, this.f13508Q, this.f13510R, this.f13512S, this.f13514T, m16244C1(), m16246E1(), m16245D1(), m16243B1(), i13);
        }
        for (int i14 = 0; i14 < i11; i14++) {
            aVar.m16217b(c3186eArr[i14]);
        }
        iArr[0] = aVar.m16221f();
        iArr[1] = aVar.m16220e();
    }

    /* renamed from: A2 */
    public void m16195A2(int i11) {
        this.f13618j1 = i11;
    }

    /* renamed from: B2 */
    public void m16196B2(float f11) {
        this.f13628t1 = f11;
    }

    /* renamed from: C2 */
    public void m16197C2(int i11) {
        this.f13622n1 = i11;
    }

    /* renamed from: D2 */
    public void m16198D2(float f11) {
        this.f13629u1 = f11;
    }

    /* renamed from: E2 */
    public void m16199E2(int i11) {
        this.f13623o1 = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    @Override // p045c1.AbstractC3194m
    /* renamed from: F1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16200F1(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int[] iArr;
        boolean z11;
        char c11;
        if (this.f13663V0 > 0 && !m16248H1()) {
            m16251K1(0, 0);
            m16250J1(false);
            return;
        }
        int m16244C1 = m16244C1();
        int m16245D1 = m16245D1();
        int m16246E1 = m16246E1();
        int m16243B1 = m16243B1();
        int[] iArr2 = new int[2];
        int i17 = (i12 - m16244C1) - m16245D1;
        int i18 = this.f13611B1;
        if (i18 == 1) {
            i17 = (i14 - m16246E1) - m16243B1;
        }
        int i19 = i17;
        if (i18 == 0) {
            if (this.f13618j1 == -1) {
                this.f13618j1 = 0;
            }
            if (this.f13619k1 == -1) {
                this.f13619k1 = 0;
            }
        } else {
            if (this.f13618j1 == -1) {
                this.f13618j1 = 0;
            }
            if (this.f13619k1 == -1) {
                this.f13619k1 = 0;
            }
        }
        C3186e[] c3186eArr = this.f13662U0;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            i15 = this.f13663V0;
            if (i21 >= i15) {
                break;
            }
            if (this.f13662U0[i21].m16068X() == 8) {
                i22++;
            }
            i21++;
        }
        if (i22 > 0) {
            c3186eArr = new C3186e[i15 - i22];
            int i23 = 0;
            for (int i24 = 0; i24 < this.f13663V0; i24++) {
                C3186e c3186e = this.f13662U0[i24];
                if (c3186e.m16068X() != 8) {
                    c3186eArr[i23] = c3186e;
                    i23++;
                }
            }
            i16 = i23;
        } else {
            i16 = i15;
        }
        this.f13616G1 = c3186eArr;
        this.f13617H1 = i16;
        int i25 = this.f13634z1;
        if (i25 != 0) {
            if (i25 != 1) {
                if (i25 != 2) {
                    if (i25 != 3) {
                        iArr = iArr2;
                        c11 = 0;
                        z11 = true;
                        int i26 = iArr[c11] + m16244C1 + m16245D1;
                        int i27 = iArr[z11 ? 1 : 0] + m16246E1 + m16243B1;
                        if (i11 != 1073741824) {
                            i26 = i12;
                        } else if (i11 == Integer.MIN_VALUE) {
                            i26 = Math.min(i26, i12);
                        } else if (i11 != 0) {
                            i26 = 0;
                        }
                        if (i13 != 1073741824) {
                            i27 = i14;
                        } else if (i13 == Integer.MIN_VALUE) {
                            i27 = Math.min(i27, i14);
                        } else if (i13 != 0) {
                            i27 = 0;
                        }
                        m16251K1(i26, i27);
                        m16106n1(i26);
                        m16053O0(i27);
                        if (this.f13663V0 <= 0) {
                            z11 = false;
                        }
                        m16250J1(z11);
                    }
                    z11 = true;
                    iArr = iArr2;
                    m16193r2(c3186eArr, i16, this.f13611B1, i19, iArr2);
                } else {
                    iArr = iArr2;
                    z11 = true;
                    m16191p2(c3186eArr, i16, this.f13611B1, i19, iArr2);
                }
            } else {
                iArr = iArr2;
                z11 = true;
                m16192q2(c3186eArr, i16, this.f13611B1, i19, iArr2);
            }
        } else {
            iArr = iArr2;
            z11 = true;
            m16194s2(c3186eArr, i16, this.f13611B1, i19, iArr2);
        }
        c11 = 0;
        int i262 = iArr[c11] + m16244C1 + m16245D1;
        int i272 = iArr[z11 ? 1 : 0] + m16246E1 + m16243B1;
        if (i11 != 1073741824) {
        }
        if (i13 != 1073741824) {
        }
        m16251K1(i262, i272);
        m16106n1(i262);
        m16053O0(i272);
        if (this.f13663V0 <= 0) {
        }
        m16250J1(z11);
    }

    /* renamed from: F2 */
    public void m16201F2(int i11) {
        this.f13610A1 = i11;
    }

    /* renamed from: G2 */
    public void m16202G2(int i11) {
        this.f13611B1 = i11;
    }

    /* renamed from: H2 */
    public void m16203H2(int i11) {
        this.f13633y1 = i11;
    }

    /* renamed from: I2 */
    public void m16204I2(float f11) {
        this.f13625q1 = f11;
    }

    /* renamed from: J2 */
    public void m16205J2(int i11) {
        this.f13631w1 = i11;
    }

    /* renamed from: K2 */
    public void m16206K2(int i11) {
        this.f13619k1 = i11;
    }

    /* renamed from: L2 */
    public void m16207L2(int i11) {
        this.f13634z1 = i11;
    }

    @Override // p045c1.C3186e
    /* renamed from: g */
    public void mo15984g(C31133d c31133d, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        super.mo15984g(c31133d, z11);
        if (m16048M() != null && ((C3187f) m16048M()).m16155S1()) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i11 = this.f13634z1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = this.f13612C1.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            a aVar = (a) this.f13612C1.get(i12);
                            if (i12 == size - 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            aVar.m16219d(z12, i12, z14);
                        }
                    }
                } else {
                    m16188m2(z12);
                }
            } else {
                int size2 = this.f13612C1.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    a aVar2 = (a) this.f13612C1.get(i13);
                    if (i13 == size2 - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    aVar2.m16219d(z12, i13, z13);
                }
            }
        } else if (this.f13612C1.size() > 0) {
            ((a) this.f13612C1.get(0)).m16219d(z12, 0, true);
        }
        m16250J1(false);
    }

    @Override // p045c1.C3191j, p045c1.C3186e
    /* renamed from: n */
    public void mo15986n(C3186e c3186e, HashMap hashMap) {
        super.mo15986n(c3186e, hashMap);
        C3188g c3188g = (C3188g) c3186e;
        this.f13618j1 = c3188g.f13618j1;
        this.f13619k1 = c3188g.f13619k1;
        this.f13620l1 = c3188g.f13620l1;
        this.f13621m1 = c3188g.f13621m1;
        this.f13622n1 = c3188g.f13622n1;
        this.f13623o1 = c3188g.f13623o1;
        this.f13624p1 = c3188g.f13624p1;
        this.f13625q1 = c3188g.f13625q1;
        this.f13626r1 = c3188g.f13626r1;
        this.f13627s1 = c3188g.f13627s1;
        this.f13628t1 = c3188g.f13628t1;
        this.f13629u1 = c3188g.f13629u1;
        this.f13630v1 = c3188g.f13630v1;
        this.f13631w1 = c3188g.f13631w1;
        this.f13632x1 = c3188g.f13632x1;
        this.f13633y1 = c3188g.f13633y1;
        this.f13634z1 = c3188g.f13634z1;
        this.f13610A1 = c3188g.f13610A1;
        this.f13611B1 = c3188g.f13611B1;
    }

    /* renamed from: t2 */
    public void m16208t2(float f11) {
        this.f13626r1 = f11;
    }

    /* renamed from: u2 */
    public void m16209u2(int i11) {
        this.f13620l1 = i11;
    }

    /* renamed from: v2 */
    public void m16210v2(float f11) {
        this.f13627s1 = f11;
    }

    /* renamed from: w2 */
    public void m16211w2(int i11) {
        this.f13621m1 = i11;
    }

    /* renamed from: x2 */
    public void m16212x2(int i11) {
        this.f13632x1 = i11;
    }

    /* renamed from: y2 */
    public void m16213y2(float f11) {
        this.f13624p1 = f11;
    }

    /* renamed from: z2 */
    public void m16214z2(int i11) {
        this.f13630v1 = i11;
    }
}
