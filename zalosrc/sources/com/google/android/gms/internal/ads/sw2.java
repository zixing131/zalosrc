package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class sw2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ vw2 f28042a;

    /* renamed from: b */
    final /* synthetic */ kw2 f28043b;

    /* renamed from: c */
    final /* synthetic */ boolean f28044c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sw2(vw2 vw2Var, kw2 kw2Var, boolean z11) {
        this.f28042a = vw2Var;
        this.f28043b = kw2Var;
        this.f28044c = z11;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        kw2 kw2Var = this.f28043b;
        if (kw2Var.zzh()) {
            vw2 vw2Var = this.f28042a;
            kw2Var.mo23067q(false);
            vw2Var.m27360a(kw2Var);
            if (this.f28044c) {
                this.f28042a.m27366g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zzb(Object obj) {
        vw2 vw2Var = this.f28042a;
        kw2 kw2Var = this.f28043b;
        kw2Var.mo23067q(true);
        vw2Var.m27360a(kw2Var);
        if (this.f28044c) {
            this.f28042a.m27366g();
        }
    }
}
