package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C5719ze;
import com.google.android.gms.internal.measurement.InterfaceC5603t0;
import p198h5.C19879b;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
/* loaded from: classes2.dex */
final class RunnableC5962d4 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ InterfaceC5603t0 f33854p;

    /* renamed from: q */
    final /* synthetic */ ServiceConnection f33855q;

    /* renamed from: r */
    final /* synthetic */ ServiceConnectionC5973e4 f33856r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5962d4(ServiceConnectionC5973e4 serviceConnectionC5973e4, InterfaceC5603t0 interfaceC5603t0, ServiceConnection serviceConnection) {
        this.f33856r = serviceConnectionC5973e4;
        this.f33854p = interfaceC5603t0;
        this.f33855q = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        ServiceConnectionC5973e4 serviceConnectionC5973e4 = this.f33856r;
        C5984f4 c5984f4 = serviceConnectionC5973e4.f33960q;
        str = serviceConnectionC5973e4.f33959p;
        InterfaceC5603t0 interfaceC5603t0 = this.f33854p;
        ServiceConnection serviceConnection = this.f33855q;
        c5984f4.f33990a.mo31037v().mo31036g();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = interfaceC5603t0.mo29570v(bundle2);
        } catch (Exception e11) {
            c5984f4.f33990a.mo31033c().m31197q().m31109b("Exception occurred while retrieving the Install Referrer", e11.getMessage());
        }
        if (bundle == null) {
            c5984f4.f33990a.mo31033c().m31197q().m31108a("Install Referrer Service returned a null response");
            bundle = null;
        }
        c5984f4.f33990a.mo31037v().mo31036g();
        C6127s4.m31365s();
        if (bundle != null) {
            long j11 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j11 == 0) {
                c5984f4.f33990a.mo31033c().m31202w().m31108a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    c5984f4.f33990a.mo31033c().m31201u().m31109b("InstallReferrer API result", string);
                    C6121r9 m31381N = c5984f4.f33990a.m31381N();
                    Uri parse = Uri.parse("?".concat(string));
                    C5719ze.m30110b();
                    Bundle m31356v0 = m31381N.m31356v0(parse, c5984f4.f33990a.m31401z().m30913B(null, AbstractC5972e3.f33956y0));
                    if (m31356v0 == null) {
                        c5984f4.f33990a.mo31033c().m31197q().m31108a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = m31356v0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j12 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j12 == 0) {
                                c5984f4.f33990a.mo31033c().m31197q().m31108a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m31356v0.putLong("click_timestamp", j12);
                            }
                        }
                        if (j11 == c5984f4.f33990a.m31374F().f33810f.m31502a()) {
                            c5984f4.f33990a.mo31033c().m31201u().m31108a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c5984f4.f33990a.m31394n()) {
                            c5984f4.f33990a.m31374F().f33810f.m31503b(j11);
                            c5984f4.f33990a.mo31033c().m31201u().m31109b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m31356v0.putString("_cis", "referrer API v2");
                            c5984f4.f33990a.m31376I().m31439s("auto", "_cmp", m31356v0, str);
                        }
                    }
                } else {
                    c5984f4.f33990a.mo31033c().m31197q().m31108a("No referrer defined in Install Referrer response");
                }
            }
        }
        C19879b.m103558b().m103564c(c5984f4.f33990a.mo31032b(), serviceConnection);
    }
}
