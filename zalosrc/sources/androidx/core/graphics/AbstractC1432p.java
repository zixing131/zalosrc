package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import androidx.core.provider.AbstractC1460g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.core.graphics.p */
/* loaded from: classes2.dex */
public abstract class AbstractC1432p {

    /* renamed from: androidx.core.graphics.p$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static ParcelFileDescriptor m7308a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m7300a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m7301b(Context context, Resources resources, int i11) {
        File m7304e = m7304e(context);
        if (m7304e == null) {
            return null;
        }
        try {
            if (!m7302c(m7304e, resources, i11)) {
                return null;
            }
            return m7306g(m7304e);
        } finally {
            m7304e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m7302c(File file, Resources resources, int i11) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i11);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean m7303d = m7303d(file, inputStream);
            m7300a(inputStream);
            return m7303d;
        } catch (Throwable th3) {
            th = th3;
            m7300a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m7303d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            m7300a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error copying resource contents to temp file: ");
                    sb2.append(e.getMessage());
                    m7300a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    m7300a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    /* renamed from: e */
    public static File m7304e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i11 = 0; i11 < 100; i11++) {
            File file = new File(cacheDir, str + i11);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m7305f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m7308a = a.m7308a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m7308a == null) {
                if (m7308a != null) {
                    m7308a.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(m7308a.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    m7308a.close();
                    return map;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    m7308a.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static ByteBuffer m7306g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map m7307h(Context context, AbstractC1460g.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (AbstractC1460g.b bVar : bVarArr) {
            if (bVar.m7409b() == 0) {
                Uri m7411d = bVar.m7411d();
                if (!hashMap.containsKey(m7411d)) {
                    hashMap.put(m7411d, m7305f(context, cancellationSignal, m7411d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
