package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.AbstractC1158c0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o9 */
/* loaded from: classes.dex */
public abstract class AbstractC5527o9 {

    /* renamed from: a */
    private static final Logger f32700a = Logger.getLogger(AbstractC5357e9.class.getName());

    /* renamed from: b */
    private static final String f32701b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: a */
    public static C5425i9 m29485a(Class cls) {
        String str;
        ClassLoader classLoader = AbstractC5527o9.class.getClassLoader();
        if (!cls.equals(C5425i9.class)) {
            if (!cls.getPackage().equals(AbstractC5527o9.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            str = f32701b;
        }
        try {
            try {
                try {
                    try {
                        AbstractC1158c0.m5500a(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
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
            Iterator it = ServiceLoader.load(AbstractC5527o9.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    AbstractC1158c0.m5500a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e15) {
                    f32700a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e15);
                }
            }
            if (arrayList.size() == 1) {
                return (C5425i9) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C5425i9) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
