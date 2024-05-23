package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.wq */
/* loaded from: classes2.dex */
public final class C5141wq extends AbstractC4955rq {

    /* renamed from: c */
    private MessageDigest f30063c;

    @Override // com.google.android.gms.internal.ads.AbstractC4955rq
    /* renamed from: b */
    public final byte[] mo20225b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i11 = 4;
        if (length == 1) {
            int m27332a = AbstractC5103vq.m27332a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(m27332a);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i12 = 0; i12 < split.length; i12++) {
                    int m27332a2 = AbstractC5103vq.m27332a(split[i12]);
                    int i13 = (m27332a2 >> 16) ^ ((char) m27332a2);
                    byte b11 = (byte) i13;
                    byte[] bArr3 = {b11, (byte) (i13 >> 8)};
                    int i14 = i12 + i12;
                    bArr[i14] = b11;
                    bArr[i14 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[length];
                for (int i15 = 0; i15 < split.length; i15++) {
                    int m27332a3 = AbstractC5103vq.m27332a(split[i15]);
                    bArr[i15] = (byte) ((m27332a3 >> 24) ^ (((m27332a3 & 255) ^ ((m27332a3 >> 8) & 255)) ^ ((m27332a3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f30063c = m26152a();
        synchronized (this.f27343a) {
            try {
                MessageDigest messageDigest = this.f30063c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f30063c.update(bArr2);
                byte[] digest = this.f30063c.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i11 = length2;
                }
                byte[] bArr4 = new byte[i11];
                System.arraycopy(digest, 0, bArr4, 0, i11);
                return bArr4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
