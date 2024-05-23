package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes2.dex */
abstract class sg3 {

    /* renamed from: a */
    private final qg3 f27671a;

    /* renamed from: b */
    private final qg3 f27672b;

    public sg3(byte[] bArr) {
        if (yg3.m28203a(1)) {
            this.f27671a = mo26080a(bArr, 1);
            this.f27672b = mo26080a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: e */
    private final byte[] m26299e(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f27672b.m25708c(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: f */
    private static byte[] m26300f(byte[] bArr, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        int length = bArr.length;
        int i13 = length & 15;
        if (i13 == 0) {
            i11 = length;
        } else {
            i11 = (length + 16) - i13;
        }
        int remaining = byteBuffer.remaining();
        int i14 = remaining % 16;
        if (i14 == 0) {
            i12 = remaining;
        } else {
            i12 = (remaining + 16) - i14;
        }
        int i15 = i12 + i11;
        ByteBuffer order = ByteBuffer.allocate(i15 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i11);
        order.put(byteBuffer);
        order.position(i15);
        order.putLong(length);
        order.putLong(remaining);
        return order.array();
    }

    /* renamed from: a */
    abstract qg3 mo26080a(byte[] bArr, int i11);

    /* renamed from: b */
    public final void m26301b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.f27671a.m25709d(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] m27220a = vg3.m27220a(m26299e(bArr), m26300f(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(m27220a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: c */
    public final byte[] m26302c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                if (jr3.m23727b(vg3.m27220a(m26299e(bArr), m26300f(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    return this.f27671a.m25710e(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e11) {
                throw new AEADBadTagException(e11.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] m26303d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr2.length;
        if (length <= 2147483631) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            m26301b(allocate, bArr, bArr2, bArr3);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
