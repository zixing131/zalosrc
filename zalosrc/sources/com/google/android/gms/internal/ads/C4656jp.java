package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.jp */
/* loaded from: classes2.dex */
public final class C4656jp {

    /* renamed from: a */
    private final Handler f22912a;

    /* renamed from: b */
    private final InterfaceC4693kp f22913b;

    public C4656jp(Handler handler, InterfaceC4693kp interfaceC4693kp) {
        handler.getClass();
        this.f22912a = handler;
        this.f22913b = interfaceC4693kp;
    }

    /* renamed from: b */
    public final void m23703b(String str, long j11, long j12) {
        this.f22912a.post(new RunnableC4435dp(this, str, j11, j12));
    }

    /* renamed from: c */
    public final void m23704c(C4356bj c4356bj) {
        this.f22912a.post(new RunnableC4620ip(this, c4356bj));
    }

    /* renamed from: d */
    public final void m23705d(int i11, long j11) {
        this.f22912a.post(new RunnableC4509fp(this, i11, j11));
    }

    /* renamed from: e */
    public final void m23706e(C4356bj c4356bj) {
        this.f22912a.post(new RunnableC4398cp(this, c4356bj));
    }

    /* renamed from: f */
    public final void m23707f(zzasw zzaswVar) {
        this.f22912a.post(new RunnableC4472ep(this, zzaswVar));
    }

    /* renamed from: g */
    public final void m23708g(Surface surface) {
        this.f22912a.post(new RunnableC4583hp(this, surface));
    }

    /* renamed from: h */
    public final void m23709h(int i11, int i12, int i13, float f11) {
        this.f22912a.post(new RunnableC4546gp(this, i11, i12, i13, f11));
    }
}
