package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
final class ec0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AdOverlayInfoParcel f19584p;

    /* renamed from: q */
    final /* synthetic */ zzbxu f19585q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ec0(zzbxu zzbxuVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f19585q = zzbxuVar;
        this.f19584p = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        zzt.zzi();
        activity = this.f19585q.f31933a;
        zzm.zza(activity, this.f19584p, true);
    }
}
