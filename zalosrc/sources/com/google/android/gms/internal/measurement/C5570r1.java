package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* loaded from: classes2.dex */
public final class C5570r1 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32757t;

    /* renamed from: u */
    final /* synthetic */ String f32758u;

    /* renamed from: v */
    final /* synthetic */ Bundle f32759v;

    /* renamed from: w */
    final /* synthetic */ C5656w2 f32760w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5570r1(C5656w2 c5656w2, String str, String str2, Bundle bundle) {
        super(c5656w2, true);
        this.f32760w = c5656w2;
        this.f32757t = str;
        this.f32758u = str2;
        this.f32759v = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32760w.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).clearConditionalUserProperty(this.f32757t, this.f32758u, this.f32759v);
    }
}
