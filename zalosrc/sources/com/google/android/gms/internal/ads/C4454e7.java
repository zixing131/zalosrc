package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e7 */
/* loaded from: classes2.dex */
final class C4454e7 {

    /* renamed from: a */
    private final List f19537a;

    /* renamed from: b */
    private final InterfaceC4928r[] f19538b;

    public C4454e7(List list) {
        this.f19537a = list;
        this.f19538b = new InterfaceC4928r[list.size()];
    }

    /* renamed from: a */
    public final void m21623a(long j11, x02 x02Var) {
        if (x02Var.m27778i() < 9) {
            return;
        }
        int m27782m = x02Var.m27782m();
        int m27782m2 = x02Var.m27782m();
        int m27788s = x02Var.m27788s();
        if (m27782m == 434 && m27782m2 == 1195456820 && m27788s == 3) {
            vl4.m27304b(j11, x02Var, this.f19538b);
        }
    }

    /* renamed from: b */
    public final void m21624b(mm4 mm4Var, C4344b7 c4344b7) {
        for (int i11 = 0; i11 < this.f19538b.length; i11++) {
            c4344b7.m20420c();
            InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 3);
            C4671k3 c4671k3 = (C4671k3) this.f19537a.get(i11);
            String str = c4671k3.f23099l;
            boolean z11 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z11 = false;
            }
            v71.m27174e(z11, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26511h(c4344b7.m20419b());
            c5004t1.m26523s(str);
            c5004t1.m26525u(c4671k3.f23091d);
            c5004t1.m26515k(c4671k3.f23090c);
            c5004t1.m26502c0(c4671k3.f23085D);
            c5004t1.m26513i(c4671k3.f23101n);
            mo21604i.mo23300d(c5004t1.m26529y());
            this.f19538b[i11] = mo21604i;
        }
    }
}
