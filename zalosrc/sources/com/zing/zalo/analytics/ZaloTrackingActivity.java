package com.zing.zalo.analytics;

import ac.C0697c0;
import ac.InterfaceC0733x;
import com.zing.zalo.activity.ZaloActivity;

/* loaded from: classes.dex */
public class ZaloTrackingActivity extends ZaloActivity {

    /* renamed from: S */
    private InterfaceC0733x f40024S;

    /* renamed from: G2 */
    public final void m37238G2(InterfaceC0733x interfaceC0733x) {
        this.f40024S = interfaceC0733x;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        InterfaceC0733x interfaceC0733x;
        super.onTopResumedActivityChanged(z11);
        if (z11 && (interfaceC0733x = this.f40024S) != null) {
            C0697c0.m1031x(C0697c0.Companion.m1048b(), interfaceC0733x.getTrackingKey(), false, 2, null);
        }
    }
}
