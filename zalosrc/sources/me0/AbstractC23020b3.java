package me0;

import android.content.Context;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: me0.b3 */
/* loaded from: classes.dex */
public abstract class AbstractC23020b3 {

    /* renamed from: a */
    private static UUID f111987a;

    /* renamed from: a */
    private static synchronized UUID m118020a(File file) {
        UUID fromString;
        synchronized (AbstractC23020b3.class) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                fromString = UUID.fromString(new String(bArr, StandardCharsets.UTF_8));
            } finally {
            }
        }
        return fromString;
    }

    /* renamed from: b */
    public static UUID m118021b(Context context) {
        if (f111987a == null) {
            File file = new File(context.getNoBackupFilesDir(), "ZALO-INSTALLATION-UNIQUE-ID");
            try {
                if (!file.exists()) {
                    m118022c(file);
                }
                try {
                    f111987a = m118020a(file);
                } catch (IOException e11) {
                    e11.printStackTrace();
                    if (file.delete()) {
                        m118022c(file);
                        f111987a = m118020a(file);
                    }
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                if (f111987a == null) {
                    f111987a = UUID.fromString("532c2a44-7989-4061-9538-89240c8b1e4f");
                }
            }
        }
        return f111987a;
    }

    /* renamed from: c */
    private static synchronized void m118022c(File file) {
        synchronized (AbstractC23020b3.class) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
                fileOutputStream.close();
            } finally {
            }
        }
    }
}
