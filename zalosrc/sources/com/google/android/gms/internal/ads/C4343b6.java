package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.b6 */
/* loaded from: classes2.dex */
public final class C4343b6 implements InterfaceC4822o5 {

    /* renamed from: a */
    private final String f17601a;

    /* renamed from: b */
    private final x02 f17602b;

    /* renamed from: c */
    private final wz1 f17603c;

    /* renamed from: d */
    private InterfaceC4928r f17604d;

    /* renamed from: e */
    private String f17605e;

    /* renamed from: f */
    private C4671k3 f17606f;

    /* renamed from: g */
    private int f17607g;

    /* renamed from: h */
    private int f17608h;

    /* renamed from: i */
    private int f17609i;

    /* renamed from: j */
    private int f17610j;

    /* renamed from: k */
    private long f17611k;

    /* renamed from: l */
    private boolean f17612l;

    /* renamed from: m */
    private int f17613m;

    /* renamed from: n */
    private int f17614n;

    /* renamed from: o */
    private int f17615o;

    /* renamed from: p */
    private boolean f17616p;

    /* renamed from: q */
    private long f17617q;

    /* renamed from: r */
    private int f17618r;

    /* renamed from: s */
    private long f17619s;

    /* renamed from: t */
    private int f17620t;

    /* renamed from: u */
    private String f17621u;

    public C4343b6(String str) {
        this.f17601a = str;
        x02 x02Var = new x02(1024);
        this.f17602b = x02Var;
        byte[] m27777h = x02Var.m27777h();
        this.f17603c = new wz1(m27777h, m27777h.length);
        this.f17611k = -9223372036854775807L;
    }

    /* renamed from: d */
    private final int m20403d(wz1 wz1Var) {
        int m27744a = wz1Var.m27744a();
        fl4 m22467b = gl4.m22467b(wz1Var, true);
        this.f17621u = m22467b.f20188c;
        this.f17618r = m22467b.f20186a;
        this.f17620t = m22467b.f20187b;
        return m27744a - wz1Var.m27744a();
    }

