package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class xa2 implements cb2 {

    /* renamed from: a */
    final /* synthetic */ ya2 f30400a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xa2(ya2 ya2Var) {
        this.f30400a = ya2Var;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void zza() {
        synchronized (this.f30400a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f30400a) {
            this.f30400a.f30860c = ((v31) obj).m27145c();
            ((v31) obj).mo20375b();
        }
    }
}
