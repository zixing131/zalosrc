package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e6 */
/* loaded from: classes2.dex */
public final class C4453e6 implements InterfaceC4823o6 {

    /* renamed from: a */
    private C4671k3 f19528a;

    /* renamed from: b */
    private a72 f19529b;

    /* renamed from: c */
    private InterfaceC4928r f19530c;

    public C4453e6(String str) {
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26523s(str);
        this.f19528a = c5004t1.m26529y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823o6
    /* renamed from: a */
    public final void mo21618a(x02 x02Var) {
        v71.m27171b(this.f19529b);
        int i11 = g92.f20474a;
        long m20016d = this.f19529b.m20016d();
        long m20017e = this.f19529b.m20017e();
        if (m20016d != -9223372036854775807L && m20017e != -9223372036854775807L) {
            C4671k3 c4671k3 = this.f19528a;
            if (m20017e != c4671k3.f23103p) {
                C5004t1 m23809b = c4671k3.m23809b();
                m23809b.m26527w(m20017e);
                C4671k3 m26529y = m23809b.m26529y();
                this.f19528a = m26529y;
                this.f19530c.mo23300d(m26529y);
            }
            int m27778i = x02Var.m27778i();
            this.f19530c.mo23301e(x02Var, m27778i);
            this.f19530c.mo23302f(m20016d, 1, m27778i, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823o6
    /* renamed from: b */
    public final void mo21619b(a72 a72Var, mm4 mm4Var, C4344b7 c4344b7) {
        this.f19529b = a72Var;
        c4344b7.m20420c();
        InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 5);
        this.f19530c = mo21604i;
        mo21604i.mo23300d(this.f19528a);
    }
}
