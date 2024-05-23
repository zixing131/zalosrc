package p045c1;

import java.util.HashMap;
import p045c1.C3185d;
import p045c1.C3186e;
import p700z0.C31133d;
import p700z0.C31138i;

/* renamed from: c1.a */
/* loaded from: classes2.dex */
public class C3182a extends C3191j {

    /* renamed from: W0 */
    private int f13429W0 = 0;

    /* renamed from: X0 */
    private boolean f13430X0 = true;

    /* renamed from: Y0 */
    private int f13431Y0 = 0;

    /* renamed from: Z0 */
    boolean f13432Z0 = false;

    /* renamed from: A1 */
    public int m15979A1() {
        int i11 = this.f13429W0;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    /* renamed from: B1 */
    public void m15980B1() {
        for (int i11 = 0; i11 < this.f13663V0; i11++) {
            C3186e c3186e = this.f13662U0[i11];
            if (this.f13430X0 || c3186e.mo15985h()) {
                int i12 = this.f13429W0;
                if (i12 != 0 && i12 != 1) {
                    if (i12 == 2 || i12 == 3) {
                        c3186e.m16065V0(1, true);
                    }
                } else {
                    c3186e.m16065V0(0, true);
                }
            }
        }
    }

    /* renamed from: C1 */
    public void m15981C1(boolean z11) {
        this.f13430X0 = z11;
    }

    /* renamed from: D1 */
    public void m15982D1(int i11) {
        this.f13429W0 = i11;
    }

    /* renamed from: E1 */
    public void m15983E1(int i11) {
        this.f13431Y0 = i11;
    }

    @Override // p045c1.C3186e
    /* renamed from: g */
    public void mo15984g(C31133d c31133d, boolean z11) {
        C3185d[] c3185dArr;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C3185d[] c3185dArr2 = this.f13519Y;
        c3185dArr2[0] = this.f13508Q;
        c3185dArr2[2] = this.f13510R;
        c3185dArr2[1] = this.f13512S;
        c3185dArr2[3] = this.f13514T;
        int i16 = 0;
        while (true) {
            c3185dArr = this.f13519Y;
            if (i16 >= c3185dArr.length) {
                break;
            }
            C3185d c3185d = c3185dArr[i16];
            c3185d.f13463i = c31133d.m151277q(c3185d);
            i16++;
        }
        int i17 = this.f13429W0;
        if (i17 >= 0 && i17 < 4) {
            C3185d c3185d2 = c3185dArr[i17];
            if (!this.f13432Z0) {
                m15989w1();
            }
            if (this.f13432Z0) {
                this.f13432Z0 = false;
                int i18 = this.f13429W0;
                if (i18 != 0 && i18 != 1) {
                    if (i18 == 2 || i18 == 3) {
                        c31133d.m151268f(this.f13510R.f13463i, this.f13538i0);
                        c31133d.m151268f(this.f13514T.f13463i, this.f13538i0);
                        return;
                    }
                    return;
                }
                c31133d.m151268f(this.f13508Q.f13463i, this.f13536h0);
                c31133d.m151268f(this.f13512S.f13463i, this.f13536h0);
                return;
            }
            for (int i19 = 0; i19 < this.f13663V0; i19++) {
                C3186e c3186e = this.f13662U0[i19];
                if ((this.f13430X0 || c3186e.mo15985h()) && ((((i14 = this.f13429W0) == 0 || i14 == 1) && c3186e.m16029C() == C3186e.b.MATCH_CONSTRAINT && c3186e.f13508Q.f13460f != null && c3186e.f13512S.f13460f != null) || (((i15 = this.f13429W0) == 2 || i15 == 3) && c3186e.m16064V() == C3186e.b.MATCH_CONSTRAINT && c3186e.f13510R.f13460f != null && c3186e.f13514T.f13460f != null))) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
            if (!this.f13508Q.m16009l() && !this.f13512S.m16009l()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!this.f13510R.m16009l() && !this.f13514T.m16009l()) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (!z12 && (((i13 = this.f13429W0) == 0 && z13) || ((i13 == 2 && z14) || ((i13 == 1 && z13) || (i13 == 3 && z14))))) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                i11 = 4;
            } else {
                i11 = 5;
            }
            for (int i21 = 0; i21 < this.f13663V0; i21++) {
                C3186e c3186e2 = this.f13662U0[i21];
                if (this.f13430X0 || c3186e2.mo15985h()) {
                    C31138i m151277q = c31133d.m151277q(c3186e2.f13519Y[this.f13429W0]);
                    C3185d[] c3185dArr3 = c3186e2.f13519Y;
                    int i22 = this.f13429W0;
                    C3185d c3185d3 = c3185dArr3[i22];
                    c3185d3.f13463i = m151277q;
                    C3185d c3185d4 = c3185d3.f13460f;
                    if (c3185d4 != null && c3185d4.f13458d == this) {
                        i12 = c3185d3.f13461g;
                    } else {
                        i12 = 0;
                    }
                    if (i22 != 0 && i22 != 2) {
                        c31133d.m151269g(c3185d2.f13463i, m151277q, this.f13431Y0 + i12, z12);
                    } else {
                        c31133d.m151271i(c3185d2.f13463i, m151277q, this.f13431Y0 - i12, z12);
                    }
                    c31133d.m151267e(c3185d2.f13463i, m151277q, this.f13431Y0 + i12, i11);
                }
            }
            int i23 = this.f13429W0;
            if (i23 == 0) {
                c31133d.m151267e(this.f13512S.f13463i, this.f13508Q.f13463i, 0, 8);
                c31133d.m151267e(this.f13508Q.f13463i, this.f13526c0.f13512S.f13463i, 0, 4);
                c31133d.m151267e(this.f13508Q.f13463i, this.f13526c0.f13508Q.f13463i, 0, 0);
                return;
            }
            if (i23 == 1) {
                c31133d.m151267e(this.f13508Q.f13463i, this.f13512S.f13463i, 0, 8);
                c31133d.m151267e(this.f13508Q.f13463i, this.f13526c0.f13508Q.f13463i, 0, 4);
                c31133d.m151267e(this.f13508Q.f13463i, this.f13526c0.f13512S.f13463i, 0, 0);
            } else if (i23 == 2) {
                c31133d.m151267e(this.f13514T.f13463i, this.f13510R.f13463i, 0, 8);
                c31133d.m151267e(this.f13510R.f13463i, this.f13526c0.f13514T.f13463i, 0, 4);
                c31133d.m151267e(this.f13510R.f13463i, this.f13526c0.f13510R.f13463i, 0, 0);
            } else if (i23 == 3) {
                c31133d.m151267e(this.f13510R.f13463i, this.f13514T.f13463i, 0, 8);
                c31133d.m151267e(this.f13510R.f13463i, this.f13526c0.f13510R.f13463i, 0, 4);
                c31133d.m151267e(this.f13510R.f13463i, this.f13526c0.f13514T.f13463i, 0, 0);
            }
        }
    }

    @Override // p045c1.C3186e
    /* renamed from: h */
    public boolean mo15985h() {
        return true;
    }

    @Override // p045c1.C3191j, p045c1.C3186e
    /* renamed from: n */
    public void mo15986n(C3186e c3186e, HashMap hashMap) {
        super.mo15986n(c3186e, hashMap);
        C3182a c3182a = (C3182a) c3186e;
        this.f13429W0 = c3182a.f13429W0;
        this.f13430X0 = c3182a.f13430X0;
        this.f13431Y0 = c3182a.f13431Y0;
    }

    @Override // p045c1.C3186e
    /* renamed from: p0 */
    public boolean mo15987p0() {
        return this.f13432Z0;
    }

    @Override // p045c1.C3186e
    /* renamed from: q0 */
    public boolean mo15988q0() {
        return this.f13432Z0;
    }

    @Override // p045c1.C3186e
    public String toString() {
        String str = "[Barrier] " + m16125v() + " {";
        for (int i11 = 0; i11 < this.f13663V0; i11++) {
            C3186e c3186e = this.f13662U0[i11];
            if (i11 > 0) {
                str = str + ", ";
            }
            str = str + c3186e.m16125v();
        }
        return str + "}";
    }

    /* renamed from: w1 */
    public boolean m15989w1() {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        boolean z11 = true;
        while (true) {
            i11 = this.f13663V0;
            if (i14 >= i11) {
                break;
            }
            C3186e c3186e = this.f13662U0[i14];
            if ((this.f13430X0 || c3186e.mo15985h()) && ((((i12 = this.f13429W0) == 0 || i12 == 1) && !c3186e.mo15987p0()) || (((i13 = this.f13429W0) == 2 || i13 == 3) && !c3186e.mo15988q0()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int i15 = 0;
        boolean z12 = false;
        for (int i16 = 0; i16 < this.f13663V0; i16++) {
            C3186e c3186e2 = this.f13662U0[i16];
            if (this.f13430X0 || c3186e2.mo15985h()) {
                if (!z12) {
                    int i17 = this.f13429W0;
                    if (i17 == 0) {
                        i15 = c3186e2.mo16112q(C3185d.b.LEFT).m16002e();
                    } else if (i17 == 1) {
                        i15 = c3186e2.mo16112q(C3185d.b.RIGHT).m16002e();
                    } else if (i17 == 2) {
                        i15 = c3186e2.mo16112q(C3185d.b.TOP).m16002e();
                    } else if (i17 == 3) {
                        i15 = c3186e2.mo16112q(C3185d.b.BOTTOM).m16002e();
                    }
                    z12 = true;
                }
                int i18 = this.f13429W0;
                if (i18 == 0) {
                    i15 = Math.min(i15, c3186e2.mo16112q(C3185d.b.LEFT).m16002e());
                } else if (i18 == 1) {
                    i15 = Math.max(i15, c3186e2.mo16112q(C3185d.b.RIGHT).m16002e());
                } else if (i18 == 2) {
                    i15 = Math.min(i15, c3186e2.mo16112q(C3185d.b.TOP).m16002e());
                } else if (i18 == 3) {
                    i15 = Math.max(i15, c3186e2.mo16112q(C3185d.b.BOTTOM).m16002e());
                }
            }
        }
        int i19 = i15 + this.f13431Y0;
        int i21 = this.f13429W0;
        if (i21 != 0 && i21 != 1) {
            m16047L0(i19, i19);
        } else {
            m16041I0(i19, i19);
        }
        this.f13432Z0 = true;
        return true;
    }

    /* renamed from: x1 */
    public boolean m15990x1() {
        return this.f13430X0;
    }

    /* renamed from: y1 */
    public int m15991y1() {
        return this.f13429W0;
    }

    /* renamed from: z1 */
    public int m15992z1() {
        return this.f13431Y0;
    }
}
