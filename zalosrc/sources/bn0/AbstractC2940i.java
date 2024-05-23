package bn0;

import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import on0.C24321d;
import qm0.AbstractC25356m;

/* renamed from: bn0.i */
/* loaded from: classes7.dex */
public abstract class AbstractC2940i extends AbstractC2939h {
    /* renamed from: c */
    public static byte[] m13916c(File file) {
        AbstractC19074t.m100208f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i11 = (int) length;
                byte[] bArr = new byte[i11];
                int i12 = i11;
                int i13 = 0;
                while (i12 > 0) {
                    int read = fileInputStream.read(bArr, i13, i12);
                    if (read < 0) {
                        break;
                    }
                    i12 -= read;
                    i13 += read;
                }
                if (i12 > 0) {
                    bArr = Arrays.copyOf(bArr, i13);
                    AbstractC19074t.m100207e(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        C2935d c2935d = new C2935d(8193);
                        c2935d.write(read2);
                        AbstractC2932a.m13888b(fileInputStream, c2935d, 0, 2, null);
                        int size = c2935d.size() + i11;
                        if (size >= 0) {
                            byte[] m13893a = c2935d.m13893a();
                            byte[] copyOf = Arrays.copyOf(bArr, size);
                            AbstractC19074t.m100207e(copyOf, "copyOf(...)");
                            bArr = AbstractC25356m.m131321d(m13893a, copyOf, i11, 0, c2935d.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                AbstractC2933b.m13890a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    /* renamed from: d */
    public static final String m13917d(File file, Charset charset) {
        AbstractC19074t.m100208f(file, "<this>");
        AbstractC19074t.m100208f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m13931c = AbstractC2943l.m13931c(inputStreamReader);
            AbstractC2933b.m13890a(inputStreamReader, null);
            return m13931c;
        } finally {
        }
    }

    /* renamed from: e */
    public static /* synthetic */ String m13918e(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = C24321d.f117408b;
        }
        return m13917d(file, charset);
    }
}
