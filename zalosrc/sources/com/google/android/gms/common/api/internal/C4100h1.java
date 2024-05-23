package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;

/* renamed from: com.google.android.gms.common.api.internal.h1 */
/* loaded from: classes2.dex */
public final class C4100h1 implements AbstractC4073c.c {

    /* renamed from: p */
    public final int f16347p;

    /* renamed from: q */
    public final AbstractC4073c f16348q;

    /* renamed from: r */
    public final AbstractC4073c.c f16349r;

    /* renamed from: s */
    final /* synthetic */ C4103i1 f16350s;

    public C4100h1(C4103i1 c4103i1, int i11, AbstractC4073c abstractC4073c, AbstractC4073c.c cVar) {
        this.f16350s = c4103i1;
        this.f16347p = i11;
        this.f16348q = abstractC4073c;
        this.f16349r = cVar;
    }

    @Override // p704z4.InterfaceC31228g
    /* renamed from: Q */
    public final void mo19443Q(ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f16350s.m19504s(connectionResult, this.f16347p);
    }
}
