package p371nv;

import fn0.AbstractC19074t;
import gm0.AbstractC19509c;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import on0.C24321d;

/* renamed from: nv.e */
/* loaded from: classes.dex */
public abstract class AbstractC23950e {

    /* renamed from: a */
    private final File f115920a;

    /* renamed from: b */
    private final String f115921b;

    public AbstractC23950e(File file, String str, long j11) {
        AbstractC19074t.m100208f(file, "logFolder");
        this.f115920a = file;
        this.f115921b = str;
        try {
            file.mkdirs();
            m125326g(file, j11);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private final void m125326g(File file, long j11) {
        boolean z11;
        final AtomicLong atomicLong = new AtomicLong();
        File[] listFiles = file.listFiles(new FileFilter() { // from class: nv.b
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                boolean m125327h;
                m125327h = AbstractC23950e.m125327h(file2);
                return m125327h;
            }
        });
        if (listFiles != null) {
            if (listFiles.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }
        File[] listFiles2 = file.listFiles(new FileFilter() { // from class: nv.c
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                boolean m125328i;
                m125328i = AbstractC23950e.m125328i(atomicLong, file3);
                return m125328i;
            }
        });
        if (listFiles2 != null && listFiles2.length != 0) {
            long j12 = atomicLong.get();
            if (j12 < j11) {
                return;
            }
            Arrays.sort(listFiles2, new Comparator() { // from class: nv.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m125329j;
                    m125329j = AbstractC23950e.m125329j((File) obj, (File) obj2);
                    return m125329j;
                }
            });
            for (File file3 : listFiles2) {
                j12 -= file3.length();
                file3.delete();
                if (j12 < j11) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m125327h(File file) {
        if (file.isFile() && file.length() <= 16) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final boolean m125328i(AtomicLong atomicLong, File file) {
        AbstractC19074t.m100208f(atomicLong, "$logSizeObj");
        if (file.isFile()) {
            atomicLong.addAndGet(file.length());
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final int m125329j(File file, File file2) {
        if (file.lastModified() < file2.lastModified()) {
            return -1;
        }
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final OutputStream m125330d(File file) {
        AbstractC19074t.m100208f(file, "fileToLog");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(AbstractC19509c.m101978a("SVVVM1JNM0dBQkgzTlMwQUJEM1RUMDROOUFCQ0FBMVU="));
        Charset charset = C24321d.f117408b;
        byte[] bytes = "salt for file logger".getBytes(charset);
        AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        String str = this.f115921b;
        AbstractC19074t.m100205c(str);
        byte[] bytes2 = str.getBytes(charset);
        AbstractC19074t.m100207e(bytes2, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes2);
        byte[] bytes3 = "salt for file logger".getBytes(charset);
        AbstractC19074t.m100207e(bytes3, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(messageDigest.digest(), "AES/CBC/PKCS5Padding");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[cipher.getBlockSize()];
        secureRandom.nextBytes(bArr);
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        fileOutputStream.write(bArr);
        return new GZIPOutputStream((OutputStream) new CipherOutputStream(fileOutputStream, cipher), true);
    }

    /* renamed from: e */
    public void mo125331e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final File m125332f() {
        return this.f115920a;
    }
}
