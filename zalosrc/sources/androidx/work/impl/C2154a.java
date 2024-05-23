package androidx.work.impl;

import android.content.Context;
import fn0.AbstractC19074t;
import java.io.File;

/* renamed from: androidx.work.impl.a */
/* loaded from: classes2.dex */
public final class C2154a {

    /* renamed from: a */
    public static final C2154a f9155a = new C2154a();

    private C2154a() {
    }

    /* renamed from: a */
    public final File m11581a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC19074t.m100207e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
