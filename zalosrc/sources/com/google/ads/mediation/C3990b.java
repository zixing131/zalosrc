package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* renamed from: com.google.ads.mediation.b */
/* loaded from: classes2.dex */
final class C3990b extends AdListener implements AppEventListener, zza {

    /* renamed from: p */
    final AbstractAdViewAdapter f15783p;

    /* renamed from: q */
    final MediationBannerListener f15784q;

    public C3990b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f15783p = abstractAdViewAdapter;
        this.f15784q = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f15784q.onAdClicked(this.f15783p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f15784q.onAdClosed(this.f15783p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f15784q.onAdFailedToLoad(this.f15783p, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f15784q.onAdLoaded(this.f15783p);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f15784q.onAdOpened(this.f15783p);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f15784q.zzd(this.f15783p, str, str2);
    }
}
