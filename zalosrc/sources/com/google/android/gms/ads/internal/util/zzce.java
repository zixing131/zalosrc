package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.AbstractC4150d;
import p229i5.AbstractC20284e;
import p229i5.AbstractC20298s;

/* loaded from: classes2.dex */
public final class zzce {
    private static zzce zzb;
    String zza;

    private zzce() {
    }

    public static zzce zza() {
        if (zzb == null) {
            zzb = new zzce();
        }
        return zzb;
    }

    public final void zzb(Context context) {
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.zza)) {
            Context m19581e = AbstractC4150d.m19581e(context);
            if (!AbstractC20284e.m105912a()) {
                if (m19581e == null) {
                    m19581e = null;
                }
                this.zza = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (m19581e == null) {
                putString.apply();
            } else {
                AbstractC20298s.m105961a(context, putString, "admob_user_agent");
            }
            this.zza = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
