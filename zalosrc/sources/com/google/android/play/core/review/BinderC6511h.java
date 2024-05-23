package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import p182g7.C19267i;
import p342m6.C22890k;

/* renamed from: com.google.android.play.core.review.h */
/* loaded from: classes3.dex */
final class BinderC6511h extends AbstractBinderC6510g {

    /* renamed from: s */
    final String f36337s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC6511h(C6512i c6512i, C22890k c22890k, String str) {
        super(c6512i, new C19267i("OnRequestInstallCallback"), c22890k);
        this.f36337s = str;
    }

    @Override // com.google.android.play.core.review.AbstractBinderC6510g, p182g7.InterfaceC19266h
    /* renamed from: w */
    public final void mo33380w(Bundle bundle) {
        super.mo33380w(bundle);
        this.f36335q.m117598e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
