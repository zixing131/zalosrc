package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class yt3 extends bu3 {

    /* renamed from: d */
    private final byte[] f31098d;

    /* renamed from: e */
    private final int f31099e;

    /* renamed from: f */
    private int f31100f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yt3(byte[] bArr, int i11, int i12) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i12) | i12) >= 0) {
                this.f31098d = bArr;
                this.f31100f = 0;
                this.f31099e = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: A */
    public final void mo20738A(int i11, int i12) {
        mo20739B(i11 << 3);
        mo20739B(i12);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: B */
    public final void mo20739B(int i11) {
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr = this.f31098d;
                int i12 = this.f31100f;
                this.f31100f = i12 + 1;
                bArr[i12] = (byte) ((i11 & 127) | 128);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31100f), Integer.valueOf(this.f31099e), 1), e11);
            }
        }
        byte[] bArr2 = this.f31098d;
        int i13 = this.f31100f;
        this.f31100f = i13 + 1;
        bArr2[i13] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: C */
    public final void mo20740C(int i11, long j11) {
        mo20739B(i11 << 3);
        mo20741D(j11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: D */
    public final void mo20741D(long j11) {
        boolean z11;
        z11 = bu3.f17987c;
        if (z11 && this.f31099e - this.f31100f >= 10) {
            while ((j11 & (-128)) != 0) {
                byte[] bArr = this.f31098d;
                int i11 = this.f31100f;
                this.f31100f = i11 + 1;
                ix3.m23463y(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                j11 >>>= 7;
            }
            byte[] bArr2 = this.f31098d;
            int i12 = this.f31100f;
            this.f31100f = i12 + 1;
            ix3.m23463y(bArr2, i12, (byte) j11);
            return;
        }
        while ((j11 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f31098d;
                int i13 = this.f31100f;
                this.f31100f = i13 + 1;
                bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
                j11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31100f), Integer.valueOf(this.f31099e), 1), e11);
            }
        }
        byte[] bArr4 = this.f31098d;
        int i14 = this.f31100f;
        this.f31100f = i14 + 1;
        bArr4[i14] = (byte) j11;
    }

    /* renamed from: H */
    public final void m28340H(byte[] bArr, int i11, int i12) {
        try {
            System.arraycopy(bArr, i11, this.f31098d, this.f31100f, i12);
            this.f31100f += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31100f), Integer.valueOf(this.f31099e), Integer.valueOf(i12)), e11);
        }
    }

    /* renamed from: I */
    public final void m28341I(String str) {
        int i11 = this.f31100f;
        try {
            int m20733f = bu3.m20733f(str.length() * 3);
            int m20733f2 = bu3.m20733f(str.length());
            if (m20733f2 == m20733f) {
                int i12 = i11 + m20733f2;
                this.f31100f = i12;
                int m25034d = nx3.m25034d(str, this.f31098d, i12, this.f31099e - i12);
                this.f31100f = i11;
                mo20739B((m25034d - i11) - m20733f2);
                this.f31100f = m25034d;
                return;
            }
            mo20739B(nx3.m25035e(str));
            byte[] bArr = this.f31098d;
            int i13 = this.f31100f;
            this.f31100f = nx3.m25034d(str, bArr, i13, this.f31099e - i13);
        } catch (mx3 e11) {
            this.f31100f = i11;
            m20743k(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzgqi(e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3, com.google.android.gms.internal.ads.bt3
    /* renamed from: a */
    public final void mo20711a(byte[] bArr, int i11, int i12) {
        m28340H(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: m */
    public final void mo20744m() {
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: n */
    public final void mo20745n(byte b11) {
        try {
            byte[] bArr = this.f31098d;
            int i11 = this.f31100f;
            this.f31100f = i11 + 1;
            bArr[i11] = b11;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31100f), Integer.valueOf(this.f31099e), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: o */
    public final void mo20746o(int i11, boolean z11) {
        mo20739B(i11 << 3);
        mo20745n(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: p */
    public final void mo20747p(int i11, mt3 mt3Var) {
        mo20739B((i11 << 3) | 2);
        mo20739B(mt3Var.mo22168p());
        mt3Var.mo23393B(this);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: q */
    public final int mo20748q() {
        return this.f31099e - this.f31100f;
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: r */
    public final void mo20749r(int i11, int i12) {
        mo20739B((i11 << 3) | 5);
        mo20750s(i12);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: s */
    public final void mo20750s(int i11) {
        try {
            byte[] bArr = this.f31098d;
            int i12 = this.f31100f;
            bArr[i12] = (byte) (i11 & 255);
            bArr[i12 + 1] = (byte) ((i11 >> 8) & 255);
            bArr[i12 + 2] = (byte) ((i11 >> 16) & 255);
            this.f31100f = i12 + 4;
            bArr[i12 + 3] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31100f), Integer.valueOf(this.f31099e), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: t */
    public final void mo20751t(int i11, long j11) {
        mo20739B((i11 << 3) | 1);
        mo20752u(j11);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: u */
    public final void mo20752u(long j11) {
        try {
            byte[] bArr = this.f31098d;
            int i11 = this.f31100f;
            bArr[i11] = (byte) (((int) j11) & 255);
            bArr[i11 + 1] = (byte) (((int) (j11 >> 8)) & 255);
            bArr[i11 + 2] = (byte) (((int) (j11 >> 16)) & 255);
            bArr[i11 + 3] = (byte) (((int) (j11 >> 24)) & 255);
            bArr[i11 + 4] = (byte) (((int) (j11 >> 32)) & 255);
            bArr[i11 + 5] = (byte) (((int) (j11 >> 40)) & 255);
            bArr[i11 + 6] = (byte) (((int) (j11 >> 48)) & 255);
            this.f31100f = i11 + 8;
            bArr[i11 + 7] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31100f), Integer.valueOf(this.f31099e), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: v */
    public final void mo20753v(int i11, int i12) {
        mo20739B(i11 << 3);
        mo20754w(i12);
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
        m28341I(str);
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: z */
    public final void mo20757z(int i11, int i12) {
        mo20739B((i11 << 3) | i12);
    }
}
