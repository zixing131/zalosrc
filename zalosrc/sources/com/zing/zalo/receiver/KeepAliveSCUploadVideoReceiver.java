package com.zing.zalo.receiver;

import android.content.Context;
import android.content.Intent;
import com.zing.zalo.MainApplication;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import p645xh.C29632i;

/* loaded from: classes4.dex */
public class KeepAliveSCUploadVideoReceiver extends ZamReceiver {
    public KeepAliveSCUploadVideoReceiver() {
        MainApplication.Companion.m35498a(null);
    }

    @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(Context context, Intent intent) {
        super.mo39547b(context, intent);
        C29632i.m147326E0().m147333G0(intent);
    }
}
