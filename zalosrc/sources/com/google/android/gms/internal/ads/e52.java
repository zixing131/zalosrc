package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e52 implements sh1 {

    /* renamed from: a */
    private final Context f19518a;

    /* renamed from: b */
    private final zzcgv f19519b;

    /* renamed from: c */
    private final tc3 f19520c;

    /* renamed from: d */
    private final iq2 f19521d;

    /* renamed from: e */
    private final zq0 f19522e;

    /* renamed from: f */
    private final dr2 f19523f;

    /* renamed from: g */
    private final f40 f19524g;

    /* renamed from: h */
    private final boolean f19525h;

    public e52(Context context, zzcgv zzcgvVar, tc3 tc3Var, iq2 iq2Var, zq0 zq0Var, dr2 dr2Var, boolean z11, f40 f40Var) {
        this.f19518a = context;
        this.f19519b = zzcgvVar;
        this.f19520c = tc3Var;
        this.f19521d = iq2Var;
        this.f19522e = zq0Var;
        this.f19523f = dr2Var;
        this.f19524g = f40Var;
        this.f19525h = z11;
    }

    @Override // com.google.android.gms.internal.ads.sh1
    /* renamed from: a */
    public final void mo21616a(boolean z11, Context context, j81 j81Var) {
        boolean z12;
        boolean z13;
        float f11;
        kg1 kg1Var = (kg1) kc3.m23885q(this.f19520c);
        this.f19522e.mo26705r0(true);
        if (this.f19525h) {
            z12 = this.f19524g.m21945e(false);
        } else {
            z12 = false;
        }
        zzt.zzp();
        boolean zzE = zzs.zzE(this.f19518a);
        boolean z14 = this.f19525h;
        if (z14) {
            z13 = this.f19524g.m21944d();
        } else {
            z13 = false;
        }
        if (z14) {
            f11 = this.f19524g.m21941a();
        } else {
            f11 = 0.0f;
        }
        zzj zzjVar = new zzj(z12, zzE, z13, f11, -1, z11, this.f19521d.f22302P, false);
        if (j81Var != null) {
            j81Var.zzf();
        }
        zzt.zzi();
        ih1 mo23945j = kg1Var.mo23945j();
        zq0 zq0Var = this.f19522e;
        iq2 iq2Var = this.f19521d;
        int i11 = iq2Var.f22304R;
        zzcgv zzcgvVar = this.f19519b;
        String str = iq2Var.f22289C;
        mq2 mq2Var = iq2Var.f22348t;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo23945j, (zzz) null, zq0Var, i11, zzcgvVar, str, zzjVar, mq2Var.f24722b, mq2Var.f24721a, this.f19523f.f19400f, j81Var), true);
    }
}
