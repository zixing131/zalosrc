package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.z1 */
/* loaded from: classes2.dex */
public final class C3966z1 {

    /* renamed from: a */
    private final Context f15684a;

    /* renamed from: b */
    private final C3963y1 f15685b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3966z1(Context context, InterfaceC3880a1 interfaceC3880a1, InterfaceC3944s0 interfaceC3944s0) {
        this.f15684a = context;
        this.f15685b = new C3963y1(this, null, interfaceC3944s0, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final InterfaceC3880a1 m18730c() {
        C3963y1.m18722a(this.f15685b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final InterfaceC3949u m18731d() {
        return C3963y1.m18723b(this.f15685b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m18732e() {
        this.f15685b.m18726d(this.f15684a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m18733f(boolean z11) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        this.f15684a.getApplicationContext().getPackageName();
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f15685b.m18725c(this.f15684a, intentFilter, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3966z1(Context context, InterfaceC3949u interfaceC3949u, InterfaceC3890d interfaceC3890d, InterfaceC3944s0 interfaceC3944s0) {
        this.f15684a = context;
        this.f15685b = new C3963y1(this, interfaceC3949u, interfaceC3890d, interfaceC3944s0, null);
    }
}
