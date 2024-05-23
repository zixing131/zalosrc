package p119e2;

import android.content.Context;
import fn0.AbstractC19074t;
import java.io.File;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public final class C18179d {

    /* renamed from: a */
    public static final C18179d f92339a = new C18179d();

    private C18179d() {
    }

    /* renamed from: a */
    public static final File m96922a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC19074t.m100207e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
