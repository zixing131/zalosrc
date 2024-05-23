package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.google.android.gms.internal.play_billing.C5765g4;
import com.google.android.gms.internal.play_billing.C5801m4;
import com.google.android.gms.internal.play_billing.C5807n4;
import com.google.android.gms.internal.play_billing.C5824q3;
import com.google.android.gms.internal.play_billing.C5831r4;
import com.google.android.gms.internal.play_billing.C5848u3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.x0 */
/* loaded from: classes2.dex */
public final class C3959x0 implements InterfaceC3944s0 {

    /* renamed from: a */
    private final C5765g4 f15669a;

    /* renamed from: b */
    private final C3965z0 f15670b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3959x0(Context context, C5765g4 c5765g4) {
        this.f15670b = new C3965z0(context);
        this.f15669a = c5765g4;
    }

    @Override // com.android.billingclient.api.InterfaceC3944s0
    /* renamed from: a */
    public final void mo18696a(C5824q3 c5824q3) {
        if (c5824q3 == null) {
            return;
        }
        try {
            C5801m4 m30415u = C5807n4.m30415u();
            C5765g4 c5765g4 = this.f15669a;
            if (c5765g4 != null) {
                m30415u.m30369j(c5765g4);
            }
            m30415u.m30367h(c5824q3);
            this.f15670b.m18727a((C5807n4) m30415u.m30227c());
        } catch (Throwable unused) {
            AbstractC5856w.m30542k("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3944s0
    /* renamed from: b */
    public final void mo18697b(C5831r4 c5831r4) {
        if (c5831r4 == null) {
            return;
        }
        try {
            C5801m4 m30415u = C5807n4.m30415u();
            C5765g4 c5765g4 = this.f15669a;
            if (c5765g4 != null) {
                m30415u.m30369j(c5765g4);
            }
            m30415u.m30370k(c5831r4);
            this.f15670b.m18727a((C5807n4) m30415u.m30227c());
        } catch (Throwable unused) {
            AbstractC5856w.m30542k("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3944s0
    /* renamed from: c */
    public final void mo18698c(C5848u3 c5848u3) {
        if (c5848u3 == null) {
            return;
        }
        try {
            C5801m4 m30415u = C5807n4.m30415u();
            C5765g4 c5765g4 = this.f15669a;
            if (c5765g4 != null) {
                m30415u.m30369j(c5765g4);
            }
            m30415u.m30368i(c5848u3);
            this.f15670b.m18727a((C5807n4) m30415u.m30227c());
        } catch (Throwable unused) {
            AbstractC5856w.m30542k("BillingLogger", "Unable to log.");
        }
    }
}
