package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.yk0;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcb {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            yk0.zzh("Unexpected exception.", th2);
            se0.m26287c(context).mo26290b(th2, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
