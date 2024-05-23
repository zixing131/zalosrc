package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.AbstractC4371bz;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class zze extends yk0 {
    public static void zza(String str) {
        if (zzc() && str != null && str.length() > 4000) {
            for (String str2 : yk0.zza.m27833d(str)) {
            }
        }
    }

    public static void zzb(String str, Throwable th2) {
        zzc();
    }

    public static boolean zzc() {
        if (yk0.zzm(2) && ((Boolean) AbstractC4371bz.f18054a.m24091e()).booleanValue()) {
            return true;
        }
        return false;
    }
}
