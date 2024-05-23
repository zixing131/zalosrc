package bp0;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.content.AbstractC1388a;

/* renamed from: bp0.t */
/* loaded from: classes7.dex */
public abstract class AbstractC3108t {

    /* renamed from: a */
    public static final String[] f13193a = {"android.permission.RECORD_AUDIO", "android.permission.VIBRATE"};

    /* renamed from: b */
    public static final String[] f13194b = {"android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.VIBRATE"};

    /* renamed from: a */
    public static int m15712a(Context context, String[] strArr) {
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        for (String str : strArr) {
            if (AbstractC1388a.m6959a(context, str) == -1) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static void m15713b(Activity activity, String[] strArr, int i11) {
        if (AbstractC3103o.m15619h(23)) {
            activity.requestPermissions(strArr, i11);
        }
    }
}
