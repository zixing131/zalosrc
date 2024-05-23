package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;

/* loaded from: classes2.dex */
public interface SignalCallbacks {
    void onFailure(AdError adError);

    @Deprecated
    void onFailure(String str);

    void onSuccess(String str);
}
