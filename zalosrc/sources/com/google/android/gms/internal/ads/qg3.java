package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class qg3 {

    /* renamed from: a */
    int[] f26771a;

    /* renamed from: b */
    private final int f26772b;

    public qg3(byte[] bArr, int i11) {
        if (bArr.length == 32) {
            this.f26771a = mg3.m24566d(bArr);
            this.f26772b = i11;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: f */
    private final void m25707f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == mo25462a()) {
            int remaining = byteBuffer2.remaining();
            int i11 = remaining / 64;
            int i12 = i11 + 1;
            for (int i13 = 0; i13 < i12; i13++) {
                ByteBuffer m25708c = m25708c(bArr, this.f26772b + i13);
                if (i13 == i11) {
                    jr3.m23726a(byteBuffer, byteBuffer2, m25708c, remaining % 64);
                } else {
                    jr3.m23726a(byteBuffer, byteBuffer2, m25708c, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo25462a());
    }

    /* renamed from: a */
    abstract int mo25462a();

    /* renamed from: b */
    abstract int[] mo25463b(int[] iArr, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final ByteBuffer m25708c(byte[] bArr, int i11) {
        int[] mo25463b = mo25463b(mg3.m24566d(bArr), i11);
        int[] iArr = (int[]) mo25463b.clone();
        mg3.m24565c(iArr);
        for (int i12 = 0; i12 < 16; i12++) {
            mo25463b[i12] = mo25463b[i12] + iArr[i12];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(mo25463b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final void m25709d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr2.length) {
            m25707f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: e */
    public final byte[] m25710e(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        m25707f(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
