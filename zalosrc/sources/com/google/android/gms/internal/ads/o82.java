package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* loaded from: classes2.dex */
final class o82 implements zzf {

    /* renamed from: a */
    final /* synthetic */ pl0 f25494a;

    /* renamed from: b */
    final /* synthetic */ tq2 f25495b;

    /* renamed from: c */
    final /* synthetic */ iq2 f25496c;

    /* renamed from: d */
    final /* synthetic */ u82 f25497d;

    /* renamed from: e */
    final /* synthetic */ p82 f25498e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o82(p82 p82Var, pl0 pl0Var, tq2 tq2Var, iq2 iq2Var, u82 u82Var) {
        this.f25498e = p82Var;
        this.f25494a = pl0Var;
        this.f25495b = tq2Var;
        this.f25496c = iq2Var;
        this.f25497d = u82Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        y82 y82Var;
        pl0 pl0Var = this.f25494a;
        y82Var = this.f25498e.f26108d;
        pl0Var.zzd(y82Var.m28141a(this.f25495b, this.f25496c, view, this.f25497d));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
