package com.google.firebase.installations;

import p053c9.AbstractC3372d;
import p342m6.C22890k;

/* renamed from: com.google.firebase.installations.d */
/* loaded from: classes3.dex */
class C6585d implements InterfaceC6588g {

    /* renamed from: a */
    private final C6589h f36544a;

    /* renamed from: b */
    private final C22890k f36545b;

    public C6585d(C6589h c6589h, C22890k c22890k) {
        this.f36544a = c6589h;
        this.f36545b = c22890k;
    }

    @Override // com.google.firebase.installations.InterfaceC6588g
    /* renamed from: a */
    public boolean mo33667a(Exception exc) {
        this.f36545b.m117597d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC6588g
    /* renamed from: b */
    public boolean mo33668b(AbstractC3372d abstractC3372d) {
        if (abstractC3372d.m16970k() && !this.f36544a.m33677f(abstractC3372d)) {
            this.f36545b.m117596c(AbstractC6587f.m33669a().mo33631b(abstractC3372d.mo16938b()).mo33633d(abstractC3372d.mo16939c()).mo33632c(abstractC3372d.mo16944h()).mo33630a());
            return true;
        }
        return false;
    }
}
