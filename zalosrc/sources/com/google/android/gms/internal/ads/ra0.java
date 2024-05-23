package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ra0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ ba0 f27152a;

    /* renamed from: b */
    final /* synthetic */ ua0 f27153b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ra0(ua0 ua0Var, ba0 ba0Var) {
        this.f27153b = ua0Var;
        this.f27152a = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f27153b.f28797p;
            yk0.zze(obj.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.f27152a.mo20452o0(adError.zza());
            this.f27152a.mo20450g0(adError.getCode(), adError.getMessage());
            this.f27152a.mo20448b(adError.getCode());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f27153b.f28802u = (MediationInterstitialAd) obj;
            this.f27152a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return new ma0(this.f27152a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
