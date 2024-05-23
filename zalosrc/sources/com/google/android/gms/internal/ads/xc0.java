package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class xc0 extends o10 {

    /* renamed from: p */
    final /* synthetic */ ad0 f30420p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ xc0(ad0 ad0Var, wc0 wc0Var) {
        this.f30420p = ad0Var;
    }

    @Override // com.google.android.gms.internal.ads.p10
    /* renamed from: R4 */
    public final void mo24791R4(e10 e10Var, String str) {
        ad0 ad0Var = this.f30420p;
        if (ad0.m20080c(ad0Var) == null) {
            return;
        }
        ad0.m20080c(ad0Var).onCustomClick(ad0.m20082e(ad0Var, e10Var), str);
    }
}
