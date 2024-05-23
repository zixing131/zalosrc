package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.bv2;
import com.google.android.gms.internal.ads.c71;
import com.google.android.gms.internal.ads.hv2;
import com.google.android.gms.internal.ads.j04;
import com.google.android.gms.internal.ads.w04;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzai implements j04 {
    private final w04 zza;
    private final w04 zzb;
    private final w04 zzc;

    public zzai(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.zza = w04Var;
        this.zzb = w04Var2;
        this.zzc = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((hv2) this.zza.zzb()).m28361b(bv2.GENERATE_SIGNALS, ((c71) this.zzc).zzb().m20426c()).m28023f(((zzal) this.zzb).zzb()).m28026i(((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20976E4)).intValue(), TimeUnit.SECONDS).m28018a();
    }
}
