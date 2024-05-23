package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class m61 implements ta1 {

    /* renamed from: p */
    private final Context f24404p;

    /* renamed from: q */
    private final dr2 f24405q;

    /* renamed from: r */
    private final zzcgv f24406r;

    /* renamed from: s */
    private final zzg f24407s;

    /* renamed from: t */
    private final hv1 f24408t;

    /* renamed from: u */
    private final xw2 f24409u;

    public m61(Context context, dr2 dr2Var, zzcgv zzcgvVar, zzg zzgVar, hv1 hv1Var, xw2 xw2Var) {
        this.f24404p = context;
        this.f24405q = dr2Var;
        this.f24406r = zzcgvVar;
        this.f24407s = zzgVar;
        this.f24408t = hv1Var;
        this.f24409u = xw2Var;
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(tq2 tq2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21230e3)).booleanValue()) {
            zzt.zza().zzc(this.f24404p, this.f24406r, this.f24405q.f19400f, this.f24407s.zzh(), this.f24409u);
        }
        this.f24408t.m23051r();
    }
}
