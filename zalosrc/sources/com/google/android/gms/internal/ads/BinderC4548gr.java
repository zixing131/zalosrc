package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.gr */
/* loaded from: classes2.dex */
public final class BinderC4548gr extends AbstractBinderC4882pr {

    /* renamed from: p */
    private FullScreenContentCallback f20799p;

    /* renamed from: N */
    public final void m22513N(FullScreenContentCallback fullScreenContentCallback) {
        this.f20799p = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f20799p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f20799p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f20799p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f20799p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f20799p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
