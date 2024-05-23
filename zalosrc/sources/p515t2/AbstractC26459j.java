package p515t2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.net.AbstractC1434a;
import androidx.work.AbstractC2253u;
import fn0.AbstractC19074t;
import p470r2.C25617c;
import p565v2.AbstractC27460n;
import p565v2.AbstractC27462p;
import p595w2.InterfaceC28696c;

/* renamed from: t2.j */
/* loaded from: classes.dex */
public abstract class AbstractC26459j {

    /* renamed from: a */
    private static final String f125654a;

    static {
        String m11897i = AbstractC2253u.m11897i("NetworkStateTracker");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"NetworkStateTracker\")");
        f125654a = m11897i;
    }

    /* renamed from: a */
    public static final AbstractC26456g m136366a(Context context, InterfaceC28696c interfaceC28696c) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            return new C26458i(context, interfaceC28696c);
        }
        return new C26460k(context, interfaceC28696c);
    }

    /* renamed from: c */
    public static final C25617c m136368c(ConnectivityManager connectivityManager) {
        boolean z11;
        AbstractC19074t.m100208f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m136369d = m136369d(connectivityManager);
        boolean m7332a = AbstractC1434a.m7332a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z12 = true;
        }
        return new C25617c(z11, m136369d, m7332a, z12);
    }

    /* renamed from: d */
    public static final boolean m136369d(ConnectivityManager connectivityManager) {
        AbstractC19074t.m100208f(connectivityManager, "<this>");
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities m140506a = AbstractC27460n.m140506a(connectivityManager, AbstractC27462p.m140510a(connectivityManager));
            if (m140506a == null) {
                return false;
            }
            return AbstractC27460n.m140507b(m140506a, 16);
        } catch (SecurityException e11) {
            AbstractC2253u.m11895e().mo11901d(f125654a, "Unable to validate active network", e11);
            return false;
        }
    }
}
