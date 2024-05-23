package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* loaded from: classes.dex */
public final class C6072n4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f34232a;

    /* renamed from: b */
    final /* synthetic */ C6105q4 f34233b;

    public C6072n4(C6105q4 c6105q4, String str) {
        this.f34233b = c6105q4;
        AbstractC4205o.m19722k(str);
        this.f34232a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f34233b.f34158a.mo31033c().m31197q().m31109b(this.f34232a, th2);
    }
}
