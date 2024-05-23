package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes2.dex */
public final class RunnableC6195y6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ Bundle f34621p;

    /* renamed from: q */
    final /* synthetic */ C6184x6 f34622q;

    /* renamed from: r */
    final /* synthetic */ C6184x6 f34623r;

    /* renamed from: s */
    final /* synthetic */ long f34624s;

    /* renamed from: t */
    final /* synthetic */ C5976e7 f34625t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6195y6(C5976e7 c5976e7, Bundle bundle, C6184x6 c6184x6, C6184x6 c6184x62, long j11) {
        this.f34625t = c5976e7;
        this.f34621p = bundle;
        this.f34622q = c6184x6;
        this.f34623r = c6184x62;
        this.f34624s = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5976e7.m30845w(this.f34625t, this.f34621p, this.f34622q, this.f34623r, this.f34624s);
    }
}
