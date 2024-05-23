package androidx.work.impl;

import androidx.work.WorkerParameters;
import fn0.AbstractC19074t;
import p565v2.RunnableC27469w;
import p565v2.RunnableC27471y;
import p595w2.InterfaceC28696c;

/* renamed from: androidx.work.impl.p0 */
/* loaded from: classes.dex */
public final class C2217p0 implements InterfaceC2215o0 {

    /* renamed from: a */
    private final C2226u f9293a;

    /* renamed from: b */
    private final InterfaceC28696c f9294b;

    public C2217p0(C2226u c2226u, InterfaceC28696c interfaceC28696c) {
        AbstractC19074t.m100208f(c2226u, "processor");
        AbstractC19074t.m100208f(interfaceC28696c, "workTaskExecutor");
        this.f9293a = c2226u;
        this.f9294b = interfaceC28696c;
    }

    @Override // androidx.work.impl.InterfaceC2215o0
    /* renamed from: a */
    public void mo11720a(C2155a0 c2155a0, WorkerParameters.C2133a c2133a) {
        AbstractC19074t.m100208f(c2155a0, "workSpecId");
        this.f9294b.mo143752d(new RunnableC27469w(this.f9293a, c2155a0, c2133a));
    }

    @Override // androidx.work.impl.InterfaceC2215o0
    /* renamed from: b */
    public /* synthetic */ void mo11721b(C2155a0 c2155a0, int i11) {
        AbstractC2213n0.m11719c(this, c2155a0, i11);
    }

    @Override // androidx.work.impl.InterfaceC2215o0
    /* renamed from: c */
    public /* synthetic */ void mo11722c(C2155a0 c2155a0) {
        AbstractC2213n0.m11717a(this, c2155a0);
    }

    @Override // androidx.work.impl.InterfaceC2215o0
    /* renamed from: d */
    public void mo11723d(C2155a0 c2155a0, int i11) {
        AbstractC19074t.m100208f(c2155a0, "workSpecId");
        this.f9294b.mo143752d(new RunnableC27471y(this.f9293a, c2155a0, false, i11));
    }

    @Override // androidx.work.impl.InterfaceC2215o0
    /* renamed from: e */
    public /* synthetic */ void mo11724e(C2155a0 c2155a0) {
        AbstractC2213n0.m11718b(this, c2155a0);
    }
}
