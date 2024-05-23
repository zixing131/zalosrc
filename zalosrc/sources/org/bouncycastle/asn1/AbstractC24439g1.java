package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.bouncycastle.asn1.g1 */
/* loaded from: classes7.dex */
public abstract class AbstractC24439g1 {

    /* renamed from: a */
    private static final long f117968a = Runtime.getRuntime().maxMemory();

    /* renamed from: a */
    public static int m127763a(int i11) {
        int i12 = 1;
        if (i11 > 127) {
            int i13 = 1;
            while (true) {
                i11 >>>= 8;
                if (i11 == 0) {
                    break;
                }
                i13++;
            }
            for (int i14 = (i13 - 1) * 8; i14 >= 0; i14 -= 8) {
                i12++;
            }
        }
        return i12;
    }

    /* renamed from: b */
    public static int m127764b(int i11) {
        if (i11 < 31) {
            return 1;
        }
        if (i11 < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i12 = 4;
        bArr[4] = (byte) (i11 & 127);
        do {
            i11 >>= 7;
            i12--;
            bArr[i12] = (byte) ((i11 & 127) | 128);
        } while (i11 > 127);
        return 6 - i12;
    }

    /* renamed from: c */
    public static int m127765c(InputStream inputStream) {
        if (inputStream instanceof AbstractC24436f1) {
            return ((AbstractC24436f1) inputStream).mo127719a();
        }
        if (inputStream instanceof C24428d) {
            return ((C24428d) inputStream).m127735i();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j11 = f117968a;
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j11;
    }
}
