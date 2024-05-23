package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y0 */
/* loaded from: classes2.dex */
public final class C5189y0 implements jm4 {

    /* renamed from: b */
    private mm4 f30709b;

    /* renamed from: c */
    private int f30710c;

    /* renamed from: d */
    private int f30711d;

    /* renamed from: e */
    private int f30712e;

    /* renamed from: g */
    private zzadt f30714g;

    /* renamed from: h */
    private km4 f30715h;

    /* renamed from: i */
    private C4338b1 f30716i;

    /* renamed from: j */
    private C4341b4 f30717j;

    /* renamed from: a */
    private final x02 f30708a = new x02(6);

    /* renamed from: f */
    private long f30713f = -1;

    /* renamed from: b */
    private final int m28098b(km4 km4Var) {
        this.f30708a.m27772c(2);
        ((yl4) km4Var).mo23963f(this.f30708a.m27777h(), 0, 2, false);
        return this.f30708a.m27792w();
    }

    /* renamed from: d */
    private final void m28099d() {
        m28100g(new zzbp[0]);
        mm4 mm4Var = this.f30709b;
        mm4Var.getClass();
        mm4Var.zzC();
        this.f30709b.mo21603f(new C4741m(-9223372036854775807L, 0L));
        this.f30710c = 6;
    }

