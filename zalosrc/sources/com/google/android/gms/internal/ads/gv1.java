package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zmedia.player.ZMediaPlayer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gv1 extends e60 {

    /* renamed from: p */
    final /* synthetic */ Object f20915p;

    /* renamed from: q */
    final /* synthetic */ String f20916q;

    /* renamed from: r */
    final /* synthetic */ long f20917r;

    /* renamed from: s */
    final /* synthetic */ kw2 f20918s;

    /* renamed from: t */
    final /* synthetic */ pl0 f20919t;

    /* renamed from: u */
    final /* synthetic */ hv1 f20920u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gv1(hv1 hv1Var, Object obj, String str, long j11, kw2 kw2Var, pl0 pl0Var) {
        this.f20920u = hv1Var;
        this.f20915p = obj;
        this.f20916q = str;
        this.f20917r = j11;
        this.f20918s = kw2Var;
        this.f20919t = pl0Var;
    }

    @Override // com.google.android.gms.internal.ads.f60
    /* renamed from: c */
    public final void mo21271c(String str) {
        mt1 mt1Var;
        te1 te1Var;
        xw2 xw2Var;
        synchronized (this.f20915p) {
            this.f20920u.m23042v(this.f20916q, false, str, (int) (zzt.zzB().mo105914b() - this.f20917r));
            mt1Var = this.f20920u.f21922l;
            mt1Var.m24710b(this.f20916q, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            te1Var = this.f20920u.f21925o;
            te1Var.mo26464c(this.f20916q, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            xw2Var = this.f20920u.f21926p;
            kw2 kw2Var = this.f20918s;
            kw2Var.mo23067q(false);
            xw2Var.m28055b(kw2Var.zzj());
            this.f20919t.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.f60
    public final void zzf() {
        mt1 mt1Var;
        te1 te1Var;
        xw2 xw2Var;
        synchronized (this.f20915p) {
            this.f20920u.m23042v(this.f20916q, true, "", (int) (zzt.zzB().mo105914b() - this.f20917r));
            mt1Var = this.f20920u.f21922l;
            mt1Var.m24712d(this.f20916q);
            te1Var = this.f20920u.f21925o;
            te1Var.mo26465o(this.f20916q);
            xw2Var = this.f20920u.f21926p;
            kw2 kw2Var = this.f20918s;
            kw2Var.mo23067q(true);
            xw2Var.m28055b(kw2Var.zzj());
            this.f20919t.zzd(Boolean.TRUE);
        }
    }
}
