package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class uw1 extends AdListener {

    /* renamed from: p */
    final /* synthetic */ String f29067p;

    /* renamed from: q */
    final /* synthetic */ xw1 f29068q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uw1(xw1 xw1Var, String str) {
        this.f29068q = xw1Var;
        this.f29067p = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m28045i;
        xw1 xw1Var = this.f29068q;
        m28045i = xw1.m28045i(loadAdError);
        xw1Var.m28046j(m28045i, this.f29067p);
    }
}
