package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* loaded from: classes2.dex */
public final class C5401h2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32395t;

    /* renamed from: u */
    final /* synthetic */ BinderC5315c1 f32396u;

    /* renamed from: v */
    final /* synthetic */ C5656w2 f32397v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5401h2(C5656w2 c5656w2, String str, BinderC5315c1 binderC5315c1) {
        super(c5656w2, true);
        this.f32397v = c5656w2;
        this.f32395t = str;
        this.f32396u = binderC5315c1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32397v.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).getMaxUserProperties(this.f32395t, this.f32396u);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: b */
    protected final void mo28859b() {
        this.f32396u.mo28962J(null);
    }
}
