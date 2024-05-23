package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* loaded from: classes2.dex */
final class oa0 implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ ba0 f25517a;

    /* renamed from: b */
    final /* synthetic */ Adapter f25518b;

    /* renamed from: c */
    final /* synthetic */ ua0 f25519c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public oa0(ua0 ua0Var, ba0 ba0Var, Adapter adapter) {
        this.f25519c = ua0Var;
        this.f25517a = ba0Var;
        this.f25518b = adapter;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            yk0.zze(this.f25518b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.f25517a.mo20452o0(adError.zza());
            this.f25517a.mo20450g0(adError.getCode(), adError.getMessage());
            this.f25517a.mo20448b(adError.getCode());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f25519c.f28805x = (MediationInterscrollerAd) obj;
            this.f25517a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return new ma0(this.f25517a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
