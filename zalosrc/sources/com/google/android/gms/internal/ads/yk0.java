package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes2.dex */
public abstract class yk0 {
    protected static final x53 zza = x53.m27829b(4000);

    static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            return str + " @" + stackTrace[3].getLineNumber();
        }
        return str;
    }

    public static void zze(String str) {
        if (!zzm(3) || str.length() <= 4000) {
            return;
        }
        for (String str2 : zza.m27833d(str)) {
        }
    }

    public static void zzf(String str, Throwable th2) {
        zzm(3);
    }

    public static void zzg(String str) {
        if (zzm(6) && str != null && str.length() > 4000) {
            for (String str2 : zza.m27833d(str)) {
            }
        }
    }

    public static void zzh(String str, Throwable th2) {
        zzm(6);
    }

    public static void zzi(String str) {
        if (zzm(4) && str != null && str.length() > 4000) {
            for (String str2 : zza.m27833d(str)) {
            }
        }
    }

    public static void zzj(String str) {
        if (zzm(5) && str != null && str.length() > 4000) {
            for (String str2 : zza.m27833d(str)) {
            }
        }
    }

    public static void zzk(String str, Throwable th2) {
        zzm(5);
    }

    public static void zzl(String str, Throwable th2) {
        if (zzm(5)) {
            if (th2 != null) {
                zzk(zzd(str), th2);
            } else {
                zzj(zzd(str));
            }
        }
    }

    public static boolean zzm(int i11) {
        if (i11 < 5 && !Log.isLoggable("Ads", i11)) {
            return false;
        }
        return true;
    }
}
