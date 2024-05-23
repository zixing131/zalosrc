package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes2.dex */
final class dc0 implements zzo {

    /* renamed from: p */
    final /* synthetic */ zzbxu f19172p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dc0(zzbxu zzbxuVar) {
        this.f19172p = zzbxuVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        MediationInterstitialListener mediationInterstitialListener;
        yk0.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbxu zzbxuVar = this.f19172p;
        mediationInterstitialListener = zzbxuVar.f31934b;
        mediationInterstitialListener.onAdOpened(zzbxuVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        yk0.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        yk0.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        yk0.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i11) {
        MediationInterstitialListener mediationInterstitialListener;
        yk0.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbxu zzbxuVar = this.f19172p;
        mediationInterstitialListener = zzbxuVar.f31934b;
        mediationInterstitialListener.onAdClosed(zzbxuVar);
    }
}
