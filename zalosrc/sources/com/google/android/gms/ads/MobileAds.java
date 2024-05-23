package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.qj0;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzed.zzf().zzl(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzed.zzf().zze();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzed.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzed.zzf();
        String[] split = TextUtils.split("21.3.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @Deprecated
    public static String getVersionString() {
        return zzed.zzf().zzh();
    }

    public static void initialize(Context context) {
        zzed.zzf().zzm(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzed.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzed.zzf().zzq(context, str);
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzed.zzf().zzr(cls);
    }

    public static void registerWebView(WebView webView) {
        zzed.zzf();
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        if (webView == null) {
            yk0.zzg("The webview to be registered cannot be null.");
            return;
        }
        qj0 m21992a = fe0.m21992a(webView.getContext());
        if (m21992a == null) {
            yk0.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            m21992a.zzi(BinderC4273d.m19913I3(webView));
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    public static void setAppMuted(boolean z11) {
        zzed.zzf().zzs(z11);
    }

    public static void setAppVolume(float f11) {
        zzed.zzf().zzt(f11);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzed.zzf().zzu(requestConfiguration);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzed.zzf().zzm(context, null, onInitializationCompleteListener);
    }
}
