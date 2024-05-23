package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* loaded from: classes2.dex */
public final class RunnableC5940b6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ Bundle f33791p;

    /* renamed from: q */
    final /* synthetic */ C6129s6 f33792q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5940b6(C6129s6 c6129s6, Bundle bundle) {
        this.f33792q = c6129s6;
        this.f33791p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6129s6 c6129s6 = this.f33792q;
        Bundle bundle = this.f33791p;
        c6129s6.mo31036g();
        c6129s6.m31455h();
        AbstractC4205o.m19722k(bundle);
        String m19718g = AbstractC4205o.m19718g(bundle.getString("name"));
        if (!c6129s6.f34158a.m31394n()) {
            c6129s6.f34158a.mo31033c().m31201u().m31108a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c6129s6.f34158a.m31379L().m30885r(new zzac(bundle.getString("app_id"), "", new zzli(m19718g, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c6129s6.f34158a.m31381N().m31361y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
