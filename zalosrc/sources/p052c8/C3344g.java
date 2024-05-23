package p052c8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015a9.InterfaceC0662b;

/* renamed from: c8.g */
/* loaded from: classes.dex */
public final class C3344g {

    /* renamed from: a */
    private final Object f14185a;

    /* renamed from: b */
    private final c f14186b;

    /* renamed from: c8.g$b */
    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        private final Class f14187a;

        /* renamed from: b */
        private Bundle m16867b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f14187a), 128);
                if (serviceInfo == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f14187a);
                    sb2.append(" has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // p052c8.C3344g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo16868a(Context context) {
            Bundle m16867b = m16867b(context);
            if (m16867b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m16867b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m16867b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f14187a = cls;
        }
    }

    /* renamed from: c8.g$c */
    /* loaded from: classes.dex */
    interface c {
        /* renamed from: a */
        List mo16868a(Object obj);
    }

    C3344g(Object obj, c cVar) {
        this.f14185a = obj;
        this.f14186b = cVar;
    }

    /* renamed from: c */
    public static C3344g m16863c(Context context, Class cls) {
        return new C3344g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static ComponentRegistrar m16864d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e11) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e11);
        } catch (InstantiationException e12) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e12);
        } catch (NoSuchMethodException e13) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e13);
        } catch (InvocationTargetException e14) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e14);
        }
    }

    /* renamed from: b */
    public List m16866b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f14186b.mo16868a(this.f14185a)) {
            arrayList.add(new InterfaceC0662b() { // from class: c8.f
                @Override // p015a9.InterfaceC0662b
                public final Object get() {
                    ComponentRegistrar m16864d;
                    m16864d = C3344g.m16864d(str);
                    return m16864d;
                }
            });
        }
        return arrayList;
    }
}
