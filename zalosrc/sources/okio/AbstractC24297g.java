package okio;

import java.nio.charset.Charset;

/* renamed from: okio.g */
/* loaded from: classes7.dex */
abstract class AbstractC24297g {

    /* renamed from: a */
    public static final Charset f117296a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static boolean m126838a(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (bArr[i14 + i11] != bArr2[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m126839b(long j11, long j12, long j13) {
        if ((j12 | j13) >= 0 && j12 <= j11 && j11 - j12 >= j13) {
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)));
        }
    }
}
