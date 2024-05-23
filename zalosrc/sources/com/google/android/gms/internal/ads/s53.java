package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class s53 extends v53 {

    /* renamed from: v */
    final /* synthetic */ t53 f27565v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s53(t53 t53Var, x53 x53Var, CharSequence charSequence) {
        super(x53Var, charSequence);
        this.f27565v = t53Var;
    }

    @Override // com.google.android.gms.internal.ads.v53
    /* renamed from: d */
    public final int mo25663d(int i11) {
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.v53
    /* renamed from: e */
    public final int mo25664e(int i11) {
        int i12 = i11 + 4000;
        if (i12 < this.f29195r.length()) {
            return i12;
        }
        return -1;
    }
}
