package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g5 */
/* loaded from: classes2.dex */
public final class C4526g5 implements InterfaceC4822o5 {

    /* renamed from: a */
    private final wz1 f20404a;

    /* renamed from: b */
    private final x02 f20405b;

    /* renamed from: c */
    private final String f20406c;

    /* renamed from: d */
    private String f20407d;

    /* renamed from: e */
    private InterfaceC4928r f20408e;

    /* renamed from: f */
    private int f20409f;

    /* renamed from: g */
    private int f20410g;

    /* renamed from: h */
    private boolean f20411h;

    /* renamed from: i */
    private long f20412i;

    /* renamed from: j */
    private C4671k3 f20413j;

    /* renamed from: k */
    private int f20414k;

    /* renamed from: l */
    private long f20415l;

    public C4526g5(String str) {
        wz1 wz1Var = new wz1(new byte[16], 16);
        this.f20404a = wz1Var;
        this.f20405b = new x02(wz1Var.f30280a);
        this.f20409f = 0;
        this.f20410g = 0;
        this.f20411h = false;
        this.f20415l = -9223372036854775807L;
        this.f20406c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    public final void mo20009a(x02 x02Var) {
        boolean z11;
        boolean z12;
        v71.m27171b(this.f20408e);
        while (x02Var.m27778i() > 0) {
            int i11 = this.f20409f;
            if (i11 != 0) {
                if (i11 != 1) {
                    int min = Math.min(x02Var.m27778i(), this.f20414k - this.f20410g);
                    this.f20408e.mo23301e(x02Var, min);
                    int i12 = this.f20410g + min;
                    this.f20410g = i12;
                    int i13 = this.f20414k;
                    if (i12 == i13) {
                        long j11 = this.f20415l;
                        if (j11 != -9223372036854775807L) {
                            this.f20408e.mo23302f(j11, 1, i13, 0, null);
                            this.f20415l += this.f20412i;
                        }
                        this.f20409f = 0;
                    }
                } else {
                    byte[] m27777h = this.f20405b.m27777h();
                    int min2 = Math.min(x02Var.m27778i(), 16 - this.f20410g);
                    x02Var.m27771b(m27777h, this.f20410g, min2);
                    int i14 = this.f20410g + min2;
                    this.f20410g = i14;
                    if (i14 == 16) {
                        this.f20404a.m27751h(0);
                        ll4 m24628a = ml4.m24628a(this.f20404a);
                        C4671k3 c4671k3 = this.f20413j;
                        if (c4671k3 == null || c4671k3.f23112y != 2 || m24628a.f23972a != c4671k3.f23113z || !"audio/ac4".equals(c4671k3.f23099l)) {
                            C5004t1 c5004t1 = new C5004t1();
                            c5004t1.m26511h(this.f20407d);
                            c5004t1.m26523s("audio/ac4");
                            c5004t1.m26506e0(2);
                            c5004t1.m26524t(m24628a.f23972a);
                            c5004t1.m26515k(this.f20406c);
                            C4671k3 m26529y = c5004t1.m26529y();
                            this.f20413j = m26529y;
                            this.f20408e.mo23300d(m26529y);
                        }
                        this.f20414k = m24628a.f23973b;
                        this.f20412i = (m24628a.f23974c * 1000000) / this.f20413j.f23113z;
                        this.f20405b.m27775f(0);
                        this.f20408e.mo23301e(this.f20405b, 16);
                        this.f20409f = 2;
                    }
                }
            } else {
                while (x02Var.m27778i() > 0) {
                    if (!this.f20411h) {
                        if (x02Var.m27788s() == 172) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20411h = z11;
                    } else {
                        int m27788s = x02Var.m27788s();
                        if (m27788s == 172) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f20411h = z12;
                        byte b11 = 64;
                        if (m27788s != 64) {
                            if (m27788s == 65) {
                                m27788s = 65;
                            }
                        }
                        this.f20409f = 1;
                        x02 x02Var2 = this.f20405b;
                        x02Var2.m27777h()[0] = -84;
                        byte[] m27777h2 = x02Var2.m27777h();
                        if (m27788s == 65) {
                            b11 = 65;
                        }
                        m27777h2[1] = b11;
                        this.f20410g = 2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f20407d = c4344b7.m20419b();
        this.f20408e = mm4Var.mo21604i(c4344b7.m20418a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f20415l = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f20409f = 0;
        this.f20410g = 0;
        this.f20411h = false;
        this.f20415l = -9223372036854775807L;
    }
}
