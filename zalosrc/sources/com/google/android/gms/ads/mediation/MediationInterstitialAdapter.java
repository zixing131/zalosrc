package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationInterstitialAdapter extends MediationAdapter {
    void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2);

    void showInterstitial();
}
