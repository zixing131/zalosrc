package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class t20 extends v10 {

    /* renamed from: p */
    private final OnAdManagerAdViewLoadedListener f28177p;

    public t20(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.f28177p = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.w10
    /* renamed from: N0 */
    public final void mo26560N0(zzbs zzbsVar, InterfaceC4271b interfaceC4271b) {
        AdListener adListener;
        if (zzbsVar != null && interfaceC4271b != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) BinderC4273d.m19914Q(interfaceC4271b));
            AppEventListener appEventListener = null;
            try {
                if (zzbsVar.zzi() instanceof zzg) {
                    zzg zzgVar = (zzg) zzbsVar.zzi();
                    if (zzgVar != null) {
                        adListener = zzgVar.zzb();
                    } else {
                        adListener = null;
                    }
                    adManagerAdView.setAdListener(adListener);
                }
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
            }
            try {
                if (zzbsVar.zzj() instanceof BinderC4473eq) {
                    BinderC4473eq binderC4473eq = (BinderC4473eq) zzbsVar.zzj();
                    if (binderC4473eq != null) {
                        appEventListener = binderC4473eq.m21777N();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e12) {
                yk0.zzh("", e12);
            }
            rk0.f27282b.post(new s20(this, adManagerAdView, zzbsVar));
        }
    }
}
