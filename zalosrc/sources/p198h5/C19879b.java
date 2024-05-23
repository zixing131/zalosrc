package p198h5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.InterfaceC4219s1;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p229i5.AbstractC20295p;
import p289k5.C21472e;

/* renamed from: h5.b */
/* loaded from: classes.dex */
public class C19879b {

    /* renamed from: b */
    private static final Object f98047b = new Object();

    /* renamed from: c */
    private static volatile C19879b f98048c;

    /* renamed from: a */
    public ConcurrentHashMap f98049a = new ConcurrentHashMap();

    private C19879b() {
    }

    /* renamed from: b */
    public static C19879b m103558b() {
        if (f98048c == null) {
            synchronized (f98047b) {
                try {
                    if (f98048c == null) {
                        f98048c = new C19879b();
                    }
                } finally {
                }
            }
        }
        C19879b c19879b = f98048c;
        AbstractC4205o.m19722k(c19879b);
        return c19879b;
    }

    /* renamed from: e */
    private static void m103559e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m103560f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i11, boolean z11, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C21472e.m111067a(context).m111061c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (m103561g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f98049a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
            }
            try {
                boolean m103562h = m103562h(context, intent, serviceConnection, i11, executor);
                if (!m103562h) {
                    return false;
                }
                return m103562h;
            } finally {
                this.f98049a.remove(serviceConnection, serviceConnection);
            }
        }
        return m103562h(context, intent, serviceConnection, i11, executor);
    }

    /* renamed from: g */
    private static boolean m103561g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof InterfaceC4219s1)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static final boolean m103562h(Context context, Intent intent, ServiceConnection serviceConnection, int i11, Executor executor) {
        boolean bindService;
        if (AbstractC20295p.m105957k() && executor != null) {
            bindService = context.bindService(intent, i11, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i11);
    }

    /* renamed from: a */
    public boolean m103563a(Context context, Intent intent, ServiceConnection serviceConnection, int i11) {
        return m103560f(context, context.getClass().getName(), intent, serviceConnection, i11, true, null);
    }

    /* renamed from: c */
    public void m103564c(Context context, ServiceConnection serviceConnection) {
        if (m103561g(serviceConnection) && this.f98049a.containsKey(serviceConnection)) {
            try {
                m103559e(context, (ServiceConnection) this.f98049a.get(serviceConnection));
                return;
            } finally {
                this.f98049a.remove(serviceConnection);
            }
        }
        m103559e(context, serviceConnection);
    }

    /* renamed from: d */
    public final boolean m103565d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i11, Executor executor) {
        return m103560f(context, str, intent, serviceConnection, i11, true, executor);
    }
}
