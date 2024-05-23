package p565v2;

import android.net.ConnectivityManager;
import fn0.AbstractC19074t;

/* renamed from: v2.r */
/* loaded from: classes2.dex */
public abstract class AbstractC27464r {
    /* renamed from: a */
    public static final void m140512a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC19074t.m100208f(connectivityManager, "<this>");
        AbstractC19074t.m100208f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
