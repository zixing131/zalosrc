package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class re0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f27172a;

    /* renamed from: b */
    final /* synthetic */ se0 f27173b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public re0(se0 se0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f27173b = se0Var;
        this.f27172a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                this.f27173b.m26291e(thread, th2);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f27172a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                }
            } catch (Throwable unused) {
                yk0.zzg("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f27172a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th2);
                }
            }
        } catch (Throwable th3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f27172a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th2);
            }
            throw th3;
        }
    }
}
