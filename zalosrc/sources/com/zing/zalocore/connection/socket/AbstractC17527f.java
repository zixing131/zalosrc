package com.zing.zalocore.connection.socket;

import android.util.Base64;

/* renamed from: com.zing.zalocore.connection.socket.f */
/* loaded from: classes7.dex */
public abstract class AbstractC17527f {
    /* renamed from: a */
    public static String m93437a(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static byte[] m93438b(byte[] bArr, int i11) {
        return m93445i(bArr, m93444h(i11));
    }

    /* renamed from: c */
    public static byte[] m93439c(byte[] bArr, int i11, int i12) {
        return m93445i(m93445i(bArr, m93444h(i11)), m93444h(i12));
    }

    /* renamed from: d */
    public static byte[] m93440d(byte[] bArr, byte[] bArr2, int i11, int i12) {
        return m93445i(bArr, m93439c(bArr2, i11, i12));
    }

    /* renamed from: e */
    public static String m93441e(String str, String str2) {
        return m93437a(m93445i(str.getBytes(), str2.getBytes()));
    }

    /* renamed from: f */
    public static byte[] m93442f(byte[] bArr, byte[] bArr2, int i11) {
        return m93445i(bArr, m93438b(bArr2, i11));
    }

    /* renamed from: g */
    public static byte[] m93443g(byte[] bArr, byte[] bArr2, int i11, int i12) {
        return m93445i(bArr, m93439c(bArr2, i11, i12));
    }

    /* renamed from: h */
    public static byte[] m93444h(int i11) {
        return new byte[]{(byte) (i11 & 255), (byte) ((i11 >>> 8) & 255), (byte) ((i11 >>> 16) & 255), (byte) ((i11 >>> 24) & 255)};
    }

    /* renamed from: i */
    public static byte[] m93445i(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 % bArr2.length]);
        }
        return bArr3;
    }
}
