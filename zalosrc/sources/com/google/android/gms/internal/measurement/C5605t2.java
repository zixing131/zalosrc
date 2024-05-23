package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* loaded from: classes2.dex */
final class C5605t2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ Activity f32801t;

    /* renamed from: u */
    final /* synthetic */ BinderC5315c1 f32802u;

    /* renamed from: v */
    final /* synthetic */ C5639v2 f32803v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5605t2(C5639v2 c5639v2, Activity activity, BinderC5315c1 binderC5315c1) {
        super(c5639v2.f32850p, true);
        this.f32803v = c5639v2;
        this.f32801t = activity;
        this.f32802u = binderC5315c1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32803v.f32850p.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).onActivitySaveInstanceState(BinderC4273d.m19913I3(this.f32801t), this.f32802u, this.f32472q);
    }
}
