package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.g */
/* loaded from: classes2.dex */
public abstract class AbstractC4181g {

    /* renamed from: a */
    private static int f16610a = 4225;

    /* renamed from: b */
    private static final Object f16611b = new Object();

    /* renamed from: c */
    private static C4216r1 f16612c = null;

    /* renamed from: d */
    static HandlerThread f16613d = null;

    /* renamed from: e */
    private static boolean f16614e = false;

    /* renamed from: b */
    public static int m19677b() {
        return f16610a;
    }

    /* renamed from: c */
    public static AbstractC4181g m19678c(Context context) {
        Looper mainLooper;
        synchronized (f16611b) {
            try {
                if (f16612c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f16614e) {
                        mainLooper = m19679d().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    f16612c = new C4216r1(applicationContext, mainLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16612c;
    }

    /* renamed from: d */
    public static HandlerThread m19679d() {
        synchronized (f16611b) {
            try {
                HandlerThread handlerThread = f16613d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f16613d = handlerThread2;
                handlerThread2.start();
                return f16613d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public boolean m19680a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return mo19684h(new C4201m1(componentName, m19677b()), serviceConnection, str, null);
    }

    /* renamed from: e */
    public void m19681e(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        mo19682f(new C4201m1(componentName, m19677b()), serviceConnection, str);
    }

    /* renamed from: f */
    protected abstract void mo19682f(C4201m1 c4201m1, ServiceConnection serviceConnection, String str);

    /* renamed from: g */
    public final void m19683g(String str, String str2, int i11, ServiceConnection serviceConnection, String str3, boolean z11) {
        mo19682f(new C4201m1(str, str2, i11, z11), serviceConnection, str3);
    }

    /* renamed from: h */
    public abstract boolean mo19684h(C4201m1 c4201m1, ServiceConnection serviceConnection, String str, Executor executor);
}
