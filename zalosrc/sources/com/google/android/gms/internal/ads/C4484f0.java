package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.f0 */
/* loaded from: classes2.dex */
public final class C4484f0 implements jm4 {

    /* renamed from: c */
    private int f19876c;

    /* renamed from: e */
    private C4521g0 f19878e;

    /* renamed from: h */
    private long f19881h;

    /* renamed from: i */
    private C4595i0 f19882i;

    /* renamed from: m */
    private int f19886m;

    /* renamed from: n */
    private boolean f19887n;

    /* renamed from: a */
    private final x02 f19874a = new x02(12);

    /* renamed from: b */
    private final C4447e0 f19875b = new C4447e0(null);

    /* renamed from: d */
    private mm4 f19877d = new hm4();

    /* renamed from: g */
    private C4595i0[] f19880g = new C4595i0[0];

    /* renamed from: k */
    private long f19884k = -1;

    /* renamed from: l */
    private long f19885l = -1;

    /* renamed from: j */
    private int f19883j = -1;

    /* renamed from: f */
    private long f19879f = -9223372036854775807L;

    /* renamed from: d */
    private final C4595i0 m21855d(int i11) {
        for (C4595i0 c4595i0 : this.f19880g) {
            if (c4595i0.m23094g(i11)) {
                return c4595i0;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        ((yl4) km4Var).mo23963f(this.f19874a.m27777h(), 0, 12, false);
        this.f19874a.m27775f(0);
        if (this.f19874a.m27784o() != 1179011410) {
            return false;
        }
        this.f19874a.m27776g(4);
        if (this.f19874a.m27784o() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f19876c = 0;
        this.f19877d = mm4Var;
        this.f19881h = -1L;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        int i11;
        this.f19881h = -1L;
        this.f19882i = null;
        for (C4595i0 c4595i0 : this.f19880g) {
            c4595i0.m23093f(j11);
        }
        if (j11 == 0) {
            if (this.f19880g.length == 0) {
                this.f19876c = 0;
                return;
            }
            i11 = 3;
        } else {
            i11 = 6;
        }
        this.f19876c = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        long j11;
        long j12 = this.f19881h;
        int i14 = 0;
        if (j12 != -1) {
            long zzf = km4Var.zzf();
            if (j12 >= zzf && j12 <= 262144 + zzf) {
                ((yl4) km4Var).m28248l((int) (j12 - zzf), false);
            } else {
                c4667k.f23035a = j12;
                z11 = true;
                this.f19881h = -1L;
                if (!z11) {
                    return 1;
                }
                int i15 = this.f19876c;
                int i16 = 12;
                C4595i0 c4595i0 = null;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 != 4) {
                                    if (i15 != 5) {
                                        if (km4Var.zzf() >= this.f19885l) {
                                            return -1;
                                        }
                                        C4595i0 c4595i02 = this.f19882i;
                                        if (c4595i02 != null) {
                                            if (!c4595i02.m23095h(km4Var)) {
                                                return 0;
                                            }
                                            this.f19882i = null;
                                            return 0;
                                        }
                                        if ((km4Var.zzf() & 1) == 1) {
                                            ((yl4) km4Var).m28248l(1, false);
                                        }
                                        yl4 yl4Var = (yl4) km4Var;
                                        yl4Var.mo23963f(this.f19874a.m27777h(), 0, 12, false);
                                        this.f19874a.m27775f(0);
                                        int m27784o = this.f19874a.m27784o();
                                        if (m27784o == 1414744396) {
                                            this.f19874a.m27775f(8);
                                            if (this.f19874a.m27784o() != 1769369453) {
                                                i16 = 8;
                                            }
                                            yl4Var.m28248l(i16, false);
                                            km4Var.zzj();
                                            return 0;
                                        }
                                        int m27784o2 = this.f19874a.m27784o();
                                        if (m27784o == 1263424842) {
                                            this.f19881h = km4Var.zzf() + m27784o2 + 8;
                                            return 0;
                                        }
                                        yl4Var.m28248l(8, false);
                                        km4Var.zzj();
                                        C4595i0 m21855d = m21855d(m27784o);
                                        if (m21855d == null) {
                                            this.f19881h = km4Var.zzf() + m27784o2;
                                            return 0;
                                        }
                                        m21855d.m23092e(m27784o2);
                                        this.f19882i = m21855d;
                                        return 0;
                                    }
                                    x02 x02Var = new x02(this.f19886m);
                                    ((yl4) km4Var).mo23962e(x02Var.m27777h(), 0, this.f19886m, false);
                                    if (x02Var.m27778i() < 16) {
                                        j11 = 0;
                                    } else {
                                        int m27780k = x02Var.m27780k();
                                        x02Var.m27776g(8);
                                        int m27784o3 = x02Var.m27784o();
                                        long j13 = this.f19884k;
                                        if (m27784o3 > j13) {
                                            j11 = 0;
                                        } else {
                                            j11 = j13 + 8;
                                        }
                                        x02Var.m27775f(m27780k);
                                    }
                                    while (x02Var.m27778i() >= 16) {
                                        int m27784o4 = x02Var.m27784o();
                                        int m27784o5 = x02Var.m27784o();
                                        long m27784o6 = x02Var.m27784o() + j11;
                                        x02Var.m27784o();
                                        C4595i0 m21855d2 = m21855d(m27784o4);
                                        if (m21855d2 != null) {
                                            if ((m27784o5 & 16) == 16) {
                                                m21855d2.m23089b(m27784o6);
                                            }
                                            m21855d2.m23091d();
                                        }
                                    }
                                    for (C4595i0 c4595i03 : this.f19880g) {
                                        c4595i03.m23090c();
                                    }
                                    this.f19887n = true;
                                    this.f19877d.mo21603f(new C4337b0(this, this.f19879f));
                                    this.f19876c = 6;
                                    this.f19881h = this.f19884k;
                                    return 0;
                                }
                                ((yl4) km4Var).mo23962e(this.f19874a.m27777h(), 0, 8, false);
                                this.f19874a.m27775f(0);
                                int m27784o7 = this.f19874a.m27784o();
                                int m27784o8 = this.f19874a.m27784o();
                                if (m27784o7 == 829973609) {
                                    this.f19876c = 5;
                                    this.f19886m = m27784o8;
                                } else {
                                    this.f19881h = km4Var.zzf() + m27784o8;
                                }
                                return 0;
                            }
                            long j14 = this.f19884k;
                            if (j14 != -1 && km4Var.zzf() != j14) {
                                this.f19881h = j14;
                                return 0;
                            }
                            ((yl4) km4Var).mo23963f(this.f19874a.m27777h(), 0, 12, false);
                            km4Var.zzj();
                            this.f19874a.m27775f(0);
                            this.f19875b.m21597a(this.f19874a);
                            int m27784o9 = this.f19874a.m27784o();
                            int i17 = this.f19875b.f19471a;
                            if (i17 == 1179011410) {
                                ((yl4) km4Var).m28248l(12, false);
                                return 0;
                            }
                            if (i17 == 1414744396 && m27784o9 == 1769369453) {
                                long zzf2 = km4Var.zzf();
                                this.f19884k = zzf2;
                                long j15 = zzf2 + r6.f19472b + 8;
                                this.f19885l = j15;
                                if (!this.f19887n) {
                                    C4521g0 c4521g0 = this.f19878e;
                                    c4521g0.getClass();
                                    if ((c4521g0.f20354b & 16) != 16) {
                                        this.f19877d.mo21603f(new C4741m(this.f19879f, 0L));
                                        this.f19887n = true;
                                    } else {
                                        this.f19876c = 4;
                                        this.f19881h = j15;
                                        return 0;
                                    }
                                }
                                this.f19881h = km4Var.zzf() + 12;
                                this.f19876c = 6;
                                return 0;
                            }
                            this.f19881h = km4Var.zzf() + r6.f19472b + 8;
                            return 0;
                        }
                        int i18 = this.f19883j - 4;
                        x02 x02Var2 = new x02(i18);
                        ((yl4) km4Var).mo23962e(x02Var2.m27777h(), 0, i18, false);
                        C4631j0 m23495b = C4631j0.m23495b(1819436136, x02Var2);
                        if (m23495b.zza() == 1819436136) {
                            C4521g0 c4521g02 = (C4521g0) m23495b.m23496a(C4521g0.class);
                            if (c4521g02 != null) {
                                this.f19878e = c4521g02;
                                this.f19879f = c4521g02.f20355c * c4521g02.f20353a;
                                ArrayList arrayList = new ArrayList();
                                c83 c83Var = m23495b.f22581a;
                                int size = c83Var.size();
                                int i19 = 0;
                                int i21 = 0;
                                while (i19 < size) {
                                    InterfaceC4300a0 interfaceC4300a0 = (InterfaceC4300a0) c83Var.get(i19);
                                    if (interfaceC4300a0.zza() == 1819440243) {
                                        C4631j0 c4631j0 = (C4631j0) interfaceC4300a0;
                                        int i22 = i21 + 1;
                                        C4558h0 c4558h0 = (C4558h0) c4631j0.m23496a(C4558h0.class);
                                        C4668k0 c4668k0 = (C4668k0) c4631j0.m23496a(C4668k0.class);
                                        if (c4558h0 == null) {
                                            lr1.m24356e("AviExtractor", "Missing Stream Header");
                                        } else if (c4668k0 == null) {
                                            lr1.m24356e("AviExtractor", "Missing Stream Format");
                                        } else {
                                            i12 = i22;
                                            i11 = i19;
                                            long m22346g0 = g92.m22346g0(c4558h0.f21477d, c4558h0.f21475b * 1000000, c4558h0.f21476c);
                                            C4671k3 c4671k3 = c4668k0.f23036a;
                                            C5004t1 m23809b = c4671k3.m23809b();
                                            m23809b.m26509g(i21);
                                            int i23 = c4558h0.f21478e;
                                            if (i23 != 0) {
                                                m23809b.m26516l(i23);
                                            }
                                            C4705l0 c4705l0 = (C4705l0) c4631j0.m23496a(C4705l0.class);
                                            if (c4705l0 != null) {
                                                m23809b.m26514j(c4705l0.f23658a);
                                            }
                                            int m23844b = k70.m23844b(c4671k3.f23099l);
                                            if (m23844b != 1) {
                                                if (m23844b == 2) {
                                                    i13 = 2;
                                                } else {
                                                    c4595i0 = null;
                                                    if (c4595i0 != null) {
                                                        arrayList.add(c4595i0);
                                                    }
                                                    i21 = i12;
                                                }
                                            } else {
                                                i13 = m23844b;
                                            }
                                            InterfaceC4928r mo21604i = this.f19877d.mo21604i(i21, i13);
                                            mo21604i.mo23300d(m23809b.m26529y());
                                            c4595i0 = new C4595i0(i21, i13, m22346g0, c4558h0.f21477d, mo21604i);
                                            this.f19879f = m22346g0;
                                            if (c4595i0 != null) {
                                            }
                                            i21 = i12;
                                        }
                                        i11 = i19;
                                        i12 = i22;
                                        if (c4595i0 != null) {
                                        }
                                        i21 = i12;
                                    } else {
                                        i11 = i19;
                                    }
                                    i19 = i11 + 1;
                                    i14 = 0;
                                    c4595i0 = null;
                                }
                                this.f19880g = (C4595i0[]) arrayList.toArray(new C4595i0[i14]);
                                this.f19877d.zzC();
                                this.f19876c = 3;
                                return i14;
                            }
                            throw zzbu.m28711a("AviHeader not found", null);
                        }
                        throw zzbu.m28711a("Unexpected header list type " + m23495b.zza(), null);
                    }
                    ((yl4) km4Var).mo23962e(this.f19874a.m27777h(), 0, 12, false);
                    this.f19874a.m27775f(0);
                    C4447e0 c4447e0 = this.f19875b;
                    x02 x02Var3 = this.f19874a;
                    c4447e0.m21597a(x02Var3);
                    int i24 = c4447e0.f19471a;
                    if (i24 == 1414744396) {
                        c4447e0.f19473c = x02Var3.m27784o();
                        C4447e0 c4447e02 = this.f19875b;
                        int i25 = c4447e02.f19473c;
                        if (i25 == 1819436136) {
                            this.f19883j = c4447e02.f19472b;
                            this.f19876c = 2;
                            return 0;
                        }
                        throw zzbu.m28711a("hdrl expected, found: " + i25, null);
                    }
                    throw zzbu.m28711a("LIST expected, found: " + i24, null);
                }
                if (mo19968a(km4Var)) {
                    ((yl4) km4Var).m28248l(12, false);
                    this.f19876c = 1;
                    return 0;
                }
                throw zzbu.m28711a("AVI Header List not found", null);
            }
        }
        z11 = false;
        this.f19881h = -1L;
        if (!z11) {
        }
    }
}
