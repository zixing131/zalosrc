package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c9 */
/* loaded from: classes.dex */
public final class C5323c9 extends AbstractC5357e9 {

    /* renamed from: e */
    private final byte[] f32314e;

    /* renamed from: f */
    private final int f32315f;

    /* renamed from: g */
    private int f32316g;

    public C5323c9(byte[] bArr, int i11, int i12) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i12) | i12) >= 0) {
                this.f32314e = bArr;
                this.f32316g = 0;
                this.f32315f = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: B */
    public final void m28971B(byte[] bArr, int i11, int i12) {
        try {
            System.arraycopy(bArr, 0, this.f32314e, this.f32316g, i12);
            this.f32316g += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32316g), Integer.valueOf(this.f32315f), Integer.valueOf(i12)), e11);
        }
    }

    /* renamed from: C */
    public final void m28972C(String str) {
        int i11 = this.f32316g;
        try {
            int m29089y = AbstractC5357e9.m29089y(str.length() * 3);
            int m29089y2 = AbstractC5357e9.m29089y(str.length());
            if (m29089y2 == m29089y) {
                int i12 = i11 + m29089y2;
                this.f32316g = i12;
                int m28887b = AbstractC5292ac.m28887b(str, this.f32314e, i12, this.f32315f - i12);
                this.f32316g = i11;
                mo28987r((m28887b - i11) - m29089y2);
                this.f32316g = m28887b;
                return;
            }
            mo28987r(AbstractC5292ac.m28888c(str));
            byte[] bArr = this.f32314e;
            int i13 = this.f32316g;
            this.f32316g = AbstractC5292ac.m28887b(str, bArr, i13, this.f32315f - i13);
        } catch (C5716zb e11) {
            this.f32316g = i11;
            m29092b(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzkg(e12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: d */
    public final int mo28973d() {
        return this.f32315f - this.f32316g;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: e */
    public final void mo28974e(byte b11) {
        try {
            byte[] bArr = this.f32314e;
            int i11 = this.f32316g;
            this.f32316g = i11 + 1;
            bArr[i11] = b11;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32316g), Integer.valueOf(this.f32315f), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: f */
    public final void mo28975f(int i11, boolean z11) {
        mo28987r(i11 << 3);
        mo28974e(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: g */
    public final void mo28976g(int i11, AbstractC5679x8 abstractC5679x8) {
        mo28987r((i11 << 3) | 2);
        mo28987r(abstractC5679x8.mo29551g());
        abstractC5679x8.mo29633m(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: h */
    public final void mo28977h(int i11, int i12) {
        mo28987r((i11 << 3) | 5);
        mo28978i(i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: i */
    public final void mo28978i(int i11) {
        try {
            byte[] bArr = this.f32314e;
            int i12 = this.f32316g;
            bArr[i12] = (byte) (i11 & 255);
            bArr[i12 + 1] = (byte) ((i11 >> 8) & 255);
            bArr[i12 + 2] = (byte) ((i11 >> 16) & 255);
            this.f32316g = i12 + 4;
            bArr[i12 + 3] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32316g), Integer.valueOf(this.f32315f), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: j */
    public final void mo28979j(int i11, long j11) {
        mo28987r((i11 << 3) | 1);
        mo28980k(j11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: k */
    public final void mo28980k(long j11) {
        try {
            byte[] bArr = this.f32314e;
            int i11 = this.f32316g;
            bArr[i11] = (byte) (((int) j11) & 255);
            bArr[i11 + 1] = (byte) (((int) (j11 >> 8)) & 255);
            bArr[i11 + 2] = (byte) (((int) (j11 >> 16)) & 255);
            bArr[i11 + 3] = (byte) (((int) (j11 >> 24)) & 255);
            bArr[i11 + 4] = (byte) (((int) (j11 >> 32)) & 255);
            bArr[i11 + 5] = (byte) (((int) (j11 >> 40)) & 255);
            bArr[i11 + 6] = (byte) (((int) (j11 >> 48)) & 255);
            this.f32316g = i11 + 8;
            bArr[i11 + 7] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32316g), Integer.valueOf(this.f32315f), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: l */
    public final void mo28981l(int i11, int i12) {
        mo28987r(i11 << 3);
        mo28982m(i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: m */
    public final void mo28982m(int i11) {
        if (i11 >= 0) {
            mo28987r(i11);
        } else {
            mo28989t(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: n */
    public final void mo28983n(byte[] bArr, int i11, int i12) {
        m28971B(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: o */
    public final void mo28984o(int i11, String str) {
        mo28987r((i11 << 3) | 2);
        m28972C(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: p */
    public final void mo28985p(int i11, int i12) {
        mo28987r((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: q */
    public final void mo28986q(int i11, int i12) {
        mo28987r(i11 << 3);
        mo28987r(i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: r */
    public final void mo28987r(int i11) {
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr = this.f32314e;
                int i12 = this.f32316g;
                this.f32316g = i12 + 1;
                bArr[i12] = (byte) ((i11 & 127) | 128);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32316g), Integer.valueOf(this.f32315f), 1), e11);
            }
        }
        byte[] bArr2 = this.f32314e;
        int i13 = this.f32316g;
        this.f32316g = i13 + 1;
        bArr2[i13] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: s */
    public final void mo28988s(int i11, long j11) {
        mo28987r(i11 << 3);
        mo28989t(j11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5357e9
    /* renamed from: t */
    public final void mo28989t(long j11) {
        boolean z11;
        z11 = AbstractC5357e9.f32353c;
        if (z11 && this.f32315f - this.f32316g >= 10) {
            while ((j11 & (-128)) != 0) {
                byte[] bArr = this.f32314e;
                int i11 = this.f32316g;
                this.f32316g = i11 + 1;
                AbstractC5648vb.m29799s(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                j11 >>>= 7;
            }
            byte[] bArr2 = this.f32314e;
            int i12 = this.f32316g;
            this.f32316g = i12 + 1;
            AbstractC5648vb.m29799s(bArr2, i12, (byte) j11);
            return;
        }
        while ((j11 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f32314e;
                int i13 = this.f32316g;
                this.f32316g = i13 + 1;
                bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
                j11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32316g), Integer.valueOf(this.f32315f), 1), e11);
            }
        }
        byte[] bArr4 = this.f32314e;
        int i14 = this.f32316g;
        this.f32316g = i14 + 1;
        bArr4[i14] = (byte) j11;
    }
}
