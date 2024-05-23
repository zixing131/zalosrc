package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
/* loaded from: classes2.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: p */
    private static final SparseArray f7211p = new SparseArray();

    /* renamed from: q */
    private static int f7212q = 1;

    /* renamed from: b */
    public static boolean m9200b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray sparseArray = f7211p;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No active wake lock id #");
                sb2.append(intExtra);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static ComponentName m9201c(Context context, Intent intent) {
        SparseArray sparseArray = f7211p;
        synchronized (sparseArray) {
            try {
                int i11 = f7212q;
                int i12 = i11 + 1;
                f7212q = i12;
                if (i12 <= 0) {
                    f7212q = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i11);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i11, newWakeLock);
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
