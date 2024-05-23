package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes2.dex */
public final class u20 extends y10 {

    /* renamed from: p */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f28709p;

    public u20(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f28709p = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.z10
    /* renamed from: s3 */
    public final void mo20861s3(j20 j20Var) {
        this.f28709p.onUnifiedNativeAdLoaded(new k20(j20Var));
    }
}
