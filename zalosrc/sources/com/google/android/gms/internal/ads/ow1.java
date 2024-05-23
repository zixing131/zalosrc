package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ow1 extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f25970a;

    /* renamed from: b */
    final /* synthetic */ String f25971b;

    /* renamed from: c */
    final /* synthetic */ xw1 f25972c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ow1(xw1 xw1Var, String str, String str2) {
        this.f25972c = xw1Var;
        this.f25970a = str;
        this.f25971b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m28045i;
        xw1 xw1Var = this.f25972c;
        m28045i = xw1.m28045i(loadAdError);
        xw1Var.m28046j(m28045i, this.f25971b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        this.f25972c.m28049e(this.f25970a, appOpenAd, this.f25971b);
    }
}
