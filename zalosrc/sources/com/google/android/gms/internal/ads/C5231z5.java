package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.z5 */
/* loaded from: classes2.dex */
public final class C5231z5 implements InterfaceC4822o5 {

    /* renamed from: a */
    private final C4898q6 f31354a;

    /* renamed from: b */
    private String f31355b;

    /* renamed from: c */
    private InterfaceC4928r f31356c;

    /* renamed from: d */
    private C5194y5 f31357d;

    /* renamed from: e */
    private boolean f31358e;

    /* renamed from: l */
    private long f31365l;

    /* renamed from: f */
    private final boolean[] f31359f = new boolean[3];

    /* renamed from: g */
    private final C4416d6 f31360g = new C4416d6(32, 128);

    /* renamed from: h */
    private final C4416d6 f31361h = new C4416d6(33, 128);

    /* renamed from: i */
    private final C4416d6 f31362i = new C4416d6(34, 128);

    /* renamed from: j */
    private final C4416d6 f31363j = new C4416d6(39, 128);

    /* renamed from: k */
    private final C4416d6 f31364k = new C4416d6(40, 128);

    /* renamed from: m */
    private long f31366m = -9223372036854775807L;

    /* renamed from: n */
    private final x02 f31367n = new x02();

    public C5231z5(C4898q6 c4898q6) {
        this.f31354a = c4898q6;
    }

