package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class ms3 {

    /* renamed from: a */
    private static final ThreadLocal f24736a = new ls3();

    /* renamed from: a */
    public static byte[] m24706a(int i11) {
        byte[] bArr = new byte[i11];
        ((SecureRandom) f24736a.get()).nextBytes(bArr);
        return bArr;
    }
}
