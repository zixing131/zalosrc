package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C6054l8;
import p230i6.InterfaceC20333y;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC20333y {

    /* renamed from: p */
    private C6054l8 f33746p;

    /* renamed from: d */
    private final C6054l8 m30775d() {
        if (this.f33746p == null) {
            this.f33746p = new C6054l8(this);
        }
        return this.f33746p;
    }

    @Override // p230i6.InterfaceC20333y
    /* renamed from: a */
    public final void mo30776a(Intent intent) {
    }

    @Override // p230i6.InterfaceC20333y
    /* renamed from: b */
    public final void mo30777b(JobParameters jobParameters, boolean z11) {
        jobFinished(jobParameters, false);
    }

    @Override // p230i6.InterfaceC20333y
    /* renamed from: c */
    public final boolean mo30778c(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m30775d().m31043e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m30775d().m31044f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m30775d().m31045g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m30775d().m31047i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m30775d().m31048j(intent);
        return true;
    }
}
