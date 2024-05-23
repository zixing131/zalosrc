package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class kn2 implements un2 {

    /* renamed from: a */
    private final un2 f23404a;

    /* renamed from: b */
    private e71 f23405b;

    public kn2(un2 un2Var) {
        this.f23404a = un2Var;
    }

    @Override // com.google.android.gms.internal.ads.un2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ tc3 mo20182a(wn2 wn2Var, tn2 tn2Var, Object obj) {
        return m23976c(wn2Var, tn2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.un2
    /* renamed from: b */
    public final synchronized e71 zzd() {
        return this.f23405b;
    }

    /* renamed from: c */
    public final synchronized tc3 m23976c(wn2 wn2Var, tn2 tn2Var, e71 e71Var) {
        this.f23405b = e71Var;
        if (wn2Var.f30033a != null) {
            a51 zzb = e71Var.zzb();
            return zzb.m19995h(zzb.m19997j(kc3.m23877i(wn2Var.f30033a)));
        }
        return ((jn2) this.f23404a).m23661c(wn2Var, tn2Var, e71Var);
    }
}
