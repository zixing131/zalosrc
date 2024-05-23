package androidx.profileinstaller;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: androidx.profileinstaller.f */
/* loaded from: classes2.dex */
abstract class AbstractC1850f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m9550a(int i11) {
        return ((i11 + 7) & (-8)) / 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static byte[] m9551b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static RuntimeException m9552c(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static byte[] m9553d(InputStream inputStream, int i11) {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
            } else {
                throw m9552c("Not enough bytes to read: " + i11);
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:            if (r0.finished() == false) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:            throw m9552c("Inflater did not finish");     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m9554e(InputStream inputStream, int i11, int i12) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[ZVideoUtilMetadata.FF_PROFILE_H264_INTRA];
            int i13 = 0;
            int i14 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i13 < i11) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i14 += inflater.inflate(bArr, i14, i12 - i14);
                        i13 += read;
                    } catch (DataFormatException e11) {
                        throw m9552c(e11.getMessage());
                    }
                } else {
                    throw m9552c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i11 + " bytes");
                }
            }
            throw m9552c("Didn't read enough bytes during decompression. expected=" + i11 + " actual=" + i13);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m9555f(InputStream inputStream, int i11) {
        return new String(m9553d(inputStream, i11), StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    static long m9556g(InputStream inputStream, int i11) {
        byte[] m9553d = m9553d(inputStream, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 += (m9553d[i12] & 255) << (i12 * 8);
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m9557h(InputStream inputStream) {
        return (int) m9556g(inputStream, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m9558i(InputStream inputStream) {
        return m9556g(inputStream, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m9559j(InputStream inputStream) {
        return (int) m9556g(inputStream, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m9560k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static void m9561l(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static void m9562m(OutputStream outputStream, byte[] bArr) {
        m9566q(outputStream, bArr.length);
        byte[] m9551b = m9551b(bArr);
        m9566q(outputStream, m9551b.length);
        outputStream.write(m9551b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static void m9563n(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: o */
    static void m9564o(OutputStream outputStream, long j11, int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((j11 >> (i12 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static void m9565p(OutputStream outputStream, int i11) {
        m9564o(outputStream, i11, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static void m9566q(OutputStream outputStream, long j11) {
        m9564o(outputStream, j11, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m9567r(OutputStream outputStream, int i11) {
        m9564o(outputStream, i11, 1);
    }
}
