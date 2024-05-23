package androidx.core.net;

import android.net.ConnectivityManager;

/* renamed from: androidx.core.net.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1434a {

    /* renamed from: androidx.core.net.a$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static boolean m7333a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* renamed from: a */
    public static boolean m7332a(ConnectivityManager connectivityManager) {
        return a.m7333a(connectivityManager);
    }
}
