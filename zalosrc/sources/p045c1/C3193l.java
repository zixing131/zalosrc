package p045c1;

import p045c1.C3185d;
import p700z0.C31133d;

/* renamed from: c1.l */
/* loaded from: classes2.dex */
public class C3193l extends AbstractC3194m {
    @Override // p045c1.AbstractC3194m
    /* renamed from: F1 */
    public void mo16200F1(int i11, int i12, int i13, int i14) {
        int m16244C1 = m16244C1() + m16245D1();
        int m16246E1 = m16246E1() + m16243B1();
        boolean z11 = false;
        if (this.f13663V0 > 0) {
            m16244C1 += this.f13662U0[0].m16070Y();
            m16246E1 += this.f13662U0[0].m16133z();
        }
        int max = Math.max(m16044K(), m16244C1);
        int max2 = Math.max(m16042J(), m16246E1);
        if (i11 != 1073741824) {
            if (i11 == Integer.MIN_VALUE) {
                i12 = Math.min(max, i12);
            } else if (i11 == 0) {
                i12 = max;
            } else {
                i12 = 0;
            }
        }
        if (i13 != 1073741824) {
            if (i13 == Integer.MIN_VALUE) {
                i14 = Math.min(max2, i14);
            } else if (i13 == 0) {
                i14 = max2;
            } else {
                i14 = 0;
            }
        }
        m16251K1(i12, i14);
        m16106n1(i12);
        m16053O0(i14);
        if (this.f13663V0 > 0) {
            z11 = true;
        }
        m16250J1(z11);
    }

    @Override // p045c1.C3186e
    /* renamed from: g */
    public void mo15984g(C31133d c31133d, boolean z11) {
        super.mo15984g(c31133d, z11);
        if (this.f13663V0 > 0) {
            C3186e c3186e = this.f13662U0[0];
            c3186e.m16128w0();
            C3185d.b bVar = C3185d.b.LEFT;
            c3186e.m16093j(bVar, this, bVar);
            C3185d.b bVar2 = C3185d.b.RIGHT;
            c3186e.m16093j(bVar2, this, bVar2);
            C3185d.b bVar3 = C3185d.b.TOP;
            c3186e.m16093j(bVar3, this, bVar3);
            C3185d.b bVar4 = C3185d.b.BOTTOM;
            c3186e.m16093j(bVar4, this, bVar4);
        }
    }
}
