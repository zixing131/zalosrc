package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zc0 extends r10 {

    /* renamed from: p */
    final /* synthetic */ ad0 f31450p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zc0(ad0 ad0Var, yc0 yc0Var) {
        this.f31450p = ad0Var;
    }

    @Override // com.google.android.gms.internal.ads.s10
    /* renamed from: y4 */
    public final void mo25628y4(e10 e10Var) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd m20083f;
        ad0 ad0Var = this.f31450p;
        onCustomFormatAdLoadedListener = ad0Var.f17004a;
        m20083f = ad0Var.m20083f(e10Var);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(m20083f);
    }
}
