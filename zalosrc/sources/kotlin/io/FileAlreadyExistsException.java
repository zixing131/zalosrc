package kotlin.io;

import fn0.AbstractC19074t;
import java.io.File;

/* loaded from: classes7.dex */
public final class FileAlreadyExistsException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAlreadyExistsException(File file, File file2, String str) {
        super(file, file2, str);
        AbstractC19074t.m100208f(file, "file");
    }
}
