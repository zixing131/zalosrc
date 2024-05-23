package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
import p704z4.InterfaceC31246p;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes2.dex */
abstract class AbstractC4099h0 {

    /* renamed from: a */
    private final InterfaceC31246p f16346a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4099h0(InterfaceC31246p interfaceC31246p) {
        this.f16346a = interfaceC31246p;
    }

    /* renamed from: a */
    protected abstract void mo19441a();

    /* renamed from: b */
    public final void m19442b(C4105j0 c4105j0) {
        Lock lock;
        Lock lock2;
        InterfaceC31246p interfaceC31246p;
        Lock lock3;
        lock = c4105j0.f16372p;
        lock.lock();
        try {
            interfaceC31246p = c4105j0.f16382z;
            if (interfaceC31246p != this.f16346a) {
                lock3 = c4105j0.f16372p;
            } else {
                mo19441a();
                lock3 = c4105j0.f16372p;
            }
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = c4105j0.f16372p;
            lock2.unlock();
            throw th2;
        }
    }
}
