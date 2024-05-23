package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
/* loaded from: classes.dex */
final class C5520o2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ Activity f32694t;

    /* renamed from: u */
    final /* synthetic */ C5639v2 f32695u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5520o2(C5639v2 c5639v2, Activity activity) {
        super(c5639v2.f32850p, true);
        this.f32695u = c5639v2;
        this.f32694t = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32695u.f32850p.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).onActivityStarted(BinderC4273d.m19913I3(this.f32694t), this.f32472q);
    }
}
