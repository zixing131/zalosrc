package com.google.firebase.installations;

import p053c9.AbstractC3372d;
import p342m6.C22890k;

/* renamed from: com.google.firebase.installations.e */
/* loaded from: classes.dex */
class C6586e implements InterfaceC6588g {

    /* renamed from: a */
    final C22890k f36546a;

    public C6586e(C22890k c22890k) {
        this.f36546a = c22890k;
    }

    @Override // com.google.firebase.installations.InterfaceC6588g
    /* renamed from: a */
    public boolean mo33667a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC6588g
    /* renamed from: b */
    public boolean mo33668b(AbstractC3372d abstractC3372d) {
        if (!abstractC3372d.m16971l() && !abstractC3372d.m16970k() && !abstractC3372d.m16968i()) {
            return false;
        }
        this.f36546a.m117598e(abstractC3372d.mo16940d());
        return true;
    }
}
