package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p342m6.C22890k;

/* loaded from: classes3.dex */
final class zzc extends ResultReceiver {

    /* renamed from: p */
    final /* synthetic */ C22890k f36346p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(C6507d c6507d, Handler handler, C22890k c22890k) {
        super(handler);
        this.f36346p = c22890k;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        this.f36346p.m117598e(null);
    }
}
