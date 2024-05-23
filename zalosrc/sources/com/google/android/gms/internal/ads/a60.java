package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a60 implements AbstractC4172d.b {

    /* renamed from: p */
    final /* synthetic */ pl0 f16947p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a60(b60 b60Var, pl0 pl0Var) {
        this.f16947p = pl0Var;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
        this.f16947p.zze(new RuntimeException("Connection failed."));
    }
}
