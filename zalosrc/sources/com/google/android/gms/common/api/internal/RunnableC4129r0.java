package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import java.util.Map;
import p704z4.C31218b;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* loaded from: classes2.dex */
final class RunnableC4129r0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ ConnectionResult f16430p;

    /* renamed from: q */
    final /* synthetic */ C4132s0 f16431q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4129r0(C4132s0 c4132s0, ConnectionResult connectionResult) {
        this.f16431q = c4132s0;
        this.f16430p = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C31218b c31218b;
        C4071a.f fVar;
        C4071a.f fVar2;
        C4071a.f fVar3;
        C4071a.f fVar4;
        C4132s0 c4132s0 = this.f16431q;
        map = c4132s0.f16441f.f16267A;
        c31218b = c4132s0.f16437b;
        C4123p0 c4123p0 = (C4123p0) map.get(c31218b);
        if (c4123p0 == null) {
            return;
        }
        if (this.f16430p.m19187M()) {
            this.f16431q.f16440e = true;
            fVar = this.f16431q.f16436a;
            if (fVar.requiresSignIn()) {
                this.f16431q.m19553h();
                return;
            }
            try {
                C4132s0 c4132s02 = this.f16431q;
                fVar3 = c4132s02.f16436a;
                fVar4 = c4132s02.f16436a;
                fVar3.getRemoteService(null, fVar4.mo19233c());
                return;
            } catch (SecurityException unused) {
                fVar2 = this.f16431q.f16436a;
                fVar2.disconnect("Failed to get service from broker.");
                c4123p0.m19532D(new ConnectionResult(10), null);
                return;
            }
        }
        c4123p0.m19532D(this.f16430p, null);
    }
}
