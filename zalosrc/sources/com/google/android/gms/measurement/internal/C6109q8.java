package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* loaded from: classes.dex */
public final class C6109q8 {

    /* renamed from: a */
    private RunnableC6098p8 f34383a;

    /* renamed from: b */
    final /* synthetic */ C6153u8 f34384b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6109q8(C6153u8 c6153u8) {
        this.f34384b = c6153u8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31297a(long j11) {
        Handler handler;
        this.f34383a = new RunnableC6098p8(this, this.f34384b.f34158a.mo31031a().mo105913a(), j11);
        handler = this.f34384b.f34519c;
        handler.postDelayed(this.f34383a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31298b() {
        Handler handler;
        this.f34384b.mo31036g();
        RunnableC6098p8 runnableC6098p8 = this.f34383a;
        if (runnableC6098p8 != null) {
            handler = this.f34384b.f34519c;
            handler.removeCallbacks(runnableC6098p8);
        }
        this.f34384b.f34158a.m31374F().f33822r.m31484a(false);
    }
}
