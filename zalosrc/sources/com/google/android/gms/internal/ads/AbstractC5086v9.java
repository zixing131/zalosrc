package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.v9 */
/* loaded from: classes2.dex */
public abstract class AbstractC5086v9 {
    /* renamed from: a */
    public static double m27185a(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 1.073741824E9d;
    }

    /* renamed from: b */
    public static double m27186b(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 65536.0d;
    }

    /* renamed from: c */
    public static int m27187c(byte b11) {
        return b11 < 0 ? b11 + 256 : b11;
    }

    /* renamed from: d */
    public static int m27188d(ByteBuffer byteBuffer) {
        return (m27187c(byteBuffer.get()) << 8) + m27187c(byteBuffer.get());
    }

    /* renamed from: e */
    public static long m27189e(ByteBuffer byteBuffer) {
        long j11 = byteBuffer.getInt();
        if (j11 < 0) {
            return j11 + 4294967296L;
        }
        return j11;
    }

    /* renamed from: f */
    public static long m27190f(ByteBuffer byteBuffer) {
        long m27189e = m27189e(byteBuffer) << 32;
        if (m27189e >= 0) {
            return m27189e + m27189e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
