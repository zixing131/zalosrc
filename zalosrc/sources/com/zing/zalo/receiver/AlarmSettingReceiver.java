package com.zing.zalo.receiver;

import ag0.C0804b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.zing.zalo.p077ui.maintab.MainTabView;
import p363nh.C23744a;

/* loaded from: classes4.dex */
public class AlarmSettingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null && intent.getAction().equals("com.zing.zalo.worker.AlarmSettingController.Chat")) {
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67701oN();
            } else {
                C23744a.m124114c().m124116d(29, new Object[0]);
            }
            if (intent.hasExtra("uid")) {
                str = intent.getStringExtra("uid");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C0804b.m2025g().m2035l(str, true);
                C23744a.m124114c().m124116d(125, str);
            }
        }
    }
}
