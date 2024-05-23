package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class t04 {

    /* renamed from: a */
    private final List f28080a;

    /* renamed from: b */
    private final List f28081b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ t04(int i11, int i12, s04 s04Var) {
        this.f28080a = g04.m22259c(i11);
        this.f28081b = g04.m22259c(i12);
    }

    /* renamed from: a */
    public final t04 m26467a(w04 w04Var) {
        this.f28081b.add(w04Var);
        return this;
    }

    /* renamed from: b */
    public final t04 m26468b(w04 w04Var) {
        this.f28080a.add(w04Var);
        return this;
    }

    /* renamed from: c */
    public final u04 m26469c() {
        return new u04(this.f28080a, this.f28081b, null);
    }
}
