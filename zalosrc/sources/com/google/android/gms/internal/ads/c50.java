package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p057h5.OnH5AdsEventListener;

/* loaded from: classes2.dex */
public final class c50 extends e50 {

    /* renamed from: p */
    private final OnH5AdsEventListener f18112p;

    public c50(OnH5AdsEventListener onH5AdsEventListener) {
        this.f18112p = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final void zzb(String str) {
        this.f18112p.onH5AdsEvent(str);
    }
}
