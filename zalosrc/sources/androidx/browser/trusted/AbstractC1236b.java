package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import p499s0.AbstractC26064g;

/* renamed from: androidx.browser.trusted.b */
/* loaded from: classes2.dex */
abstract class AbstractC1236b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Notification m5851a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        NotificationChannel notificationChannel;
        int importance;
        Notification.Builder recoverBuilder;
        notificationManager.createNotificationChannel(AbstractC26064g.m134169a(str, str2, 3));
        notificationChannel = notificationManager.getNotificationChannel(str);
        importance = notificationChannel.getImportance();
        if (importance != 0) {
            recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
            recoverBuilder.setChannelId(str);
            return recoverBuilder.build();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m5852b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 0) {
                return false;
            }
        }
        return true;
    }
}
