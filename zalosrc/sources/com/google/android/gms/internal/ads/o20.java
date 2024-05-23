package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class o20 extends o10 {

    /* renamed from: p */
    final /* synthetic */ r20 f25404p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o20(r20 r20Var, n20 n20Var) {
        this.f25404p = r20Var;
    }

    @Override // com.google.android.gms.internal.ads.p10
    /* renamed from: R4 */
    public final void mo24791R4(e10 e10Var, String str) {
        r20 r20Var = this.f25404p;
        if (r20.m25940a(r20Var) == null) {
            return;
        }
        r20.m25940a(r20Var).onCustomClick(r20.m25942c(r20Var, e10Var), str);
    }
}
