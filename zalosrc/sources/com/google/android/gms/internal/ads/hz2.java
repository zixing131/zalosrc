package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
final class hz2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = iz2.f22566k;
        if (handler != null) {
            handler2 = iz2.f22566k;
            runnable = iz2.f22567l;
            handler2.post(runnable);
            handler3 = iz2.f22566k;
            runnable2 = iz2.f22568m;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
