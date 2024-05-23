package p229i5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: i5.l */
/* loaded from: classes.dex */
public abstract class AbstractC20291l {
    /* renamed from: a */
    public static void m105939a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static long m105940b(InputStream inputStream, OutputStream outputStream) {
        return m105941c(inputStream, outputStream, false, 1024);
    }

    /* renamed from: c */
    public static long m105941c(InputStream inputStream, OutputStream outputStream, boolean z11, int i11) {
        byte[] bArr = new byte[i11];
        long j11 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i11);
                if (read == -1) {
                    break;
                }
                j11 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                if (z11) {
                    m105939a(inputStream);
                    m105939a(outputStream);
                }
                throw th2;
            }
        }
        if (z11) {
            m105939a(inputStream);
            m105939a(outputStream);
        }
        return j11;
    }

    /* renamed from: d */
    public static byte[] m105942d(InputStream inputStream) {
        return m105943e(inputStream, true);
    }

    /* renamed from: e */
    public static byte[] m105943e(InputStream inputStream, boolean z11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m105941c(inputStream, byteArrayOutputStream, z11, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
