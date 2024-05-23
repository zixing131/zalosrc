package com.zing.zalo.receiver;

import android.content.Context;
import android.content.Intent;
import com.zing.zalo.startup.NonBlockingBroadcastReceiver;
import fn0.AbstractC19074t;
import p363nh.C23783t0;

/* loaded from: classes4.dex */
public final class ZaloNotificationReceiver extends NonBlockingBroadcastReceiver {
    @Override // com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        C23783t0.Companion.m124242a().m124238h(intent);
    }
}
