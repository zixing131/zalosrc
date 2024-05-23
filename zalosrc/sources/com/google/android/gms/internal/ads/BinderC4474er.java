package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.er */
/* loaded from: classes2.dex */
public final class BinderC4474er extends AbstractBinderC4732lr {

    /* renamed from: p */
    private final AppOpenAd.AppOpenAdLoadCallback f19755p;

    /* renamed from: q */
    private final String f19756q;

    public BinderC4474er(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f19755p = appOpenAdLoadCallback;
        this.f19756q = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4770mr
    /* renamed from: a1 */
    public final void mo21782a1(InterfaceC4658jr interfaceC4658jr) {
        if (this.f19755p != null) {
            this.f19755p.onAdLoaded(new C4511fr(interfaceC4658jr, this.f19756q));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4770mr
    /* renamed from: p4 */
    public final void mo21783p4(zze zzeVar) {
        if (this.f19755p != null) {
            this.f19755p.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4770mr
    public final void zzb(int i11) {
    }
}
