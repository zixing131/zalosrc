package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes2.dex */
public final class C5350e2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32349t;

    /* renamed from: u */
    final /* synthetic */ Object f32350u;

    /* renamed from: v */
    final /* synthetic */ C5656w2 f32351v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5350e2(C5656w2 c5656w2, boolean z11, int i11, String str, Object obj, Object obj2, Object obj3) {
        super(c5656w2, false);
        this.f32351v = c5656w2;
        this.f32349t = str;
        this.f32350u = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32351v.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).logHealthData(5, this.f32349t, BinderC4273d.m19913I3(this.f32350u), BinderC4273d.m19913I3(null), BinderC4273d.m19913I3(null));
    }
}
