package com.google.android.gms.internal.ads;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.ci */
/* loaded from: classes2.dex */
public final class C4391ci {

    /* renamed from: a */
    private final Handler f18431a;

    /* renamed from: b */
    private final InterfaceC4428di f18432b;

    public C4391ci(Handler handler, InterfaceC4428di interfaceC4428di) {
        handler.getClass();
        this.f18431a = handler;
        this.f18432b = interfaceC4428di;
    }

    /* renamed from: b */
    public final void m20894b(int i11) {
        this.f18431a.post(new RunnableC4355bi(this, i11));
    }

    /* renamed from: c */
    public final void m20895c(int i11, long j11, long j12) {
        this.f18431a.post(new RunnableC5243zh(this, i11, j11, j12));
    }

    /* renamed from: d */
    public final void m20896d(String str, long j11, long j12) {
        this.f18431a.post(new RunnableC5169xh(this, str, j11, j12));
    }

    /* renamed from: e */
    public final void m20897e(C4356bj c4356bj) {
        this.f18431a.post(new RunnableC4318ai(this, c4356bj));
    }

    /* renamed from: f */
    public final void m20898f(C4356bj c4356bj) {
        this.f18431a.post(new RunnableC5132wh(this, c4356bj));
    }

    /* renamed from: g */
    public final void m20899g(zzasw zzaswVar) {
        this.f18431a.post(new RunnableC5206yh(this, zzaswVar));
    }
}
