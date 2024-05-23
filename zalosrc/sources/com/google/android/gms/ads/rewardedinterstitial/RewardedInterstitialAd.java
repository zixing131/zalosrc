package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.oh0;
import com.google.android.gms.internal.ads.se0;

/* loaded from: classes2.dex */
public abstract class RewardedInterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        AbstractC4205o.m19723l(context, "Context cannot be null.");
        AbstractC4205o.m19723l(str, "AdUnitId cannot be null.");
        AbstractC4205o.m19723l(adRequest, "AdRequest cannot be null.");
        AbstractC4205o.m19723l(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) AbstractC5149wy.f30264l.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new oh0(context2, str2).m25195a(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e11) {
                            se0.m26287c(context2).mo26290b(e11, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new oh0(context, str).m25195a(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z11);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        AbstractC4205o.m19723l(context, "Context cannot be null.");
        AbstractC4205o.m19723l(str, "AdUnitId cannot be null.");
        AbstractC4205o.m19723l(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        AbstractC4205o.m19723l(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) AbstractC5149wy.f30264l.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new oh0(context2, str2).m25195a(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e11) {
                            se0.m26287c(context2).mo26290b(e11, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new oh0(context, str).m25195a(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
    }
}
