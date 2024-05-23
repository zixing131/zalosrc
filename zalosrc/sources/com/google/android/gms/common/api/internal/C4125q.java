package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Iterator;
import java.util.Set;
import p664y.AbstractC30228a;
import p704z4.InterfaceC31246p;

/* renamed from: com.google.android.gms.common.api.internal.q */
/* loaded from: classes2.dex */
public final class C4125q implements InterfaceC31246p {

    /* renamed from: a */
    private final C4105j0 f16424a;

    /* renamed from: b */
    private boolean f16425b = false;

    public C4125q(C4105j0 c4105j0) {
        this.f16424a = c4105j0;
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: a */
    public final void mo19341a(Bundle bundle) {
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: b */
    public final void mo19342b() {
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: c */
    public final void mo19343c() {
        if (this.f16425b) {
            this.f16425b = false;
            this.f16424a.m19486m(new C4122p(this, this));
        }
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: d */
    public final void mo19344d(ConnectionResult connectionResult, C4071a c4071a, boolean z11) {
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: e */
    public final void mo19345e(int i11) {
        this.f16424a.m19485l(null);
        this.f16424a.f16371D.mo19424b(i11, this.f16425b);
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: f */
    public final boolean mo19346f() {
        if (this.f16425b) {
            return false;
        }
        Set set = this.f16424a.f16370C.f16335w;
        if (set != null && !set.isEmpty()) {
            this.f16425b = true;
            Iterator it = set.iterator();
            if (!it.hasNext()) {
                return false;
            }
            AbstractC30228a.m149044a(it.next());
            throw null;
        }
        this.f16424a.m19485l(null);
        return true;
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: g */
    public final AbstractC4080b mo19347g(AbstractC4080b abstractC4080b) {
        try {
            this.f16424a.f16370C.f16336x.m19348a(abstractC4080b);
            C4096g0 c4096g0 = this.f16424a.f16370C;
            C4071a.f fVar = (C4071a.f) c4096g0.f16327o.get(abstractC4080b.m19309r());
            AbstractC4205o.m19723l(fVar, "Appropriate Api was not requested.");
            if (!fVar.isConnected() && this.f16424a.f16378v.containsKey(abstractC4080b.m19309r())) {
                abstractC4080b.m19312v(new Status(17));
            } else {
                abstractC4080b.m19311t(fVar);
            }
        } catch (DeadObjectException unused) {
            this.f16424a.m19486m(new C4119o(this, this));
        }
        return abstractC4080b;
    }
}
