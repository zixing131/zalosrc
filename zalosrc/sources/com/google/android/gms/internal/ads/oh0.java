package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class oh0 extends RewardedInterstitialAd {

    /* renamed from: a */
    private final String f25637a;

    /* renamed from: b */
    private final ug0 f25638b;

    /* renamed from: c */
    private final Context f25639c;

    /* renamed from: d */
    private final mh0 f25640d = new mh0();

    /* renamed from: e */
    private FullScreenContentCallback f25641e;

    /* renamed from: f */
    private OnAdMetadataChangedListener f25642f;

    /* renamed from: g */
    private OnPaidEventListener f25643g;

    public oh0(Context context, String str) {
        this.f25637a = str;
        this.f25639c = context.getApplicationContext();
        this.f25638b = zzaw.zza().zzp(context, str, new s90());
    }

    /* renamed from: a */
    public final void m25195a(zzdr zzdrVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                ug0Var.zzg(zzp.zza.zza(this.f25639c, zzdrVar), new nh0(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                return ug0Var.zzb();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.f25637a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f25641e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f25642f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f25643g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdh zzdhVar = null;
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                zzdhVar = ug0Var.zzc();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        rg0 rg0Var;
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                rg0Var = ug0Var.zzd();
            } else {
                rg0Var = null;
            }
            if (rg0Var != null) {
                return new eh0(rg0Var);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f25641e = fullScreenContentCallback;
        this.f25640d.m24573N(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z11) {
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                ug0Var.zzh(z11);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f25642f = onAdMetadataChangedListener;
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                ug0Var.zzi(new zzex(onAdMetadataChangedListener));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f25643g = onPaidEventListener;
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                ug0Var.zzj(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                ug0Var.zzl(new zzccz(serverSideVerificationOptions));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f25640d.m24574Q(onUserEarnedRewardListener);
        try {
            ug0 ug0Var = this.f25638b;
            if (ug0Var != null) {
                ug0Var.zzk(this.f25640d);
                this.f25638b.zzm(BinderC4273d.m19913I3(activity));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
