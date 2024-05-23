package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* loaded from: classes.dex */
public final class C6170w3 extends BroadcastReceiver {

    /* renamed from: a */
    private final C6055l9 f34550a;

    /* renamed from: b */
    private boolean f34551b;

    /* renamed from: c */
    private boolean f34552c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6170w3(C6055l9 c6055l9) {
        AbstractC4205o.m19722k(c6055l9);
        this.f34550a = c6055l9;
    }

    /* renamed from: b */
    public final void m31472b() {
        this.f34550a.m31082e();
        this.f34550a.mo31037v().mo31036g();
        if (this.f34551b) {
            return;
        }
        this.f34550a.mo31032b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f34552c = this.f34550a.m31076Y().m31451l();
        this.f34550a.mo31033c().m31201u().m31109b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f34552c));
        this.f34551b = true;
    }

    /* renamed from: c */
    public final void m31473c() {
        this.f34550a.m31082e();
        this.f34550a.mo31037v().mo31036g();
        this.f34550a.mo31037v().mo31036g();
        if (this.f34551b) {
            this.f34550a.mo31033c().m31201u().m31108a("Unregistering connectivity change receiver");
            this.f34551b = false;
            this.f34552c = false;
            try {
                this.f34550a.mo31032b().unregisterReceiver(this);
            } catch (IllegalArgumentException e11) {
                this.f34550a.mo31033c().m31197q().m31109b("Failed to unregister the network broadcast receiver", e11);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f34550a.m31082e();
        String action = intent.getAction();
        this.f34550a.mo31033c().m31201u().m31109b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m31451l = this.f34550a.m31076Y().m31451l();
            if (this.f34552c != m31451l) {
                this.f34552c = m31451l;
                this.f34550a.mo31037v().m31296z(new RunnableC6159v3(this, m31451l));
                return;
            }
            return;
        }
        this.f34550a.mo31033c().m31202w().m31109b("NetworkBroadcastReceiver received unknown action", action);
    }
}
