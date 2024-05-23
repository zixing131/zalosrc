package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* loaded from: classes2.dex */
public final class zzcr extends zzcp {
    private final MuteThisAdListener zza;

    public zzcr(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcq
    public final void zze() {
        this.zza.onAdMuted();
    }
}
