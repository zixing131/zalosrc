package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class fm2 implements cb2 {

    /* renamed from: a */
    final /* synthetic */ gm2 f20193a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fm2(gm2 gm2Var) {
        this.f20193a = gm2Var;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void zza() {
        synchronized (this.f20193a) {
            this.f20193a.f20745y = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        yl2 yl2Var;
        yl2 yl2Var2;
        k11 k11Var = (k11) obj;
        synchronized (this.f20193a) {
            try {
                k11 k11Var2 = this.f20193a.f20745y;
                if (k11Var2 != null) {
                    k11Var2.mo23795a();
                }
                gm2 gm2Var = this.f20193a;
                gm2Var.f20745y = k11Var;
                k11Var.m23797i(gm2Var);
                gm2 gm2Var2 = this.f20193a;
                yl2Var = gm2Var2.f20741u;
                yl2Var2 = gm2Var2.f20741u;
                yl2Var.m28228k(new l11(k11Var, gm2Var2, yl2Var2));
                k11Var.mo20375b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
