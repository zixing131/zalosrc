package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ta0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ ba0 f28274a;

    /* renamed from: b */
    final /* synthetic */ ua0 f28275b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ta0(ua0 ua0Var, ba0 ba0Var) {
        this.f28275b = ua0Var;
        this.f28274a = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f28275b.f28797p;
            yk0.zze(obj.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.f28274a.mo20452o0(adError.zza());
            this.f28274a.mo20450g0(adError.getCode(), adError.getMessage());
            this.f28274a.mo20448b(adError.getCode());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f28275b.f28804w = (MediationRewardedAd) obj;
            this.f28274a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return new kh0(this.f28274a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.f28275b.f28797p;
            yk0.zze(obj.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            this.f28274a.mo20450g0(0, str);
            this.f28274a.mo20448b(0);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }
}
