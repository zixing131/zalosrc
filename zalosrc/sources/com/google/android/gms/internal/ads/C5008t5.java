package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.t5 */
/* loaded from: classes2.dex */
public final class C5008t5 implements InterfaceC4822o5 {

    /* renamed from: l */
    private static final float[] f28201l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C4454e7 f28202a;

    /* renamed from: f */
    private C4971s5 f28207f;

    /* renamed from: g */
    private long f28208g;

    /* renamed from: h */
    private String f28209h;

    /* renamed from: i */
    private InterfaceC4928r f28210i;

    /* renamed from: j */
    private boolean f28211j;

    /* renamed from: c */
    private final boolean[] f28204c = new boolean[4];

    /* renamed from: d */
    private final C4934r5 f28205d = new C4934r5(128);

    /* renamed from: k */
    private long f28212k = -9223372036854775807L;

    /* renamed from: e */
    private final C4416d6 f28206e = new C4416d6(178, 128);

    /* renamed from: b */
    private final x02 f28203b = new x02();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5008t5(C4454e7 c4454e7) {
        this.f28202a = c4454e7;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0192  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009a(x02 x02Var) {
        int i11;
        int i12;
        int i13;
        float f11;
        float f12;
        v71.m27171b(this.f28207f);
        v71.m27171b(this.f28210i);
        int m27780k = x02Var.m27780k();
        int m27781l = x02Var.m27781l();
        byte[] m27777h = x02Var.m27777h();
        this.f28208g += x02Var.m27778i();
        this.f28210i.mo23301e(x02Var, x02Var.m27778i());
        while (true) {
            int m22649a = AbstractC4557h.m22649a(m27777h, m27780k, m27781l, this.f28204c);
            if (m22649a == m27781l) {
                break;
            }
            int i14 = m22649a + 3;
            int i15 = x02Var.m27777h()[i14] & 255;
            int i16 = m22649a - m27780k;
            if (!this.f28211j) {
                if (i16 > 0) {
                    this.f28205d.m25980a(m27777h, m27780k, m22649a);
                }
                if (i16 < 0) {
                    i13 = -i16;
                } else {
                    i13 = 0;
                }
                if (this.f28205d.m25982c(i15, i13)) {
                    InterfaceC4928r interfaceC4928r = this.f28210i;
                    C4934r5 c4934r5 = this.f28205d;
                    int i17 = c4934r5.f27090d;
                    String str = this.f28209h;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(c4934r5.f27091e, c4934r5.f27089c);
                    wz1 wz1Var = new wz1(copyOf, copyOf.length);
                    wz1Var.m27754k(i17);
                    wz1Var.m27754k(4);
                    wz1Var.m27752i();
                    wz1Var.m27753j(8);
                    if (wz1Var.m27755l()) {
                        wz1Var.m27753j(4);
                        wz1Var.m27753j(3);
                    }
                    int m27746c = wz1Var.m27746c(4);
                    i11 = i14;
                    if (m27746c == 15) {
                        int m27746c2 = wz1Var.m27746c(8);
                        int m27746c3 = wz1Var.m27746c(8);
                        if (m27746c3 == 0) {
                            lr1.m24356e("H263Reader", "Invalid aspect ratio");
                            f12 = 1.0f;
                        } else {
                            f11 = m27746c2 / m27746c3;
                            f12 = f11;
                        }
                    } else if (m27746c < 7) {
                        f11 = f28201l[m27746c];
                        f12 = f11;
                    } else {
                        lr1.m24356e("H263Reader", "Invalid aspect ratio");
                        f12 = 1.0f;
                    }
                    if (wz1Var.m27755l()) {
                        wz1Var.m27753j(2);
                        wz1Var.m27753j(1);
                        if (wz1Var.m27755l()) {
                            wz1Var.m27753j(15);
                            wz1Var.m27752i();
                            wz1Var.m27753j(15);
                            wz1Var.m27752i();
                            wz1Var.m27753j(15);
                            wz1Var.m27752i();
                            wz1Var.m27753j(3);
                            wz1Var.m27753j(11);
                            wz1Var.m27752i();
                            wz1Var.m27753j(15);
                            wz1Var.m27752i();
                        }
                    }
                    if (wz1Var.m27746c(2) != 0) {
                        lr1.m24356e("H263Reader", "Unhandled video object layer shape");
                    }
                    wz1Var.m27752i();
                    int m27746c4 = wz1Var.m27746c(16);
                    wz1Var.m27752i();
                    if (wz1Var.m27755l()) {
                        if (m27746c4 == 0) {
                            lr1.m24356e("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i18 = 0;
                            for (int i19 = m27746c4 - 1; i19 > 0; i19 >>= 1) {
                                i18++;
                            }
                            wz1Var.m27753j(i18);
                        }
                    }
                    wz1Var.m27752i();
                    int m27746c5 = wz1Var.m27746c(13);
                    wz1Var.m27752i();
                    int m27746c6 = wz1Var.m27746c(13);
                    wz1Var.m27752i();
                    wz1Var.m27752i();
                    C5004t1 c5004t1 = new C5004t1();
                    c5004t1.m26511h(str);
                    c5004t1.m26523s("video/mp4v-es");
                    c5004t1.m26528x(m27746c5);
                    c5004t1.m26507f(m27746c6);
                    c5004t1.m26520p(f12);
                    c5004t1.m26513i(Collections.singletonList(copyOf));
                    interfaceC4928r.mo23300d(c5004t1.m26529y());
                    this.f28211j = true;
                    this.f28207f.m26248a(m27777h, m27780k, m22649a);
                    C4416d6 c4416d6 = this.f28206e;
                    if (i16 <= 0) {
                        c4416d6.m21266a(m27777h, m27780k, m22649a);
                        i12 = 0;
                    } else {
                        i12 = -i16;
                    }
                    if (this.f28206e.m21269d(i12)) {
                        C4416d6 c4416d62 = this.f28206e;
                        int m22650b = AbstractC4557h.m22650b(c4416d62.f19111d, c4416d62.f19112e);
                        x02 x02Var2 = this.f28203b;
                        int i21 = g92.f20474a;
                        x02Var2.m27773d(this.f28206e.f19111d, m22650b);
                        this.f28202a.m21623a(this.f28212k, this.f28203b);
                    }
                    if (i15 == 178) {
                        if (x02Var.m27777h()[m22649a + 2] == 1) {
                            this.f28206e.m21268c(178);
                        }
                        i15 = 178;
                    }
                    int i22 = m27781l - m22649a;
                    this.f28207f.m26249b(this.f28208g - i22, i22, this.f28211j);
                    this.f28207f.m26250c(i15, this.f28212k);
                    m27780k = i11;
                }
            }
            i11 = i14;
            this.f28207f.m26248a(m27777h, m27780k, m22649a);
            C4416d6 c4416d63 = this.f28206e;
            if (i16 <= 0) {
            }
            if (this.f28206e.m21269d(i12)) {
            }
            if (i15 == 178) {
            }
            int i222 = m27781l - m22649a;
            this.f28207f.m26249b(this.f28208g - i222, i222, this.f28211j);
            this.f28207f.m26250c(i15, this.f28212k);
            m27780k = i11;
        }
        if (!this.f28211j) {
            this.f28205d.m25980a(m27777h, m27780k, m27781l);
        }
        this.f28207f.m26248a(m27777h, m27780k, m27781l);
        this.f28206e.m21266a(m27777h, m27780k, m27781l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f28209h = c4344b7.m20419b();
        InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 2);
        this.f28210i = mo21604i;
        this.f28207f = new C4971s5(mo21604i);
        this.f28202a.m21624b(mm4Var, c4344b7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f28212k = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        AbstractC4557h.m22653e(this.f28204c);
        this.f28205d.m25981b();
        C4971s5 c4971s5 = this.f28207f;
        if (c4971s5 != null) {
            c4971s5.m26251d();
        }
        this.f28206e.m21267b();
        this.f28208g = 0L;
        this.f28212k = -9223372036854775807L;
    }
}
