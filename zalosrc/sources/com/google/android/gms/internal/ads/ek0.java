package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ek0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ hk0 f19655a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ek0(hk0 hk0Var) {
        this.f19655a = hk0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f19655a.f21814m;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f19655a.f21814m;
        atomicBoolean.set(false);
    }
}
