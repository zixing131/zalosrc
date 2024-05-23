package p045c1;

import java.util.HashSet;
import p045c1.C3186e;
import p088d1.C17693b;

/* renamed from: c1.m */
/* loaded from: classes2.dex */
public abstract class AbstractC3194m extends C3191j {

    /* renamed from: W0 */
    private int f13665W0 = 0;

    /* renamed from: X0 */
    private int f13666X0 = 0;

    /* renamed from: Y0 */
    private int f13667Y0 = 0;

    /* renamed from: Z0 */
    private int f13668Z0 = 0;

    /* renamed from: a1 */
    private int f13669a1 = 0;

    /* renamed from: b1 */
    private int f13670b1 = 0;

    /* renamed from: c1 */
    private int f13671c1 = 0;

    /* renamed from: d1 */
    private int f13672d1 = 0;

    /* renamed from: e1 */
    private boolean f13673e1 = false;

    /* renamed from: f1 */
    private int f13674f1 = 0;

    /* renamed from: g1 */
    private int f13675g1 = 0;

    /* renamed from: h1 */
    protected C17693b.a f13676h1 = new C17693b.a();

    /* renamed from: i1 */
    C17693b.b f13677i1 = null;

    /* renamed from: A1 */
    public int m16242A1() {
        return this.f13674f1;
    }

    /* renamed from: B1 */
    public int m16243B1() {
        return this.f13666X0;
    }

    /* renamed from: C1 */
    public int m16244C1() {
        return this.f13671c1;
    }

    /* renamed from: D1 */
    public int m16245D1() {
        return this.f13672d1;
    }

    /* renamed from: E1 */
    public int m16246E1() {
        return this.f13665W0;
    }

    /* renamed from: F1 */
    public abstract void mo16200F1(int i11, int i12, int i13, int i14);

    /* renamed from: G1 */
    public void m16247G1(C3186e c3186e, C3186e.b bVar, int i11, C3186e.b bVar2, int i12) {
        while (this.f13677i1 == null && m16048M() != null) {
            this.f13677i1 = ((C3187f) m16048M()).m16148L1();
        }
        C17693b.a aVar = this.f13676h1;
        aVar.f89702a = bVar;
        aVar.f89703b = bVar2;
        aVar.f89704c = i11;
        aVar.f89705d = i12;
        this.f13677i1.mo6393b(c3186e, aVar);
        c3186e.m16106n1(this.f13676h1.f89706e);
        c3186e.m16053O0(this.f13676h1.f89707f);
        c3186e.m16051N0(this.f13676h1.f89709h);
        c3186e.m16031D0(this.f13676h1.f89708g);
    }

    /* renamed from: H1 */
    public boolean m16248H1() {
        C17693b.b bVar;
        C3186e c3186e = this.f13526c0;
        if (c3186e != null) {
            bVar = ((C3187f) c3186e).m16148L1();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        for (int i11 = 0; i11 < this.f13663V0; i11++) {
            C3186e c3186e2 = this.f13662U0[i11];
            if (c3186e2 != null && !(c3186e2 instanceof C3189h)) {
                C3186e.b m16127w = c3186e2.m16127w(0);
                C3186e.b m16127w2 = c3186e2.m16127w(1);
                C3186e.b bVar2 = C3186e.b.MATCH_CONSTRAINT;
                if (m16127w != bVar2 || c3186e2.f13565w == 1 || m16127w2 != bVar2 || c3186e2.f13567x == 1) {
                    if (m16127w == bVar2) {
                        m16127w = C3186e.b.WRAP_CONTENT;
                    }
                    if (m16127w2 == bVar2) {
                        m16127w2 = C3186e.b.WRAP_CONTENT;
                    }
                    C17693b.a aVar = this.f13676h1;
                    aVar.f89702a = m16127w;
                    aVar.f89703b = m16127w2;
                    aVar.f89704c = c3186e2.m16070Y();
                    this.f13676h1.f89705d = c3186e2.m16133z();
                    bVar.mo6393b(c3186e2, this.f13676h1);
                    c3186e2.m16106n1(this.f13676h1.f89706e);
                    c3186e2.m16053O0(this.f13676h1.f89707f);
                    c3186e2.m16031D0(this.f13676h1.f89708g);
                }
            }
        }
        return true;
    }

    /* renamed from: I1 */
    public boolean m16249I1() {
        return this.f13673e1;
    }

    /* renamed from: J1 */
    public void m16250J1(boolean z11) {
        this.f13673e1 = z11;
    }

    /* renamed from: K1 */
    public void m16251K1(int i11, int i12) {
        this.f13674f1 = i11;
        this.f13675g1 = i12;
    }

    /* renamed from: L1 */
    public void m16252L1(int i11) {
        this.f13667Y0 = i11;
        this.f13665W0 = i11;
        this.f13668Z0 = i11;
        this.f13666X0 = i11;
        this.f13669a1 = i11;
        this.f13670b1 = i11;
    }

    /* renamed from: M1 */
    public void m16253M1(int i11) {
        this.f13666X0 = i11;
    }

    /* renamed from: N1 */
    public void m16254N1(int i11) {
        this.f13670b1 = i11;
    }

    /* renamed from: O1 */
    public void m16255O1(int i11) {
        this.f13667Y0 = i11;
        this.f13671c1 = i11;
    }

    /* renamed from: P1 */
    public void m16256P1(int i11) {
        this.f13668Z0 = i11;
        this.f13672d1 = i11;
    }

    /* renamed from: Q1 */
    public void m16257Q1(int i11) {
        this.f13669a1 = i11;
        this.f13671c1 = i11;
        this.f13672d1 = i11;
    }

    /* renamed from: R1 */
    public void m16258R1(int i11) {
        this.f13665W0 = i11;
    }

    @Override // p045c1.C3191j, p045c1.InterfaceC3190i
    /* renamed from: b */
    public void mo16236b(C3187f c3187f) {
        m16260x1();
    }

    /* renamed from: w1 */
    public void m16259w1(boolean z11) {
        int i11 = this.f13669a1;
        if (i11 > 0 || this.f13670b1 > 0) {
            if (z11) {
                this.f13671c1 = this.f13670b1;
                this.f13672d1 = i11;
            } else {
                this.f13671c1 = i11;
                this.f13672d1 = this.f13670b1;
            }
        }
    }

    /* renamed from: x1 */
    public void m16260x1() {
        for (int i11 = 0; i11 < this.f13663V0; i11++) {
            C3186e c3186e = this.f13662U0[i11];
            if (c3186e != null) {
                c3186e.m16069X0(true);
            }
        }
    }

    /* renamed from: y1 */
    public boolean m16261y1(HashSet hashSet) {
        for (int i11 = 0; i11 < this.f13663V0; i11++) {
            if (hashSet.contains(this.f13662U0[i11])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z1 */
    public int m16262z1() {
        return this.f13675g1;
    }
}
