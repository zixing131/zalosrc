package p504s5;

import android.os.Build;

/* renamed from: s5.f */
/* loaded from: classes2.dex */
abstract class AbstractC26138f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m134506a() {
        if (Build.VERSION.SDK_INT < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
            return false;
        }
        return true;
    }
}
