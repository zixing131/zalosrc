package p289k5;

import android.content.Context;
import p229i5.AbstractC20295p;

/* renamed from: k5.b */
/* loaded from: classes.dex */
public abstract class AbstractC21469b {

    /* renamed from: a */
    private static Context f104482a;

    /* renamed from: b */
    private static Boolean f104483b;

    /* renamed from: a */
    public static synchronized boolean m111057a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (AbstractC21469b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f104482a;
            if (context2 != null && (bool = f104483b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f104483b = null;
            if (AbstractC20295p.m105955i()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f104483b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f104483b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f104483b = Boolean.FALSE;
                }
            }
            f104482a = applicationContext;
            return f104483b.booleanValue();
        }
    }
}
