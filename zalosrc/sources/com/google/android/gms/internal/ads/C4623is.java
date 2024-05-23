package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.is */
/* loaded from: classes2.dex */
public final class C4623is implements AbstractC4172d.b {

    /* renamed from: p */
    final /* synthetic */ pl0 f22388p;

    /* renamed from: q */
    final /* synthetic */ C4659js f22389q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4623is(C4659js c4659js, pl0 pl0Var) {
        this.f22389q = c4659js;
        this.f22388p = pl0Var;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
        Object obj;
        obj = this.f22389q.f22976d;
        synchronized (obj) {
            this.f22388p.zze(new RuntimeException("Connection failed."));
        }
    }
}
