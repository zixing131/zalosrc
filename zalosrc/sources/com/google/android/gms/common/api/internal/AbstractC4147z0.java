package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p342m6.C22890k;
import p704z4.AbstractC31254w;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
/* loaded from: classes2.dex */
abstract class AbstractC4147z0 extends AbstractC31254w {

    /* renamed from: b */
    protected final C22890k f16470b;

    public AbstractC4147z0(int i11, C22890k c22890k) {
        super(i11);
        this.f16470b = c22890k;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: a */
    public final void mo19386a(Status status) {
        this.f16470b.m117597d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: b */
    public final void mo19387b(Exception exc) {
        this.f16470b.m117597d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4097g1
    /* renamed from: c */
    public final void mo19388c(C4123p0 c4123p0) {
        try {
            mo19398h(c4123p0);
        } catch (DeadObjectException e11) {
            mo19386a(AbstractC4097g1.m19429e(e11));
            throw e11;
        } catch (RemoteException e12) {
            mo19386a(AbstractC4097g1.m19429e(e12));
        } catch (RuntimeException e13) {
            this.f16470b.m117597d(e13);
        }
    }

    /* renamed from: h */
    protected abstract void mo19398h(C4123p0 c4123p0);
}
