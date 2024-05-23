package p232i8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: i8.a0 */
/* loaded from: classes3.dex */
abstract class AbstractC20382a0 {
    /* renamed from: a */
    private static void m106169a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        AbstractC20395h.m106210f(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC20395h.m106210f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m106170b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC20425z interfaceC20425z = (InterfaceC20425z) it.next();
            InputStream inputStream = null;
            try {
                inputStream = interfaceC20425z.mo106193c();
                if (inputStream != null) {
                    m106169a(inputStream, new File(file, interfaceC20425z.mo106192b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                AbstractC20395h.m106210f(null);
                throw th2;
            }
            AbstractC20395h.m106210f(inputStream);
        }
    }
}
