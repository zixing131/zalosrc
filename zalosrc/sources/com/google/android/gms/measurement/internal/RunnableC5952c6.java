package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* loaded from: classes2.dex */
public final class RunnableC5952c6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f33831p;

    /* renamed from: q */
    final /* synthetic */ String f33832q;

    /* renamed from: r */
    final /* synthetic */ String f33833r;

    /* renamed from: s */
    final /* synthetic */ C6129s6 f33834s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5952c6(C6129s6 c6129s6, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f33834s = c6129s6;
        this.f33831p = atomicReference;
        this.f33832q = str2;
        this.f33833r = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33834s.f34158a.m31379L().m30878U(this.f33831p, null, this.f33832q, this.f33833r);
    }
}
