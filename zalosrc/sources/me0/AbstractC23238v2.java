package me0;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import p239ih.C20556f;
import p620wt.AbstractC29238m;

/* renamed from: me0.v2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23238v2 {
    /* renamed from: a */
    public static void m119716a(C20556f c20556f, C20556f c20556f2) {
        InputStream m106838k = c20556f.m106838k();
        OutputStream m106840m = c20556f2.m106840m();
        if (m106838k != null && m106840m != null) {
            AbstractC29238m.m145999c(m106838k, m106840m);
        }
    }

    /* renamed from: b */
    public static void m119717b(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                AbstractC29238m.m145999c(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: c */
    public static boolean m119718c(File file, File file2) {
        if (!file.exists()) {
            return false;
        }
        if (!file2.exists() && file.renameTo(file2)) {
            return true;
        }
        if (file.isDirectory()) {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return true;
            }
            for (File file3 : listFiles) {
                m119718c(file3, new File(file2, file3.getName()));
            }
            file.delete();
            return true;
        }
        try {
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            m119717b(file, file2);
            return file.delete();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m119719d(File file, File file2, boolean z11, List list) {
        boolean z12;
        if (!file.exists()) {
            return false;
        }
        if (!file2.exists() && file.renameTo(file2)) {
            return true;
        }
        if (file.isDirectory()) {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return true;
            }
            boolean z13 = false;
            for (File file3 : listFiles) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals(file3.getAbsolutePath())) {
                            z13 = true;
                            z12 = true;
                            break;
                        }
                    }
                }
                z12 = false;
                if (!z12) {
                    m119719d(file3, new File(file2, file3.getName()), z11, list);
                }
            }
            if (!z13) {
                file.delete();
            }
            return true;
        }
        if (z11) {
            try {
                if (file2.exists() && file2.lastModified() >= file.lastModified()) {
                    AbstractC20110a.m104535d("target newer than source ....", new Object[0]);
                    return file.delete();
                }
            } catch (IOException unused) {
                return false;
            }
        }
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        m119717b(file, file2);
        return file.delete();
    }

    /* renamed from: e */
    public static boolean m119720e(File file, File file2) {
        if (file.exists() && !file2.exists()) {
            if (file.renameTo(file2)) {
                return true;
            }
            if (file.isDirectory()) {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return true;
                }
                for (File file3 : listFiles) {
                    m119718c(file3, new File(file2, file3.getName()));
                }
                file.delete();
                return true;
            }
            try {
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                m119717b(file, file2);
                return file.delete();
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public static long m119721f(String str) {
        return new File(str).getFreeSpace();
    }

    /* renamed from: g */
    public static long m119722g(String str) {
        StatFs statFs = new StatFs(str);
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    /* renamed from: h */
    public static long m119723h(String str) {
        StatFs statFs = new StatFs(str);
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    /* renamed from: i */
    public static byte[] m119724i(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file.getPath());
            try {
                int available = fileInputStream.available();
                if (available > 0) {
                    byte[] bArr = new byte[available];
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    return bArr;
                }
                fileInputStream.close();
                return null;
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: j */
    public static String m119725j(byte[] bArr) {
        try {
            return new String(bArr, "utf8");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: k */
    public static boolean m119726k() {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!Environment.getExternalStorageState().equals("mounted")) {
            if (!Environment.getExternalStorageState().equals("unmounted")) {
                if (Environment.getExternalStorageState().equals("mounted_ro")) {
                }
                return false;
            }
        }
        StatFs statFs = new StatFs(AbstractC23204s0.m119554e().getPath());
        if ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576 <= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m119727l() {
        try {
            if (Environment.getExternalStorageState().equals("mounted")) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: m */
    public static void m119728m(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (byteArrayOutputStream != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                } else {
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
                    byteArrayOutputStream.write(bytes);
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: n */
    public static void m119729n(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (byteArrayOutputStream != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                } else {
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
                    byteArrayOutputStream.write(bytes);
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }
}
