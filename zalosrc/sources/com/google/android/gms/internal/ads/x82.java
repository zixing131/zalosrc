package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x82 implements zzf {

    /* renamed from: a */
    final /* synthetic */ kg1 f30387a;

    public x82(y82 y82Var, kg1 kg1Var) {
        this.f30387a = kg1Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.f30387a.mo24383a().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.f30387a.mo23401b().zza();
        this.f30387a.mo27523e().zza();
    }
}
