package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* loaded from: classes2.dex */
public final class C5604t1 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ Activity f32797t;

    /* renamed from: u */
    final /* synthetic */ String f32798u;

    /* renamed from: v */
    final /* synthetic */ String f32799v;

    /* renamed from: w */
    final /* synthetic */ C5656w2 f32800w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5604t1(C5656w2 c5656w2, Activity activity, String str, String str2) {
        super(c5656w2, true);
        this.f32800w = c5656w2;
        this.f32797t = activity;
        this.f32798u = str;
        this.f32799v = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        InterfaceC5383g1 interfaceC5383g1;
        interfaceC5383g1 = this.f32800w.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).setCurrentScreen(BinderC4273d.m19913I3(this.f32797t), this.f32798u, this.f32799v, this.f32471p);
    }
}
