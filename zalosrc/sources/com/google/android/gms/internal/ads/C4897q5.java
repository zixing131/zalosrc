package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.q5 */
/* loaded from: classes2.dex */
public final class C4897q5 implements InterfaceC4822o5 {

    /* renamed from: q */
    private static final double[] f26631q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f26632a;

    /* renamed from: b */
    private InterfaceC4928r f26633b;

    /* renamed from: c */
    private final C4454e7 f26634c;

    /* renamed from: d */
    private final x02 f26635d;

    /* renamed from: e */
    private final C4416d6 f26636e;

    /* renamed from: f */
    private final boolean[] f26637f = new boolean[4];

    /* renamed from: g */
    private final C4859p5 f26638g = new C4859p5(128);

    /* renamed from: h */
    private long f26639h;

    /* renamed from: i */
    private boolean f26640i;

    /* renamed from: j */
    private boolean f26641j;

    /* renamed from: k */
    private long f26642k;

    /* renamed from: l */
    private long f26643l;

    /* renamed from: m */
    private long f26644m;

    /* renamed from: n */
    private long f26645n;

    /* renamed from: o */
    private boolean f26646o;

    /* renamed from: p */
    private boolean f26647p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4897q5(C4454e7 c4454e7) {
        x02 x02Var;
        this.f26634c = c4454e7;
        if (c4454e7 != null) {
            this.f26636e = new C4416d6(178, 128);
            x02Var = new x02();
        } else {
            x02Var = null;
            this.f26636e = null;
        }
        this.f26635d = x02Var;
        this.f26643l = -9223372036854775807L;
        this.f26645n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009a(x02 x02Var) {
        int i11;
        C4416d6 c4416d6;
        int i12;
        long j11;
        boolean z11;
        long j12;
        int i13;
        int i14;
        float f11;
        int i15;
        float f12;
        int i16;
        v71.m27171b(this.f26633b);
        int m27780k = x02Var.m27780k();
        int m27781l = x02Var.m27781l();
        byte[] m27777h = x02Var.m27777h();
        this.f26639h += x02Var.m27778i();
        this.f26633b.mo23301e(x02Var, x02Var.m27778i());
        while (true) {
            int m22649a = AbstractC4557h.m22649a(m27777h, m27780k, m27781l, this.f26637f);
            if (m22649a == m27781l) {
                break;
            }
            int i17 = m22649a + 3;
            int i18 = x02Var.m27777h()[i17] & 255;
            int i19 = m22649a - m27780k;
            if (!this.f26641j) {
                if (i19 > 0) {
                    this.f26638g.m25400a(m27777h, m27780k, m22649a);
                }
                if (i19 < 0) {
                    i14 = -i19;
                } else {
                    i14 = 0;
                }
                if (this.f26638g.m25402c(i18, i14)) {
                    C4859p5 c4859p5 = this.f26638g;
                    String str = this.f26632a;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(c4859p5.f26071d, c4859p5.f26069b);
                    byte b11 = copyOf[4];
                    byte b12 = copyOf[5];
                    int i21 = ((b12 & 255) >> 4) | ((b11 & 255) << 4);
                    int i22 = ((b12 & 15) << 8) | (copyOf[6] & 255);
                    int i23 = (copyOf[7] & 240) >> 4;
                    if (i23 != 2) {
                        if (i23 != 3) {
                            if (i23 != 4) {
                                f12 = 1.0f;
                                C5004t1 c5004t1 = new C5004t1();
                                c5004t1.m26511h(str);
                                c5004t1.m26523s("video/mpeg2");
                                c5004t1.m26528x(i21);
                                c5004t1.m26507f(i22);
                                c5004t1.m26520p(f12);
                                c5004t1.m26513i(Collections.singletonList(copyOf));
                                C4671k3 m26529y = c5004t1.m26529y();
                                i16 = (copyOf[7] & 15) - 1;
                                long j13 = 0;
                                if (i16 < 0 && i16 < 8) {
                                    double d11 = f26631q[i16];
                                    byte b13 = copyOf[c4859p5.f26070c + 9];
                                    int i24 = (b13 & 96) >> 5;
                                    if (i24 != (b13 & 31)) {
                                        i11 = i17;
                                        d11 *= (i24 + 1.0d) / (r9 + 1);
                                    } else {
                                        i11 = i17;
                                    }
                                    j13 = (long) (1000000.0d / d11);
                                } else {
                                    i11 = i17;
                                }
                                Pair create = Pair.create(m26529y, Long.valueOf(j13));
                                this.f26633b.mo23300d((C4671k3) create.first);
                                this.f26642k = ((Long) create.second).longValue();
                                this.f26641j = true;
                                c4416d6 = this.f26636e;
                                if (c4416d6 != null) {
                                    if (i19 > 0) {
                                        c4416d6.m21266a(m27777h, m27780k, m22649a);
                                        i13 = 0;
                                    } else {
                                        i13 = -i19;
                                    }
                                    if (this.f26636e.m21269d(i13)) {
                                        C4416d6 c4416d62 = this.f26636e;
                                        int m22650b = AbstractC4557h.m22650b(c4416d62.f19111d, c4416d62.f19112e);
                                        x02 x02Var2 = this.f26635d;
                                        int i25 = g92.f20474a;
                                        x02Var2.m27773d(this.f26636e.f19111d, m22650b);
                                        this.f26634c.m21623a(this.f26645n, this.f26635d);
                                    }
                                    if (i18 == 178) {
                                        if (x02Var.m27777h()[m22649a + 2] == 1) {
                                            this.f26636e.m21268c(178);
                                        }
                                        i18 = 178;
                                    }
                                }
                                if (i18 == 0 && i18 != 179) {
                                    if (i18 == 184) {
                                        this.f26646o = true;
                                    }
                                } else {
                                    i12 = m27781l - m22649a;
                                    if (this.f26647p && this.f26641j) {
                                        j12 = this.f26645n;
                                        if (j12 != -9223372036854775807L) {
                                            this.f26633b.mo23302f(j12, this.f26646o ? 1 : 0, ((int) (this.f26639h - this.f26644m)) - i12, i12, null);
                                        }
                                    }
                                    if (this.f26640i || this.f26647p) {
                                        this.f26644m = this.f26639h - i12;
                                        j11 = this.f26643l;
                                        if (j11 == -9223372036854775807L) {
                                            long j14 = this.f26645n;
                                            if (j14 != -9223372036854775807L) {
                                                j11 = j14 + this.f26642k;
                                            } else {
                                                j11 = -9223372036854775807L;
                                            }
                                        }
                                        this.f26645n = j11;
                                        this.f26646o = false;
                                        this.f26643l = -9223372036854775807L;
                                        this.f26640i = true;
                                    }
                                    if (i18 == 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    this.f26647p = z11;
                                }
                                m27780k = i11;
                            } else {
                                f11 = i22 * 121;
                                i15 = i21 * 100;
                            }
                        } else {
                            f11 = i22 * 16;
                            i15 = i21 * 9;
                        }
                    } else {
                        f11 = i22 * 4;
                        i15 = i21 * 3;
                    }
                    f12 = f11 / i15;
                    C5004t1 c5004t12 = new C5004t1();
                    c5004t12.m26511h(str);
                    c5004t12.m26523s("video/mpeg2");
                    c5004t12.m26528x(i21);
                    c5004t12.m26507f(i22);
                    c5004t12.m26520p(f12);
                    c5004t12.m26513i(Collections.singletonList(copyOf));
                    C4671k3 m26529y2 = c5004t12.m26529y();
                    i16 = (copyOf[7] & 15) - 1;
                    long j132 = 0;
                    if (i16 < 0) {
                    }
                    i11 = i17;
                    Pair create2 = Pair.create(m26529y2, Long.valueOf(j132));
                    this.f26633b.mo23300d((C4671k3) create2.first);
                    this.f26642k = ((Long) create2.second).longValue();
                    this.f26641j = true;
                    c4416d6 = this.f26636e;
                    if (c4416d6 != null) {
                    }
                    if (i18 == 0) {
                    }
                    i12 = m27781l - m22649a;
                    if (this.f26647p) {
                        j12 = this.f26645n;
                        if (j12 != -9223372036854775807L) {
                        }
                    }
                    if (this.f26640i) {
                    }
                    this.f26644m = this.f26639h - i12;
                    j11 = this.f26643l;
                    if (j11 == -9223372036854775807L) {
                    }
                    this.f26645n = j11;
                    this.f26646o = false;
                    this.f26643l = -9223372036854775807L;
                    this.f26640i = true;
                    if (i18 == 0) {
                    }
                    this.f26647p = z11;
                    m27780k = i11;
                }
            }
            i11 = i17;
            c4416d6 = this.f26636e;
            if (c4416d6 != null) {
            }
            if (i18 == 0) {
            }
            i12 = m27781l - m22649a;
            if (this.f26647p) {
            }
            if (this.f26640i) {
            }
            this.f26644m = this.f26639h - i12;
            j11 = this.f26643l;
            if (j11 == -9223372036854775807L) {
            }
            this.f26645n = j11;
            this.f26646o = false;
            this.f26643l = -9223372036854775807L;
            this.f26640i = true;
            if (i18 == 0) {
            }
            this.f26647p = z11;
            m27780k = i11;
        }
        if (!this.f26641j) {
            this.f26638g.m25400a(m27777h, m27780k, m27781l);
        }
        C4416d6 c4416d63 = this.f26636e;
        if (c4416d63 != null) {
            c4416d63.m21266a(m27777h, m27780k, m27781l);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f26632a = c4344b7.m20419b();
        this.f26633b = mm4Var.mo21604i(c4344b7.m20418a(), 2);
        C4454e7 c4454e7 = this.f26634c;
        if (c4454e7 != null) {
            c4454e7.m21624b(mm4Var, c4344b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        this.f26643l = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        AbstractC4557h.m22653e(this.f26637f);
        this.f26638g.m25401b();
        C4416d6 c4416d6 = this.f26636e;
        if (c4416d6 != null) {
            c4416d6.m21267b();
        }
        this.f26639h = 0L;
        this.f26640i = false;
        this.f26643l = -9223372036854775807L;
        this.f26645n = -9223372036854775807L;
    }
}
