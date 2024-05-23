package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class iu1 {

    /* renamed from: a */
    private final f50 f22492a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public iu1(f50 f50Var) {
        this.f22492a = f50Var;
    }

    /* renamed from: s */
    private final void m23404s(hu1 hu1Var) {
        String m23016a = hu1.m23016a(hu1Var);
        yk0.zzi("Dispatching AFMA event on publisher webview: ".concat(m23016a));
        this.f22492a.zzb(m23016a);
    }

    /* renamed from: a */
    public final void m23405a() {
        m23404s(new hu1("initialize", null));
    }

    /* renamed from: b */
    public final void m23406b(long j11) {
        hu1 hu1Var = new hu1("interstitial", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onAdClicked";
        this.f22492a.zzb(hu1.m23016a(hu1Var));
    }

    /* renamed from: c */
    public final void m23407c(long j11) {
        hu1 hu1Var = new hu1("interstitial", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onAdClosed";
        m23404s(hu1Var);
    }

    /* renamed from: d */
    public final void m23408d(long j11, int i11) {
        hu1 hu1Var = new hu1("interstitial", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onAdFailedToLoad";
        hu1Var.f21907d = Integer.valueOf(i11);
        m23404s(hu1Var);
    }

    /* renamed from: e */
    public final void m23409e(long j11) {
        hu1 hu1Var = new hu1("interstitial", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onAdLoaded";
        m23404s(hu1Var);
    }

    /* renamed from: f */
    public final void m23410f(long j11) {
        hu1 hu1Var = new hu1("interstitial", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onNativeAdObjectNotAvailable";
        m23404s(hu1Var);
    }

    /* renamed from: g */
    public final void m23411g(long j11) {
        hu1 hu1Var = new hu1("interstitial", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onAdOpened";
        m23404s(hu1Var);
    }

    /* renamed from: h */
    public final void m23412h(long j11) {
        hu1 hu1Var = new hu1("creation", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "nativeObjectCreated";
        m23404s(hu1Var);
    }

    /* renamed from: i */
    public final void m23413i(long j11) {
        hu1 hu1Var = new hu1("creation", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "nativeObjectNotCreated";
        m23404s(hu1Var);
    }

    /* renamed from: j */
    public final void m23414j(long j11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onAdClicked";
        m23404s(hu1Var);
    }

    /* renamed from: k */
    public final void m23415k(long j11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onRewardedAdClosed";
        m23404s(hu1Var);
    }

    /* renamed from: l */
    public final void m23416l(long j11, rg0 rg0Var) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onUserEarnedReward";
        hu1Var.f21908e = rg0Var.zzf();
        hu1Var.f21909f = Integer.valueOf(rg0Var.zze());
        m23404s(hu1Var);
    }

    /* renamed from: m */
    public final void m23417m(long j11, int i11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onRewardedAdFailedToLoad";
        hu1Var.f21907d = Integer.valueOf(i11);
        m23404s(hu1Var);
    }

    /* renamed from: n */
    public final void m23418n(long j11, int i11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onRewardedAdFailedToShow";
        hu1Var.f21907d = Integer.valueOf(i11);
        m23404s(hu1Var);
    }

    /* renamed from: o */
    public final void m23419o(long j11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onAdImpression";
        m23404s(hu1Var);
    }

    /* renamed from: p */
    public final void m23420p(long j11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onRewardedAdLoaded";
        m23404s(hu1Var);
    }

    /* renamed from: q */
    public final void m23421q(long j11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onNativeAdObjectNotAvailable";
        m23404s(hu1Var);
    }

    /* renamed from: r */
    public final void m23422r(long j11) {
        hu1 hu1Var = new hu1("rewarded", null);
        hu1Var.f21904a = Long.valueOf(j11);
        hu1Var.f21906c = "onRewardedAdOpened";
        m23404s(hu1Var);
    }
}
