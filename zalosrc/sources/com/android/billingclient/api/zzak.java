package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.C3918k;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.google.android.gms.internal.play_billing.AbstractC5878z3;
import com.google.android.gms.internal.play_billing.C5726a4;
import com.google.android.gms.internal.play_billing.C5818p3;
import com.google.android.gms.internal.play_billing.C5824q3;
import com.google.android.gms.internal.play_billing.C5860w3;

/* loaded from: classes2.dex */
final class zzak extends ResultReceiver {

    /* renamed from: p */
    final /* synthetic */ C3898f f15686p;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        InterfaceC3944s0 interfaceC3944s0;
        InterfaceC3944s0 interfaceC3944s02;
        int i12;
        C5824q3 c5824q3;
        C3918k.a m18648c = C3918k.m18648c();
        m18648c.m18655c(i11);
        if (i11 != 0) {
            if (bundle == null) {
                interfaceC3944s0 = this.f15686p.f15505f;
                interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(73, 16, AbstractC3950u0.f15644j));
                throw null;
            }
            m18648c.m18654b(AbstractC5856w.m30538g(bundle, "BillingClient"));
            int i13 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            interfaceC3944s02 = this.f15686p.f15505f;
            if (i13 != 0) {
                i12 = AbstractC5878z3.m30581a(i13);
            } else {
                i12 = 23;
            }
            C3918k m18653a = m18648c.m18653a();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            try {
                C5860w3 m30160u = C5726a4.m30160u();
                m30160u.m30551j(m18653a.m18652b());
                m30160u.m30550i(m18653a.m18651a());
                m30160u.m30552k(i12);
                if (string != null) {
                    m30160u.m30549h(string);
                }
                C5818p3 m30434u = C5824q3.m30434u();
                m30434u.m30428h(m30160u);
                m30434u.m30430j(16);
                c5824q3 = (C5824q3) m30434u.m30227c();
            } catch (Exception e11) {
                AbstractC5856w.m30543l("BillingLogger", "Unable to create logging payload", e11);
                c5824q3 = null;
            }
            interfaceC3944s02.mo18696a(c5824q3);
        }
        m18648c.m18653a();
        throw null;
    }
}
