package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p664y.AbstractC30228a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.e1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5750e1 {

    /* renamed from: a */
    private static final Logger f33312a = Logger.getLogger(AbstractC5845u0.class.getName());

    /* renamed from: b */
    private static final String f33313b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: a */
    public static C5869y0 m30211a(Class cls) {
        String str;
        ClassLoader classLoader = AbstractC5750e1.class.getClassLoader();
        if (!cls.equals(C5869y0.class)) {
            if (!cls.getPackage().equals(AbstractC5750e1.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            str = f33313b;
        }
        try {
            try {
                try {
                    try {
                        AbstractC30228a.m149044a(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (InstantiationException e11) {
                        throw new IllegalStateException(e11);
                    } catch (NoSuchMethodException e12) {
                        throw new IllegalStateException(e12);
                    }
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(e13);
                }
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC5750e1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    AbstractC30228a.m149044a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e15) {
                    f33312a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e15);
                }
            }
            if (arrayList.size() == 1) {
                return (C5869y0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C5869y0) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (NoSuchMethodException e17) {
                throw new IllegalStateException(e17);
            } catch (InvocationTargetException e18) {
                throw new IllegalStateException(e18);
            }
        }
    }
}
