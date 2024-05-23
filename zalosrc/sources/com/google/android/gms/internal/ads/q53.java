package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class q53 extends v53 {

    /* renamed from: v */
    final /* synthetic */ r53 f26650v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q53(r53 r53Var, x53 x53Var, CharSequence charSequence) {
        super(x53Var, charSequence);
        this.f26650v = r53Var;
    }

    @Override // com.google.android.gms.internal.ads.v53
    /* renamed from: d */
    final int mo25663d(int i11) {
        return i11 + 1;
    }

    @Override // com.google.android.gms.internal.ads.v53
    /* renamed from: e */
    final int mo25664e(int i11) {
        v43 v43Var = this.f26650v.f27100a;
        CharSequence charSequence = this.f29195r;
        int length = charSequence.length();
        j53.m23532b(i11, length, "index");
        while (i11 < length) {
            if (!v43Var.mo26247a(charSequence.charAt(i11))) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }
}
