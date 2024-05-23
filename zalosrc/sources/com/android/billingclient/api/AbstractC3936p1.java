package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C3918k;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.p1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3936p1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3933o1 m18683a(Bundle bundle, String str, String str2) {
        C3918k c3918k = AbstractC3950u0.f15644j;
        if (bundle == null) {
            AbstractC5856w.m30542k("BillingClient", String.format("%s got null owned items list", str2));
            return new C3933o1(c3918k, 54);
        }
        int m30533b = AbstractC5856w.m30533b(bundle, "BillingClient");
        String m30538g = AbstractC5856w.m30538g(bundle, "BillingClient");
        C3918k.a m18648c = C3918k.m18648c();
        m18648c.m18655c(m30533b);
        m18648c.m18654b(m30538g);
        C3918k m18653a = m18648c.m18653a();
        if (m30533b != 0) {
            AbstractC5856w.m30542k("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(m30533b)));
            return new C3933o1(m18653a, 23);
        }
        if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                AbstractC5856w.m30542k("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return new C3933o1(c3918k, 56);
            }
            if (stringArrayList2 == null) {
                AbstractC5856w.m30542k("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return new C3933o1(c3918k, 57);
            }
            if (stringArrayList3 == null) {
                AbstractC5856w.m30542k("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return new C3933o1(c3918k, 58);
            }
            return new C3933o1(AbstractC3950u0.f15646l, 1);
        }
        AbstractC5856w.m30542k("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
        return new C3933o1(c3918k, 55);
    }
}
