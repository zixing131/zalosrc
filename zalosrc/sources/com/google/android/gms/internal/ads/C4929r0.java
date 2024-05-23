package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.r0 */
/* loaded from: classes2.dex */
public final class C4929r0 implements jm4 {

    /* renamed from: n */
    public static final qm4 f27011n = new qm4() { // from class: com.google.android.gms.internal.ads.q0
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4929r0(0)};
        }
    };

    /* renamed from: d */
    private mm4 f27015d;

    /* renamed from: e */
    private InterfaceC4928r f27016e;

    /* renamed from: g */
    private zzbq f27018g;

    /* renamed from: h */
    private wm4 f27019h;

    /* renamed from: i */
    private int f27020i;

    /* renamed from: j */
    private int f27021j;

    /* renamed from: k */
    private C4854p0 f27022k;

    /* renamed from: l */
    private int f27023l;

    /* renamed from: m */
    private long f27024m;

    /* renamed from: a */
    private final byte[] f27012a = new byte[42];

    /* renamed from: b */
    private final x02 f27013b = new x02(new byte[32768], 0);

    /* renamed from: c */
    private final rm4 f27014c = new rm4();

    /* renamed from: f */
    private int f27017f = 0;

    public C4929r0(int i11) {
    }

    /* renamed from: b */
    private final long m25924b(x02 x02Var, boolean z11) {
        boolean z12;
        this.f27019h.getClass();
        int m27780k = x02Var.m27780k();
        while (m27780k <= x02Var.m27781l() - 16) {
            x02Var.m27775f(m27780k);
            if (sm4.m26367c(x02Var, this.f27019h, this.f27021j, this.f27014c)) {
                x02Var.m27775f(m27780k);
                return this.f27014c.f27301a;
            }
            m27780k++;
        }
        if (z11) {
            while (m27780k <= x02Var.m27781l() - this.f27020i) {
                x02Var.m27775f(m27780k);
                try {
                    z12 = sm4.m26367c(x02Var, this.f27019h, this.f27021j, this.f27014c);
                } catch (IndexOutOfBoundsException unused) {
                    z12 = false;
                }
                if (x02Var.m27780k() <= x02Var.m27781l() && z12) {
                    x02Var.m27775f(m27780k);
                    return this.f27014c.f27301a;
                }
                m27780k++;
            }
            x02Var.m27775f(x02Var.m27781l());
            return -1L;
        }
        x02Var.m27775f(m27780k);
        return -1L;
    }

    /* renamed from: d */
    private final void m25925d() {
        long j11 = this.f27024m;
        wm4 wm4Var = this.f27019h;
        int i11 = g92.f20474a;
        this.f27016e.mo23302f((j11 * 1000000) / wm4Var.f30019e, 1, this.f27023l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        tm4.m26630a(km4Var, false);
        x02 x02Var = new x02(4);
        ((yl4) km4Var).mo23963f(x02Var.m27777h(), 0, 4, false);
        if (x02Var.m27762A() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f27015d = mm4Var;
        this.f27016e = mm4Var.mo21604i(0, 1);
        mm4Var.zzC();
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        long j13 = 0;
        if (j11 == 0) {
            this.f27017f = 0;
        } else {
            C4854p0 c4854p0 = this.f27022k;
            if (c4854p0 != null) {
                c4854p0.m26992d(j12);
            }
        }
        if (j12 != 0) {
            j13 = -1;
        }
        this.f27024m = j13;
        this.f27023l = 0;
        this.f27013b.m27772c(0);
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        boolean m27755l;
        InterfaceC4779n c4741m;
        int i11 = this.f27017f;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            this.f27016e.getClass();
                            wm4 wm4Var = this.f27019h;
                            wm4Var.getClass();
                            C4854p0 c4854p0 = this.f27022k;
                            if (c4854p0 != null && c4854p0.m26993e()) {
                                return c4854p0.m26989a(km4Var, c4667k);
                            }
                            if (this.f27024m == -1) {
                                this.f27024m = sm4.m26366b(km4Var, wm4Var);
                                return 0;
                            }
                            x02 x02Var = this.f27013b;
                            int m27781l = x02Var.m27781l();
                            if (m27781l < 32768) {
                                int mo19942a = km4Var.mo19942a(x02Var.m27777h(), m27781l, 32768 - m27781l);
                                if (mo19942a != -1) {
                                    z11 = false;
                                }
                                if (!z11) {
                                    this.f27013b.m27774e(m27781l + mo19942a);
                                } else if (this.f27013b.m27778i() == 0) {
                                    m25925d();
                                    return -1;
                                }
                            } else {
                                z11 = false;
                            }
                            x02 x02Var2 = this.f27013b;
                            int m27780k = x02Var2.m27780k();
                            int i12 = this.f27023l;
                            int i13 = this.f27020i;
                            if (i12 < i13) {
                                x02Var2.m27776g(Math.min(i13 - i12, x02Var2.m27778i()));
                            }
                            long m25924b = m25924b(this.f27013b, z11);
                            x02 x02Var3 = this.f27013b;
                            int m27780k2 = x02Var3.m27780k() - m27780k;
                            x02Var3.m27775f(m27780k);
                            AbstractC4853p.m25366b(this.f27016e, this.f27013b, m27780k2);
                            this.f27023l += m27780k2;
                            if (m25924b != -1) {
                                m25925d();
                                this.f27023l = 0;
                                this.f27024m = m25924b;
                            }
                            x02 x02Var4 = this.f27013b;
                            if (x02Var4.m27778i() >= 16) {
                                return 0;
                            }
                            int m27778i = x02Var4.m27778i();
                            System.arraycopy(x02Var4.m27777h(), x02Var4.m27780k(), x02Var4.m27777h(), 0, m27778i);
                            this.f27013b.m27775f(0);
                            this.f27013b.m27774e(m27778i);
                            return 0;
                        }
                        km4Var.zzj();
                        x02 x02Var5 = new x02(2);
                        ((yl4) km4Var).mo23963f(x02Var5.m27777h(), 0, 2, false);
                        int m27792w = x02Var5.m27792w();
                        if ((m27792w >> 2) == 16382) {
                            km4Var.zzj();
                            this.f27021j = m27792w;
                            mm4 mm4Var = this.f27015d;
                            int i14 = g92.f20474a;
                            long zzf = km4Var.zzf();
                            long zzd = km4Var.zzd();
                            wm4 wm4Var2 = this.f27019h;
                            wm4Var2.getClass();
                            if (wm4Var2.f30025k != null) {
                                c4741m = new um4(wm4Var2, zzf);
                            } else if (zzd != -1 && wm4Var2.f30024j > 0) {
                                C4854p0 c4854p02 = new C4854p0(wm4Var2, this.f27021j, zzf, zzd);
                                this.f27022k = c4854p02;
                                c4741m = c4854p02.m26990b();
                            } else {
                                c4741m = new C4741m(wm4Var2.m27661a(), 0L);
                            }
                            mm4Var.mo21603f(c4741m);
                            this.f27017f = 5;
                            return 0;
                        }
                        km4Var.zzj();
                        throw zzbu.m28711a("First frame does not start with sync code.", null);
                    }
                    wm4 wm4Var3 = this.f27019h;
                    do {
                        km4Var.zzj();
                        wz1 wz1Var = new wz1(new byte[4], 4);
                        yl4 yl4Var = (yl4) km4Var;
                        yl4Var.mo23963f(wz1Var.f30280a, 0, 4, false);
                        m27755l = wz1Var.m27755l();
                        int m27746c = wz1Var.m27746c(7);
                        int m27746c2 = wz1Var.m27746c(24) + 4;
                        if (m27746c == 0) {
                            byte[] bArr = new byte[38];
                            yl4Var.mo23962e(bArr, 0, 38, false);
                            wm4Var3 = new wm4(bArr, 4);
                        } else if (wm4Var3 != null) {
                            if (m27746c == 3) {
                                x02 x02Var6 = new x02(m27746c2);
                                yl4Var.mo23962e(x02Var6.m27777h(), 0, m27746c2, false);
                                wm4Var3 = wm4Var3.m27666f(tm4.m26631b(x02Var6));
                            } else if (m27746c == 4) {
                                x02 x02Var7 = new x02(m27746c2);
                                yl4Var.mo23962e(x02Var7.m27777h(), 0, m27746c2, false);
                                x02Var7.m27776g(4);
                                wm4Var3 = wm4Var3.m27667g(Arrays.asList(AbstractC5151x.m27759c(x02Var7, false, false).f28676b));
                            } else if (m27746c == 6) {
                                x02 x02Var8 = new x02(m27746c2);
                                yl4Var.mo23962e(x02Var8.m27777h(), 0, m27746c2, false);
                                x02Var8.m27776g(4);
                                wm4Var3 = wm4Var3.m27665e(c83.m20833x(zzaci.m28673a(x02Var8)));
                            } else {
                                yl4Var.m28248l(m27746c2, false);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i15 = g92.f20474a;
                        this.f27019h = wm4Var3;
                    } while (!m27755l);
                    wm4Var3.getClass();
                    this.f27020i = Math.max(wm4Var3.f30017c, 6);
                    this.f27016e.mo23300d(this.f27019h.m27663c(this.f27012a, this.f27018g));
                    this.f27017f = 4;
                    return 0;
                }
                x02 x02Var9 = new x02(4);
                ((yl4) km4Var).mo23962e(x02Var9.m27777h(), 0, 4, false);
                if (x02Var9.m27762A() == 1716281667) {
                    this.f27017f = 3;
                    return 0;
                }
                throw zzbu.m28711a("Failed to read FLAC stream marker.", null);
            }
            ((yl4) km4Var).mo23963f(this.f27012a, 0, 42, false);
            km4Var.zzj();
            this.f27017f = 2;
            return 0;
        }
        km4Var.zzj();
        long zze = km4Var.zze();
        zzbq m26630a = tm4.m26630a(km4Var, true);
        ((yl4) km4Var).m28248l((int) (km4Var.zze() - zze), false);
        this.f27018g = m26630a;
        this.f27017f = 1;
        return 0;
    }
}
