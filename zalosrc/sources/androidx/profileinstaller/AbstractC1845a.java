package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes2.dex */
abstract class AbstractC1845a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.a$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static File m9533a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.a$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static File m9534a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext.getCodeCacheDir();
        }
    }

    /* renamed from: a */
    static boolean m9531a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z11 = true;
            for (File file2 : listFiles) {
                if (m9531a(file2) && z11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            return z11;
        }
        file.delete();
        return true;
    }

    /* renamed from: b */
    public static void m9532b(Context context, ProfileInstallReceiver.C1841a c1841a) {
        File cacheDir;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            cacheDir = b.m9534a(context);
        } else if (i11 >= 23) {
            cacheDir = a.m9533a(context);
        } else {
            cacheDir = context.getCacheDir();
        }
        if (m9531a(cacheDir)) {
            c1841a.mo9515a(14, null);
        } else {
            c1841a.mo9515a(15, null);
        }
    }
}
