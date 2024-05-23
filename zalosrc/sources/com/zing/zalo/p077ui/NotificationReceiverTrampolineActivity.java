package com.zing.zalo.p077ui;

import android.content.Intent;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import p363nh.C23783t0;

/* loaded from: classes5.dex */
public final class NotificationReceiverTrampolineActivity extends IntentHandlerBaseActivity {
    @Override // com.zing.zalo.p077ui.IntentHandlerBaseActivity
    /* renamed from: Q2 */
    protected void mo56788Q2(Intent intent) {
        if (intent == null) {
            finish();
            return;
        }
        String action = intent.getAction();
        AbstractC20110a.f98889a.mo104548a("action: %s", action);
        if (TextUtils.isEmpty(action)) {
            finish();
        } else {
            C23783t0.Companion.m124242a().m124238h(intent);
            finish();
        }
    }
}
