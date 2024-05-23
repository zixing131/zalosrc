package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes2.dex */
final class C4131s implements AbstractC4172d.c {

    /* renamed from: a */
    private final WeakReference f16433a;

    /* renamed from: b */
    private final C4071a f16434b;

    /* renamed from: c */
    private final boolean f16435c;

    public C4131s(C4081b0 c4081b0, C4071a c4071a, boolean z11) {
        this.f16433a = new WeakReference(c4081b0);
        this.f16434b = c4071a;
        this.f16435c = z11;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.c
    /* renamed from: a */
    public final void mo19548a(ConnectionResult connectionResult) {
        C4105j0 c4105j0;
        boolean z11;
        Lock lock;
        Lock lock2;
        boolean m19328n;
        boolean m19329o;
        Lock lock3;
        C4081b0 c4081b0 = (C4081b0) this.f16433a.get();
        if (c4081b0 == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        c4105j0 = c4081b0.f16239a;
        if (myLooper == c4105j0.f16370C.mo19262k()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19727p(z11, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = c4081b0.f16240b;
        lock.lock();
        try {
            m19328n = c4081b0.m19328n(0);
            if (!m19328n) {
                lock3 = c4081b0.f16240b;
            } else {
                if (!connectionResult.m19187M()) {
                    c4081b0.m19326l(connectionResult, this.f16434b, this.f16435c);
                }
                m19329o = c4081b0.m19329o();
                if (m19329o) {
                    c4081b0.m19327m();
                }
                lock3 = c4081b0.f16240b;
            }
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = c4081b0.f16240b;
            lock2.unlock();
            throw th2;
        }
    }
}
