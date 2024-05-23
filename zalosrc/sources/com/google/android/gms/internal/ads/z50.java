package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC4172d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z50 implements AbstractC4172d.a {

    /* renamed from: p */
    final /* synthetic */ pl0 f31368p;

    /* renamed from: q */
    final /* synthetic */ b60 f31369q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z50(b60 b60Var, pl0 pl0Var) {
        this.f31369q = b60Var;
        this.f31368p = pl0Var;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        q50 q50Var;
        try {
            pl0 pl0Var = this.f31368p;
            q50Var = this.f31369q.f17622a;
            pl0Var.zzd(q50Var.m25662g());
        } catch (DeadObjectException e11) {
            this.f31368p.zze(e11);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
        this.f31368p.zze(new RuntimeException("onConnectionSuspended: " + i11));
    }
}
