package com.google.android.gms.ads.p057h5;

import android.content.Context;
import com.google.android.gms.internal.ads.m50;

/* loaded from: classes2.dex */
public final class H5AdsRequestHandler {
    private final m50 zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new m50(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.m24470a();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.m24471b(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return m50.m24468c(str);
    }
}
