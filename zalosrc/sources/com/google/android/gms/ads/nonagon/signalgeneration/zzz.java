package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.gc3;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.ys1;

/* loaded from: classes2.dex */
final class zzz implements gc3 {
    final /* synthetic */ zzaa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        it1 it1Var;
        ys1 ys1Var;
        com.google.android.gms.ads.internal.zzt.zzo().m22945t(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        it1Var = zzaaVar.zzr;
        ys1Var = zzaaVar.zzj;
        zzf.zzc(it1Var, ys1Var, "sgf", new Pair("sgf_reason", th2.getMessage()));
        yk0.zzh("Failed to initialize webview for loading SDKCore. ", th2);
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* synthetic */ void zzb(Object obj) {
        yk0.zze("Initialized webview successfully for SDKCore.");
    }
}
