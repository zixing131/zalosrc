package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k2 */
/* loaded from: classes2.dex */
public final class C5452k2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32449t;

    /* renamed from: u */
    final /* synthetic */ String f32450u;

    /* renamed from: v */
    final /* synthetic */ Object f32451v;

    /* renamed from: w */
    final /* synthetic */ boolean f32452w;

    /* renamed from: x */
    final /* synthetic */ C5656w2 f32453x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5452k2(C5656w2 c5656w2, String str, String str2, Object obj, boolean z11) {
        super(c5656w2, true);
        this.f32453x = c5656w2;
        this.f32449t = str;
        this.f32450u = str2;
        this.f32451v = obj;
        this.f32452w = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32453x.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).setUserProperty(this.f32449t, this.f32450u, BinderC4273d.m19913I3(this.f32451v), this.f32452w, this.f32471p);
    }
}
