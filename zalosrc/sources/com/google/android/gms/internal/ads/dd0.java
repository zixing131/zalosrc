package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class dd0 extends e20 {

    /* renamed from: p */
    private final NativeAd.UnconfirmedClickListener f19179p;

    public dd0(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f19179p = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.f20
    /* renamed from: j */
    public final void mo21249j(String str) {
        this.f19179p.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void zze() {
        this.f19179p.onUnconfirmedClickCancelled();
    }
}
