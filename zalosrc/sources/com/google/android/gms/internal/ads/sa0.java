package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* loaded from: classes2.dex */
final class sa0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ ba0 f27601a;

    /* renamed from: b */
    final /* synthetic */ ua0 f27602b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sa0(ua0 ua0Var, ba0 ba0Var) {
        this.f27602b = ua0Var;
        this.f27601a = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f27602b.f28797p;
            yk0.zze(obj.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.f27601a.mo20452o0(adError.zza());
            this.f27601a.mo20450g0(adError.getCode(), adError.getMessage());
            this.f27601a.mo20448b(adError.getCode());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f27602b.f28803v = (UnifiedNativeAdMapper) obj;
            this.f27601a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return new ma0(this.f27601a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
