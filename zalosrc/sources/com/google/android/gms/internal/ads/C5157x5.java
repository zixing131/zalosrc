package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.x5 */
/* loaded from: classes2.dex */
public final class C5157x5 implements InterfaceC4822o5 {

    /* renamed from: a */
    private final C4898q6 f30322a;

    /* renamed from: e */
    private long f30326e;

    /* renamed from: g */
    private String f30328g;

    /* renamed from: h */
    private InterfaceC4928r f30329h;

    /* renamed from: i */
    private C5119w5 f30330i;

    /* renamed from: j */
    private boolean f30331j;

    /* renamed from: l */
    private boolean f30333l;

    /* renamed from: f */
    private final boolean[] f30327f = new boolean[3];

    /* renamed from: b */
    private final C4416d6 f30323b = new C4416d6(7, 128);

    /* renamed from: c */
    private final C4416d6 f30324c = new C4416d6(8, 128);

    /* renamed from: d */
    private final C4416d6 f30325d = new C4416d6(6, 128);

    /* renamed from: k */
    private long f30332k = -9223372036854775807L;

    /* renamed from: m */
    private final x02 f30334m = new x02();

    public C5157x5(C4898q6 c4898q6, boolean z11, boolean z12) {
        this.f30322a = c4898q6;
    }

    /* renamed from: d */
    private final void m27827d(byte[] bArr, int i11, int i12) {
        if (!this.f30331j) {
            this.f30323b.m21266a(bArr, i11, i12);
            this.f30324c.m21266a(bArr, i11, i12);
        }
        this.f30325d.m21266a(bArr, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009a(x02 x02Var) {
        int i11;
        int i12;
        int i13;
        v71.m27171b(this.f30329h);
        int i14 = g92.f20474a;
        int m27780k = x02Var.m27780k();
        int m27781l = x02Var.m27781l();
        byte[] m27777h = x02Var.m27777h();
        this.f30326e += x02Var.m27778i();
        this.f30329h.mo23301e(x02Var, x02Var.m27778i());
        while (true) {
            int m22649a = AbstractC4557h.m22649a(m27777h, m27780k, m27781l, this.f30327f);
            if (m22649a != m27781l) {
                int i15 = m22649a + 3;
                int i16 = m27777h[i15] & 31;
                int i17 = m22649a - m27780k;
                if (i17 > 0) {
                    m27827d(m27777h, m27780k, m22649a);
                }
                int i18 = m27781l - m22649a;
                long j11 = this.f30326e - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                long j12 = this.f30332k;
                if (!this.f30331j) {
                    this.f30323b.m21269d(i11);
                    this.f30324c.m21269d(i11);
                    if (!this.f30331j) {
                        if (this.f30323b.m21270e() && this.f30324c.m21270e()) {
                            ArrayList arrayList = new ArrayList();
                            C4416d6 c4416d6 = this.f30323b;
                            arrayList.add(Arrays.copyOf(c4416d6.f19111d, c4416d6.f19112e));
                            C4416d6 c4416d62 = this.f30324c;
                            arrayList.add(Arrays.copyOf(c4416d62.f19111d, c4416d62.f19112e));
                            C4416d6 c4416d63 = this.f30323b;
                            C4520g m22652d = AbstractC4557h.m22652d(c4416d63.f19111d, 4, c4416d63.f19112e);
                            C4416d6 c4416d64 = this.f30324c;
                            C4483f m22651c = AbstractC4557h.m22651c(c4416d64.f19111d, 4, c4416d64.f19112e);
                            i13 = i15;
                            String m27865a = x91.m27865a(m22652d.f20346a, m22652d.f20347b, m22652d.f20348c);
                            InterfaceC4928r interfaceC4928r = this.f30329h;
                            C5004t1 c5004t1 = new C5004t1();
                            i12 = m27781l;
                            c5004t1.m26511h(this.f30328g);
                            c5004t1.m26523s("video/avc");
                            c5004t1.m26508f0(m27865a);
                            c5004t1.m26528x(m22652d.f20350e);
                            c5004t1.m26507f(m22652d.f20351f);
                            c5004t1.m26520p(m22652d.f20352g);
                            c5004t1.m26513i(arrayList);
                            interfaceC4928r.mo23300d(c5004t1.m26529y());
                            this.f30331j = true;
                            this.f30330i.m27528b(m22652d);
                            this.f30330i.m27527a(m22651c);
                            this.f30323b.m21267b();
                            this.f30324c.m21267b();
                        }
                    } else {
                        i12 = m27781l;
                        i13 = i15;
                        C4416d6 c4416d65 = this.f30323b;
                        if (c4416d65.m21270e()) {
                            this.f30330i.m27528b(AbstractC4557h.m22652d(c4416d65.f19111d, 4, c4416d65.f19112e));
                            this.f30323b.m21267b();
                        } else {
                            C4416d6 c4416d66 = this.f30324c;
                            if (c4416d66.m21270e()) {
                                this.f30330i.m27527a(AbstractC4557h.m22651c(c4416d66.f19111d, 4, c4416d66.f19112e));
                                this.f30324c.m21267b();
                            }
                        }
                    }
                    if (this.f30325d.m21269d(i11)) {
                        C4416d6 c4416d67 = this.f30325d;
                        this.f30334m.m27773d(this.f30325d.f19111d, AbstractC4557h.m22650b(c4416d67.f19111d, c4416d67.f19112e));
                        this.f30334m.m27775f(4);
                        this.f30322a.m25665a(j12, this.f30334m);
                    }
                    if (this.f30330i.m27531e(j11, i18, this.f30331j, this.f30333l)) {
                        this.f30333l = false;
                    }
                    long j13 = this.f30332k;
                    if (this.f30331j) {
                        this.f30323b.m21268c(i16);
                        this.f30324c.m21268c(i16);
                    }
                    this.f30325d.m21268c(i16);
                    this.f30330i.m27530d(j11, i16, j13);
                    m27780k = i13;
                    m27781l = i12;
                }
                i12 = m27781l;
                i13 = i15;
                if (this.f30325d.m21269d(i11)) {
                }
                if (this.f30330i.m27531e(j11, i18, this.f30331j, this.f30333l)) {
                }
                long j132 = this.f30332k;
                if (this.f30331j) {
                }
                this.f30325d.m21268c(i16);
                this.f30330i.m27530d(j11, i16, j132);
                m27780k = i13;
                m27781l = i12;
            } else {
                m27827d(m27777h, m27780k, m27781l);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f30328g = c4344b7.m20419b();
        InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 2);
        this.f30329h = mo21604i;
        this.f30330i = new C5119w5(mo21604i, false, false);
        this.f30322a.m25666b(mm4Var, c4344b7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f30332k = j11;
        }
        this.f30333l |= (i11 & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f30326e = 0L;
        this.f30333l = false;
        this.f30332k = -9223372036854775807L;
        AbstractC4557h.m22653e(this.f30327f);
        this.f30323b.m21267b();
        this.f30324c.m21267b();
        this.f30325d.m21267b();
        C5119w5 c5119w5 = this.f30330i;
        if (c5119w5 != null) {
            c5119w5.m27529c();
        }
    }
}
