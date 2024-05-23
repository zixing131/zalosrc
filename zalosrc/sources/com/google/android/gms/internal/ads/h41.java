package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h41 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ gc3 f21532a;

    /* renamed from: b */
    final /* synthetic */ j41 f21533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h41(j41 j41Var, gc3 gc3Var) {
        this.f21533b = j41Var;
        this.f21532a = gc3Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        this.f21532a.zza(th2);
        kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g41
            @Override // java.lang.Runnable
            public final void run() {
                j41.this.m23518d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        j41.m23515b(this.f21533b, ((c41) obj).f18099a, this.f21532a);
    }
}
