package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import p182g7.AbstractC19280v;
import p182g7.C19267i;
import p182g7.C19278t;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;

/* renamed from: com.google.android.play.core.review.i */
/* loaded from: classes3.dex */
public final class C6512i {

    /* renamed from: c */
    private static final C19267i f36338c = new C19267i("ReviewService");

    /* renamed from: a */
    C19278t f36339a;

    /* renamed from: b */
    private final String f36340b;

    public C6512i(Context context) {
        this.f36340b = context.getPackageName();
        if (AbstractC19280v.m101006a(context)) {
            this.f36339a = new C19278t(context, f36338c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C6508e.f36331a, null, null);
        }
    }

    /* renamed from: a */
    public final AbstractC22888j m33383a() {
        C19267i c19267i = f36338c;
        c19267i.m100981d("requestInAppReview (%s)", this.f36340b);
        if (this.f36339a == null) {
            c19267i.m100979b("Play Store app is either not installed or not the official version", new Object[0]);
            return AbstractC22894m.m117603e(new ReviewException(-1));
        }
        C22890k c22890k = new C22890k();
        this.f36339a.m101002p(new C6509f(this, c22890k, c22890k), c22890k);
        return c22890k.m117594a();
    }
}
