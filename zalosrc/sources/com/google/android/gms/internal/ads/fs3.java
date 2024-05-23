package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class fs3 {
    /* renamed from: a */
    public static String m22159a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b11 : bArr) {
            sb2.append("0123456789abcdef".charAt((b11 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b11 & 15));
        }
        return sb2.toString();
    }
}
