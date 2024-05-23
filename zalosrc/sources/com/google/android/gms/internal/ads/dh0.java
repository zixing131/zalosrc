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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class dh0 extends RewardedAd {

    /* renamed from: a */
    private final String f19234a;

    /* renamed from: b */
    private final ug0 f19235b;

    /* renamed from: c */
    private final Context f19236c;

    /* renamed from: d */
    private final mh0 f19237d = new mh0();

    /* renamed from: e */
    private OnAdMetadataChangedListener f19238e;

    /* renamed from: f */
    private OnPaidEventListener f19239f;

    /* renamed from: g */
    private FullScreenContentCallback f19240g;

    public dh0(Context context, String str) {
        this.f19236c = context.getApplicationContext();
        this.f19234a = str;
        this.f19235b = zzaw.zza().zzp(context, str, new s90());
    }

    /* renamed from: a */
    public final void m21391a(zzdr zzdrVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                ug0Var.zzf(zzp.zza.zza(this.f19236c, zzdrVar), new hh0(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                return ug0Var.zzb();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.f19234a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f19240g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f19238e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f19239f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzdh zzdhVar = null;
        try {
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                zzdhVar = ug0Var.zzc();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        rg0 rg0Var;
        try {
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                rg0Var = ug0Var.zzd();
            } else {
                rg0Var = null;
            }
            if (rg0Var == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new eh0(rg0Var);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f19240g = fullScreenContentCallback;
        this.f19237d.m24573N(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z11) {
        try {
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                ug0Var.zzh(z11);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f19238e = onAdMetadataChangedListener;
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                ug0Var.zzi(new zzex(onAdMetadataChangedListener));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f19239f = onPaidEventListener;
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                ug0Var.zzj(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                ug0 ug0Var = this.f19235b;
                if (ug0Var != null) {
                    ug0Var.zzl(new zzccz(serverSideVerificationOptions));
                }
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f19237d.m24574Q(onUserEarnedRewardListener);
        if (activity == null) {
            yk0.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ug0 ug0Var = this.f19235b;
            if (ug0Var != null) {
                ug0Var.zzk(this.f19237d);
                this.f19235b.zzm(BinderC4273d.m19913I3(activity));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
