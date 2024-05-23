package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dd */
/* loaded from: classes2.dex */
final class C4423dd implements b13 {

    /* renamed from: a */
    final /* synthetic */ xz2 f19178a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4423dd(xz2 xz2Var) {
        this.f19178a = xz2Var;
    }

    @Override // com.google.android.gms.internal.ads.b13
    public final void zza(int i11, long j11) {
        this.f19178a.m28095d(i11, System.currentTimeMillis() - j11);
    }

    @Override // com.google.android.gms.internal.ads.b13
    public final void zzb(int i11, long j11, String str) {
        this.f19178a.m28096e(i11, System.currentTimeMillis() - j11, str);
    }
}
