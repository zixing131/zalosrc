package mm0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import me0.AbstractC23238v2;

/* renamed from: mm0.c */
/* loaded from: classes7.dex */
public class C23348c {

    /* renamed from: a */
    private File f113565a;

    /* renamed from: b */
    private File f113566b;

    /* renamed from: c */
    private int f113567c;

    /* renamed from: d */
    private int f113568d;

    /* renamed from: e */
    private int f113569e;

    public C23348c(File file, File file2, int i11, int i12) {
        this.f113565a = file;
        this.f113567c = i11;
        this.f113568d = i12;
        this.f113566b = file2;
        this.f113569e = i11 * i12;
    }

    /* renamed from: a */
    public byte[] m122761a(int i11) {
        byte[] bArr;
        FileInputStream fileInputStream;
        File file = this.f113565a;
        if (file != null && file.exists()) {
            try {
                if (i11 > 0) {
                    long length = this.f113565a.length();
                    int i12 = this.f113568d;
                    if (length > i11 * i12) {
                        bArr = new byte[i11 * i12];
                        fileInputStream = new FileInputStream(this.f113565a);
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        return bArr;
                    }
                }
                fileInputStream.read(bArr);
                fileInputStream.close();
                return bArr;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
            bArr = new byte[(int) this.f113565a.length()];
            fileInputStream = new FileInputStream(this.f113565a);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public void m122762b(int i11) {
        FileInputStream fileInputStream;
        File file = this.f113565a;
        if (file != null && file.exists()) {
            long length = this.f113565a.length();
            int i12 = i11 * this.f113568d;
            if (i12 >= length) {
                new FileOutputStream(this.f113565a).close();
                return;
            }
            FileOutputStream fileOutputStream = null;
            try {
                AbstractC23238v2.m119717b(this.f113565a, this.f113566b);
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f113565a);
                try {
                    fileInputStream = new FileInputStream(this.f113566b);
                } catch (Exception unused) {
                    fileInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (fileInputStream.available() > 0) {
                        int i13 = 0;
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (i12 > 0) {
                            if (i12 >= read) {
                                i13 = i12 - read;
                                i12 = read;
                            }
                        } else {
                            i13 = i12;
                            i12 = 0;
                        }
                        if (i12 < read) {
                            fileOutputStream2.write(bArr, i12, read - i12);
                        }
                        i12 = i13;
                    }
                    fileOutputStream2.close();
                    fileInputStream.close();
                    File file2 = this.f113566b;
                    if (file2 == null || !file2.exists()) {
                        return;
                    }
                } catch (Exception unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    File file3 = this.f113566b;
                    if (file3 == null || !file3.exists()) {
                        return;
                    }
                    this.f113566b.delete();
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    File file4 = this.f113566b;
                    if (file4 != null && file4.exists()) {
                        this.f113566b.delete();
                    }
                    throw th;
                }
            } catch (Exception unused3) {
                fileInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
            }
            this.f113566b.delete();
        }
    }
}
