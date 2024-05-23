package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class sz0 implements c40 {

    /* renamed from: a */
    final /* synthetic */ tz0 f28063a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sz0(tz0 tz0Var) {
        this.f28063a = tz0Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        Executor executor;
        if (tz0.m26801g(this.f28063a, map)) {
            executor = this.f28063a.f28660c;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rz0
                @Override // java.lang.Runnable
                public final void run() {
                    yz0 yz0Var;
                    yz0Var = sz0.this.f28063a.f28661d;
                    yz0Var.m28406j();
                }
            });
        }
    }
}
