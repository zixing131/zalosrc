package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p316l6.C22097a;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22878e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.b1 */
/* loaded from: classes3.dex */
public abstract class AbstractC6604b1 {

    /* renamed from: a */
    static final long f36626a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f36627b = new Object();

    /* renamed from: c */
    private static C22097a f36628c;

    /* renamed from: b */
    private static void m33779b(Context context) {
        if (f36628c == null) {
            C22097a c22097a = new C22097a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f36628c = c22097a;
            c22097a.m115317d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m33780c(Intent intent) {
        synchronized (f36627b) {
            try {
                if (f36628c != null && m33781d(intent)) {
                    m33784g(intent, false);
                    f36628c.m115316c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    static boolean m33781d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m33783f(Context context, ServiceConnectionC6619g1 serviceConnectionC6619g1, final Intent intent) {
        synchronized (f36627b) {
            try {
                m33779b(context);
                boolean m33781d = m33781d(intent);
                m33784g(intent, true);
                if (!m33781d) {
                    f36628c.m115314a(f36626a);
                }
                serviceConnectionC6619g1.m33885c(intent).mo117574c(new InterfaceC22878e() { // from class: com.google.firebase.messaging.a1
                    @Override // p342m6.InterfaceC22878e
                    /* renamed from: a */
                    public final void mo16804a(AbstractC22888j abstractC22888j) {
                        AbstractC6604b1.m33780c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    private static void m33784g(Intent intent, boolean z11) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static ComponentName m33785h(Context context, Intent intent) {
        synchronized (f36627b) {
            try {
                m33779b(context);
                boolean m33781d = m33781d(intent);
                m33784g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!m33781d) {
                    f36628c.m115314a(f36626a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
