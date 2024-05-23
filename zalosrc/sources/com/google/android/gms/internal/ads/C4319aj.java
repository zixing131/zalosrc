package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.aj */
/* loaded from: classes2.dex */
public final class C4319aj {

    /* renamed from: a */
    public byte[] f17085a;

    /* renamed from: b */
    public byte[] f17086b;

    /* renamed from: c */
    public int f17087c;

    /* renamed from: d */
    public int[] f17088d;

    /* renamed from: e */
    public int[] f17089e;

    /* renamed from: f */
    public int f17090f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f17091g;

    /* renamed from: h */
    private final C5244zi f17092h;

    public C4319aj() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i11 = AbstractC4916qo.f26898a;
        if (i11 >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.f17091g = cryptoInfo;
        this.f17092h = i11 >= 24 ? new C5244zi(cryptoInfo, null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo m20134a() {
        return this.f17091g;
    }

    /* renamed from: b */
    public final void m20135b(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12) {
        this.f17090f = i11;
        this.f17088d = iArr;
        this.f17089e = iArr2;
        this.f17086b = bArr;
        this.f17085a = bArr2;
        this.f17087c = 1;
        int i13 = AbstractC4916qo.f26898a;
        if (i13 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f17091g;
            cryptoInfo.numSubSamples = i11;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i13 >= 24) {
                C5244zi.m28513a(this.f17092h, 0, 0);
            }
        }
    }
}
