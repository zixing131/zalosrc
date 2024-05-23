package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import p499s0.AbstractC26064g;

@TargetApi(26)
/* loaded from: classes2.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzg(Context context) {
        Object systemService;
        NotificationChannel m134169a = AbstractC26064g.m134169a("offline_notification_channel", "AdMob Offline Notifications", 2);
        m134169a.setShowBadge(false);
        systemService = context.getSystemService((Class<Object>) NotificationManager.class);
        ((NotificationManager) systemService).createNotificationChannel(m134169a);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzh(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return 2;
            }
        }
        return 1;
    }
}
