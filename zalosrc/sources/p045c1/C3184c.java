package p045c1;

import java.util.ArrayList;
import p045c1.C3186e;

/* renamed from: c1.c */
/* loaded from: classes2.dex */
public class C3184c {

    /* renamed from: a */
    protected C3186e f13433a;

    /* renamed from: b */
    protected C3186e f13434b;

    /* renamed from: c */
    protected C3186e f13435c;

    /* renamed from: d */
    protected C3186e f13436d;

    /* renamed from: e */
    protected C3186e f13437e;

    /* renamed from: f */
    protected C3186e f13438f;

    /* renamed from: g */
    protected C3186e f13439g;

    /* renamed from: h */
    protected ArrayList f13440h;

    /* renamed from: i */
    protected int f13441i;

    /* renamed from: j */
    protected int f13442j;

    /* renamed from: k */
    protected float f13443k = 0.0f;

    /* renamed from: l */
    int f13444l;

    /* renamed from: m */
    int f13445m;

    /* renamed from: n */
    int f13446n;

    /* renamed from: o */
    boolean f13447o;

    /* renamed from: p */
    private int f13448p;

    /* renamed from: q */
    private boolean f13449q;

    /* renamed from: r */
    protected boolean f13450r;

    /* renamed from: s */
    protected boolean f13451s;

    /* renamed from: t */
    protected boolean f13452t;

    /* renamed from: u */
    protected boolean f13453u;

    /* renamed from: v */
    private boolean f13454v;

    public C3184c(C3186e c3186e, int i11, boolean z11) {
        this.f13433a = c3186e;
        this.f13448p = i11;
        this.f13449q = z11;
    }

    /* renamed from: b */
    private void m15995b() {
        int i11 = this.f13448p * 2;
        C3186e c3186e = this.f13433a;
        boolean z11 = true;
        this.f13447o = true;
        C3186e c3186e2 = c3186e;
        boolean z12 = false;
        while (!z12) {
            this.f13441i++;
            C3186e[] c3186eArr = c3186e.f13505O0;
            int i12 = this.f13448p;
            C3186e c3186e3 = null;
            c3186eArr[i12] = null;
            c3186e.f13503N0[i12] = null;
            if (c3186e.m16068X() != 8) {
                this.f13444l++;
                C3186e.b m16127w = c3186e.m16127w(this.f13448p);
                C3186e.b bVar = C3186e.b.MATCH_CONSTRAINT;
                if (m16127w != bVar) {
                    this.f13445m += c3186e.m16036G(this.f13448p);
                }
                int m16003f = this.f13445m + c3186e.f13519Y[i11].m16003f();
                this.f13445m = m16003f;
                int i13 = i11 + 1;
                this.f13445m = m16003f + c3186e.f13519Y[i13].m16003f();
                int m16003f2 = this.f13446n + c3186e.f13519Y[i11].m16003f();
                this.f13446n = m16003f2;
                this.f13446n = m16003f2 + c3186e.f13519Y[i13].m16003f();
                if (this.f13434b == null) {
                    this.f13434b = c3186e;
                }
                this.f13436d = c3186e;
                C3186e.b[] bVarArr = c3186e.f13524b0;
                int i14 = this.f13448p;
                if (bVarArr[i14] == bVar) {
                    int i15 = c3186e.f13569y[i14];
                    if (i15 == 0 || i15 == 3 || i15 == 2) {
                        this.f13442j++;
                        float f11 = c3186e.f13501M0[i14];
                        if (f11 > 0.0f) {
                            this.f13443k += f11;
                        }
                        if (m15996c(c3186e, i14)) {
                            if (f11 < 0.0f) {
                                this.f13450r = true;
                            } else {
                                this.f13451s = true;
                            }
                            if (this.f13440h == null) {
                                this.f13440h = new ArrayList();
                            }
                            this.f13440h.add(c3186e);
                        }
                        if (this.f13438f == null) {
                            this.f13438f = c3186e;
                        }
                        C3186e c3186e4 = this.f13439g;
                        if (c3186e4 != null) {
                            c3186e4.f13503N0[this.f13448p] = c3186e;
                        }
                        this.f13439g = c3186e;
                    }
                    if (this.f13448p == 0) {
                        if (c3186e.f13565w != 0) {
                            this.f13447o = false;
                        } else if (c3186e.f13571z != 0 || c3186e.f13476A != 0) {
                            this.f13447o = false;
                        }
                    } else if (c3186e.f13567x != 0) {
                        this.f13447o = false;
                    } else if (c3186e.f13480C != 0 || c3186e.f13482D != 0) {
                        this.f13447o = false;
                    }
                    if (c3186e.f13532f0 != 0.0f) {
                        this.f13447o = false;
                        this.f13453u = true;
                    }
                }
            }
            if (c3186e2 != c3186e) {
                c3186e2.f13505O0[this.f13448p] = c3186e;
            }
            C3185d c3185d = c3186e.f13519Y[i11 + 1].f13460f;
            if (c3185d != null) {
                C3186e c3186e5 = c3185d.f13458d;
                C3185d c3185d2 = c3186e5.f13519Y[i11].f13460f;
                if (c3185d2 != null && c3185d2.f13458d == c3186e) {
                    c3186e3 = c3186e5;
                }
            }
            if (c3186e3 == null) {
                c3186e3 = c3186e;
                z12 = true;
            }
            c3186e2 = c3186e;
            c3186e = c3186e3;
        }
        C3186e c3186e6 = this.f13434b;
        if (c3186e6 != null) {
            this.f13445m -= c3186e6.f13519Y[i11].m16003f();
        }
        C3186e c3186e7 = this.f13436d;
        if (c3186e7 != null) {
            this.f13445m -= c3186e7.f13519Y[i11 + 1].m16003f();
        }
        this.f13435c = c3186e;
        if (this.f13448p == 0 && this.f13449q) {
            this.f13437e = c3186e;
        } else {
            this.f13437e = this.f13433a;
        }
        if (!this.f13451s || !this.f13450r) {
            z11 = false;
        }
        this.f13452t = z11;
    }

    /* renamed from: c */
    private static boolean m15996c(C3186e c3186e, int i11) {
        int i12;
        if (c3186e.m16068X() != 8 && c3186e.f13524b0[i11] == C3186e.b.MATCH_CONSTRAINT && ((i12 = c3186e.f13569y[i11]) == 0 || i12 == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m15997a() {
        if (!this.f13454v) {
            m15995b();
        }
        this.f13454v = true;
    }
}
