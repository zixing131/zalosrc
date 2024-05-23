package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbs;

/* loaded from: classes2.dex */
final class s20 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AdManagerAdView f27498p;

    /* renamed from: q */
    final /* synthetic */ zzbs f27499q;

    /* renamed from: r */
    final /* synthetic */ t20 f27500r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20(t20 t20Var, AdManagerAdView adManagerAdView, zzbs zzbsVar) {
        this.f27500r = t20Var;
        this.f27498p = adManagerAdView;
        this.f27499q = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.f27498p.zzb(this.f27499q)) {
            onAdManagerAdViewLoadedListener = this.f27500r.f28177p;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.f27498p);
        } else {
            yk0.zzj("Could not bind.");
        }
    }
}
