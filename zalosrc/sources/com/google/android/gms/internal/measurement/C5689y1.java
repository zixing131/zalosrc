package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.y1 */
/* loaded from: classes2.dex */
public final class C5689y1 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ BinderC5315c1 f32924t;

    /* renamed from: u */
    final /* synthetic */ C5656w2 f32925u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5689y1(C5656w2 c5656w2, BinderC5315c1 binderC5315c1) {
        super(c5656w2, true);
        this.f32925u = c5656w2;
        this.f32924t = binderC5315c1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32925u.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).getGmpAppId(this.f32924t);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: b */
    protected final void mo28859b() {
        this.f32924t.mo28962J(null);
    }
}
