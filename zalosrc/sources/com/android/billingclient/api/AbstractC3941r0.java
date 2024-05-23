package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.google.android.gms.internal.play_billing.C5726a4;
import com.google.android.gms.internal.play_billing.C5818p3;
import com.google.android.gms.internal.play_billing.C5824q3;
import com.google.android.gms.internal.play_billing.C5842t3;
import com.google.android.gms.internal.play_billing.C5848u3;
import com.google.android.gms.internal.play_billing.C5860w3;

/* renamed from: com.android.billingclient.api.r0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3941r0 {
    /* renamed from: a */
    public static C5824q3 m18694a(int i11, int i12, C3918k c3918k) {
        try {
            C5818p3 m30434u = C5824q3.m30434u();
            C5860w3 m30160u = C5726a4.m30160u();
            m30160u.m30551j(c3918k.m18652b());
            m30160u.m30550i(c3918k.m18651a());
            m30160u.m30552k(i11);
            m30434u.m30428h(m30160u);
            m30434u.m30430j(i12);
            return (C5824q3) m30434u.m30227c();
        } catch (Exception e11) {
            AbstractC5856w.m30543l("BillingLogger", "Unable to create logging payload", e11);
            return null;
        }
    }

    /* renamed from: b */
    public static C5848u3 m18695b(int i11) {
        try {
            C5842t3 m30524t = C5848u3.m30524t();
            m30524t.m30480i(i11);
            return (C5848u3) m30524t.m30227c();
        } catch (Exception e11) {
            AbstractC5856w.m30543l("BillingLogger", "Unable to create logging payload", e11);
            return null;
        }
    }
}
