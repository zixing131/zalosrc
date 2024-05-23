package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.cct.C3994a;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.google.android.gms.internal.play_billing.C5807n4;
import p010a4.C0128u;
import p668y3.AbstractC30277c;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30280f;

/* renamed from: com.android.billingclient.api.z0 */
/* loaded from: classes2.dex */
final class C3965z0 {

    /* renamed from: a */
    private boolean f15682a;

    /* renamed from: b */
    private InterfaceC30280f f15683b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3965z0(Context context) {
        try {
            C0128u.m563f(context);
            this.f15683b = C0128u.m561c().m565g(C3994a.f15795g).mo552a("PLAY_BILLING_LIBRARY", C5807n4.class, C30276b.m149414b("proto"), new InterfaceC30279e() { // from class: com.android.billingclient.api.y0
                @Override // p668y3.InterfaceC30279e
                public final Object apply(Object obj) {
                    return ((C5807n4) obj).m30565c();
                }
            });
        } catch (Throwable unused) {
            this.f15682a = true;
        }
    }

    /* renamed from: a */
    public final void m18727a(C5807n4 c5807n4) {
        if (this.f15682a) {
            AbstractC5856w.m30542k("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f15683b.mo557b(AbstractC30277c.m149416d(c5807n4));
        } catch (Throwable unused) {
            AbstractC5856w.m30542k("BillingLogger", "logging failed.");
        }
    }
}
