package q20;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: q20.m */
/* loaded from: classes5.dex */
public final class C25090m {

    /* renamed from: a */
    public static final C25090m f120499a = new C25090m();

    private C25090m() {
    }

    /* renamed from: a */
    private final ConnectivityManager m130049a(Context context) {
        Object obj;
        if (context != null) {
            obj = context.getSystemService("connectivity");
        } else {
            obj = null;
        }
        if (!(obj instanceof ConnectivityManager)) {
            return null;
        }
        return (ConnectivityManager) obj;
    }

    /* renamed from: b */
    public final boolean m130050b(Context context) {
        Network activeNetwork;
        ConnectivityManager m130049a = m130049a(context);
        if (m130049a == null) {
            return false;
        }
        if (C25078a.f120479a.m130002d()) {
            activeNetwork = m130049a.getActiveNetwork();
            NetworkCapabilities networkCapabilities = m130049a.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return false;
            }
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                return false;
            }
            return true;
        }
        NetworkInfo activeNetworkInfo = m130049a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    /* renamed from: c */
    public final boolean m130051c(Context context) {
        Network activeNetwork;
        ConnectivityManager m130049a = m130049a(context);
        if (m130049a == null) {
            return false;
        }
        if (C25078a.f120479a.m130002d()) {
            activeNetwork = m130049a.getActiveNetwork();
            NetworkCapabilities networkCapabilities = m130049a.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return false;
            }
            return networkCapabilities.hasTransport(0);
        }
        NetworkInfo activeNetworkInfo = m130049a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
            return false;
        }
        return true;
    }
}
