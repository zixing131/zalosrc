package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;

/* renamed from: com.google.android.play.core.review.d */
/* loaded from: classes3.dex */
public final class C6507d implements InterfaceC6504a {

    /* renamed from: a */
    private final C6512i f36329a;

    /* renamed from: b */
    private final Handler f36330b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6507d(C6512i c6512i) {
        this.f36329a = c6512i;
    }

    @Override // com.google.android.play.core.review.InterfaceC6504a
    /* renamed from: a */
    public final AbstractC22888j mo33376a() {
        return this.f36329a.m33383a();
    }

    @Override // com.google.android.play.core.review.InterfaceC6504a
    /* renamed from: b */
    public final AbstractC22888j mo33377b(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.mo33375b()) {
            return AbstractC22894m.m117604f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo33374a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C22890k c22890k = new C22890k();
        intent.putExtra("result_receiver", new zzc(this, this.f36330b, c22890k));
        activity.startActivity(intent);
        return c22890k.m117594a();
    }
}
