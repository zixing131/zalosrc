package p518t5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: t5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC26483a {

    /* renamed from: a */
    public static final int f125720a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:            if (r0.charAt(0) <= 'Z') goto L15;     */
    static {
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 33554432;
        if (i11 < 31) {
            if (i11 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() == 1) {
                    if (str.charAt(0) >= 'S') {
                    }
                }
            }
            i12 = 0;
        }
        f125720a = i12;
    }

    /* renamed from: a */
    public static PendingIntent m136450a(Context context, int i11, Intent intent, int i12) {
        return PendingIntent.getBroadcast(context, 0, intent, i12);
    }
}
