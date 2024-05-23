package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class wl0 {

    /* renamed from: a */
    private final pl0 f29985a;

    /* renamed from: b */
    private final AtomicInteger f29986b;

    public wl0() {
        pl0 pl0Var = new pl0();
        this.f29985a = pl0Var;
        this.f29986b = new AtomicInteger(0);
        kc3.m23886r(pl0Var, new ul0(this), kl0.f23368f);
    }

    /* renamed from: a */
    public final int m27650a() {
        return this.f29986b.get();
    }

    /* renamed from: c */
    public final void m27651c() {
        this.f29985a.zze(new Exception());
    }

    /* renamed from: d */
    public final void m27652d(Object obj) {
        this.f29985a.zzd(obj);
    }

    /* renamed from: e */
    public final void m27653e(tl0 tl0Var, rl0 rl0Var) {
        kc3.m23886r(this.f29985a, new vl0(this, tl0Var, rl0Var), kl0.f23368f);
    }
}
