package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.ar */
/* loaded from: classes2.dex */
public final class C4327ar extends AbstractC4955rq {

    /* renamed from: c */
    private MessageDigest f17233c;

    /* renamed from: d */
    private final int f17234d;

    /* renamed from: e */
    private final int f17235e;

    public C4327ar(int i11) {
        int i12 = i11 >> 3;
        this.f17234d = (i11 & 7) > 0 ? i12 + 1 : i12;
        this.f17235e = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4955rq
    /* renamed from: b */
    public final byte[] mo20225b(String str) {
        synchronized (this.f27343a) {
            try {
                MessageDigest m26152a = m26152a();
                this.f17233c = m26152a;
                if (m26152a == null) {
                    return new byte[0];
                }
                m26152a.reset();
                this.f17233c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.f17233c.digest();
                int length = digest.length;
                int i11 = this.f17234d;
                if (length > i11) {
                    length = i11;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                if ((this.f17235e & 7) > 0) {
                    long j11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (i12 > 0) {
                            j11 <<= 8;
                        }
                        j11 += bArr[i12] & 255;
                    }
                    long j12 = j11 >>> (8 - (this.f17235e & 7));
                    int i13 = this.f17234d;
                    while (true) {
                        i13--;
                        if (i13 < 0) {
                            break;
                        }
                        bArr[i13] = (byte) (255 & j12);
                        j12 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
