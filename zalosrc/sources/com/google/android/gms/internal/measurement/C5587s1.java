package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* loaded from: classes2.dex */
public final class C5587s1 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32777t;

    /* renamed from: u */
    final /* synthetic */ String f32778u;

    /* renamed from: v */
    final /* synthetic */ BinderC5315c1 f32779v;

    /* renamed from: w */
    final /* synthetic */ C5656w2 f32780w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5587s1(C5656w2 c5656w2, String str, String str2, BinderC5315c1 binderC5315c1) {
        super(c5656w2, true);
        this.f32780w = c5656w2;
        this.f32777t = str;
        this.f32778u = str2;
        this.f32779v = binderC5315c1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32780w.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).getConditionalUserProperties(this.f32777t, this.f32778u, this.f32779v);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: b */
    protected final void mo28859b() {
        this.f32779v.mo28962J(null);
    }
}
