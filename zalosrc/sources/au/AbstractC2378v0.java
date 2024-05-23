package au;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p248iy.AbstractC20887g;

/* renamed from: au.v0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2378v0 {
    /* renamed from: b */
    private static void m12419b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ZipHelper.createDir() - Creating directory: ");
        sb2.append(file.getName());
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new RuntimeException("Can't create directory " + file);
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ZipHelper.createDir() - Exists directory: ");
        sb3.append(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ boolean m12420c(File file) {
        return true;
    }

    /* renamed from: d */
    public static boolean m12421d(File file, File file2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ZipHelper.unzip() - File: ");
        sb2.append(file.getPath());
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (!new File(file2, nextElement.getName()).getCanonicalPath().startsWith(file2.getCanonicalPath())) {
                        AbstractC20887g.m109237o(19003);
                        AbstractC20887g.m109230h(19003, "error unzip: " + file.getPath());
                    } else {
                        m12422e(zipFile, nextElement, file2);
                    }
                }
                zipFile.close();
                return true;
            } finally {
            }
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ZipHelper.unzip() - Error extracting file ");
            sb3.append(file);
            sb3.append(": ");
            sb3.append(e11);
            return false;
        }
    }

    /* renamed from: e */
    private static void m12422e(ZipFile zipFile, ZipEntry zipEntry, File file) {
        File file2 = new File(file, zipEntry.getName());
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            AbstractC20887g.m109237o(19003);
            AbstractC20887g.m109230h(19003, "error unzip output: " + file.getPath());
            return;
        }
        if (zipEntry.isDirectory()) {
            m12419b(file2);
            return;
        }
        if (!file2.getParentFile().exists()) {
            m12419b(file2.getParentFile());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ZipHelper.unzipEntry() - Extracting: ");
        sb2.append(zipEntry);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                }
                bufferedOutputStream.flush();
            } catch (Exception e11) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ZipHelper.unzipEntry() - Error: ");
                sb3.append(e11);
            }
            bufferedOutputStream.close();
            bufferedInputStream.close();
        } catch (Throwable th2) {
            bufferedOutputStream.close();
            bufferedInputStream.close();
            throw th2;
        }
    }

    /* renamed from: f */
    private static void m12423f(File file, File file2, FileFilter fileFilter, ZipOutputStream zipOutputStream) {
        File[] listFiles = file.listFiles(fileFilter);
        byte[] bArr = new byte[8192];
        int length = listFiles.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (listFiles[i11].isDirectory()) {
                m12423f(listFiles[i11], file2, fileFilter, zipOutputStream);
            } else {
                FileInputStream fileInputStream = new FileInputStream(listFiles[i11]);
                try {
                    ZipEntry zipEntry = new ZipEntry(listFiles[i11].getPath().substring(file2.getPath().length() + 1));
                    zipEntry.setTime(listFiles[i11].lastModified());
                    zipOutputStream.putNextEntry(zipEntry);
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (-1 == read) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    /* renamed from: g */
    public static void m12424g(File file, File file2) {
        m12425h(file, file2, null);
    }

    /* renamed from: h */
    public static void m12425h(File file, File file2, String str) {
        m12426i(file, new FileFilter() { // from class: au.u0
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                boolean m12420c;
                m12420c = AbstractC2378v0.m12420c(file3);
                return m12420c;
            }
        }, file2, str);
    }

    /* renamed from: i */
    public static void m12426i(File file, FileFilter fileFilter, File file2, String str) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
        m12423f(file, file, fileFilter, zipOutputStream);
        if (str != null) {
            zipOutputStream.setComment(str);
        }
        zipOutputStream.close();
    }
}
