package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class ir3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte[] m23383a(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static byte[] m23384b(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < 16; i11++) {
                byte b11 = bArr[i11];
                byte b12 = (byte) ((b11 + b11) & 254);
                bArr2[i11] = b12;
                if (i11 < 15) {
                    bArr2[i11] = (byte) (((bArr[i11 + 1] >> 7) & 1) | b12);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
