package bn0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import on0.AbstractC24342w;

/* renamed from: bn0.k */
/* loaded from: classes7.dex */
public abstract class AbstractC2942k extends AbstractC2941j {
    /* renamed from: j */
    public static final File m13923j(File file, File file2, boolean z11, int i11) {
        AbstractC19074t.m100208f(file, "<this>");
        AbstractC19074t.m100208f(file2, ZinstantMetaConstant.TARGET_VIEWPORT);
        if (file.exists()) {
            if (file2.exists()) {
                if (z11) {
                    if (!file2.delete()) {
                        throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!file2.mkdirs()) {
                    throw new FileSystemException(file, file2, "Failed to create target directory.");
                }
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        AbstractC2932a.m13887a(fileInputStream, fileOutputStream, i11);
                        AbstractC2933b.m13890a(fileOutputStream, null);
                        AbstractC2933b.m13890a(fileInputStream, null);
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC2933b.m13890a(fileInputStream, th2);
                        throw th3;
                    }
                }
            }
            return file2;
        }
        throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
    }

    /* renamed from: k */
    public static /* synthetic */ File m13924k(File file, File file2, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 8192;
        }
        return m13923j(file, file2, z11, i11);
    }

    /* renamed from: l */
    public static boolean m13925l(File file) {
        AbstractC19074t.m100208f(file, "<this>");
        while (true) {
            boolean z11 = true;
            for (File file2 : AbstractC2941j.m13921h(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z11) {
                        break;
                    }
                }
                z11 = false;
            }
            return z11;
        }
    }

    /* renamed from: m */
    public static String m13926m(File file) {
        String m127148N0;
        AbstractC19074t.m100208f(file, "<this>");
        String name = file.getName();
        AbstractC19074t.m100207e(name, "getName(...)");
        m127148N0 = AbstractC24342w.m127148N0(name, '.', "");
        return m127148N0;
    }

    /* renamed from: n */
    public static final File m13927n(File file, File file2) {
        boolean m127155R;
        AbstractC19074t.m100208f(file, "<this>");
        AbstractC19074t.m100208f(file2, "relative");
        if (AbstractC2939h.m13915b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        AbstractC19074t.m100207e(file3, "toString(...)");
        if (file3.length() != 0) {
            char c11 = File.separatorChar;
            m127155R = AbstractC24342w.m127155R(file3, c11, false, 2, null);
            if (!m127155R) {
                return new File(file3 + c11 + file2);
            }
        }
        return new File(file3 + file2);
    }

    /* renamed from: o */
    public static File m13928o(File file, String str) {
        AbstractC19074t.m100208f(file, "<this>");
        AbstractC19074t.m100208f(str, "relative");
        return m13927n(file, new File(str));
    }
}
