package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(Context context, CustomEventInterstitialListener customEventInterstitialListener, String str, MediationAdRequest mediationAdRequest, Bundle bundle);

    void showInterstitial();
}
