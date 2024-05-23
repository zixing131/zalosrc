package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p230i6.C20319k;
import p230i6.InterfaceC20318j;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements InterfaceC20318j {

    /* renamed from: r */
    private C20319k f33747r;

    @Override // p230i6.InterfaceC20318j
    /* renamed from: a */
    public void mo30779a(Context context, Intent intent) {
        WakefulBroadcastReceiver.m9201c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f33747r == null) {
            this.f33747r = new C20319k(this);
        }
        this.f33747r.m106018a(context, intent);
    }
}
