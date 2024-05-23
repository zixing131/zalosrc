package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* loaded from: classes.dex */
final class C5503n2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ Bundle f32624t;

    /* renamed from: u */
    final /* synthetic */ Activity f32625u;

    /* renamed from: v */
    final /* synthetic */ C5639v2 f32626v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5503n2(C5639v2 c5639v2, Bundle bundle, Activity activity) {
        super(c5639v2.f32850p, true);
        this.f32626v = c5639v2;
        this.f32624t = bundle;
        this.f32625u = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        Bundle bundle;
        InterfaceC5383g1 interfaceC5383g1;
        if (this.f32624t != null) {
            bundle = new Bundle();
            if (this.f32624t.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f32624t.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC5383g1 = this.f32626v.f32850p.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).onActivityCreated(BinderC4273d.m19913I3(this.f32625u), bundle, this.f32472q);
    }
}
