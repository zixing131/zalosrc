package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ua2 implements cb2 {

    /* renamed from: a */
    final /* synthetic */ va2 f28808a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ua2(va2 va2Var) {
        this.f28808a = va2Var;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void zza() {
        synchronized (this.f28808a) {
            this.f28808a.f29247w = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        jg1 jg1Var;
        jg1 jg1Var2 = (jg1) obj;
        synchronized (this.f28808a) {
            this.f28808a.f29247w = jg1Var2;
            jg1Var = this.f28808a.f29247w;
            jg1Var.mo20375b();
        }
    }
}
