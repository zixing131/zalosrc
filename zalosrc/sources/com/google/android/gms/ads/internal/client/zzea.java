package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzea extends zzcx {
    private zzea() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze(zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener;
        AdInspectorError adInspectorError;
        onAdInspectorClosedListener = zzed.zzf().zzh;
        if (onAdInspectorClosedListener != null) {
            if (zzeVar == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
            }
            onAdInspectorClosedListener.onAdInspectorClosed(adInspectorError);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzea(zzdz zzdzVar) {
    }
}
