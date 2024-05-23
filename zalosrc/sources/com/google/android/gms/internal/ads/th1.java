package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public final class th1 implements l91, zzo, q81 {

    /* renamed from: p */
    private final Context f28331p;

    /* renamed from: q */
    private final zq0 f28332q;

    /* renamed from: r */
    private final iq2 f28333r;

    /* renamed from: s */
    private final zzcgv f28334s;

    /* renamed from: t */
    private final EnumC5180xs f28335t;

    /* renamed from: u */
    InterfaceC4271b f28336u;

    public th1(Context context, zq0 zq0Var, iq2 iq2Var, zzcgv zzcgvVar, EnumC5180xs enumC5180xs) {
        this.f28331p = context;
        this.f28332q = zq0Var;
        this.f28333r = iq2Var;
        this.f28334s = zzcgvVar;
        this.f28335t = enumC5180xs;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if (this.f28336u != null && this.f28332q != null) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21301l4)).booleanValue()) {
                this.f28332q.mo23552V("onSdkImpression", new C30239a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i11) {
        this.f28336u = null;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        if (this.f28336u != null && this.f28332q != null) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21301l4)).booleanValue()) {
                this.f28332q.mo23552V("onSdkImpression", new C30239a());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        b32 b32Var;
        b32 b32Var2;
        a32 a32Var;
        EnumC5180xs enumC5180xs = this.f28335t;
        if ((enumC5180xs == EnumC5180xs.REWARD_BASED_VIDEO_AD || enumC5180xs == EnumC5180xs.INTERSTITIAL || enumC5180xs == EnumC5180xs.APP_OPEN) && this.f28333r.f22307U && this.f28332q != null && zzt.zzA().mo27818d(this.f28331p)) {
            zzcgv zzcgvVar = this.f28334s;
            String str = zzcgvVar.f32031q + "." + zzcgvVar.f32032r;
            String m22515a = this.f28333r.f22309W.m22515a();
            if (this.f28333r.f22309W.m22516b() == 1) {
                a32Var = a32.VIDEO;
                b32Var2 = b32.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.f28333r.f22312Z == 2) {
                    b32Var = b32.UNSPECIFIED;
                } else {
                    b32Var = b32.BEGIN_TO_RENDER;
                }
                b32Var2 = b32Var;
                a32Var = a32.HTML_DISPLAY;
            }
            InterfaceC4271b mo27815a = zzt.zzA().mo27815a(str, this.f28332q.mo26701m(), "", "javascript", m22515a, b32Var2, a32Var, this.f28333r.f22340n0);
            this.f28336u = mo27815a;
            if (mo27815a != null) {
                zzt.zzA().mo27817c(this.f28336u, (View) this.f28332q);
                this.f28332q.mo26698g0(this.f28336u);
                zzt.zzA().zzd(this.f28336u);
                this.f28332q.mo23552V("onSdkLoaded", new C30239a());
            }
        }
    }
}
