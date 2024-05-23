package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i41 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ gc3 f22057a;

    /* renamed from: b */
    final /* synthetic */ j41 f22058b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i41(j41 j41Var, gc3 gc3Var) {
        this.f22058b = j41Var;
        this.f22057a = gc3Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g41
            @Override // java.lang.Runnable
            public final void run() {
                j41.this.m23518d();
            }
        });
        this.f22057a.zza(th2);
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g41
            @Override // java.lang.Runnable
            public final void run() {
                j41.this.m23518d();
            }
        });
        this.f22057a.zzb((v31) obj);
    }
}
