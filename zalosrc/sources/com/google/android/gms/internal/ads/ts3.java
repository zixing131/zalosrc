package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ts3 {

    /* renamed from: a */
    private final byte[] f28532a = new byte[256];

    /* renamed from: b */
    private int f28533b;

    /* renamed from: c */
    private int f28534c;

    public ts3(byte[] bArr) {
        for (int i11 = 0; i11 < 256; i11++) {
            this.f28532a[i11] = (byte) i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            byte[] bArr2 = this.f28532a;
            byte b11 = bArr2[i13];
            i12 = (i12 + b11 + bArr[i13 % bArr.length]) & 255;
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b11;
        }
        this.f28533b = 0;
        this.f28534c = 0;
    }

    /* renamed from: a */
    public final void m26735a(byte[] bArr) {
        int i11 = this.f28533b;
        int i12 = this.f28534c;
        for (int i13 = 0; i13 < 256; i13++) {
            i11 = (i11 + 1) & 255;
            byte[] bArr2 = this.f28532a;
            byte b11 = bArr2[i11];
            i12 = (i12 + b11) & 255;
            bArr2[i11] = bArr2[i12];
            bArr2[i12] = b11;
            bArr[i13] = (byte) (bArr2[(bArr2[i11] + b11) & 255] ^ bArr[i13]);
        }
        this.f28533b = i11;
        this.f28534c = i12;
    }
}
