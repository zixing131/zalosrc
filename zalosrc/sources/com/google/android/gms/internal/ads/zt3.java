package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class zt3 extends xt3 {

    /* renamed from: h */
    private final OutputStream f31697h;

    public zt3(OutputStream outputStream, int i11) {
        super(i11);
        this.f31697h = outputStream;
    }

    /* renamed from: M */
    private final void m28613M() {
        this.f31697h.write(this.f30623d, 0, this.f30625f);
        this.f30625f = 0;
    }

    /* renamed from: N */
    private final void m28614N(int i11) {
        if (this.f30624e - this.f30625f < i11) {
            m28613M();
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: A */
    public final void mo20738A(int i11, int i12) {
        m28614N(20);
        m28016K(i11 << 3);
        m28016K(i12);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: B */
    public final void mo20739B(int i11) {
        m28614N(5);
        m28016K(i11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: C */
    public final void mo20740C(int i11, long j11) {
        m28614N(20);
        m28016K(i11 << 3);
        m28017L(j11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: D */
    public final void mo20741D(long j11) {
        m28614N(10);
        m28017L(j11);
    }

    /* renamed from: O */
    public final void m28615O(byte[] bArr, int i11, int i12) {
        int i13 = this.f30624e;
        int i14 = this.f30625f;
        int i15 = i13 - i14;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, this.f30623d, i14, i12);
            this.f30625f += i12;
            this.f30626g += i12;
            return;
        }
        System.arraycopy(bArr, i11, this.f30623d, i14, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f30625f = this.f30624e;
        this.f30626g += i15;
        m28613M();
        if (i17 <= this.f30624e) {
            System.arraycopy(bArr, i16, this.f30623d, 0, i17);
            this.f30625f = i17;
        } else {
            this.f31697h.write(bArr, i16, i17);
        }
        this.f30626g += i17;
    }

    /* renamed from: P */
    public final void m28616P(String str) {
        int m25035e;
        try {
            int length = str.length() * 3;
            int m20733f = bu3.m20733f(length);
            int i11 = m20733f + length;
            int i12 = this.f30624e;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int m25034d = nx3.m25034d(str, bArr, 0, length);
                mo20739B(m25034d);
                m28615O(bArr, 0, m25034d);
                return;
            }
            if (i11 > i12 - this.f30625f) {
                m28613M();
            }
            int m20733f2 = bu3.m20733f(str.length());
            int i13 = this.f30625f;
            try {
                if (m20733f2 == m20733f) {
                    int i14 = i13 + m20733f2;
                    this.f30625f = i14;
                    int m25034d2 = nx3.m25034d(str, this.f30623d, i14, this.f30624e - i14);
                    this.f30625f = i13;
                    m25035e = (m25034d2 - i13) - m20733f2;
                    m28016K(m25035e);
                    this.f30625f = m25034d2;
                } else {
                    m25035e = nx3.m25035e(str);
                    m28016K(m25035e);
                    this.f30625f = nx3.m25034d(str, this.f30623d, this.f30625f, m25035e);
                }
                this.f30626g += m25035e;
            } catch (mx3 e11) {
                this.f30626g -= this.f30625f - i13;
                this.f30625f = i13;
                throw e11;
            } catch (ArrayIndexOutOfBoundsException e12) {
                throw new zzgqi(e12);
            }
        } catch (mx3 e13) {
            m20743k(str, e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3, com.google.android.gms.internal.ads.bt3
    /* renamed from: a */
    public final void mo20711a(byte[] bArr, int i11, int i12) {
        m28615O(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: m */
    public final void mo20744m() {
        if (this.f30625f > 0) {
            m28613M();
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: n */
    public final void mo20745n(byte b11) {
        if (this.f30625f == this.f30624e) {
            m28613M();
        }
        m28013H(b11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: o */
    public final void mo20746o(int i11, boolean z11) {
        m28614N(11);
        m28016K(i11 << 3);
        m28013H(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: p */
    public final void mo20747p(int i11, mt3 mt3Var) {
        mo20739B((i11 << 3) | 2);
        mo20739B(mt3Var.mo22168p());
        mt3Var.mo23393B(this);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: r */
    public final void mo20749r(int i11, int i12) {
        m28614N(14);
        m28016K((i11 << 3) | 5);
        m28014I(i12);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: s */
    public final void mo20750s(int i11) {
        m28614N(4);
        m28014I(i11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: t */
    public final void mo20751t(int i11, long j11) {
        m28614N(18);
        m28016K((i11 << 3) | 1);
        m28015J(j11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: u */
    public final void mo20752u(long j11) {
        m28614N(8);
        m28015J(j11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: v */
    public final void mo20753v(int i11, int i12) {
        m28614N(20);
        m28016K(i11 << 3);
        if (i12 >= 0) {
            m28016K(i12);
        } else {
            m28017L(i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: w */
    public final void mo20754w(int i11) {
        if (i11 >= 0) {
            mo20739B(i11);
        } else {
            mo20741D(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: x */
    public final void mo20755x(int i11, zv3 zv3Var, tw3 tw3Var) {
        mo20739B((i11 << 3) | 2);
        vs3 vs3Var = (vs3) zv3Var;
        int mo26774d = vs3Var.mo26774d();
        if (mo26774d == -1) {
            mo26774d = tw3Var.zza(vs3Var);
            vs3Var.mo26778j(mo26774d);
        }
        mo20739B(mo26774d);
        tw3Var.mo21231f(zv3Var, this.f17988a);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: y */
    public final void mo20756y(int i11, String str) {
        mo20739B((i11 << 3) | 2);
        m28616P(str);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: z */
    public final void mo20757z(int i11, int i12) {
        mo20739B((i11 << 3) | i12);
    }
}
