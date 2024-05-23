package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class qa0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ ba0 f26699a;

    /* renamed from: b */
    final /* synthetic */ ua0 f26700b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qa0(ua0 ua0Var, ba0 ba0Var) {
        this.f26700b = ua0Var;
        this.f26699a = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f26700b.f28797p;
            yk0.zze(obj.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.f26699a.mo20452o0(adError.zza());
            this.f26699a.mo20450g0(adError.getCode(), adError.getMessage());
            this.f26699a.mo20448b(adError.getCode());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        try {
            this.f26700b.f28801t = mediationBannerAd.getView();
            this.f26699a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return new ma0(this.f26699a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
