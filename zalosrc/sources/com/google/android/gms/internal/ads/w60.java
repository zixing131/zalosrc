package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class w60 extends AdManagerInterstitialAd {

    /* renamed from: a */
    private final Context f29817a;

    /* renamed from: b */
    private final zzp f29818b;

    /* renamed from: c */
    private final zzbs f29819c;

    /* renamed from: d */
    private final String f29820d;

    /* renamed from: e */
    private final s90 f29821e;

    /* renamed from: f */
    private AppEventListener f29822f;

    /* renamed from: g */
    private FullScreenContentCallback f29823g;

    /* renamed from: h */
    private OnPaidEventListener f29824h;

    public w60(Context context, String str) {
        s90 s90Var = new s90();
        this.f29821e = s90Var;
        this.f29817a = context;
        this.f29820d = str;
        this.f29818b = zzp.zza;
        this.f29819c = zzaw.zza().zze(context, new zzq(), str, s90Var);
    }

    /* renamed from: a */
    public final void m27537a(zzdr zzdrVar, AdLoadCallback adLoadCallback) {
        try {
            zzbs zzbsVar = this.f29819c;
            if (zzbsVar != null) {
                zzbsVar.zzy(this.f29818b.zza(this.f29817a, zzdrVar), new zzh(adLoadCallback, this));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.f29820d;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f29822f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f29823g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f29824h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdh zzdhVar = null;
        try {
            zzbs zzbsVar = this.f29819c;
            if (zzbsVar != null) {
                zzdhVar = zzbsVar.zzk();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        BinderC4473eq binderC4473eq;
        try {
            this.f29822f = appEventListener;
            zzbs zzbsVar = this.f29819c;
            if (zzbsVar != null) {
                if (appEventListener != null) {
                    binderC4473eq = new BinderC4473eq(appEventListener);
                } else {
                    binderC4473eq = null;
                }
                zzbsVar.zzG(binderC4473eq);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f29823g = fullScreenContentCallback;
            zzbs zzbsVar = this.f29819c;
            if (zzbsVar != null) {
                zzbsVar.zzJ(new zzaz(fullScreenContentCallback));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z11) {
        try {
            zzbs zzbsVar = this.f29819c;
            if (zzbsVar != null) {
                zzbsVar.zzL(z11);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f29824h = onPaidEventListener;
            zzbs zzbsVar = this.f29819c;
            if (zzbsVar != null) {
                zzbsVar.zzP(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            yk0.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbs zzbsVar = this.f29819c;
            if (zzbsVar != null) {
                zzbsVar.zzW(BinderC4273d.m19913I3(activity));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
