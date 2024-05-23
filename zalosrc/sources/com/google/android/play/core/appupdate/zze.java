package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.ResultReceiver;
import p342m6.C22890k;

/* loaded from: classes3.dex */
final class zze extends ResultReceiver {

    /* renamed from: p */
    final /* synthetic */ C22890k f36322p;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        if (i11 != 1) {
            if (i11 != 2) {
                this.f36322p.m117598e(1);
                return;
            } else {
                this.f36322p.m117598e(0);
                return;
            }
        }
        this.f36322p.m117598e(-1);
    }
}
