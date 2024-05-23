package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.C4830od;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.j04;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.mt0;
import com.google.android.gms.internal.ads.ox2;
import com.google.android.gms.internal.ads.r04;
import com.google.android.gms.internal.ads.uc3;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.w04;
import com.google.android.gms.internal.ads.zr2;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzab implements j04 {
    private final w04 zza;
    private final w04 zzb;
    private final w04 zzc;
    private final w04 zzd;
    private final w04 zze;
    private final w04 zzf;
    private final w04 zzg;
    private final w04 zzh;
    private final w04 zzi;

    public zzab(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8, w04 w04Var9) {
        this.zza = w04Var;
        this.zzb = w04Var2;
        this.zzc = w04Var3;
        this.zzd = w04Var4;
        this.zze = w04Var5;
        this.zzf = w04Var6;
        this.zzg = w04Var7;
        this.zzh = w04Var8;
        this.zzi = w04Var9;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        vs0 vs0Var = (vs0) this.zza.zzb();
        Context m20710a = ((bt0) this.zzb).m20710a();
        C4830od c4830od = (C4830od) this.zzc.zzb();
        zr2 zr2Var = (zr2) this.zzd.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new zzaa(vs0Var, m20710a, c4830od, zr2Var, uc3Var, (ScheduledExecutorService) this.zzf.zzb(), (it1) this.zzg.zzb(), (ox2) this.zzh.zzb(), ((mt0) this.zzi).m24707a());
    }
}
