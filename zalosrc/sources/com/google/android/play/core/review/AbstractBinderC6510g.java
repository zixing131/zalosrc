package com.google.android.play.core.review;

import android.os.Bundle;
import p182g7.AbstractBinderC19265g;
import p182g7.C19267i;
import p182g7.C19278t;
import p342m6.C22890k;

/* renamed from: com.google.android.play.core.review.g */
/* loaded from: classes3.dex */
abstract class AbstractBinderC6510g extends AbstractBinderC19265g {

    /* renamed from: p */
    final C19267i f36334p;

    /* renamed from: q */
    final C22890k f36335q;

    /* renamed from: r */
    final /* synthetic */ C6512i f36336r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC6510g(C6512i c6512i, C19267i c19267i, C22890k c22890k) {
        this.f36336r = c6512i;
        this.f36334p = c19267i;
        this.f36335q = c22890k;
    }

    @Override // p182g7.InterfaceC19266h
    /* renamed from: w */
    public void mo33380w(Bundle bundle) {
        C19278t c19278t = this.f36336r.f36339a;
        if (c19278t != null) {
            c19278t.m101004r(this.f36335q);
        }
        this.f36334p.m100981d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
