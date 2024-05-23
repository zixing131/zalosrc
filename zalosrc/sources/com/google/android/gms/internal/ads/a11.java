package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public final class a11 extends v31 {

    /* renamed from: i */
    private final View f16867i;

    /* renamed from: j */
    private final zq0 f16868j;

    /* renamed from: k */
    private final jq2 f16869k;

    /* renamed from: l */
    private final int f16870l;

    /* renamed from: m */
    private final boolean f16871m;

    /* renamed from: n */
    private final boolean f16872n;

    /* renamed from: o */
    private final s01 f16873o;

    /* renamed from: p */
    private C4807nr f16874p;

    public a11(u31 u31Var, View view, zq0 zq0Var, jq2 jq2Var, int i11, boolean z11, boolean z12, s01 s01Var) {
        super(u31Var);
        this.f16867i = view;
        this.f16868j = zq0Var;
        this.f16869k = jq2Var;
        this.f16870l = i11;
        this.f16871m = z11;
        this.f16872n = z12;
        this.f16873o = s01Var;
    }

    /* renamed from: h */
    public final int m19945h() {
        return this.f16870l;
    }

    /* renamed from: i */
    public final View m19946i() {
        return this.f16867i;
    }

    /* renamed from: j */
    public final jq2 m19947j() {
        return hr2.m23006b(this.f29153b.f22347s, this.f16869k);
    }

    /* renamed from: k */
    public final void m19948k(InterfaceC4437dr interfaceC4437dr) {
        this.f16868j.mo26708u0(interfaceC4437dr);
    }

    /* renamed from: l */
    public final boolean m19949l() {
        return this.f16871m;
    }

    /* renamed from: m */
    public final boolean m19950m() {
        return this.f16872n;
    }

    /* renamed from: n */
    public final boolean m19951n() {
        if (this.f16868j.mo26696f()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m19952o() {
        if (this.f16868j.zzP() != null && this.f16868j.zzP().mo23370h()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m19953p(long j11, int i11) {
        this.f16873o.m26220a(j11, i11);
    }

    /* renamed from: q */
    public final C4807nr m19954q() {
        return this.f16874p;
    }

    /* renamed from: r */
    public final void m19955r(C4807nr c4807nr) {
        this.f16874p = c4807nr;
    }
}
