package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class fv1 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ hv1 f20287a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fv1(hv1 hv1Var) {
        this.f20287a = hv1Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        long j11;
        pl0 pl0Var;
        synchronized (this) {
            this.f20287a.f21913c = true;
            hv1 hv1Var = this.f20287a;
            long mo105914b = zzt.zzB().mo105914b();
            j11 = this.f20287a.f21914d;
            hv1Var.m23042v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (mo105914b - j11));
            pl0Var = this.f20287a.f21915e;
            pl0Var.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j11;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.f20287a.f21913c = true;
            hv1 hv1Var = this.f20287a;
            long mo105914b = zzt.zzB().mo105914b();
            j11 = this.f20287a.f21914d;
            hv1Var.m23042v("com.google.android.gms.ads.MobileAds", true, "", (int) (mo105914b - j11));
            executor = this.f20287a.f21919i;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ev1
                @Override // java.lang.Runnable
                public final void run() {
                    fv1 fv1Var = fv1.this;
                    hv1.m23039j(fv1Var.f20287a, str);
                }
            });
        }
    }
}
