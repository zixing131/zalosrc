package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class jn2 implements un2 {

    /* renamed from: a */
    private e71 f22890a;

    @Override // com.google.android.gms.internal.ads.un2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ tc3 mo20182a(wn2 wn2Var, tn2 tn2Var, Object obj) {
        return m23661c(wn2Var, tn2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.un2
    /* renamed from: b */
    public final synchronized e71 zzd() {
        return this.f22890a;
    }

    /* renamed from: c */
    public final synchronized tc3 m23661c(wn2 wn2Var, tn2 tn2Var, e71 e71Var) {
        a51 zzb;
        try {
            if (e71Var != null) {
                this.f22890a = e71Var;
            } else {
                this.f22890a = (e71) tn2Var.mo20933a(wn2Var.f30034b).zzh();
            }
            zzb = this.f22890a.zzb();
        } catch (Throwable th2) {
            throw th2;
        }
        return zzb.m19995h(zzb.m19996i());
    }
}
