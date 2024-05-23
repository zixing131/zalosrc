package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class jr3 {
    /* renamed from: a */
    public static final void m23726a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11) {
        if (i11 >= 0 && byteBuffer2.remaining() >= i11 && byteBuffer3.remaining() >= i11 && byteBuffer.remaining() >= i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    /* renamed from: b */
    public static final boolean m23727b(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i11 = 0;
            for (int i12 = 0; i12 < bArr.length; i12++) {
                i11 |= bArr[i12] ^ bArr2[i12];
            }
            if (i11 == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static byte[] m23728c(byte[]... bArr) {
        int i11 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i11 <= Integer.MAX_VALUE - length) {
                i11 += length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i11];
        int i12 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i12, length2);
            i12 += length2;
        }
        return bArr3;
    }

    /* renamed from: d */
    public static final byte[] m23729d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return m23730e(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: e */
    public static final byte[] m23730e(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        if (bArr.length - i13 >= i11 && bArr2.length - i13 >= i12) {
            byte[] bArr3 = new byte[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                bArr3[i14] = (byte) (bArr[i14 + i11] ^ bArr2[i14 + i12]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
}
