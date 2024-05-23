package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.y */
/* loaded from: classes.dex */
public final class C6499y {

    /* renamed from: a */
    private final Context f36320a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6499y(Context context) {
        this.f36320a = context;
    }

    /* renamed from: b */
    private static long m33364b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j11 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j11 += m33364b(file2);
            }
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m33365a() {
        return m33364b(new File(this.f36320a.getFilesDir(), "assetpacks"));
    }
}
