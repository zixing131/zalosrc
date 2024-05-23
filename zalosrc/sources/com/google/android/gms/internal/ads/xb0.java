package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class xb0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ ib0 f30404a;

    /* renamed from: b */
    final /* synthetic */ ba0 f30405b;

    public xb0(ac0 ac0Var, ib0 ib0Var, ba0 ba0Var) {
        this.f30404a = ib0Var;
        this.f30405b = ba0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.f30404a.zzf(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        if (unifiedNativeAdMapper == null) {
            yk0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f30404a.mo20809c("Adapter returned null.");
                return null;
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
                return null;
            }
        }
        try {
            this.f30404a.mo20810g2(new za0(unifiedNativeAdMapper));
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
        }
        return new bc0(this.f30405b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
