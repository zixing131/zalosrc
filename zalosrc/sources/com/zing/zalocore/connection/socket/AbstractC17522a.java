package com.zing.zalocore.connection.socket;

/* renamed from: com.zing.zalocore.connection.socket.a */
/* loaded from: classes.dex */
public abstract class AbstractC17522a {
    /* renamed from: a */
    public static double m93338a(byte[] bArr, int i11) {
        return m93348k(bArr, i11);
    }

    /* renamed from: b */
    public static int m93339b(byte[] bArr) {
        return (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16) + ((bArr[3] & 255) << 24);
    }

    /* renamed from: c */
    public static long m93340c(byte[] bArr) {
        return (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16) + ((bArr[3] & 255) << 24) + ((bArr[4] & 255) << 32) + ((bArr[5] & 255) << 40) + ((bArr[6] & 255) << 48) + ((255 & bArr[7]) << 56);
    }

    /* renamed from: d */
    public static long m93341d(byte[] bArr, int i11) {
        return m93350m(bArr, i11);
    }

    /* renamed from: e */
    public static byte[] m93342e(double d11) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d11);
        return new byte[]{(byte) (doubleToRawLongBits & 255), (byte) ((doubleToRawLongBits >>> 8) & 255), (byte) ((doubleToRawLongBits >>> 16) & 255), (byte) ((doubleToRawLongBits >>> 24) & 255), (byte) ((doubleToRawLongBits >>> 32) & 255), (byte) ((doubleToRawLongBits >>> 40) & 255), (byte) ((doubleToRawLongBits >>> 48) & 255), (byte) ((doubleToRawLongBits >>> 56) & 255)};
    }

    /* renamed from: f */
    public static String m93343f(String str) {
        if (str.length() == 3) {
            return new String(str + " ");
        }
        if (str.length() == 2) {
            return new String(str + "  ");
        }
        return str;
    }

    /* renamed from: g */
    public static byte[] m93344g(int i11) {
        return new byte[]{(byte) (i11 & 255), (byte) ((i11 >>> 8) & 255), (byte) ((i11 >>> 16) & 255), (byte) ((i11 >>> 24) & 255)};
    }

    /* renamed from: h */
    public static byte[] m93345h(int i11) {
        return new byte[]{(byte) (i11 & 255), (byte) ((i11 >>> 8) & 255)};
    }

    /* renamed from: i */
    public static byte[] m93346i(long j11) {
        return new byte[]{(byte) (j11 & 255), (byte) ((j11 >>> 8) & 255), (byte) ((j11 >>> 16) & 255), (byte) ((j11 >>> 24) & 255), (byte) ((j11 >>> 32) & 255), (byte) ((j11 >>> 40) & 255), (byte) ((j11 >>> 48) & 255), (byte) ((j11 >>> 56) & 255)};
    }

    /* renamed from: j */
    public static int m93347j(byte[] bArr, int i11) {
        return bArr[i11] & 255;
    }

    /* renamed from: k */
    public static double m93348k(byte[] bArr, int i11) {
        return Double.longBitsToDouble(m93350m(bArr, i11));
    }

    /* renamed from: l */
    public static int m93349l(byte[] bArr, int i11) {
        return (bArr[i11] & 255) + ((bArr[i11 + 1] & 255) << 8) + ((bArr[i11 + 2] & 255) << 16) + ((bArr[i11 + 3] & 255) << 24);
    }

    /* renamed from: m */
    public static long m93350m(byte[] bArr, int i11) {
        return (bArr[i11] & 255) + ((bArr[i11 + 1] & 255) << 8) + ((bArr[i11 + 2] & 255) << 16) + ((bArr[i11 + 3] & 255) << 24) + ((bArr[i11 + 4] & 255) << 32) + ((bArr[i11 + 5] & 255) << 40) + ((bArr[i11 + 6] & 255) << 48) + ((bArr[i11 + 7] & 255) << 56);
    }

    /* renamed from: n */
    public static short m93351n(byte[] bArr, int i11) {
        return (short) ((bArr[i11] & 255) + ((bArr[i11 + 1] & 255) << 8));
    }
}
