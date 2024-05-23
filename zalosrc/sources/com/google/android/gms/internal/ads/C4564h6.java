package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h6 */
/* loaded from: classes2.dex */
public final class C4564h6 implements tl4 {

    /* renamed from: a */
    private final a72 f21550a;

    /* renamed from: b */
    private final x02 f21551b = new x02();

    public /* synthetic */ C4564h6(a72 a72Var, AbstractC4527g6 abstractC4527g6) {
        this.f21550a = a72Var;
    }

    @Override // com.google.android.gms.internal.ads.tl4
    /* renamed from: a */
    public final sl4 mo22710a(km4 km4Var, long j11) {
        int m23130h;
        long j12;
        long zzf = km4Var.zzf();
        int min = (int) Math.min(20000L, km4Var.zzd() - zzf);
        this.f21551b.m27772c(min);
        ((yl4) km4Var).mo23963f(this.f21551b.m27777h(), 0, min, false);
        x02 x02Var = this.f21551b;
        int i11 = -1;
        long j13 = -9223372036854775807L;
        int i12 = -1;
        while (x02Var.m27778i() >= 4) {
            if (C4601i6.m23130h(x02Var.m27777h(), x02Var.m27780k()) != 442) {
                x02Var.m27776g(1);
            } else {
                x02Var.m27776g(4);
                long m23541c = C4637j6.m23541c(x02Var);
                if (m23541c != -9223372036854775807L) {
                    long m20014b = this.f21550a.m20014b(m23541c);
                    if (m20014b > j11) {
                        if (j13 == -9223372036854775807L) {
                            return sl4.m26361d(m20014b, zzf);
                        }
                        j12 = i12;
                    } else if (100000 + m20014b > j11) {
                        j12 = x02Var.m27780k();
                    } else {
                        i12 = x02Var.m27780k();
                        j13 = m20014b;
                    }
                    return sl4.m26362e(zzf + j12);
                }
                int m27781l = x02Var.m27781l();
                if (x02Var.m27778i() < 10) {
                    x02Var.m27775f(m27781l);
                } else {
                    x02Var.m27776g(9);
                    int m27788s = x02Var.m27788s() & 7;
                    if (x02Var.m27778i() < m27788s) {
                        x02Var.m27775f(m27781l);
                    } else {
                        x02Var.m27776g(m27788s);
                        if (x02Var.m27778i() < 4) {
                            x02Var.m27775f(m27781l);
                        } else {
                            if (C4601i6.m23130h(x02Var.m27777h(), x02Var.m27780k()) == 443) {
                                x02Var.m27776g(4);
                                int m27792w = x02Var.m27792w();
                                if (x02Var.m27778i() < m27792w) {
                                    x02Var.m27775f(m27781l);
                                } else {
                                    x02Var.m27776g(m27792w);
                                }
                            }
                            while (true) {
                                if (x02Var.m27778i() < 4 || (m23130h = C4601i6.m23130h(x02Var.m27777h(), x02Var.m27780k())) == 442 || m23130h == 441 || (m23130h >>> 8) != 1) {
                                    break;
                                }
                                x02Var.m27776g(4);
                                if (x02Var.m27778i() < 2) {
                                    x02Var.m27775f(m27781l);
                                    break;
                                }
                                x02Var.m27775f(Math.min(x02Var.m27781l(), x02Var.m27780k() + x02Var.m27792w()));
                            }
                        }
                    }
                }
                i11 = x02Var.m27780k();
            }
        }
        if (j13 != -9223372036854775807L) {
            return sl4.m26363f(j13, zzf + i11);
        }
        return sl4.f27781d;
    }

    @Override // com.google.android.gms.internal.ads.tl4
    public final void zzb() {
        x02 x02Var = this.f21551b;
        byte[] bArr = g92.f20479f;
        int length = bArr.length;
        x02Var.m27773d(bArr, 0);
    }
}
