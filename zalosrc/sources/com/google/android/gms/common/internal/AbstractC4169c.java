package com.google.android.gms.common.internal;

import android.os.Looper;

/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4169c {
    /* renamed from: a */
    public static void m19633a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checkMainThread: current thread ");
        sb2.append(valueOf);
        sb2.append(" IS NOT the main thread ");
        sb2.append(valueOf2);
        sb2.append("!");
        throw new IllegalStateException(str);
    }

    /* renamed from: b */
    public static void m19634b(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checkNotMainThread: current thread ");
        sb2.append(valueOf);
        sb2.append(" IS the main thread ");
        sb2.append(valueOf2);
        sb2.append("!");
        throw new IllegalStateException(str);
    }
}
