package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4071a;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* loaded from: classes2.dex */
final class RunnableC4117n0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C4120o0 f16405p;

    public RunnableC4117n0(C4120o0 c4120o0) {
        this.f16405p = c4120o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4071a.f fVar;
        C4071a.f fVar2;
        C4123p0 c4123p0 = this.f16405p.f16407a;
        fVar = c4123p0.f16413q;
        fVar2 = c4123p0.f16413q;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
