package p232i8;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p292k8.AbstractC21569b0;

/* renamed from: i8.v */
/* loaded from: classes3.dex */
class C20421v implements InterfaceC20425z {

    /* renamed from: a */
    private final File f100581a;

    /* renamed from: b */
    private final String f100582b;

    /* renamed from: c */
    private final String f100583c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20421v(String str, String str2, File file) {
        this.f100582b = str;
        this.f100583c = str2;
        this.f100581a = file;
    }

    /* renamed from: d */
    private byte[] m106419d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo106193c = mo106193c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (mo106193c == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (mo106193c != null) {
                            mo106193c.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = mo106193c.read(bArr);
                            if (read > 0) {
                                gZIPOutputStream.write(bArr, 0, read);
                            } else {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                mo106193c.close();
                                return byteArray;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p232i8.InterfaceC20425z
    /* renamed from: a */
    public AbstractC21569b0.d.b mo106191a() {
        byte[] m106419d = m106419d();
        if (m106419d != null) {
            return AbstractC21569b0.d.b.m111303a().mo111307b(m106419d).mo111308c(this.f100582b).mo111306a();
        }
        return null;
    }

    @Override // p232i8.InterfaceC20425z
    /* renamed from: b */
    public String mo106192b() {
        return this.f100583c;
    }

    @Override // p232i8.InterfaceC20425z
    /* renamed from: c */
    public InputStream mo106193c() {
        if (this.f100581a.exists() && this.f100581a.isFile()) {
            try {
                return new FileInputStream(this.f100581a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
