package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c6 */
/* loaded from: classes2.dex */
public final class C4379c6 implements InterfaceC4822o5 {

    /* renamed from: a */
    private final x02 f18118a;

    /* renamed from: b */
    private final C4409d f18119b;

    /* renamed from: c */
    private final String f18120c;

    /* renamed from: d */
    private InterfaceC4928r f18121d;

    /* renamed from: e */
    private String f18122e;

    /* renamed from: f */
    private int f18123f = 0;

    /* renamed from: g */
    private int f18124g;

    /* renamed from: h */
    private boolean f18125h;

    /* renamed from: i */
    private boolean f18126i;

    /* renamed from: j */
    private long f18127j;

    /* renamed from: k */
    private int f18128k;

    /* renamed from: l */
    private long f18129l;

    public C4379c6(String str) {
        x02 x02Var = new x02(4);
        this.f18118a = x02Var;
        x02Var.m27777h()[0] = -1;
        this.f18119b = new C4409d();
        this.f18129l = -9223372036854775807L;
        this.f18120c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    public final void mo20009a(x02 x02Var) {
        boolean z11;
        boolean z12;
        v71.m27171b(this.f18121d);
        while (x02Var.m27778i() > 0) {
            int i11 = this.f18123f;
            if (i11 != 0) {
                if (i11 != 1) {
                    int min = Math.min(x02Var.m27778i(), this.f18128k - this.f18124g);
                    this.f18121d.mo23301e(x02Var, min);
                    int i12 = this.f18124g + min;
                    this.f18124g = i12;
                    int i13 = this.f18128k;
                    if (i12 >= i13) {
                        long j11 = this.f18129l;
                        if (j11 != -9223372036854775807L) {
                            this.f18121d.mo23302f(j11, 1, i13, 0, null);
                            this.f18129l += this.f18127j;
                        }
                        this.f18124g = 0;
                        this.f18123f = 0;
                    }
                } else {
                    int min2 = Math.min(x02Var.m27778i(), 4 - this.f18124g);
                    x02Var.m27771b(this.f18118a.m27777h(), this.f18124g, min2);
                    int i14 = this.f18124g + min2;
                    this.f18124g = i14;
                    if (i14 >= 4) {
                        this.f18118a.m27775f(0);
                        if (!this.f18119b.m21245a(this.f18118a.m27782m())) {
                            this.f18124g = 0;
                            this.f18123f = 1;
                        } else {
                            this.f18128k = this.f18119b.f19043c;
                            if (!this.f18125h) {
                                this.f18127j = (r0.f19047g * 1000000) / r0.f19044d;
                                C5004t1 c5004t1 = new C5004t1();
                                c5004t1.m26511h(this.f18122e);
                                c5004t1.m26523s(this.f18119b.f19042b);
                                c5004t1.m26516l(4096);
                                c5004t1.m26506e0(this.f18119b.f19045e);
                                c5004t1.m26524t(this.f18119b.f19044d);
                                c5004t1.m26515k(this.f18120c);
                                this.f18121d.mo23300d(c5004t1.m26529y());
                                this.f18125h = true;
                            }
                            this.f18118a.m27775f(0);
                            this.f18121d.mo23301e(this.f18118a, 4);
                            this.f18123f = 2;
                        }
                    }
                }
            } else {
                byte[] m27777h = x02Var.m27777h();
                int m27780k = x02Var.m27780k();
                int m27781l = x02Var.m27781l();
                while (true) {
                    if (m27780k < m27781l) {
                        byte b11 = m27777h[m27780k];
                        if ((b11 & 255) == 255) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (this.f18126i && (b11 & 224) == 224) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f18126i = z11;
                        if (z12) {
                            x02Var.m27775f(m27780k + 1);
                            this.f18126i = false;
                            this.f18118a.m27777h()[1] = m27777h[m27780k];
                            this.f18124g = 2;
                            this.f18123f = 1;
                            break;
                        }
                        m27780k++;
                    } else {
                        x02Var.m27775f(m27781l);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f18122e = c4344b7.m20419b();
        this.f18121d = mm4Var.mo21604i(c4344b7.m20418a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f18129l = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f18123f = 0;
        this.f18124g = 0;
        this.f18126i = false;
        this.f18129l = -9223372036854775807L;
    }
}
