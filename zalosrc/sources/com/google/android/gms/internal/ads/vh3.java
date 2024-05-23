package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
final class vh3 implements xh3 {
    @Override // com.google.android.gms.internal.ads.xh3
    /* renamed from: a */
    public final byte[] mo26966a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new rg3(bArr).m26303d(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // com.google.android.gms.internal.ads.xh3
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.xh3
    public final byte[] zzb() {
        return li3.f23942k;
    }
}
