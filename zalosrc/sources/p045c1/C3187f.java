package p045c1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p045c1.C3186e;
import p088d1.AbstractC17699h;
import p088d1.AbstractC17700i;
import p088d1.C17693b;
import p088d1.C17696e;
import p700z0.C31133d;
import p700z0.C31138i;

/* renamed from: c1.f */
/* loaded from: classes2.dex */
public class C3187f extends AbstractC3195n {

    /* renamed from: X0 */
    private int f13582X0;

    /* renamed from: b1 */
    int f13586b1;

    /* renamed from: c1 */
    int f13587c1;

    /* renamed from: d1 */
    int f13588d1;

    /* renamed from: e1 */
    int f13589e1;

    /* renamed from: V0 */
    C17693b f13580V0 = new C17693b(this);

    /* renamed from: W0 */
    public C17696e f13581W0 = new C17696e(this);

    /* renamed from: Y0 */
    protected C17693b.b f13583Y0 = null;

    /* renamed from: Z0 */
    private boolean f13584Z0 = false;

    /* renamed from: a1 */
    protected C31133d f13585a1 = new C31133d();

    /* renamed from: f1 */
    public int f13590f1 = 0;

    /* renamed from: g1 */
    public int f13591g1 = 0;

    /* renamed from: h1 */
    C3184c[] f13592h1 = new C3184c[4];

    /* renamed from: i1 */
    C3184c[] f13593i1 = new C3184c[4];

    /* renamed from: j1 */
    public boolean f13594j1 = false;

    /* renamed from: k1 */
    public boolean f13595k1 = false;

    /* renamed from: l1 */
    public boolean f13596l1 = false;

    /* renamed from: m1 */
    public int f13597m1 = 0;

    /* renamed from: n1 */
    public int f13598n1 = 0;

    /* renamed from: o1 */
    private int f13599o1 = 257;

    /* renamed from: p1 */
    public boolean f13600p1 = false;

    /* renamed from: q1 */
    private boolean f13601q1 = false;

    /* renamed from: r1 */
    private boolean f13602r1 = false;

    /* renamed from: s1 */
    int f13603s1 = 0;

    /* renamed from: t1 */
    private WeakReference f13604t1 = null;

    /* renamed from: u1 */
    private WeakReference f13605u1 = null;

    /* renamed from: v1 */
    private WeakReference f13606v1 = null;

    /* renamed from: w1 */
    private WeakReference f13607w1 = null;

    /* renamed from: x1 */
    HashSet f13608x1 = new HashSet();

    /* renamed from: y1 */
    public C17693b.a f13609y1 = new C17693b.a();

    /* renamed from: A1 */
    private void m16135A1(C3186e c3186e) {
        int i11 = this.f13590f1 + 1;
        C3184c[] c3184cArr = this.f13593i1;
        if (i11 >= c3184cArr.length) {
            this.f13593i1 = (C3184c[]) Arrays.copyOf(c3184cArr, c3184cArr.length * 2);
        }
        this.f13593i1[this.f13590f1] = new C3184c(c3186e, 0, m16155S1());
        this.f13590f1++;
    }

    /* renamed from: D1 */
    private void m16136D1(C3185d c3185d, C31138i c31138i) {
        this.f13585a1.m151270h(c31138i, this.f13585a1.m151277q(c3185d), 0, 5);
    }

    /* renamed from: E1 */
    private void m16137E1(C3185d c3185d, C31138i c31138i) {
        this.f13585a1.m151270h(this.f13585a1.m151277q(c3185d), c31138i, 0, 5);
    }

    /* renamed from: F1 */
    private void m16138F1(C3186e c3186e) {
        int i11 = this.f13591g1 + 1;
        C3184c[] c3184cArr = this.f13592h1;
        if (i11 >= c3184cArr.length) {
            this.f13592h1 = (C3184c[]) Arrays.copyOf(c3184cArr, c3184cArr.length * 2);
        }
        this.f13592h1[this.f13591g1] = new C3184c(c3186e, 1, m16155S1());
        this.f13591g1++;
    }

