package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p32 implements sh1 {

    /* renamed from: a */
    private final zzcgv f26050a;

    /* renamed from: b */
    private final tc3 f26051b;

    /* renamed from: c */
    private final iq2 f26052c;

    /* renamed from: d */
    private final zq0 f26053d;

    /* renamed from: e */
    private final dr2 f26054e;

    /* renamed from: f */
    private final f40 f26055f;

    /* renamed from: g */
    private final boolean f26056g;

    public p32(zzcgv zzcgvVar, tc3 tc3Var, iq2 iq2Var, zq0 zq0Var, dr2 dr2Var, boolean z11, f40 f40Var) {
        this.f26050a = zzcgvVar;
        this.f26051b = tc3Var;
        this.f26052c = iq2Var;
        this.f26053d = zq0Var;
        this.f26054e = dr2Var;
        this.f26056g = z11;
        this.f26055f = f40Var;
    }

    @Override // com.google.android.gms.internal.ads.sh1
    /* renamed from: a */
    public final void mo21616a(boolean z11, Context context, j81 j81Var) {
        boolean z12;
        boolean z13;
        float f11;
        int i11;
        c11 c11Var = (c11) kc3.m23885q(this.f26051b);
        this.f26053d.mo26705r0(true);
        if (this.f26056g) {
            z12 = this.f26055f.m21945e(true);
        } else {
            z12 = true;
        }
        boolean z14 = this.f26056g;
        if (z14) {
            z13 = this.f26055f.m21944d();
        } else {
            z13 = false;
        }
        if (z14) {
            f11 = this.f26055f.m21941a();
        } else {
            f11 = 0.0f;
        }
        zzj zzjVar = new zzj(z12, true, z13, f11, -1, z11, this.f26052c.f22302P, false);
        if (j81Var != null) {
            j81Var.zzf();
        }
        zzt.zzi();
        ih1 mo20785i = c11Var.mo20785i();
        zq0 zq0Var = this.f26053d;
        int i12 = this.f26052c.f22304R;
        if (i12 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.f26054e.f19404j;
            if (zzwVar != null) {
                int i13 = zzwVar.zza;
                if (i13 == 1) {
                    i11 = 7;
                } else if (i13 == 2) {
                    i11 = 6;
                }
                zzcgv zzcgvVar = this.f26050a;
                iq2 iq2Var = this.f26052c;
                String str = iq2Var.f22289C;
                mq2 mq2Var = iq2Var.f22348t;
                zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo20785i, (zzz) null, zq0Var, i11, zzcgvVar, str, zzjVar, mq2Var.f24722b, mq2Var.f24721a, this.f26054e.f19400f, j81Var), true);
            }
            yk0.zze("Error setting app open orientation; no targeting orientation available.");
            i12 = this.f26052c.f22304R;
        }
        i11 = i12;
        zzcgv zzcgvVar2 = this.f26050a;
        iq2 iq2Var2 = this.f26052c;
        String str2 = iq2Var2.f22289C;
        mq2 mq2Var2 = iq2Var2.f22348t;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo20785i, (zzz) null, zq0Var, i11, zzcgvVar2, str2, zzjVar, mq2Var2.f24722b, mq2Var2.f24721a, this.f26054e.f19400f, j81Var), true);
    }
}
