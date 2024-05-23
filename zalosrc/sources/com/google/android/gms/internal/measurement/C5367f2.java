package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f2 */
/* loaded from: classes2.dex */
public final class C5367f2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ Bundle f32366t;

    /* renamed from: u */
    final /* synthetic */ BinderC5315c1 f32367u;

    /* renamed from: v */
    final /* synthetic */ C5656w2 f32368v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5367f2(C5656w2 c5656w2, Bundle bundle, BinderC5315c1 binderC5315c1) {
        super(c5656w2, true);
        this.f32368v = c5656w2;
        this.f32366t = bundle;
        this.f32367u = binderC5315c1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32368v.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).performAction(this.f32366t, this.f32367u, this.f32471p);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: b */
    protected final void mo28859b() {
        this.f32367u.mo28962J(null);
    }
}
