package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.w60;

/* loaded from: classes2.dex */
public abstract class InterstitialAd {
    public static void load(Context context, String str, AdRequest adRequest, InterstitialAdLoadCallback interstitialAdLoadCallback) {
        AbstractC4205o.m19723l(context, "Context cannot be null.");
        AbstractC4205o.m19723l(str, "AdUnitId cannot be null.");
        AbstractC4205o.m19723l(adRequest, "AdRequest cannot be null.");
        AbstractC4205o.m19723l(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) AbstractC5149wy.f30261i.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    public final /* synthetic */ Context zza;
                    public final /* synthetic */ String zzb;
                    public final /* synthetic */ AdRequest zzc;
                    public final /* synthetic */ InterstitialAdLoadCallback zzd;

                    public /* synthetic */ zza(Context context2, String str2, AdRequest adRequest2, InterstitialAdLoadCallback interstitialAdLoadCallback2) {
                        r1 = context2;
                        r2 = str2;
                        r3 = adRequest2;
                        r4 = interstitialAdLoadCallback2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = r1;
                        String str2 = r2;
                        AdRequest adRequest2 = r3;
                        try {
                            new w60(context2, str2).m27537a(adRequest2.zza(), r4);
                        } catch (IllegalStateException e11) {
                            se0.m26287c(context2).mo26290b(e11, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new w60(context2, str2).m27537a(adRequest2.zza(), interstitialAdLoadCallback2);
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z11);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
