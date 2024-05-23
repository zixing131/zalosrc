package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class v53 extends p43 {

    /* renamed from: r */
    final CharSequence f29195r;

    /* renamed from: s */
    final v43 f29196s;

    /* renamed from: t */
    int f29197t = 0;

    /* renamed from: u */
    int f29198u;

    /* JADX INFO: Access modifiers changed from: protected */
    public v53(x53 x53Var, CharSequence charSequence) {
        v43 v43Var;
        v43Var = x53Var.f30343a;
        this.f29196s = v43Var;
        this.f29198u = Integer.MAX_VALUE;
        this.f29195r = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.p43
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo25398a() {
        int mo25663d;
        int i11 = this.f29197t;
        while (true) {
            int i12 = this.f29197t;
            if (i12 != -1) {
                int mo25664e = mo25664e(i12);
                if (mo25664e == -1) {
                    mo25664e = this.f29195r.length();
                    this.f29197t = -1;
                    mo25663d = -1;
                } else {
                    mo25663d = mo25663d(mo25664e);
                    this.f29197t = mo25663d;
                }
                if (mo25663d == i11) {
                    int i13 = mo25663d + 1;
                    this.f29197t = i13;
                    if (i13 > this.f29195r.length()) {
                        this.f29197t = -1;
                    }
                } else {
                    if (i11 < mo25664e) {
                        this.f29195r.charAt(i11);
                    }
                    if (i11 < mo25664e) {
                        this.f29195r.charAt(mo25664e - 1);
                    }
                    int i14 = this.f29198u;
                    if (i14 == 1) {
                        mo25664e = this.f29195r.length();
                        this.f29197t = -1;
                        if (mo25664e > i11) {
                            this.f29195r.charAt(mo25664e - 1);
                        }
                    } else {
                        this.f29198u = i14 - 1;
                    }
                    return this.f29195r.subSequence(i11, mo25664e).toString();
                }
            } else {
                m25399c();
                return null;
            }
        }
    }

    /* renamed from: d */
    abstract int mo25663d(int i11);

    /* renamed from: e */
    abstract int mo25664e(int i11);
}
