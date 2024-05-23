package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC5586s0;
import com.google.android.gms.internal.measurement.InterfaceC5603t0;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC5973e4 implements ServiceConnection {

    /* renamed from: p */
    private final String f33959p;

    /* renamed from: q */
    final /* synthetic */ C5984f4 f33960q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC5973e4(C5984f4 c5984f4, String str) {
        this.f33960q = c5984f4;
        this.f33959p = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                InterfaceC5603t0 m29587N = AbstractBinderC5586s0.m29587N(iBinder);
                if (m29587N == null) {
                    this.f33960q.f33990a.mo31033c().m31202w().m31108a("Install Referrer Service implementation was not found");
                    return;
                } else {
                    this.f33960q.f33990a.mo31033c().m31201u().m31108a("Install Referrer Service connected");
                    this.f33960q.f33990a.mo31037v().m31296z(new RunnableC5962d4(this, m29587N, this));
                    return;
                }
            } catch (RuntimeException e11) {
                this.f33960q.f33990a.mo31033c().m31202w().m31109b("Exception occurred while calling Install Referrer API", e11);
                return;
            }
        }
        this.f33960q.f33990a.mo31033c().m31202w().m31108a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f33960q.f33990a.mo31033c().m31201u().m31108a("Install Referrer Service disconnected");
    }
}
