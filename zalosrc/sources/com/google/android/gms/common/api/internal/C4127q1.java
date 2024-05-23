package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
import p704z4.AbstractC31241m0;
import p704z4.InterfaceC31253v;

/* renamed from: com.google.android.gms.common.api.internal.q1 */
/* loaded from: classes2.dex */
public final class C4127q1 implements InterfaceC31253v {

    /* renamed from: a */
    final /* synthetic */ C4104j f16428a;

    public /* synthetic */ C4127q1(C4104j c4104j, AbstractC31241m0 abstractC31241m0) {
        this.f16428a = c4104j;
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: a */
    public final void mo19423a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f16428a.f16355B;
        lock.lock();
        try {
            C4104j.m19466v(this.f16428a, bundle);
            this.f16428a.f16366y = ConnectionResult.f16136t;
            C4104j.m19467w(this.f16428a);
        } finally {
            lock2 = this.f16428a.f16355B;
            lock2.unlock();
        }
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: b */
    public final void mo19424b(int i11, boolean z11) {
        Lock lock;
        Lock lock2;
        boolean z12;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        C4105j0 c4105j0;
        lock = this.f16428a.f16355B;
        lock.lock();
        try {
            C4104j c4104j = this.f16428a;
            z12 = c4104j.f16354A;
            if (!z12) {
                connectionResult = c4104j.f16367z;
                if (connectionResult != null) {
                    connectionResult2 = c4104j.f16367z;
                    if (connectionResult2.m19187M()) {
                        this.f16428a.f16354A = true;
                        c4105j0 = this.f16428a.f16361t;
                        c4105j0.mo19482N(i11);
                        lock3 = this.f16428a.f16355B;
                        lock3.unlock();
                    }
                }
            }
            this.f16428a.f16354A = false;
            C4104j.m19465u(this.f16428a, i11, z11);
            lock3 = this.f16428a.f16355B;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f16428a.f16355B;
            lock2.unlock();
            throw th2;
        }
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: c */
    public final void mo19425c(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f16428a.f16355B;
        lock.lock();
        try {
            this.f16428a.f16366y = connectionResult;
            C4104j.m19467w(this.f16428a);
        } finally {
            lock2 = this.f16428a.f16355B;
            lock2.unlock();
        }
    }
}
