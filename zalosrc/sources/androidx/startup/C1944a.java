package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p195h2.AbstractC19716b;
import p195h2.InterfaceC19715a;
import p253j2.AbstractC20905b;

/* renamed from: androidx.startup.a */
/* loaded from: classes.dex */
public final class C1944a {

    /* renamed from: d */
    private static volatile C1944a f8270d;

    /* renamed from: e */
    private static final Object f8271e = new Object();

    /* renamed from: c */
    final Context f8274c;

    /* renamed from: b */
    final Set f8273b = new HashSet();

    /* renamed from: a */
    final Map f8272a = new HashMap();

    C1944a(Context context) {
        this.f8274c = context.getApplicationContext();
    }

    /* renamed from: d */
    private Object m10735d(Class cls, Set set) {
        Object obj;
        if (AbstractC20905b.m109374d()) {
            try {
                AbstractC20905b.m109371a(cls.getSimpleName());
            } catch (Throwable th2) {
                AbstractC20905b.m109372b();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f8272a.containsKey(cls)) {
                set.add(cls);
                try {
                    InterfaceC19715a interfaceC19715a = (InterfaceC19715a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class> mo8640a = interfaceC19715a.mo8640a();
                    if (!mo8640a.isEmpty()) {
                        for (Class cls2 : mo8640a) {
                            if (!this.f8272a.containsKey(cls2)) {
                                m10735d(cls2, set);
                            }
                        }
                    }
                    obj = interfaceC19715a.mo8641b(this.f8274c);
                    set.remove(cls);
                    this.f8272a.put(cls, obj);
                } catch (Throwable th3) {
                    throw new StartupException(th3);
                }
            } else {
                obj = this.f8272a.get(cls);
            }
            AbstractC20905b.m109372b();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    /* renamed from: e */
    public static C1944a m10736e(Context context) {
        if (f8270d == null) {
            synchronized (f8271e) {
                try {
                    if (f8270d == null) {
                        f8270d = new C1944a(context);
                    }
                } finally {
                }
            }
        }
        return f8270d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10737a() {
        try {
            try {
                AbstractC20905b.m109371a("Startup");
                m10738b(this.f8274c.getPackageManager().getProviderInfo(new ComponentName(this.f8274c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e11) {
                throw new StartupException(e11);
            }
        } finally {
            AbstractC20905b.m109372b();
        }
    }

    /* renamed from: b */
    void m10738b(Bundle bundle) {
        String string = this.f8274c.getString(AbstractC19716b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC19715a.class.isAssignableFrom(cls)) {
                            this.f8273b.add(cls);
                        }
                    }
                }
                Iterator it = this.f8273b.iterator();
                while (it.hasNext()) {
                    m10735d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e11) {
                throw new StartupException(e11);
            }
        }
    }

    /* renamed from: c */
    Object m10739c(Class cls) {
        Object obj;
        synchronized (f8271e) {
            try {
                obj = this.f8272a.get(cls);
                if (obj == null) {
                    obj = m10735d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    /* renamed from: f */
    public Object m10740f(Class cls) {
        return m10739c(cls);
    }

    /* renamed from: g */
    public boolean m10741g(Class cls) {
        return this.f8273b.contains(cls);
    }
}
