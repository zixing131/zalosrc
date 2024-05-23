package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import p468r0.C25593d;

/* loaded from: classes2.dex */
public final class zzbxu implements MediationInterstitialAdapter {

    /* renamed from: a */
    private Activity f31933a;

    /* renamed from: b */
    private MediationInterstitialListener f31934b;

    /* renamed from: c */
    private Uri f31935c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        yk0.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        yk0.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        yk0.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f31934b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            yk0.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (context instanceof Activity) {
            if (!C4555gy.m22629g(context)) {
                yk0.zzj("Default browser does not support custom tabs. Bailing out.");
                this.f31934b.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                yk0.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f31934b.onAdFailedToLoad(this, 0);
                return;
            } else {
                this.f31933a = (Activity) context;
                this.f31935c = Uri.parse(string);
                this.f31934b.onAdLoaded(this);
                return;
            }
        }
        yk0.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
        this.f31934b.onAdFailedToLoad(this, 0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        C25593d m132189a = new C25593d.a().m132189a();
        m132189a.f122359a.setData(this.f31935c);
        zzs.zza.post(new ec0(this, new AdOverlayInfoParcel(new zzc(m132189a.f122359a, null), null, new dc0(this), null, new zzcgv(0, 0, false, false, false), null, null)));
        zzt.zzo().m22940o();
    }
}
