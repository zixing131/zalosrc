package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u42 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ v42 f28753a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u42(v42 v42Var) {
        this.f28753a = v42Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        p21 p21Var;
        y71 y71Var;
        p21Var = this.f28753a.f29185a;
        zze m19989a = p21Var.mo21156d().m19989a(th2);
        y71Var = this.f28753a.f29188d;
        y71Var.mo20715a(m19989a);
        wr2.m27705b(m19989a.zza, th2, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* synthetic */ void zzb(Object obj) {
        ((s11) obj).mo20375b();
    }
}
