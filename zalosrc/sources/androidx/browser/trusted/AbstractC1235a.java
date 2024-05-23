package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;

/* renamed from: androidx.browser.trusted.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1235a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Parcelable[] m5850a(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications;
        activeNotifications = notificationManager.getActiveNotifications();
        return activeNotifications;
    }
}
