package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class qu1 implements du1 {

    /* renamed from: a */
    private final long f26967a;

    /* renamed from: b */
    private final va2 f26968b;

    public qu1(long j11, Context context, iu1 iu1Var, vs0 vs0Var, String str) {
        this.f26967a = j11;
        lo2 mo22611w = vs0Var.mo22611w();
        mo22611w.mo21161b(context);
        mo22611w.mo21160a(new zzq());
        mo22611w.zzb(str);
        va2 zza = mo22611w.zzd().zza();
        this.f26968b = zza;
        zza.zzD(new pu1(this, iu1Var));
    }

    @Override // com.google.android.gms.internal.ads.du1
    /* renamed from: a */
    public final void mo21544a(zzl zzlVar) {
        this.f26968b.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.du1
    public final void zza() {
        this.f26968b.zzx();
    }

    @Override // com.google.android.gms.internal.ads.du1
    public final void zzc() {
        this.f26968b.zzW(BinderC4273d.m19913I3(null));
    }
}
