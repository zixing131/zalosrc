package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import p704z4.InterfaceC31246p;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes2.dex */
final class C4134t extends AbstractC4099h0 {

    /* renamed from: b */
    final /* synthetic */ ConnectionResult f16445b;

    /* renamed from: c */
    final /* synthetic */ C4138v f16446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4134t(C4138v c4138v, InterfaceC31246p interfaceC31246p, ConnectionResult connectionResult) {
        super(interfaceC31246p);
        this.f16446c = c4138v;
        this.f16445b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4099h0
    /* renamed from: a */
    public final void mo19441a() {
        this.f16446c.f16456r.m19325k(this.f16445b);
    }
}
