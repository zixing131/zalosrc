package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C4086d;
import p342m6.C22890k;
import p704z4.C31257z;

/* renamed from: com.google.android.gms.common.api.internal.d1 */
/* loaded from: classes2.dex */
public final class C4088d1 extends AbstractC4147z0 {

    /* renamed from: c */
    public final C31257z f16292c;

    public C4088d1(C31257z c31257z, C22890k c22890k) {
        super(3, c22890k);
        this.f16292c = c31257z;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo19389d(C4113m c4113m, boolean z11) {
    }

    @Override // p704z4.AbstractC31254w
    /* renamed from: f */
    public final boolean mo19396f(C4123p0 c4123p0) {
        return this.f16292c.f144274a.m19407f();
    }

    @Override // p704z4.AbstractC31254w
    /* renamed from: g */
    public final Feature[] mo19397g(C4123p0 c4123p0) {
        return this.f16292c.f144274a.m19404c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4147z0
    /* renamed from: h */
    public final void mo19398h(C4123p0 c4123p0) {
        this.f16292c.f144274a.mo19405d(c4123p0.m19541r(), this.f16470b);
        C4086d.a m19403b = this.f16292c.f144274a.m19403b();
        if (m19403b != null) {
            c4123p0.m19542t().put(m19403b, this.f16292c);
        }
    }
}
