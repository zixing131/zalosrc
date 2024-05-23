package com.zing.zalo.zalosdk.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import jh0.AbstractC21254a;

/* loaded from: classes7.dex */
public class ReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String string = intent.getExtras().getString("referrer");
        if (!TextUtils.isEmpty(string)) {
            context.getSharedPreferences("zacCookie", 0).edit().putString("referrer", string).apply();
            AbstractC21254a.m110072n("ReferrerReceiver", "Referrer is: " + string);
        }
    }
}
