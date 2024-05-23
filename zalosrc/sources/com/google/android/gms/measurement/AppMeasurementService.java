package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C6054l8;
import p230i6.InterfaceC20333y;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC20333y {

    /* renamed from: p */
    private C6054l8 f33748p;

    /* renamed from: d */
    private final C6054l8 m30780d() {
        if (this.f33748p == null) {
            this.f33748p = new C6054l8(this);
        }
        return this.f33748p;
    }

    @Override // p230i6.InterfaceC20333y
    /* renamed from: a */
    public final void mo30776a(Intent intent) {
        WakefulBroadcastReceiver.m9200b(intent);
    }

    @Override // p230i6.InterfaceC20333y
    /* renamed from: b */
    public final void mo30777b(JobParameters jobParameters, boolean z11) {
        throw new UnsupportedOperationException();
    }

    @Override // p230i6.InterfaceC20333y
    /* renamed from: c */
    public final boolean mo30778c(int i11) {
        return stopSelfResult(i11);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m30780d().m31040b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m30780d().m31043e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m30780d().m31044f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m30780d().m31045g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        m30780d().m31039a(intent, i11, i12);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m30780d().m31048j(intent);
        return true;
    }
}
