package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d5 */
/* loaded from: classes2.dex */
public final class C4415d5 implements InterfaceC4822o5 {

    /* renamed from: a */
    private final wz1 f19088a;

    /* renamed from: b */
    private final x02 f19089b;

    /* renamed from: c */
    private final String f19090c;

    /* renamed from: d */
    private String f19091d;

    /* renamed from: e */
    private InterfaceC4928r f19092e;

    /* renamed from: f */
    private int f19093f;

    /* renamed from: g */
    private int f19094g;

    /* renamed from: h */
    private boolean f19095h;

    /* renamed from: i */
    private long f19096i;

    /* renamed from: j */
    private C4671k3 f19097j;

    /* renamed from: k */
    private int f19098k;

    /* renamed from: l */
    private long f19099l;

    public C4415d5(String str) {
        wz1 wz1Var = new wz1(new byte[128], 128);
        this.f19088a = wz1Var;
        this.f19089b = new x02(wz1Var.f30280a);
        this.f19093f = 0;
        this.f19099l = -9223372036854775807L;
        this.f19090c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    public final void mo20009a(x02 x02Var) {
        boolean z11;
        boolean z12;
        v71.m27171b(this.f19092e);
        while (x02Var.m27778i() > 0) {
            int i11 = this.f19093f;
            if (i11 == 0) {
                while (true) {
                    if (x02Var.m27778i() <= 0) {
                        break;
                    }
                    if (!this.f19095h) {
                        if (x02Var.m27788s() == 11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f19095h = z11;
                    } else {
                        int m27788s = x02Var.m27788s();
                        if (m27788s == 119) {
                            this.f19095h = false;
                            this.f19093f = 1;
                            x02 x02Var2 = this.f19089b;
                            x02Var2.m27777h()[0] = 11;
                            x02Var2.m27777h()[1] = 119;
                            this.f19094g = 2;
                            break;
                        }
                        if (m27788s == 11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f19095h = z12;
                    }
                }
            } else if (i11 != 1) {
                int min = Math.min(x02Var.m27778i(), this.f19098k - this.f19094g);
                this.f19092e.mo23301e(x02Var, min);
                int i12 = this.f19094g + min;
                this.f19094g = i12;
                int i13 = this.f19098k;
                if (i12 == i13) {
                    long j11 = this.f19099l;
                    if (j11 != -9223372036854775807L) {
                        this.f19092e.mo23302f(j11, 1, i13, 0, null);
                        this.f19099l += this.f19096i;
                    }
                    this.f19093f = 0;
                }
            } else {
                byte[] m27777h = this.f19089b.m27777h();
                int min2 = Math.min(x02Var.m27778i(), 128 - this.f19094g);
                x02Var.m27771b(m27777h, this.f19094g, min2);
                int i14 = this.f19094g + min2;
                this.f19094g = i14;
                if (i14 == 128) {
                    this.f19088a.m27751h(0);
                    il4 m23642e = jl4.m23642e(this.f19088a);
                    C4671k3 c4671k3 = this.f19097j;
                    if (c4671k3 == null || m23642e.f22224c != c4671k3.f23112y || m23642e.f22223b != c4671k3.f23113z || !g92.m22362t(m23642e.f22222a, c4671k3.f23099l)) {
                        C5004t1 c5004t1 = new C5004t1();
                        c5004t1.m26511h(this.f19091d);
                        c5004t1.m26523s(m23642e.f22222a);
                        c5004t1.m26506e0(m23642e.f22224c);
                        c5004t1.m26524t(m23642e.f22223b);
                        c5004t1.m26515k(this.f19090c);
                        C4671k3 m26529y = c5004t1.m26529y();
                        this.f19097j = m26529y;
                        this.f19092e.mo23300d(m26529y);
                    }
                    this.f19098k = m23642e.f22225d;
                    this.f19096i = (m23642e.f22226e * 1000000) / this.f19097j.f23113z;
                    this.f19089b.m27775f(0);
                    this.f19092e.mo23301e(this.f19089b, 128);
                    this.f19093f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f19091d = c4344b7.m20419b();
        this.f19092e = mm4Var.mo21604i(c4344b7.m20418a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f19099l = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f19093f = 0;
        this.f19094g = 0;
        this.f19095h = false;
        this.f19099l = -9223372036854775807L;
    }
}
