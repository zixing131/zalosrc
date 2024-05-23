package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* loaded from: classes.dex */
public final class C5418i2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ BinderC5486m2 f32412t;

    /* renamed from: u */
    final /* synthetic */ C5656w2 f32413u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5418i2(C5656w2 c5656w2, BinderC5486m2 binderC5486m2) {
        super(c5656w2, true);
        this.f32413u = c5656w2;
        this.f32412t = binderC5486m2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32413u.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).registerOnMeasurementEventListener(this.f32412t);
    }
}
