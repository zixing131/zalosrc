package p030b4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b4.k */
/* loaded from: classes.dex */
class C2517k implements InterfaceC2511e {

    /* renamed from: a */
    private final a f10228a;

    /* renamed from: b */
    private final C2515i f10229b;

    /* renamed from: c */
    private final Map f10230c;

    /* renamed from: b4.k$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private final Context f10231a;

        /* renamed from: b */
        private Map f10232b = null;

        a(Context context) {
            this.f10231a = context;
        }

        /* renamed from: a */
        private Map m12610a(Context context) {
            Bundle m12612d = m12612d(context);
            if (m12612d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m12612d.keySet()) {
                Object obj = m12612d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map m12611c() {
            if (this.f10232b == null) {
                this.f10232b = m12610a(this.f10231a);
            }
            return this.f10232b;
        }

        /* renamed from: d */
        private static Bundle m12612d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC2510d m12613b(String str) {
            String str2 = (String) m12611c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC2510d) Class.forName(str2).asSubclass(InterfaceC2510d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2517k(Context context, C2515i c2515i) {
        this(new a(context), c2515i);
    }

    @Override // p030b4.InterfaceC2511e
    /* renamed from: a */
    public synchronized InterfaceC2519m mo12599a(String str) {
        if (this.f10230c.containsKey(str)) {
            return (InterfaceC2519m) this.f10230c.get(str);
        }
        InterfaceC2510d m12613b = this.f10228a.m12613b(str);
        if (m12613b == null) {
            return null;
        }
        InterfaceC2519m create = m12613b.create(this.f10229b.m12606a(str));
        this.f10230c.put(str, create);
        return create;
    }

    C2517k(a aVar, C2515i c2515i) {
        this.f10230c = new HashMap();
        this.f10228a = aVar;
        this.f10229b = c2515i;
    }
}