    /* renamed from: V1 */
    public static boolean m16139V1(int i11, C3186e c3186e, C17693b.b bVar, C17693b.a aVar, int i12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        if (bVar == null) {
            return false;
        }
        if (c3186e.m16068X() != 8 && !(c3186e instanceof C3189h) && !(c3186e instanceof C3182a)) {
            aVar.f89702a = c3186e.m16029C();
            aVar.f89703b = c3186e.m16064V();
            aVar.f89704c = c3186e.m16070Y();
            aVar.f89705d = c3186e.m16133z();
            aVar.f89710i = false;
            aVar.f89711j = i12;
            C3186e.b bVar2 = aVar.f89702a;
            C3186e.b bVar3 = C3186e.b.MATCH_CONSTRAINT;
            if (bVar2 == bVar3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (aVar.f89703b == bVar3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && c3186e.f13532f0 > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 && c3186e.f13532f0 > 0.0f) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z11 && c3186e.m16078c0(0) && c3186e.f13565w == 0 && !z13) {
                aVar.f89702a = C3186e.b.WRAP_CONTENT;
                if (z12 && c3186e.f13567x == 0) {
                    aVar.f89702a = C3186e.b.FIXED;
                }
                z11 = false;
            }
            if (z12 && c3186e.m16078c0(1) && c3186e.f13567x == 0 && !z14) {
                aVar.f89703b = C3186e.b.WRAP_CONTENT;
                if (z11 && c3186e.f13565w == 0) {
                    aVar.f89703b = C3186e.b.FIXED;
                }
                z12 = false;
            }
            if (c3186e.mo15987p0()) {
                aVar.f89702a = C3186e.b.FIXED;
                z11 = false;
            }
            if (c3186e.mo15988q0()) {
                aVar.f89703b = C3186e.b.FIXED;
                z12 = false;
            }
            if (z13) {
                if (c3186e.f13569y[0] == 4) {
                    aVar.f89702a = C3186e.b.FIXED;
                } else if (!z12) {
                    C3186e.b bVar4 = aVar.f89703b;
                    C3186e.b bVar5 = C3186e.b.FIXED;
                    if (bVar4 == bVar5) {
                        i14 = aVar.f89705d;
                    } else {
                        aVar.f89702a = C3186e.b.WRAP_CONTENT;
                        bVar.mo6393b(c3186e, aVar);
                        i14 = aVar.f89707f;
                    }
                    aVar.f89702a = bVar5;
                    aVar.f89704c = (int) (c3186e.m16129x() * i14);
                }
            }
            if (z14) {
                if (c3186e.f13569y[1] == 4) {
                    aVar.f89703b = C3186e.b.FIXED;
                } else if (!z11) {
                    C3186e.b bVar6 = aVar.f89702a;
                    C3186e.b bVar7 = C3186e.b.FIXED;
                    if (bVar6 == bVar7) {
                        i13 = aVar.f89704c;
                    } else {
                        aVar.f89703b = C3186e.b.WRAP_CONTENT;
                        bVar.mo6393b(c3186e, aVar);
                        i13 = aVar.f89706e;
                    }
                    aVar.f89703b = bVar7;
                    if (c3186e.m16131y() == -1) {
                        aVar.f89705d = (int) (i13 / c3186e.m16129x());
                    } else {
                        aVar.f89705d = (int) (c3186e.m16129x() * i13);
                    }
                }
            }
            bVar.mo6393b(c3186e, aVar);
            c3186e.m16106n1(aVar.f89706e);
            c3186e.m16053O0(aVar.f89707f);
            c3186e.m16051N0(aVar.f89709h);
            c3186e.m16031D0(aVar.f89708g);
            aVar.f89711j = C17693b.a.f89699k;
            return aVar.f89710i;
        }
        aVar.f89706e = 0;
        aVar.f89707f = 0;
        return false;
    }

    /* renamed from: X1 */
    private void m16140X1() {
        this.f13590f1 = 0;
        this.f13591g1 = 0;
    }

    /* renamed from: B1 */
    public void m16141B1(C3185d c3185d) {
        WeakReference weakReference = this.f13607w1;
        if (weakReference == null || weakReference.get() == null || c3185d.m16002e() > ((C3185d) this.f13607w1.get()).m16002e()) {
            this.f13607w1 = new WeakReference(c3185d);
        }
    }

