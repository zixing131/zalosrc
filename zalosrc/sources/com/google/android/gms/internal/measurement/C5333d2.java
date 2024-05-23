package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d2 */
/* loaded from: classes2.dex */
public final class C5333d2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32328t;

    /* renamed from: u */
    final /* synthetic */ String f32329u;

    /* renamed from: v */
    final /* synthetic */ boolean f32330v;

    /* renamed from: w */
    final /* synthetic */ BinderC5315c1 f32331w;

    /* renamed from: x */
    final /* synthetic */ C5656w2 f32332x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5333d2(C5656w2 c5656w2, String str, String str2, boolean z11, BinderC5315c1 binderC5315c1) {
        super(c5656w2, true);
        this.f32332x = c5656w2;
        this.f32328t = str;
        this.f32329u = str2;
        this.f32330v = z11;
        this.f32331w = binderC5315c1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32332x.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).getUserProperties(this.f32328t, this.f32329u, this.f32330v, this.f32331w);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: b */
    protected final void mo28859b() {
        this.f32331w.mo28962J(null);
    }
}
