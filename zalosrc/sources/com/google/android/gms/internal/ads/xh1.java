package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* loaded from: classes2.dex */
public final class xh1 implements w71, ze1 {

    /* renamed from: p */
    private final li0 f30449p;

    /* renamed from: q */
    private final Context f30450q;

    /* renamed from: r */
    private final dj0 f30451r;

    /* renamed from: s */
    private final View f30452s;

    /* renamed from: t */
    private String f30453t;

    /* renamed from: u */
    private final EnumC5180xs f30454u;

    public xh1(li0 li0Var, Context context, dj0 dj0Var, View view, EnumC5180xs enumC5180xs) {
        this.f30449p = li0Var;
        this.f30450q = context;
        this.f30451r = dj0Var;
        this.f30452s = view;
        this.f30454u = enumC5180xs;
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: G */
    public final void mo20101G(cg0 cg0Var, String str, String str2) {
        if (this.f30451r.m21425z(this.f30450q)) {
            try {
                dj0 dj0Var = this.f30451r;
                Context context = this.f30450q;
                dj0Var.m21419t(context, dj0Var.m21405f(context), this.f30449p.m24294a(), cg0Var.zzc(), cg0Var.zzb());
            } catch (RemoteException e11) {
                yk0.zzk("Remote Exception to get reward item.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: Q */
    public final void mo20102Q() {
    }

    @Override // com.google.android.gms.internal.ads.ze1
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.ze1
    public final void zzg() {
        String str;
        if (this.f30454u == EnumC5180xs.APP_OPEN) {
            return;
        }
        String m21408i = this.f30451r.m21408i(this.f30450q);
        this.f30453t = m21408i;
        if (this.f30454u == EnumC5180xs.REWARD_BASED_VIDEO_AD) {
            str = "/Rewarded";
        } else {
            str = "/Interstitial";
        }
        this.f30453t = String.valueOf(m21408i).concat(str);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzj() {
        this.f30449p.m24295c(false);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzo() {
        View view = this.f30452s;
        if (view != null && this.f30453t != null) {
            this.f30451r.m21423x(view.getContext(), this.f30453t);
        }
        this.f30449p.m24295c(true);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzr() {
    }
}
