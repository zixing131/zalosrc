package com.zing.zalo.ads.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p604wb.C28905e;

/* loaded from: classes.dex */
public class AdsTrackingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (intent.getAction().equals("com.zing.zalo.ads.receiver.AdsTrackingManager.SubmitBatch")) {
                    C28905e.m144373n().m144385S();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
