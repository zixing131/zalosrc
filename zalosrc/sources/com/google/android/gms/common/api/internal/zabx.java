package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p704z4.AbstractC31252u;

/* loaded from: classes2.dex */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a */
    Context f16471a;

    /* renamed from: b */
    private final AbstractC31252u f16472b;

    public zabx(AbstractC31252u abstractC31252u) {
        this.f16472b = abstractC31252u;
    }

    /* renamed from: a */
    public final void m19559a(Context context) {
        this.f16471a = context;
    }

    /* renamed from: b */
    public final synchronized void m19560b() {
        try {
            Context context = this.f16471a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f16471a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f16472b.mo19408a();
            m19560b();
        }
    }
}
