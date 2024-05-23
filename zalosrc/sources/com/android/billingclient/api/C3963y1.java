package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC5766h;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.google.android.gms.internal.play_billing.C5824q3;
import com.google.android.gms.internal.play_billing.C5869y0;
import java.util.List;

/* renamed from: com.android.billingclient.api.y1 */
/* loaded from: classes2.dex */
public final class C3963y1 extends BroadcastReceiver {

    /* renamed from: a */
    private final InterfaceC3949u f15672a;

    /* renamed from: b */
    private final InterfaceC3944s0 f15673b;

    /* renamed from: c */
    private boolean f15674c;

    /* renamed from: d */
    final /* synthetic */ C3966z1 f15675d;

    public /* synthetic */ C3963y1(C3966z1 c3966z1, InterfaceC3880a1 interfaceC3880a1, InterfaceC3944s0 interfaceC3944s0, AbstractC3957w1 abstractC3957w1) {
        this.f15675d = c3966z1;
        this.f15672a = null;
        this.f15673b = interfaceC3944s0;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ InterfaceC3880a1 m18722a(C3963y1 c3963y1) {
        c3963y1.getClass();
        return null;
    }

    /* renamed from: e */
    private final void m18724e(Bundle bundle, C3918k c3918k, int i11) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.f15673b.mo18696a(C5824q3.m30436w(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), C5869y0.m30566a()));
                return;
            } catch (Throwable unused) {
                AbstractC5856w.m30542k("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        this.f15673b.mo18696a(AbstractC3941r0.m18694a(23, i11, c3918k));
    }

    /* renamed from: c */
    public final synchronized void m18725c(Context context, IntentFilter intentFilter, String str, IntentFilter intentFilter2) {
        Context context2;
        C3963y1 c3963y1;
        C3963y1 c3963y12;
        try {
            if (!this.f15674c) {
                if (Build.VERSION.SDK_INT >= 33) {
                    c3963y12 = this.f15675d.f15685b;
                    context.registerReceiver(c3963y12, intentFilter, null, null, 2);
                } else {
                    context2 = this.f15675d.f15684a;
                    context2.getApplicationContext().getPackageName();
                    c3963y1 = this.f15675d.f15685b;
                    context.registerReceiver(c3963y1, intentFilter);
                }
                this.f15674c = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public final synchronized void m18726d(Context context) {
        C3963y1 c3963y1;
        if (this.f15674c) {
            c3963y1 = this.f15675d.f15685b;
            context.unregisterReceiver(c3963y1);
            this.f15674c = false;
            return;
        }
        AbstractC5856w.m30542k("BillingBroadcastManager", "Receiver is not registered.");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i11 = 1;
        if (extras == null) {
            AbstractC5856w.m30542k("BillingBroadcastManager", "Bundle is null.");
            InterfaceC3944s0 interfaceC3944s0 = this.f15673b;
            C3918k c3918k = AbstractC3950u0.f15644j;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(11, 1, c3918k));
            InterfaceC3949u interfaceC3949u = this.f15672a;
            if (interfaceC3949u != null) {
                interfaceC3949u.mo18700b(c3918k, null);
                return;
            }
            return;
        }
        C3918k m30536e = AbstractC5856w.m30536e(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        if (string == "LAUNCH_BILLING_FLOW" || (string != null && string.equals("LAUNCH_BILLING_FLOW"))) {
            i11 = 2;
        }
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (m30536e.m18652b() != 0) {
                    m18724e(extras, m30536e, i11);
                    this.f15672a.mo18700b(m30536e, AbstractC5766h.m30237r());
                    return;
                }
                AbstractC5856w.m30542k("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                InterfaceC3944s0 interfaceC3944s02 = this.f15673b;
                C3918k c3918k2 = AbstractC3950u0.f15644j;
                interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(77, i11, c3918k2));
                this.f15672a.mo18700b(c3918k2, AbstractC5766h.m30237r());
                return;
            }
            return;
        }
        List m30540i = AbstractC5856w.m30540i(extras);
        if (m30536e.m18652b() == 0) {
            this.f15673b.mo18698c(AbstractC3941r0.m18695b(i11));
        } else {
            m18724e(extras, m30536e, i11);
        }
        this.f15672a.mo18700b(m30536e, m30540i);
    }

    public /* synthetic */ C3963y1(C3966z1 c3966z1, InterfaceC3949u interfaceC3949u, InterfaceC3890d interfaceC3890d, InterfaceC3944s0 interfaceC3944s0, AbstractC3957w1 abstractC3957w1) {
        this.f15675d = c3966z1;
        this.f15672a = interfaceC3949u;
        this.f15673b = interfaceC3944s0;
    }
}
