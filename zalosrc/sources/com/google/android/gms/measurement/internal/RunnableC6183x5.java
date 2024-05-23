package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* loaded from: classes2.dex */
public final class RunnableC6183x5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f34580p;

    /* renamed from: q */
    final /* synthetic */ String f34581q;

    /* renamed from: r */
    final /* synthetic */ long f34582r;

    /* renamed from: s */
    final /* synthetic */ Bundle f34583s;

    /* renamed from: t */
    final /* synthetic */ boolean f34584t;

    /* renamed from: u */
    final /* synthetic */ boolean f34585u;

    /* renamed from: v */
    final /* synthetic */ boolean f34586v;

    /* renamed from: w */
    final /* synthetic */ String f34587w;

    /* renamed from: x */
    final /* synthetic */ C6129s6 f34588x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6183x5(C6129s6 c6129s6, String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        this.f34588x = c6129s6;
        this.f34580p = str;
        this.f34581q = str2;
        this.f34582r = j11;
        this.f34583s = bundle;
        this.f34584t = z11;
        this.f34585u = z12;
        this.f34586v = z13;
        this.f34587w = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34588x.m31442w(this.f34580p, this.f34581q, this.f34582r, this.f34583s, this.f34584t, this.f34585u, this.f34586v, this.f34587w);
    }
}
