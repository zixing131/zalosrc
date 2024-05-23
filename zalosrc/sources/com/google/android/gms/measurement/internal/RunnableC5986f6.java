package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5566qe;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import p230i6.EnumC20305a;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* loaded from: classes2.dex */
final class RunnableC5986f6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC5434j1 f33994p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f33995q;

    public RunnableC5986f6(C6129s6 c6129s6, InterfaceC5434j1 interfaceC5434j1) {
        this.f33995q = c6129s6;
        this.f33994p = interfaceC5434j1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0089  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long l11;
        C6153u8 m31380M = this.f33995q.f34158a.m31380M();
        C5566qe.m29565b();
        if (m31380M.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33952w0)) {
            if (!m31380M.f34158a.m31374F().m30819p().m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                m31380M.f34158a.mo31033c().m31203x().m31108a("Analytics storage consent denied; will not get session id");
            } else if (!m31380M.f34158a.m31374F().m30824u(m31380M.f34158a.mo31031a().mo105913a()) && m31380M.f34158a.m31374F().f33820p.m31502a() != 0) {
                l11 = Long.valueOf(m31380M.f34158a.m31374F().f33820p.m31502a());
                if (l11 == null) {
                    this.f33995q.f34158a.m31381N().m31324J(this.f33994p, l11.longValue());
                    return;
                }
                try {
                    this.f33994p.mo28962J(null);
                    return;
                } catch (RemoteException e11) {
                    this.f33995q.f34158a.mo31033c().m31197q().m31109b("getSessionId failed with exception", e11);
                    return;
                }
            }
        } else {
            m31380M.f34158a.mo31033c().m31203x().m31108a("getSessionId has been disabled.");
        }
        l11 = null;
        if (l11 == null) {
        }
    }
}
