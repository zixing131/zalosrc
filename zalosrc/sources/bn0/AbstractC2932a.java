package bn0;

import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: bn0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC2932a {
    /* renamed from: a */
    public static final long m13887a(InputStream inputStream, OutputStream outputStream, int i11) {
        AbstractC19074t.m100208f(inputStream, "<this>");
        AbstractC19074t.m100208f(outputStream, "out");
        byte[] bArr = new byte[i11];
        int read = inputStream.read(bArr);
        long j11 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j11 += read;
            read = inputStream.read(bArr);
        }
        return j11;
    }

    /* renamed from: b */
    public static /* synthetic */ long m13888b(InputStream inputStream, OutputStream outputStream, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        return m13887a(inputStream, outputStream, i11);
    }

    /* renamed from: c */
    public static final byte[] m13889c(InputStream inputStream) {
        AbstractC19074t.m100208f(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m13888b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC19074t.m100207e(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
