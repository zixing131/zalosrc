package com.google.android.gms.measurement.internal;

import p289k5.C21471d;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* loaded from: classes.dex */
public final class C5984f4 {

    /* renamed from: a */
    final C6127s4 f33990a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5984f4(C6055l9 c6055l9) {
        this.f33990a = c6055l9.m31079c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m30908a() {
        try {
            C21471d m111067a = C21472e.m111067a(this.f33990a.mo31032b());
            if (m111067a == null) {
                this.f33990a.mo31033c().m31201u().m31108a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (m111067a.m111064f("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            this.f33990a.mo31033c().m31201u().m31109b("Failed to retrieve Play Store version for Install Referrer", e11);
            return false;
        }
    }
}
