package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C3918k;
import com.google.android.gms.internal.play_billing.AbstractBinderC5757f2;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.j0 */
/* loaded from: classes2.dex */
public final class BinderC3915j0 extends AbstractBinderC5757f2 {

    /* renamed from: p */
    final InterfaceC3910i f15570p;

    /* renamed from: q */
    final InterfaceC3944s0 f15571q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ BinderC3915j0(InterfaceC3910i interfaceC3910i, InterfaceC3944s0 interfaceC3944s0, AbstractC3911i0 abstractC3911i0) {
        this.f15570p = interfaceC3910i;
        this.f15571q = interfaceC3944s0;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5853v2
    /* renamed from: w4 */
    public final void mo18647w4(Bundle bundle) {
        if (bundle == null) {
            InterfaceC3944s0 interfaceC3944s0 = this.f15571q;
            C3918k c3918k = AbstractC3950u0.f15644j;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(63, 13, c3918k));
            this.f15570p.mo18599a(c3918k, null);
            return;
        }
        int m30533b = AbstractC5856w.m30533b(bundle, "BillingClient");
        String m30538g = AbstractC5856w.m30538g(bundle, "BillingClient");
        C3918k.a m18648c = C3918k.m18648c();
        m18648c.m18655c(m30533b);
        m18648c.m18654b(m30538g);
        if (m30533b != 0) {
            AbstractC5856w.m30542k("BillingClient", "getBillingConfig() failed. Response code: " + m30533b);
            C3918k m18653a = m18648c.m18653a();
            this.f15571q.mo18696a(AbstractC3941r0.m18694a(23, 13, m18653a));
            this.f15570p.mo18599a(m18653a, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            AbstractC5856w.m30542k("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            m18648c.m18655c(6);
            C3918k m18653a2 = m18648c.m18653a();
            this.f15571q.mo18696a(AbstractC3941r0.m18694a(64, 13, m18653a2));
            this.f15570p.mo18599a(m18653a2, null);
            return;
        }
        try {
            this.f15570p.mo18599a(m18648c.m18653a(), new C3906h(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e11) {
            AbstractC5856w.m30543l("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e11);
            InterfaceC3944s0 interfaceC3944s02 = this.f15571q;
            C3918k c3918k2 = AbstractC3950u0.f15644j;
            interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(65, 13, c3918k2));
            this.f15570p.mo18599a(c3918k2, null);
        }
    }
}
