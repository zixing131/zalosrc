package kotlin.io;

import bn0.AbstractC2934c;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.IOException;

/* loaded from: classes7.dex */
public class FileSystemException extends IOException {

    /* renamed from: p */
    private final File f105786p;

    /* renamed from: q */
    private final File f105787q;

    /* renamed from: r */
    private final String f105788r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileSystemException(File file, File file2, String str) {
        super(r0);
        String m13892b;
        AbstractC19074t.m100208f(file, "file");
        m13892b = AbstractC2934c.m13892b(file, file2, str);
        this.f105786p = file;
        this.f105787q = file2;
        this.f105788r = str;
    }
}
