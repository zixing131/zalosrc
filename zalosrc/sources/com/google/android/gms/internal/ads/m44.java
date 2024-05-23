package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class m44 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ o44 f24382a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m44(o44 o44Var, l44 l44Var) {
        this.f24382a = o44Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final o44 o44Var = this.f24382a;
        o44.m25078c(o44Var).post(new Runnable() { // from class: com.google.android.gms.internal.ads.k44
            @Override // java.lang.Runnable
            public final void run() {
                o44.m25079d(o44.this);
            }
        });
    }
}
