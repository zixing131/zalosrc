package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;
import p669y4.InterfaceC30289f;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4080b extends BasePendingResult {

    /* renamed from: n */
    private final C4071a.c f16237n;

    /* renamed from: o */
    private final C4071a f16238o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4080b(C4071a c4071a, AbstractC4073c abstractC4073c) {
        super((AbstractC4073c) AbstractC4205o.m19723l(abstractC4073c, "GoogleApiClient must not be null"));
        AbstractC4205o.m19723l(c4071a, "Api must not be null");
        this.f16237n = c4071a.m19227b();
        this.f16238o = c4071a;
    }

    /* renamed from: u */
    private void m19306u(RemoteException remoteException) {
        m19312v(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* renamed from: p */
    protected abstract void mo19307p(C4071a.b bVar);

    /* renamed from: q */
    public final C4071a m19308q() {
        return this.f16238o;
    }

    /* renamed from: r */
    public final C4071a.c m19309r() {
        return this.f16237n;
    }

    /* renamed from: s */
    protected void m19310s(InterfaceC30289f interfaceC30289f) {
    }

    /* renamed from: t */
    public final void m19311t(C4071a.b bVar) {
        try {
            mo19307p(bVar);
        } catch (DeadObjectException e11) {
            m19306u(e11);
            throw e11;
        } catch (RemoteException e12) {
            m19306u(e12);
        }
    }

    /* renamed from: v */
    public final void m19312v(Status status) {
        AbstractC4205o.m19713b(!status.m19223M(), "Failed result must not be success");
        InterfaceC30289f mo19279d = mo19279d(status);
        m19283h(mo19279d);
        m19310s(mo19279d);
    }
}
