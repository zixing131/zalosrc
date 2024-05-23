package p565v2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import fn0.AbstractC19074t;

/* renamed from: v2.n */
/* loaded from: classes2.dex */
public abstract class AbstractC27460n {
    /* renamed from: a */
    public static final NetworkCapabilities m140506a(ConnectivityManager connectivityManager, Network network) {
        AbstractC19074t.m100208f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* renamed from: b */
    public static final boolean m140507b(NetworkCapabilities networkCapabilities, int i11) {
        AbstractC19074t.m100208f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i11);
    }

    /* renamed from: c */
    public static final void m140508c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC19074t.m100208f(connectivityManager, "<this>");
        AbstractC19074t.m100208f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
