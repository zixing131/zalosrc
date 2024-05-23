package p230i6;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.measurement.internal.C6082o3;
import com.google.android.gms.measurement.internal.C6127s4;

/* renamed from: i6.k */
/* loaded from: classes2.dex */
public final class C20319k {

    /* renamed from: a */
    private final InterfaceC20318j f100291a;

    public C20319k(InterfaceC20318j interfaceC20318j) {
        AbstractC4205o.m19722k(interfaceC20318j);
        this.f100291a = interfaceC20318j;
    }

    /* renamed from: a */
    public final void m106018a(Context context, Intent intent) {
        C6127s4 m31363H = C6127s4.m31363H(context, null, null);
        C6082o3 mo31033c = m31363H.mo31033c();
        if (intent == null) {
            mo31033c.m31202w().m31108a("Receiver called with null intent");
            return;
        }
        m31363H.mo31035f();
        String action = intent.getAction();
        mo31033c.m31201u().m31109b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo31033c.m31201u().m31108a("Starting wakeful intent.");
            this.f100291a.mo30779a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            mo31033c.m31202w().m31108a("Install Referrer Broadcasts are deprecated");
        }
    }
}
