package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes2.dex */
final class pa0 implements InitializationCompleteCallback {

    /* renamed from: a */
    final /* synthetic */ f60 f26144a;

    public pa0(ua0 ua0Var, f60 f60Var) {
        this.f26144a = f60Var;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.f26144a.mo21271c(str);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.f26144a.zzf();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }
}
