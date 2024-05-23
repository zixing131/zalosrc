package p363nh;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* renamed from: nh.i0 */
/* loaded from: classes.dex */
public enum EnumC23761i0 {
    NOTIFICATIONS("zalo_channel_group_1_notifications", "NOTIFICATIONS"),
    ALERT_STYLES("zalo_channel_group_2_alert_styles", "ALERT STYLES"),
    ACTIVITY_INDICATORS("zalo_channel_group_3_activity_indicators", "ACTIVITY INDICATORS");


    /* renamed from: p */
    private final String f114912p;

    /* renamed from: q */
    private final String f114913q;

    EnumC23761i0(String str, String str2) {
        this.f114912p = str;
        this.f114913q = str2;
    }

    /* renamed from: c */
    public static EnumC23761i0 m124181c(String str) {
        for (EnumC23761i0 enumC23761i0 : values()) {
            if (enumC23761i0.f114912p.equals(str)) {
                return enumC23761i0;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m124182d(NotificationManager notificationManager) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        AbstractC23751d0.m124170a();
        notificationManager.createNotificationChannelGroup(AbstractC23749c0.m124142a(this.f114912p, this.f114913q));
    }

    /* renamed from: e */
    public String m124183e() {
        return this.f114912p;
    }

    /* renamed from: g */
    public boolean m124184g(NotificationManager notificationManager) {
        List notificationChannelGroups;
        String id2;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannelGroups = notificationManager.getNotificationChannelGroups();
            if (notificationChannelGroups != null && !notificationChannelGroups.isEmpty()) {
                Iterator it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup m124174a = AbstractC23755f0.m124174a(it.next());
                    String str = this.f114912p;
                    id2 = m124174a.getId();
                    if (str.equals(id2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
