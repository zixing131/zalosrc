package com.zing.zalo.receiver;

import android.content.Context;
import android.content.Intent;
import com.zing.zalo.MainApplication;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import p645xh.C29628e;

/* loaded from: classes4.dex */
public class KeepAliveSCReceiver extends ZamReceiver {
    public KeepAliveSCReceiver() {
        MainApplication.Companion.m35498a(null);
    }

    @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(Context context, Intent intent) {
        super.mo39547b(context, intent);
        C29628e.m147249E0().m147257H0(intent);
    }
}
