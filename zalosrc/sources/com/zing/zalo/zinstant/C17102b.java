package com.zing.zalo.zinstant;

import ag0.C0815e1;
import uk0.InterfaceC27294h;

/* renamed from: com.zing.zalo.zinstant.b */
/* loaded from: classes7.dex */
public class C17102b implements InterfaceC27294h {

    /* renamed from: a */
    int f87472a;

    /* renamed from: b */
    private boolean f87473b = false;

    public C17102b(int i11) {
        this.f87472a = i11;
    }

    @Override // uk0.InterfaceC27294h
    /* renamed from: a */
    public void mo91458a() {
        this.f87473b = true;
        C0815e1.m2075D().m2096R(this.f87472a, System.currentTimeMillis());
    }

    @Override // uk0.InterfaceC27294h
    /* renamed from: b */
    public void mo91459b() {
    }

    @Override // uk0.InterfaceC27294h
    public boolean isRunning() {
        return this.f87473b;
    }

    @Override // uk0.InterfaceC27294h
    /* renamed from: z3 */
    public void mo91460z3() {
        this.f87473b = false;
        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
    }
}
