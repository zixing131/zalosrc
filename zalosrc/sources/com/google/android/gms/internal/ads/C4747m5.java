package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m5 */
/* loaded from: classes2.dex */
public final class C4747m5 implements InterfaceC4822o5 {

    /* renamed from: b */
    private final String f24384b;

    /* renamed from: c */
    private String f24385c;

    /* renamed from: d */
    private InterfaceC4928r f24386d;

    /* renamed from: f */
    private int f24388f;

    /* renamed from: g */
    private int f24389g;

    /* renamed from: h */
    private long f24390h;

    /* renamed from: i */
    private C4671k3 f24391i;

    /* renamed from: j */
    private int f24392j;

    /* renamed from: a */
    private final x02 f24383a = new x02(new byte[18]);

    /* renamed from: e */
    private int f24387e = 0;

    /* renamed from: k */
    private long f24393k = -9223372036854775807L;

    public C4747m5(String str) {
        this.f24384b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009a(x02 x02Var) {
        int i11;
        byte b11;
        boolean z11;
        int i12;
        int i13;
        byte b12;
        int i14;
        byte b13;
        int i15;
        v71.m27171b(this.f24386d);
        while (x02Var.m27778i() > 0) {
            int i16 = this.f24387e;
            if (i16 != 0) {
                if (i16 != 1) {
                    int min = Math.min(x02Var.m27778i(), this.f24392j - this.f24388f);
                    this.f24386d.mo23301e(x02Var, min);
                    int i17 = this.f24388f + min;
                    this.f24388f = i17;
                    int i18 = this.f24392j;
                    if (i17 == i18) {
                        long j11 = this.f24393k;
                        if (j11 != -9223372036854775807L) {
                            this.f24386d.mo23302f(j11, 1, i18, 0, null);
                            this.f24393k += this.f24390h;
                        }
                        this.f24387e = 0;
                    }
                } else {
                    byte[] m27777h = this.f24383a.m27777h();
                    int min2 = Math.min(x02Var.m27778i(), 18 - this.f24388f);
                    x02Var.m27771b(m27777h, this.f24388f, min2);
                    int i19 = this.f24388f + min2;
                    this.f24388f = i19;
                    if (i19 == 18) {
                        byte[] m27777h2 = this.f24383a.m27777h();
                        if (this.f24391i == null) {
                            C4671k3 m22477a = gm4.m22477a(m27777h2, this.f24385c, this.f24384b, null);
                            this.f24391i = m22477a;
                            this.f24386d.mo23300d(m22477a);
                        }
                        int i21 = gm4.f20749d;
                        byte b14 = m27777h2[0];
                        if (b14 != -2) {
                            if (b14 != -1) {
                                if (b14 != 31) {
                                    i11 = ((m27777h2[5] & 3) << 12) | ((m27777h2[6] & 255) << 4);
                                    b11 = m27777h2[7];
                                } else {
                                    i15 = ((m27777h2[8] & 60) >> 2) | ((m27777h2[6] & 3) << 12) | ((m27777h2[7] & 255) << 4);
                                }
                            } else {
                                i15 = ((m27777h2[7] & 3) << 12) | ((m27777h2[6] & 255) << 4) | ((m27777h2[9] & 60) >> 2);
                            }
                            i12 = i15 + 1;
                            z11 = true;
                            if (z11) {
                                i12 = (i12 * 16) / 14;
                            }
                            this.f24392j = i12;
                            if (b14 == -2) {
                                if (b14 != -1) {
                                    if (b14 != 31) {
                                        i13 = (m27777h2[4] & 1) << 6;
                                        b12 = m27777h2[5];
                                    } else {
                                        i13 = (m27777h2[5] & 7) << 4;
                                        b13 = m27777h2[6];
                                    }
                                } else {
                                    i13 = (m27777h2[4] & 7) << 4;
                                    b13 = m27777h2[7];
                                }
                                i14 = b13 & 60;
                                this.f24390h = (int) ((((((i14 >> 2) | i13) + 1) * 32) * 1000000) / this.f24391i.f23113z);
                                this.f24383a.m27775f(0);
                                this.f24386d.mo23301e(this.f24383a, 18);
                                this.f24387e = 2;
                            } else {
                                i13 = (m27777h2[5] & 1) << 6;
                                b12 = m27777h2[4];
                            }
                            i14 = b12 & 252;
                            this.f24390h = (int) ((((((i14 >> 2) | i13) + 1) * 32) * 1000000) / this.f24391i.f23113z);
                            this.f24383a.m27775f(0);
                            this.f24386d.mo23301e(this.f24383a, 18);
                            this.f24387e = 2;
                        } else {
                            i11 = ((m27777h2[4] & 3) << 12) | ((m27777h2[7] & 255) << 4);
                            b11 = m27777h2[6];
                        }
                        i12 = (i11 | ((b11 & 240) >> 4)) + 1;
                        z11 = false;
                        if (z11) {
                        }
                        this.f24392j = i12;
                        if (b14 == -2) {
                        }
                        i14 = b12 & 252;
                        this.f24390h = (int) ((((((i14 >> 2) | i13) + 1) * 32) * 1000000) / this.f24391i.f23113z);
                        this.f24383a.m27775f(0);
                        this.f24386d.mo23301e(this.f24383a, 18);
                        this.f24387e = 2;
                    }
                }
            } else {
                while (x02Var.m27778i() > 0) {
                    int i22 = this.f24389g << 8;
                    this.f24389g = i22;
                    int m27788s = i22 | x02Var.m27788s();
                    this.f24389g = m27788s;
                    int i23 = gm4.f20749d;
                    if (m27788s == 2147385345 || m27788s == -25230976 || m27788s == 536864768 || m27788s == -14745368) {
                        byte[] m27777h3 = this.f24383a.m27777h();
                        int i24 = this.f24389g;
                        m27777h3[0] = (byte) ((i24 >> 24) & 255);
                        m27777h3[1] = (byte) ((i24 >> 16) & 255);
                        m27777h3[2] = (byte) ((i24 >> 8) & 255);
                        m27777h3[3] = (byte) (i24 & 255);
                        this.f24388f = 4;
                        this.f24389g = 0;
                        this.f24387e = 1;
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
        this.f24385c = c4344b7.m20419b();
        this.f24386d = mm4Var.mo21604i(c4344b7.m20418a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f24393k = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f24387e = 0;
        this.f24388f = 0;
        this.f24389g = 0;
        this.f24393k = -9223372036854775807L;
    }
}
