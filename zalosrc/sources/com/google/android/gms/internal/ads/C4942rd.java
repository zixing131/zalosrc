package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.rd */
/* loaded from: classes2.dex */
public final class C4942rd {

    /* renamed from: a */
    private NetworkCapabilities f27164a;

    C4942rd(ConnectivityManager connectivityManager) {
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C4905qd(this));
            } catch (RuntimeException unused) {
                synchronized (C4942rd.class) {
                    this.f27164a = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static C4942rd m26068c(Context context) {
        if (context != null) {
            return new C4942rd((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    /* renamed from: a */
    public final long m26070a() {
        synchronized (C4942rd.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f27164a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f27164a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f27164a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final NetworkCapabilities m26071b() {
        return this.f27164a;
    }
}
