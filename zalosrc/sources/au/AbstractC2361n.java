package au;

import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;

/* renamed from: au.n */
/* loaded from: classes4.dex */
public abstract class AbstractC2361n {
    /* renamed from: a */
    public static int m12354a(Context context) {
        int currentInterruptionFilter;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                currentInterruptionFilter = ((NotificationManager) context.getSystemService("notification")).getCurrentInterruptionFilter();
                if (currentInterruptionFilter == 1) {
                    return 1;
                }
                if (currentInterruptionFilter == 2) {
                    return 2;
                }
                if (currentInterruptionFilter == 3) {
                    return 3;
                }
                if (currentInterruptionFilter == 4) {
                    return 4;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        try {
            int i11 = Settings.Global.getInt(context.getContentResolver(), "zen_mode");
            if (i11 == 0) {
                return 1;
            }
            if (i11 == 1) {
                return 2;
            }
            if (i11 == 2) {
                return 3;
            }
            if (i11 == 3) {
                return 4;
            }
            return -1;
        } catch (Exception e12) {
            e12.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b */
    public static int m12355b(Context context) {
        int m12354a = m12354a(context);
        if (m12354a != -1 && m12354a != 1) {
            return 0;
        }
        return ((AudioManager) context.getSystemService("audio")).getRingerMode();
    }

    /* renamed from: c */
    public static boolean m12356c(Context context) {
        int m12354a = m12354a(context);
        if (m12354a != -1 && m12354a != 1) {
            return true;
        }
        return false;
    }
}
