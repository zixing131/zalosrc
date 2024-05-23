package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class cd0 extends y10 {

    /* renamed from: p */
    private final NativeAd.OnNativeAdLoadedListener f18371p;

    public cd0(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f18371p = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.z10
    /* renamed from: s3 */
    public final void mo20861s3(j20 j20Var) {
        this.f18371p.onNativeAdLoaded(new vc0(j20Var));
    }
}
