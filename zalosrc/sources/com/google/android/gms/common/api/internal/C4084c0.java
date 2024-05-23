package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import java.util.Collections;
import java.util.Iterator;
import p704z4.InterfaceC31246p;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes2.dex */
public final class C4084c0 implements InterfaceC31246p {

    /* renamed from: a */
    private final C4105j0 f16284a;

    public C4084c0(C4105j0 c4105j0) {
        this.f16284a = c4105j0;
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: a */
    public final void mo19341a(Bundle bundle) {
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: b */
    public final void mo19342b() {
        Iterator it = this.f16284a.f16377u.values().iterator();
        while (it.hasNext()) {
            ((C4071a.f) it.next()).disconnect();
        }
        this.f16284a.f16370C.f16328p = Collections.emptySet();
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: c */
    public final void mo19343c() {
        this.f16284a.m19484k();
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: d */
    public final void mo19344d(ConnectionResult connectionResult, C4071a c4071a, boolean z11) {
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: e */
    public final void mo19345e(int i11) {
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: f */
    public final boolean mo19346f() {
        return true;
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: g */
    public final AbstractC4080b mo19347g(AbstractC4080b abstractC4080b) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