    /* renamed from: C1 */
    public void m16142C1(C3185d c3185d) {
        WeakReference weakReference = this.f13605u1;
        if (weakReference == null || weakReference.get() == null || c3185d.m16002e() > ((C3185d) this.f13605u1.get()).m16002e()) {
            this.f13605u1 = new WeakReference(c3185d);
        }
    }

    /* renamed from: G1 */
    public void m16143G1(C3185d c3185d) {
        WeakReference weakReference = this.f13606v1;
        if (weakReference == null || weakReference.get() == null || c3185d.m16002e() > ((C3185d) this.f13606v1.get()).m16002e()) {
            this.f13606v1 = new WeakReference(c3185d);
        }
    }

    /* renamed from: H1 */
    public void m16144H1(C3185d c3185d) {
        WeakReference weakReference = this.f13604t1;
        if (weakReference == null || weakReference.get() == null || c3185d.m16002e() > ((C3185d) this.f13604t1.get()).m16002e()) {
            this.f13604t1 = new WeakReference(c3185d);
        }
    }

    /* renamed from: I1 */
    public boolean m16145I1(boolean z11) {
        return this.f13581W0.m93729f(z11);
    }

    /* renamed from: J1 */
    public boolean m16146J1(boolean z11) {
        return this.f13581W0.m93730g(z11);
    }

    /* renamed from: K1 */
    public boolean m16147K1(boolean z11, int i11) {
        return this.f13581W0.m93731h(z11, i11);
    }

    /* renamed from: L1 */
    public C17693b.b m16148L1() {
        return this.f13583Y0;
    }

    /* renamed from: M1 */
    public int m16149M1() {
        return this.f13599o1;
    }

    /* renamed from: N1 */
    public C31133d m16150N1() {
        return this.f13585a1;
    }

    /* renamed from: O1 */
    public boolean m16151O1() {
        return false;
    }

    /* renamed from: P1 */
    public void m16152P1() {
        this.f13581W0.m93732j();
    }

    @Override // p045c1.C3186e
    /* renamed from: Q */
    public void mo16056Q(StringBuilder sb2) {
        sb2.append(this.f13549o + ":{\n");
        sb2.append("  actualWidth:" + this.f13528d0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f13530e0);
        sb2.append("\n");
        Iterator it = m16264u1().iterator();
        while (it.hasNext()) {
            ((C3186e) it.next()).mo16056Q(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    /* renamed from: Q1 */
    public void m16153Q1() {
        this.f13581W0.m93733k();
    }

    /* renamed from: R1 */
    public boolean m16154R1() {
        return this.f13602r1;
    }

    /* renamed from: S1 */
    public boolean m16155S1() {
        return this.f13584Z0;
    }

    /* renamed from: T1 */
    public boolean m16156T1() {
        return this.f13601q1;
    }

    /* renamed from: U1 */
    public long m16157U1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f13586b1 = i18;
        this.f13587c1 = i19;
        return this.f13580V0.m93711d(this, i11, i18, i19, i12, i13, i14, i15, i16, i17);
    }

    /* renamed from: W1 */
    public boolean m16158W1(int i11) {
        return (this.f13599o1 & i11) == i11;
    }

    /* renamed from: Y1 */
    public void m16159Y1(C17693b.b bVar) {
        this.f13583Y0 = bVar;
        this.f13581W0.m93735n(bVar);
    }

    /* renamed from: Z1 */
    public void m16160Z1(int i11) {
        this.f13599o1 = i11;
        C31133d.f143428r = m16158W1(512);
    }

    /* renamed from: a2 */
    public void m16161a2(int i11) {
        this.f13582X0 = i11;
    }

    /* renamed from: b2 */
    public void m16162b2(boolean z11) {
        this.f13584Z0 = z11;
    }

    /* renamed from: c2 */
    public boolean m16163c2(C31133d c31133d, boolean[] zArr) {
        zArr[2] = false;
        boolean m16158W1 = m16158W1(64);
        mo16122t1(c31133d, m16158W1);
        int size = this.f13678U0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C3186e c3186e = (C3186e) this.f13678U0.get(i11);
            c3186e.mo16122t1(c31133d, m16158W1);
            if (c3186e.m16083e0()) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: d2 */
    public void m16164d2() {
        this.f13580V0.m93712e(this);
    }

    @Override // p045c1.C3186e
    /* renamed from: s1 */
    public void mo16119s1(boolean z11, boolean z12) {
        super.mo16119s1(z11, z12);
        int size = this.f13678U0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C3186e) this.f13678U0.get(i11)).mo16119s1(z11, z12);
        }
    }

