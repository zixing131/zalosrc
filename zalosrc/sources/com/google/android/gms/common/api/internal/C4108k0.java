package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C4077a;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* loaded from: classes2.dex */
final class C4108k0 implements ComponentCallbacks2C4077a.a {

    /* renamed from: a */
    final /* synthetic */ C4083c f16387a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4108k0(C4083c c4083c) {
        this.f16387a = c4083c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C4077a.a
    /* renamed from: a */
    public final void mo19304a(boolean z11) {
        Handler handler;
        Handler handler2;
        C4083c c4083c = this.f16387a;
        handler = c4083c.f16271E;
        handler2 = c4083c.f16271E;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z11)));
    }
}
