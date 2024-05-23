package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.InterfaceC4862p8;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzakm;

/* loaded from: classes2.dex */
public final class zzbh implements InterfaceC4862p8 {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    public zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4862p8
    public final void zza(zzakm zzakmVar) {
        yk0.zzj("Failed to load URL: " + this.zza + "\n" + zzakmVar.toString());
        this.zzb.zza(null);
    }
}
