package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* loaded from: classes2.dex */
public final class u82 implements zzf {

    /* renamed from: a */
    private zzf f28791a;

    /* renamed from: a */
    public final synchronized void m26873a(zzf zzfVar) {
        this.f28791a = zzfVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        zzf zzfVar = this.f28791a;
        if (zzfVar != null) {
            zzfVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzb() {
        zzf zzfVar = this.f28791a;
        if (zzfVar != null) {
            zzfVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzc() {
        zzf zzfVar = this.f28791a;
        if (zzfVar != null) {
            zzfVar.zzc();
        }
    }
}
