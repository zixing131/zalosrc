package sg0;

import fn0.AbstractC19074t;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import on0.C24321d;
import p239ih.C20556f;
import pm0.AbstractC24866w;
import pm0.C24860q;
import qg0.AbstractC25270e;
import rg0.C25789b;

/* renamed from: sg0.c */
/* loaded from: classes7.dex */
public final class C26247c {

    /* renamed from: a */
    public static final C26247c f124659a = new C26247c();

    private C26247c() {
    }

    /* renamed from: h */
    private final C25789b m134966h() {
        return C25789b.Companion.m132927a();
    }

    /* renamed from: a */
    public final void m134967a(AbstractC25270e abstractC25270e, InputStream inputStream, OutputStream outputStream) {
        AbstractC19074t.m100208f(abstractC25270e, "key");
        AbstractC19074t.m100208f(inputStream, "input");
        AbstractC19074t.m100208f(outputStream, "output");
        m134966h().m132926a(abstractC25270e.m130786a()).mo132924a(abstractC25270e, inputStream, outputStream);
    }

    /* renamed from: b */
    public final void m134968b(AbstractC25270e abstractC25270e, String str, String str2) {
        OutputStream outputStream;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        AbstractC19074t.m100208f(abstractC25270e, "key");
        AbstractC19074t.m100208f(str, "inputPath");
        AbstractC19074t.m100208f(str2, "outputPath");
        C20556f c20556f = new C20556f(str);
        C20556f c20556f2 = new C20556f(str2);
        BufferedInputStream bufferedInputStream2 = null;
        try {
            InputStream m106838k = c20556f.m106838k();
            if (m106838k != null) {
                if (m106838k instanceof BufferedInputStream) {
                    bufferedInputStream = (BufferedInputStream) m106838k;
                } else {
                    bufferedInputStream = new BufferedInputStream(m106838k, 8192);
                }
                try {
                    OutputStream m106840m = c20556f2.m106840m();
                    if (m106840m != null) {
                        if (m106840m instanceof BufferedOutputStream) {
                            bufferedOutputStream = (BufferedOutputStream) m106840m;
                        } else {
                            bufferedOutputStream = new BufferedOutputStream(m106840m, 8192);
                        }
                        m134967a(abstractC25270e, bufferedInputStream, bufferedOutputStream);
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                        return;
                    }
                    throw new FileNotFoundException("Output file not found");
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        bufferedInputStream2.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            }
            throw new FileNotFoundException("Input file not found");
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    /* renamed from: c */
    public final byte[] m134969c(AbstractC25270e abstractC25270e, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream byteArrayInputStream;
        AbstractC19074t.m100208f(abstractC25270e, "key");
        AbstractC19074t.m100208f(bArr, "input");
        InputStream inputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            m134967a(abstractC25270e, byteArrayInputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC19074t.m100205c(byteArray);
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th4) {
            th = th4;
            inputStream = byteArrayInputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final String m134970d(AbstractC25270e abstractC25270e, byte[] bArr) {
        AbstractC19074t.m100208f(abstractC25270e, "key");
        AbstractC19074t.m100208f(bArr, "input");
        return new String(m134969c(abstractC25270e, bArr), C24321d.f117408b);
    }

    /* renamed from: e */
    public final C24860q m134971e(int i11, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream byteArrayInputStream;
        AbstractC19074t.m100208f(bArr, "input");
        InputStream inputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            C24860q m129235a = AbstractC24866w.m129235a(byteArrayOutputStream.toByteArray(), m134972f(i11, byteArrayInputStream, byteArrayOutputStream));
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            return m129235a;
        } catch (Throwable th4) {
            th = th4;
            inputStream = byteArrayInputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final AbstractC25270e m134972f(int i11, InputStream inputStream, OutputStream outputStream) {
        AbstractC19074t.m100208f(inputStream, "input");
        AbstractC19074t.m100208f(outputStream, "output");
        return m134966h().m132926a(i11).mo132925b(inputStream, outputStream);
    }

    /* renamed from: g */
    public final C24860q m134973g(int i11, String str) {
        AbstractC19074t.m100208f(str, "utf8");
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        return m134971e(i11, bytes);
    }
}