    /* renamed from: d */
    private final void m28434d(byte[] bArr, int i11, int i12) {
        this.f31357d.m28128b(bArr, i11, i12);
        if (!this.f31358e) {
            this.f31360g.m21266a(bArr, i11, i12);
            this.f31361h.m21266a(bArr, i11, i12);
            this.f31362i.m21266a(bArr, i11, i12);
        }
        this.f31363j.m21266a(bArr, i11, i12);
        this.f31364k.m21266a(bArr, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0373  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009a(x02 x02Var) {
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        long j11;
        int i15;
        long j12;
        long j13;
        int i16;
        int i17;
        int i18;
        long j14;
        int i19;
        int i21;
        int i22;
        v71.m27171b(this.f31356c);
        int i23 = g92.f20474a;
        while (x02Var.m27778i() > 0) {
            int m27780k = x02Var.m27780k();
            int m27781l = x02Var.m27781l();
            byte[] m27777h = x02Var.m27777h();
            this.f31365l += x02Var.m27778i();
            this.f31356c.mo23301e(x02Var, x02Var.m27778i());
            while (m27780k < m27781l) {
                int m22649a = AbstractC4557h.m22649a(m27777h, m27780k, m27781l, this.f31359f);
                if (m22649a != m27781l) {
                    int i24 = m22649a + 3;
                    int i25 = (m27777h[i24] & 126) >> 1;
                    int i26 = m22649a - m27780k;
                    if (i26 > 0) {
                        m28434d(m27777h, m27780k, m22649a);
                    }
                    int i27 = m27781l - m22649a;
                    long j15 = this.f31365l - i27;
                    if (i26 < 0) {
                        i11 = -i26;
                    } else {
                        i11 = 0;
                    }
                    long j16 = this.f31366m;
                    this.f31357d.m28127a(j15, i27, this.f31358e);
                    if (!this.f31358e) {
                        this.f31360g.m21269d(i11);
                        this.f31361h.m21269d(i11);
                        this.f31362i.m21269d(i11);
                        C4416d6 c4416d6 = this.f31360g;
                        if (c4416d6.m21270e()) {
                            C4416d6 c4416d62 = this.f31361h;
                            if (c4416d62.m21270e()) {
                                C4416d6 c4416d63 = this.f31362i;
                                if (c4416d63.m21270e()) {
                                    InterfaceC4928r interfaceC4928r = this.f31356c;
                                    i13 = i24;
                                    String str = this.f31355b;
                                    int i28 = c4416d6.f19112e;
                                    i12 = m27781l;
                                    bArr = m27777h;
                                    byte[] bArr2 = new byte[c4416d62.f19112e + i28 + c4416d63.f19112e];
                                    i14 = i25;
                                    System.arraycopy(c4416d6.f19111d, 0, bArr2, 0, i28);
                                    i15 = i27;
                                    System.arraycopy(c4416d62.f19111d, 0, bArr2, c4416d6.f19112e, c4416d62.f19112e);
                                    System.arraycopy(c4416d63.f19111d, 0, bArr2, c4416d6.f19112e + c4416d62.f19112e, c4416d63.f19112e);
                                    C4630j c4630j = new C4630j(c4416d62.f19111d, 0, c4416d62.f19112e);
                                    c4630j.m23493e(44);
                                    int m23489a = c4630j.m23489a(3);
                                    c4630j.m23492d();
                                    int m23489a2 = c4630j.m23489a(2);
                                    boolean m23494f = c4630j.m23494f();
                                    int m23489a3 = c4630j.m23489a(5);
                                    int i29 = 0;
                                    for (int i31 = 0; i31 < 32; i31++) {
                                        if (c4630j.m23494f()) {
                                            i29 |= 1 << i31;
                                        }
                                    }
                                    int[] iArr = new int[6];
                                    for (int i32 = 0; i32 < 6; i32++) {
                                        iArr[i32] = c4630j.m23489a(8);
                                    }
                                    int m23489a4 = c4630j.m23489a(8);
                                    int i33 = 0;
                                    for (int i34 = 0; i34 < m23489a; i34++) {
                                        if (c4630j.m23494f()) {
                                            i33 += 89;
                                        }
                                        if (c4630j.m23494f()) {
                                            i33 += 8;
                                        }
                                    }
                                    c4630j.m23493e(i33);
                                    if (m23489a > 0) {
                                        int i35 = 8 - m23489a;
                                        c4630j.m23493e(i35 + i35);
                                    }
                                    c4630j.m23491c();
                                    int m23491c = c4630j.m23491c();
                                    if (m23491c == 3) {
                                        c4630j.m23492d();
                                        m23491c = 3;
                                    }
                                    int m23491c2 = c4630j.m23491c();
                                    int m23491c3 = c4630j.m23491c();
                                    if (c4630j.m23494f()) {
                                        int m23491c4 = c4630j.m23491c();
                                        int m23491c5 = c4630j.m23491c();
                                        int m23491c6 = c4630j.m23491c();
                                        int m23491c7 = c4630j.m23491c();
                                        if (m23491c != 1) {
                                            if (m23491c == 2) {
                                                j11 = j15;
                                                i21 = 2;
                                                m23491c = 2;
                                            } else {
                                                j11 = j15;
                                                i21 = 1;
                                            }
                                        } else {
                                            j11 = j15;
                                            i21 = 2;
                                        }
                                        if (m23491c == 1) {
                                            i22 = 2;
                                        } else {
                                            i22 = 1;
                                        }
                                        m23491c2 -= i21 * (m23491c4 + m23491c5);
                                        m23491c3 -= i22 * (m23491c6 + m23491c7);
                                    } else {
                                        j11 = j15;
                                    }
                                    c4630j.m23491c();
                                    c4630j.m23491c();
                                    int m23491c8 = c4630j.m23491c();
                                    if (true != c4630j.m23494f()) {
                                        i17 = m23489a;
                                    } else {
                                        i17 = 0;
                                    }
                                    while (i17 <= m23489a) {
                                        c4630j.m23491c();
                                        c4630j.m23491c();
                                        c4630j.m23491c();
                                        i17++;
                                    }
                                    c4630j.m23491c();
                                    c4630j.m23491c();
                                    c4630j.m23491c();
                                    c4630j.m23491c();
                                    c4630j.m23491c();
                                    c4630j.m23491c();
                                    if (c4630j.m23494f() && c4630j.m23494f()) {
                                        int i36 = 0;
                                        for (int i37 = 4; i36 < i37; i37 = 4) {
                                            int i38 = 0;
                                            for (int i39 = 6; i38 < i39; i39 = 6) {
                                                if (!c4630j.m23494f()) {
                                                    c4630j.m23491c();
                                                    j14 = j16;
                                                } else {
                                                    j14 = j16;
                                                    int min = Math.min(64, 1 << ((i36 + i36) + 4));
                                                    if (i36 > 1) {
                                                        c4630j.m23490b();
                                                    }
                                                    for (int i41 = 0; i41 < min; i41++) {
                                                        c4630j.m23490b();
                                                    }
                                                }
                                                if (i36 == 3) {
                                                    i19 = 3;
                                                } else {
                                                    i19 = 1;
                                                }
                                                i38 += i19;
                                                j16 = j14;
                                            }
                                            i36++;
                                        }
                                    }
                                    j12 = j16;
                                    c4630j.m23493e(2);
                                    if (c4630j.m23494f()) {
                                        c4630j.m23493e(8);
                                        c4630j.m23491c();
                                        c4630j.m23491c();
                                        c4630j.m23492d();
                                    }
                                    int m23491c9 = c4630j.m23491c();
                                    int i42 = 0;
                                    boolean z11 = false;
                                    int i43 = 0;
                                    while (i42 < m23491c9) {
                                        if (i42 != 0) {
                                            z11 = c4630j.m23494f();
                                        }
                                        if (z11) {
                                            c4630j.m23492d();
                                            c4630j.m23491c();
                                            for (int i44 = 0; i44 <= i43; i44++) {
                                                if (c4630j.m23494f()) {
                                                    c4630j.m23492d();
                                                }
                                            }
                                            i18 = m23491c9;
                                        } else {
                                            int m23491c10 = c4630j.m23491c();
                                            int m23491c11 = c4630j.m23491c();
                                            int i45 = m23491c10 + m23491c11;
                                            i18 = m23491c9;
                                            for (int i46 = 0; i46 < m23491c10; i46++) {
                                                c4630j.m23491c();
                                                c4630j.m23492d();
                                            }
                                            for (int i47 = 0; i47 < m23491c11; i47++) {
                                                c4630j.m23491c();
                                                c4630j.m23492d();
                                            }
                                            i43 = i45;
                                        }
                                        i42++;
                                        m23491c9 = i18;
                                    }
                                    if (c4630j.m23494f()) {
                                        for (int i48 = 0; i48 < c4630j.m23491c(); i48++) {
                                            c4630j.m23493e(m23491c8 + 5);
                                        }
                                    }
                                    c4630j.m23493e(2);
                                    float f11 = 1.0f;
                                    if (c4630j.m23494f()) {
                                        if (c4630j.m23494f()) {
                                            int m23489a5 = c4630j.m23489a(8);
                                            if (m23489a5 == 255) {
                                                int m23489a6 = c4630j.m23489a(16);
                                                int m23489a7 = c4630j.m23489a(16);
                                                if (m23489a6 != 0 && m23489a7 != 0) {
                                                    f11 = m23489a6 / m23489a7;
                                                }
                                            } else if (m23489a5 < 17) {
                                                f11 = AbstractC4557h.f21471b[m23489a5];
                                            } else {
                                                lr1.m24356e("H265Reader", "Unexpected aspect_ratio_idc value: " + m23489a5);
                                            }
                                        }
                                        if (c4630j.m23494f()) {
                                            c4630j.m23492d();
                                        }
                                        if (c4630j.m23494f()) {
                                            c4630j.m23493e(4);
                                            if (c4630j.m23494f()) {
                                                c4630j.m23493e(24);
                                            }
                                        }
                                        if (c4630j.m23494f()) {
                                            c4630j.m23491c();
                                            c4630j.m23491c();
                                        }
                                        c4630j.m23492d();
                                        if (c4630j.m23494f()) {
                                            m23491c3 += m23491c3;
                                        }
                                    }
                                    String m27866b = x91.m27866b(m23489a2, m23494f, m23489a3, i29, iArr, m23489a4);
                                    C5004t1 c5004t1 = new C5004t1();
                                    c5004t1.m26511h(str);
                                    c5004t1.m26523s("video/hevc");
                                    c5004t1.m26508f0(m27866b);
                                    c5004t1.m26528x(m23491c2);
                                    c5004t1.m26507f(m23491c3);
                                    c5004t1.m26520p(f11);
                                    c5004t1.m26513i(Collections.singletonList(bArr2));
                                    interfaceC4928r.mo23300d(c5004t1.m26529y());
                                    this.f31358e = true;
                                    if (!this.f31363j.m21269d(i11)) {
                                        C4416d6 c4416d64 = this.f31363j;
                                        this.f31367n.m27773d(this.f31363j.f19111d, AbstractC4557h.m22650b(c4416d64.f19111d, c4416d64.f19112e));
                                        this.f31367n.m27776g(5);
                                        j13 = j12;
                                        this.f31354a.m25665a(j13, this.f31367n);
                                    } else {
                                        j13 = j12;
                                    }
                                    if (this.f31364k.m21269d(i11)) {
                                        C4416d6 c4416d65 = this.f31364k;
                                        this.f31367n.m27773d(this.f31364k.f19111d, AbstractC4557h.m22650b(c4416d65.f19111d, c4416d65.f19112e));
                                        this.f31367n.m27776g(5);
                                        this.f31354a.m25665a(j13, this.f31367n);
                                    }
                                    this.f31357d.m28130d(j11, i15, i14, this.f31366m, this.f31358e);
                                    if (this.f31358e) {
                                        i16 = i14;
                                        this.f31360g.m21268c(i16);
                                        this.f31361h.m21268c(i16);
                                        this.f31362i.m21268c(i16);
                                    } else {
                                        i16 = i14;
                                    }
                                    this.f31363j.m21268c(i16);
                                    this.f31364k.m21268c(i16);
                                    m27780k = i13;
                                    m27781l = i12;
                                    m27777h = bArr;
                                }
                            }
                        }
                    }
                    i12 = m27781l;
                    bArr = m27777h;
                    i13 = i24;
                    i14 = i25;
                    j11 = j15;
                    i15 = i27;
                    j12 = j16;
                    if (!this.f31363j.m21269d(i11)) {
                    }
                    if (this.f31364k.m21269d(i11)) {
                    }
                    this.f31357d.m28130d(j11, i15, i14, this.f31366m, this.f31358e);
                    if (this.f31358e) {
                    }
                    this.f31363j.m21268c(i16);
                    this.f31364k.m21268c(i16);
                    m27780k = i13;
                    m27781l = i12;
                    m27777h = bArr;
                } else {
                    m28434d(m27777h, m27780k, m27781l);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f31355b = c4344b7.m20419b();
        InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 2);
        this.f31356c = mo21604i;
        this.f31357d = new C5194y5(mo21604i);
        this.f31354a.m25666b(mm4Var, c4344b7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f31366m = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f31365l = 0L;
        this.f31366m = -9223372036854775807L;
        AbstractC4557h.m22653e(this.f31359f);
        this.f31360g.m21267b();
        this.f31361h.m21267b();
        this.f31362i.m21267b();
        this.f31363j.m21267b();
        this.f31364k.m21267b();
        C5194y5 c5194y5 = this.f31357d;
        if (c5194y5 != null) {
            c5194y5.m28129c();
        }
    }
}
