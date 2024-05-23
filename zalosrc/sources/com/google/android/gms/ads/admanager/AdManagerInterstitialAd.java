package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.w60;

/* loaded from: classes2.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        AbstractC4205o.m19723l(context, "Context cannot be null.");
        AbstractC4205o.m19723l(str, "AdUnitId cannot be null.");
        AbstractC4205o.m19723l(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        AbstractC4205o.m19723l(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) AbstractC5149wy.f30261i.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new w60(context2, str2).m27537a(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e11) {
                            se0.m26287c(context2).mo26290b(e11, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new w60(context, str).m27537a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
