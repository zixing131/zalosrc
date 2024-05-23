package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* loaded from: classes.dex */
public final class C6137t3 extends AbstractC6208z8 {
    public C6137t3(C6055l9 c6055l9) {
        super(c6055l9);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6208z8
    /* renamed from: k */
    protected final boolean mo30801k() {
        return false;
    }

    /* renamed from: l */
    public final boolean m31451l() {
        m31504h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f34158a.mo31032b().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
