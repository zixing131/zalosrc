package com.zing.zalo.receiver;

import android.content.Context;
import android.content.Intent;
import com.zing.zalo.MainApplication;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import p645xh.C29630g;

/* loaded from: classes4.dex */
public class KeepAliveSCUploadReceiver extends ZamReceiver {
    public KeepAliveSCUploadReceiver() {
        MainApplication.Companion.m35498a(null);
    }

    @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(Context context, Intent intent) {
        super.mo39547b(context, intent);
        C29630g.m147299E0().m147306G0(intent);
    }
}
