package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.s */
/* loaded from: classes.dex */
public abstract class AbstractC1453s {

    /* renamed from: androidx.core.os.s$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m7371a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m7370a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m7371a(context);
        }
        return true;
    }
}
