package p045c1;

import p045c1.C3186e;
import p700z0.C31133d;

/* renamed from: c1.k */
/* loaded from: classes2.dex */
public abstract class AbstractC3192k {

    /* renamed from: a */
    static boolean[] f13664a = new boolean[3];

    /* renamed from: a */
    public static void m16240a(C3187f c3187f, C31133d c31133d, C3186e c3186e) {
        c3186e.f13559t = -1;
        c3186e.f13561u = -1;
        C3186e.b bVar = c3187f.f13524b0[0];
        C3186e.b bVar2 = C3186e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c3186e.f13524b0[0] == C3186e.b.MATCH_PARENT) {
            int i11 = c3186e.f13508Q.f13461g;
            int m16070Y = c3187f.m16070Y() - c3186e.f13512S.f13461g;
            C3185d c3185d = c3186e.f13508Q;
            c3185d.f13463i = c31133d.m151277q(c3185d);
            C3185d c3185d2 = c3186e.f13512S;
            c3185d2.f13463i = c31133d.m151277q(c3185d2);
            c31133d.m151268f(c3186e.f13508Q.f13463i, i11);
            c31133d.m151268f(c3186e.f13512S.f13463i, m16070Y);
            c3186e.f13559t = 2;
            c3186e.m16058R0(i11, m16070Y);
        }
        if (c3187f.f13524b0[1] != bVar2 && c3186e.f13524b0[1] == C3186e.b.MATCH_PARENT) {
            int i12 = c3186e.f13510R.f13461g;
            int m16133z = c3187f.m16133z() - c3186e.f13514T.f13461g;
            C3185d c3185d3 = c3186e.f13510R;
            c3185d3.f13463i = c31133d.m151277q(c3185d3);
            C3185d c3185d4 = c3186e.f13514T;
            c3185d4.f13463i = c31133d.m151277q(c3185d4);
            c31133d.m151268f(c3186e.f13510R.f13463i, i12);
            c31133d.m151268f(c3186e.f13514T.f13463i, m16133z);
            if (c3186e.f13548n0 > 0 || c3186e.m16068X() == 8) {
                C3185d c3185d5 = c3186e.f13515U;
                c3185d5.f13463i = c31133d.m151277q(c3185d5);
                c31133d.m151268f(c3186e.f13515U.f13463i, c3186e.f13548n0 + i12);
            }
            c3186e.f13561u = 2;
            c3186e.m16092i1(i12, m16133z);
        }
    }

    /* renamed from: b */
    public static final boolean m16241b(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
