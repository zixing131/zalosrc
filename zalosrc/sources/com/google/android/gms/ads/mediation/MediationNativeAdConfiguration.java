package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbls;

/* loaded from: classes2.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbls zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z11, Location location, int i11, int i12, String str2, String str3, zzbls zzblsVar) {
        super(context, str, bundle, bundle2, z11, location, i11, i12, str2, str3);
        this.zza = zzblsVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbls.m28706t(this.zza);
    }
}
