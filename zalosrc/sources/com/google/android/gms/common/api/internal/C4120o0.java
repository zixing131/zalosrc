package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC4172d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* loaded from: classes2.dex */
public final class C4120o0 implements AbstractC4172d.e {

    /* renamed from: a */
    final /* synthetic */ C4123p0 f16407a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4120o0(C4123p0 c4123p0) {
        this.f16407a = c4123p0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.e
    /* renamed from: a */
    public final void mo19508a() {
        Handler handler;
        handler = this.f16407a.f16411B.f16271E;
        handler.post(new RunnableC4117n0(this));
    }
}
