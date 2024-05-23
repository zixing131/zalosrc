package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
final class uh3 implements xh3 {

    /* renamed from: a */
    private final int f28918a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uh3(int i11) {
        if (i11 != 16 && i11 != 32) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i11);
        }
        this.f28918a = i11;
    }

    @Override // com.google.android.gms.internal.ads.xh3
    /* renamed from: a */
    public final byte[] mo26966a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f28918a) {
            return new og3(bArr, false).m25180b(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    @Override // com.google.android.gms.internal.ads.xh3
    public final int zza() {
        return this.f28918a;
    }

    @Override // com.google.android.gms.internal.ads.xh3
    public final byte[] zzb() {
        int i11 = this.f28918a;
        if (i11 != 16) {
            if (i11 == 32) {
                return li3.f23941j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return li3.f23940i;
    }
}
