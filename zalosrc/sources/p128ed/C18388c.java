package p128ed;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import p620wt.AbstractC29237l;

/* renamed from: ed.c */
/* loaded from: classes3.dex */
public final class C18388c {

    /* renamed from: a */
    public static final C18388c f92779a = new C18388c();

    private C18388c() {
    }

    /* renamed from: a */
    private final void m97390a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public final String m97391b() {
        String m104966n = C20131e.f99303a.m104966n();
        m97390a(m104966n);
        return m104966n;
    }

    /* renamed from: c */
    public final String m97392c() {
        String str = C20131e.f99303a.m104950e0() + "upload_drive/";
        m97390a(str);
        return str;
    }

    /* renamed from: d */
    public final long m97393d(String str) {
        AbstractC19074t.m100208f(str, "localPath");
        if (str.length() > 0) {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    return 0L;
                }
                return file.length();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return 0L;
    }

    /* renamed from: e */
    public final long m97394e(String str) {
        AbstractC19074t.m100208f(str, "pathOut");
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    /* renamed from: f */
    public final String m97395f(String str) {
        AbstractC19074t.m100208f(str, "localPath");
        if (str.length() > 0) {
            try {
                String name = new File(str).getName();
                AbstractC19074t.m100207e(name, "getName(...)");
                return name;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return "";
            }
        }
        return "";
    }

    /* renamed from: g */
    public final String m97396g(String str) {
        AbstractC19074t.m100208f(str, "zipName");
        return m97391b() + C18390e.f92781a.m97421l(str);
    }

    /* renamed from: h */
    public final String m97397h(String str) {
        AbstractC19074t.m100208f(str, "zipName");
        return m97392c() + C18390e.f92781a.m97421l(str);
    }

    /* renamed from: i */
    public final boolean m97398i(String str) {
        AbstractC19074t.m100208f(str, "localPath");
        if (str.length() > 0) {
            try {
                return new File(str).exists();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void m97399j(InputStream inputStream, String str) {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        AbstractC19074t.m100208f(inputStream, "inStreamZipEntry");
        AbstractC19074t.m100208f(str, "pathOutput");
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str)));
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
            } catch (FileNotFoundException e11) {
                e = e11;
                bufferedInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            bufferedInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    AbstractC29237l.m145996a(bufferedOutputStream);
                    AbstractC29237l.m145996a(bufferedInputStream);
                    return;
                }
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                aVar.m104564x("ENOENT_CHECK").mo104556o(8, "Crash at timestamp: %d", Long.valueOf(System.currentTimeMillis()));
                aVar.m104564x("ENOENT_CHECK").mo104556o(8, "Directory exist: %s", String.valueOf(new File(AbstractC20130d.m104873h0(false)).exists()));
                aVar.m104564x("ENOENT_CHECK").mo104556o(8, "File exist: %s", String.valueOf(new File(str).exists()));
                throw e;
            } catch (Throwable th4) {
                th = th4;
                AbstractC29237l.m145996a(bufferedOutputStream2);
                AbstractC29237l.m145996a(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream2 = bufferedOutputStream;
            AbstractC29237l.m145996a(bufferedOutputStream2);
            AbstractC29237l.m145996a(bufferedInputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* renamed from: k */
    public final void m97400k(List list, List list2, String str) {
        AbstractC19074t.m100208f(list, "listZipEntryPath");
        AbstractC19074t.m100208f(list2, "listZipEntryName");
        AbstractC19074t.m100208f(str, "zipPathOut");
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File(str))));
                try {
                    byte[] bArr = new byte[4096];
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str2 = (String) list.get(i11);
                        String str3 = (String) list2.get(i11);
                        try {
                            ?? bufferedInputStream = new BufferedInputStream(new FileInputStream(str2));
                            try {
                                zipOutputStream2.putNextEntry(new ZipEntry(str3));
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read != -1) {
                                        zipOutputStream2.write(bArr, 0, read);
                                    }
                                }
                                AbstractC29237l.m145996a(bufferedInputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                zipOutputStream = bufferedInputStream;
                                AbstractC29237l.m145996a(zipOutputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    AbstractC29237l.m145996a(zipOutputStream2);
                } catch (FileNotFoundException e11) {
                    e = e11;
                    zipOutputStream = zipOutputStream2;
                    AbstractC20110a.f98889a.mo104552e(e);
                    AbstractC29237l.m145996a(zipOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    zipOutputStream = zipOutputStream2;
                    AbstractC29237l.m145996a(zipOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException e12) {
                e = e12;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
