package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class pw1 extends AdListener {

    /* renamed from: p */
    final /* synthetic */ String f26557p;

    /* renamed from: q */
    final /* synthetic */ AdView f26558q;

    /* renamed from: r */
    final /* synthetic */ String f26559r;

    /* renamed from: s */
    final /* synthetic */ xw1 f26560s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pw1(xw1 xw1Var, String str, AdView adView, String str2) {
        this.f26560s = xw1Var;
        this.f26557p = str;
        this.f26558q = adView;
        this.f26559r = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m28045i;
        xw1 xw1Var = this.f26560s;
        m28045i = xw1.m28045i(loadAdError);
        xw1Var.m28046j(m28045i, this.f26559r);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f26560s.m28049e(this.f26557p, this.f26558q, this.f26559r);
    }
}
