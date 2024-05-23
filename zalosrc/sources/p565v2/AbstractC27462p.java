package p565v2;

import android.net.ConnectivityManager;
import android.net.Network;
import fn0.AbstractC19074t;

/* renamed from: v2.p */
/* loaded from: classes2.dex */
public abstract class AbstractC27462p {
    /* renamed from: a */
    public static final Network m140510a(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        AbstractC19074t.m100208f(connectivityManager, "<this>");
        activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork;
    }
}
