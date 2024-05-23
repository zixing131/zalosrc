package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class hi3 {

    /* renamed from: a */
    public byte[] f21768a;

    /* renamed from: b */
    public byte[] f21769b;

    /* renamed from: c */
    public int f21770c;

    /* renamed from: d */
    public int[] f21771d;

    /* renamed from: e */
    public int[] f21772e;

    /* renamed from: f */
    public int f21773f;

    /* renamed from: g */
    public int f21774g;

    /* renamed from: h */
    public int f21775h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f21776i;

    /* renamed from: j */
    private final gh3 f21777j;

    public hi3() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f21776i = cryptoInfo;
        this.f21777j = g92.f20474a >= 24 ? new gh3(cryptoInfo, null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo m22905a() {
        return this.f21776i;
    }

    /* renamed from: b */
    public final void m22906b(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f21771d == null) {
            int[] iArr = new int[1];
            this.f21771d = iArr;
            this.f21776i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f21771d;
        iArr2[0] = iArr2[0] + i11;
    }

    /* renamed from: c */
    public final void m22907c(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        this.f21773f = i11;
        this.f21771d = iArr;
        this.f21772e = iArr2;
        this.f21769b = bArr;
        this.f21768a = bArr2;
        this.f21770c = i12;
        this.f21774g = i13;
        this.f21775h = i14;
        MediaCodec.CryptoInfo cryptoInfo = this.f21776i;
        cryptoInfo.numSubSamples = i11;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i12;
        if (g92.f20474a >= 24) {
            gh3 gh3Var = this.f21777j;
            gh3Var.getClass();
            gh3.m22440a(gh3Var, i13, i14);
        }
    }
}
