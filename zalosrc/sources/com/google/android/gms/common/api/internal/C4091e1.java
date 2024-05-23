package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import p342m6.C22890k;
import p704z4.AbstractC31254w;
import p704z4.InterfaceC31234j;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
/* loaded from: classes2.dex */
public final class C4091e1 extends AbstractC31254w {

    /* renamed from: b */
    private final AbstractC4098h f16295b;

    /* renamed from: c */
    private final C22890k f16296c;

    /* renamed from: d */
    private final InterfaceC31234j f16297d;

    public C4091e1(int i11, AbstractC4098h abstractC4098h, C22890k c22890k, InterfaceC31234j interfaceC31234j) {
        super(i11);
        this.f16296c = c22890k;
        this.f16295b = abstractC4098h;
        this.f16297d = interfaceC31234j;
        if (i11 == 2 && abstractC4098h.m19432c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: a */
    public final void mo19386a(Status status) {
        this.f16296c.m117597d(this.f16297d.mo152099a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: b */
    public final void mo19387b(Exception exc) {
        this.f16296c.m117597d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: c */
    public final void mo19388c(C4123p0 c4123p0) {
        try {
            this.f16295b.mo19431b(c4123p0.m19541r(), this.f16296c);
        } catch (DeadObjectException e11) {
            throw e11;
        } catch (RemoteException e12) {
            mo19386a(AbstractC4097g1.m19429e(e12));
        } catch (RuntimeException e13) {
            this.f16296c.m117597d(e13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: d */
    public final void mo19389d(C4113m c4113m, boolean z11) {
        c4113m.m19495d(this.f16296c, z11);
    }

    @Override // p704z4.AbstractC31254w
    /* renamed from: f */
    public final boolean mo19396f(C4123p0 c4123p0) {
        return this.f16295b.m19432c();
    }

    @Override // p704z4.AbstractC31254w
    /* renamed from: g */
    public final Feature[] mo19397g(C4123p0 c4123p0) {
        return this.f16295b.m19434e();
    }
}
