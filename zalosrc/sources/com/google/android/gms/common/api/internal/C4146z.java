package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import java.util.concurrent.locks.Lock;
import p257j6.InterfaceC20935e;
import p704z4.AbstractC31242n;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* loaded from: classes2.dex */
final class C4146z implements AbstractC4073c.b, AbstractC4073c.c {

    /* renamed from: p */
    final /* synthetic */ C4081b0 f16469p;

    public /* synthetic */ C4146z(C4081b0 c4081b0, AbstractC31242n abstractC31242n) {
        this.f16469p = c4081b0;
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: E */
    public final void mo19480E(Bundle bundle) {
        C4175e c4175e;
        InterfaceC20935e interfaceC20935e;
        c4175e = this.f16469p.f16256r;
        interfaceC20935e = this.f16469p.f16249k;
        ((InterfaceC20935e) AbstractC4205o.m19722k(interfaceC20935e)).mo31519e(new BinderC4144y(this.f16469p));
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: N */
    public final void mo19482N(int i11) {
    }

    @Override // p704z4.InterfaceC31228g
    /* renamed from: Q */
    public final void mo19443Q(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean m19330p;
        Lock lock3;
        lock = this.f16469p.f16240b;
        lock.lock();
        try {
            m19330p = this.f16469p.m19330p(connectionResult);
            if (m19330p) {
                this.f16469p.m19322h();
                this.f16469p.m19327m();
            } else {
                this.f16469p.m19325k(connectionResult);
            }
            lock3 = this.f16469p.f16240b;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f16469p.f16240b;
            lock2.unlock();
            throw th2;
        }
    }
}
