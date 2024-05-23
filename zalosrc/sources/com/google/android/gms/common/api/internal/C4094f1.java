package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C4086d;
import p342m6.C22890k;
import p704z4.C31257z;

/* renamed from: com.google.android.gms.common.api.internal.f1 */
/* loaded from: classes2.dex */
public final class C4094f1 extends AbstractC4147z0 {

    /* renamed from: c */
    public final C4086d.a f16303c;

    public C4094f1(C4086d.a aVar, C22890k c22890k) {
        super(4, c22890k);
        this.f16303c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo19389d(C4113m c4113m, boolean z11) {
    }

    @Override // p704z4.AbstractC31254w
    /* renamed from: f */
    public final boolean mo19396f(C4123p0 c4123p0) {
        C31257z c31257z = (C31257z) c4123p0.m19542t().get(this.f16303c);
        if (c31257z != null && c31257z.f144274a.m19407f()) {
            return true;
        }
        return false;
    }

    @Override // p704z4.AbstractC31254w
    /* renamed from: g */
    public final Feature[] mo19397g(C4123p0 c4123p0) {
        C31257z c31257z = (C31257z) c4123p0.m19542t().get(this.f16303c);
        if (c31257z == null) {
            return null;
        }
        return c31257z.f144274a.m19404c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4147z0
    /* renamed from: h */
    public final void mo19398h(C4123p0 c4123p0) {
        C31257z c31257z = (C31257z) c4123p0.m19542t().remove(this.f16303c);
        if (c31257z != null) {
            c31257z.f144275b.mo19445b(c4123p0.m19541r(), this.f16470b);
            c31257z.f144274a.m19402a();
        } else {
            this.f16470b.m117598e(Boolean.FALSE);
        }
    }
}
