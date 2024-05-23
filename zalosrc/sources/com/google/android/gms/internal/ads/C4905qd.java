package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qd */
/* loaded from: classes2.dex */
public final class C4905qd extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ C4942rd f26723a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4905qd(C4942rd c4942rd) {
        this.f26723a = c4942rd;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (C4942rd.class) {
            this.f26723a.f27164a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (C4942rd.class) {
            this.f26723a.f27164a = null;
        }
    }
}
