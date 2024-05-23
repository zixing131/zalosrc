package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* loaded from: classes2.dex */
public final class zzfe extends zzdm {
    private final VideoController.VideoLifecycleCallbacks zza;

    public zzfe(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() {
        this.zza.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z11) {
        this.zza.onVideoMute(z11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() {
        this.zza.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() {
        this.zza.onVideoStart();
    }
}
