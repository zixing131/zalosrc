package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class yj3 {
    /* renamed from: a */
    public static int m28222a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i11 = 0;
        while (i11 == 0) {
            secureRandom.nextBytes(bArr);
            i11 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i11;
    }
}
