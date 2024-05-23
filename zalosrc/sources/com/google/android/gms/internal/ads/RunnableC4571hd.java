package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.hd */
/* loaded from: classes2.dex */
public final class RunnableC4571hd implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C4608id f21635p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4571hd(C4608id c4608id) {
        this.f21635p = c4608id;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z11;
        C4719le c4719le;
        ConditionVariable conditionVariable2;
        if (this.f21635p.f22147b == null) {
            conditionVariable = C4608id.f22143c;
            synchronized (conditionVariable) {
                if (this.f21635p.f22147b != null) {
                    return;
                }
                boolean z12 = false;
                try {
                    z11 = ((Boolean) AbstractC4554gx.f21209c2.m24091e()).booleanValue();
                } catch (IllegalStateException unused) {
                    z11 = false;
                }
                if (z11) {
                    try {
                        c4719le = this.f21635p.f22146a;
                        C4608id.f22144d = t13.m26534b(c4719le.f23865a, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z12 = z11;
                this.f21635p.f22147b = Boolean.valueOf(z12);
                conditionVariable2 = C4608id.f22143c;
                conditionVariable2.open();
            }
        }
    }
}
