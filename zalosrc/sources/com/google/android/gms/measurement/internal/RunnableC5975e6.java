package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* loaded from: classes2.dex */
public final class RunnableC5975e6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f33964p;

    /* renamed from: q */
    final /* synthetic */ String f33965q;

    /* renamed from: r */
    final /* synthetic */ String f33966r;

    /* renamed from: s */
    final /* synthetic */ boolean f33967s;

    /* renamed from: t */
    final /* synthetic */ C6129s6 f33968t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5975e6(C6129s6 c6129s6, AtomicReference atomicReference, String str, String str2, String str3, boolean z11) {
        this.f33968t = c6129s6;
        this.f33964p = atomicReference;
        this.f33965q = str2;
        this.f33966r = str3;
        this.f33967s = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33968t.f34158a.m31379L().m30880W(this.f33964p, null, this.f33965q, this.f33966r, this.f33967s);
    }
}
