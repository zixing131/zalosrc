package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C4808ns;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.ir0;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zq0;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzaa {
    private zzaa() {
    }

    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    public static zzaa zzm(int i11) {
        return i11 >= 30 ? new zzy() : i11 >= 28 ? new zzx() : i11 >= 26 ? new zzv() : i11 >= 24 ? new zzu() : i11 >= 21 ? new zzt() : new zzaa();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            yk0.zzh("Failed to obtain CookieManager.", th2);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i11, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public ir0 zzd(zq0 zq0Var, C4808ns c4808ns, boolean z11) {
        return new bs0(zq0Var, c4808ns, z11);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzg(Context context) {
    }

    public int zzh(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzi(AudioManager audioManager) {
        return 0;
    }

    public void zzj(Activity activity) {
    }

    public int zzl(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