    /* renamed from: e */
    private static long m20404e(wz1 wz1Var) {
        return wz1Var.m27746c((wz1Var.m27746c(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0154, code lost:            if (r14.f17612l == false) goto L88;     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009a(x02 x02Var) {
        int i11;
        int i12;
        int i13;
        boolean m27755l;
        v71.m27171b(this.f17604d);
        while (x02Var.m27778i() > 0) {
            int i14 = this.f17607g;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        int min = Math.min(x02Var.m27778i(), this.f17609i - this.f17608h);
                        x02Var.m27771b(this.f17603c.f30280a, this.f17608h, min);
                        int i15 = this.f17608h + min;
                        this.f17608h = i15;
                        if (i15 == this.f17609i) {
                            this.f17603c.m27751h(0);
                            wz1 wz1Var = this.f17603c;
                            if (!wz1Var.m27755l()) {
                                this.f17612l = true;
                                int m27746c = wz1Var.m27746c(1);
                                if (m27746c == 1) {
                                    i13 = wz1Var.m27746c(1);
                                    i12 = 1;
                                } else {
                                    i12 = m27746c;
                                    i13 = 0;
                                }
                                this.f17613m = i13;
                                if (i13 == 0) {
                                    if (i12 == 1) {
                                        m20404e(wz1Var);
                                        i12 = 1;
                                    }
                                    if (wz1Var.m27755l()) {
                                        this.f17614n = wz1Var.m27746c(6);
                                        int m27746c2 = wz1Var.m27746c(4);
                                        int m27746c3 = wz1Var.m27746c(3);
                                        if (m27746c2 == 0 && m27746c3 == 0) {
                                            if (i12 == 0) {
                                                int m27745b = wz1Var.m27745b();
                                                int m20403d = m20403d(wz1Var);
                                                wz1Var.m27751h(m27745b);
                                                byte[] bArr = new byte[(m20403d + 7) / 8];
                                                wz1Var.m27749f(bArr, 0, m20403d);
                                                C5004t1 c5004t1 = new C5004t1();
                                                c5004t1.m26511h(this.f17605e);
                                                c5004t1.m26523s("audio/mp4a-latm");
                                                c5004t1.m26508f0(this.f17621u);
                                                c5004t1.m26506e0(this.f17620t);
                                                c5004t1.m26524t(this.f17618r);
                                                c5004t1.m26513i(Collections.singletonList(bArr));
                                                c5004t1.m26515k(this.f17601a);
                                                C4671k3 m26529y = c5004t1.m26529y();
                                                if (!m26529y.equals(this.f17606f)) {
                                                    this.f17606f = m26529y;
                                                    this.f17619s = 1024000000 / m26529y.f23113z;
                                                    this.f17604d.mo23300d(m26529y);
                                                }
                                            } else {
                                                wz1Var.m27753j(((int) m20404e(wz1Var)) - m20403d(wz1Var));
                                            }
                                            int m27746c4 = wz1Var.m27746c(3);
                                            this.f17615o = m27746c4;
                                            if (m27746c4 != 0) {
                                                if (m27746c4 != 1) {
                                                    if (m27746c4 != 3 && m27746c4 != 4 && m27746c4 != 5) {
                                                        if (m27746c4 != 6 && m27746c4 != 7) {
                                                            throw new IllegalStateException();
                                                        }
                                                        wz1Var.m27753j(1);
                                                    } else {
                                                        wz1Var.m27753j(6);
                                                    }
                                                } else {
                                                    wz1Var.m27753j(9);
                                                }
                                            } else {
                                                wz1Var.m27753j(8);
                                            }
                                            boolean m27755l2 = wz1Var.m27755l();
                                            this.f17616p = m27755l2;
                                            this.f17617q = 0L;
                                            if (m27755l2) {
                                                if (i12 == 1) {
                                                    this.f17617q = m20404e(wz1Var);
                                                }
                                                do {
                                                    m27755l = wz1Var.m27755l();
                                                    this.f17617q = (this.f17617q << 8) + wz1Var.m27746c(8);
                                                } while (m27755l);
                                            }
                                            if (wz1Var.m27755l()) {
                                                wz1Var.m27753j(8);
                                            }
                                        } else {
                                            throw zzbu.m28711a(null, null);
                                        }
                                    } else {
                                        throw zzbu.m28711a(null, null);
                                    }
                                } else {
                                    throw zzbu.m28711a(null, null);
                                }
                            }
                            if (this.f17613m == 0) {
                                if (this.f17614n == 0) {
                                    if (this.f17615o == 0) {
                                        int i16 = 0;
                                        while (true) {
                                            int m27746c5 = wz1Var.m27746c(8);
                                            i11 = i16 + m27746c5;
                                            if (m27746c5 != 255) {
                                                break;
                                            } else {
                                                i16 = i11;
                                            }
                                        }
                                        int m27745b2 = wz1Var.m27745b();
                                        if ((m27745b2 & 7) == 0) {
                                            this.f17602b.m27775f(m27745b2 >> 3);
                                        } else {
                                            wz1Var.m27749f(this.f17602b.m27777h(), 0, i11 * 8);
                                            this.f17602b.m27775f(0);
                                        }
                                        this.f17604d.mo23301e(this.f17602b, i11);
                                        long j11 = this.f17611k;
                                        if (j11 != -9223372036854775807L) {
                                            this.f17604d.mo23302f(j11, 1, i11, 0, null);
                                            this.f17611k += this.f17619s;
                                        }
                                        if (this.f17616p) {
                                            wz1Var.m27753j((int) this.f17617q);
                                        }
                                        this.f17607g = 0;
                                    } else {
                                        throw zzbu.m28711a(null, null);
                                    }
                                } else {
                                    throw zzbu.m28711a(null, null);
                                }
                            } else {
                                throw zzbu.m28711a(null, null);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int m27788s = ((this.f17610j & (-225)) << 8) | x02Var.m27788s();
                        this.f17609i = m27788s;
                        x02 x02Var2 = this.f17602b;
                        if (m27788s > x02Var2.m27777h().length) {
                            x02Var2.m27772c(m27788s);
                            wz1 wz1Var2 = this.f17603c;
                            byte[] m27777h = this.f17602b.m27777h();
                            wz1Var2.m27750g(m27777h, m27777h.length);
                        }
                        this.f17608h = 0;
                        this.f17607g = 3;
                    }
                } else {
                    int m27788s2 = x02Var.m27788s();
                    if ((m27788s2 & 224) == 224) {
                        this.f17610j = m27788s2;
                        this.f17607g = 2;
                    } else if (m27788s2 != 86) {
                        this.f17607g = 0;
                    }
                }
            } else if (x02Var.m27788s() == 86) {
                this.f17607g = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f17604d = mm4Var.mo21604i(c4344b7.m20418a(), 1);
        this.f17605e = c4344b7.m20419b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f17611k = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f17607g = 0;
        this.f17611k = -9223372036854775807L;
        this.f17612l = false;
    }
}
