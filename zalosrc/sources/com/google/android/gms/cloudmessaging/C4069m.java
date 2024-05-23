package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p256j5.ThreadFactoryC20918b;
import p342m6.AbstractC22888j;
import p518t5.AbstractC26487e;

/* renamed from: com.google.android.gms.cloudmessaging.m */
/* loaded from: classes2.dex */
public final class C4069m {

    /* renamed from: e */
    private static C4069m f16130e;

    /* renamed from: a */
    private final Context f16131a;

    /* renamed from: b */
    private final ScheduledExecutorService f16132b;

    /* renamed from: c */
    private ServiceConnectionC4064h f16133c = new ServiceConnectionC4064h(this, null);

    /* renamed from: d */
    private int f16134d = 1;

    C4069m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16132b = scheduledExecutorService;
        this.f16131a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m19174a(C4069m c4069m) {
        return c4069m.f16131a;
    }

    /* renamed from: b */
    public static synchronized C4069m m19175b(Context context) {
        C4069m c4069m;
        synchronized (C4069m.class) {
            try {
                if (f16130e == null) {
                    AbstractC26487e.m136451a();
                    f16130e = new C4069m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC20918b("MessengerIpcClient"))));
                }
                c4069m = f16130e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4069m;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m19176e(C4069m c4069m) {
        return c4069m.f16132b;
    }

    /* renamed from: f */
    private final synchronized int m19177f() {
        int i11;
        i11 = this.f16134d;
        this.f16134d = i11 + 1;
        return i11;
    }

    /* renamed from: g */
    private final synchronized AbstractC22888j m19178g(AbstractC4067k abstractC4067k) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(abstractC4067k);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
                sb2.append("Queueing ");
                sb2.append(valueOf);
            }
            if (!this.f16133c.m19168g(abstractC4067k)) {
                ServiceConnectionC4064h serviceConnectionC4064h = new ServiceConnectionC4064h(this, null);
                this.f16133c = serviceConnectionC4064h;
                serviceConnectionC4064h.m19168g(abstractC4067k);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return abstractC4067k.f16127b.m117594a();
    }

    /* renamed from: c */
    public final AbstractC22888j m19179c(int i11, Bundle bundle) {
        return m19178g(new C4066j(m19177f(), 2, bundle));
    }

    /* renamed from: d */
    public final AbstractC22888j m19180d(int i11, Bundle bundle) {
        return m19178g(new C4068l(m19177f(), 1, bundle));
    }
}
