package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes2.dex */
public final class v20 extends e20 {

    /* renamed from: p */
    private final UnifiedNativeAd.UnconfirmedClickListener f29131p;

    public v20(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f29131p = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.f20
    /* renamed from: j */
    public final void mo21249j(String str) {
        this.f29131p.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void zze() {
        this.f29131p.onUnconfirmedClickCancelled();
    }
}
