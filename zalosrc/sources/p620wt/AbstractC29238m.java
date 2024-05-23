package p620wt;

import bn0.AbstractC2933b;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: wt.m */
/* loaded from: classes4.dex */
public abstract class AbstractC29238m {
    /* renamed from: a */
    public static final void m145997a(InputStream inputStream, OutputStream outputStream) {
        AbstractC19074t.m100208f(inputStream, "inputStream");
        AbstractC19074t.m100208f(outputStream, "outputStream");
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* renamed from: b */
    public static final boolean m145998b(InputStream inputStream, OutputStream outputStream) {
        AbstractC19074t.m100208f(inputStream, "inputStream");
        AbstractC19074t.m100208f(outputStream, "outputStream");
        try {
            try {
                m145997a(inputStream, outputStream);
                AbstractC29237l.m145996a(inputStream);
                AbstractC29237l.m145996a(outputStream);
                return true;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                AbstractC29237l.m145996a(inputStream);
                AbstractC29237l.m145996a(outputStream);
                return false;
            }
        } catch (Throwable th2) {
            AbstractC29237l.m145996a(inputStream);
            AbstractC29237l.m145996a(outputStream);
            throw th2;
        }
    }

    /* renamed from: c */
    public static final void m145999c(InputStream inputStream, OutputStream outputStream) {
        AbstractC19074t.m100208f(inputStream, "inputStream");
        AbstractC19074t.m100208f(outputStream, "outputStream");
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                AbstractC29237l.m145996a(inputStream);
                AbstractC29237l.m145996a(outputStream);
                return;
            }
        }
    }

    /* renamed from: d */
    public static final byte[] m146000d(InputStream inputStream) {
        AbstractC19074t.m100208f(inputStream, "stream");
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 8192);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC2933b.m13890a(bufferedInputStream, null);
                        return byteArray;
                    }
                }
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: e */
    public static final String m146001e(InputStream inputStream) {
        AbstractC19074t.m100208f(inputStream, "stream");
        try {
            byte[] m146000d = m146000d(inputStream);
            if (m146000d == null) {
                return "";
            }
            Charset forName = Charset.forName("utf8");
            AbstractC19074t.m100207e(forName, "Charset.forName(charsetName)");
            return new String(m146000d, forName);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }
}
