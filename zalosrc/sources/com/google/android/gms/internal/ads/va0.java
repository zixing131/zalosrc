package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class va0 extends da0 {

    /* renamed from: p */
    private final MediationInterscrollerAd f29237p;

    public va0(MediationInterscrollerAd mediationInterscrollerAd) {
        this.f29237p = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.ea0
    public final InterfaceC4271b zze() {
        return BinderC4273d.m19913I3(this.f29237p.getView());
    }

    @Override // com.google.android.gms.internal.ads.ea0
    public final boolean zzf() {
        return this.f29237p.shouldDelegateInterscrollerEffect();
    }
}
