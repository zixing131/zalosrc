package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class md3 {
    /* renamed from: a */
    public static Object m24550a(Future future) {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
