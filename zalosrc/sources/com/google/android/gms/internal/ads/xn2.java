package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public abstract class xn2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static un2 m27942a(Context context, ks2 ks2Var, ct2 ct2Var) {
        return m27944c(context, ks2Var, ct2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static un2 m27943b(Context context, ks2 ks2Var, ct2 ct2Var) {
        return m27944c(context, ks2Var, ct2Var);
    }

    /* renamed from: c */
    private static un2 m27944c(Context context, ks2 ks2Var, ct2 ct2Var) {
        bk0 zzi;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21392u5)).booleanValue()) {
            zzi = zzt.zzo().m22936h().zzh();
        } else {
            zzi = zzt.zzo().m22936h().zzi();
        }
        boolean z11 = false;
        if (zzi != null && zzi.m20560h()) {
            z11 = true;
        }
        if (((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21037K5)).intValue() > 0) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21382t5)).booleanValue() || z11) {
                bt2 m21016a = ct2Var.m21016a(ss2.AppOpen, context, ks2Var, new ym2(new vm2()));
                kn2 kn2Var = new kn2(new jn2());
                os2 os2Var = m21016a.f17981a;
                uc3 uc3Var = kl0.f23363a;
                return new an2(kn2Var, new gn2(os2Var, uc3Var), m21016a.f17982b, m21016a.f17981a.zza().f32109w, uc3Var);
            }
        }
        return new jn2();
    }
}
