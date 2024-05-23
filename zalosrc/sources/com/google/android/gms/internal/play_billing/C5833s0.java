package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.s0 */
/* loaded from: classes2.dex */
public final class C5833s0 extends AbstractC5845u0 {

    /* renamed from: e */
    private final byte[] f33427e;

    /* renamed from: f */
    private final int f33428f;

    /* renamed from: g */
    private int f33429g;

    public C5833s0(byte[] bArr, int i11, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) >= 0) {
            this.f33427e = bArr;
            this.f33429g = 0;
            this.f33428f = i12;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
    }

    /* renamed from: B */
    public final void m30446B(byte[] bArr, int i11, int i12) {
        try {
            System.arraycopy(bArr, 0, this.f33427e, this.f33429g, i12);
            this.f33429g += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33429g), Integer.valueOf(this.f33428f), Integer.valueOf(i12)), e11);
        }
    }

    /* renamed from: C */
    public final void m30447C(String str) {
        int i11 = this.f33429g;
        try {
            int m30488y = AbstractC5845u0.m30488y(str.length() * 3);
            int m30488y2 = AbstractC5845u0.m30488y(str.length());
            if (m30488y2 == m30488y) {
                int i12 = i11 + m30488y2;
                this.f33429g = i12;
                int m30363b = AbstractC5800m3.m30363b(str, this.f33427e, i12, this.f33428f - i12);
                this.f33429g = i11;
                mo30462r((m30363b - i11) - m30488y2);
                this.f33429g = m30363b;
                return;
            }
            mo30462r(AbstractC5800m3.m30364c(str));
            byte[] bArr = this.f33427e;
            int i13 = this.f33429g;
            this.f33429g = AbstractC5800m3.m30363b(str, bArr, i13, this.f33428f - i13);
        } catch (C5794l3 e11) {
            this.f33429g = i11;
            m30491b(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzec(e12);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: d */
    public final int mo30448d() {
        return this.f33428f - this.f33429g;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: e */
    public final void mo30449e(byte b11) {
        try {
            byte[] bArr = this.f33427e;
            int i11 = this.f33429g;
            this.f33429g = i11 + 1;
            bArr[i11] = b11;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33429g), Integer.valueOf(this.f33428f), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: f */
    public final void mo30450f(int i11, boolean z11) {
        mo30462r(i11 << 3);
        mo30449e(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: g */
    public final void mo30451g(int i11, AbstractC5803n0 abstractC5803n0) {
        mo30462r((i11 << 3) | 2);
        mo30462r(abstractC5803n0.mo30241g());
        abstractC5803n0.mo30311m(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: h */
    public final void mo30452h(int i11, int i12) {
        mo30462r((i11 << 3) | 5);
        mo30453i(i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: i */
    public final void mo30453i(int i11) {
        try {
            byte[] bArr = this.f33427e;
            int i12 = this.f33429g;
            bArr[i12] = (byte) (i11 & 255);
            bArr[i12 + 1] = (byte) ((i11 >> 8) & 255);
            bArr[i12 + 2] = (byte) ((i11 >> 16) & 255);
            this.f33429g = i12 + 4;
            bArr[i12 + 3] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33429g), Integer.valueOf(this.f33428f), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: j */
    public final void mo30454j(int i11, long j11) {
        mo30462r((i11 << 3) | 1);
        mo30455k(j11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: k */
    public final void mo30455k(long j11) {
        try {
            byte[] bArr = this.f33427e;
            int i11 = this.f33429g;
            bArr[i11] = (byte) (((int) j11) & 255);
            bArr[i11 + 1] = (byte) (((int) (j11 >> 8)) & 255);
            bArr[i11 + 2] = (byte) (((int) (j11 >> 16)) & 255);
            bArr[i11 + 3] = (byte) (((int) (j11 >> 24)) & 255);
            bArr[i11 + 4] = (byte) (((int) (j11 >> 32)) & 255);
            bArr[i11 + 5] = (byte) (((int) (j11 >> 40)) & 255);
            bArr[i11 + 6] = (byte) (((int) (j11 >> 48)) & 255);
            this.f33429g = i11 + 8;
            bArr[i11 + 7] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33429g), Integer.valueOf(this.f33428f), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: l */
    public final void mo30456l(int i11, int i12) {
        mo30462r(i11 << 3);
        mo30457m(i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: m */
    public final void mo30457m(int i11) {
        if (i11 >= 0) {
            mo30462r(i11);
        } else {
            mo30464t(i11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: n */
    public final void mo30458n(byte[] bArr, int i11, int i12) {
        m30446B(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: o */
    public final void mo30459o(int i11, String str) {
        mo30462r((i11 << 3) | 2);
        m30447C(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: p */
    public final void mo30460p(int i11, int i12) {
        mo30462r((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: q */
    public final void mo30461q(int i11, int i12) {
        mo30462r(i11 << 3);
        mo30462r(i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: r */
    public final void mo30462r(int i11) {
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr = this.f33427e;
                int i12 = this.f33429g;
                this.f33429g = i12 + 1;
                bArr[i12] = (byte) ((i11 & 127) | 128);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33429g), Integer.valueOf(this.f33428f), 1), e11);
            }
        }
        byte[] bArr2 = this.f33427e;
        int i13 = this.f33429g;
        this.f33429g = i13 + 1;
        bArr2[i13] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: s */
    public final void mo30463s(int i11, long j11) {
        mo30462r(i11 << 3);
        mo30464t(j11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5845u0
    /* renamed from: t */
    public final void mo30464t(long j11) {
        boolean z11;
        z11 = AbstractC5845u0.f33432c;
        if (!z11 || this.f33428f - this.f33429g < 10) {
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f33427e;
                    int i11 = this.f33429g;
                    this.f33429g = i11 + 1;
                    bArr[i11] = (byte) ((((int) j11) & 127) | 128);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33429g), Integer.valueOf(this.f33428f), 1), e11);
                }
            }
            byte[] bArr2 = this.f33427e;
            int i12 = this.f33429g;
            this.f33429g = i12 + 1;
            bArr2[i12] = (byte) j11;
            return;
        }
        while (true) {
            int i13 = (int) j11;
            if ((j11 & (-128)) == 0) {
                byte[] bArr3 = this.f33427e;
                int i14 = this.f33429g;
                this.f33429g = i14 + 1;
                AbstractC5770h3.m30266s(bArr3, i14, (byte) i13);
                return;
            }
            byte[] bArr4 = this.f33427e;
            int i15 = this.f33429g;
            this.f33429g = i15 + 1;
            AbstractC5770h3.m30266s(bArr4, i15, (byte) ((i13 & 127) | 128));
            j11 >>>= 7;
        }
    }
}