    @Override // p045c1.AbstractC3195n, p045c1.C3186e
    /* renamed from: v0 */
    public void mo16126v0() {
        this.f13585a1.m151263D();
        this.f13586b1 = 0;
        this.f13588d1 = 0;
        this.f13587c1 = 0;
        this.f13589e1 = 0;
        this.f13600p1 = false;
        super.mo16126v0();
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0310  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p045c1.AbstractC3195n
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16165v1() {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r62;
        boolean z16;
        boolean z17;
        int i13;
        C3186e.b bVar;
        this.f13536h0 = 0;
        this.f13538i0 = 0;
        this.f13601q1 = false;
        this.f13602r1 = false;
        int size = this.f13678U0.size();
        int max = Math.max(0, m16070Y());
        int max2 = Math.max(0, m16133z());
        C3186e.b[] bVarArr = this.f13524b0;
        C3186e.b bVar2 = bVarArr[1];
        C3186e.b bVar3 = bVarArr[0];
        if (this.f13582X0 == 0 && AbstractC3192k.m16241b(this.f13599o1, 1)) {
            AbstractC17699h.m93746h(this, m16148L1());
            for (int i14 = 0; i14 < size; i14++) {
                C3186e c3186e = (C3186e) this.f13678U0.get(i14);
                if (c3186e.m16108o0() && !(c3186e instanceof C3189h) && !(c3186e instanceof C3182a) && !(c3186e instanceof AbstractC3194m) && !c3186e.m16105n0()) {
                    C3186e.b m16127w = c3186e.m16127w(0);
                    C3186e.b m16127w2 = c3186e.m16127w(1);
                    C3186e.b bVar4 = C3186e.b.MATCH_CONSTRAINT;
                    if (m16127w != bVar4 || c3186e.f13565w == 1 || m16127w2 != bVar4 || c3186e.f13567x == 1) {
                        m16139V1(0, c3186e, this.f13583Y0, new C17693b.a(), C17693b.a.f89699k);
                    }
                }
            }
        }
        if (size > 2 && ((bVar3 == (bVar = C3186e.b.WRAP_CONTENT) || bVar2 == bVar) && AbstractC3192k.m16241b(this.f13599o1, 1024) && AbstractC17700i.m93750c(this, m16148L1()))) {
            if (bVar3 == bVar) {
                if (max < m16070Y() && max > 0) {
                    m16106n1(max);
                    this.f13601q1 = true;
                } else {
                    max = m16070Y();
                }
            }
            if (bVar2 == bVar) {
                if (max2 < m16133z() && max2 > 0) {
                    m16053O0(max2);
                    this.f13602r1 = true;
                } else {
                    max2 = m16133z();
                }
            }
            i11 = max2;
            i12 = max;
            z11 = true;
        } else {
            i11 = max2;
            i12 = max;
            z11 = false;
        }
        if (!m16158W1(64) && !m16158W1(128)) {
            z12 = false;
        } else {
            z12 = true;
        }
        C31133d c31133d = this.f13585a1;
        c31133d.f143443h = false;
        c31133d.f143444i = false;
        if (this.f13599o1 != 0 && z12) {
            c31133d.f143444i = true;
        }
        ArrayList arrayList = this.f13678U0;
        C3186e.b m16029C = m16029C();
        C3186e.b bVar5 = C3186e.b.WRAP_CONTENT;
        if (m16029C != bVar5 && m16064V() != bVar5) {
            z13 = false;
        } else {
            z13 = true;
        }
        m16140X1();
        for (int i15 = 0; i15 < size; i15++) {
            C3186e c3186e2 = (C3186e) this.f13678U0.get(i15);
            if (c3186e2 instanceof AbstractC3195n) {
                ((AbstractC3195n) c3186e2).mo16165v1();
            }
        }
        boolean m16158W1 = m16158W1(64);
        boolean z18 = z11;
        int i16 = 0;
        boolean z19 = true;
        while (z19) {
            int i17 = i16 + 1;
            try {
                this.f13585a1.m151263D();
                m16140X1();
                m16107o(this.f13585a1);
                for (int i18 = 0; i18 < size; i18++) {
                    ((C3186e) this.f13678U0.get(i18)).m16107o(this.f13585a1);
                }
                z19 = m16167z1(this.f13585a1);
                WeakReference weakReference = this.f13604t1;
                if (weakReference != null && weakReference.get() != null) {
                    m16137E1((C3185d) this.f13604t1.get(), this.f13585a1.m151277q(this.f13510R));
                    this.f13604t1 = null;
                }
                WeakReference weakReference2 = this.f13606v1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    m16136D1((C3185d) this.f13606v1.get(), this.f13585a1.m151277q(this.f13514T));
                    this.f13606v1 = null;
                }
                WeakReference weakReference3 = this.f13605u1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    m16137E1((C3185d) this.f13605u1.get(), this.f13585a1.m151277q(this.f13508Q));
                    this.f13605u1 = null;
                }
                WeakReference weakReference4 = this.f13607w1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    m16136D1((C3185d) this.f13607w1.get(), this.f13585a1.m151277q(this.f13512S));
                    this.f13607w1 = null;
                }
                if (z19) {
                    this.f13585a1.m151282z();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                System.out.println("EXCEPTION : " + e11);
            }
            if (z19) {
                z14 = m16163c2(this.f13585a1, AbstractC3192k.f13664a);
            } else {
                mo16122t1(this.f13585a1, m16158W1);
                for (int i19 = 0; i19 < size; i19++) {
                    ((C3186e) this.f13678U0.get(i19)).mo16122t1(this.f13585a1, m16158W1);
                }
                z14 = false;
            }
            if (z13 && i17 < 8 && AbstractC3192k.f13664a[2]) {
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size) {
                    C3186e c3186e3 = (C3186e) this.f13678U0.get(i21);
                    i23 = Math.max(i23, c3186e3.f13536h0 + c3186e3.m16070Y());
                    i22 = Math.max(i22, c3186e3.f13538i0 + c3186e3.m16133z());
                    i21++;
                    z14 = z14;
                }
                z15 = z14;
                int max3 = Math.max(this.f13550o0, i23);
                int max4 = Math.max(this.f13552p0, i22);
                C3186e.b bVar6 = C3186e.b.WRAP_CONTENT;
                if (bVar3 == bVar6 && m16070Y() < max3) {
                    m16106n1(max3);
                    this.f13524b0[0] = bVar6;
                    z18 = true;
                    z15 = true;
                }
                if (bVar2 == bVar6 && m16133z() < max4) {
                    m16053O0(max4);
                    this.f13524b0[1] = bVar6;
                    z18 = true;
                    z15 = true;
                }
            } else {
                z15 = z14;
            }
            int max5 = Math.max(this.f13550o0, m16070Y());
            if (max5 > m16070Y()) {
                m16106n1(max5);
                this.f13524b0[0] = C3186e.b.FIXED;
                z18 = true;
                z15 = true;
            }
            int max6 = Math.max(this.f13552p0, m16133z());
            if (max6 > m16133z()) {
                m16053O0(max6);
                r62 = 1;
                this.f13524b0[1] = C3186e.b.FIXED;
                z16 = true;
                z15 = true;
            } else {
                r62 = 1;
                z16 = z18;
            }
            if (!z16) {
                C3186e.b bVar7 = this.f13524b0[0];
                C3186e.b bVar8 = C3186e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i12 > 0 && m16070Y() > i12) {
                    this.f13601q1 = r62;
                    this.f13524b0[0] = C3186e.b.FIXED;
                    m16106n1(i12);
                    z16 = true;
                    z15 = true;
                }
                if (this.f13524b0[r62] == bVar8 && i11 > 0 && m16133z() > i11) {
                    this.f13602r1 = r62;
                    this.f13524b0[r62] = C3186e.b.FIXED;
                    m16053O0(i11);
                    i13 = 8;
                    z17 = true;
                    z18 = true;
                    if (i17 <= i13) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    i16 = i17;
                }
            }
            z18 = z16;
            z17 = z15;
            i13 = 8;
            if (i17 <= i13) {
            }
            i16 = i17;
        }
        this.f13678U0 = arrayList;
        if (z18) {
            C3186e.b[] bVarArr2 = this.f13524b0;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        mo16134z0(this.f13585a1.m151280v());
    }

    /* renamed from: y1 */
    public void m16166y1(C3186e c3186e, int i11) {
        if (i11 == 0) {
            m16135A1(c3186e);
        } else if (i11 == 1) {
            m16138F1(c3186e);
        }
    }

    /* renamed from: z1 */
    public boolean m16167z1(C31133d c31133d) {
        int i11;
        boolean m16158W1 = m16158W1(64);
        mo15984g(c31133d, m16158W1);
        int size = this.f13678U0.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            C3186e c3186e = (C3186e) this.f13678U0.get(i12);
            c3186e.m16065V0(0, false);
            c3186e.m16065V0(1, false);
            if (c3186e instanceof C3182a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C3186e c3186e2 = (C3186e) this.f13678U0.get(i13);
                if (c3186e2 instanceof C3182a) {
                    ((C3182a) c3186e2).m15980B1();
                }
            }
        }
        this.f13608x1.clear();
        for (int i14 = 0; i14 < size; i14++) {
            C3186e c3186e3 = (C3186e) this.f13678U0.get(i14);
            if (c3186e3.m16085f()) {
                if (c3186e3 instanceof AbstractC3194m) {
                    this.f13608x1.add(c3186e3);
                } else {
                    c3186e3.mo15984g(c31133d, m16158W1);
                }
            }
        }
        while (this.f13608x1.size() > 0) {
            int size2 = this.f13608x1.size();
            Iterator it = this.f13608x1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC3194m abstractC3194m = (AbstractC3194m) ((C3186e) it.next());
                if (abstractC3194m.m16261y1(this.f13608x1)) {
                    abstractC3194m.mo15984g(c31133d, m16158W1);
                    this.f13608x1.remove(abstractC3194m);
                    break;
                }
            }
            if (size2 == this.f13608x1.size()) {
                Iterator it2 = this.f13608x1.iterator();
                while (it2.hasNext()) {
                    ((C3186e) it2.next()).mo15984g(c31133d, m16158W1);
                }
                this.f13608x1.clear();
            }
        }
        if (C31133d.f143428r) {
            HashSet hashSet = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                C3186e c3186e4 = (C3186e) this.f13678U0.get(i15);
                if (!c3186e4.m16085f()) {
                    hashSet.add(c3186e4);
                }
            }
            if (m16029C() == C3186e.b.WRAP_CONTENT) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            m16082e(this, c31133d, hashSet, i11, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C3186e c3186e5 = (C3186e) it3.next();
                AbstractC3192k.m16240a(this, c31133d, c3186e5);
                c3186e5.mo15984g(c31133d, m16158W1);
            }
        } else {
            for (int i16 = 0; i16 < size; i16++) {
                C3186e c3186e6 = (C3186e) this.f13678U0.get(i16);
                if (c3186e6 instanceof C3187f) {
                    C3186e.b[] bVarArr = c3186e6.f13524b0;
                    C3186e.b bVar = bVarArr[0];
                    C3186e.b bVar2 = bVarArr[1];
                    C3186e.b bVar3 = C3186e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c3186e6.m16059S0(C3186e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c3186e6.m16095j1(C3186e.b.FIXED);
                    }
                    c3186e6.mo15984g(c31133d, m16158W1);
                    if (bVar == bVar3) {
                        c3186e6.m16059S0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c3186e6.m16095j1(bVar2);
                    }
                } else {
                    AbstractC3192k.m16240a(this, c31133d, c3186e6);
                    if (!c3186e6.m16085f()) {
                        c3186e6.mo15984g(c31133d, m16158W1);
                    }
                }
            }
        }
        if (this.f13590f1 > 0) {
            AbstractC3183b.m15994b(this, c31133d, null, 0);
        }
        if (this.f13591g1 > 0) {
            AbstractC3183b.m15994b(this, c31133d, null, 1);
        }
        return true;
    }
}
