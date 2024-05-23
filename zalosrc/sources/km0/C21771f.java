package km0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.content.AbstractC1388a;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;

/* renamed from: km0.f */
/* loaded from: classes7.dex */
public final class C21771f extends AbstractC21770e {

    /* renamed from: km0.f$a */
    /* loaded from: classes7.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC19074t.m100208f(network, "network");
            AbstractC20110a.f98889a.mo104548a("The default network is now: %s", network);
            C21771f.this.mo112301b(true);
            C21771f.this.mo112302d(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC19074t.m100208f(network, "network");
            AbstractC19074t.m100208f(networkCapabilities, "capabilities");
            AbstractC20110a.f98889a.mo104548a("The default network changed capabilities: %s", networkCapabilities);
            C21771f.this.m112300a(networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            AbstractC19074t.m100208f(network, "network");
            AbstractC19074t.m100208f(linkProperties, "linkProperties");
            AbstractC20110a.f98889a.mo104548a("The default network changed link properties: %s", linkProperties);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC19074t.m100208f(network, "network");
            AbstractC20110a.f98889a.mo104548a("The application no longer has a default network. The last default network was %s", network);
            C21771f.this.mo112302d(false);
            C21771f.this.mo112301b(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            C21771f.this.mo112302d(false);
            C21771f.this.mo112301b(false);
        }
    }

    public C21771f(Context context) {
        NetworkInfo networkInfo;
        boolean z11;
        Network activeNetwork;
        AbstractC19074t.m100208f(context, "context");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC1388a.m6969k(context, ConnectivityManager.class);
            NetworkCapabilities networkCapabilities = null;
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            boolean z12 = false;
            if (networkInfo != null && networkInfo.isConnected()) {
                z11 = true;
            } else {
                z11 = false;
            }
            mo112302d(z11);
            if (networkInfo != null && networkInfo.isAvailable()) {
                z12 = true;
            }
            mo112301b(z12);
            if (connectivityManager != null) {
                activeNetwork = connectivityManager.getActiveNetwork();
                networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            }
            m112300a(networkCapabilities);
            if (connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(new a());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
