package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class mh0 extends wg0 {

    /* renamed from: p */
    private FullScreenContentCallback f24527p;

    /* renamed from: q */
    private OnUserEarnedRewardListener f24528q;

    /* renamed from: N */
    public final void m24573N(FullScreenContentCallback fullScreenContentCallback) {
        this.f24527p = fullScreenContentCallback;
    }

    /* renamed from: Q */
    public final void m24574Q(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f24528q = onUserEarnedRewardListener;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    /* renamed from: R1 */
    public final void mo24575R1(rg0 rg0Var) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f24528q;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new eh0(rg0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    /* renamed from: b2 */
    public final void mo24576b2(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f24527p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    /* renamed from: f */
    public final void mo24577f(int i11) {
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f24527p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f24527p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.f24527p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.f24527p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
