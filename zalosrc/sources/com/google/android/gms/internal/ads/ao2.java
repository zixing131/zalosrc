package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class ao2 implements j04 {

    /* renamed from: a */
    private final w04 f17206a;

    /* renamed from: b */
    private final w04 f17207b;

    /* renamed from: c */
    private final w04 f17208c;

    public ao2(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f17206a = w04Var;
        this.f17207b = w04Var2;
        this.f17208c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a */
    public final un2 zzb() {
        bk0 zzi;
        Context context = (Context) this.f17206a.zzb();
        ks2 ks2Var = (ks2) this.f17207b.zzb();
        ct2 ct2Var = (ct2) this.f17208c.zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21392u5)).booleanValue()) {
            zzi = zzt.zzo().m22936h().zzh();
        } else {
            zzi = zzt.zzo().m22936h().zzi();
        }
        boolean z11 = false;
        if (zzi != null && zzi.m20560h()) {
            z11 = true;
        }
        if (((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21412w5)).intValue() > 0) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21382t5)).booleanValue() || z11) {
                bt2 m21016a = ct2Var.m21016a(ss2.Rewarded, context, ks2Var, new ym2(new vm2()));
                kn2 kn2Var = new kn2(new jn2());
                os2 os2Var = m21016a.f17981a;
                uc3 uc3Var = kl0.f23363a;
                return new an2(kn2Var, new gn2(os2Var, uc3Var), m21016a.f17982b, m21016a.f17981a.zza().f32109w, uc3Var);
            }
        }
        return new jn2();
    }
}
