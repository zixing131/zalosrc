package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.u0 */
/* loaded from: classes2.dex */
public final class C5040u0 implements jm4 {

    /* renamed from: q */
    public static final qm4 f28677q = new qm4() { // from class: com.google.android.gms.internal.ads.t0
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C5040u0()};
        }
    };

    /* renamed from: f */
    private mm4 f28683f;

    /* renamed from: h */
    private boolean f28685h;

    /* renamed from: i */
    private long f28686i;

    /* renamed from: j */
    private int f28687j;

    /* renamed from: k */
    private int f28688k;

    /* renamed from: l */
    private int f28689l;

    /* renamed from: m */
    private long f28690m;

    /* renamed from: n */
    private boolean f28691n;

    /* renamed from: o */
    private C4966s0 f28692o;

    /* renamed from: p */
    private C5152x0 f28693p;

    /* renamed from: a */
    private final x02 f28678a = new x02(4);

    /* renamed from: b */
    private final x02 f28679b = new x02(9);

    /* renamed from: c */
    private final x02 f28680c = new x02(11);

    /* renamed from: d */
    private final x02 f28681d = new x02();

    /* renamed from: e */
    private final C5077v0 f28682e = new C5077v0();

    /* renamed from: g */
    private int f28684g = 1;

    /* renamed from: b */
    private final x02 m26809b(km4 km4Var) {
        if (this.f28689l > this.f28681d.m27779j()) {
            x02 x02Var = this.f28681d;
            int m27779j = x02Var.m27779j();
            x02Var.m27773d(new byte[Math.max(m27779j + m27779j, this.f28689l)], 0);
        } else {
            this.f28681d.m27775f(0);
        }
        this.f28681d.m27774e(this.f28689l);
        ((yl4) km4Var).mo23962e(this.f28681d.m27777h(), 0, this.f28689l, false);
        return this.f28681d;
    }

    /* renamed from: d */
    private final void m26810d() {
        if (!this.f28691n) {
            this.f28683f.mo21603f(new C4741m(-9223372036854775807L, 0L));
            this.f28691n = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        yl4 yl4Var = (yl4) km4Var;
        yl4Var.mo23963f(this.f28678a.m27777h(), 0, 3, false);
        this.f28678a.m27775f(0);
        if (this.f28678a.m27790u() != 4607062) {
            return false;
        }
        yl4Var.mo23963f(this.f28678a.m27777h(), 0, 2, false);
        this.f28678a.m27775f(0);
        if ((this.f28678a.m27792w() & 250) != 0) {
            return false;
        }
        yl4Var.mo23963f(this.f28678a.m27777h(), 0, 4, false);
        this.f28678a.m27775f(0);
        int m27782m = this.f28678a.m27782m();
        km4Var.zzj();
        yl4 yl4Var2 = (yl4) km4Var;
        yl4Var2.m28247k(m27782m, false);
        yl4Var2.mo23963f(this.f28678a.m27777h(), 0, 4, false);
        this.f28678a.m27775f(0);
        if (this.f28678a.m27782m() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f28683f = mm4Var;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        if (j11 == 0) {
            this.f28684g = 1;
            this.f28685h = false;
        } else {
            this.f28684g = 3;
        }
        this.f28687j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        long j11;
        boolean m27440c;
        boolean z11;
        long j12;
        v71.m27171b(this.f28683f);
        while (true) {
            int i11 = this.f28684g;
            int i12 = 8;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            if (this.f28685h) {
                                j11 = this.f28686i + this.f28690m;
                            } else if (this.f28682e.m27106d() == -9223372036854775807L) {
                                j11 = 0;
                            } else {
                                j11 = this.f28690m;
                            }
                            int i13 = this.f28688k;
                            if (i13 == 8) {
                                if (this.f28692o != null) {
                                    m26810d();
                                    m27440c = this.f28692o.m27440c(m26809b(km4Var), j11);
                                    z11 = true;
                                    if (!this.f28685h && m27440c) {
                                        this.f28685h = true;
                                        if (this.f28682e.m27106d() != -9223372036854775807L) {
                                            j12 = -this.f28690m;
                                        } else {
                                            j12 = 0;
                                        }
                                        this.f28686i = j12;
                                    }
                                    this.f28687j = 4;
                                    this.f28684g = 2;
                                    if (!z11) {
                                        return 0;
                                    }
                                }
                            } else {
                                i12 = i13;
                            }
                            if (i12 == 9) {
                                if (this.f28693p != null) {
                                    m26810d();
                                    m27440c = this.f28693p.m27440c(m26809b(km4Var), j11);
                                    z11 = true;
                                }
                                ((yl4) km4Var).m28248l(this.f28689l, false);
                                m27440c = false;
                                z11 = false;
                            } else {
                                if (i12 == 18 && !this.f28691n) {
                                    m27440c = this.f28682e.m27440c(m26809b(km4Var), j11);
                                    C5077v0 c5077v0 = this.f28682e;
                                    long m27106d = c5077v0.m27106d();
                                    if (m27106d != -9223372036854775807L) {
                                        this.f28683f.mo21603f(new C4372c(c5077v0.m27107e(), c5077v0.m27108f(), m27106d));
                                        this.f28691n = true;
                                    }
                                    z11 = true;
                                }
                                ((yl4) km4Var).m28248l(this.f28689l, false);
                                m27440c = false;
                                z11 = false;
                            }
                            if (!this.f28685h) {
                                this.f28685h = true;
                                if (this.f28682e.m27106d() != -9223372036854775807L) {
                                }
                                this.f28686i = j12;
                            }
                            this.f28687j = 4;
                            this.f28684g = 2;
                            if (!z11) {
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (!km4Var.mo23962e(this.f28680c.m27777h(), 0, 11, true)) {
                            return -1;
                        }
                        this.f28680c.m27775f(0);
                        this.f28688k = this.f28680c.m27788s();
                        this.f28689l = this.f28680c.m27790u();
                        this.f28690m = this.f28680c.m27790u();
                        this.f28690m = ((this.f28680c.m27788s() << 24) | this.f28690m) * 1000;
                        this.f28680c.m27776g(3);
                        this.f28684g = 4;
                    }
                } else {
                    ((yl4) km4Var).m28248l(this.f28687j, false);
                    this.f28687j = 0;
                    this.f28684g = 3;
                }
            } else {
                if (!km4Var.mo23962e(this.f28679b.m27777h(), 0, 9, true)) {
                    return -1;
                }
                this.f28679b.m27775f(0);
                this.f28679b.m27776g(4);
                int m27788s = this.f28679b.m27788s();
                int i14 = m27788s & 1;
                if ((m27788s & 4) != 0 && this.f28692o == null) {
                    this.f28692o = new C4966s0(this.f28683f.mo21604i(8, 1));
                }
                if (i14 != 0 && this.f28693p == null) {
                    this.f28693p = new C5152x0(this.f28683f.mo21604i(9, 2));
                }
                this.f28683f.zzC();
                this.f28687j = this.f28679b.m27782m() - 5;
                this.f28684g = 2;
            }
        }
    }
}
