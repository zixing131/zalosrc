package p327lm;

import android.content.Context;
import android.os.Build;

/* renamed from: lm.g */
/* loaded from: classes.dex */
public abstract class AbstractC22527g {
    /* renamed from: a */
    public static boolean m116531a(Context context, String str) {
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT > 22) {
            try {
                checkSelfPermission = context.checkSelfPermission(str);
            } catch (Exception unused) {
            }
            if (checkSelfPermission == 0) {
                return true;
            }
        } else {
            try {
                if (context.checkCallingOrSelfPermission(str) != 0) {
                    return false;
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }
}
