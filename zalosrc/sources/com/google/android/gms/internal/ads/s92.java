package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s92 implements cb2 {

    /* renamed from: a */
    final /* synthetic */ t92 f27596a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s92(t92 t92Var) {
        this.f27596a = t92Var;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void zza() {
        synchronized (this.f27596a) {
            this.f27596a.f28268w = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        s11 s11Var;
        s11 s11Var2;
        s11 s11Var3;
        s11 s11Var4 = (s11) obj;
        synchronized (this.f27596a) {
            try {
                t92 t92Var = this.f27596a;
                s11Var = t92Var.f28268w;
                if (s11Var != null) {
                    s11Var3 = t92Var.f28268w;
                    s11Var3.mo23795a();
                }
                this.f27596a.f28268w = s11Var4;
                s11Var2 = this.f27596a.f28268w;
                s11Var2.mo20375b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
