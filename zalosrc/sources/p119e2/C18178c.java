package p119e2;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import fn0.AbstractC19074t;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public final class C18178c {

    /* renamed from: a */
    public static final C18178c f92338a = new C18178c();

    private C18178c() {
    }

    /* renamed from: a */
    public static final Uri m96920a(Cursor cursor) {
        AbstractC19074t.m100208f(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        AbstractC19074t.m100207e(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    /* renamed from: b */
    public static final boolean m96921b(ActivityManager activityManager) {
        AbstractC19074t.m100208f(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
