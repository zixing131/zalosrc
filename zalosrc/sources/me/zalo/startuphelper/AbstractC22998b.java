package me.zalo.startuphelper;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;

/* renamed from: me.zalo.startuphelper.b */
/* loaded from: classes7.dex */
abstract class AbstractC22998b {

    /* renamed from: a */
    private static String f111833a;

    /* renamed from: a */
    public static synchronized boolean m117802a(Context context) {
        boolean z11;
        synchronized (AbstractC22998b.class) {
            z11 = false;
            if (f111833a == null) {
                File file = new File(context.getNoBackupFilesDir(), "ZALO-STARTUP-HELPER-INSTALLATION");
                try {
                    if (!file.exists()) {
                        m117804c(file);
                        z11 = true;
                    }
                    try {
                        f111833a = m117803b(file);
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        if (file.delete()) {
                            m117804c(file);
                            f111833a = m117803b(file);
                            z11 = true;
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        }
        return z11;
    }

    /* renamed from: b */
    private static String m117803b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr, "utf-8");
    }

    /* renamed from: c */
    private static void m117804c(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(UUID.randomUUID().toString().getBytes("utf-8"));
        fileOutputStream.close();
    }
}
