package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class hw2 implements ze1, m81, df1 {

    /* renamed from: p */
    private final vw2 f21931p;

    /* renamed from: q */
    private final kw2 f21932q;

    public hw2(Context context, vw2 vw2Var) {
        this.f21931p = vw2Var;
        this.f21932q = jw2.m23764a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.m81
    /* renamed from: z */
    public final void mo22412z(zze zzeVar) {
        if (((Boolean) AbstractC4963ry.f27409d.m24091e()).booleanValue()) {
            vw2 vw2Var = this.f21931p;
            kw2 kw2Var = this.f21932q;
            kw2Var.mo23067q(false);
            vw2Var.m27360a(kw2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.df1
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.df1
    public final void zzb() {
        if (((Boolean) AbstractC4963ry.f27409d.m24091e()).booleanValue()) {
            vw2 vw2Var = this.f21931p;
            kw2 kw2Var = this.f21932q;
            kw2Var.mo23067q(true);
            vw2Var.m27360a(kw2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ze1
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.ze1
    public final void zzg() {
        if (((Boolean) AbstractC4963ry.f27409d.m24091e()).booleanValue()) {
            this.f21932q.zzf();
        }
    }
}
