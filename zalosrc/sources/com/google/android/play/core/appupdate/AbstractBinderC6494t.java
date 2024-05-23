package com.google.android.play.core.appupdate;

import android.os.Bundle;
import p051c7.AbstractBinderC3318m;
import p051c7.C3325t;
import p342m6.C22890k;

/* renamed from: com.google.android.play.core.appupdate.t */
/* loaded from: classes3.dex */
abstract class AbstractBinderC6494t extends AbstractBinderC3318m {

    /* renamed from: p */
    final C3325t f36307p;

    /* renamed from: q */
    final C22890k f36308q;

    /* renamed from: r */
    final /* synthetic */ C6497w f36309r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC6494t(C6497w c6497w, C3325t c3325t, C22890k c22890k) {
        this.f36309r = c6497w;
        this.f36307p = c3325t;
        this.f36308q = c22890k;
    }

    @Override // p051c7.InterfaceC3319n
    /* renamed from: M */
    public void mo16787M(Bundle bundle) {
        this.f36309r.f36314a.m16777u(this.f36308q);
        this.f36307p.m16800d("onRequestInfo", new Object[0]);
    }

    @Override // p051c7.InterfaceC3319n
    /* renamed from: w */
    public void mo16788w(Bundle bundle) {
        this.f36309r.f36314a.m16777u(this.f36308q);
        this.f36307p.m16800d("onCompleteUpdate", new Object[0]);
    }
}
