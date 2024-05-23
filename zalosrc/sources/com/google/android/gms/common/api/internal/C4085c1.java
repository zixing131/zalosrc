package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.common.api.internal.c1 */
/* loaded from: classes2.dex */
public final class C4085c1 extends AbstractC4097g1 {

    /* renamed from: b */
    protected final AbstractC4080b f16285b;

    public C4085c1(int i11, AbstractC4080b abstractC4080b) {
        super(i11);
        this.f16285b = (AbstractC4080b) AbstractC4205o.m19723l(abstractC4080b, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: a */
    public final void mo19386a(Status status) {
        try {
            this.f16285b.m19312v(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: b */
    public final void mo19387b(Exception exc) {
        try {
            this.f16285b.m19312v(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: c */
    public final void mo19388c(C4123p0 c4123p0) {
        try {
            this.f16285b.m19311t(c4123p0.m19541r());
        } catch (RuntimeException e11) {
            mo19387b(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: d */
    public final void mo19389d(C4113m c4113m, boolean z11) {
        c4113m.m19494c(this.f16285b, z11);
    }
}
