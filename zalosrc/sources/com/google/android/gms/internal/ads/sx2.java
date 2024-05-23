package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* loaded from: classes2.dex */
public final class sx2 {

    /* renamed from: a */
    private boolean f28055a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m26454a(Context context) {
        az2.m20353b(context, "Application Context cannot be null");
        if (!this.f28055a) {
            this.f28055a = true;
            oy2.m25357b().m25359c(context);
            jy2 m23780a = jy2.m23780a();
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(m23780a);
            }
            yy2.m28394g(context);
            ly2.m24419b().m24421c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m26455b() {
        return this.f28055a;
    }
}
