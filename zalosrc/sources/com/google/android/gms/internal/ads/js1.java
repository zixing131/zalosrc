package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class js1 implements iv2 {

    /* renamed from: p */
    private final Map f22977p;

    /* renamed from: q */
    private final C4808ns f22978q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public js1(C4808ns c4808ns, Map map) {
        this.f22977p = map;
        this.f22978q = c4808ns;
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: c */
    public final void mo20716c(bv2 bv2Var, String str) {
        if (this.f22977p.containsKey(bv2Var)) {
            this.f22978q.m24994c(((is1) this.f22977p.get(bv2Var)).f22390a);
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: g */
    public final void mo20717g(bv2 bv2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: n */
    public final void mo20720n(bv2 bv2Var, String str) {
        if (this.f22977p.containsKey(bv2Var)) {
            this.f22978q.m24994c(((is1) this.f22977p.get(bv2Var)).f22391b);
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: o */
    public final void mo20721o(bv2 bv2Var, String str, Throwable th2) {
        if (this.f22977p.containsKey(bv2Var)) {
            this.f22978q.m24994c(((is1) this.f22977p.get(bv2Var)).f22392c);
        }
    }
}