    /* renamed from: g */
    private final void m28100g(zzbp... zzbpVarArr) {
        mm4 mm4Var = this.f30709b;
        mm4Var.getClass();
        InterfaceC4928r mo21604i = mm4Var.mo21604i(1024, 4);
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26512h0("image/jpeg");
        c5004t1.m26517m(new zzbq(-9223372036854775807L, zzbpVarArr));
        mo21604i.mo23300d(c5004t1.m26529y());
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        if (m28098b(km4Var) != 65496) {
            return false;
        }
        int m28098b = m28098b(km4Var);
        this.f30711d = m28098b;
        if (m28098b == 65504) {
            this.f30708a.m27772c(2);
            yl4 yl4Var = (yl4) km4Var;
            yl4Var.mo23963f(this.f30708a.m27777h(), 0, 2, false);
            yl4Var.m28247k(this.f30708a.m27792w() - 2, false);
            m28098b = m28098b(km4Var);
            this.f30711d = m28098b;
        }
        if (m28098b == 65505) {
            yl4 yl4Var2 = (yl4) km4Var;
            yl4Var2.m28247k(2, false);
            this.f30708a.m27772c(6);
            yl4Var2.mo23963f(this.f30708a.m27777h(), 0, 6, false);
            if (this.f30708a.m27762A() == 1165519206 && this.f30708a.m27792w() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f30709b = mm4Var;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        if (j11 == 0) {
            this.f30710c = 0;
            this.f30717j = null;
        } else if (this.f30710c == 5) {
            C4341b4 c4341b4 = this.f30717j;
            c4341b4.getClass();
            c4341b4.mo19971e(j11, j12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        int i11;
        String m27765D;
        C4301a1 m21862a;
        zzadt zzadtVar;
        long j11;
        int i12 = this.f30710c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            if (i12 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.f30716i == null || km4Var != this.f30715h) {
                            this.f30715h = km4Var;
                            this.f30716i = new C4338b1(km4Var, this.f30713f);
                        }
                        C4341b4 c4341b4 = this.f30717j;
                        c4341b4.getClass();
                        int mo19972f = c4341b4.mo19972f(this.f30716i, c4667k);
                        if (mo19972f == 1) {
                            c4667k.f23035a += this.f30713f;
                        }
                        return mo19972f;
                    }
                    long zzf = km4Var.zzf();
                    long j12 = this.f30713f;
                    if (zzf == j12) {
                        if (!km4Var.mo23963f(this.f30708a.m27777h(), 0, 1, true)) {
                            m28099d();
                        } else {
                            km4Var.zzj();
                            if (this.f30717j == null) {
                                this.f30717j = new C4341b4(0);
                            }
                            C4338b1 c4338b1 = new C4338b1(km4Var, this.f30713f);
                            this.f30716i = c4338b1;
                            if (this.f30717j.mo19968a(c4338b1)) {
                                C4341b4 c4341b42 = this.f30717j;
                                long j13 = this.f30713f;
                                mm4 mm4Var = this.f30709b;
                                mm4Var.getClass();
                                c4341b42.mo19970c(new C4448e1(j13, mm4Var));
                                zzadt zzadtVar2 = this.f30714g;
                                zzadtVar2.getClass();
                                m28100g(zzadtVar2);
                                this.f30710c = 5;
                            } else {
                                m28099d();
                            }
                        }
                        return 0;
                    }
                    c4667k.f23035a = j12;
                    return 1;
                }
                if (this.f30711d == 65505) {
                    x02 x02Var = new x02(this.f30712e);
                    ((yl4) km4Var).mo23962e(x02Var.m27777h(), 0, this.f30712e, false);
                    if (this.f30714g == null && "http://ns.adobe.com/xap/1.0/".equals(x02Var.m27765D((char) 0)) && (m27765D = x02Var.m27765D((char) 0)) != null) {
                        long zzd = km4Var.zzd();
                        if (zzd != -1 && (m21862a = AbstractC4485f1.m21862a(m27765D)) != null && m21862a.f16866b.size() >= 2) {
                            long j14 = -1;
                            long j15 = -1;
                            long j16 = -1;
                            long j17 = -1;
                            boolean z11 = false;
                            for (int size = m21862a.f16866b.size() - 1; size >= 0; size--) {
                                C5226z0 c5226z0 = (C5226z0) m21862a.f16866b.get(size);
                                boolean equals = "video/mp4".equals(c5226z0.f31307a) | z11;
                                if (size == 0) {
                                    zzd -= c5226z0.f31310d;
                                    j11 = 0;
                                } else {
                                    j11 = zzd - c5226z0.f31309c;
                                }
                                long j18 = zzd;
                                zzd = j11;
                                if (equals && zzd != j18) {
                                    j17 = j18 - zzd;
                                    j16 = zzd;
                                    z11 = false;
                                } else {
                                    z11 = equals;
                                }
                                if (size == 0) {
                                    j15 = j18;
                                }
                                if (size == 0) {
                                    j14 = zzd;
                                }
                            }
                            if (j16 != -1 && j17 != -1 && j14 != -1 && j15 != -1) {
                                zzadtVar = new zzadt(j14, j15, m21862a.f16865a, j16, j17);
                                this.f30714g = zzadtVar;
                                if (zzadtVar != null) {
                                    this.f30713f = zzadtVar.f31808s;
                                }
                            }
                        }
                        zzadtVar = null;
                        this.f30714g = zzadtVar;
                        if (zzadtVar != null) {
                        }
                    }
                    i11 = 0;
                } else {
                    i11 = 0;
                    ((yl4) km4Var).m28248l(this.f30712e, false);
                }
                this.f30710c = i11;
                return i11;
            }
            this.f30708a.m27772c(2);
            ((yl4) km4Var).mo23962e(this.f30708a.m27777h(), 0, 2, false);
            this.f30712e = this.f30708a.m27792w() - 2;
            this.f30710c = 2;
            return 0;
        }
        this.f30708a.m27772c(2);
        ((yl4) km4Var).mo23962e(this.f30708a.m27777h(), 0, 2, false);
        int m27792w = this.f30708a.m27792w();
        this.f30711d = m27792w;
        if (m27792w == 65498) {
            if (this.f30713f != -1) {
                this.f30710c = 4;
                return 0;
            }
            m28099d();
            return 0;
        }
        if ((m27792w >= 65488 && m27792w <= 65497) || m27792w == 65281) {
            return 0;
        }
        this.f30710c = 1;
        return 0;
    }
}
