package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.yb */
/* loaded from: classes.dex */
final class C5699yb extends AbstractC5682xb {
    @Override // com.google.android.gms.internal.measurement.AbstractC5682xb
    /* renamed from: a */
    final int mo30028a(int i11, byte[] bArr, int i12, int i13) {
        while (i12 < i13 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i13) {
            return 0;
        }
        while (i12 < i13) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 < 0) {
                if (b11 < -32) {
                    if (i14 >= i13) {
                        return b11;
                    }
                    if (b11 >= -62) {
                        i12 += 2;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                if (b11 < -16) {
                    if (i14 >= i13 - 1) {
                        return AbstractC5292ac.m28886a(bArr, i14, i13);
                    }
                    int i15 = i12 + 2;
                    byte b12 = bArr[i14];
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        i12 += 3;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                if (i14 >= i13 - 2) {
                    return AbstractC5292ac.m28886a(bArr, i14, i13);
                }
                int i16 = i12 + 2;
                byte b13 = bArr[i14];
                if (b13 <= -65 && (((b11 << 28) + (b13 + 112)) >> 30) == 0) {
                    int i17 = i12 + 3;
                    if (bArr[i16] <= -65) {
                        i12 += 4;
                        if (bArr[i17] > -65) {
                        }
                    }
                }
                return -1;
            }
            i12 = i14;
        }
        return 0;
    }
}
