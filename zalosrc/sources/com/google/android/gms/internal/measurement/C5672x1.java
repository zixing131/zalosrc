package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* loaded from: classes2.dex */
public final class C5672x1 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32894t;

    /* renamed from: u */
    final /* synthetic */ C5656w2 f32895u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5672x1(C5656w2 c5656w2, String str) {
        super(c5656w2, true);
        this.f32895u = c5656w2;
        this.f32894t = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32895u.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).endAdUnitExposure(this.f32894t, this.f32472q);
    }
}
