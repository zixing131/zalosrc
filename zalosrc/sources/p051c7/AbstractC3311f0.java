package p051c7;

import android.content.Context;

/* renamed from: c7.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC3311f0 {
    /* renamed from: a */
    public static Context m16779a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
}
