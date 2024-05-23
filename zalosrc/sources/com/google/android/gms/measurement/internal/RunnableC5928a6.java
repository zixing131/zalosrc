package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* loaded from: classes2.dex */
public final class RunnableC5928a6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ Bundle f33768p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f33769q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5928a6(C6129s6 c6129s6, Bundle bundle) {
        this.f33769q = c6129s6;
        this.f33768p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6129s6 c6129s6 = this.f33769q;
        Bundle bundle = this.f33768p;
        c6129s6.mo31036g();
        c6129s6.m31455h();
        AbstractC4205o.m19722k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC4205o.m19718g(string);
        AbstractC4205o.m19718g(string2);
        AbstractC4205o.m19722k(bundle.get("value"));
        if (!c6129s6.f34158a.m31394n()) {
            c6129s6.f34158a.mo31033c().m31201u().m31108a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzli zzliVar = new zzli(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw m31361y0 = c6129s6.f34158a.m31381N().m31361y0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c6129s6.f34158a.m31379L().m30885r(new zzac(bundle.getString("app_id"), string2, zzliVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c6129s6.f34158a.m31381N().m31361y0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m31361y0, bundle.getLong("time_to_live"), c6129s6.f34158a.m31381N().m31361y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
