package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes2.dex */
final class rv1 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a */
    private final wy1 f27389a;

    public rv1(wy1 wy1Var) {
        this.f27389a = wy1Var;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z11;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i11 = 5;
        if (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) {
            z11 = true;
        } else {
            z11 = false;
        }
        wy1 wy1Var = this.f27389a;
        if (true == z11) {
            i11 = 10;
        }
        wy1.m27735c(wy1Var, i11);
    }
}
