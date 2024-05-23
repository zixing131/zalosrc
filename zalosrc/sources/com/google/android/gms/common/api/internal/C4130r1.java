package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
import p704z4.AbstractC31243n0;
import p704z4.InterfaceC31253v;

/* renamed from: com.google.android.gms.common.api.internal.r1 */
/* loaded from: classes2.dex */
public final class C4130r1 implements InterfaceC31253v {

    /* renamed from: a */
    final /* synthetic */ C4104j f16432a;

    public /* synthetic */ C4130r1(C4104j c4104j, AbstractC31243n0 abstractC31243n0) {
        this.f16432a = c4104j;
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: a */
    public final void mo19423a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f16432a.f16355B;
        lock.lock();
        try {
            this.f16432a.f16367z = ConnectionResult.f16136t;
            C4104j.m19467w(this.f16432a);
        } finally {
            lock2 = this.f16432a.f16355B;
            lock2.unlock();
        }
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: b */
    public final void mo19424b(int i11, boolean z11) {
        Lock lock;
        Lock lock2;
        boolean z12;
        C4105j0 c4105j0;
        Lock lock3;
        lock = this.f16432a.f16355B;
        lock.lock();
        try {
            C4104j c4104j = this.f16432a;
            z12 = c4104j.f16354A;
            if (z12) {
                c4104j.f16354A = false;
                C4104j.m19465u(this.f16432a, i11, z11);
                lock3 = this.f16432a.f16355B;
            } else {
                c4104j.f16354A = true;
                c4105j0 = this.f16432a.f16360s;
                c4105j0.mo19482N(i11);
                lock3 = this.f16432a.f16355B;
            }
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f16432a.f16355B;
            lock2.unlock();
            throw th2;
        }
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: c */
    public final void mo19425c(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f16432a.f16355B;
        lock.lock();
        try {
            this.f16432a.f16367z = connectionResult;
            C4104j.m19467w(this.f16432a);
        } finally {
            lock2 = this.f16432a.f16355B;
            lock2.unlock();
        }
    }
}
