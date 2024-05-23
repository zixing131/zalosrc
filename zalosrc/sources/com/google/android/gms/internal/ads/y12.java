package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class y12 implements w81 {
    @Override // com.google.android.gms.internal.ads.w81
    /* renamed from: a */
    public final di1 mo27578a(Looper looper, Handler.Callback callback) {
        return new a52(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.w81
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
