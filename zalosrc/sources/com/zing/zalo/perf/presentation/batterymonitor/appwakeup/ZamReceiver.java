package com.zing.zalo.perf.presentation.batterymonitor.appwakeup;

import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import com.zing.zalo.startup.NonBlockingBroadcastReceiver;
import mx.C23476m;

/* loaded from: classes.dex */
public abstract class ZamReceiver extends NonBlockingBroadcastReceiver {
    @Override // com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(Context context, Intent intent) {
        if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
            AbstractC9041b.m48319r(getClass().getCanonicalName(), intent.getAction());
        }
    }
}
