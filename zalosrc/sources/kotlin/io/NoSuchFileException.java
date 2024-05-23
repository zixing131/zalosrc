package kotlin.io;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;

/* loaded from: classes7.dex */
public final class NoSuchFileException extends FileSystemException {
    public /* synthetic */ NoSuchFileException(File file, File file2, String str, int i11, AbstractC19060k abstractC19060k) {
        this(file, (i11 & 2) != 0 ? null : file2, (i11 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSuchFileException(File file, File file2, String str) {
        super(file, file2, str);
        AbstractC19074t.m100208f(file, "file");
    }
}
