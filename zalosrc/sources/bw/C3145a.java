package bw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import fn0.AbstractC19074t;

/* renamed from: bw.a */
/* loaded from: classes.dex */
public final class C3145a {
    /* renamed from: a */
    public final boolean m15829a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                return false;
            }
            if (!activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }
}
