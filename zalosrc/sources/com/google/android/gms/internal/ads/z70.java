package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z70 implements tl0 {

    /* renamed from: a */
    final /* synthetic */ b80 f31396a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z70(b80 b80Var) {
        this.f31396a = b80Var;
    }

    @Override // com.google.android.gms.internal.ads.tl0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        g80 g80Var;
        zze.zza("Releasing engine reference.");
        g80Var = this.f31396a.f17664d;
        g80Var.m22296i();
    }
}
