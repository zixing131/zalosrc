package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* loaded from: classes2.dex */
public final class C5621u1 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ Bundle f32819t;

    /* renamed from: u */
    final /* synthetic */ C5656w2 f32820u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5621u1(C5656w2 c5656w2, Bundle bundle) {
        super(c5656w2, true);
        this.f32820u = c5656w2;
        this.f32819t = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32820u.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).setConsent(this.f32819t, this.f32471p);
    }
}
