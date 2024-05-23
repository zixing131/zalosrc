package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class xt3 extends bu3 {

    /* renamed from: d */
    final byte[] f30623d;

    /* renamed from: e */
    final int f30624e;

    /* renamed from: f */
    int f30625f;

    /* renamed from: g */
    int f30626g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xt3(int i11) {
        super(null);
        if (i11 >= 0) {
            byte[] bArr = new byte[Math.max(i11, 20)];
            this.f30623d = bArr;
            this.f30624e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final void m28013H(byte b11) {
        byte[] bArr = this.f30623d;
        int i11 = this.f30625f;
        this.f30625f = i11 + 1;
        bArr[i11] = b11;
        this.f30626g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final void m28014I(int i11) {
        byte[] bArr = this.f30623d;
        int i12 = this.f30625f;
        bArr[i12] = (byte) (i11 & 255);
        bArr[i12 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i12 + 2] = (byte) ((i11 >> 16) & 255);
        this.f30625f = i12 + 4;
        bArr[i12 + 3] = (byte) ((i11 >> 24) & 255);
        this.f30626g += 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m28015J(long j11) {
        byte[] bArr = this.f30623d;
        int i11 = this.f30625f;
        bArr[i11] = (byte) (j11 & 255);
        bArr[i11 + 1] = (byte) ((j11 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((j11 >> 16) & 255);
        bArr[i11 + 3] = (byte) (255 & (j11 >> 24));
        bArr[i11 + 4] = (byte) (((int) (j11 >> 32)) & 255);
        bArr[i11 + 5] = (byte) (((int) (j11 >> 40)) & 255);
        bArr[i11 + 6] = (byte) (((int) (j11 >> 48)) & 255);
        this.f30625f = i11 + 8;
        bArr[i11 + 7] = (byte) (((int) (j11 >> 56)) & 255);
        this.f30626g += 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final void m28016K(int i11) {
        boolean z11;
        z11 = bu3.f17987c;
        if (z11) {
            long j11 = this.f30625f;
            while ((i11 & (-128)) != 0) {
                byte[] bArr = this.f30623d;
                int i12 = this.f30625f;
                this.f30625f = i12 + 1;
                ix3.m23463y(bArr, i12, (byte) ((i11 & 127) | 128));
                i11 >>>= 7;
            }
            byte[] bArr2 = this.f30623d;
            int i13 = this.f30625f;
            this.f30625f = i13 + 1;
            ix3.m23463y(bArr2, i13, (byte) i11);
            this.f30626g += (int) (this.f30625f - j11);
            return;
        }
        while ((i11 & (-128)) != 0) {
            byte[] bArr3 = this.f30623d;
            int i14 = this.f30625f;
            this.f30625f = i14 + 1;
            bArr3[i14] = (byte) ((i11 & 127) | 128);
            this.f30626g++;
            i11 >>>= 7;
        }
        byte[] bArr4 = this.f30623d;
        int i15 = this.f30625f;
        this.f30625f = i15 + 1;
        bArr4[i15] = (byte) i11;
        this.f30626g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final void m28017L(long j11) {
        boolean z11;
        z11 = bu3.f17987c;
        if (z11) {
            long j12 = this.f30625f;
            while ((j11 & (-128)) != 0) {
                byte[] bArr = this.f30623d;
                int i11 = this.f30625f;
                this.f30625f = i11 + 1;
                ix3.m23463y(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                j11 >>>= 7;
            }
            byte[] bArr2 = this.f30623d;
            int i12 = this.f30625f;
            this.f30625f = i12 + 1;
            ix3.m23463y(bArr2, i12, (byte) j11);
            this.f30626g += (int) (this.f30625f - j12);
            return;
        }
        while ((j11 & (-128)) != 0) {
            byte[] bArr3 = this.f30623d;
            int i13 = this.f30625f;
            this.f30625f = i13 + 1;
            bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
            this.f30626g++;
            j11 >>>= 7;
        }
        byte[] bArr4 = this.f30623d;
        int i14 = this.f30625f;
        this.f30625f = i14 + 1;
        bArr4[i14] = (byte) j11;
        this.f30626g++;
    }

    @Override // com.google.android.gms.internal.ads.bu3
    /* renamed from: q */
    public final int mo20748q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
