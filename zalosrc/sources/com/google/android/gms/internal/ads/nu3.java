package com.google.android.gms.internal.ads;

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
/* loaded from: classes2.dex */
public abstract class nu3 {

    /* renamed from: a */
    private static final Logger f25344a = Logger.getLogger(bu3.class.getName());

    /* renamed from: b */
    private static final String f25345b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static gu3 m25013a(Class cls) {
        String str;
        ClassLoader classLoader = nu3.class.getClassLoader();
        if (!cls.equals(gu3.class)) {
            if (!cls.getPackage().equals(nu3.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            str = f25345b;
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
            Iterator it = ServiceLoader.load(nu3.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    AbstractC30228a.m149044a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e15) {
                    f25344a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e15);
                }
            }
            if (arrayList.size() == 1) {
                return (gu3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (gu3) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
