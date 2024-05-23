package eo0;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: eo0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC18530a {

    /* renamed from: a */
    private static int f93206a = 512;

    /* renamed from: a */
    public static void m97918a(InputStream inputStream, OutputStream outputStream) {
        int i11 = f93206a;
        byte[] bArr = new byte[i11];
        while (true) {
            int read = inputStream.read(bArr, 0, i11);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: b */
    public static byte[] m97919b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m97918a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public static int m97920c(InputStream inputStream, byte[] bArr) {
        return m97921d(inputStream, bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static int m97921d(InputStream inputStream, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int read = inputStream.read(bArr, i11 + i13, i12 - i13);
            if (read < 0) {
                break;
            }
            i13 += read;
        }
        return i13;
    }
}
