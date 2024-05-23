package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.AbstractC1333e;
import androidx.core.util.AbstractC1482d;

/* renamed from: androidx.core.content.d */
/* loaded from: classes.dex */
public abstract class AbstractC1391d {
    /* renamed from: a */
    public static int m6998a(Context context, String str, int i11, int i12, String str2) {
        int m6681b;
        if (context.checkPermission(str, i11, i12) == -1) {
            return -1;
        }
        String m6682c = AbstractC1333e.m6682c(str);
        if (m6682c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i12);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i12 && AbstractC1482d.m7475a(packageName, str2)) {
            m6681b = AbstractC1333e.m6680a(context, i12, m6682c, str2);
        } else {
            m6681b = AbstractC1333e.m6681b(context, m6682c, str2);
        }
        if (m6681b == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: b */
    public static int m6999b(Context context, String str) {
        return m6998a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
