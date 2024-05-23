package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f6 */
/* loaded from: classes2.dex */
public final class C4490f6 implements InterfaceC4380c7 {

    /* renamed from: a */
    private final InterfaceC4822o5 f20027a;

    /* renamed from: b */
    private final wz1 f20028b = new wz1(new byte[10], 10);

    /* renamed from: c */
    private int f20029c = 0;

    /* renamed from: d */
    private int f20030d;

    /* renamed from: e */
    private a72 f20031e;

    /* renamed from: f */
    private boolean f20032f;

    /* renamed from: g */
    private boolean f20033g;

    /* renamed from: h */
    private boolean f20034h;

    /* renamed from: i */
    private int f20035i;

    /* renamed from: j */
    private int f20036j;

    /* renamed from: k */
    private boolean f20037k;

    public C4490f6(InterfaceC4822o5 interfaceC4822o5) {
        this.f20027a = interfaceC4822o5;
    }

    /* renamed from: c */
    private final void m21951c(int i11) {
        this.f20029c = i11;
        this.f20030d = 0;
    }

    /* renamed from: d */
    private final boolean m21952d(x02 x02Var, byte[] bArr, int i11) {
        int min = Math.min(x02Var.m27778i(), i11 - this.f20030d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            x02Var.m27776g(min);
        } else {
            x02Var.m27771b(bArr, this.f20030d, min);
        }
        int i12 = this.f20030d + min;
        this.f20030d = i12;
        if (i12 == i11) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4380c7
    /* renamed from: a */
    public final void mo20811a(x02 x02Var, int i11) {
        long j11;
        int i12;
        v71.m27171b(this.f20031e);
        int i13 = -1;
        int i14 = 2;
        if ((i11 & 1) != 0) {
            int i15 = this.f20029c;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.f20036j;
                    if (i16 != -1) {
                        lr1.m24356e("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    this.f20027a.zzc();
                } else {
                    lr1.m24356e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m21951c(1);
        }
        int i17 = i11;
        while (x02Var.m27778i() > 0) {
            int i18 = this.f20029c;
            if (i18 != 0) {
                int i19 = 0;
                if (i18 != 1) {
                    if (i18 != i14) {
                        int m27778i = x02Var.m27778i();
                        int i21 = this.f20036j;
                        if (i21 != i13) {
                            i19 = m27778i - i21;
                        }
                        if (i19 > 0) {
                            m27778i -= i19;
                            x02Var.m27774e(x02Var.m27780k() + m27778i);
                        }
                        this.f20027a.mo20009a(x02Var);
                        int i22 = this.f20036j;
                        if (i22 != i13) {
                            int i23 = i22 - m27778i;
                            this.f20036j = i23;
                            if (i23 == 0) {
                                this.f20027a.zzc();
                                m21951c(1);
                            }
                        }
                    } else {
                        if (m21952d(x02Var, this.f20028b.f30280a, Math.min(10, this.f20035i)) && m21952d(x02Var, null, this.f20035i)) {
                            this.f20028b.m27751h(0);
                            if (this.f20032f) {
                                this.f20028b.m27753j(4);
                                int m27746c = this.f20028b.m27746c(3);
                                this.f20028b.m27753j(1);
                                int m27746c2 = this.f20028b.m27746c(15);
                                this.f20028b.m27753j(1);
                                long m27746c3 = (m27746c2 << 15) | (m27746c << 30) | this.f20028b.m27746c(15);
                                this.f20028b.m27753j(1);
                                if (!this.f20034h && this.f20033g) {
                                    this.f20028b.m27753j(4);
                                    int m27746c4 = this.f20028b.m27746c(3);
                                    this.f20028b.m27753j(1);
                                    int m27746c5 = this.f20028b.m27746c(15);
                                    this.f20028b.m27753j(1);
                                    int m27746c6 = this.f20028b.m27746c(15);
                                    this.f20028b.m27753j(1);
                                    this.f20031e.m20014b((m27746c4 << 30) | (m27746c5 << 15) | m27746c6);
                                    this.f20034h = true;
                                }
                                j11 = this.f20031e.m20014b(m27746c3);
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            if (true != this.f20037k) {
                                i12 = 0;
                            } else {
                                i12 = 4;
                            }
                            i17 |= i12;
                            this.f20027a.mo20011c(j11, i17);
                            m21951c(3);
                            i13 = -1;
                        }
                    }
                } else if (m21952d(x02Var, this.f20028b.f30280a, 9)) {
                    int i24 = 0;
                    this.f20028b.m27751h(0);
                    int m27746c7 = this.f20028b.m27746c(24);
                    if (m27746c7 != 1) {
                        lr1.m24356e("PesReader", "Unexpected start code prefix: " + m27746c7);
                        i13 = -1;
                        this.f20036j = -1;
                    } else {
                        this.f20028b.m27753j(8);
                        int m27746c8 = this.f20028b.m27746c(16);
                        this.f20028b.m27753j(5);
                        this.f20037k = this.f20028b.m27755l();
                        this.f20028b.m27753j(2);
                        this.f20032f = this.f20028b.m27755l();
                        this.f20033g = this.f20028b.m27755l();
                        this.f20028b.m27753j(6);
                        int m27746c9 = this.f20028b.m27746c(8);
                        this.f20035i = m27746c9;
                        if (m27746c8 == 0) {
                            this.f20036j = -1;
                        } else {
                            int i25 = (m27746c8 - 3) - m27746c9;
                            this.f20036j = i25;
                            if (i25 < 0) {
                                lr1.m24356e("PesReader", "Found negative packet payload size: " + i25);
                                i13 = -1;
                                this.f20036j = -1;
                                i24 = 2;
                            }
                        }
                        i13 = -1;
                        i24 = 2;
                    }
                    m21951c(i24);
                } else {
                    i13 = -1;
                }
            } else {
                x02Var.m27776g(x02Var.m27778i());
            }
            i14 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4380c7
    /* renamed from: b */
    public final void mo20812b(a72 a72Var, mm4 mm4Var, C4344b7 c4344b7) {
        this.f20031e = a72Var;
        this.f20027a.mo20010b(mm4Var, c4344b7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4380c7
    public final void zzc() {
        this.f20029c = 0;
        this.f20030d = 0;
        this.f20034h = false;
        this.f20027a.zze();
    }
}
