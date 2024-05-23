package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC6631m0 {
    /* renamed from: a */
    private static SharedPreferences m33919a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m33920b(Context context) {
        return m33919a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m33921c(Context context, boolean z11) {
        SharedPreferences.Editor edit = m33919a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z11);
        edit.apply();
    }
}
